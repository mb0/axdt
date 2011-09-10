/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.html;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.parser.AsdocParser;
import org.axdt.asdoc.parser.AsdocParserTest;
import org.axdt.asdoc.util.AsdocEXMLProcessor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


public class AsdocHtmlParserTest extends AsdocParserTest {
	public AsdocHtmlParserTest() {
		super("testdocs.zip!/html/");
	}
	protected AsdocParser createParser() {
		return new AsdocHtmlParser();
	}
	
	public void testParserNoop() throws Exception {
		AsdocRoot root = createRoot();
		assertNotNull(root);
		assertNotNull(root.eContents());
		assertEquals(0, root.eContents().size());
	}

	public void testParser() throws Exception {
		AsdocParser parser = createParser();
		AsdocRoot root = createRoot();
		parser.parseDoc(root, ParseLevel.MEMBER);
		assertFalse(0 == root.eContents().size());
	}

	public void testSaveParseResult() throws Exception {
		AsdocParser parser = createParser();
		AsdocRoot root = createRoot();
		parser.parseDoc(root, ParseLevel.MEMBER);
		ResourceSet set = new AsdocEXMLProcessor().createResourceSet();
		Resource resource = set.createResource(URI.createURI("file:/tmp/axdt-test/foo.asdoc"));
		resource.getContents().add(root);
		resource.save(null);
	}
	public void testPackageLevel() throws Exception {
		CollectPackageList parser = new CollectPackageList();
		assertPackageLevelResult(parser.collectPackages(createRoot(), false));
		AsdocRoot root = createRoot();
		assertPackageLevelResult(parser.collectPackages(root, true));
		assertPackageLevelRoot(root);
	}
	
	public void testTypeLevel() throws Exception {
		AsdocRoot root = createRoot();
		createParser().parseDoc(root, ParseLevel.TYPE);
		assertTypeLevelResult(root);
	}

	public void testGlobalLevel() throws Exception {
		AsdocRoot root = createRoot();
		CollectTypeInfo collectTypes = new CollectTypeInfo();
		AsdocPackage pack = root.createPackage("foo.globals");
		collectTypes.collectGlobalInfo(pack);
		assertGlobalLevel(pack);
	}

	public void testMemberLevel() throws Exception {
		AsdocRoot root = createRoot();
		CollectTypeInfo collectTypes = new CollectTypeInfo();
		AsdocPackage pack = root.createPackage("foo.members");
		
		AsdocType type = collectTypes
				.collectType(createType(pack, "Members"));
		assertMemberLevel(type.getMembers(), false);

		type = collectTypes.collectType(createType(pack, "StaticMembers"));
		assertMemberLevel(type.getMembers(), true);
	}
	public void testMemberLevelInheritance() throws Exception {
		AsdocRoot root = createRoot();
		CollectTypeInfo collectTypes = new CollectTypeInfo();
		AsdocPackage pack = root.createPackage("foo.bar");

		AsdocType type = collectTypes.collectType(createType(pack, "Bar"));
		assertTypeLevelInheritance_Bar(type);

		type = collectTypes.collectType(createType(pack, "SuperBar"));
		assertTypeLevelInheritance_SuperBar(type);
	}

	public void testParseTypeName() throws Exception {
		CollectTypeInfo parser = new CollectTypeInfo();
		assertEquals(null, parser.parseTypeName(null, null));
		assertEquals(null, parser.parseTypeName("     ", null));
		assertEquals("flash.events.EventDispatcher", parser.parseTypeName(
				" flash.events.EventDispatcher ", null
		));
		assertEquals("Object", parser.parseTypeName(
				" Object ", null
		));
		assertEquals("asunit.framework.Test", parser.parseTypeName(
				" Test.html ", "asunit.framework"
		));
		assertEquals("asunit.framework.Test", parser.parseTypeName(
				" ../framework/Test.html ", "asunit.textui"
		));
		assertEquals("asunit.framework.Test", parser.parseTypeName(
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
	public void testCollectPackageList_getFQN() throws Exception {
		CollectPackageList parser = new CollectPackageList();
		assertNull(parser.getFQN(null));
		assertNull(parser.getFQN("fooooo"));
		assertEquals("flash.utils",
				parser.getFQN("flash/utils/package-detail.html"));
		assertEquals("flash.utils", parser.getFQN("javascript:"
				+ "savePackageListScrollTop();void window.open(baseRef + "
				+ "'flash/utils/package-detail.html', '_self');"));
	}
}
