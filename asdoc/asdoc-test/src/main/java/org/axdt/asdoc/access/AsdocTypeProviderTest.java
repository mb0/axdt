package org.axdt.asdoc.access;

import java.util.Map;

import junit.framework.TestCase;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.parser.AbstractCollectorTest;
import org.axdt.asdoc.parser.AsdocParser;
import org.axdt.avm.access.AvmResource;
import org.axdt.avm.access.IDefinitionProvider;
import org.axdt.avm.access.IMirror;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.common.collect.Lists;

public class AsdocTypeProviderTest extends TestCase implements IDocRootProvider {
	protected String dataFolder;
	
	private ResourceSet resourceSet;
	private AsdocDefinitionProvider typeProvider;
	private AsdocRoot asdocRoot;
	
	public AsdocTypeProviderTest() throws Exception {
		dataFolder = AbstractCollectorTest.getTestDocUri();
		AsdocParser asdocParser = new AsdocParser();
		asdocRoot = AsdocEFactory.eINSTANCE.createDocRoot(dataFolder);
		asdocRoot = asdocParser.parseDoc(asdocRoot, ParseLevel.MEMBER);
	}
	public Iterable<AsdocRoot> initializeAsdocs(Object[] docItems) {
		return Lists.newArrayList(asdocRoot);
	}
	public Iterable<AsdocRoot> getDocRoots(ResourceSet resourceSet) {
		return Lists.newArrayList(asdocRoot);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		resourceSet = new ResourceSetImpl();
		typeProvider = new AsdocDefinitionProvider(this, resourceSet);
	}

	@Override
	protected void tearDown() throws Exception {
		resourceSet = null;
		typeProvider = null;
		super.tearDown();
	}
	
	public void testSetup() {
		Map<String, Object> map = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap();
		assertSame(typeProvider, map.get(IDefinitionProvider.PROTOCOL));
	}

	public void testCreateResourceWithProvider() throws Exception {
		URI testUri = URI.createURI("avm:/types/Application");
		AvmResource resource = typeProvider.createResource(testUri);
		assertNotNull(resource);
		assertFalse(resource.isLoaded());
		// resource will stay empty
		assertTrue(resource.getFallback().getContents().isEmpty());
		// mirror is already linked
		assertFalse(resource.getContents().isEmpty());
	}
	public void testCreateResourceWithSet() throws Exception {
		URI testUri = URI.createURI("avm:/types/Application");
		AvmResource resource = (AvmResource) resourceSet.createResource(testUri);
		assertNotNull(resource);
		assertFalse(resource.isLoaded());
		assertFalse(resource.getContents().isEmpty());
		assertTrue(resource.getFallback().getContents().isEmpty());
	}
	public void testGetResource() throws Exception {
		URI testUri = URI.createURI("avm:/types/Application");
		Resource resource = resourceSet.getResource(testUri, false);
		assertNull(resource);
	}
	public void testGetResourceLoad() throws Exception {
		URI testUri = URI.createURI("avm:/types/Application");
		AvmResource resource = (AvmResource) resourceSet.getResource(testUri, true);
		assertNotNull(resource);
		assertTrue(resource.isLoaded());
		assertFalse(resource.getContents().isEmpty());
	}
	public void testGetResourceLoadExists() throws Exception {
		URI testUri = URI.createURI("avm:/types/Application");
		Resource created = resourceSet.createResource(testUri);
		Resource resource = resourceSet.getResource(testUri, false);
		assertSame(created, resource);
		assertFalse(resource.isLoaded());
		assertFalse(resource.getContents().isEmpty());
	}
	public void testCreateMirror() throws Exception {
		URI uri = URI.createURI("avm:/types/Application");
		IMirror mirror = typeProvider.createMirror(uri);
		assertNotNull(mirror);
		assertTrue(mirror instanceof AsdocMirror);
		assertEquals("Application", ((AsdocMirror) mirror).getMirroredType().getCanonicalName());
	}
}
