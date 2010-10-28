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
 * A test case for the model object '<em><b>As3 Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3AssignmentExpressionTest extends As3BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3AssignmentExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Assignment Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AssignmentExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Assignment Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3AssignmentExpression getFixture() {
		return (As3AssignmentExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3AssignmentExpression());
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
	
	protected As3EFactory factory = As3EFactory.eINSTANCE;

	@Override
	public void testResolveType() {
		// null by default
		assertEquals(AvmTypeAccess.NULL, getFixture().resolveType());
		// if assignee is set resolve to its type
		// let validation check for incompatible types
		getFixture().setLeft(createTypedIdent("Foo"));
		assertProxyType("avm:/types/Foo", getFixture().resolveType());
	}
	public void testResolveType_Compound() {
		As3PropertyIdentifier left = createTypedIdent("Foo");
		getFixture().setLeft(left);
		getFixture().setOperation("*=");
		// if arithmetic or shift compound assign is used
		// also resolve to assignee's type
		assertProxyType("avm:/types/Foo", getFixture().resolveType());
	}
	public void testResolveType_String() {
		As3PropertyIdentifier left = createTypedIdent("Foo");
		getFixture().setOperation("+=");
		getFixture().setLeft(left);
		assertProxyType("avm:/types/Foo", getFixture().resolveType());
		As3StringLiteral right = factory.createAs3StringLiteral();
		right.setValue("foo");
		getFixture().setRight(right);
		assertProxyType("avm:/types/Foo", getFixture().resolveType());
	}
	public void testResolveType_XML() {
		As3PropertyIdentifier left = createTypedIdent("Foo");
		getFixture().setOperation("+=");
		getFixture().setLeft(left);
		As3XmlInitializer right = factory.createAs3XmlInitializer();
		getFixture().setRight(right);
		assertProxyType("avm:/types/Foo", getFixture().resolveType());
	}
} //As3AssignmentExpressionTest
