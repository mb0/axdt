/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IFragmentProvider;

public abstract class AbstractMirror implements AvmMirror {
	public String getFragment(EObject obj, IFragmentProvider.Fallback fallback) {
		if (obj instanceof AvmTypeReference)
			return fallback.getFragment(obj);
		if (obj instanceof AvmDefinition)
			return ((AvmDefinition) obj).getCanonicalName();
		return fallback.getFragment(obj);
	}
	public abstract EObject getEObject(Resource resource, String fragment, IFragmentProvider.Fallback fallback);
	
	protected abstract String getTypeName();
}
