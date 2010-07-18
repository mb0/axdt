/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import org.axdt.avm.AvmEFactory;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Qualified Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class As3QualifiedIdentifierTest extends TestCase {

	/**
	 * The fixture for this As3 Qualified Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3QualifiedIdentifier fixture = null;

	/**
	 * Constructs a new As3 Qualified Identifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3QualifiedIdentifierTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Qualified Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3QualifiedIdentifier fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Qualified Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3QualifiedIdentifier getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IExpression#resolveType()
	 */
	public void testResolveType() {
		// TODO: implement namespaces
		assertEquals(AvmEFactory.eINSTANCE.createAvmGeneric(), getFixture().resolveType());
	}

} //As3QualifiedIdentifierTest
