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
 * A test case for the model object '<em><b>As3 Reserved Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.As3ReservedAttribute#isVisibility() <em>Is Visibility</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class As3ReservedAttributeTest extends TestCase {

	/**
	 * The fixture for this As3 Reserved Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ReservedAttribute fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ReservedAttributeTest.class);
	}

	/**
	 * Constructs a new As3 Reserved Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ReservedAttributeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this As3 Reserved Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(As3ReservedAttribute fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this As3 Reserved Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ReservedAttribute getFixture() {
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
		setFixture(As3EFactory.eINSTANCE.createAs3ReservedAttribute());
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
	 * Tests the '{@link org.axdt.as3.model.As3ReservedAttribute#isVisibility() <em>Is Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3ReservedAttribute#isVisibility()
	 */
	public void testIsVisibility() {
		assertNotNull(getFixture());
		assertNull(getFixture().getVisibility());
		assertFalse(getFixture().isVisibility());
		getFixture().setVisibility(AvmVisibility.PUBLIC);
		assertTrue(getFixture().isVisibility());
		getFixture().setVisibility(null);
		assertFalse(getFixture().isVisibility());
		
	}

} //As3ReservedAttributeTest
