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
 * A representation of the model object '<em><b>As3 Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ConditionalExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ConditionalExpression#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ConditionalExpression#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3ConditionalExpression()
 * @generated
 */
public interface As3ConditionalExpression extends IConditionalExpression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ILogicalExpression)
	 * @see org.axdt.as3.As3EPackage#getAs3ConditionalExpression_Condition()
	 * @generated
	 */
	ILogicalExpression getCondition();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ConditionalExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ILogicalExpression value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(IExpression)
	 * @see org.axdt.as3.As3EPackage#getAs3ConditionalExpression_Statement()
	 * @generated
	 */
	IExpression getStatement();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ConditionalExpression#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(IExpression value);

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference.
	 * @see #setElseStatement(IExpression)
	 * @see org.axdt.as3.As3EPackage#getAs3ConditionalExpression_ElseStatement()
	 * @generated
	 */
	IExpression getElseStatement();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ConditionalExpression#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' containment reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(IExpression value);

} // As3ConditionalExpression
