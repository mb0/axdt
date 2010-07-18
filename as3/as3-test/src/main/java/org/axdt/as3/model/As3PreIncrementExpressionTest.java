/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Pre Increment Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3PreIncrementExpressionTest extends As3UnaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3PreIncrementExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Pre Increment Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PreIncrementExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Pre Increment Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3PreIncrementExpression getFixture() {
		return (As3PreIncrementExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3PreIncrementExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	@Override
	public void testResolveType() {
		assertProxyType("avm:/types/Number", getFixture().resolveType());
	}

} //As3PreIncrementExpressionTest
