/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>asdoc</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdocETests extends TestSuite {

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
		TestSuite suite = new AsdocETests("asdoc Tests");
		suite.addTestSuite(AsdocPackageTest.class);
		suite.addTestSuite(AsdocRootTest.class);
		suite.addTestSuite(AsdocClassTest.class);
		suite.addTestSuite(AsdocInterfaceTest.class);
		suite.addTestSuite(AsdocFieldTest.class);
		suite.addTestSuite(AsdocPropertyTest.class);
		suite.addTestSuite(AsdocNamespaceTest.class);
		suite.addTestSuite(AsdocParameterTest.class);
		suite.addTestSuite(AsdocConstructorTest.class);
		suite.addTestSuite(AsdocOperationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocETests(String name) {
		super(name);
	}

} //AsdocETests
