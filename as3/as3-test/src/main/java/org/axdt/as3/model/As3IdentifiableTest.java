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
 * A test case for the model object '<em><b>As3 Identifiable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class As3IdentifiableTest extends As3ElementTest {

	/**
	 * Constructs a new As3 Identifiable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3IdentifiableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Identifiable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Identifiable getFixture() {
		return (As3Identifiable)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmIdentifiable#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable#getName()
	 * @generated NOT
	 */
	public void testGetName() {
		assertNull(getFixture().getName());
	}
} //As3IdentifiableTest
