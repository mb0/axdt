/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.resource;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.util.TextLocation;

public class As3LocationInFileProvider extends DefaultLocationInFileProvider {
	@Override
	public TextLocation getLocation(EObject obj) {
		if (obj == null) throw new WrappedException("no object",null);
		return super.getLocation(obj);
	}
}
