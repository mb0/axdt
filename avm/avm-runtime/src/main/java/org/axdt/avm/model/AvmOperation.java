/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avm Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.avm.AvmEPackage#getAvmOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AvmOperation extends AvmMember, AvmExecutable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isNative();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOverride();

} // AvmOperation
