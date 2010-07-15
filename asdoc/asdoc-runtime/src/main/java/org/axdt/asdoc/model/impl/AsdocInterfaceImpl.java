/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocInterface;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asdoc Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AsdocInterfaceImpl extends AsdocTypeImpl implements AsdocInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_INTERFACE;
	}

	@Override
	public boolean isInterface() {
		return true;
	}

	@Override
	public boolean isDynamic() {
		return false;
	}

	@Override
	public boolean isFinal() {
		return false;
	}

	@Override
	public boolean isClass() {
		return false;
	}

} //AsdocInterfaceImpl
