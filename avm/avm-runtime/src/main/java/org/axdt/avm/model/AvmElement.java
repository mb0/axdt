/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avm Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmElement#getAsdoc <em>Asdoc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.avm.AvmEPackage#getAvmElement()
 * @model abstract="true"
 * @generated
 */
public interface AvmElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asdoc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asdoc</em>' attribute.
	 * @see #setAsdoc(String)
	 * @see org.axdt.avm.AvmEPackage#getAvmElement_Asdoc()
	 * @model
	 * @generated
	 */
	String getAsdoc();

	/**
	 * Sets the value of the '{@link org.axdt.avm.model.AvmElement#getAsdoc <em>Asdoc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asdoc</em>' attribute.
	 * @see #getAsdoc()
	 * @generated
	 */
	void setAsdoc(String value);

} // AvmElement
