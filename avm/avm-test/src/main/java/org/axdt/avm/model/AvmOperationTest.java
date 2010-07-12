/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;



/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Avm Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmOperation#isFinal() <em>Is Final</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmOperation#isNative() <em>Is Native</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmOperation#isOverride() <em>Is Override</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmExecutable#getParameters() <em>Get Parameters</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmExecutable#getReturnType() <em>Get Return Type</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmMember#isStatic() <em>Is Static</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}</li>
 * </ul>
 * </p>
 */
public abstract class AvmOperationTest extends AvmMemberTest {

	/**
	 * The fixture for this Avm Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmOperation fixture = null;

	/**
	 * Constructs a new Avm Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmOperationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmOperation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmOperation getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmOperation#isFinal() <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmOperation#isFinal()
	 */
	public void testIsFinal() {
		assertFalse(getFixture().isFinal());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmOperation#isNative() <em>Is Native</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmOperation#isNative()
	 */
	public void testIsNative() {
		assertFalse(getFixture().isNative());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmOperation#isOverride() <em>Is Override</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmOperation#isOverride()
	 */
	public void testIsOverride() {
		assertFalse(getFixture().isOverride());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmExecutable#getReturnType() <em>Get Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmExecutable#getReturnType()
	 */
	public void testGetReturnType() {
		assertNull(getFixture().getReturnType());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmExecutable#getParameters() <em>Get Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmExecutable#getParameters()
	 */
	public void testGetParameters() {
		assertNotNull(getFixture().getParameters());
		assertTrue(getFixture().getParameters().isEmpty());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmMember#isStatic() <em>Is Static</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmMember#isStatic()
	 */
	public void testIsStatic() {
		super.testIsStatic();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getQualifier()
	 */
	public void testGetQualifier() {
		super.testGetQualifier();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getName()
	 */
	public void testGetName() {
		super.testGetName();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getVisibility()
	 */
	public void testGetVisibility() {
		super.testGetVisibility();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		super.testGetCanonicalName();
	}

} //AvmOperationTest
