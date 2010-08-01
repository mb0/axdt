/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Postfix Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3PostfixOperator#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3PostfixOperator#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3PostfixOperator()
 * @generated
 */
public interface As3PostfixOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IIdentifier)
	 * @see org.axdt.as3.As3EPackage#getAs3PostfixOperator_Identifier()
	 * @generated
	 */
	IIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3PostfixOperator#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IIdentifier value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference.
	 * @see #setExpressions(As3ExpressionList)
	 * @see org.axdt.as3.As3EPackage#getAs3PostfixOperator_Expressions()
	 * @generated
	 */
	As3ExpressionList getExpressions();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3PostfixOperator#getExpressions <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions</em>' containment reference.
	 * @see #getExpressions()
	 * @generated
	 */
	void setExpressions(As3ExpressionList value);

} // As3PostfixOperator
