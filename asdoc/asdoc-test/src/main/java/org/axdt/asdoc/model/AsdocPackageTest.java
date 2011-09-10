/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import junit.textui.TestRunner;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.avm.naming.AvmQualifiedName;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#getChildPackage(java.lang.String) <em>Get Child Package</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#createChildPackage(java.lang.String) <em>Create Child Package</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AsdocPackageTest extends AsdocElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsdocPackageTest.class);
	}

	/**
	 * Constructs a new Asdoc Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocPackage getFixture() {
		return (AsdocPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AsdocEFactory.eINSTANCE.createAsdocPackage());
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
	 * Tests the '{@link org.axdt.asdoc.model.AsdocPackage#getFullUri() <em>Get Full Uri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocPackage#getFullUri()
	 * @generated NOT
	 */
	public void testGetFullUri() {
		assertNull(getFixture().getFullUri());
		getFixture().setQualifiedName(AvmQualifiedName.create("foo"));
		assertNull(getFixture().getFullUri());
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot();
		root.setBaseUri("file://tmp/test/");
		getFixture().setParent(root);
		AsdocPackage child = AsdocEFactory.eINSTANCE.createAsdocPackage();
		child.setQualifiedName(AvmQualifiedName.create("foo","bar"));
		child.setParent(getFixture());
		root.setParseType(ParseType.HTML);
		assertEquals("file://tmp/test/foo/", getFixture().getFullUri());
		assertEquals("file://tmp/test/foo/bar/", child.getFullUri());
		root.setParseType(ParseType.DITA);
		assertEquals("file://tmp/test/foo.xml", getFixture().getFullUri());
		assertEquals("file://tmp/test/foo.bar.xml", child.getFullUri());
	}

	/**
	 * Tests the '{@link org.axdt.asdoc.model.AsdocPackage#getChildPackage(java.lang.String) <em>Get Child Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocPackage#getChildPackage(java.lang.String)
	 * @generated NOT
	 */
	public void testGetChildPackage__String() {
		assertNull(getFixture().getChildPackage("foo"));
		AsdocPackage child = AsdocEFactory.eINSTANCE.createAsdocPackage();
		child.setQualifiedName(AvmQualifiedName.create("foo"));
		child.setParent(getFixture());
		assertEquals(child,getFixture().getChildPackage("foo"));
	}

	/**
	 * Tests the '{@link org.axdt.asdoc.model.AsdocPackage#createChildPackage(java.lang.String) <em>Create Child Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocPackage#createChildPackage(java.lang.String)
	 * @generated NOT
	 */
	public void testCreateChildPackage__String() {
		assertNull(getFixture().createChildPackage(null));
		getFixture().setQualifiedName(AvmQualifiedName.EMPTY);
		AsdocPackage child = AsdocEFactory.eINSTANCE.createAsdocPackage();
		child.setQualifiedName(AvmQualifiedName.create("foo"));
		child.setParent(getFixture());
		AsdocPackage foo = getFixture().createChildPackage("foo");
		assertSame(child, foo);
		AsdocPackage bar = getFixture().createChildPackage("bar");
		assertNotNull(bar);
		assertEquals(getFixture(),bar.getParent());
		assertTrue(getFixture().getPackages().contains(bar));
	}

	/**
	 * Tests the '{@link org.axdt.asdoc.model.AsdocPackage#getRoot() <em>Get Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.AsdocPackage#getRoot()
	 * @generated NOT
	 */
	public void testGetRoot() {
		assertNull(getFixture().getRoot());
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot();
		assertEquals(root,root.getRoot());
		getFixture().setParent(root);
		assertEquals(root,getFixture().getRoot());
		AsdocPackage child = AsdocEFactory.eINSTANCE.createAsdocPackage();
		child.setParent(getFixture());
		assertEquals(root,child.getRoot());
	}

	@Override
	public void testGetName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setQualifiedName(AvmQualifiedName.create("foo","bar","spam"));
		assertEquals("foo.bar.spam",getFixture().getCanonicalName());
	}
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
		getFixture().setQualifiedName(AvmQualifiedName.create("foo"));
		assertNull(getFixture().getQualifier());
		getFixture().setQualifiedName(AvmQualifiedName.create("foo","bar","spam"));
		assertEquals("foo.bar",getFixture().getQualifier());
	}
	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getQualifiedName() <em>Get Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getQualifiedName()
	 */
	public void testGetQualifiedName() {
		assertNull(getFixture().getQualifiedName());
		getFixture().setQualifiedName(AvmQualifiedName.create("foo","bar","spam"));
		assertEquals(QualifiedName.create("foo","bar","spam"),getFixture().getQualifiedName());
	}

} //AsdocPackageTest
