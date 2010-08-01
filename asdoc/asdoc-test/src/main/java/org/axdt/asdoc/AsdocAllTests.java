/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
