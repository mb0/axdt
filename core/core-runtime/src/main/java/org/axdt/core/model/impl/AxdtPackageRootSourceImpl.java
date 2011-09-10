/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model.impl;

import java.util.Collections;
import java.util.Set;

import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.AxdtPackageRootHandle;
import org.axdt.core.model.AxdtPackageRootSource;
import org.axdt.core.model.AxdtProjectSource;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.Sets;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axdt Resource Package Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.core.model.impl.AxdtPackageRootSourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.axdt.core.model.impl.AxdtPackageRootSourceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxdtPackageRootSourceImpl extends AxdtElementImpl implements AxdtPackageRootSource {
	
	protected Set<String> packages = Sets.newHashSet();
	
	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final IResource RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected IResource resource = RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtPackageRootSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxdtEPackage.Literals.AXDT_PACKAGE_ROOT_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtProjectSource getParent() {
		if (eContainerFeatureID() != AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT) return null;
		return (AxdtProjectSource)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AxdtProjectSource newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AxdtProjectSource newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS, AxdtProjectSource.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isExternal() {
		// TODO support external sources in the model
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isArchive() {
		// TODO support archives sources in the model
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<String> getPackages() {
		return Collections.unmodifiableSet(packages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getPackage(String name) {
		for (String pack:packages)
			if (pack.equals(name))
				return pack;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPackage(String name) {
		packages.add(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AxdtProjectSource)otherEnd, msgs);
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
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT:
				return eInternalContainer().eInverseRemove(this, AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS, AxdtProjectSource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__RESOURCE:
				return getResource();
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__RESOURCE:
				setResource((IResource)newValue);
				return;
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT:
				setParent((AxdtProjectSource)newValue);
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
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT:
				setParent((AxdtProjectSource)null);
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
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resource: ");
		result.append(resource);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(IResource newResource) {
		IResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource getResource() {
		return resource;
	}

	@Override
	public void connect() {
		
	}

	@Override
	public void disconnect() {
		
	}

	@Override
	public AxdtPackageRootHandle getHandle() {
		AxdtPackageRootHandle handle = AxdtEFactoryImpl.eINSTANCE.createAxdtPackageRootHandle();
		handle.setResource(getResource());
		handle.setDelegate(this);
		return handle;
	}

} //AxdtPackageRootSourceImpl
