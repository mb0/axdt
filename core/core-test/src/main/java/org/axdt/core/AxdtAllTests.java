/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import org.axdt.core.model.AxdtETests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Core</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class AxdtAllTests extends TestSuite {

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
		TestSuite suite = new AxdtAllTests("Core Tests");
		suite.addTest(AxdtETests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtAllTests(String name) {
		super(name);
	}

} //AxdtAllTests
