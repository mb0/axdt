/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocParameter#isRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocParameter()
 * @model
 * @generated
 */
public interface AsdocParameter extends AsdocDefinition, AvmParameter {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AvmTypeReference)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocParameter_Type()
	 * @model containment="true"
	 * @generated
	 */
	AvmTypeReference getType();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' attribute.
	 * @see #setRest(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocParameter_Rest()
	 * @model
	 * @generated
	 */
	boolean isRest();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocParameter#isRest <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' attribute.
	 * @see #isRest()
	 * @generated
	 */
	void setRest(boolean value);

} // AsdocParameter
