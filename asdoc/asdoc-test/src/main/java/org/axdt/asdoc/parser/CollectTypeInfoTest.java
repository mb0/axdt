package org.axdt.asdoc.parser;

import java.util.Iterator;
import java.util.List;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocClass;
import org.axdt.asdoc.model.AsdocConstructor;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.util.AsdocEResourceFactoryImpl;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.collect.Lists;

public class CollectTypeInfoTest extends AbstractCollectorTest {
	private AsdocRoot root;
	private AsdocPackage memPack;
	private CollectTypeInfo parser;

	public CollectTypeInfoTest() {
		root = createRoot("simple");
		memPack = root.createPackage("foo.members");
		parser = new CollectTypeInfo();
	}
	public void testGetProxyURI() throws Exception {
		assertNull(parser.getProxyURI(null));
		assertNull(parser.getProxyURI(""));
		assertNull(parser.getProxyURI("*"));
		assertNull(parser.getProxyURI("void"));
		assertEquals("avm:/lookup/Foo",parser.getProxyURI("Foo").toString());
		assertEquals("avm:/types/spam.egg::Foo",parser.getProxyURI("spam.egg::Foo").toString());
		// TODO introduce parameterized type references
		assertEquals("avm:/lookup/Vector",parser.getProxyURI("Vector.<String>").toString());
	}
	
	public void testFlex4Members() throws Exception {
		AsdocRoot root = createRoot("flex4");
		AsdocClass class1 = AsdocEFactory.eINSTANCE.createAsdocClass();
		class1.setName("Array");
		root.getTypes().add(class1);
		AvmDeclaredType type = parser.collectType(class1);
		assertNotNull(type.getMembers());
		assertFalse(type.getMembers().isEmpty());
		assertTrue(type.isDynamic());
	}
	
	public void testMembers() throws Exception {
		
		AvmDeclaredType type = parser.collectType(createType(memPack, "Members"));
		assertNotNull(type);
		
		Iterator<AvmTypeReference> superTypes = type.getSuperTypes().iterator();
		AvmTypeReference superTypeRef = superTypes.next();
		assertFalse(superTypes.hasNext());
		AvmType superType = superTypeRef.getType();
		assertNotNull(superType);
		assertTrue(superType.eIsProxy());

		assertMemberNamesList(Lists.newArrayList("name",
				"property", "Members", "run", "NAME"), type.getMembers());
		assertEqualsTypes(Lists.<Class<?>>newArrayList(
				AsdocField.class, AsdocProperty.class, AsdocConstructor.class,
				AsdocOperation.class, AsdocField.class), type.getMembers());
		
		AsdocField nameField = (AsdocField) type.getMembers().get(0);
		assertNameField(nameField, false);
		assertSame(type,nameField.eContainer());
		
		AsdocProperty property = (AsdocProperty) type.getMembers().get(1);
		assertProperty(property, false);
		assertSame(type,property.eContainer());
	}
	public void testStaticMembers() throws Exception {
		AvmDeclaredType type = parser.collectType(createType(memPack, "StaticMembers"));
		assertNotNull(type);
		assertMemberNamesList(Lists.newArrayList("name",
				"property", "run", "NAME"), type.getMembers());
		assertEqualsTypes(Lists.<Class<?>>newArrayList(
				AsdocField.class, AsdocProperty.class,
				AsdocOperation.class, AsdocField.class), type.getMembers());
		
		assertNameField((AsdocField) type.getMembers().get(0), true);
		assertProperty((AsdocProperty) type.getMembers().get(1), true);
	}

	public void testInheritance_1() throws Exception {
		AsdocPackage pack = root.createPackage("foo.bar");
		AvmDeclaredType type = parser.collectType(createType(pack, "Bar"));
		List<AvmTypeReference> superTypes = type.getSuperTypes();
		assertEquals(4, superTypes.size());
		assertTypeProxy(superTypes.get(0), "foo.bar::SuperBar");
		assertTypeProxy(superTypes.get(1), "foo.bar::IBar");
		assertTypeProxy(superTypes.get(2), "foo.bar::IBar2");
		assertTypeProxy(superTypes.get(3), "flash.display::IBitmapDrawable");
		Resource resource = new AsdocEResourceFactoryImpl().createResource(URI.createURI("file:/tmp/axdt-asdoc-test/test.asdoc"));
		resource.getContents().add(type);
		resource.save(null);
	}

	public void testInheritance_2() throws Exception {
		AsdocPackage pack = root.createPackage("foo.bar");
		AvmDeclaredType type = parser.collectType(createType(pack, "SuperBar"));
		AvmTypeReference superType = type.getExtendedClass();
		assertTypeProxy(superType, "Object");
	}
	
	public void testParseTypeName() throws Exception {
		assertEquals(null, parser.parseTypeName(null, null));
		assertEquals(null, parser.parseTypeName("     ", null));
		assertEquals("flash.events::EventDispatcher", parser.parseTypeName(
				" flash.events.EventDispatcher ", null
		));
		assertEquals("Object", parser.parseTypeName(
				" Object ", null
		));
		assertEquals("asunit.framework::Test", parser.parseTypeName(
				" Test.html ", "asunit.framework"
		));
		assertEquals("asunit.framework::Test", parser.parseTypeName(
				" ../framework/Test.html ", "asunit.textui"
		));
		assertEquals("asunit.framework::Test", parser.parseTypeName(
				" ../../asunit/framework/Test.html ", "asunit.textui"
		));
		assertEquals("Object", parser.parseTypeName(
				" ../../Object.html ", "asunit.textui"
		));
		assertEquals("Test", parser.parseTypeName(
				" ../framework/Test.html ", null
		));
		assertEquals("Assert", parser.parseTypeName(
				" http://asunit.org/docs/asunit3/asunit/framework/Assert.html ", null
		));
	}
	
	private void assertNameField(AsdocField field, boolean expectedStatic) throws Exception {
		assertEquals(expectedStatic,field.isStatic());
		assertFalse(field.isConstant());
		assertEquals(AvmVisibility.PUBLIC, field.getVisibility());
		assertTypeProxy(field.getType().getType(), "String");
		assertEquals("var name", field.getAsdoc());
	}
	
	private void assertProperty(AsdocProperty prop, boolean expectedStatic) throws Exception {
		assertEquals(expectedStatic,prop.isStatic());
		assertFalse(prop.isConstant());
		assertTypeProxy(prop.getType().getType(), "String");
		assertEquals("getter property", prop.getAsdoc());
		assertEquals(AvmVisibility.PUBLIC, prop.getVisibility());
		assertFalse(prop.isReadonly());
		assertFalse(prop.isWriteonly());
	}
	private void assertTypeProxy(AvmTypeReference ref, String expectedName) throws Exception {
		assertTypeProxy(ref.getType(), expectedName);
	}
	private void assertTypeProxy(AvmType type, String expectedName) throws Exception {
		assertNotNull(type);
		assertTrue(type.eIsProxy());
		URI eProxyURI = ((InternalEObject)type).eProxyURI();
		String expectedUri = expectedName.contains("::")
				? "avm:/types/"+expectedName
				: "avm:/lookup/"+expectedName;
		assertEquals(expectedUri, eProxyURI.toString());
	}
	private AsdocType createType(AsdocPackage pack, String name) {
		AsdocType type = AsdocEFactory.eINSTANCE.createAsdocClass();
		type.setName(name);
		pack.getTypes().add(type);
		return type;
	}
}
