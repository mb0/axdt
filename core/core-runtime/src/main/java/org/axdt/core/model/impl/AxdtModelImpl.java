/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model.impl;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.core.AxdtCore;
import org.axdt.core.AxdtEFactory;
import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.AxdtElement;
import org.axdt.core.model.AxdtHandle;
import org.axdt.core.model.AxdtModel;
import org.axdt.core.model.AxdtPackageRoot;
import org.axdt.core.model.AxdtPackageRootHandle;
import org.axdt.core.model.AxdtPackageRootSource;
import org.axdt.core.model.AxdtProject;
import org.axdt.core.model.AxdtProjectHandle;
import org.axdt.core.model.AxdtProjectSource;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axdt Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.core.model.impl.AxdtModelImpl#getConnectedProjects <em>Connected Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxdtModelImpl extends AxdtElementImpl implements AxdtModel {
	
	/**
	 * The cached value of the '{@link #getConnectedProjects() <em>Connected Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<AxdtProjectSource> connectedProjects;
	private final Logger logger = Logger.getLogger(AxdtModelImpl.class);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxdtEPackage.Literals.AXDT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AxdtProjectSource> getConnectedProjects() {
		if (connectedProjects == null) {
			connectedProjects = new EObjectContainmentWithInverseEList<AxdtProjectSource>(AxdtProjectSource.class, this, AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS, AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT);
		}
		return connectedProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<AxdtProject> getProjects() {
		IWorkspaceRoot resource = getResource();
		List<AxdtProject> list = Lists.newArrayList();
		for (IProject project:resource.getProjects()) {
			if (hasAxdtNature(project))
				list.add(getProject(project));
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AxdtProject getProject(IProject project) {
		if (project == null) return null;
		AxdtProjectHandle axdtProject = AxdtEFactory.eINSTANCE.createAxdtProjectHandle();
		axdtProject.setResource(project);
		return axdtProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AxdtPackageRoot getPackageRoot(IResource resource) {
		if (resource == null) return null;
		AxdtPackageRootHandle root = AxdtEFactory.eINSTANCE.createAxdtPackageRootHandle();
		root.setResource(resource);
		return root;
	}

	@SuppressWarnings("unchecked")
	public <T extends AxdtElement> void connectHandle(AxdtHandle<T> handle) {
		IResource resource = handle.getResource();
		if (resource == null) return;
		T result = null;
		if (handle instanceof AxdtProjectHandle)
			result = (T) getOrCreateProjectSource((IProject) resource);
		else if (handle instanceof AxdtPackageRootHandle) 
			result = (T) getOrCreatePackageRootSource(resource);
		handle.setDelegate(result);
	}
	protected AxdtProjectSource getOrCreateProjectSource(IProject project) {
		for (AxdtProjectSource source:getConnectedProjects()) {
			if (project.equals(source.getProject()))
				return source;
		}
		AxdtProjectSource source = AxdtEFactory.eINSTANCE.createAxdtProjectSource();
		source.setProject(project);
		getConnectedProjects().add(source);
		return source;
	}
	protected AxdtPackageRootSource getOrCreatePackageRootSource(IResource resource) {
		IProject project = resource.getProject();
		AxdtProjectSource projectSource = getOrCreateProjectSource(project);
		for (AxdtPackageRootSource source:projectSource.getConnectedPackageRoots()) {
			if (resource.equals(source.getResource()))
				return source;
		}
		AxdtPackageRootSource source = AxdtEFactory.eINSTANCE.createAxdtPackageRootSource();
		source.setResource(resource);
		projectSource.getConnectedPackageRoots().add(source);
		return source;
	}

	public IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedProjects()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS:
				return ((InternalEList<?>)getConnectedProjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS:
				return getConnectedProjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS:
				getConnectedProjects().clear();
				getConnectedProjects().addAll((Collection<? extends AxdtProjectSource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS:
				getConnectedProjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS:
				return connectedProjects != null && !connectedProjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public IPath getPath() {
		return Path.ROOT;
	}

	public IWorkspaceRoot getResource() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	public boolean isReadOnly() {
		return false;
	}

	public boolean hasAxdtNature(IProject project) {
		if (project == null) return false;
		try {
			return project.hasNature(AxdtCore.NATURE_ID);
		} catch (CoreException e) {
			logger.info("exception when checking for axdt nature",e);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ICommand newBuilderCommand(IProjectDescription description, String builderId) {
		if (description == null) return null;
		ICommand command = description.newCommand();
		command.setBuilderName(builderId);
		return command;
	}

	public boolean exists() {
		return true;
	}

	public AxdtElement getParent() {
		return null;
	}
	@Override
	public boolean isConnected() {
		return true;
	}
	@Override
	public void connect() {
		for (IProject project:getResource().getProjects(IResource.HIDDEN)) {
			if (hasAxdtNature(project)) {
				AxdtProjectSource source = AxdtEFactory.eINSTANCE.createAxdtProjectSource();
				source.setProject(project);
				getProjects().add(source);
			}
		}
	}
	@Override
	public void disconnect() {
		getConnectedProjects().clear();
	}

	@Override
	public AxdtModel getHandle() {
		return this;
	}
	@Override
	public boolean isHandle() {
		return true;
	}
} //AxdtModelImpl
