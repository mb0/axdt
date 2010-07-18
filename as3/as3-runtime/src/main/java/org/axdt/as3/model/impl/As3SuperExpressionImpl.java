/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3SuperExpression;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
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
	public AvmType resolveType() {
		EObject current = eContainer();
		while (current != null) {
			if (current instanceof AvmDeclaredType) {
				AvmTypeReference extended = ((AvmDeclaredType) current).getExtendedClass();
				if (extended == null)
					break;
				return extended.getType(); 
			}
			current = current.eContainer();
		}
		return AvmEFactory.eINSTANCE.createAvmNull();
	}
} //As3SuperExpressionImpl
