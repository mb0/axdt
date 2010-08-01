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
import org.axdt.avm.model.AvmOperationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmOperation#isNative() <em>Is Native</em>}</li>
 * </ul>
 * </p>
 * @generated NOT
 */
public class As3OperationTest extends AvmOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3OperationTest.class);
	}

	/**
	 * Constructs a new As3 Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3OperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Operation getFixture() {
		return (As3Operation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3Operation());
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
	public void testGetDeclarations() {
		assertNotNull(getFixture().getDeclarations());
	}

	public void testGetDirectives() {
		assertNotNull(getFixture().getDirectives());
	}
} //As3OperationTest
