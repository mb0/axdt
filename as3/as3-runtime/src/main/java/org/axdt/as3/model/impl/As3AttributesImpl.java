/**
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org> and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.axdt.as3.model.impl;

import java.util.Collection;

import org.axdt.as3.As3EPackage;

import org.axdt.as3.model.As3Attributes;
import org.axdt.as3.model.As3ReservedAttribute;
import org.axdt.as3.model.IAttribute;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Iterables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3AttributesImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3AttributesImpl extends MinimalEObjectImpl.Container implements As3Attributes {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int flags = 0;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<IAttribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3AttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<IAttribute>(IAttribute.class, this, As3EPackage.AS3_ATTRIBUTES__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isDynamic() {
		if (attributes != null)
			for (As3ReservedAttribute element:Iterables.filter(attributes, As3ReservedAttribute.class))
				if (element.isDynamic())
					return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isFinal() {
		if (attributes != null)
			for (As3ReservedAttribute element:Iterables.filter(attributes, As3ReservedAttribute.class))
				if (element.isFinal())
					return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmVisibility getVisibility() {
		if (attributes != null)
			for (As3ReservedAttribute element:getReservedAttributes())
				if (element.isVisibility())
					return element.getVisibility();
		AvmDeclaredType enclosingType = null;
		for (EObject current = eContainer(); current != null; current = current.eContainer()) {
			if (current instanceof AvmDeclaredType) {
				enclosingType = (AvmDeclaredType) current;
				break;
			}
		}
		if (enclosingType != null && enclosingType.isInterface()) {
			return AvmVisibility.PUBLIC;
		}
		return AvmVisibility.INTERNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isStatic() {
		if (attributes != null)
			for (As3ReservedAttribute element:getReservedAttributes())
				if (element.isStatic())
					return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isNative() {
		if (attributes != null)
			for (As3ReservedAttribute element:getReservedAttributes())
				if (element.isNative())
					return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isOverride() {
		if (attributes != null)
			for (As3ReservedAttribute element:getReservedAttributes())
				if (element.isOverride())
					return true;
		return false;
	}

	protected Iterable<As3ReservedAttribute> getReservedAttributes() {
		return Iterables.filter(attributes, As3ReservedAttribute.class);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_ATTRIBUTES__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case As3EPackage.AS3_ATTRIBUTES__ATTRIBUTES:
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
			case As3EPackage.AS3_ATTRIBUTES__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends IAttribute>)newValue);
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
			case As3EPackage.AS3_ATTRIBUTES__ATTRIBUTES:
				getAttributes().clear();
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
			case As3EPackage.AS3_ATTRIBUTES__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //As3AttributesImpl
