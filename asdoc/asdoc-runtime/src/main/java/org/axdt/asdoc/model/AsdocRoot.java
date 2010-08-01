/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocRoot#getBaseUri <em>Base Uri</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocRoot#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocRoot()
 * @model
 * @generated
 */
public interface AsdocRoot extends AsdocPackage {
	/**
	 * Returns the value of the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Uri</em>' attribute.
	 * @see #setBaseUri(String)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocRoot_BaseUri()
	 * @model
	 * @generated
	 */
	String getBaseUri();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocRoot#getBaseUri <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Uri</em>' attribute.
	 * @see #getBaseUri()
	 * @generated
	 */
	void setBaseUri(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocRoot_Version()
	 * @model default="1"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocRoot#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AsdocPackage getPackage(String fqn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AsdocPackage createPackage(String fqn);

} // AsdocRoot
