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
 * A test case for the model object '<em><b>As3 Invocation Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3InvocationExpressionTest extends As3PostfixExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3InvocationExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Invocation Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3InvocationExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Invocation Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3InvocationExpression getFixture() {
		return (As3InvocationExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3InvocationExpression());
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
		As3EFactory factory = As3EFactory.eINSTANCE;
		As3Operation function = factory.createAs3Operation();
		function.setName("foo");
		function.setReturnType(AvmEFactory.eINSTANCE.createAvmGenericReference());
		As3PropertyIdentifier identifier = factory.createAs3PropertyIdentifier();
		identifier.setReference(function);
		getFixture().setExpression(identifier);
		
		assertSame(AvmEFactory.eINSTANCE.createAvmGeneric(), getFixture().resolveType());
	}

} //As3InvocationExpressionTest
