/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3SimpleAttributeExpression;
import org.axdt.as3.model.IIdentifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Simple Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3SimpleAttributeExpressionImpl#getIdent <em>Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3SimpleAttributeExpressionImpl extends As3AttributeExpressionImpl implements As3SimpleAttributeExpression {
	/**
	 * The cached value of the '{@link #getIdent() <em>Ident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent()
	 * @generated
	 * @ordered
	 */
	protected IIdentifier ident;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3SimpleAttributeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_SIMPLE_ATTRIBUTE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIdentifier getIdent() {
		return ident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdent(IIdentifier newIdent, NotificationChain msgs) {
		IIdentifier oldIdent = ident;
		ident = newIdent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT, oldIdent, newIdent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdent(IIdentifier newIdent) {
		if (newIdent != ident) {
			NotificationChain msgs = null;
			if (ident != null)
				msgs = ((InternalEObject)ident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT, null, msgs);
			if (newIdent != null)
				msgs = ((InternalEObject)newIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT, null, msgs);
			msgs = basicSetIdent(newIdent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT, newIdent, newIdent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT:
				return basicSetIdent(null, msgs);
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
			case As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT:
				return getIdent();
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
			case As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT:
				setIdent((IIdentifier)newValue);
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
			case As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT:
				setIdent((IIdentifier)null);
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
			case As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT:
				return ident != null;
		}
		return super.eIsSet(featureID);
	}

} //As3SimpleAttributeExpressionImpl
