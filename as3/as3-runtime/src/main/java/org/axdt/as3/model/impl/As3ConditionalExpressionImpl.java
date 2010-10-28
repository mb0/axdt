/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3ConditionalExpression;
import org.axdt.as3.model.IExpression;
import org.axdt.as3.model.ILogicalExpression;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3ConditionalExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ConditionalExpressionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ConditionalExpressionImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3ConditionalExpressionImpl extends IExpressionImpl implements As3ConditionalExpression {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ILogicalExpression condition;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected IExpression statement;

	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected IExpression elseStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILogicalExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ILogicalExpression newCondition, NotificationChain msgs) {
		ILogicalExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ILogicalExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExpression getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(IExpression newStatement, NotificationChain msgs) {
		IExpression oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT, oldStatement, newStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(IExpression newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT, newStatement, newStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExpression getElseStatement() {
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseStatement(IExpression newElseStatement, NotificationChain msgs) {
		IExpression oldElseStatement = elseStatement;
		elseStatement = newElseStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT, oldElseStatement, newElseStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseStatement(IExpression newElseStatement) {
		if (newElseStatement != elseStatement) {
			NotificationChain msgs = null;
			if (elseStatement != null)
				msgs = ((InternalEObject)elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT, null, msgs);
			if (newElseStatement != null)
				msgs = ((InternalEObject)newElseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT, null, msgs);
			msgs = basicSetElseStatement(newElseStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT, newElseStatement, newElseStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION:
				return basicSetCondition(null, msgs);
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT:
				return basicSetStatement(null, msgs);
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT:
				return basicSetElseStatement(null, msgs);
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
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION:
				return getCondition();
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT:
				return getStatement();
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT:
				return getElseStatement();
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
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION:
				setCondition((ILogicalExpression)newValue);
				return;
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT:
				setStatement((IExpression)newValue);
				return;
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT:
				setElseStatement((IExpression)newValue);
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
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION:
				setCondition((ILogicalExpression)null);
				return;
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT:
				setStatement((IExpression)null);
				return;
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT:
				setElseStatement((IExpression)null);
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
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__CONDITION:
				return condition != null;
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__STATEMENT:
				return statement != null;
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT:
				return elseStatement != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public AvmTypeAccess resolveType() {
		if (statement != null && elseStatement != null) {
//			AvmTypeAccess ifType = statement.resolveType();
//			AvmTypeAccess elseType = elseStatement.resolveType();
//			if (ifType != null && ifType.equals(elseType))
//				return elseType;
			// TODO find common super type and generalize
			return AvmTypeAccess.GENERIC;
		}
		return AvmTypeAccess.NULL;
	}

} //As3ConditionalExpressionImpl
