/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmClass;
import org.axdt.avm.model.AvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Class#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Class#isFinal <em>Final</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Class#getExtendedClass <em>Extended Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3Class()
 * @generated
 */
public interface As3Class extends As3Type, AvmClass {
	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3Class_Dynamic()
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Class#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3Class_Final()
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Class#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Extended Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class</em>' containment reference.
	 * @see #setExtendedClass(AvmTypeReference)
	 * @see org.axdt.as3.As3EPackage#getAs3Class_ExtendedClass()
	 * @generated
	 */
	AvmTypeReference getExtendedClass();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Class#getExtendedClass <em>Extended Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class</em>' containment reference.
	 * @see #getExtendedClass()
	 * @generated
	 */
	void setExtendedClass(AvmTypeReference value);

} // As3Class
