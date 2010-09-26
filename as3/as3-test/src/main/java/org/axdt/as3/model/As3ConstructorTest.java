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
import org.axdt.avm.model.AvmConstructorTest;
import org.axdt.avm.model.AvmVisibility;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Constructor</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class As3ConstructorTest extends AvmConstructorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ConstructorTest.class);
	}

	/**
	 * Constructs a new As3 Constructor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ConstructorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Constructor getFixture() {
		return (As3Constructor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3Constructor());
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
	
	@Override
	public void testGetReturnType() {
		assertNull(getFixture().getReturnType());
		As3Class type = As3EFactory.eINSTANCE.createAs3Class();
		type.getDirectives().add(getFixture());
		assertNotNull(getFixture().getReturnType());
		assertSame(type, getFixture().getReturnType().getType());
	}
	public void testGetDeclarations() {
		assertNotNull(getFixture().getDeclarations());
	}

	public void testGetDirectives() {
		assertNotNull(getFixture().getDirectives());
	}
	
	public void testGetVisibility() {
		assertEquals(AvmVisibility.INTERNAL, getFixture().getVisibility());
	}
} //As3ConstructorTest
