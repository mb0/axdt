/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avm Field</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.avm.AvmEPackage#getAvmField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AvmField extends AvmMember, AvmVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AvmTypeReference getType();

} // AvmField
