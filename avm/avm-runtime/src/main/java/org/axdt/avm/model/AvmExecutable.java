/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avm Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.avm.AvmEPackage#getAvmExecutable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AvmExecutable extends AvmIdentifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	<T extends AvmParameter> EList<T> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AvmTypeReference getReturnType();

} // AvmExecutable
