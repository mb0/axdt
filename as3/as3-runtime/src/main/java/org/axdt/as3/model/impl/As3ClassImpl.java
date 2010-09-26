/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Class;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3ClassImpl#getExtendedClass <em>Extended Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3ClassImpl extends As3TypeImpl implements As3Class {
	/**
	 * The cached value of the '{@link #getExtendedClass() <em>Extended Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected AvmTypeReference extendedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmTypeReference getExtendedClass() {
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedClass(AvmTypeReference newExtendedClass, NotificationChain msgs) {
		AvmTypeReference oldExtendedClass = extendedClass;
		extendedClass = newExtendedClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CLASS__EXTENDED_CLASS, oldExtendedClass, newExtendedClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedClass(AvmTypeReference newExtendedClass) {
		if (newExtendedClass != extendedClass) {
			NotificationChain msgs = null;
			if (extendedClass != null)
				msgs = ((InternalEObject)extendedClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CLASS__EXTENDED_CLASS, null, msgs);
			if (newExtendedClass != null)
				msgs = ((InternalEObject)newExtendedClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CLASS__EXTENDED_CLASS, null, msgs);
			msgs = basicSetExtendedClass(newExtendedClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CLASS__EXTENDED_CLASS, newExtendedClass, newExtendedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_CLASS__EXTENDED_CLASS:
				return basicSetExtendedClass(null, msgs);
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
			case As3EPackage.AS3_CLASS__EXTENDED_CLASS:
				return getExtendedClass();
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
			case As3EPackage.AS3_CLASS__EXTENDED_CLASS:
				setExtendedClass((AvmTypeReference)newValue);
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
			case As3EPackage.AS3_CLASS__EXTENDED_CLASS:
				setExtendedClass((AvmTypeReference)null);
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
			case As3EPackage.AS3_CLASS__EXTENDED_CLASS:
				return extendedClass != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean isClass() {
		return true;
	}
} //As3ClassImpl
