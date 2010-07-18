/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3LogicalExpression;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3LogicalExpressionImpl extends As3BinaryExpressionImpl implements As3LogicalExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3LogicalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_LOGICAL_EXPRESSION;
	}

	@Override
	public AvmType resolveType() {
		if (left != null && right != null) {
			AvmType leftType = left.resolveType();
			AvmType rightType = right.resolveType();
			if (leftType != null && leftType.equals(rightType))
				return rightType;
			// TODO find common super type and generalize
			return AvmEFactory.eINSTANCE.createAvmGeneric();
		}
		return AvmEFactory.eINSTANCE.createAvmNull();
	}
} //As3LogicalExpressionImpl
