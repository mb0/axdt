/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3ClassTest extends As3TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ClassTest.class);
	}

	/**
	 * Constructs a new As3 Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Class getFixture() {
		return (As3Class)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3Class());
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
	public void testGetName() {
		assertNull(getFixture().getName());
		getFixture().setName("foo");
		assertSame("foo", getFixture().getName());
	}
	@Override
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
		As3Package pack = As3EFactory.eINSTANCE.createAs3Package();
		pack.setCanonicalName("foo.bar");
		pack.getDirectives().add(getFixture());
		assertEquals("foo.bar", getFixture().getQualifier());
	}
	@Override
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setName("spam");
		assertEquals("spam",getFixture().getCanonicalName());
		As3Program program = As3EFactory.eINSTANCE.createAs3Program();
		program.getDirectives().add(getFixture());
		assertEquals("::spam",getFixture().getCanonicalName());
		As3Package pack = As3EFactory.eINSTANCE.createAs3Package();
		pack.getDirectives().add(getFixture());
		assertEquals("spam",getFixture().getCanonicalName());
		pack.setCanonicalName("foo.bar");
		assertEquals("foo.bar::spam", getFixture().getCanonicalName());
	}
} //As3ClassTest
