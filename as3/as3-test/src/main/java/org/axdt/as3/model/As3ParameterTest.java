/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmParameter#isRest() <em>Is Rest</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class As3ParameterTest extends As3VariableTest {

	/**
	 * Constructs a new As3 Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Parameter getFixture() {
		return (As3Parameter)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmParameter#isRest() <em>Is Rest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmParameter#isRest()
	 */
	public void testIsRest() {
		// override in ParameterRest
		assertFalse(getFixture().isRest());
	}

} //As3ParameterTest
