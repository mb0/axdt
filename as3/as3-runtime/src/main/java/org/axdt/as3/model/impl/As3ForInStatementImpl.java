/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3ExpressionList;
import org.axdt.as3.model.As3ForInStatement;
import org.axdt.as3.model.IForInInit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 For In Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3ForInStatementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ForInStatementImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ForInStatementImpl#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3ForInStatementImpl extends As3IterationStatementImpl implements As3ForInStatement {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected As3ExpressionList target;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected IForInInit init;

	/**
	 * The default value of the '{@link #isForEach() <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForEach()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_EACH_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isForEach() <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForEach()
	 * @generated
	 * @ordered
	 */
	protected static final int FOR_EACH_EFLAG = 1 << 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ForInStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_FOR_IN_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ExpressionList getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(As3ExpressionList newTarget, NotificationChain msgs) {
		As3ExpressionList oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_IN_STATEMENT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(As3ExpressionList newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_IN_STATEMENT__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_IN_STATEMENT__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_IN_STATEMENT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IForInInit getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(IForInInit newInit, NotificationChain msgs) {
		IForInInit oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_IN_STATEMENT__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(IForInInit newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_IN_STATEMENT__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_IN_STATEMENT__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_IN_STATEMENT__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForEach() {
		return (flags & FOR_EACH_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForEach(boolean newForEach) {
		boolean oldForEach = (flags & FOR_EACH_EFLAG) != 0;
		if (newForEach) flags |= FOR_EACH_EFLAG; else flags &= ~FOR_EACH_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_IN_STATEMENT__FOR_EACH, oldForEach, newForEach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_FOR_IN_STATEMENT__TARGET:
				return basicSetTarget(null, msgs);
			case As3EPackage.AS3_FOR_IN_STATEMENT__INIT:
				return basicSetInit(null, msgs);
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
			case As3EPackage.AS3_FOR_IN_STATEMENT__TARGET:
				return getTarget();
			case As3EPackage.AS3_FOR_IN_STATEMENT__INIT:
				return getInit();
			case As3EPackage.AS3_FOR_IN_STATEMENT__FOR_EACH:
				return isForEach();
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
			case As3EPackage.AS3_FOR_IN_STATEMENT__TARGET:
				setTarget((As3ExpressionList)newValue);
				return;
			case As3EPackage.AS3_FOR_IN_STATEMENT__INIT:
				setInit((IForInInit)newValue);
				return;
			case As3EPackage.AS3_FOR_IN_STATEMENT__FOR_EACH:
				setForEach((Boolean)newValue);
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
			case As3EPackage.AS3_FOR_IN_STATEMENT__TARGET:
				setTarget((As3ExpressionList)null);
				return;
			case As3EPackage.AS3_FOR_IN_STATEMENT__INIT:
				setInit((IForInInit)null);
				return;
			case As3EPackage.AS3_FOR_IN_STATEMENT__FOR_EACH:
				setForEach(FOR_EACH_EDEFAULT);
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
			case As3EPackage.AS3_FOR_IN_STATEMENT__TARGET:
				return target != null;
			case As3EPackage.AS3_FOR_IN_STATEMENT__INIT:
				return init != null;
			case As3EPackage.AS3_FOR_IN_STATEMENT__FOR_EACH:
				return ((flags & FOR_EACH_EFLAG) != 0) != FOR_EACH_EDEFAULT;
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
		result.append(" (forEach: ");
		result.append((flags & FOR_EACH_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //As3ForInStatementImpl
