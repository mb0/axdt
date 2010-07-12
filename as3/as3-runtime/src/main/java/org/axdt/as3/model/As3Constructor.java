/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import org.axdt.avm.model.AvmConstructor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Constructor#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3Constructor()
 * @generated
 */
public interface As3Constructor extends As3Member, As3Executable, AvmConstructor {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(As3Block)
	 * @see org.axdt.as3.As3EPackage#getAs3Constructor_Body()
	 * @generated
	 */
	As3Block getBody();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3Constructor#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(As3Block value);
} // As3Constructor
