/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Avm Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmField#isConstant() <em>Is Constant</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmField#getType() <em>Get Type</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmVariable#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmMember#isStatic() <em>Is Static</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}</li>
 * </ul>
 * </p>
 */
public abstract class AvmFieldTest extends AvmMemberTest {

	/**
	 * The fixture for this Avm Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmField fixture = null;

	/**
	 * Constructs a new Avm Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmFieldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Avm Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AvmField fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Avm Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvmField getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmField#isConstant() <em>Is Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmField#isConstant()
	 */
	public void testIsConstant() {
		assertFalse(getFixture().isConstant());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmField#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmField#getType()
	 */
	public void testGetType() {
		assertNull(getFixture().getType());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmMember#isStatic() <em>Is Static</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmMember#isStatic()
	 */
	public void testIsStatic() {
		super.testIsStatic();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getQualifier()
	 */
	public void testGetQualifier() {
		super.testGetQualifier();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmVariable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmVariable#getName()
	 */
	public void testGetName() {
		super.testGetName();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredElement#getVisibility() <em>Get Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement#getVisibility()
	 */
	public void testGetVisibility() {
		super.testGetVisibility();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		super.testGetCanonicalName();
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getQualifiedName() <em>Get Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getQualifiedName()
	 * @generated
	 */
	public void testGetQualifiedName() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AvmFieldTest
