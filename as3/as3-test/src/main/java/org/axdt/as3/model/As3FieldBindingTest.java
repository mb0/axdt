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

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Field Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmField#isConstant() <em>Is Constant</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class As3FieldBindingTest extends As3MemberTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3FieldBindingTest.class);
	}

	/**
	 * Constructs a new As3 Field Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3FieldBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Field Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3FieldBinding getFixture() {
		return (As3FieldBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3FieldBinding());
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
	 * Tests the '{@link org.axdt.avm.model.AvmField#isConstant() <em>Is Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmField#isConstant()
	 */
	public void testIsConstant() {
		assertFalse(getFixture().isConstant());
		As3FieldDefinition def = As3EFactory.eINSTANCE.createAs3FieldDefinition();
		def.getBindings().add(getFixture());
		assertFalse(getFixture().isConstant());
		def.setConstant(true);
		assertTrue(getFixture().isConstant());
	}

	@Override
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
		getFixture().setName("spam");
		As3FieldDefinition def = As3EFactory.eINSTANCE.createAs3FieldDefinition();
		def.getBindings().add(getFixture());
		As3Package pack = As3EFactory.eINSTANCE.createAs3Package();
		pack.getDirectives().add(def);
		assertEquals("spam",getFixture().getCanonicalName());
		pack.setCanonicalName("foo.bar");
		assertEquals("foo.bar::spam",getFixture().getCanonicalName());
		As3Program prog = As3EFactory.eINSTANCE.createAs3Program();
		prog.getDirectives().add(def);
		assertEquals("::spam",getFixture().getCanonicalName());
		prog.getDirectives().add(getFixture());
		assertEquals("::spam",getFixture().getCanonicalName());
		pack.getDirectives().add(getFixture());
		assertEquals("foo.bar::spam",getFixture().getCanonicalName());
	}
	
	@Override
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setName("spam");
		assertEquals("spam",getFixture().getCanonicalName());
		As3FieldDefinition def = As3EFactory.eINSTANCE.createAs3FieldDefinition();
		def.getBindings().add(getFixture());
		As3Package pack = As3EFactory.eINSTANCE.createAs3Package();
		pack.getDirectives().add(def);
		assertEquals("spam",getFixture().getCanonicalName());
		pack.setCanonicalName("foo.bar");
		assertEquals("foo.bar::spam",getFixture().getCanonicalName());
		As3Program prog = As3EFactory.eINSTANCE.createAs3Program();
		prog.getDirectives().add(def);
		assertEquals("::spam",getFixture().getCanonicalName());
	}
} //As3FieldBindingTest
