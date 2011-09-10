/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import java.util.Map;

import org.axdt.avm.access.AvmAccess;
import org.axdt.avm.access.AvmResourceFactory;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class AsdocResourceFactoryProvider implements AvmResourceFactory.Provider {

	protected final IDocRootProvider docRootProvider;

	@Inject
	public AsdocResourceFactoryProvider(IDocRootProvider docProvider) {
		this.docRootProvider = docProvider;
	}

	public AvmResourceFactory provideFactory(ResourceSet resourceSet) {
		if (resourceSet == null)
			throw new IllegalArgumentException("resourceSet may not be null.");
		Registry registry = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> factoryMap = registry.getProtocolToFactoryMap();
		if (!factoryMap.containsKey(AvmAccess.PROTOCOL))
			factoryMap.put(AvmAccess.PROTOCOL, createFactory(resourceSet));
		return (AvmResourceFactory) factoryMap.get(AvmAccess.PROTOCOL);
	}
	
	protected AsdocResourceFactory createFactory(ResourceSet resourceSet) {
		AsdocResourceFactory result = new AsdocResourceFactory(docRootProvider, resourceSet);
		return result;
	}
}
