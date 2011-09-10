/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import java.util.Map;

import junit.framework.TestCase;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.access.AvmAccess;
import org.axdt.avm.access.AvmResource;
import org.axdt.avm.access.AvmMirror;
import org.axdt.avm.access.AvmResourceFactory;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmNull;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class AsdocResourceFactoryTest extends TestCase {
	private ResourceSet resourceSet;
	private AvmResourceFactory resourceFactory;
	private MockAsdocRootProvider rootProvider;
	
	public AsdocResourceFactoryTest() throws Exception {
		rootProvider = MockAsdocRootProvider.getInstance();
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		resourceSet = new ResourceSetImpl();
		AsdocResourceFactoryProvider provider = new AsdocResourceFactoryProvider(rootProvider);
		resourceFactory = provider.provideFactory(resourceSet);
	}

	@Override
	protected void tearDown() throws Exception {
		resourceSet = null;
		resourceFactory = null;
		super.tearDown();
	}
	
	public void testSetup() {
		Map<String, Object> map = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap();
		assertSame(resourceFactory, map.get(AvmAccess.PROTOCOL));
	}

	public void testCreateResourceWithProvider() throws Exception {
		URI testUri = URI.createURI("avm:/types/Application");
		AvmResource resource = resourceFactory.createResource(testUri);
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
		AvmMirror mirror = resourceFactory.createMirror(uri);
		assertNotNull(mirror);
		assertTrue(mirror instanceof AsdocMirror);
		assertEquals("Application", ((AsdocMirror) mirror).getMirroredType().getCanonicalName());
	}
	
	public void testResolve() throws Exception {
		AvmNull proxy = AvmEFactory.eINSTANCE.createAvmNull();
		URI uri = URI.createURI("avm:/types/foo.bar.Bar");
		((InternalEObject) proxy).eSetProxyURI(uri);
		AvmDeclaredTypeReference ref = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		ref.setType(proxy);
		// no resource set
		ResourceSet set = null;
		assertSame(proxy, EcoreUtil.resolve(proxy, set));
		// with unsupported resource set
		set = new ResourceSetImpl();
		assertSame(proxy, EcoreUtil.resolve(proxy, set));
		// with supported resource set
		EObject resolved = EcoreUtil.resolve(proxy, resourceSet);
		assertNotSame(proxy, resolved);
		
		AvmDeclaredType type = (AvmDeclaredType) resolved;
		AvmType superProxy = type.getExtendedClass().getType();
		// fails to resolve because it uses the asdoc resourceSet
		EcoreUtil.resolveAll(type);
		assertSame(superProxy, type.getExtendedClass().getType());
		// this works because we use an avm aware resource set
		EObject resolvedSuper = EcoreUtil.resolve(superProxy, resourceSet);
		assertNotSame(superProxy, resolvedSuper);
		// but the resolved type will not be saved in the asdoc resource
		assertSame(superProxy, type.getExtendedClass().getType());
	}
}
