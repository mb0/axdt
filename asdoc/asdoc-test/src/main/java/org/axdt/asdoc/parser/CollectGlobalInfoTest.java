package org.axdt.asdoc.parser;

import java.util.ArrayList;

import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.model.AvmGeneric;
import org.axdt.avm.model.AvmVisibility;
import org.axdt.avm.model.AvmVoid;

import com.google.common.collect.Lists;


public class CollectGlobalInfoTest extends AbstractCollectorTest {
	public void testFlexGlobal() throws Exception {
		CollectGlobalInfo parser = new CollectGlobalInfo();
		AsdocRoot root =  createRoot("flex4");
		parser.collectGlobalInfo(root);
		assertNotNull(root.getMembers());
		assertFalse(root.getMembers().isEmpty());
	}
	public void testParseList() throws Exception {
		ArrayList<String> expectedNames = Lists.newArrayList("globalConst","globalMethod","globalVar");
		ArrayList<Class<?>> expectedMembersClass = Lists.<Class<?>>newArrayList(
				AsdocField.class, AsdocOperation.class, AsdocField.class);

		CollectGlobalInfo parser = new CollectGlobalInfo();
		AsdocRoot root = createRoot("simple");
		AsdocPackage pack = root.createPackage("foo.globals");
		parser.collectGlobalInfo(pack);
		
		assertEquals(3, pack.getMembers().size());
		assertMemberNamesList(expectedNames, pack.getMembers());
		assertEqualsTypes(expectedMembersClass, pack.getMembers());
		
		AsdocField constant = (AsdocField) pack.getMembers().get(0);
		assertTrue(constant.isConstant());
		assertFalse(constant.isStatic());
		assertEquals("global const", constant.getAsdoc());
		assertEquals(AvmVisibility.PUBLIC, constant.getVisibility());
		assertTrue(constant.getType().getType() instanceof AvmGeneric);
		assertFalse(constant.getType().eIsProxy());
		
		AsdocOperation operation = (AsdocOperation) pack.getMembers().get(1);
		assertFalse(operation.isFinal()
				&& operation.isNative()
				&& operation.isOverride());
		assertEquals(0,operation.getParameters().size());
		assertEquals(pack, operation.eContainer());
		assertEquals("foo.globals::globalMethod", operation.getCanonicalName());
		assertSame(pack, operation.eContainer());
		assertEquals("global method", operation.getAsdoc());
		assertEquals(AvmVisibility.PUBLIC, operation.getVisibility());
		assertTrue(operation.getReturnType().getType() instanceof AvmVoid);
		assertFalse(operation.getReturnType().eIsProxy());
		
		AsdocField property = (AsdocField) pack.getMembers().get(2);
		assertFalse(property.isConstant()
				&& property.isStatic());
		assertEquals(AvmVisibility.PUBLIC, property.getVisibility());
		assertEquals("global var", property.getAsdoc());
		assertTrue(property.getType().getType() instanceof AvmGeneric);
		assertFalse(property.getType().eIsProxy());
	}
}
