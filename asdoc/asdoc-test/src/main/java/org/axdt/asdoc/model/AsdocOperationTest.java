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
 * A test case for the model object '<em><b>Asdoc Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdocOperationTest extends AsdocExecutableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsdocOperationTest.class);
	}

	/**
	 * Constructs a new Asdoc Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocOperation getFixture() {
		return (AsdocOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AsdocEFactory.eINSTANCE.createAsdocOperation());
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
	 * Tests the '{@link org.axdt.avm.AvmOperation#isFinal() <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmOperation#isFinal()
	 * @generated NOT
	 */
	public void testIsFinal() {
		assertFalse(getFixture().isFinal());
		getFixture().setFinal(true);
		assertTrue(getFixture().isFinal());
	}
} //AsdocOperationTest
