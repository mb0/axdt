/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocRoot#getBaseUri <em>Base Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocRoot()
 * @model
 * @generated
 */
public interface AsdocRoot extends AsdocPackage {
	/**
	 * Returns the value of the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Uri</em>' attribute.
	 * @see #setBaseUri(String)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocRoot_BaseUri()
	 * @model
	 * @generated
	 */
	String getBaseUri();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocRoot#getBaseUri <em>Base Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Uri</em>' attribute.
	 * @see #getBaseUri()
	 * @generated
	 */
	void setBaseUri(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AsdocPackage getPackage(String fqn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AsdocPackage createPackage(String fqn);

} // AsdocRoot
