/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocParameter;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocParameterImpl#isRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsdocParameterImpl extends AsdocDefinitionImpl implements AsdocParameter {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AvmTypeReference type;

	/**
	 * The default value of the '{@link #isRest() <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REST_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isRest() <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRest()
	 * @generated
	 * @ordered
	 */
	protected static final int REST_EFLAG = 1 << 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmTypeReference getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AvmTypeReference newType, NotificationChain msgs) {
		AvmTypeReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PARAMETER__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AvmTypeReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsdocEPackage.ASDOC_PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsdocEPackage.ASDOC_PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRest() {
		return (flags & REST_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(boolean newRest) {
		boolean oldRest = (flags & REST_EFLAG) != 0;
		if (newRest) flags |= REST_EFLAG; else flags &= ~REST_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PARAMETER__REST, oldRest, newRest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_PARAMETER__TYPE:
				return basicSetType(null, msgs);
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
			case AsdocEPackage.ASDOC_PARAMETER__TYPE:
				return getType();
			case AsdocEPackage.ASDOC_PARAMETER__REST:
				return isRest();
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
			case AsdocEPackage.ASDOC_PARAMETER__TYPE:
				setType((AvmTypeReference)newValue);
				return;
			case AsdocEPackage.ASDOC_PARAMETER__REST:
				setRest((Boolean)newValue);
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
			case AsdocEPackage.ASDOC_PARAMETER__TYPE:
				setType((AvmTypeReference)null);
				return;
			case AsdocEPackage.ASDOC_PARAMETER__REST:
				setRest(REST_EDEFAULT);
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
			case AsdocEPackage.ASDOC_PARAMETER__TYPE:
				return type != null;
			case AsdocEPackage.ASDOC_PARAMETER__REST:
				return ((flags & REST_EFLAG) != 0) != REST_EDEFAULT;
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
		result.append(" (rest: ");
		result.append((flags & REST_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	public String getFullUri() {
		AsdocRoot root = getRoot();
		if (root != null) {
			String base = root.getBaseUri();
			String url = root.getParseType().getUrlHelper().paramUrl(this);
			if (base != null && url != null)
				return base + url; 
		}
		return null;
	}

} //AsdocParameterImpl
