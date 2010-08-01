/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model;

import org.eclipse.core.resources.IResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axdt Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtHandle#getResource <em>Resource</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtHandle#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.core.AxdtEPackage#getAxdtHandle()
 * @generated
 */
public interface AxdtHandle<T extends AxdtElement> extends AxdtElement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(IResource)
	 * @see org.axdt.core.AxdtEPackage#getAxdtHandle_Resource()
	 * @generated
	 */
	IResource getResource();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtHandle#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(IResource value);

	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(AxdtElement)
	 * @see org.axdt.core.AxdtEPackage#getAxdtHandle_Delegate()
	 * @generated
	 */
	T getDelegate();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtHandle#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(T value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	T checkDelegate();

} // AxdtHandle
