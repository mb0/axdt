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
import org.axdt.avm.AvmEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Property Identifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3PropertyIdentifierTest extends As3SimpleIdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3PropertyIdentifierTest.class);
	}

	/**
	 * Constructs a new As3 Property Identifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PropertyIdentifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Property Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3PropertyIdentifier getFixture() {
		return (As3PropertyIdentifier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3PropertyIdentifier());
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
	public void testResolveType() {
		assertEquals(AvmEFactory.eINSTANCE.createAvmNull(), getFixture().resolveType());
		getFixture().setReference(createTypeProxy("Foo"));
		assertProxyType("avm:/types/Foo", getFixture().resolveType());
		getFixture().setReference(null);
		getFixture().setName("*");
		assertEquals(AvmEFactory.eINSTANCE.createAvmGeneric(), getFixture().resolveType());
		// test resolve identifier with property names
	}

} //As3PropertyIdentifierTest
