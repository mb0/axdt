/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.avm.model.AvmOperation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPropertyImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPropertyImpl#isWriteonly <em>Writeonly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsdocPropertyImpl extends AsdocFieldImpl implements AsdocProperty {
	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final int READONLY_EFLAG = 1 << 2;

	/**
	 * The default value of the '{@link #isWriteonly() <em>Writeonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITEONLY_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isWriteonly() <em>Writeonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteonly()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITEONLY_EFLAG = 1 << 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return (flags & READONLY_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		boolean oldReadonly = (flags & READONLY_EFLAG) != 0;
		if (newReadonly) flags |= READONLY_EFLAG; else flags &= ~READONLY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PROPERTY__READONLY, oldReadonly, newReadonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteonly() {
		return (flags & WRITEONLY_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteonly(boolean newWriteonly) {
		boolean oldWriteonly = (flags & WRITEONLY_EFLAG) != 0;
		if (newWriteonly) flags |= WRITEONLY_EFLAG; else flags &= ~WRITEONLY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PROPERTY__WRITEONLY, oldWriteonly, newWriteonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AvmOperation getGetter() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AvmOperation getSetter() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_PROPERTY__READONLY:
				return isReadonly();
			case AsdocEPackage.ASDOC_PROPERTY__WRITEONLY:
				return isWriteonly();
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
			case AsdocEPackage.ASDOC_PROPERTY__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_PROPERTY__WRITEONLY:
				setWriteonly((Boolean)newValue);
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
			case AsdocEPackage.ASDOC_PROPERTY__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_PROPERTY__WRITEONLY:
				setWriteonly(WRITEONLY_EDEFAULT);
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
			case AsdocEPackage.ASDOC_PROPERTY__READONLY:
				return ((flags & READONLY_EFLAG) != 0) != READONLY_EDEFAULT;
			case AsdocEPackage.ASDOC_PROPERTY__WRITEONLY:
				return ((flags & WRITEONLY_EFLAG) != 0) != WRITEONLY_EDEFAULT;
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
		result.append(" (readonly: ");
		result.append((flags & READONLY_EFLAG) != 0);
		result.append(", writeonly: ");
		result.append((flags & WRITEONLY_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //AsdocPropertyImpl
