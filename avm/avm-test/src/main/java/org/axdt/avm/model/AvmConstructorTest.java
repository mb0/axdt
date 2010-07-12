/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Avm Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
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
public abstract class AvmConstructorTest extends AvmMemberTest {

	/**
	 * The fixture for this Avm Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmConstructor fixture = null;

	/**
	 * Constructs a new Avm Constructor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmConstructorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmConstructor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmConstructor getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmExecutable#getParameters() <em>Get Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmExecutable#getParameters()
	 */
	public void testGetParameters() {
		assertNotNull(getFixture().getParameters());
		assertFalse(getFixture().getParameters().iterator().hasNext());
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

} //AvmConstructorTest
