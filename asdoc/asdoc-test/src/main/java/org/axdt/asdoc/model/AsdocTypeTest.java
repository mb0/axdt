/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import java.util.Iterator;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmGeneric;
import org.axdt.avm.model.AvmNull;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVoid;

import com.google.common.collect.Iterators;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getSuperTypes() <em>Get Super Types</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDeclaredType#getExtendedClass() <em>Get Extended Class</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType) <em>Calculate Common Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AsdocTypeTest extends AsdocDefinitionTest {

	/**
	 * Constructs a new Asdoc Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocType getFixture() {
		return (AsdocType)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredType#getSuperTypes() <em>Get Super Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType#getSuperTypes()
	 * @generated NOT
	 */
	public void testGetSuperTypes() {
		Iterator<AvmTypeReference> iter = getFixture().getSuperTypes().iterator();
		assertNotNull(iter);
		assertEquals(0, Iterators.size(iter));
		
		AvmTypeReference ref1 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		getFixture().getExtendedInterfaces().add(ref1);
		iter = getFixture().getSuperTypes().iterator();
		assertSame(ref1, iter.next());
		assertFalse(iter.hasNext());
		
		AvmTypeReference ref2 = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		getFixture().getExtendedInterfaces().add(ref2);
		iter = getFixture().getSuperTypes().iterator();
		assertSame(ref1, iter.next());
		assertSame(ref2, iter.next());
		assertFalse(iter.hasNext());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmDeclaredType#getExtendedClass() <em>Get Extended Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType#getExtendedClass()
	 */
	public void testGetExtendedClass() {
		assertNull(getFixture().getExtendedClass());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isDynamic() <em>Is Dynamic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isDynamic()
	 */
	public void testIsDynamic() {
		assertFalse(getFixture().isDynamic());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isFinal() <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isFinal()
	 */
	public void testIsFinal() {
		assertFalse(getFixture().isFinal());
	}

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isInterface() <em>Is Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isInterface()
	 */
	public abstract void testIsInterface();

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#isClass() <em>Is Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#isClass()
	 */
	public abstract void testIsClass();

	/**
	 * Tests the '{@link org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType) <em>Calculate Common Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType#calculateCommonType(org.axdt.avm.model.AvmType)
	 */
	public void testCalculateCommonType__AvmType() {
		assertNull(getFixture().calculateCommonType(null));
		AvmNull nul = AvmEFactory.eINSTANCE.createAvmNull();
		assertEquals(nul, getFixture().calculateCommonType(nul));
		AvmVoid voi = AvmEFactory.eINSTANCE.createAvmVoid();
		assertEquals(voi, getFixture().calculateCommonType(voi));
		AvmGeneric generic = AvmEFactory.eINSTANCE.createAvmGeneric();
		assertEquals(generic, getFixture().calculateCommonType(generic));
		assertEquals(getFixture(), getFixture().calculateCommonType(getFixture()));
		// TODO test inheritance
		// TODO special case interface -> Object
	}

	/**
	 * Tests the '{@link org.axdt.avm.DeclaredType#getExtendedInterfaces() <em>Get Extended Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.DeclaredType#getExtendedInterfaces()
	 */
	public void testGetExtendedInterfaces() {
		assertNotNull(getFixture().getExtendedInterfaces());
		assertEquals(0, getFixture().getExtendedInterfaces().size());
	}

	@Override
	public void testGetName() {
		assertNull(getFixture().getName());
		getFixture().setName("foo");
		assertSame("foo", getFixture().getName());
	}

	@Override
	public void testGetQualifier() {
		assertNull(getFixture().getQualifier());
		AsdocPackage pack = AsdocEFactory.eINSTANCE.createAsdocPackage();
		pack.setCanonicalName("foo.bar");
		pack.getTypes().add(getFixture());
		assertEquals("foo.bar", getFixture().getQualifier());
	}
	public void testGetCanonicalName() {
		assertNull(getFixture().getCanonicalName());
		getFixture().setName("spam");
		assertEquals("spam",getFixture().getCanonicalName());
		AsdocPackage pack = AsdocEFactory.eINSTANCE.createAsdocPackage();
		pack.getTypes().add(getFixture());
		assertEquals("spam",getFixture().getCanonicalName());
		pack.setCanonicalName("foo.bar");
		assertEquals("foo.bar::spam", getFixture().getCanonicalName());
	}
} //AsdocTypeTest
