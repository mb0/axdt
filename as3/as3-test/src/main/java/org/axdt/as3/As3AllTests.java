/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.axdt.as3.formatting.As3FormatterTest;
import org.axdt.as3.model.As3ETests;
import org.axdt.as3.parser.antlr.As3ParserTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>As3</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3AllTests extends TestSuite {

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
	 */
	public static Test suite() {
		TestSuite suite = new As3AllTests("As3 Tests");
		suite.addTest(As3ETests.suite());
		suite.addTestSuite(As3FormatterTest.class);
		suite.addTestSuite(As3ParserTest.class);
		// TODO add scope and scope provider tests
		// suite.addTestSuite(As3ScopeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AllTests(String name) {
		super(name);
	}

} //As3AllTests
