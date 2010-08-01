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
import org.axdt.as3.model.As3AttributeExpression;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3FieldDefinition;
import org.axdt.as3.model.As3MetadataTag;
import org.axdt.avm.model.AvmVisibility;
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
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl#getCustomVisibility <em>Custom Visibility</em>}</li>
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
	protected static final int CONSTANT_EFLAG = 1 << 1;

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
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<As3MetadataTag> metadata;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final AvmVisibility VISIBILITY_EDEFAULT = AvmVisibility.PUBLIC;

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
	 * The cached value of the '{@link #getCustomVisibility() <em>Custom Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomVisibility()
	 * @generated
	 * @ordered
	 */
	protected As3AttributeExpression customVisibility;

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
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_DEFINITION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AttributeExpression getCustomVisibility() {
		return customVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomVisibility(As3AttributeExpression newCustomVisibility, NotificationChain msgs) {
		As3AttributeExpression oldCustomVisibility = customVisibility;
		customVisibility = newCustomVisibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY, oldCustomVisibility, newCustomVisibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomVisibility(As3AttributeExpression newCustomVisibility) {
		if (newCustomVisibility != customVisibility) {
			NotificationChain msgs = null;
			if (customVisibility != null)
				msgs = ((InternalEObject)customVisibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY, null, msgs);
			if (newCustomVisibility != null)
				msgs = ((InternalEObject)newCustomVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY, null, msgs);
			msgs = basicSetCustomVisibility(newCustomVisibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY, newCustomVisibility, newCustomVisibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FIELD_DEFINITION__STATIC, oldStatic, newStatic));
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
	public EList<As3MetadataTag> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<As3MetadataTag>(As3MetadataTag.class, this, As3EPackage.AS3_FIELD_DEFINITION__METADATA);
		}
		return metadata;
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
			case As3EPackage.AS3_FIELD_DEFINITION__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY:
				return basicSetCustomVisibility(null, msgs);
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
			case As3EPackage.AS3_FIELD_DEFINITION__STATIC:
				return isStatic();
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				return isConstant();
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				return getBindings();
			case As3EPackage.AS3_FIELD_DEFINITION__METADATA:
				return getMetadata();
			case As3EPackage.AS3_FIELD_DEFINITION__VISIBILITY:
				return getVisibility();
			case As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY:
				return getCustomVisibility();
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
			case As3EPackage.AS3_FIELD_DEFINITION__STATIC:
				setStatic((Boolean)newValue);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends As3FieldBinding>)newValue);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends As3MetadataTag>)newValue);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__VISIBILITY:
				setVisibility((AvmVisibility)newValue);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY:
				setCustomVisibility((As3AttributeExpression)newValue);
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
			case As3EPackage.AS3_FIELD_DEFINITION__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				getBindings().clear();
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__METADATA:
				getMetadata().clear();
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY:
				setCustomVisibility((As3AttributeExpression)null);
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
			case As3EPackage.AS3_FIELD_DEFINITION__STATIC:
				return ((flags & STATIC_EFLAG) != 0) != STATIC_EDEFAULT;
			case As3EPackage.AS3_FIELD_DEFINITION__CONSTANT:
				return ((flags & CONSTANT_EFLAG) != 0) != CONSTANT_EDEFAULT;
			case As3EPackage.AS3_FIELD_DEFINITION__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case As3EPackage.AS3_FIELD_DEFINITION__METADATA:
				return metadata != null && !metadata.isEmpty();
			case As3EPackage.AS3_FIELD_DEFINITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case As3EPackage.AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY:
				return customVisibility != null;
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
		result.append(" (static: ");
		result.append((flags & STATIC_EFLAG) != 0);
		result.append(", constant: ");
		result.append((flags & CONSTANT_EFLAG) != 0);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //As3FieldDefinitionImpl
