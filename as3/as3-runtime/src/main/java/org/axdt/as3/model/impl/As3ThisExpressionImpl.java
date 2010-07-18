/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3FunctionExpression;
import org.axdt.as3.model.As3ThisExpression;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 This Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3ThisExpressionImpl extends IExpressionImpl implements As3ThisExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ThisExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_THIS_EXPRESSION;
	}

	@Override
	public AvmType resolveType() {
		EObject current = eContainer();
		while (current != null) {
			if (current instanceof As3FunctionExpression)
				return AvmEFactory.eINSTANCE.createAvmGeneric();
			if (current instanceof AvmType)
				return (AvmType) current; 
			current = current.eContainer();
		}
		return AvmEFactory.eINSTANCE.createAvmNull();
	}

} //As3ThisExpressionImpl
