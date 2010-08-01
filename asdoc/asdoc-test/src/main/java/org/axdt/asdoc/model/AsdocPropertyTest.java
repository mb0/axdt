/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import junit.textui.TestRunner;

import org.axdt.asdoc.AsdocEFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmProperty#getGetter() <em>Get Getter</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmProperty#getSetter() <em>Get Setter</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AsdocPropertyTest extends AsdocFieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsdocPropertyTest.class);
	}

	/**
	 * Constructs a new Asdoc Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocProperty getFixture() {
		return (AsdocProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AsdocEFactory.eINSTANCE.createAsdocProperty());
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

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmProperty#getGetter() <em>Get Getter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmProperty#getGetter()
	 * @generated NOT
	 */
	public void testGetGetter() {
		// TODO: think about accessor property integration
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmProperty#getSetter() <em>Get Setter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmProperty#getSetter()
	 * @generated NOT
	 */
	public void testGetSetter() {
		// TODO: think about accessor property integration
	}

} //AsdocPropertyTest
