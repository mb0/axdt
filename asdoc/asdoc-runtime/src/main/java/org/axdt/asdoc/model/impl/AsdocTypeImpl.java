/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model.impl;

import java.util.Collection;
import java.util.List;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#isMemberContentParsed <em>Member Content Parsed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AsdocTypeImpl extends AsdocDefinitionImpl implements AsdocType {
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<AsdocMember> members;

	/**
	 * The cached value of the '{@link #getExtendedInterfaces() <em>Extended Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<AvmTypeReference> extendedInterfaces;

	/**
	 * The default value of the '{@link #isMemberContentParsed() <em>Member Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_CONTENT_PARSED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMemberContentParsed() <em>Member Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMBER_CONTENT_PARSED_EFLAG = 1 << 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_TYPE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract boolean isInterface();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract boolean isDynamic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract boolean isFinal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<AvmTypeReference> getSuperTypes() {
		List<AvmTypeReference> result = Lists.newArrayList();
		if (getExtendedClass() != null) result.add(getExtendedClass());
		result.addAll(getExtendedInterfaces());
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsdocMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<AsdocMember>(AsdocMember.class, this, AsdocEPackage.ASDOC_TYPE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmTypeReference getExtendedClass() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvmTypeReference> getExtendedInterfaces() {
		if (extendedInterfaces == null) {
			extendedInterfaces = new EObjectContainmentEList<AvmTypeReference>(AvmTypeReference.class, this, AsdocEPackage.ASDOC_TYPE__EXTENDED_INTERFACES);
		}
		return extendedInterfaces;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemberContentParsed() {
		return (flags & MEMBER_CONTENT_PARSED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberContentParsed(boolean newMemberContentParsed) {
		boolean oldMemberContentParsed = (flags & MEMBER_CONTENT_PARSED_EFLAG) != 0;
		if (newMemberContentParsed) flags |= MEMBER_CONTENT_PARSED_EFLAG; else flags &= ~MEMBER_CONTENT_PARSED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_TYPE__MEMBER_CONTENT_PARSED, oldMemberContentParsed, newMemberContentParsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract boolean isClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmType calculateCommonType(AvmType other) {
		if (other == null)
			return null;
		if (!(other instanceof AvmDeclaredType))
			return other;
		String canonicalName = getCanonicalName();
		String otherName = other.getCanonicalName();
		if (canonicalName == null ? otherName == null : canonicalName
				.equals(otherName)) {
			return this;
		}
		// TODO: handle inheritance
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_INTERFACES:
				return ((InternalEList<?>)getExtendedInterfaces()).basicRemove(otherEnd, msgs);
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
			case AsdocEPackage.ASDOC_TYPE__VISIBILITY:
				return getVisibility();
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				return getMembers();
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_INTERFACES:
				return getExtendedInterfaces();
			case AsdocEPackage.ASDOC_TYPE__MEMBER_CONTENT_PARSED:
				return isMemberContentParsed();
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
			case AsdocEPackage.ASDOC_TYPE__VISIBILITY:
				setVisibility((AvmVisibility)newValue);
				return;
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends AsdocMember>)newValue);
				return;
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				getExtendedInterfaces().addAll((Collection<? extends AvmTypeReference>)newValue);
				return;
			case AsdocEPackage.ASDOC_TYPE__MEMBER_CONTENT_PARSED:
				setMemberContentParsed((Boolean)newValue);
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
			case AsdocEPackage.ASDOC_TYPE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				getMembers().clear();
				return;
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				return;
			case AsdocEPackage.ASDOC_TYPE__MEMBER_CONTENT_PARSED:
				setMemberContentParsed(MEMBER_CONTENT_PARSED_EDEFAULT);
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
			case AsdocEPackage.ASDOC_TYPE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				return members != null && !members.isEmpty();
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_INTERFACES:
				return extendedInterfaces != null && !extendedInterfaces.isEmpty();
			case AsdocEPackage.ASDOC_TYPE__MEMBER_CONTENT_PARSED:
				return ((flags & MEMBER_CONTENT_PARSED_EFLAG) != 0) != MEMBER_CONTENT_PARSED_EDEFAULT;
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
		result.append(", memberContentParsed: ");
		result.append((flags & MEMBER_CONTENT_PARSED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getFullUri() {
		EObject container = eContainer();
		if (container instanceof AsdocPackage) {
			AsdocPackage pack = (AsdocPackage) container;
			String fullUri = pack.getFullUri();
			if (fullUri != null)
				return fullUri + getName() +".html";
		}
		return null;
	}

} //AsdocTypeImpl
