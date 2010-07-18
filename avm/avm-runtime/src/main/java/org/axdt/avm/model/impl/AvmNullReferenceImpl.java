/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model.impl;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.AvmNull;
import org.axdt.avm.model.AvmNullReference;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AvmNullReferenceImpl extends AvmTypeReferenceImpl implements AvmNullReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmNullReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvmEPackage.Literals.AVM_NULL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmNull getType() {
		return AvmEFactory.eINSTANCE.createAvmNull();
	}
} //AvmNullReferenceImpl
