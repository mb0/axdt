/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;
import org.axdt.avm.model.AvmDefinitionContainerTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDefinitionContainer#getTypes() <em>Get Types</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinitionContainer#getMembers() <em>Get Members</em>}</li>
 * </ul>
 * </p>
 */
public class As3ProgramTest extends AvmDefinitionContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ProgramTest.class);
	}

	/**
	 * Constructs a new As3 Program test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ProgramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Program getFixture() {
		return (As3Program)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3Program());
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
	 * Tests the '{@link org.axdt.avm.model.AvmDefinitionContainer#getTypes() <em>Get Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinitionContainer#getTypes()
	 */
	public void testGetTypes() {
		super.testGetTypes();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinitionContainer#getMembers() <em>Get Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinitionContainer#getMembers()
	 */
	public void testGetMembers() {
		super.testGetMembers();
	}

} //As3ProgramTest
