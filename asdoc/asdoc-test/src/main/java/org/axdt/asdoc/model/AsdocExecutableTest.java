/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Executable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmExecutable#getReturnType() <em>Get Return Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AsdocExecutableTest extends AsdocMemberTest {

	/**
	 * Constructs a new Asdoc Executable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocExecutableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Executable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocExecutable getFixture() {
		return (AsdocExecutable)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmExecutable#getReturnType() <em>Get Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmExecutable#getReturnType()
	 * @generated NOT
	 */
	public void testGetReturnType() {
		assertNull(getFixture().getReturnType());
	}

	@Override
	protected String expectedNamePart(String name) {
		return "#"+name+"()";
	}

} //AsdocExecutableTest
