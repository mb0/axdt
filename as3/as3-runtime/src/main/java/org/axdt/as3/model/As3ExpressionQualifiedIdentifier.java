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
 * A representation of the model object '<em><b>As3 Expression Qualified Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ExpressionQualifiedIdentifier#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3ExpressionQualifiedIdentifier()
 * @generated
 */
public interface As3ExpressionQualifiedIdentifier extends As3NonAttributeQualifiedIdentifier {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(IExpression)
	 * @see org.axdt.as3.As3EPackage#getAs3ExpressionQualifiedIdentifier_Qualifier()
	 * @generated
	 */
	IExpression getQualifier();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ExpressionQualifiedIdentifier#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(IExpression value);

} // As3ExpressionQualifiedIdentifier
