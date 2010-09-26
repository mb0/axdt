/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import org.axdt.avm.model.AvmDeclaredTypeTest;
import org.axdt.avm.model.AvmVisibility;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getSuperTypes() <em>Get Super Types</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getExtendedClass() <em>Get Extended Class</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getMembers() <em>Get Members</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}</li>
 * </ul>
 * </p>
 * @generated NOT
 */
public abstract class As3TypeTest extends AvmDeclaredTypeTest {

	/**
	 * Constructs a new As3 Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3TypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3Type getFixture() {
		return (As3Type)fixture;
	}
	

	public void testGetVisibility() {
		assertEquals(AvmVisibility.INTERNAL, getFixture().getVisibility());
	}
} //As3TypeTest
