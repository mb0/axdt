/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
		suite.addTestSuite(As3FunctionExpressionTest.class);
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
