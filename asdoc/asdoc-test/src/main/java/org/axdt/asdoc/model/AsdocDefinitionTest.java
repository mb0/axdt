/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AsdocDefinitionTest extends AsdocElementTest {

	/**
	 * Constructs a new Asdoc Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocDefinition getFixture() {
		return (AsdocDefinition)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getQualifier()
	 */
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
	}

	public void testGetName() {
		assertNull(getFixture().getName());
	}
	
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
	}
} //AsdocDefinitionTest
