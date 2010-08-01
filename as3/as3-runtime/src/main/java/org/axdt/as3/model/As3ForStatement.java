/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ForStatement#getInit <em>Init</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ForStatement#getIter <em>Iter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3ForStatement()
 * @generated
 */
public interface As3ForStatement extends As3ConditionalIterationStatement {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(IForInit)
	 * @see org.axdt.as3.As3EPackage#getAs3ForStatement_Init()
	 * @generated
	 */
	IForInit getInit();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ForStatement#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(IForInit value);

	/**
	 * Returns the value of the '<em><b>Iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iter</em>' containment reference.
	 * @see #setIter(As3ExpressionList)
	 * @see org.axdt.as3.As3EPackage#getAs3ForStatement_Iter()
	 * @generated
	 */
	As3ExpressionList getIter();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ForStatement#getIter <em>Iter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iter</em>' containment reference.
	 * @see #getIter()
	 * @generated
	 */
	void setIter(As3ExpressionList value);

} // As3ForStatement
