/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model.impl;

import java.util.Collection;
import java.util.List;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocType;
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
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#getExtendedClass <em>Extended Class</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocTypeImpl#isMemberContentParsed <em>Member Content Parsed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsdocTypeImpl extends AsdocDefinitionImpl implements AsdocType {
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
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERFACE_EFLAG = 1 << 0;

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
	protected static final int DYNAMIC_EFLAG = 1 << 1;

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
	protected static final int FINAL_EFLAG = 1 << 2;

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
	 * The cached value of the '{@link #getExtendedClass() <em>Extended Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected AvmTypeReference extendedClass;

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
	protected static final int MEMBER_CONTENT_PARSED_EFLAG = 1 << 3;

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
	 * @generated
	 */
	public boolean isInterface() {
		return (flags & INTERFACE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(boolean newInterface) {
		boolean oldInterface = (flags & INTERFACE_EFLAG) != 0;
		if (newInterface) flags |= INTERFACE_EFLAG; else flags &= ~INTERFACE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_TYPE__INTERFACE, oldInterface, newInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_TYPE__DYNAMIC, oldDynamic, newDynamic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_TYPE__FINAL, oldFinal, newFinal));
	}

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS, oldExtendedClass, newExtendedClass);
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
				msgs = ((InternalEObject)extendedClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS, null, msgs);
			if (newExtendedClass != null)
				msgs = ((InternalEObject)newExtendedClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS, null, msgs);
			msgs = basicSetExtendedClass(newExtendedClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS, newExtendedClass, newExtendedClass));
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
	 * @generated NOT
	 */
	public boolean isClass() {
		return !isInterface();
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
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS:
				return basicSetExtendedClass(null, msgs);
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
			case AsdocEPackage.ASDOC_TYPE__INTERFACE:
				return isInterface();
			case AsdocEPackage.ASDOC_TYPE__DYNAMIC:
				return isDynamic();
			case AsdocEPackage.ASDOC_TYPE__FINAL:
				return isFinal();
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				return getMembers();
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS:
				return getExtendedClass();
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
			case AsdocEPackage.ASDOC_TYPE__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_TYPE__DYNAMIC:
				setDynamic((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_TYPE__FINAL:
				setFinal((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends AsdocMember>)newValue);
				return;
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS:
				setExtendedClass((AvmTypeReference)newValue);
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
			case AsdocEPackage.ASDOC_TYPE__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_TYPE__DYNAMIC:
				setDynamic(DYNAMIC_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_TYPE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				getMembers().clear();
				return;
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS:
				setExtendedClass((AvmTypeReference)null);
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
			case AsdocEPackage.ASDOC_TYPE__INTERFACE:
				return ((flags & INTERFACE_EFLAG) != 0) != INTERFACE_EDEFAULT;
			case AsdocEPackage.ASDOC_TYPE__DYNAMIC:
				return ((flags & DYNAMIC_EFLAG) != 0) != DYNAMIC_EDEFAULT;
			case AsdocEPackage.ASDOC_TYPE__FINAL:
				return ((flags & FINAL_EFLAG) != 0) != FINAL_EDEFAULT;
			case AsdocEPackage.ASDOC_TYPE__MEMBERS:
				return members != null && !members.isEmpty();
			case AsdocEPackage.ASDOC_TYPE__EXTENDED_CLASS:
				return extendedClass != null;
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
		result.append(", interface: ");
		result.append((flags & INTERFACE_EFLAG) != 0);
		result.append(", dynamic: ");
		result.append((flags & DYNAMIC_EFLAG) != 0);
		result.append(", final: ");
		result.append((flags & FINAL_EFLAG) != 0);
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
