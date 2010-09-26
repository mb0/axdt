/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition()
 * @generated
 */
public interface As3FieldDefinition extends ITypeDirective {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition_Constant()
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3FieldDefinition#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.as3.model.As3FieldBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition_Bindings()
	 * @generated
	 */
	EList<As3FieldBinding> getBindings();

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
	 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition_Attributes()
	 * @generated
	 */
	As3Attributes getAttributes();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3FieldDefinition#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(As3Attributes value);

} // As3FieldDefinition
