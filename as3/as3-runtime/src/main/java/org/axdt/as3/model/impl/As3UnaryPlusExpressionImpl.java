/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3UnaryPlusExpression;
import org.axdt.as3.util.As3TypeAccessUtil;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Unary Plus Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3UnaryPlusExpressionImpl extends As3UnaryExpressionImpl implements As3UnaryPlusExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3UnaryPlusExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_UNARY_PLUS_EXPRESSION;
	}

	@Override
	public AvmTypeAccess resolveType() {
		return As3TypeAccessUtil.global("Number");
	}
} //As3UnaryPlusExpressionImpl
