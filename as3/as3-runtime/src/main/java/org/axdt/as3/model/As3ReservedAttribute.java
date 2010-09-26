/**
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org> and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.axdt.as3.model;

import org.axdt.avm.model.AvmVisibility;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Reserved Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ReservedAttribute#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ReservedAttribute#isStatic <em>Static</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ReservedAttribute#isOverride <em>Override</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ReservedAttribute#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ReservedAttribute#isFinal <em>Final</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ReservedAttribute#isNative <em>Native</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3ReservedAttribute()
 * @generated
 */
public interface As3ReservedAttribute extends IAttribute {
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
	 * @see org.axdt.as3.As3EPackage#getAs3ReservedAttribute_Visibility()
	 * @generated
	 */
	AvmVisibility getVisibility();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ReservedAttribute#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.axdt.avm.model.AvmVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(AvmVisibility value);

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
	 * @see org.axdt.as3.As3EPackage#getAs3ReservedAttribute_Static()
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ReservedAttribute#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' attribute.
	 * @see #setOverride(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3ReservedAttribute_Override()
	 * @generated
	 */
	boolean isOverride();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ReservedAttribute#isOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #isOverride()
	 * @generated
	 */
	void setOverride(boolean value);

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3ReservedAttribute_Dynamic()
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ReservedAttribute#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3ReservedAttribute_Final()
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ReservedAttribute#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see #setNative(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3ReservedAttribute_Native()
	 * @generated
	 */
	boolean isNative();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ReservedAttribute#isNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see #isNative()
	 * @generated
	 */
	void setNative(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean isVisibility();

} // As3ReservedAttribute
