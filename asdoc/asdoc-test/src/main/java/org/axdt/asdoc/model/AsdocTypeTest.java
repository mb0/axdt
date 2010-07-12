/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import java.util.Iterator;

import junit.textui.TestRunner;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmTypeReference;

import com.google.common.collect.Iterators;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getSuperTypes() <em>Get Super Types</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AsdocTypeTest extends AsdocDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsdocTypeTest.class);
	}

	/**
	 * Constructs a new Asdoc Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocType getFixture() {
		return (AsdocType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AsdocEFactory.eINSTANCE.createAsdocType());
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
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredType#getSuperTypes() <em>Get Super Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType#getSuperTypes()
	 * @generated NOT
	 */
	public void testGetSuperTypes() {
		Iterator<AvmTypeReference> iter = getFixture().getSuperTypes().iterator();
		assertNotNull(iter);
		assertEquals(0, Iterators.size(iter));
		
		AvmTypeReference ref1 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		getFixture().getExtendedInterfaces().add(ref1);
		iter = getFixture().getSuperTypes().iterator();
		assertSame(ref1, iter.next());
		assertFalse(iter.hasNext());
		
		AvmTypeReference ref2 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		getFixture().setExtendedClass(ref2);
		iter = getFixture().getSuperTypes().iterator();
		assertSame(ref2, iter.next());
		assertSame(ref1, iter.next());
		assertFalse(iter.hasNext());
		
		AvmTypeReference ref3 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		getFixture().getExtendedInterfaces().add(ref3);
		iter = getFixture().getSuperTypes().iterator();
		assertSame(ref2, iter.next());
		assertSame(ref1, iter.next());
		assertSame(ref3, iter.next());
		assertFalse(iter.hasNext());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isClass()
	 * @generated NOT
	 */
	public void testIsClass() {
		assertTrue(getFixture().isClass() != getFixture().isInterface());
		assertTrue(getFixture().isClass());
		getFixture().setInterface(true);
		assertTrue(getFixture().isClass() != getFixture().isInterface());
		assertFalse(getFixture().isClass());
	}

	/**
	 * Tests the '{@link org.axdt.avm.DeclaredType#getExtendedInterfaces() <em>Get Extended Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.DeclaredType#getExtendedInterfaces()
	 * @generated NOT
	 */
	public void testGetExtendedInterfaces() {
		assertNotNull(getFixture().getExtendedInterfaces());
		assertEquals(0, getFixture().getExtendedInterfaces().size());
	}

	@Override
	public void testGetName() {
		assertNull(getFixture().getName());
		getFixture().setName("foo");
		assertSame("foo", getFixture().getName());
	}

	@Override
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
		AsdocPackage pack = AsdocEFactory.eINSTANCE.createAsdocPackage();
		pack.setCanonicalName("foo.bar");
		pack.getTypes().add(getFixture());
		assertEquals("foo.bar", getFixture().getQualifier());
	}
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setName("spam");
		assertEquals("spam",getFixture().getCanonicalName());
		AsdocPackage pack = AsdocEFactory.eINSTANCE.createAsdocPackage();
		pack.getTypes().add(getFixture());
		assertEquals("spam",getFixture().getCanonicalName());
		pack.setCanonicalName("foo.bar");
		assertEquals("foo.bar::spam", getFixture().getCanonicalName());
	}
} //AsdocTypeTest
