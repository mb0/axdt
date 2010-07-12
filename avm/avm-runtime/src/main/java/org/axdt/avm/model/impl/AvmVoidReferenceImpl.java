/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model.impl;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.AvmVoid;
import org.axdt.avm.model.AvmVoidReference;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avm Void Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AvmVoidReferenceImpl extends AvmTypeReferenceImpl implements AvmVoidReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmVoidReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvmEPackage.Literals.AVM_VOID_REFERENCE;
	}

	protected static AvmVoid cachedType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AvmVoid getType() {
		if (cachedType == null)
			cachedType = AvmEFactory.eINSTANCE.createAvmVoid();
		return cachedType;
	}

} //AvmVoidReferenceImpl
