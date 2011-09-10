/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.resource;

import org.axdt.avm.model.AvmDeclaredElement;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

public class As3ResourceDescriptionStrategy extends
		DefaultResourceDescriptionStrategy {

	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof AvmPackage)
			return true;
		EObject eContainer = eObject.eContainer();
		if (eContainer == null) // traverse program
			return true; 
		// add only package definition
		if (eContainer instanceof AvmPackage
				&& eObject instanceof AvmDeclaredElement) {
			if (!(eObject instanceof AvmMember)
					|| AvmVisibility.PUBLIC.equals(((AvmMember) eObject)
							.getVisibility()))
				super.createEObjectDescriptions(eObject, acceptor);
		}
		return false;
	}
}
