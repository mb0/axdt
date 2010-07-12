/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import org.axdt.avm.model.AvmPackage;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Package#getDirectives <em>Directives</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Package#getCanonicalName <em>Canonical Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3Package()
 * @generated
 */
public interface As3Package extends As3Identifiable, AvmPackage {
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
	 * @see org.axdt.as3.As3EPackage#getAs3Package_Directives()
	 * @generated
	 */
	EList<IDirective> getDirectives();

	/**
	 * Returns the value of the '<em><b>Canonical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonical Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonical Name</em>' attribute.
	 * @see #setCanonicalName(String)
	 * @see org.axdt.as3.As3EPackage#getAs3Package_CanonicalName()
	 * @generated
	 */
	String getCanonicalName();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Package#getCanonicalName <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical Name</em>' attribute.
	 * @see #getCanonicalName()
	 * @generated
	 */
	void setCanonicalName(String value);

} // As3Package
