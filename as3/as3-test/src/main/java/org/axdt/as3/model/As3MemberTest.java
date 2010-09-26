/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmVisibility;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmMember#isStatic() <em>Is Static</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class As3MemberTest extends As3DefinitionTest {

	/**
	 * Constructs a new As3 Member test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3MemberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Member getFixture() {
		return (As3Member)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmMember#isStatic() <em>Is Static</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmMember#isStatic()
	 */
	public void testIsStatic() {
		assertFalse(getFixture().isStatic());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getVisibility()
	 */
	public void testGetVisibility() {
		assertEquals(AvmVisibility.INTERNAL, getFixture().getVisibility());
	}

} //As3MemberTest
