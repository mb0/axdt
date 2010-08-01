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
 * A representation of the model object '<em><b>As3 Continue Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ContinueStatement#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ContinueStatement#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3ContinueStatement()
 * @generated
 */
public interface As3ContinueStatement extends IStatement {
	/**
	 * Returns the value of the '<em><b>Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Name</em>' attribute.
	 * @see #setLabelName(String)
	 * @see org.axdt.as3.As3EPackage#getAs3ContinueStatement_LabelName()
	 * @generated
	 */
	String getLabelName();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ContinueStatement#getLabelName <em>Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Name</em>' attribute.
	 * @see #getLabelName()
	 * @generated
	 */
	void setLabelName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(As3LabeledStatement)
	 * @see org.axdt.as3.As3EPackage#getAs3ContinueStatement_Label()
	 * @generated
	 */
	As3LabeledStatement getLabel();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ContinueStatement#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(As3LabeledStatement value);

} // As3ContinueStatement
