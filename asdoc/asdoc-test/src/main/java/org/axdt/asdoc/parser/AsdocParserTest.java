package org.axdt.asdoc.parser;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.util.AsdocEXMLProcessor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


public class AsdocParserTest extends AbstractCollectorTest {

	public void testParseLevel() throws Exception {
		assertEquals(ParseLevel.EMPTY_VALUE,0);
		assertTrue(ParseLevel.EMPTY_VALUE < ParseLevel.PACKAGE_VALUE);
		assertTrue(ParseLevel.PACKAGE_VALUE < ParseLevel.TYPE_VALUE);
		assertTrue(ParseLevel.TYPE_VALUE < ParseLevel.MEMBER_VALUE);
		assertTrue(ParseLevel.PACKAGE.getValue()<=ParseLevel.PACKAGE_VALUE);
		assertEquals(0, 0 & ParseLevel.PACKAGE_VALUE);
		assertEquals(ParseLevel.PACKAGE_VALUE, ParseLevel.PACKAGE_VALUE & ParseLevel.PACKAGE_VALUE);
	}
	public void testParserNoop() throws Exception {
		AsdocRoot root = createRoot();
		assertNotNull(root);
		assertNotNull(root.eContents());
		assertEquals(0, root.eContents().size());
	}

	public void testParser() throws Exception {
		AsdocParser parser = new AsdocParser();
		AsdocRoot root = createRoot();
		parser.parseDoc(root, ParseLevel.MEMBER);
		assertFalse(0 == root.eContents().size());
	}

	public void testSaveParseResult() throws Exception {
		AsdocParser parser = new AsdocParser();
		AsdocRoot root = createRoot();
		parser.parseDoc(root, ParseLevel.MEMBER);
		ResourceSet set = new AsdocEXMLProcessor().createResourceSet();
		Resource resource = set.createResource(URI.createURI("file:/tmp/axdt-test/foo.asdoc"));
		resource.getContents().add(root);
		resource.save(null);
	}
}
