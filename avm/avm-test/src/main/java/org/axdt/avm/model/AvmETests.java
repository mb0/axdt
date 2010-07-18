/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>avm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmETests extends TestSuite {

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
		TestSuite suite = new AvmETests("avm Tests");
		suite.addTestSuite(AvmNullTest.class);
		suite.addTestSuite(AvmVoidTest.class);
		suite.addTestSuite(AvmGenericTest.class);
		suite.addTestSuite(AvmVoidReferenceTest.class);
		suite.addTestSuite(AvmNullReferenceTest.class);
		suite.addTestSuite(AvmGenericReferenceTest.class);
		suite.addTestSuite(AvmDeclaredTypeReferenceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmETests(String name) {
		super(name);
	}

} //AvmETests
