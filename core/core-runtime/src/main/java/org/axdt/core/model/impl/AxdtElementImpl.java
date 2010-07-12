/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core.model.impl;

import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.AxdtElement;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axdt Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AxdtElementImpl extends EObjectImpl implements AxdtElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxdtEPackage.Literals.AXDT_ELEMENT;
	}

	public AxdtElement getParent() {
		EObject parent = eContainer();
		return parent instanceof AxdtElement ? (AxdtElement) parent : null;
	}

	public abstract IResource getResource();

	public String getName() {
		IResource resource = getResource();
		return resource != null ? resource.getName() : null;
	}

	public IPath getPath() {
		IResource resource = getResource();
		return resource != null ? resource.getFullPath() : null;
	}
	public boolean isReadOnly() {
		IResource resource = getResource();
		return resource != null ? resource.getResourceAttributes().isReadOnly() : false;
	}

	public boolean exists() {
		IResource resource = getResource();
		return resource == null || !resource.exists() ? false : isConnected();
	}

	public boolean isHandle() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract AxdtElement getHandle();

	public boolean isConnected() {
		AxdtElement parent = getParent();
		return parent == null ? false : parent.isConnected();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract void connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract void disconnect();

} //AxdtElementImpl
