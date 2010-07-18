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
 * A test case for the model object '<em><b>As3 Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3AdditiveExpressionTest extends As3BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3AdditiveExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Additive Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AdditiveExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Additive Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3AdditiveExpression getFixture() {
		return (As3AdditiveExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3AdditiveExpression());
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

	protected As3EFactory factory = As3EFactory.eINSTANCE;
	
	@Override
	public void testResolveType() {
		// number by default
		assertProxyType("avm:/types/Number", getFixture().resolveType());
	}
	public void testResolveType_String() {
		As3NumberLiteral left = factory.createAs3NumberLiteral();
		left.setValue(13);
		getFixture().setOperation("+");
		getFixture().setLeft(left);
		assertProxyType("avm:/types/Number", getFixture().resolveType());
		As3StringLiteral right = factory.createAs3StringLiteral();
		right.setValue("foo");
		getFixture().setRight(right);
		assertProxyType("avm:/types/String", getFixture().resolveType());
	}
	public void testResolveType_XML() {
		As3XmlInitializer right = factory.createAs3XmlInitializer();
		getFixture().setRight(right);
		getFixture().setOperation("+");
		assertProxyType("avm:/types/XML", getFixture().resolveType());
		As3NumberLiteral left = factory.createAs3NumberLiteral();
		left.setValue(13);
		getFixture().setLeft(left);
	}
} //As3AdditiveExpressionTest
