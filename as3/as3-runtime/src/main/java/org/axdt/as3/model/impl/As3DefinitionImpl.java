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
import org.axdt.as3.model.As3Definition;
import org.axdt.as3.model.As3MetadataTag;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.axdt.as3.model.As3Package;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3DefinitionImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3DefinitionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3DefinitionImpl#getCustomVisibility <em>Custom Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3DefinitionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class As3DefinitionImpl extends As3IdentifiableImpl implements As3Definition {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_DEFINITION;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<As3MetadataTag> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<As3MetadataTag>(As3MetadataTag.class, this, As3EPackage.AS3_DEFINITION__METADATA);
		}
		return metadata;
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
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_DEFINITION__VISIBILITY, oldVisibility, visibility));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY, oldCustomVisibility, newCustomVisibility);
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
				msgs = ((InternalEObject)customVisibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY, null, msgs);
			if (newCustomVisibility != null)
				msgs = ((InternalEObject)newCustomVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY, null, msgs);
			msgs = basicSetCustomVisibility(newCustomVisibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY, newCustomVisibility, newCustomVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_DEFINITION__NAME, oldName, name));
	}

	public String getQualifier() {
		EObject parent = getQualifyingParent();
		if (!(parent instanceof AvmDefinition)) return null;
		String name = ((AvmDefinition)parent).getCanonicalName();
		return name != null && name.length() > 0 ? name : null;
	}
	protected EObject getQualifyingParent() {
		return eContainer();
	}
	
	public String getCanonicalName() {
		if (getName()==null) return null;
		EObject container = getQualifyingParent();
		String qualifier = getQualifier();
		if (qualifier != null) {
			if (container instanceof As3Package)
				qualifier += "::";
			else if (container instanceof AvmType)
				qualifier += "#";
			else qualifier += '.';
			return qualifier + getName(); 
		}
		return container == null || container instanceof As3Package
				? getName() : "::"+getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_DEFINITION__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY:
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
			case As3EPackage.AS3_DEFINITION__METADATA:
				return getMetadata();
			case As3EPackage.AS3_DEFINITION__VISIBILITY:
				return getVisibility();
			case As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY:
				return getCustomVisibility();
			case As3EPackage.AS3_DEFINITION__NAME:
				return getName();
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
			case As3EPackage.AS3_DEFINITION__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends As3MetadataTag>)newValue);
				return;
			case As3EPackage.AS3_DEFINITION__VISIBILITY:
				setVisibility((AvmVisibility)newValue);
				return;
			case As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY:
				setCustomVisibility((As3AttributeExpression)newValue);
				return;
			case As3EPackage.AS3_DEFINITION__NAME:
				setName((String)newValue);
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
			case As3EPackage.AS3_DEFINITION__METADATA:
				getMetadata().clear();
				return;
			case As3EPackage.AS3_DEFINITION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY:
				setCustomVisibility((As3AttributeExpression)null);
				return;
			case As3EPackage.AS3_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
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
			case As3EPackage.AS3_DEFINITION__METADATA:
				return metadata != null && !metadata.isEmpty();
			case As3EPackage.AS3_DEFINITION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case As3EPackage.AS3_DEFINITION__CUSTOM_VISIBILITY:
				return customVisibility != null;
			case As3EPackage.AS3_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
} //As3DefinitionImpl
