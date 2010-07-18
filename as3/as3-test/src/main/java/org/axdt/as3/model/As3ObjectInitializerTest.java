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
 * A test case for the model object '<em><b>As3 Object Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 */
public class As3ObjectInitializerTest extends IExpressionTest {

	/**
	 * The fixture for this As3 Object Initializer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ObjectInitializer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ObjectInitializerTest.class);
	}

	/**
	 * Constructs a new As3 Object Initializer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ObjectInitializerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Object Initializer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3ObjectInitializer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Object Initializer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ObjectInitializer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3ObjectInitializer());
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

	/**
	 * Tests the '{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IExpression#resolveType()
	 */
	public void testResolveType() {
		assertProxyType("avm:/types/Object", getFixture().resolveType());
	}

} //As3ObjectInitializerTest
