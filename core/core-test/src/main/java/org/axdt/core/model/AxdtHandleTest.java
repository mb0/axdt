/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axdt Handle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtHandle#checkDelegate() <em>Check Delegate</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AxdtHandleTest extends AxdtElementTest {

	/**
	 * Constructs a new Axdt Handle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtHandleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Axdt Handle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxdtHandle<?> getFixture() {
		return (AxdtHandle<?>)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtHandle#checkDelegate() <em>Check Delegate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtHandle#checkDelegate()
	 */
	public abstract void testCheckDelegate();

	@Override
	public void testIsReadOnly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testIsHandle() {
		assertTrue(getFixture().isHandle());
	}
	@Override
	public void testGetHandle() {
		assertSame(getFixture(), getFixture().getHandle());
	}
} //AxdtHandleTest
