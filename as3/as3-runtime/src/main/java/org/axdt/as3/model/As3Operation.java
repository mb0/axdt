/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Operation#isGetter <em>Getter</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Operation#isSetter <em>Setter</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Operation#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3Operation()
 * @generated
 */
public interface As3Operation extends As3Member, As3Executable, AvmOperation {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(AvmTypeReference)
	 * @see org.axdt.as3.As3EPackage#getAs3Operation_ReturnType()
	 * @generated
	 */
	AvmTypeReference getReturnType();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Operation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(AvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(As3Block)
	 * @see org.axdt.as3.As3EPackage#getAs3Operation_Body()
	 * @generated
	 */
	As3Block getBody();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Operation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(As3Block value);

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' attribute.
	 * @see #setGetter(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3Operation_Getter()
	 * @generated
	 */
	boolean isGetter();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Operation#isGetter <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' attribute.
	 * @see #isGetter()
	 * @generated
	 */
	void setGetter(boolean value);

	/**
	 * Returns the value of the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' attribute.
	 * @see #setSetter(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3Operation_Setter()
	 * @generated
	 */
	boolean isSetter();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Operation#isSetter <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' attribute.
	 * @see #isSetter()
	 * @generated
	 */
	void setSetter(boolean value);

} // As3Operation
