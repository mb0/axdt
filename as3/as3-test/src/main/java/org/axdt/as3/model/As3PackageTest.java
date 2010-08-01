/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;
import org.axdt.avm.model.AvmPackageTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDefinitionContainer#getTypes() <em>Get Types</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinitionContainer#getMembers() <em>Get Members</em>}</li>
 * </ul>
 * </p>
 */
public class As3PackageTest extends AvmPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3PackageTest.class);
	}

	/**
	 * Constructs a new As3 Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Package getFixture() {
		return (As3Package)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3Package());
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
	 * Tests the '{@link org.axdt.avm.model.AvmDefinitionContainer#getTypes() <em>Get Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinitionContainer#getTypes()
	 */
	public void testGetTypes() {
		super.testGetTypes();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinitionContainer#getMembers() <em>Get Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinitionContainer#getMembers()
	 */
	public void testGetMembers() {
		super.testGetMembers();
	}

	@Override
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setCanonicalName("foo.bar.spam");
		assertSame("foo.bar.spam",getFixture().getCanonicalName());
	}
	@Override
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
		getFixture().setCanonicalName("");
		assertNull(getFixture().getQualifier());
		getFixture().setCanonicalName("foo");
		assertNull(getFixture().getQualifier());
		getFixture().setCanonicalName("foo.bar.spam");
		assertEquals("foo.bar",getFixture().getQualifier());
	}
	@Override
	public void testGetName() {
		assertNull(getFixture().getName());
		getFixture().setCanonicalName("");
		assertEquals("",getFixture().getName());
		getFixture().setCanonicalName("foo");
		assertEquals("foo",getFixture().getName());
		getFixture().setCanonicalName("foo.bar.spam");
		assertEquals("spam",getFixture().getName());
	}
} //As3PackageTest
