/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import org.axdt.asdoc.AsdocEFactory;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asdoc Member</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class AsdocMemberTest extends AsdocDefinitionTest {

	/**
	 * Constructs a new Asdoc Member test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocMemberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asdoc Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AsdocMember getFixture() {
		return (AsdocMember)fixture;
	}

	public void testGetFullUri_Root() {
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot();
		root.setParseType(ParseType.HTML);
		root.setBaseUri("file://tmp/test/");
		root.getMembers().add(getFixture());
		assertNull(getFixture().getFullUri());
		getFixture().setName("naMe");
		assertEquals("file://tmp/test/package.html"+expectedNamePart("naMe"),getFixture().getFullUri());
		root.getMembers().remove(getFixture());
		assertNull(getFixture().getFullUri());
		AsdocType type = AsdocEFactory.eINSTANCE.createAsdocClass();
		type.setName("Test");
		type.getMembers().add(getFixture());
	}
	public void testGetFullUri_Package() {
		getFixture().setName("naMe");
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot();
		root.setParseType(ParseType.HTML);
		root.setBaseUri("file://tmp/test/");
		AsdocPackage pack = root.createPackage("foo.bar");
		pack.getMembers().add(getFixture());
		assertEquals("file://tmp/test/foo/bar/package.html"+expectedNamePart("naMe"),getFixture().getFullUri());
	}
	public void testGetFullUri_Root_Type() {
		getFixture().setName("naMe");
		assertNull(getFixture().getFullUri());
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot();
		root.setParseType(ParseType.HTML);
		root.setBaseUri("file://tmp/test/");
		AsdocType type = AsdocEFactory.eINSTANCE.createAsdocClass();
		type.setName("Test");
		type.getMembers().add(getFixture());
		assertNull(getFixture().getFullUri());
		root.getTypes().add(type);
		assertEquals("file://tmp/test/Test.html"+expectedNamePart("naMe"),getFixture().getFullUri());
	}
	public void testGetFullUri_Type() {
		getFixture().setName("naMe");
		assertNull(getFixture().getFullUri());
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot();
		root.setParseType(ParseType.HTML);
		root.setBaseUri("file://tmp/test/");
		AsdocPackage pack = root.createPackage("org.nicegui");
		AsdocType type = AsdocEFactory.eINSTANCE.createAsdocClass();
		type.setName("Test");
		pack.getTypes().add(type);
		type.getMembers().add(getFixture());
		assertEquals("file://tmp/test/org/nicegui/Test.html"+expectedNamePart("naMe"),getFixture().getFullUri());
	}
	protected String expectedNamePart(String name) {
		return "#"+ name;
	}
	public void testGetCanonicalName() {
		super.testGetCanonicalName();
		getFixture().setName("test");
		assertEquals("test", getFixture().getCanonicalName());
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot();
		AsdocPackage pack = root.createPackage("foo.bar");
		pack.getMembers().add(getFixture());
		assertEquals("foo.bar::test", getFixture().getCanonicalName());
		pack.getMembers().remove(getFixture());
		assertEquals("test", getFixture().getCanonicalName());
		AsdocType type = AsdocEFactory.eINSTANCE.createAsdocClass();
		type.setName("Test");
		type.getMembers().add(getFixture());
		assertEquals("Test#test", getFixture().getCanonicalName());
		pack.getTypes().add(type);
		assertEquals("foo.bar::Test#test", getFixture().getCanonicalName());
	}
} //AsdocMemberTest
