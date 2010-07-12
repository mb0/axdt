/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import junit.textui.TestRunner;

import org.axdt.asdoc.AsdocEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocRoot#getPackage(java.lang.String) <em>Get Package</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocRoot#createPackage(java.lang.String) <em>Create Package</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AsdocRootTest extends AsdocPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsdocRootTest.class);
	}

	/**
	 * Constructs a new Asdoc Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocRootTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocRoot getFixture() {
		return (AsdocRoot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AsdocEFactory.eINSTANCE.createAsdocRoot());
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
	 * Tests the '{@link org.axdt.asdoc.model.AsdocRoot#getPackage(java.lang.String) <em>Get Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocRoot#getPackage(java.lang.String)
	 */
	public void testGetPackage__String() {
		assertNull(getFixture().getPackage("foo.bar.Spam"));
		AsdocPackage pack = getFixture().createPackage("foo.bar.Spam");
		assertSame(pack, getFixture().getPackage("foo.bar.Spam"));
	}

	/**
	 * Tests the '{@link org.axdt.asdoc.model.AsdocRoot#createPackage(java.lang.String) <em>Create Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocRoot#createPackage(java.lang.String)
	 * @generated NOT
	 */
	public void testCreatePackage__String() {
		AsdocPackage foo = getFixture().createPackage("foo");
		assertNotNull(foo);
		assertEquals(getFixture(), foo.getParent());
		assertEquals("foo", foo.getCanonicalName());
		AsdocPackage bar = getFixture().createPackage("foo.bar");
		assertNotNull(bar);
		assertEquals(foo, bar.getParent());
		assertEquals("foo.bar", bar.getCanonicalName());
		AsdocPackage tail = getFixture().createPackage("a.b.c");
		assertNotNull(tail);
		assertEquals(getFixture(), tail.getRoot());
		assertEquals("a.b.c", tail.getCanonicalName());
		assertEquals("a.b", tail.getParent().getCanonicalName());
		assertEquals(getFixture(), tail.getParent().getParent().getParent());
	}

	@Override
	public void testGetRoot() {
		assertEquals(getFixture(), getFixture().getRoot());
	}
	@Override
	public void testGetFullUri() {
		assertNull(getFixture().getFullUri());
		assertEquals(getFixture().getBaseUri(), getFixture().getFullUri());
		getFixture().setBaseUri("file:///tmp/test/");
		assertEquals(getFixture().getBaseUri(), getFixture().getFullUri());
	}
} //AsdocRootTest
