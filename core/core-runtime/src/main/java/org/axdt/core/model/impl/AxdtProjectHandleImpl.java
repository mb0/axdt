/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model.impl;

import java.util.List;

import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.AxdtPackageRoot;
import org.axdt.core.model.AxdtProjectHandle;
import org.axdt.core.model.AxdtProjectSource;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axdt Project Handle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AxdtProjectHandleImpl extends AxdtHandleImpl<AxdtProjectSource> implements AxdtProjectHandle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AxdtProjectHandleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxdtEPackage.Literals.AXDT_PROJECT_HANDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<String> getRequiredProjectNames() {
		AxdtProjectSource source = checkDelegate();
		return source == null ? null : source.getRequiredProjectNames();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AxdtPackageRoot getDefaultPackageRoot() {
		AxdtProjectSource source = checkDelegate();
		return source == null ? null : source.getDefaultPackageRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<IPath> getConfiguredSourcePaths() {
		AxdtProjectSource source = checkDelegate();
		return source == null ? null : source.getConfiguredSourcePaths();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addToBuildSpec(String builderId) throws CoreException {
		AxdtProjectSource source = checkDelegate();
		if (source != null) 
			source.addToBuildSpec(builderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeFromBuildSpec(String builderId) throws CoreException {
		AxdtProjectSource source = checkDelegate();
		if (source != null) 
			source.removeFromBuildSpec(builderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<AxdtPackageRoot> getPackageRoots() {
		AxdtProjectSource source = checkDelegate();
		return source == null ? null : source.getPackageRoots();
	}

	public void configure() throws CoreException {
		AxdtProjectSource source = checkDelegate();
		if (source != null)
			source.configure();
	}

	public void deconfigure() throws CoreException {
		AxdtProjectSource source = checkDelegate();
		if (source != null)
			source.deconfigure();
	}

	@Override
	public IProject getResource() {
		return (IProject) super.getResource();
	}
	public IProject getProject() {
		return getResource();
	}
	public void setProject(IProject project) {
		setResource(project);
	}
	@Override
	public AxdtProjectHandle getHandle() {
		return this;
	}
} //AxdtProjectHandleImpl
