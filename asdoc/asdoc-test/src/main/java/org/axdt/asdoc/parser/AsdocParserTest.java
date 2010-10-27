/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocConstructor;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.parser.dita.CollectTypes;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmGeneric;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVisibility;
import org.axdt.avm.model.AvmVoid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import static org.axdt.asdoc.parser.AsdocTestHelper.createAsdoc;
import static org.axdt.asdoc.parser.AsdocTestHelper.getTestDocUri;

public abstract class AsdocParserTest extends TestCase {
	protected final String testDocUri;

	public AsdocParserTest(String part) {
		super();
		testDocUri = getTestDocUri(part);
	}

	protected AsdocRoot createRoot() {
		return createAsdoc(testDocUri);
	}
	protected abstract AsdocParser createParser();

	public abstract void testPackageLevel() throws Exception;

	public abstract void testTypeLevel() throws Exception;

	public abstract void testGlobalLevel() throws Exception;

	public abstract void testMemberLevel() throws Exception;

	public abstract void testMemberLevelInheritance() throws Exception;

	public void testGetProxyURI() throws Exception {
		CollectTypes collectTypes = new CollectTypes();
		assertNull(collectTypes.getProxyURI(null));
		assertNull(collectTypes.getProxyURI(""));
		assertNull(collectTypes.getProxyURI("*"));
		assertNull(collectTypes.getProxyURI("void"));
		assertEquals("avm:/lookup/Foo", collectTypes.getProxyURI("Foo")
				.toString());
		assertEquals("avm:/types/spam.egg::Foo",
				collectTypes.getProxyURI("spam.egg::Foo").toString());
		// TODO introduce parameterized type references
		assertEquals("avm:/lookup/Vector",
				collectTypes.getProxyURI("Vector.<String>").toString());
	}

	protected void assertPackageLevelResult(Iterable<AsdocPackage> packs) {
		assertEqualsQNames(
				Lists.newArrayList("", "foo.bar", "foo.globals", "foo.members"),
				packs);
	}

	protected void assertPackageLevelRoot(AsdocRoot root) {
		assertFalse(root.eContents().isEmpty());
		assertEquals(1, root.getPackages().size());
		assertEquals("foo", root.getPackages().get(0).getName());
		assertEquals(3, root.getPackages().get(0).getPackages().size());
	}

	protected void assertTypeLevelResult(AsdocRoot root) {
		assertEqualsNames(Lists.newArrayList("Application"), root.getTypes());
		AsdocPackage foo = root.getPackages().get(0);
		assertTrue(foo.getTypes().isEmpty());
		assertEqualsNames(Lists.newArrayList("Bar", "IBar", "IBar2",
				"ISuperBar", "SuperBar"), foo.getPackages().get(0).getTypes());
		assertTrue(foo.getPackages().get(1).getTypes().isEmpty());
		assertEqualsNames(Lists.newArrayList("Members", "StaticMembers"), foo
				.getPackages().get(2).getTypes());
	}

	protected void assertGlobalLevel(AsdocPackage pack) throws Exception {
		EList<AsdocMember> members = pack.getMembers();
		assertEqualsNames(
				Lists.newArrayList("globalConst", "globalMethod", "globalVar"),
				members);
		assertEqualsTypes(Lists.<Class<?>> newArrayList(AsdocField.class,
				AsdocOperation.class, AsdocField.class), members);

		AsdocField constant = (AsdocField) pack.getMembers().get(0);
		assertPublic(constant, "global const", false);
		assertField(constant, "*", true);

		AsdocOperation operation = (AsdocOperation) members.get(1);
		assertPublic(operation, "global method", false);
		assertFalse(operation.isFinal() || operation.isNative()
				|| operation.isOverride());
		assertEquals("foo.globals::globalMethod", operation.getCanonicalName());
		assertEquals(0, operation.getParameters().size());
		assertTrue(operation.getReturnType().getType() instanceof AvmVoid);
		assertFalse(operation.getReturnType().eIsProxy());

		AsdocField property = (AsdocField) pack.getMembers().get(2);
		assertPublic(property, "global var", false);
		assertField(property, "*", false);
	}

	protected void assertTypeLevelInheritance_Bar(AsdocType type)
			throws Exception {
		Iterator<AvmTypeReference> superTypes = type.getSuperTypes().iterator();
		assertTypeProxy(superTypes.next().getType(), "foo.bar::SuperBar");
		assertTypeProxy(superTypes.next().getType(), "foo.bar::IBar");
		assertTypeProxy(superTypes.next().getType(), "foo.bar::IBar2");
		assertTypeProxy(superTypes.next().getType(),
				"flash.display::IBitmapDrawable");
		assertFalse(superTypes.hasNext());
	}

	protected void assertTypeLevelInheritance_SuperBar(AsdocType type)
			throws Exception {
		Iterator<AvmTypeReference> superTypes = type.getSuperTypes().iterator();
		assertTypeProxy(superTypes.next().getType(), "Object");
		assertFalse(superTypes.hasNext());
	}

