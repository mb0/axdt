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
 * A representation of the model object '<em><b>Axdt Package Root Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtPackageRootSource#getResource <em>Resource</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtPackageRootSource#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.core.AxdtEPackage#getAxdtPackageRootSource()
 * @generated
 */
public interface AxdtPackageRootSource extends AxdtPackageRoot {
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
	 * @see org.axdt.core.AxdtEPackage#getAxdtPackageRootSource_Resource()
	 * @generated
	 */
	IResource getResource();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtPackageRootSource#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(IResource value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.axdt.core.model.AxdtProjectSource#getConnectedPackageRoots <em>Connected Package Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AxdtProjectSource)
	 * @see org.axdt.core.AxdtEPackage#getAxdtPackageRootSource_Parent()
	 * @see org.axdt.core.model.AxdtProjectSource#getConnectedPackageRoots
	 * @generated
	 */
	AxdtProjectSource getParent();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtPackageRootSource#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AxdtProjectSource value);

} // AxdtPackageRootSource
