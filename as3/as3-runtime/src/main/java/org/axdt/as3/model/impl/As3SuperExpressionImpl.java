/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3SuperExpression;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Super Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3SuperExpressionImpl extends IExpressionImpl implements As3SuperExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3SuperExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_SUPER_EXPRESSION;
	}

	@Override
	public AvmTypeAccess resolveType() {
		EObject current = eContainer();
		while (current != null) {
			if (current instanceof AvmDeclaredType) {
				AvmTypeReference extended = ((AvmDeclaredType) current).getExtendedClass();
				if (extended == null)
					break;
				return AvmTypeAccess.Factory.superAccess(extended.getType()); 
			}
			current = current.eContainer();
		}
		return AvmTypeAccess.NULL;
	}
} //As3SuperExpressionImpl
