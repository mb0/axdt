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
 * A test case for the model object '<em><b>As3 Paren List Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 */
public class As3ParenListExpressionTest extends IExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3ParenListExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Paren List Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ParenListExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Paren List Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3ParenListExpression getFixture() {
		return (As3ParenListExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3ParenListExpression());
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
		As3StringLiteral literal0 = As3EFactory.eINSTANCE.createAs3StringLiteral();
		getFixture().getExpressions().add(literal0);
		assertProxyType("avm:/types/String", getFixture().resolveType());
		As3BooleanLiteral literal1 = As3EFactory.eINSTANCE.createAs3BooleanLiteral();
		getFixture().getExpressions().add(literal1);
		assertProxyType("avm:/types/Boolean", getFixture().resolveType());
	}

} //As3ParenListExpressionTest
