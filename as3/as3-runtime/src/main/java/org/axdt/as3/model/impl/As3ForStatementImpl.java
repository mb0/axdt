/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3ExpressionList;
import org.axdt.as3.model.As3ForStatement;
import org.axdt.as3.model.IForInit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3ForStatementImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ForStatementImpl#getIter <em>Iter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3ForStatementImpl extends As3ConditionalIterationStatementImpl implements As3ForStatement {
	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected IForInit init;

	/**
	 * The cached value of the '{@link #getIter() <em>Iter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIter()
	 * @generated
	 * @ordered
	 */
	protected As3ExpressionList iter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IForInit getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(IForInit newInit, NotificationChain msgs) {
		IForInit oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_STATEMENT__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(IForInit newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_STATEMENT__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_STATEMENT__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_STATEMENT__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ExpressionList getIter() {
		return iter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIter(As3ExpressionList newIter, NotificationChain msgs) {
		As3ExpressionList oldIter = iter;
		iter = newIter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_STATEMENT__ITER, oldIter, newIter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIter(As3ExpressionList newIter) {
		if (newIter != iter) {
			NotificationChain msgs = null;
			if (iter != null)
				msgs = ((InternalEObject)iter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_STATEMENT__ITER, null, msgs);
			if (newIter != null)
				msgs = ((InternalEObject)newIter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_FOR_STATEMENT__ITER, null, msgs);
			msgs = basicSetIter(newIter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_FOR_STATEMENT__ITER, newIter, newIter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_FOR_STATEMENT__INIT:
				return basicSetInit(null, msgs);
			case As3EPackage.AS3_FOR_STATEMENT__ITER:
				return basicSetIter(null, msgs);
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
			case As3EPackage.AS3_FOR_STATEMENT__INIT:
				return getInit();
			case As3EPackage.AS3_FOR_STATEMENT__ITER:
				return getIter();
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
			case As3EPackage.AS3_FOR_STATEMENT__INIT:
				setInit((IForInit)newValue);
				return;
			case As3EPackage.AS3_FOR_STATEMENT__ITER:
				setIter((As3ExpressionList)newValue);
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
			case As3EPackage.AS3_FOR_STATEMENT__INIT:
				setInit((IForInit)null);
				return;
			case As3EPackage.AS3_FOR_STATEMENT__ITER:
				setIter((As3ExpressionList)null);
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
			case As3EPackage.AS3_FOR_STATEMENT__INIT:
				return init != null;
			case As3EPackage.AS3_FOR_STATEMENT__ITER:
				return iter != null;
		}
		return super.eIsSet(featureID);
	}

} //As3ForStatementImpl
