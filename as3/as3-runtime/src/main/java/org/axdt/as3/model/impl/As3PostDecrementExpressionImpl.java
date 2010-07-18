/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3PostDecrementExpression;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Post Decrement Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3PostDecrementExpressionImpl extends As3PostfixExpressionImpl implements As3PostDecrementExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3PostDecrementExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_POST_DECREMENT_EXPRESSION;
	}

	@Override
	public AvmType resolveType() {
		return getClassProxy("Number");
	}
} //As3PostDecrementExpressionImpl
