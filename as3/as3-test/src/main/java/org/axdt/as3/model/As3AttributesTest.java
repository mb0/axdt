/**
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org> and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.axdt.as3.model;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;
import org.axdt.avm.model.AvmVisibility;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3Attributes#isDynamic() <em>Is Dynamic</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Attributes#isFinal() <em>Is Final</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Attributes#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Attributes#isStatic() <em>Is Static</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Attributes#isNative() <em>Is Native</em>}</li>
 *   <li>{@link org.axdt.as3.model.As3Attributes#isOverride() <em>Is Override</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class As3AttributesTest extends TestCase {

	/**
	 * The fixture for this As3 Attributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3Attributes fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3AttributesTest.class);
	}

	/**
	 * Constructs a new As3 Attributes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AttributesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Attributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3Attributes fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Attributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3Attributes getFixture() {
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
		setFixture(As3EFactory.eINSTANCE.createAs3Attributes());
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
	 * Tests the '{@link org.axdt.as3.model.As3Attributes#isDynamic() <em>Is Dynamic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Attributes#isDynamic()
	 */
	public void testIsDynamic() {
		assertFalse(getFixture().isDynamic());
		As3ReservedAttribute attribute = createFixtureResAttr();
		attribute.setDynamic(true);
		assertTrue(getFixture().isDynamic());
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.As3Attributes#isFinal() <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Attributes#isFinal()
	 */
	public void testIsFinal() {
		assertFalse(getFixture().isFinal());
		As3ReservedAttribute attribute = createFixtureResAttr();
		attribute.setFinal(true);
		assertTrue(getFixture().isFinal());
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.As3Attributes#getVisibility() <em>Get Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Attributes#getVisibility()
	 */
	public void testGetVisibility() {
		assertEquals(AvmVisibility.INTERNAL, getFixture().getVisibility());
		As3ReservedAttribute attribute = createFixtureResAttr();
		attribute.setVisibility(AvmVisibility.PRIVATE);
		assertEquals(AvmVisibility.PRIVATE, getFixture().getVisibility());
	}
	protected As3ReservedAttribute createFixtureResAttr() {
		As3ReservedAttribute attribute = As3EFactory.eINSTANCE.createAs3ReservedAttribute();
		getFixture().getAttributes().add(attribute);
		return attribute;
	}
	/**
	 * Tests the '{@link org.axdt.as3.model.As3Attributes#isStatic() <em>Is Static</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Attributes#isStatic()
	 */
	public void testIsStatic() {
		assertFalse(getFixture().isStatic());
		As3ReservedAttribute attribute = createFixtureResAttr();
		attribute.setStatic(true);
		assertTrue(getFixture().isStatic());
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.As3Attributes#isNative() <em>Is Native</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Attributes#isNative()
	 */
	public void testIsNative() {
		assertFalse(getFixture().isNative());
		As3ReservedAttribute attribute = createFixtureResAttr();
		attribute.setNative(true);
		assertTrue(getFixture().isNative());
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.As3Attributes#isOverride() <em>Is Override</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Attributes#isOverride()
	 */
	public void testIsOverride() {
		assertFalse(getFixture().isOverride());
		As3ReservedAttribute attribute = createFixtureResAttr();
		attribute.setOverride(true);
		assertTrue(getFixture().isOverride());
	}
} //As3AttributesTest
