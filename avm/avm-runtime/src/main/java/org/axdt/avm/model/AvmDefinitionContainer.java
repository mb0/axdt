/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avm Definitition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.avm.AvmEPackage#getAvmDefinitionContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AvmDefinitionContainer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.axdt.avm.model.List<T>" many="false"
	 * @generated
	 */
	<T extends AvmDeclaredType> List<T> getTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.axdt.avm.model.List<T>" many="false"
	 * @generated
	 */
	<T extends AvmMember> List<T> getMembers();

} // AvmDefinitionContainer
