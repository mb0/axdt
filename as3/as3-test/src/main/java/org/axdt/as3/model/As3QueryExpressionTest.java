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
import org.axdt.avm.util.AvmTypeAccess;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Query Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3QueryExpressionTest extends As3PostfixExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3QueryExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Query Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3QueryExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Query Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3QueryExpression getFixture() {
		return (As3QueryExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3QueryExpression());
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
		assertEquals(AvmTypeAccess.NULL, getFixture().resolveType());
		getFixture().setExpression(createTypedIdent("Foo"));
		assertEquals(AvmTypeAccess.GENERIC, getFixture().resolveType());
	}
	public void testResolveType_XML() {
		assertEquals(AvmTypeAccess.NULL, getFixture().resolveType());
		getFixture().setExpression(createTypedIdent("XMLList"));
		// TODO: add a special xmllist generic access
		// assertProxyType("avm:/types/XMLList", getFixture().resolveType());
		assertEquals(AvmTypeAccess.GENERIC, getFixture().resolveType());
	}
} //As3QueryExpressionTest
