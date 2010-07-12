/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Conditional Iteration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ConditionalIterationStatement#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3ConditionalIterationStatement()
 * @generated
 */
public interface As3ConditionalIterationStatement extends As3IterationStatement {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(As3ExpressionList)
	 * @see org.axdt.as3.As3EPackage#getAs3ConditionalIterationStatement_Conditions()
	 * @generated
	 */
	As3ExpressionList getConditions();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ConditionalIterationStatement#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(As3ExpressionList value);

} // As3ConditionalIterationStatement
