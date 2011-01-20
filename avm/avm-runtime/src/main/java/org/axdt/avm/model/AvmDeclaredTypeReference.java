/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avm Basic Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredTypeReference#getType <em>Type</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredTypeReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.avm.AvmEPackage#getAvmDeclaredTypeReference()
 * @model
 * @generated
 */
public interface AvmDeclaredTypeReference extends AvmTypeReference {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AvmType)
	 * @see org.axdt.avm.AvmEPackage#getAvmDeclaredTypeReference_Type()
	 * @model
	 * @generated
	 */
	AvmType getType();

	/**
	 * Sets the value of the '{@link org.axdt.avm.model.AvmDeclaredTypeReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AvmType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(AvmType)
	 * @see org.axdt.avm.AvmEPackage#getAvmDeclaredTypeReference_Parameter()
	 * @model
	 * @generated
	 */
	AvmType getParameter();

	/**
	 * Sets the value of the '{@link org.axdt.avm.model.AvmDeclaredTypeReference#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(AvmType value);

} // AvmDeclaredTypeReference
