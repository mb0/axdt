/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asdoc Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocClass#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocClass#isFinal <em>Final</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocClass#getExtendedClass <em>Extended Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocClass()
 * @model
 * @generated
 */
public interface AsdocClass extends AsdocType {
	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocClass_Dynamic()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocClass#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocClass_Final()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocClass#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Extended Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class</em>' containment reference.
	 * @see #setExtendedClass(AvmTypeReference)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocClass_ExtendedClass()
	 * @model containment="true"
	 * @generated
	 */
	AvmTypeReference getExtendedClass();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocClass#getExtendedClass <em>Extended Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class</em>' containment reference.
	 * @see #getExtendedClass()
	 * @generated
	 */
	void setExtendedClass(AvmTypeReference value);

} // AsdocClass
