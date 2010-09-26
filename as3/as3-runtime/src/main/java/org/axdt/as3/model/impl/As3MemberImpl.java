/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Attributes;
import org.axdt.as3.model.As3Member;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class As3MemberImpl extends As3DefinitionImpl implements As3Member {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isStatic() {
		As3Attributes attris = getAttributes();
		return attris != null ? attris.isStatic() : false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmVisibility getVisibility() {
		return super.getVisibility();
	}

	public boolean isFinal() {
		As3Attributes attris = getAttributes();
		return attris != null ? attris.isFinal() : false;
	}
	

	public boolean isOverride() {
		As3Attributes attris = getAttributes();
		return attris != null ? attris.isOverride() : false;
	}
	
	public boolean isNative() {
		As3Attributes attris = getAttributes();
		return attris != null ? attris.isNative() : false;
	}
} //As3MemberImpl