	protected void assertMemberLevel(List<AsdocMember> list, boolean statix)
			throws Exception {
		List<String> names = Lists.newArrayList("Members", "NAME", "getter",
				"hidden", "name", "property", "run", "setter", "work");
		List<Class<?>> types = Lists
				.<Class<?>> newArrayList(AsdocConstructor.class,
						AsdocField.class, AsdocProperty.class,
						AsdocField.class, AsdocField.class,
						AsdocProperty.class, AsdocOperation.class,
						AsdocProperty.class, AsdocOperation.class);
		if (statix) {
			names.remove(0);
			types.remove(0);
		}
		assertEqualsNames(names, list);
		assertEqualsTypes(types, list);
		int i = 0;

		if (!statix) {
			AsdocConstructor memConst = (AsdocConstructor) list.get(i++);
			assertPublic(memConst, "constructor", false);
		}

		AsdocField constField = (AsdocField) list.get(i++);
		assertPublic(constField, "const Name", statix);
		assertField(constField, "String", true);

		AsdocProperty getter = (AsdocProperty) list.get(i++);
		assertProtected(getter, "getter getter", statix);
		assertField(getter, "String", false);
		assertTrue(getter.isReadonly());
		assertFalse(getter.isWriteonly());

		AsdocField hiddenField = (AsdocField) list.get(i++);
		assertProtected(hiddenField, "var hidden", statix);
		assertField(hiddenField, "Boolean", false);

		AsdocField nameField = (AsdocField) list.get(i++);
		assertPublic(nameField, "var name", statix);
		assertField(nameField, "String", false);

		AsdocProperty property = (AsdocProperty) list.get(i++);
		assertPublic(property, "getter property", statix);
		assertField(property, "String", false);
		assertFalse(property.isReadonly());
		assertFalse(property.isWriteonly());

		AsdocOperation runOp = (AsdocOperation) list.get(i++);
		assertPublic(runOp, "function run", statix);

		AsdocProperty setter = (AsdocProperty) list.get(i++);
		assertProtected(setter, "setter setter", statix);
		assertField(setter, "String", false);
		assertFalse(setter.isReadonly());
		assertTrue(setter.isWriteonly());

		AsdocOperation workOp = (AsdocOperation) list.get(i++);
		assertProtected(workOp, "function work", statix);
	}
	protected void assertEqualsElements(Iterable<?> expected, Iterator<?> list) {
		for (Object ex:expected) {
			assertEquals(ex, list.hasNext() ? list.next() : null);
		}
		assertFalse(list.hasNext());
	}
	protected void assertEqualsElements(Iterable<?> expected, Iterable<?> list) {
		assertEqualsElements(expected, list.iterator());
	}
	protected void assertEqualsTypes(List<Class<?>> expected, List<? extends EObject> list) {
		int size = expected.size();
		assertEquals(size, list.size());
		for (int i = 0; i < size; i++) {
			assertTrue("expected "+expected.get(i).getCanonicalName()+" got "+list.get(i).getClass().getCanonicalName(),
					expected.get(i).isInstance(list.get(i)));
		}
	}

	protected void assertEqualsNames(List<String> expected, List<? extends AvmIdentifiable> list) {
		assertEqualsElements(expected, Lists.transform(list, new Function<AvmIdentifiable, String>() {
			public String apply(AvmIdentifiable from) {
				return from.getName();
			}
		}));
	}

	protected void assertEqualsQNames(Iterable<String> expected, Iterable<? extends AvmDefinition> list) {
		assertEqualsQNames(expected, list.iterator());
	}

	protected void assertEqualsQNames(Iterable<String> expected, Iterator<? extends AvmDefinition> list) {
		assertEqualsElements(expected, Iterators.transform(list, new Function<AvmDefinition, String>() {
			public String apply(AvmDefinition from) {
				return from.getCanonicalName();
			}
		}));
	}
	protected void assertField(AsdocField field, String type, boolean constant) throws Exception {
		assertEquals(constant, field.isConstant());
		assertTypeProxy(field.getType().getType(), type);
	}

	protected void assertPublic(AsdocMember member, String asdoc, boolean stat) {
		assertMember(member, asdoc, AvmVisibility.PUBLIC, stat);
	}

	protected void assertProtected(AsdocMember member, String asdoc, boolean stat) {
		assertMember(member, asdoc, AvmVisibility.PROTECTED, stat);
	}

	protected void assertMember(AsdocMember member, String asdoc, AvmVisibility visibility,
			boolean stat) {
		assertEquals(visibility, member.getVisibility());
		assertEquals(stat, member.isStatic());
		assertEquals(asdoc, member.getAsdoc());
	}

	protected void assertTypeProxy(AvmType type, String expectedName)
			throws Exception {
		assertNotNull(type);
		if (expectedName.equals("*")||expectedName.equals("")) {
			assertTrue(type instanceof AvmGeneric);
			assertFalse(type.eIsProxy());
		} else if (expectedName.equals("void")) {
			assertTrue(type instanceof AvmVoid);
			assertFalse(type.eIsProxy());
		} else {
			assertTrue(type.eIsProxy());
			URI eProxyURI = ((InternalEObject) type).eProxyURI();
			assertEquals("avm:/types/" + expectedName, eProxyURI.toString());
		}
	}

	protected AsdocType createType(AsdocPackage pack, String name) {
		AsdocType type = AsdocEFactory.eINSTANCE.createAsdocClass();
		type.setName(name);
		pack.getTypes().add(type);
		return type;
	}
}
