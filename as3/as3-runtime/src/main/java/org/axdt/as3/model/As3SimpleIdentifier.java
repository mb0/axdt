/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmReferable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Simple Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3SimpleIdentifier#getName <em>Name</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3SimpleIdentifier#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3SimpleIdentifier()
 * @generated
 */
public interface As3SimpleIdentifier extends INonAttributeIdentifier {
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
	 * @see org.axdt.as3.As3EPackage#getAs3SimpleIdentifier_Name()
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3SimpleIdentifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(AvmReferable)
	 * @see org.axdt.as3.As3EPackage#getAs3SimpleIdentifier_Reference()
	 * @generated
	 */
	AvmReferable getReference();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3SimpleIdentifier#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(AvmReferable value);

} // As3SimpleIdentifier
