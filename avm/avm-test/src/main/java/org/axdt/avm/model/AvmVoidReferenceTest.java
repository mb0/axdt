/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import junit.textui.TestRunner;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Void Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmVoidReferenceTest extends AvmTypeReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AvmVoidReferenceTest.class);
	}

	/**
	 * Constructs a new Avm Void Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmVoidReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Avm Void Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AvmVoidReference getFixture() {
		return (AvmVoidReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AvmEFactory.eINSTANCE.createAvmVoidReference());
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
		assertEquals(AvmEPackage.eINSTANCE.getAvmVoid(), getFixture().getType().eClass());
		assertSame(getFixture().getType(), getFixture().getType());
		assertSame(AvmEFactory.eINSTANCE.createAvmVoidReference().getType(), getFixture().getType());
	}
} //AvmVoidReferenceTest
