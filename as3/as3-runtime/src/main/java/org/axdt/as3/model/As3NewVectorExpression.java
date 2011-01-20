/**
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org> and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.axdt.as3.model;

import org.axdt.avm.model.AvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 New Vector Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3NewVectorExpression#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3NewVectorExpression#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3NewVectorExpression()
 * @generated
 */
public interface As3NewVectorExpression extends IPrimaryExpression {
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
	 * @see org.axdt.as3.As3EPackage#getAs3NewVectorExpression_Parameter()
	 * @generated
	 */
	AvmType getParameter();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3NewVectorExpression#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(AvmType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(As3ArrayInitializer)
	 * @see org.axdt.as3.As3EPackage#getAs3NewVectorExpression_Data()
	 * @generated
	 */
	As3ArrayInitializer getData();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3NewVectorExpression#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(As3ArrayInitializer value);

} // As3NewVectorExpression
