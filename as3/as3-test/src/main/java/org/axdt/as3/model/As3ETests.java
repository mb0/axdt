/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>as3</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3ETests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new As3ETests("as3 Tests");
		suite.addTestSuite(As3ProgramTest.class);
		suite.addTestSuite(As3ImportTest.class);
		suite.addTestSuite(As3PackageTest.class);
		suite.addTestSuite(As3ClassTest.class);
		suite.addTestSuite(As3InterfaceTest.class);
		suite.addTestSuite(As3NamespaceTest.class);
		suite.addTestSuite(As3VariableTest.class);
		suite.addTestSuite(As3VariableAssignTest.class);
		suite.addTestSuite(As3ParameterAssignTest.class);
		suite.addTestSuite(As3ParameterRestTest.class);
		suite.addTestSuite(As3FieldBindingTest.class);
		suite.addTestSuite(As3OperationTest.class);
		suite.addTestSuite(As3ConstructorTest.class);
		suite.addTestSuite(As3AssignmentExpressionTest.class);
		suite.addTestSuite(As3ConditionalExpressionTest.class);
		suite.addTestSuite(As3LogicalExpressionTest.class);
		suite.addTestSuite(As3BitwiseExpressionTest.class);
		suite.addTestSuite(As3EqualityExpressionTest.class);
		suite.addTestSuite(As3RelationalExpressionTest.class);
		suite.addTestSuite(As3ShiftExpressionTest.class);
		suite.addTestSuite(As3AdditiveExpressionTest.class);
		suite.addTestSuite(As3MultiplicativeExpressionTest.class);
		suite.addTestSuite(As3DeleteExpressionTest.class);
		suite.addTestSuite(As3VoidExpressionTest.class);
		suite.addTestSuite(As3TypeOfExpressionTest.class);
		suite.addTestSuite(As3PreIncrementExpressionTest.class);
		suite.addTestSuite(As3PreDecrementExpressionTest.class);
		suite.addTestSuite(As3UnaryPlusExpressionTest.class);
		suite.addTestSuite(As3UnaryMinusExpressionTest.class);
		suite.addTestSuite(As3BitwiseNotExpressionTest.class);
		suite.addTestSuite(As3LogicalNotExpressionTest.class);
		suite.addTestSuite(As3PostIncrementExpressionTest.class);
		suite.addTestSuite(As3PostDecrementExpressionTest.class);
		suite.addTestSuite(As3InvocationExpressionTest.class);
		suite.addTestSuite(As3AccessExpressionTest.class);
		suite.addTestSuite(As3QueryExpressionTest.class);
		suite.addTestSuite(As3PropertyIdentifierTest.class);
		suite.addTestSuite(As3AttributeQualifiedIdentifierTest.class);
		suite.addTestSuite(As3SimpleQualifiedIdentifierTest.class);
		suite.addTestSuite(As3ExpressionQualifiedIdentifierTest.class);
		suite.addTestSuite(As3ThisExpressionTest.class);
		suite.addTestSuite(As3SuperExpressionTest.class);
		suite.addTestSuite(As3ParenListExpressionTest.class);
		suite.addTestSuite(As3FunctionExpressionTest.class);
		suite.addTestSuite(As3NewExpressionTest.class);
		suite.addTestSuite(As3ArrayInitializerTest.class);
		suite.addTestSuite(As3ObjectInitializerTest.class);
		suite.addTestSuite(As3XmlInitializerTest.class);
		suite.addTestSuite(As3NullLiteralTest.class);
		suite.addTestSuite(As3BooleanLiteralTest.class);
		suite.addTestSuite(As3NumberLiteralTest.class);
		suite.addTestSuite(As3StringLiteralTest.class);
		suite.addTestSuite(As3RegexLiteralTest.class);
		suite.addTestSuite(As3ReservedAttributeTest.class);
		suite.addTestSuite(As3AttributesTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ETests(String name) {
		super(name);
	}

} //As3ETests
