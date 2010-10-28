/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.util;

import java.util.Map;

import org.axdt.as3.As3EFactory;
import org.axdt.as3.model.As3Class;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;

import com.google.inject.internal.Maps;

public class As3TypeAccessUtil {
	private static Map<String, AvmTypeAccess> globals = Maps.newHashMap();
	public static AvmTypeAccess global(String name) {
		AvmTypeAccess access = globals.get(name);
		if (access == null) {
			access = new AvmTypeAccess.Simple(getClassProxy(name));
			globals.put(name, access);
		}
		return access;
	}
	public static AvmTypeAccess normalAccess(AvmType type) {
		return new AvmTypeAccess.Extended(type, false, false, true, false);
	}
	public static AvmTypeAccess staticAccess(AvmType type) {
		return new AvmTypeAccess.Extended(type, false, false, false, true);
	}
	public static AvmTypeAccess superAccess(AvmType type) {
		return new AvmTypeAccess.Extended(type, true, false, true, false);
	}
	public static AvmTypeAccess thisAccess(AvmType type) {
		return new AvmTypeAccess.Extended(type, true, true, true, false);
	}
	protected static As3Class getClassProxy(String typeName) {
		As3Class proxy = As3EFactory.eINSTANCE.createAs3Class();
		URI uri = URI.createURI("avm:/types/"+typeName);
		((InternalEObject) proxy).eSetProxyURI(uri);
		return proxy;
	}

	private As3TypeAccessUtil() {
	}
}
