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
import org.axdt.avm.model.AvmNamespaceTest;
import org.axdt.avm.model.AvmVisibility;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Namespace</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class As3NamespaceTest extends AvmNamespaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3NamespaceTest.class);
	}

	/**
	 * Constructs a new As3 Namespace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3NamespaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Namespace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Namespace getFixture() {
		return (As3Namespace)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3Namespace());
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
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setName("spam");
		assertEquals("spam",getFixture().getCanonicalName());
		As3Package pack = As3EFactory.eINSTANCE.createAs3Package();
		pack.getDirectives().add(getFixture());
		assertEquals("spam",getFixture().getCanonicalName());
		pack.setCanonicalName("foo.bar");
		assertEquals("foo.bar::spam",getFixture().getCanonicalName());
		As3Program prog = As3EFactory.eINSTANCE.createAs3Program();
		prog.getDirectives().add(getFixture());
		assertEquals("::spam",getFixture().getCanonicalName());
	}
	
	public void testGetVisibility() {
		assertEquals(AvmVisibility.INTERNAL, getFixture().getVisibility());
	}
} //As3NamespaceTest
