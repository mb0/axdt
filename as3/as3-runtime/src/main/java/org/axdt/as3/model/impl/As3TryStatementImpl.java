/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import java.util.Collection;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Block;
import org.axdt.as3.model.As3CatchClause;
import org.axdt.as3.model.As3TryStatement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3TryStatementImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3TryStatementImpl#getCatches <em>Catches</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3TryStatementImpl#getFinalBlock <em>Final Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3TryStatementImpl extends MinimalEObjectImpl.Container implements As3TryStatement {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int flags = 0;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected As3Block block;

	/**
	 * The cached value of the '{@link #getCatches() <em>Catches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatches()
	 * @generated
	 * @ordered
	 */
	protected EList<As3CatchClause> catches;

	/**
	 * The cached value of the '{@link #getFinalBlock() <em>Final Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalBlock()
	 * @generated
	 * @ordered
	 */
	protected As3Block finalBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_TRY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Block getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(As3Block newBlock, NotificationChain msgs) {
		As3Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_TRY_STATEMENT__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(As3Block newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_TRY_STATEMENT__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_TRY_STATEMENT__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_TRY_STATEMENT__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<As3CatchClause> getCatches() {
		if (catches == null) {
			catches = new EObjectContainmentEList<As3CatchClause>(As3CatchClause.class, this, As3EPackage.AS3_TRY_STATEMENT__CATCHES);
		}
		return catches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Block getFinalBlock() {
		return finalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalBlock(As3Block newFinalBlock, NotificationChain msgs) {
		As3Block oldFinalBlock = finalBlock;
		finalBlock = newFinalBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK, oldFinalBlock, newFinalBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalBlock(As3Block newFinalBlock) {
		if (newFinalBlock != finalBlock) {
			NotificationChain msgs = null;
			if (finalBlock != null)
				msgs = ((InternalEObject)finalBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK, null, msgs);
			if (newFinalBlock != null)
				msgs = ((InternalEObject)newFinalBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK, null, msgs);
			msgs = basicSetFinalBlock(newFinalBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK, newFinalBlock, newFinalBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_TRY_STATEMENT__BLOCK:
				return basicSetBlock(null, msgs);
			case As3EPackage.AS3_TRY_STATEMENT__CATCHES:
				return ((InternalEList<?>)getCatches()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK:
				return basicSetFinalBlock(null, msgs);
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
			case As3EPackage.AS3_TRY_STATEMENT__BLOCK:
				return getBlock();
			case As3EPackage.AS3_TRY_STATEMENT__CATCHES:
				return getCatches();
			case As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK:
				return getFinalBlock();
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
			case As3EPackage.AS3_TRY_STATEMENT__BLOCK:
				setBlock((As3Block)newValue);
				return;
			case As3EPackage.AS3_TRY_STATEMENT__CATCHES:
				getCatches().clear();
				getCatches().addAll((Collection<? extends As3CatchClause>)newValue);
				return;
			case As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK:
				setFinalBlock((As3Block)newValue);
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
			case As3EPackage.AS3_TRY_STATEMENT__BLOCK:
				setBlock((As3Block)null);
				return;
			case As3EPackage.AS3_TRY_STATEMENT__CATCHES:
				getCatches().clear();
				return;
			case As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK:
				setFinalBlock((As3Block)null);
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
			case As3EPackage.AS3_TRY_STATEMENT__BLOCK:
				return block != null;
			case As3EPackage.AS3_TRY_STATEMENT__CATCHES:
				return catches != null && !catches.isEmpty();
			case As3EPackage.AS3_TRY_STATEMENT__FINAL_BLOCK:
				return finalBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //As3TryStatementImpl
