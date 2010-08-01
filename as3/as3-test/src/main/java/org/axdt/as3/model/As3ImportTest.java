/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class As3ImportTest extends TestCase {

	/**
	 * The fixture for this As3 Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3Import fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ImportTest.class);
	}

	/**
	 * Constructs a new As3 Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ImportTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3Import fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3Import getFixture() {
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
		setFixture(As3EFactory.eINSTANCE.createAs3Import());
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
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getQualifier()
	 */
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
		getFixture().setQualifiedName("foo");
		assertNull(getFixture().getQualifier());
		getFixture().setQualifiedName("spam.bar.foo");
		assertEquals("spam.bar",getFixture().getQualifier());
		getFixture().setQualifiedName("spam.bar.*");
		assertEquals("spam.bar",getFixture().getQualifier());
		getFixture().setQualifiedName("spam.bar.");
		assertEquals("spam.bar",getFixture().getQualifier());
		getFixture().setQualifiedName("");
		assertNull(getFixture().getQualifier());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getName()
	 */
	public void testGetName() {
		assertNull(getFixture().getName());
		getFixture().setQualifiedName("foo");
		assertEquals("foo",getFixture().getName());
		getFixture().setQualifiedName("spam.bar.foo");
		assertEquals("foo",getFixture().getName());
		getFixture().setQualifiedName("spam.bar.*");
		assertEquals("*",getFixture().getName());
		getFixture().setQualifiedName("spam.bar.");
		assertEquals("*",getFixture().getName());
		getFixture().setQualifiedName("");
		assertEquals("*",getFixture().getName());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setQualifiedName("spam");
		assertEquals("spam", getFixture().getCanonicalName());
		getFixture().setQualifiedName("foo.bar.spam");
		assertEquals("foo.bar::spam", getFixture().getCanonicalName());
		getFixture().setQualifiedName("foo.bar.*");
		assertEquals("foo.bar::*", getFixture().getCanonicalName());
		getFixture().setQualifiedName("foo.bar.");
		assertEquals("foo.bar::*", getFixture().getCanonicalName());
	}

} //As3ImportTest
