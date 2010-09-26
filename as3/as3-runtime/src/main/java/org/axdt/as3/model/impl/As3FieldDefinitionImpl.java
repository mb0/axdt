/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import java.util.Collection;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Attributes;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3FieldDefinition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Field Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3FieldDefinitionImpl extends MinimalEObjectImpl.Container implements As3FieldDefinition {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int flags = 0;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSTANT_EFLAG = 1 << 0;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<As3FieldBinding> bindings;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected As3Attributes attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3FieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_FIELD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return (flags & CONSTANT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = (flags & CONSTANT_EFLAG) != 0;
		if (newConstant) flags |= CONSTANT_EFLAG; else flags &= ~CONSTANT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_DEFINITION__CONSTANT, oldConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<As3FieldBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<As3FieldBinding>(As3FieldBinding.class, this, As3EPackage.AS3_FIELD_DEFINITION__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Attributes getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(As3Attributes newAttributes, NotificationChain msgs) {
		As3Attributes oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(As3Attributes newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
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
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				return isConstant();
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				return getBindings();
			case As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES:
				return getAttributes();
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
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends As3FieldBinding>)newValue);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES:
				setAttributes((As3Attributes)newValue);
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
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				getBindings().clear();
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES:
				setAttributes((As3Attributes)null);
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
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				return ((flags & CONSTANT_EFLAG) != 0) != CONSTANT_EDEFAULT;
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case As3EPackage.AS3_FIELD_DEFINITION__ATTRIBUTES:
				return attributes != null;
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
		result.append(" (constant: ");
		result.append((flags & CONSTANT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //As3FieldDefinitionImpl
