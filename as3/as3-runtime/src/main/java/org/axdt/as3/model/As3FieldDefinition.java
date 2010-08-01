/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#isStatic <em>Static</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3FieldDefinition#getCustomVisibility <em>Custom Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition()
 * @generated
 */
public interface As3FieldDefinition extends ITypeDirective {
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
	 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition_Visibility()
	 * @generated
	 */
	AvmVisibility getVisibility();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3FieldDefinition#getVisibility <em>Visibility</em>}' attribute.
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
	 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition_CustomVisibility()
	 * @generated
	 */
	As3AttributeExpression getCustomVisibility();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3FieldDefinition#getCustomVisibility <em>Custom Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Visibility</em>' containment reference.
	 * @see #getCustomVisibility()
	 * @generated
	 */
	void setCustomVisibility(As3AttributeExpression value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition_Static()
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3FieldDefinition#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

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
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.as3.model.As3MetadataTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see org.axdt.as3.As3EPackage#getAs3FieldDefinition_Metadata()
	 * @generated
	 */
	EList<As3MetadataTag> getMetadata();

} // As3FieldDefinition
