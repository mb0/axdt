/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3TypeOfExpression;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Type Of Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3TypeOfExpressionImpl extends As3UnaryExpressionImpl implements As3TypeOfExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3TypeOfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_TYPE_OF_EXPRESSION;
	}

	@Override
	public AvmType resolveType() {
		return getClassProxy("String");
	}
} //As3TypeOfExpressionImpl
