/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IFragmentProvider;

public interface AvmMirror extends IFragmentProvider {

	void initialize(AvmResource avmResource);
	TreeIterator<EObject> getAllContents(AvmResource.Fallback fallback);
	EList<EObject> getContents(AvmResource.Fallback fallback);
}
