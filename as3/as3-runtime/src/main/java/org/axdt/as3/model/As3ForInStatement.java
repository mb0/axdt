/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 For In Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ForInStatement#getTarget <em>Target</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ForInStatement#getInit <em>Init</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3ForInStatement#isForEach <em>For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3ForInStatement()
 * @generated
 */
public interface As3ForInStatement extends As3IterationStatement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(As3ExpressionList)
	 * @see org.axdt.as3.As3EPackage#getAs3ForInStatement_Target()
	 * @generated
	 */
	As3ExpressionList getTarget();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ForInStatement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(As3ExpressionList value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(IForInInit)
	 * @see org.axdt.as3.As3EPackage#getAs3ForInStatement_Init()
	 * @generated
	 */
	IForInInit getInit();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ForInStatement#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(IForInInit value);

	/**
	 * Returns the value of the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Each</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Each</em>' attribute.
	 * @see #setForEach(boolean)
	 * @see org.axdt.as3.As3EPackage#getAs3ForInStatement_ForEach()
	 * @generated
	 */
	boolean isForEach();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3ForInStatement#isForEach <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' attribute.
	 * @see #isForEach()
	 * @generated
	 */
	void setForEach(boolean value);

} // As3ForInStatement
