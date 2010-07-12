/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmElement;
import org.axdt.avm.model.AvmIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocElement()
 * @model abstract="true"
 * @generated
 */
public interface AsdocElement extends AvmElement, AvmIdentifiable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullUri();
} // AsdocElement
