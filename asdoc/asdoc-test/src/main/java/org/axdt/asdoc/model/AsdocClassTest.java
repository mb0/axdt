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

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdocClassTest extends AsdocTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsdocClassTest.class);
	}

	/**
	 * Constructs a new Asdoc Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocClass getFixture() {
		return (AsdocClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AsdocEFactory.eINSTANCE.createAsdocClass());
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
	@Override
	public void testIsClass() {
		assertTrue(getFixture().isClass());
	}
	@Override
	public void testIsInterface() {
		assertFalse(getFixture().isInterface());
	}
	
	public void testGetSuperTypes_2() {
		AvmTypeReference ref1 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		AvmTypeReference ref2 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		AvmTypeReference ref3 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		getFixture().getExtendedInterfaces().add(ref1);
		getFixture().setExtendedClass(ref2);
		getFixture().getExtendedInterfaces().add(ref3);
		Iterator<AvmTypeReference> iter = getFixture().getSuperTypes().iterator();
		assertSame(ref2, iter.next());
		assertSame(ref1, iter.next());
		assertSame(ref3, iter.next());
		assertFalse(iter.hasNext());
	}
	
	@Override
	public void testGetExtendedClass() {
		assertNull(getFixture().getExtendedClass());
		AvmTypeReference ref1 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		getFixture().setExtendedClass(ref1);
		assertSame(ref1, getFixture().getExtendedClass());
	}
} //AsdocClassTest
