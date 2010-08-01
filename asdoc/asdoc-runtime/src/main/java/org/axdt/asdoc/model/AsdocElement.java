/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmElement;
import org.axdt.avm.model.AvmIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocElement()
 * @model abstract="true"
 * @generated
 */
public interface AsdocElement extends AvmElement, AvmIdentifiable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullUri();
} // AsdocElement
