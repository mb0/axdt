/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class As3DefinitionTest extends As3IdentifiableTest {

	/**
	 * Constructs a new As3 Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3DefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Definition getFixture() {
		return (As3Definition)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getQualifier()
	 */
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition#getCanonicalName()
	 */
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
	}

} //As3DefinitionTest
