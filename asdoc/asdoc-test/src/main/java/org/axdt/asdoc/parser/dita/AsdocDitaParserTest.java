/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.dita;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.parser.AsdocParserTest;
import org.axdt.asdoc.parser.AsdocXmlHelper;
import org.axdt.asdoc.util.DitaUrlHelper;
import org.w3c.dom.Node;

import com.google.common.collect.Lists;

public class AsdocDitaParserTest extends AsdocParserTest {

	public AsdocDitaParserTest() {
		super("testdocs.zip!/dita/");
	}

	protected AsdocDitaParser createParser() {
		return new AsdocDitaParser();
	}

	public void testReadXml() throws Exception {
		Node node = new AsdocXmlHelper().readXML(testDocUri
				+ DitaUrlHelper.PACKAGE_LIST);
		assertNotNull(node);
		Node child = node.getFirstChild();
		assertEquals("apiMap", child.getNodeName());
		Node ref = child.getFirstChild();
		assertEquals("apiItemRef", ref.getNodeName());
		assertEquals("foo.bar.xml", ref.getAttributes().getNamedItem("href")
				.getNodeValue());
	}

	public void testParserNoop() throws Exception {
		AsdocRoot root = createRoot();
		assertNotNull(root);
		assertNotNull(root.eContents());
		assertEquals(0, root.eContents().size());
	}

	public void testPackageLevel() throws Exception {
		AsdocRoot root = createRoot();
		CollectPackages collectPackages = new CollectPackages();
		assertPackageLevelResult(collectPackages.collectPackages(root));
		assertPackageLevelRoot(root);
	}

	public void testTypeLevel() throws Exception {
		AsdocRoot root = createRoot();
		createParser().parseDoc(root, ParseLevel.TYPE);
		assertTypeLevelResult(root);
	}

	public void testGlobalLevel() throws Exception {
		AsdocRoot root = createRoot();
		CollectTypes collectTypes = new CollectTypes();
		AsdocPackage pack = root.createPackage("foo.globals");
		collectTypes.collectGlobals(pack);
		assertGlobalLevel(pack);
	}

	public void testCollectDetail() throws Exception {
		AsdocRoot root = createRoot();
		CollectTypes collectTypes = new CollectTypes();
		assertEqualsNames(Lists.newArrayList("Application"),
				collectTypes.collectDetails(root));
		assertEqualsNames(Lists.newArrayList("Application"), root.getTypes());
	}

	public void testMemberLevel() throws Exception {
		AsdocRoot root = createRoot();
		CollectTypes collectTypes = new CollectTypes();
		AsdocPackage pack = root.createPackage("foo.members");
		AsdocType type = collectTypes
				.collectMembers(createType(pack, "Members"));
		assertMemberLevel(type.getMembers(), false);

		type = collectTypes.collectMembers(createType(pack, "StaticMembers"));
		assertMemberLevel(type.getMembers(), true);
	}

	public void testMemberLevelInheritance() throws Exception {
		AsdocRoot root = createRoot();
		CollectTypes collectTypes = new CollectTypes();
		AsdocPackage pack = root.createPackage("foo.bar");

		AsdocType type = collectTypes.collectMembers(createType(pack, "Bar"));
		assertTypeLevelInheritance_Bar(type);

		type = collectTypes.collectMembers(createType(pack, "SuperBar"));
		assertTypeLevelInheritance_SuperBar(type);
	}
}
