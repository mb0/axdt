/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class AvmResourceFactory implements Resource.Factory {

	public static interface Provider {
		AvmResourceFactory provideFactory(ResourceSet resourceSet);
	}
	private final ResourceSet resourceSet;
	
	protected AvmResourceFactory(ResourceSet resourceSet) {
		if (resourceSet == null)
			throw new IllegalArgumentException("resourceSet may not be null");
		this.resourceSet = resourceSet;
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(AvmAccess.PROTOCOL, this);
	}
	
	public AvmResource createResource(URI uri) {
		AvmResource result = doCreateResource(uri);
		result.setMirror(createMirror(uri));
		return result;
	}

	protected AvmResource doCreateResource(URI uri) {
		return new AvmResource(uri);
	}
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public AvmMirror createMirror(URI resourceURI) {
		if (resourceURI.hasFragment())
			throw new IllegalArgumentException("Cannot create mirror for uri '" + resourceURI.toString() + "'");
		String name = resourceURI.path();
		return createMirrorForFQN(name);
	}
	protected abstract AvmMirror createMirrorForFQN(String name) throws DefinitionNotFoundException;
}
