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
import java.util.Collections;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Block;
import org.axdt.as3.model.As3Executable;
import org.axdt.as3.model.As3FunctionExpression;
import org.axdt.as3.model.As3Parameter;
import org.axdt.as3.model.IDirective;
import org.axdt.as3.model.IForInInit;
import org.axdt.as3.util.As3TypeAccessUtil;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3FunctionExpressionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FunctionExpressionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FunctionExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3FunctionExpressionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3FunctionExpressionImpl extends IExpressionImpl implements As3FunctionExpression {
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
	protected As3FunctionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_FUNCTION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<As3Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<As3Parameter>(As3Parameter.class, this, As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS);
		}
		return parameters;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE, oldReturnType, newReturnType);
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
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE, newReturnType, newReturnType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FUNCTION_EXPRESSION__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FUNCTION_EXPRESSION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FUNCTION_EXPRESSION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FUNCTION_EXPRESSION__BODY, newBody, newBody));
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
		return Collections.emptySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Iterable<IDirective> getDirectives() {
		if (body != null)
			return body.getDirectives();
		return Collections.emptySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		// TODO add optional function expression name
		return null;
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
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FUNCTION_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case As3EPackage.AS3_FUNCTION_EXPRESSION__BODY:
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
			case As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS:
				return getParameters();
			case As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE:
				return getReturnType();
			case As3EPackage.AS3_FUNCTION_EXPRESSION__BODY:
				return getBody();
			case As3EPackage.AS3_FUNCTION_EXPRESSION__NAME:
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
			case As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends As3Parameter>)newValue);
				return;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE:
				setReturnType((AvmTypeReference)newValue);
				return;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__BODY:
				setBody((As3Block)newValue);
				return;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__NAME:
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
			case As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS:
				getParameters().clear();
				return;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE:
				setReturnType((AvmTypeReference)null);
				return;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__BODY:
				setBody((As3Block)null);
				return;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__NAME:
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
			case As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case As3EPackage.AS3_FUNCTION_EXPRESSION__RETURN_TYPE:
				return returnType != null;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__BODY:
				return body != null;
			case As3EPackage.AS3_FUNCTION_EXPRESSION__NAME:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IForInInit.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AvmIdentifiable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AvmExecutable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == As3Executable.class) {
			switch (derivedFeatureID) {
				case As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS: return As3EPackage.AS3_EXECUTABLE__PARAMETERS;
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
		if (baseClass == IForInInit.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AvmIdentifiable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AvmExecutable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == As3Executable.class) {
			switch (baseFeatureID) {
				case As3EPackage.AS3_EXECUTABLE__PARAMETERS: return As3EPackage.AS3_FUNCTION_EXPRESSION__PARAMETERS;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}


	@Override
	public AvmTypeAccess resolveType() {
		return As3TypeAccessUtil.global("Function");
	}
} //As3FunctionExpressionImpl
