/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axdt Project Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtProjectSource#getProject <em>Project</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProjectSource#getOutputLocation <em>Output Location</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProjectSource#getLibrariesLocation <em>Libraries Location</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProjectSource#getConfigLocation <em>Config Location</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProjectSource#getConnectedPackageRoots <em>Connected Package Roots</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProjectSource#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.core.AxdtEPackage#getAxdtProjectSource()
 * @generated
 */
public interface AxdtProjectSource extends AxdtProject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(IProject)
	 * @see org.axdt.core.AxdtEPackage#getAxdtProjectSource_Project()
	 * @generated
	 */
	IProject getProject();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtProjectSource#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(IProject value);

	/**
	 * Returns the value of the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Location</em>' attribute.
	 * @see #setOutputLocation(IPath)
	 * @see org.axdt.core.AxdtEPackage#getAxdtProjectSource_OutputLocation()
	 * @generated
	 */
	IPath getOutputLocation();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtProjectSource#getOutputLocation <em>Output Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Location</em>' attribute.
	 * @see #getOutputLocation()
	 * @generated
	 */
	void setOutputLocation(IPath value);

	/**
	 * Returns the value of the '<em><b>Libraries Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries Location</em>' attribute.
	 * @see #setLibrariesLocation(IPath)
	 * @see org.axdt.core.AxdtEPackage#getAxdtProjectSource_LibrariesLocation()
	 * @generated
	 */
	IPath getLibrariesLocation();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtProjectSource#getLibrariesLocation <em>Libraries Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libraries Location</em>' attribute.
	 * @see #getLibrariesLocation()
	 * @generated
	 */
	void setLibrariesLocation(IPath value);

	/**
	 * Returns the value of the '<em><b>Config Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Location</em>' attribute.
	 * @see #setConfigLocation(IPath)
	 * @see org.axdt.core.AxdtEPackage#getAxdtProjectSource_ConfigLocation()
	 * @generated
	 */
	IPath getConfigLocation();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtProjectSource#getConfigLocation <em>Config Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Location</em>' attribute.
	 * @see #getConfigLocation()
	 * @generated
	 */
	void setConfigLocation(IPath value);

	/**
	 * Returns the value of the '<em><b>Connected Package Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.core.model.AxdtPackageRootSource}.
	 * It is bidirectional and its opposite is '{@link org.axdt.core.model.AxdtPackageRootSource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Package Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Package Roots</em>' containment reference list.
	 * @see org.axdt.core.AxdtEPackage#getAxdtProjectSource_ConnectedPackageRoots()
	 * @see org.axdt.core.model.AxdtPackageRootSource#getParent
	 * @generated
	 */
	EList<AxdtPackageRootSource> getConnectedPackageRoots();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.axdt.core.model.AxdtModel#getConnectedProjects <em>Connected Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AxdtModel)
	 * @see org.axdt.core.AxdtEPackage#getAxdtProjectSource_Parent()
	 * @see org.axdt.core.model.AxdtModel#getConnectedProjects
	 * @generated
	 */
	AxdtModel getParent();

	/**
	 * Sets the value of the '{@link org.axdt.core.model.AxdtProjectSource#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AxdtModel value);

} // AxdtProjectSource
