/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model;

import junit.textui.TestRunner;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmGenericReferenceTest extends AvmTypeReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AvmGenericReferenceTest.class);
	}

	/**
	 * Constructs a new Avm Generic Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmGenericReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Avm Generic Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AvmGenericReference getFixture() {
		return (AvmGenericReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AvmEFactory.eINSTANCE.createAvmGenericReference());
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
	 * Tests the '{@link org.axdt.avm.AvmTypeReference#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.AvmTypeReference#getType()
	 */
	public void testGetType() {
		assertEquals(AvmEPackage.eINSTANCE.getAvmGeneric(), getFixture().getType().eClass());
		assertSame(getFixture().getType(), getFixture().getType());
		assertSame(AvmEFactory.eINSTANCE.createAvmGenericReference().getType(), getFixture().getType());
	}
} //AvmGenericReferenceTest
