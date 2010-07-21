/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Type#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Type#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3Type()
 * @generated
 */
public interface As3Type extends As3Definition, AvmDeclaredType, IPackageDirective {
	/**
	 * Returns the value of the '<em><b>Extended Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.avm.model.AvmTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Interfaces</em>' containment reference list.
	 * @see org.axdt.as3.As3EPackage#getAs3Type_ExtendedInterfaces()
	 * @generated
	 */
	EList<AvmTypeReference> getExtendedInterfaces();

	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.as3.model.IDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference list.
	 * @see org.axdt.as3.As3EPackage#getAs3Type_Directives()
	 * @generated
	 */
	EList<IDirective> getDirectives();

} // As3Type
