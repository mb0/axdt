/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.util;

import java.util.List;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;

public class AssignabilityComputer implements IAssignabilityComputer{

	private SuperTypeCollector superTypeCollector;

	public AssignabilityComputer(SuperTypeCollector superTypeCollector) {
		super();
		this.superTypeCollector = superTypeCollector;
	}

	public boolean isAssignableFrom(AvmTypeReference left, AvmTypeReference right) {
		AvmType typeA = left.getType();
		AvmType typeB = right.getType();
		if (typeA == typeB) {
			return true;
		}
		if (typeA instanceof AvmDeclaredType) {
			if (superTypeCollector.collectSuperTypes(typeB).contains(typeA)) {
				return true;
			}
		}
		return false;
	}
	protected String getCanonicalName(AvmDeclaredType type) {
		if (type == null) return null;
		if (type.eIsProxy()) { // compare type if proxy
			URI uri = ((InternalEObject) type).eProxyURI();
			return uri.toString().substring(11);
		}
		return type.getCanonicalName();
	}
	public AvmType commonSuperType(AvmDeclaredType left, AvmDeclaredType right) {
		if (left.equals(right)) return left;
		String leftName = getCanonicalName(left);
		String rightName = getCanonicalName(right);
		if (leftName == null || rightName == null) return null;
		// case 0 same type
		// special case object
		if (leftName.equals(rightName) || "Object".equals(leftName))
			return left;
		if ("Object".equals(rightName))
			return right;
		// try to collect super types
		List<AvmType> rtypes = superTypeCollector.collectSuperTypes(right);
		// case 1 left is super type of right
		if (rtypes.contains(left))
			return left;
		List<AvmType> ltypes = superTypeCollector.collectSuperTypes(left);
		// case 2 right is super type of left - checked in first iteration in case 3
		// if (ltypes.contains(right)) return right;
		// case 3 first intersections in the type hierarchy
		for (AvmType rtype:rtypes)
			if (ltypes.contains(rtype))
				return rtype;
		// is probably Object but we have not checked proxy hierarchy
		return null;
	}
}