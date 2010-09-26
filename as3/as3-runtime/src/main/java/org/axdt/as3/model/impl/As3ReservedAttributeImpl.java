/**
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org> and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;

import org.axdt.as3.model.As3ReservedAttribute;

import org.axdt.avm.model.AvmVisibility;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Reserved Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3ReservedAttributeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ReservedAttributeImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ReservedAttributeImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ReservedAttributeImpl#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ReservedAttributeImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ReservedAttributeImpl#isNative <em>Native</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3ReservedAttributeImpl extends MinimalEObjectImpl.Container implements As3ReservedAttribute {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int flags = 0;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @ordered
	 */
	protected static final AvmVisibility VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected AvmVisibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final int STATIC_EFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverride()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERRIDE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverride()
	 * @generated
	 * @ordered
	 */
	protected static final int OVERRIDE_EFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final int DYNAMIC_EFLAG = 1 << 2;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_EFLAG = 1 << 3;

	/**
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final int NATIVE_EFLAG = 1 << 4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ReservedAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_RESERVED_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(AvmVisibility newVisibility) {
		AvmVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_RESERVED_ATTRIBUTE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return (flags & STATIC_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = (flags & STATIC_EFLAG) != 0;
		if (newStatic) flags |= STATIC_EFLAG; else flags &= ~STATIC_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_RESERVED_ATTRIBUTE__STATIC, oldStatic, newStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverride() {
		return (flags & OVERRIDE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(boolean newOverride) {
		boolean oldOverride = (flags & OVERRIDE_EFLAG) != 0;
		if (newOverride) flags |= OVERRIDE_EFLAG; else flags &= ~OVERRIDE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_RESERVED_ATTRIBUTE__OVERRIDE, oldOverride, newOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamic() {
		return (flags & DYNAMIC_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamic(boolean newDynamic) {
		boolean oldDynamic = (flags & DYNAMIC_EFLAG) != 0;
		if (newDynamic) flags |= DYNAMIC_EFLAG; else flags &= ~DYNAMIC_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_RESERVED_ATTRIBUTE__DYNAMIC, oldDynamic, newDynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return (flags & FINAL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = (flags & FINAL_EFLAG) != 0;
		if (newFinal) flags |= FINAL_EFLAG; else flags &= ~FINAL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_RESERVED_ATTRIBUTE__FINAL, oldFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNative() {
		return (flags & NATIVE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative(boolean newNative) {
		boolean oldNative = (flags & NATIVE_EFLAG) != 0;
		if (newNative) flags |= NATIVE_EFLAG; else flags &= ~NATIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_RESERVED_ATTRIBUTE__NATIVE, oldNative, newNative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isVisibility() {
		return visibility != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__VISIBILITY:
				return getVisibility();
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__STATIC:
				return isStatic();
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__OVERRIDE:
				return isOverride();
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__DYNAMIC:
				return isDynamic();
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__FINAL:
				return isFinal();
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__NATIVE:
				return isNative();
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
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__VISIBILITY:
				setVisibility((AvmVisibility)newValue);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__STATIC:
				setStatic((Boolean)newValue);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__OVERRIDE:
				setOverride((Boolean)newValue);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__DYNAMIC:
				setDynamic((Boolean)newValue);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__FINAL:
				setFinal((Boolean)newValue);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__NATIVE:
				setNative((Boolean)newValue);
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
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__OVERRIDE:
				setOverride(OVERRIDE_EDEFAULT);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__DYNAMIC:
				setDynamic(DYNAMIC_EDEFAULT);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__NATIVE:
				setNative(NATIVE_EDEFAULT);
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
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__STATIC:
				return ((flags & STATIC_EFLAG) != 0) != STATIC_EDEFAULT;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__OVERRIDE:
				return ((flags & OVERRIDE_EFLAG) != 0) != OVERRIDE_EDEFAULT;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__DYNAMIC:
				return ((flags & DYNAMIC_EFLAG) != 0) != DYNAMIC_EDEFAULT;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__FINAL:
				return ((flags & FINAL_EFLAG) != 0) != FINAL_EDEFAULT;
			case As3EPackage.AS3_RESERVED_ATTRIBUTE__NATIVE:
				return ((flags & NATIVE_EFLAG) != 0) != NATIVE_EDEFAULT;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", static: ");
		result.append((flags & STATIC_EFLAG) != 0);
		result.append(", override: ");
		result.append((flags & OVERRIDE_EFLAG) != 0);
		result.append(", dynamic: ");
		result.append((flags & DYNAMIC_EFLAG) != 0);
		result.append(", final: ");
		result.append((flags & FINAL_EFLAG) != 0);
		result.append(", native: ");
		result.append((flags & NATIVE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //As3ReservedAttributeImpl
