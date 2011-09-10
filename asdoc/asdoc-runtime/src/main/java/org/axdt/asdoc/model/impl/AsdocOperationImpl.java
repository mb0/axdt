/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocOperationImpl#isNative <em>Native</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocOperationImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocOperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocOperationImpl#isFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsdocOperationImpl extends AsdocExecutableImpl implements AsdocOperation {
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
	protected static final int NATIVE_EFLAG = 1 << 1;

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
	protected static final int OVERRIDE_EFLAG = 1 << 2;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected AvmTypeReference returnType;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_OPERATION__NATIVE, oldNative, newNative));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_OPERATION__OVERRIDE, oldOverride, newOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmTypeReference getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(AvmTypeReference newReturnType, NotificationChain msgs) {
		AvmTypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(AvmTypeReference newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE, newReturnType, newReturnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_OPERATION__FINAL, oldFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
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
			case AsdocEPackage.ASDOC_OPERATION__NATIVE:
				return isNative();
			case AsdocEPackage.ASDOC_OPERATION__OVERRIDE:
				return isOverride();
			case AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE:
				return getReturnType();
			case AsdocEPackage.ASDOC_OPERATION__FINAL:
				return isFinal();
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
			case AsdocEPackage.ASDOC_OPERATION__NATIVE:
				setNative((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_OPERATION__OVERRIDE:
				setOverride((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE:
				setReturnType((AvmTypeReference)newValue);
				return;
			case AsdocEPackage.ASDOC_OPERATION__FINAL:
				setFinal((Boolean)newValue);
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
			case AsdocEPackage.ASDOC_OPERATION__NATIVE:
				setNative(NATIVE_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_OPERATION__OVERRIDE:
				setOverride(OVERRIDE_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE:
				setReturnType((AvmTypeReference)null);
				return;
			case AsdocEPackage.ASDOC_OPERATION__FINAL:
				setFinal(FINAL_EDEFAULT);
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
			case AsdocEPackage.ASDOC_OPERATION__NATIVE:
				return ((flags & NATIVE_EFLAG) != 0) != NATIVE_EDEFAULT;
			case AsdocEPackage.ASDOC_OPERATION__OVERRIDE:
				return ((flags & OVERRIDE_EFLAG) != 0) != OVERRIDE_EDEFAULT;
			case AsdocEPackage.ASDOC_OPERATION__RETURN_TYPE:
				return returnType != null;
			case AsdocEPackage.ASDOC_OPERATION__FINAL:
				return ((flags & FINAL_EFLAG) != 0) != FINAL_EDEFAULT;
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
		result.append(" (native: ");
		result.append((flags & NATIVE_EFLAG) != 0);
		result.append(", override: ");
		result.append((flags & OVERRIDE_EFLAG) != 0);
		result.append(", final: ");
		result.append((flags & FINAL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}
} //AsdocOperationImpl
