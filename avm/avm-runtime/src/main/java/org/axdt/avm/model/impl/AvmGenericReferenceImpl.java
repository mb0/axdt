/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model.impl;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.AvmGeneric;
import org.axdt.avm.model.AvmGenericReference;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avm Generic Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AvmGenericReferenceImpl extends AvmTypeReferenceImpl implements AvmGenericReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmGenericReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvmEPackage.Literals.AVM_GENERIC_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmGeneric getType() {
		return AvmEFactory.eINSTANCE.createAvmGeneric(); 
	}
} //AvmGenericReferenceImpl
