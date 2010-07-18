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
 * A test case for the model object '<em><b>As3 Number Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 */
public class As3NumberLiteralTest extends IExpressionTest {

	/**
	 * The fixture for this As3 Number Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3NumberLiteral fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3NumberLiteralTest.class);
	}

	/**
	 * Constructs a new As3 Number Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3NumberLiteralTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Number Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3NumberLiteral fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Number Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3NumberLiteral getFixture() {
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
		setFixture(As3EFactory.eINSTANCE.createAs3NumberLiteral());
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
		// TODO check number literal types
		// if no value is set return int
		assertProxyType("avm:/types/int", getFixture().resolveType());
		// when there is a fraction use Number
		getFixture().setValue(13.37);
		assertProxyType("avm:/types/Number", getFixture().resolveType());
		// when Integer and > 2147483647 use uint
		getFixture().setValue(2147483648l);
		assertProxyType("avm:/types/uint", getFixture().resolveType());
		// else if >= -2147483648 return int
		getFixture().setValue(-1337);
		assertProxyType("avm:/types/int", getFixture().resolveType());
		// in any other case use Number
		getFixture().setValue(1e-2);
		assertProxyType("avm:/types/Number", getFixture().resolveType());
		getFixture().setValue(-2147483649l);
		assertProxyType("avm:/types/Number", getFixture().resolveType());
	}

} //As3NumberLiteralTest
