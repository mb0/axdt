/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import junit.textui.TestRunner;

import org.axdt.avm.AvmEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Declared Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmDeclaredTypeReferenceTest extends AvmTypeReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AvmDeclaredTypeReferenceTest.class);
	}

	/**
	 * Constructs a new Avm Declared Type Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmDeclaredTypeReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Avm Declared Type Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AvmDeclaredTypeReference getFixture() {
		return (AvmDeclaredTypeReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference());
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
	 * Tests the '{@link org.axdt.avm.AvmTypeReference#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmTypeReference#getType()
	 */
	public void testGetType() {
		assertNull(getFixture().getType());
		// no concrete implementation on class path
	}
} //AvmDeclaredTypeReferenceTest
