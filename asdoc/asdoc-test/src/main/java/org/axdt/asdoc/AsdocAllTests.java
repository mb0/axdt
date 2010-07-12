/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.axdt.asdoc.access.AsdocAccessTests;
import org.axdt.asdoc.model.AsdocETests;
import org.axdt.asdoc.parser.AsdocParserTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>AxdtAsdoc</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdocAllTests extends TestSuite {

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
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new AsdocAllTests("AxdtAsdoc Tests");
		suite.addTest(AsdocETests.suite());
		suite.addTest(AsdocParserTests.suite());
		suite.addTest(AsdocAccessTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocAllTests(String name) {
		super(name);
	}

} //AsdocAllTests
