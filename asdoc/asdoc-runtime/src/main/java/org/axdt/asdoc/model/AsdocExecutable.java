/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmExecutable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocExecutable#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocExecutable()
 * @model abstract="true"
 * @generated
 */
public interface AsdocExecutable extends AsdocMember, AvmExecutable {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.asdoc.model.AsdocParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocExecutable_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	EList<AsdocParameter> getParameters();

} // AsdocExecutable
