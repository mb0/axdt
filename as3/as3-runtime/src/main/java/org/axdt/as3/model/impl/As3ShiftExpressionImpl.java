/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3ShiftExpression;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3ShiftExpressionImpl extends As3BinaryExpressionImpl implements As3ShiftExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ShiftExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_SHIFT_EXPRESSION;
	}

	@Override
	public AvmType resolveType() {
		if (">>>".equals(getOperation()))
			return getClassProxy("uint");
		return getClassProxy("int");
	}
} //As3ShiftExpressionImpl
