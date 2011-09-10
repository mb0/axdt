/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Avm Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmMember#isStatic() <em>Is Static</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifiedName() <em>Get Qualified Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AvmMemberTest extends TestCase {

	/**
	 * The fixture for this Avm Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmMember fixture = null;

	/**
	 * Constructs a new Avm Member test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmMemberTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmMember fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmMember getFixture() {
		return fixture;
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
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getQualifier()
	 */
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getName()
	 */
	public void testGetName() {
		assertNull(getFixture().getName());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getVisibility()
	 */
	public void testGetVisibility() {
		assertEquals(AvmVisibility.PUBLIC, getFixture().getVisibility());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getQualifiedName() <em>Get Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getQualifiedName()
	 */
	public void testGetQualifiedName() {
		assertNull(getFixture().getQualifiedName());
	}

} //AvmMemberTest
