/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import junit.framework.TestCase;

import org.axdt.avm.AvmEPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Avm Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmTypeReference#getType() <em>Get Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AvmTypeReferenceTest extends TestCase {

	/**
	 * The fixture for this Avm Type Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmTypeReference fixture = null;

	/**
	 * Constructs a new Avm Type Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmTypeReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Type Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmTypeReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Type Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmTypeReference getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmTypeReference#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmTypeReference#getType()
	 */
	public void testGetType() {
		assertEquals(AvmEPackage.eINSTANCE.getAvmNull(), getFixture().getType().eClass());
		assertNotSame(getFixture().getType(), getFixture().getType());
	}

} //AvmTypeReferenceTest
