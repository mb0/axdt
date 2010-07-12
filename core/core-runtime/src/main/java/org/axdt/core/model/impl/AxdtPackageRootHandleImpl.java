/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core.model.impl;

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
	public AxdtPackageRootHandle getHandle() {
		return this;
	}
} //AxdtPackageRootHandleImpl
