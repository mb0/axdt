/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Attributes;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3FieldDefinition;
import org.axdt.as3.model.IExpression;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Field Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldBindingImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldBindingImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3FieldBindingImpl extends As3MemberImpl implements As3FieldBinding {
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
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected IExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3FieldBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_FIELD_BINDING;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_BINDING__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_BINDING__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_BINDING__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_BINDING__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(IExpression newExpression, NotificationChain msgs) {
		IExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_BINDING__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(IExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_BINDING__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_BINDING__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_BINDING__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isConstant() {
		EObject parent = eContainer();
		if (parent instanceof As3FieldDefinition) {
			As3FieldDefinition def = (As3FieldDefinition) parent;
			return def.isConstant();
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_FIELD_BINDING__TYPE:
				return basicSetType(null, msgs);
			case As3EPackage.AS3_FIELD_BINDING__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case As3EPackage.AS3_FIELD_BINDING__TYPE:
				return getType();
			case As3EPackage.AS3_FIELD_BINDING__EXPRESSION:
				return getExpression();
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
			case As3EPackage.AS3_FIELD_BINDING__TYPE:
				setType((AvmTypeReference)newValue);
				return;
			case As3EPackage.AS3_FIELD_BINDING__EXPRESSION:
				setExpression((IExpression)newValue);
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
			case As3EPackage.AS3_FIELD_BINDING__TYPE:
				setType((AvmTypeReference)null);
				return;
			case As3EPackage.AS3_FIELD_BINDING__EXPRESSION:
				setExpression((IExpression)null);
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
			case As3EPackage.AS3_FIELD_BINDING__TYPE:
				return type != null;
			case As3EPackage.AS3_FIELD_BINDING__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}
	@Override
	protected EObject getQualifyingParent() {
		EObject parent = eContainer();
		return parent instanceof As3FieldDefinition
			? parent.eContainer() : parent; 
	}
	@Override
	public As3Attributes getAttributes() {
		if (eContainer instanceof As3FieldDefinition) {
			As3FieldDefinition fieldDef = (As3FieldDefinition) eContainer;
			return fieldDef.getAttributes();
		}
		return null;
	}
	@Override
	public void setAttributes(As3Attributes newAttributes) {
		throw new UnsupportedOperationException();
	}
} //As3FieldBindingImpl
