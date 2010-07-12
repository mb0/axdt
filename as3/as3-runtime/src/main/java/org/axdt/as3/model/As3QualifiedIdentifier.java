/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Qualified Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3QualifiedIdentifier#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3QualifiedIdentifier#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3QualifiedIdentifier()
 * @generated
 */
public interface As3QualifiedIdentifier extends IIdentifier {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference.
	 * @see #setExpressions(As3ExpressionList)
	 * @see org.axdt.as3.As3EPackage#getAs3QualifiedIdentifier_Expressions()
	 * @generated
	 */
	As3ExpressionList getExpressions();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3QualifiedIdentifier#getExpressions <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions</em>' containment reference.
	 * @see #getExpressions()
	 * @generated
	 */
	void setExpressions(As3ExpressionList value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IIdentifier)
	 * @see org.axdt.as3.As3EPackage#getAs3QualifiedIdentifier_Identifier()
	 * @generated
	 */
	IIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3QualifiedIdentifier#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IIdentifier value);

} // As3QualifiedIdentifier
