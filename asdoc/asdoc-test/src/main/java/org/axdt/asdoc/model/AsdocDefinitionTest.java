/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.avm.naming.AvmQualifiedName;
import org.eclipse.xtext.naming.QualifiedName;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifier() <em>Get Qualifier</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getCanonicalName() <em>Get Canonical Name</em>}</li>
 *   <li>{@link org.axdt.avm.model.AvmDefinition#getQualifiedName() <em>Get Qualified Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AsdocDefinitionTest extends AsdocElementTest {

	/**
	 * Constructs a new Asdoc Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocDefinition getFixture() {
		return (AsdocDefinition)fixture;
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

	public void testGetName() {
		assertNull(getFixture().getName());
	}
	
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
		AsdocPackage pack = AsdocEFactory.eINSTANCE.createAsdocPackage();
		pack.setQualifiedName(AvmQualifiedName.create("foo","bar"));
		getFixture().setName("spam");
		if (getFixture() instanceof AsdocMember) {
			pack.getMembers().add((AsdocMember) getFixture());
			assertEquals(QualifiedName.create("foo","bar","spam"),getFixture().getQualifiedName());
		} else if (getFixture() instanceof AsdocType) {
			pack.getTypes().add((AsdocType) getFixture());
			assertEquals(QualifiedName.create("foo","bar","spam"),getFixture().getQualifiedName());
		} else {
			assertEquals(QualifiedName.create("spam"),getFixture().getQualifiedName());
		}
	}
} //AsdocDefinitionTest
