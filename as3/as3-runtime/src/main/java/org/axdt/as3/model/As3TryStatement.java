/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As3 Try Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3TryStatement#getBlock <em>Block</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3TryStatement#getCatches <em>Catches</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3TryStatement#getFinalBlock <em>Final Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.as3.As3EPackage#getAs3TryStatement()
 * @generated
 */
public interface As3TryStatement extends IStatement {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(As3Block)
	 * @see org.axdt.as3.As3EPackage#getAs3TryStatement_Block()
	 * @generated
	 */
	As3Block getBlock();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3TryStatement#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(As3Block value);

	/**
	 * Returns the value of the '<em><b>Catches</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.as3.model.As3CatchClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catches</em>' containment reference list.
	 * @see org.axdt.as3.As3EPackage#getAs3TryStatement_Catches()
	 * @generated
	 */
	EList<As3CatchClause> getCatches();

	/**
	 * Returns the value of the '<em><b>Final Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Block</em>' containment reference.
	 * @see #setFinalBlock(As3Block)
	 * @see org.axdt.as3.As3EPackage#getAs3TryStatement_FinalBlock()
	 * @generated
	 */
	As3Block getFinalBlock();

	/**
	 * Sets the value of the '{@link org.axdt.as3.model.As3TryStatement#getFinalBlock <em>Final Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Block</em>' containment reference.
	 * @see #getFinalBlock()
	 * @generated
	 */
	void setFinalBlock(As3Block value);

} // As3TryStatement
