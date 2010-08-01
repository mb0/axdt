/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocRootImpl#getBaseUri <em>Base Uri</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocRootImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsdocRootImpl extends AsdocPackageImpl implements AsdocRoot {
	/**
	 * The default value of the '{@link #getBaseUri() <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUri()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseUri() <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUri()
	 * @generated
	 * @ordered
	 */
	protected String baseUri = BASE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseUri() {
		return baseUri;
	}

	@Override
	public String getFullUri() {
		return baseUri;
	}
	@Override
	public AsdocRoot getRoot() {
		return this;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setBaseUri(String newBaseUri) {
		String oldBaseUri = baseUri;
		// TODO check url
		if (newBaseUri.endsWith("index.html"))
			newBaseUri = newBaseUri.substring(0, newBaseUri.length()-10);
		if (newBaseUri.charAt(newBaseUri.length()-1)!='/')
			newBaseUri =  newBaseUri +'/';
		baseUri = newBaseUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_ROOT__BASE_URI, oldBaseUri, baseUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_ROOT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AsdocPackage getPackage(String fqn) {
		if (fqn == null) return null;
		AsdocPackage current = this;
		if (!fqn.equals("")) {
			String[] split = fqn.split("\\.");
			String childFqn = "";
			for (String part:split) {
				childFqn = childFqn.length() == 0 ? part : childFqn+"."+part;
				current = current.getChildPackage(childFqn);
				if (current == null) 
					break;
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AsdocPackage createPackage(String fqn) {
		if (fqn == null) return null;
		AsdocPackage current = this;
		if (!fqn.equals("")) {
			String[] split = fqn.split("\\.");
			String childFqn = "";
			for (String part:split) {
				childFqn = childFqn.length() == 0 ? part : childFqn+"."+part;
				current = current.createChildPackage(childFqn);
				if (current == null) 
					break;
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_ROOT__BASE_URI:
				return getBaseUri();
			case AsdocEPackage.ASDOC_ROOT__VERSION:
				return getVersion();
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
			case AsdocEPackage.ASDOC_ROOT__BASE_URI:
				setBaseUri((String)newValue);
				return;
			case AsdocEPackage.ASDOC_ROOT__VERSION:
				setVersion((Integer)newValue);
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
			case AsdocEPackage.ASDOC_ROOT__BASE_URI:
				setBaseUri(BASE_URI_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_ROOT__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case AsdocEPackage.ASDOC_ROOT__BASE_URI:
				return BASE_URI_EDEFAULT == null ? baseUri != null : !BASE_URI_EDEFAULT.equals(baseUri);
			case AsdocEPackage.ASDOC_ROOT__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(" (baseUri: ");
		result.append(baseUri);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //AsdocRootImpl
