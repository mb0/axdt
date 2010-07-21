/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import java.util.Collection;
import java.util.List;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Member;
import org.axdt.as3.model.As3Type;
import org.axdt.as3.model.IDirective;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3TypeImpl#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3TypeImpl#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class As3TypeImpl extends As3DefinitionImpl implements As3Type {
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
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<IDirective> directives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvmTypeReference> getExtendedInterfaces() {
		if (extendedInterfaces == null) {
			extendedInterfaces = new EObjectContainmentEList<AvmTypeReference>(AvmTypeReference.class, this, As3EPackage.AS3_TYPE__EXTENDED_INTERFACES);
		}
		return extendedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IDirective> getDirectives() {
		if (directives == null) {
			directives = new EObjectContainmentEList<IDirective>(IDirective.class, this, As3EPackage.AS3_TYPE__DIRECTIVES);
		}
		return directives;
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
	 */
	public AvmTypeReference getExtendedClass() {
		return null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings("unchecked")
	public List<As3Member> getMembers() {
		return internalGetMembers(getDirectives());
 	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isDynamic() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isFinal() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isInterface() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isClass() {
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
			case As3EPackage.AS3_TYPE__EXTENDED_INTERFACES:
				return ((InternalEList<?>)getExtendedInterfaces()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_TYPE__DIRECTIVES:
				return ((InternalEList<?>)getDirectives()).basicRemove(otherEnd, msgs);
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
			case As3EPackage.AS3_TYPE__EXTENDED_INTERFACES:
				return getExtendedInterfaces();
			case As3EPackage.AS3_TYPE__DIRECTIVES:
				return getDirectives();
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
			case As3EPackage.AS3_TYPE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				getExtendedInterfaces().addAll((Collection<? extends AvmTypeReference>)newValue);
				return;
			case As3EPackage.AS3_TYPE__DIRECTIVES:
				getDirectives().clear();
				getDirectives().addAll((Collection<? extends IDirective>)newValue);
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
			case As3EPackage.AS3_TYPE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				return;
			case As3EPackage.AS3_TYPE__DIRECTIVES:
				getDirectives().clear();
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
			case As3EPackage.AS3_TYPE__EXTENDED_INTERFACES:
				return extendedInterfaces != null && !extendedInterfaces.isEmpty();
			case As3EPackage.AS3_TYPE__DIRECTIVES:
				return directives != null && !directives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //As3TypeImpl
