/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Definition#getName <em>Name</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Definition#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3Definition()
 * @generated
 */
public interface As3Definition extends As3Identifiable, AvmDefinition {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.axdt.as3.As3EPackage#getAs3Definition_Name()
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Definition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(As3Attributes)
	 * @see org.axdt.as3.As3EPackage#getAs3Definition_Attributes()
	 * @generated
	 */
	As3Attributes getAttributes();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Definition#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(As3Attributes value);
} // As3Definition
