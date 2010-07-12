/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.axdt.avm.AvmEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Avm Void</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AvmVoidTest extends TestCase {

	/**
	 * The fixture for this Avm Void test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmVoid fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AvmVoidTest.class);
	}

	/**
	 * Constructs a new Avm Void test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmVoidTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Void test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmVoid fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Void test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmVoid getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AvmEFactory.eINSTANCE.createAvmVoid());
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
	 * Tests the '{@link org.axdt.avm.AvmType#isDynamic() <em>Is Dynamic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmType#isDynamic()
	 */
	public void testIsDynamic() {
		assertFalse(getFixture().isDynamic());
	}

	/**
	 * Tests the '{@link org.axdt.avm.AvmType#isFinal() <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmType#isFinal()
	 */
	public void testIsFinal() {
		assertTrue(getFixture().isFinal());
	}

	/**
	 * Tests the '{@link org.axdt.avm.AvmType#isInterface() <em>Is Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmType#isInterface()
	 */
	public void testIsInterface() {
		assertFalse(getFixture().isInterface());
	}

	/**
	 * Tests the '{@link org.axdt.avm.AvmType#isClass() <em>Is Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmType#isClass()
	 */
	public void testIsClass() {
		assertFalse(getFixture().isClass());
	}

	/**
	 * Tests the '{@link org.axdt.avm.AvmIdentifiable#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmIdentifiable#getQualifier()
	 */
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
	}

	/**
	 * Tests the '{@link org.axdt.avm.AvmIdentifiable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmIdentifiable#getName()
	 */
	public void testGetName() {
		assertEquals("void", getFixture().getName());
	}

	/**
	 * Tests the '{@link org.axdt.avm.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmIdentifiable#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		assertEquals("void", getFixture().getName());
	}

} //AvmVoidTest
