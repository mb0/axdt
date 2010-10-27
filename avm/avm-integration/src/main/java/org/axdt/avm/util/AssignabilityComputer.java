/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.util;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;

import com.google.inject.Inject;


public class AssignabilityComputer implements IAssignabilityComputer{

	private SuperTypeCollector superTypeCollector;

	@Inject
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
}