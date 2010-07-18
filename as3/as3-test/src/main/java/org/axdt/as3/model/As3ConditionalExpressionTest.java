/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;
import org.axdt.avm.AvmEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class As3ConditionalExpressionTest extends IExpressionTest {

	/**
	 * The fixture for this As3 Conditional Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ConditionalExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ConditionalExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Conditional Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ConditionalExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Conditional Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3ConditionalExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Conditional Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ConditionalExpression getFixture() {
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
		setFixture(As3EFactory.eINSTANCE.createAs3ConditionalExpression());
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
	 * @generated
	 */
	public void testResolveType() {
		assertEquals(AvmEFactory.eINSTANCE.createAvmNull(), getFixture().resolveType());
		As3PropertyIdentifier left = createTypedIdent("Foo");
		getFixture().setStatement(left);
		As3PropertyIdentifier right = createTypedIdent("Foo");
		getFixture().setElseStatement(right);
		assertProxyType("avm:/types/Foo", getFixture().resolveType());
		// TODO: find common super type
		// needs type resolution
		As3PropertyIdentifier right2 = createTypedIdent("Object");
		getFixture().setElseStatement(right2);
		assertProxyType("avm:/types/Object", getFixture().resolveType());
	}

} //As3ConditionalExpressionTest
