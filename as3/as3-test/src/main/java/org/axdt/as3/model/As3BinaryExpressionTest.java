/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 */
public abstract class As3BinaryExpressionTest extends IExpressionTest {

	/**
	 * Constructs a new As3 Binary Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3BinaryExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Binary Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3BinaryExpression getFixture() {
		return (As3BinaryExpression)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IExpression#resolveType()
	 */
	public abstract void testResolveType();

} //As3BinaryExpressionTest
