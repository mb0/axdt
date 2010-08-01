/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3AdditiveExpression;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3AdditiveExpressionImpl extends As3BinaryExpressionImpl implements As3AdditiveExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3AdditiveExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_ADDITIVE_EXPRESSION;
	}
	
	@Override
	public AvmType resolveType() {
		if ("+".equals(operation)) {
			if (left != null) {
				AvmType operandType = left.resolveType();
				if (checkTypeName(operandType, "String", "XML","XMLList"))
					return operandType;
			}
			if (right != null) {
				AvmType operandType = right.resolveType();
				if (checkTypeName(operandType, "String", "XML","XMLList"))
					return operandType;
			}
		}
		return getClassProxy("Number");
	}
} //As3AdditiveExpressionImpl
