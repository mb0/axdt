/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.util;

import org.axdt.avm.model.AvmTypeReference;

import com.google.inject.ImplementedBy;

@ImplementedBy(AssignabilityComputer.class)
public interface IAssignabilityComputer {
	/**
	 * returns whether the type reference on the right can be assigned to the type reference on the left.
	 * Example:
	 * 
	 *   List<?> left = (List<? extends String>) right;
	 * TODO: never used » remove
	 */
	public boolean isAssignableFrom(AvmTypeReference left, AvmTypeReference right);
}
