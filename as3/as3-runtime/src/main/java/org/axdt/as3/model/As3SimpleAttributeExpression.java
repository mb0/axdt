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
 * A representation of the model object '<em><b>As3 Simple Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3SimpleAttributeExpression#getIdent <em>Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3SimpleAttributeExpression()
 * @generated
 */
public interface As3SimpleAttributeExpression extends As3AttributeExpression {
	/**
	 * Returns the value of the '<em><b>Ident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident</em>' containment reference.
	 * @see #setIdent(IIdentifier)
	 * @see org.axdt.as3.As3EPackage#getAs3SimpleAttributeExpression_Ident()
	 * @generated
	 */
	IIdentifier getIdent();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3SimpleAttributeExpression#getIdent <em>Ident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident</em>' containment reference.
	 * @see #getIdent()
	 * @generated
	 */
	void setIdent(IIdentifier value);

} // As3SimpleAttributeExpression
