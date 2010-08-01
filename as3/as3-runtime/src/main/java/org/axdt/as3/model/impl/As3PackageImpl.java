/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import java.util.Collection;
import java.util.List;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Member;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Type;
import org.axdt.as3.model.IDirective;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3PackageImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3PackageImpl#getCanonicalName <em>Canonical Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3PackageImpl extends As3IdentifiableImpl implements As3Package {
	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<IDirective> directives;

	/**
	 * The default value of the '{@link #getCanonicalName() <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalName()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanonicalName() <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalName()
	 * @generated
	 * @ordered
	 */
	protected String canonicalName = CANONICAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<IDirective>(IDirective.class, this, As3EPackage.AS3_PACKAGE__DIRECTIVES);
		}
		return directives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanonicalName() {
		return canonicalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalName(String newCanonicalName) {
		String oldCanonicalName = canonicalName;
		canonicalName = newCanonicalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_PACKAGE__CANONICAL_NAME, oldCanonicalName, canonicalName));
	}

	public String getQualifier() {
		if (canonicalName == null) return null;
		int lastDot = canonicalName.lastIndexOf('.');
		return lastDot < 0 ? null : canonicalName.substring(0,lastDot);
	}
	
	@Override
	public String getName() {
		if (canonicalName == null) return null;
		int lastDot = canonicalName.lastIndexOf('.');
		return lastDot < 0 ? canonicalName : canonicalName.substring(lastDot+1);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings("unchecked")
	public List<As3Type> getTypes() {
		return internalGetTypes(getDirectives());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings("unchecked")
	public List<As3Member> getMembers() {
		return internalGetMembers(getDirectives());
 	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_PACKAGE__DIRECTIVES:
				return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
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
			case As3EPackage.AS3_PACKAGE__DIRECTIVES:
				return getDirectives();
			case As3EPackage.AS3_PACKAGE__CANONICAL_NAME:
				return getCanonicalName();
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
			case As3EPackage.AS3_PACKAGE__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends IDirective>)newValue);
				return;
			case As3EPackage.AS3_PACKAGE__CANONICAL_NAME:
				setCanonicalName((String)newValue);
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
			case As3EPackage.AS3_PACKAGE__DIRECTIVES:
				getDirectives().clear();
				return;
			case As3EPackage.AS3_PACKAGE__CANONICAL_NAME:
				setCanonicalName(CANONICAL_NAME_EDEFAULT);
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
			case As3EPackage.AS3_PACKAGE__DIRECTIVES:
				return directives != null && !directives.isEmpty();
			case As3EPackage.AS3_PACKAGE__CANONICAL_NAME:
				return CANONICAL_NAME_EDEFAULT == null ? canonicalName != null : !CANONICAL_NAME_EDEFAULT.equals(canonicalName);
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
		result.append(" (canonicalName: ");
		result.append(canonicalName);
		result.append(')');
		return result.toString();
	}

} //As3PackageImpl
