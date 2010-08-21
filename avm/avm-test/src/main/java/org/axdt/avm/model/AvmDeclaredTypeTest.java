/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import org.axdt.avm.AvmEFactory;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Avm Declared Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getSuperTypes() <em>Get Super Types</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getExtendedClass() <em>Get Extended Class</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getExtendedInterfaces() <em>Get Extended Interfaces</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType) <em>Calculate Common Type</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AvmDeclaredTypeTest extends TestCase {

	/**
	 * The fixture for this Avm Declared Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmDeclaredType fixture = null;

	/**
	 * Constructs a new Avm Declared Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmDeclaredTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Declared Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmDeclaredType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Declared Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmDeclaredType getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredType#getSuperTypes() <em>Get Super Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType#getSuperTypes()
	 */
	public void testGetSuperTypes() {
		assertNotNull(getFixture().getSuperTypes());
		assertFalse(getFixture().getSuperTypes().iterator().hasNext());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredType#getExtendedClass() <em>Get Extended Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType#getExtendedClass()
	 */
	public void testGetExtendedClass() {
		assertNull(getFixture().getExtendedClass());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredType#getExtendedInterfaces() <em>Get Extended Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType#getExtendedInterfaces()
	 */
	public void testGetExtendedInterfaces() {
		assertNotNull(getFixture().getExtendedInterfaces());
		assertTrue(getFixture().getExtendedInterfaces().isEmpty());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredType#getMembers() <em>Get Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType#getMembers()
	 */
	public void testGetMembers() {
		assertNotNull(getFixture().getMembers());
		assertTrue(getFixture().getMembers().isEmpty());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isDynamic()
	 */
	public void testIsDynamic() {
		assertFalse(getFixture().isDynamic());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isFinal()
	 */
	public void testIsFinal() {
		assertFalse(getFixture().isFinal());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isInterface()
	 */
	public void testIsInterface() {
		assertFalse(getFixture().isInterface());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isClass()
	 */
	public void testIsClass() {
		assertFalse(getFixture().isClass());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType) <em>Calculate Common Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType)
	 */
	public void testCalculateCommonType__AvmType() {
		assertNull(getFixture().calculateCommonType(null));
		AvmNull nul = AvmEFactory.eINSTANCE.createAvmNull();
		assertEquals(nul, getFixture().calculateCommonType(nul));
		AvmVoid voi = AvmEFactory.eINSTANCE.createAvmVoid();
		assertEquals(voi, getFixture().calculateCommonType(voi));
		AvmGeneric generic = AvmEFactory.eINSTANCE.createAvmGeneric();
		assertEquals(generic, getFixture().calculateCommonType(generic));
		assertEquals(getFixture(), getFixture().calculateCommonType(getFixture()));
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getQualifier()
	 */
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getName()
	 */
	public void testGetName() {
		assertNull(getFixture().getName());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getVisibility()
	 */
	public void testGetVisibility() {
		assertEquals(AvmVisibility.PUBLIC, getFixture().getVisibility());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
	}

} //AvmDeclaredTypeTest
