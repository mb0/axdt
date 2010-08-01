/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocProperty#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocProperty#isWriteonly <em>Writeonly</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocProperty()
 * @model
 * @generated
 */
public interface AsdocProperty extends AsdocField, AvmProperty {
	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocProperty_Readonly()
	 * @model
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocProperty#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Writeonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writeonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writeonly</em>' attribute.
	 * @see #setWriteonly(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocProperty_Writeonly()
	 * @model
	 * @generated
	 */
	boolean isWriteonly();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocProperty#isWriteonly <em>Writeonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeonly</em>' attribute.
	 * @see #isWriteonly()
	 * @generated
	 */
	void setWriteonly(boolean value);

} // AsdocProperty
