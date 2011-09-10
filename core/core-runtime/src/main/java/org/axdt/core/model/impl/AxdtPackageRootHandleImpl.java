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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axdt Package Root Handle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AxdtPackageRootHandleImpl extends AxdtHandleImpl<AxdtPackageRootSource> implements AxdtPackageRootHandle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtPackageRootHandleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxdtEPackage.Literals.AXDT_PACKAGE_ROOT_HANDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isExternal() {
		AxdtPackageRootSource source = checkDelegate();
		return source == null ? false : source.isExternal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isArchive() {
		AxdtPackageRootSource source = checkDelegate();
		return source == null ? false : source.isArchive();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Set<String> getPackages() {
		AxdtPackageRootSource source = checkDelegate();
		if (source != null) source.getPackages();
		return Collections.emptySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPackage(String name) {
		AxdtPackageRootSource source = checkDelegate();
		if (source != null) source.addPackage(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getPackage(String name) {
		AxdtPackageRootSource source = checkDelegate();
		return source == null ? null : source.getPackage(name);
	}

	public AxdtPackageRootHandle getHandle() {
		return this;
	}
} //AxdtPackageRootHandleImpl
