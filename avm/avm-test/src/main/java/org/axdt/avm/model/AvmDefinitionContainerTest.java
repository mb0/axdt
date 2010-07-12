/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Definition Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDefinitionContainer#getTypes() <em>Get Types</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinitionContainer#getMembers() <em>Get Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AvmDefinitionContainerTest extends TestCase {

	/**
	 * The fixture for this Avm Definition Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmDefinitionContainer fixture = null;

	/**
	 * Constructs a new Avm Definition Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmDefinitionContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Definition Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmDefinitionContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Definition Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmDefinitionContainer getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinitionContainer#getTypes() <em>Get Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinitionContainer#getTypes()
	 */
	public void testGetTypes() {
		assertNotNull(getFixture().getTypes());
		assertTrue(getFixture().getTypes().isEmpty());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinitionContainer#getMembers() <em>Get Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinitionContainer#getMembers()
	 */
	public void testGetMembers() {
		assertNotNull(getFixture().getMembers());
		assertTrue(getFixture().getMembers().isEmpty());
	}

} //AvmDefinitionContainerTest
