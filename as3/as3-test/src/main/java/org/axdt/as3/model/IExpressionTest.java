/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import junit.framework.TestCase;

import org.axdt.as3.As3EFactory;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IExpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class IExpressionTest extends TestCase {

	/**
	 * The fixture for this IExpression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IExpression fixture = null;

	/**
	 * Constructs a new IExpression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IExpression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IExpression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IExpression getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.axdt.as3.model.IExpression#resolveType() <em>Resolve Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IExpression#resolveType()
	 */
	public abstract void testResolveType();

	public void assertProxyType(String expectedUri, AvmTypeAccess type) {
		assertProxyType(expectedUri, type.getType());
	}
	public void assertProxyType(String expectedUri, AvmType type) {
		assertNotNull(type);
		assertTrue(type.eIsProxy());
		InternalEObject ieObj = (InternalEObject) type;
		assertEquals(expectedUri, ieObj.eProxyURI().toString());
	}
	public AvmDeclaredTypeReference createTypeReference(String typeName) {
		AvmDeclaredTypeReference ref = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		ref.setType(createTypeProxy(typeName));
		return ref;
	}
	public As3PropertyIdentifier createTypedIdent(String typeName) {
		As3PropertyIdentifier identifier = As3EFactory.eINSTANCE.createAs3PropertyIdentifier();
		identifier.setReference(createTypeProxy(typeName));
		return identifier;
	}
	public As3Class createTypeProxy(String typeName) {
		As3Class proxy = As3EFactory.eINSTANCE.createAs3Class();
		URI uri = URI.createURI("avm:/types/"+typeName);
		((InternalEObject) proxy).eSetProxyURI(uri);
		return proxy;
	}
} //IExpressionTest
