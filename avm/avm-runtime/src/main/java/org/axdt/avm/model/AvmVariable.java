/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.avm.AvmEPackage#getAvmVariable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AvmVariable extends AvmReferable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AvmTypeReference getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

} // AvmVariable
