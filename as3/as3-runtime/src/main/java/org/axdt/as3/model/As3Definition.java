/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Definition#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Definition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Definition#getCustomVisibility <em>Custom Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Definition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3Definition()
 * @generated
 */
public interface As3Definition extends As3Identifiable, AvmDefinition {

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.as3.model.As3MetadataTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see org.axdt.as3.As3EPackage#getAs3Definition_Metadata()
	 * @generated
	 */
	EList<As3MetadataTag> getMetadata();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.axdt.avm.model.AvmVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.axdt.avm.model.AvmVisibility
	 * @see #setVisibility(AvmVisibility)
	 * @see org.axdt.as3.As3EPackage#getAs3Definition_Visibility()
	 * @generated
	 */
	AvmVisibility getVisibility();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Definition#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.axdt.avm.model.AvmVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(AvmVisibility value);

	/**
	 * Returns the value of the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Visibility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Visibility</em>' containment reference.
	 * @see #setCustomVisibility(As3AttributeExpression)
	 * @see org.axdt.as3.As3EPackage#getAs3Definition_CustomVisibility()
	 * @generated
	 */
	As3AttributeExpression getCustomVisibility();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Definition#getCustomVisibility <em>Custom Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Visibility</em>' containment reference.
	 * @see #getCustomVisibility()
	 * @generated
	 */
	void setCustomVisibility(As3AttributeExpression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.axdt.as3.As3EPackage#getAs3Definition_Name()
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Definition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // As3Definition
