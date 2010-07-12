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

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Executable#getDeclarations() <em>Get Declarations</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Executable#getDirectives() <em>Get Directives</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class As3FunctionExpressionTest extends TestCase {

	/**
	 * The fixture for this As3 Function Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3FunctionExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3FunctionExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Function Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3FunctionExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Function Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3FunctionExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Function Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3FunctionExpression getFixture() {
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
		setFixture(As3EFactory.eINSTANCE.createAs3FunctionExpression());
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
	 * Tests the '{@link org.axdt.as3.model.As3Executable#getDeclarations() <em>Get Declarations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Executable#getDeclarations()
	 */
	public void testGetDeclarations() {
		assertNotNull(getFixture().getDeclarations());
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.As3Executable#getDirectives() <em>Get Directives</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Executable#getDirectives()
	 */
	public void testGetDirectives() {
		assertNotNull(getFixture().getDirectives());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getName()
	 */
	public void testGetName() {
		// TODO add optional function expression name
		assertNull(getFixture().getName());
	}

} //As3FunctionExpressionTest