/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import org.axdt.avm.AvmEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Qualified Identifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class As3QualifiedIdentifierTest extends IExpressionTest {

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
	 * Returns the fixture for this As3 Qualified Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3QualifiedIdentifier getFixture() {
		return (As3QualifiedIdentifier)fixture;
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
