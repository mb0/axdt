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
 * A test case for the model object '<em><b>As3 This Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3ThisExpressionTest extends IExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ThisExpressionTest.class);
	}

	/**
	 * Constructs a new As3 This Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ThisExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 This Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3ThisExpression getFixture() {
		return (As3ThisExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3ThisExpression());
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
	 * Tests the '{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IExpression#resolveType()
	 */
	public void testResolveType() {
		assertEquals(AvmTypeAccess.NULL, getFixture().resolveType());
	}
	public void testResolveType_Unbound() {
		As3EFactory as3Fac = As3EFactory.eINSTANCE;
		As3FunctionExpression func = as3Fac.createAs3FunctionExpression();
		As3Block block = as3Fac.createAs3Block();
		As3ExpressionStatement statement = as3Fac.createAs3ExpressionStatement();
		statement.getExpressions().add(getFixture());
		block.getDirectives().add(statement);
		func.setBody(block);
		assertEquals(AvmTypeAccess.GENERIC, getFixture().resolveType());
	}
	public void testResolveType_Operation() {
		As3EFactory as3Fac = As3EFactory.eINSTANCE;
		As3Class type = as3Fac.createAs3Class();
		As3Operation func = as3Fac.createAs3Operation();
		As3Block block = as3Fac.createAs3Block();
		As3ExpressionStatement statement = as3Fac.createAs3ExpressionStatement();
		statement.getExpressions().add(getFixture());
		block.getDirectives().add(statement);
		func.setBody(block);
		type.getDirectives().add(func);
		assertSame(type, getFixture().resolveType().getType());
	}
} //As3ThisExpressionTest
