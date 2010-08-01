/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model;

import java.util.List;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axdt Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtModel#getConnectedProjects <em>Connected Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.core.AxdtEPackage#getAxdtModel()
 * @generated
 */
public interface AxdtModel extends AxdtElement {
	/**
	 * Returns the value of the '<em><b>Connected Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.core.model.AxdtProjectSource}.
	 * It is bidirectional and its opposite is '{@link org.axdt.core.model.AxdtProjectSource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Projects</em>' containment reference list.
	 * @see org.axdt.core.AxdtEPackage#getAxdtModel_ConnectedProjects()
	 * @see org.axdt.core.model.AxdtProjectSource#getParent
	 * @generated
	 */
	EList<AxdtProjectSource> getConnectedProjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AxdtProject getProject(IProject project);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AxdtPackageRoot getPackageRoot(IResource resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<AxdtProject> getProjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean hasAxdtNature(IProject project);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ICommand newBuilderCommand(IProjectDescription description, String builderId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IWorkspace getWorkspace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	<T extends AxdtElement> void connectHandle(AxdtHandle<T> handle);

	IWorkspaceRoot getResource();
	AxdtModel getHandle();
} // AxdtModel
