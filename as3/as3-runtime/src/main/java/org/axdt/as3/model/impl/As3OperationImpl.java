/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import java.lang.Iterable;
import java.util.Collection;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Block;
import org.axdt.as3.model.As3Executable;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Parameter;
import org.axdt.as3.model.IDirective;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#isGetter <em>Getter</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#isSetter <em>Setter</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3OperationImpl#isNative <em>Native</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3OperationImpl extends As3MemberImpl implements As3Operation {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<As3Parameter> parameters;

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
	protected static final int OVERRIDE_EFLAG = 1 << 1;

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
	 * The default value of the '{@link #isGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGetter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GETTER_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGetter()
	 * @generated
	 * @ordered
	 */
	protected static final int GETTER_EFLAG = 1 << 3;

	/**
	 * The default value of the '{@link #isSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SETTER_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetter()
	 * @generated
	 * @ordered
	 */
	protected static final int SETTER_EFLAG = 1 << 4;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected As3Block body;

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
	protected static final int NATIVE_EFLAG = 1 << 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_OPERATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__RETURN_TYPE, oldReturnType, newReturnType);
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
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_OPERATION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_OPERATION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(As3Block newBody, NotificationChain msgs) {
		As3Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(As3Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_OPERATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_OPERATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__BODY, newBody, newBody));
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
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__OVERRIDE, oldOverride, newOverride));
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
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__FINAL, oldFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGetter() {
		return (flags & GETTER_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetter(boolean newGetter) {
		boolean oldGetter = (flags & GETTER_EFLAG) != 0;
		if (newGetter) flags |= GETTER_EFLAG; else flags &= ~GETTER_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__GETTER, oldGetter, newGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetter() {
		return (flags & SETTER_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetter(boolean newSetter) {
		boolean oldSetter = (flags & SETTER_EFLAG) != 0;
		if (newSetter) flags |= SETTER_EFLAG; else flags &= ~SETTER_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__SETTER, oldSetter, newSetter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_OPERATION__NATIVE, oldNative, newNative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Iterable<AvmReferable> getDeclarations() {
		if (body != null)
			return Lists.newArrayList(Iterators.filter(
				EcoreUtil.getAllProperContents(body, false),
				AvmReferable.class
			));
		return Iterables.emptyIterable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Iterable<IDirective> getDirectives() {
		if (body != null)
			return body.getDirectives();
		return Iterables.emptyIterable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<As3Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<As3Parameter>(As3Parameter.class, this, As3EPackage.AS3_OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_OPERATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case As3EPackage.AS3_OPERATION__BODY:
				return basicSetBody(null, msgs);
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
			case As3EPackage.AS3_OPERATION__PARAMETERS:
				return getParameters();
			case As3EPackage.AS3_OPERATION__OVERRIDE:
				return isOverride();
			case As3EPackage.AS3_OPERATION__FINAL:
				return isFinal();
			case As3EPackage.AS3_OPERATION__GETTER:
				return isGetter();
			case As3EPackage.AS3_OPERATION__SETTER:
				return isSetter();
			case As3EPackage.AS3_OPERATION__RETURN_TYPE:
				return getReturnType();
			case As3EPackage.AS3_OPERATION__BODY:
				return getBody();
			case As3EPackage.AS3_OPERATION__NATIVE:
				return isNative();
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
			case As3EPackage.AS3_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends As3Parameter>)newValue);
				return;
			case As3EPackage.AS3_OPERATION__OVERRIDE:
				setOverride((Boolean)newValue);
				return;
			case As3EPackage.AS3_OPERATION__FINAL:
				setFinal((Boolean)newValue);
				return;
			case As3EPackage.AS3_OPERATION__GETTER:
				setGetter((Boolean)newValue);
				return;
			case As3EPackage.AS3_OPERATION__SETTER:
				setSetter((Boolean)newValue);
				return;
			case As3EPackage.AS3_OPERATION__RETURN_TYPE:
				setReturnType((AvmTypeReference)newValue);
				return;
			case As3EPackage.AS3_OPERATION__BODY:
				setBody((As3Block)newValue);
				return;
			case As3EPackage.AS3_OPERATION__NATIVE:
				setNative((Boolean)newValue);
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
			case As3EPackage.AS3_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case As3EPackage.AS3_OPERATION__OVERRIDE:
				setOverride(OVERRIDE_EDEFAULT);
				return;
			case As3EPackage.AS3_OPERATION__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case As3EPackage.AS3_OPERATION__GETTER:
				setGetter(GETTER_EDEFAULT);
				return;
			case As3EPackage.AS3_OPERATION__SETTER:
				setSetter(SETTER_EDEFAULT);
				return;
			case As3EPackage.AS3_OPERATION__RETURN_TYPE:
				setReturnType((AvmTypeReference)null);
				return;
			case As3EPackage.AS3_OPERATION__BODY:
				setBody((As3Block)null);
				return;
			case As3EPackage.AS3_OPERATION__NATIVE:
				setNative(NATIVE_EDEFAULT);
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
			case As3EPackage.AS3_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case As3EPackage.AS3_OPERATION__OVERRIDE:
				return ((flags & OVERRIDE_EFLAG) != 0) != OVERRIDE_EDEFAULT;
			case As3EPackage.AS3_OPERATION__FINAL:
				return ((flags & FINAL_EFLAG) != 0) != FINAL_EDEFAULT;
			case As3EPackage.AS3_OPERATION__GETTER:
				return ((flags & GETTER_EFLAG) != 0) != GETTER_EDEFAULT;
			case As3EPackage.AS3_OPERATION__SETTER:
				return ((flags & SETTER_EFLAG) != 0) != SETTER_EDEFAULT;
			case As3EPackage.AS3_OPERATION__RETURN_TYPE:
				return returnType != null;
			case As3EPackage.AS3_OPERATION__BODY:
				return body != null;
			case As3EPackage.AS3_OPERATION__NATIVE:
				return ((flags & NATIVE_EFLAG) != 0) != NATIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AvmExecutable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == As3Executable.class) {
			switch (derivedFeatureID) {
				case As3EPackage.AS3_OPERATION__PARAMETERS: return As3EPackage.AS3_EXECUTABLE__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == AvmOperation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AvmExecutable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == As3Executable.class) {
			switch (baseFeatureID) {
				case As3EPackage.AS3_EXECUTABLE__PARAMETERS: return As3EPackage.AS3_OPERATION__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == AvmOperation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (override: ");
		result.append((flags & OVERRIDE_EFLAG) != 0);
		result.append(", final: ");
		result.append((flags & FINAL_EFLAG) != 0);
		result.append(", getter: ");
		result.append((flags & GETTER_EFLAG) != 0);
		result.append(", setter: ");
		result.append((flags & SETTER_EFLAG) != 0);
		result.append(", native: ");
		result.append((flags & NATIVE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //As3OperationImpl
