/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import junit.textui.TestRunner;

import org.axdt.asdoc.AsdocEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdocInterfaceTest extends AsdocTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsdocInterfaceTest.class);
	}

	/**
	 * Constructs a new Asdoc Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocInterface getFixture() {
		return (AsdocInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AsdocEFactory.eINSTANCE.createAsdocInterface());
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
	public void testIsClass() {
		assertFalse(getFixture().isClass());
	}
	@Override
	public void testIsInterface() {
		assertTrue(getFixture().isInterface());
	}
} //AsdocInterfaceTest
