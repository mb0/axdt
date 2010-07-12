/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.axdt.avm.model.AvmETests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Avm</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmAllTests extends TestSuite {

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
		TestSuite suite = new AvmAllTests("Avm Tests");
		suite.addTest(AvmETests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmAllTests(String name) {
		super(name);
	}

} //AvmAllTests
