/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;
import org.axdt.avm.AvmEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 This Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class As3ThisExpressionTest extends TestCase {

	/**
	 * The fixture for this As3 This Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ThisExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ThisExpressionTest.class);
	}

	/**
	 * Constructs a new As3 This Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ThisExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 This Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3ThisExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 This Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ThisExpression getFixture() {
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
		setFixture(As3EFactory.eINSTANCE.createAs3ThisExpression());
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
		assertEquals(AvmEFactory.eINSTANCE.createAvmNull(), getFixture().resolveType());
	}
	public void testResolveType_Unbound() {
		As3EFactory as3Fac = As3EFactory.eINSTANCE;
		As3FunctionExpression func = as3Fac.createAs3FunctionExpression();
		As3Block block = as3Fac.createAs3Block();
		As3ExpressionStatement statement = as3Fac.createAs3ExpressionStatement();
		statement.getExpressions().add(getFixture());
		block.getDirectives().add(statement);
		func.setBody(block);
		assertEquals(AvmEFactory.eINSTANCE.createAvmGeneric(), getFixture().resolveType());
	}
	public void testResolveType_Operation() {
		As3EFactory as3Fac = As3EFactory.eINSTANCE;
		As3Class type = as3Fac.createAs3Class();
		As3Operation func = as3Fac.createAs3Operation();
		As3Block block = as3Fac.createAs3Block();
		As3ExpressionStatement statement = as3Fac.createAs3ExpressionStatement();
		statement.getExpressions().add(getFixture());
		block.getDirectives().add(statement);
		func.setBody(block);
		type.getDirectives().add(func);
		assertSame(type, getFixture().resolveType());
	}
} //As3ThisExpressionTest
