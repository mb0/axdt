/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.scoping;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.axdt.asdoc.access.AsdocLibrary;
import org.axdt.asdoc.access.IDocRootProvider;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.scoping.AvmLibraryScopeProvider;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.ISelectable;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class AsdocLibraryScopeProvider extends AvmLibraryScopeProvider {

	protected final IDocRootProvider docRootProvider;
	protected Map<ResourceSet,List<ISelectable>> cache;

	@Inject
	public AsdocLibraryScopeProvider(IDocRootProvider docProvider) {
		this.docRootProvider = docProvider;
		cache = new WeakHashMap<ResourceSet, List<ISelectable>>();
	}
	
	protected List<ISelectable> getLibraries(ResourceSet resourceSet) {
		List<ISelectable> result = cache.get(resourceSet);
		if (result == null) {
			result = Lists.newLinkedList();
			result.add(globals);
			for (AsdocRoot root:docRootProvider.getDocRoots(resourceSet))
				result.add(new AsdocLibrary(root));
			cache.put(resourceSet, result);
		}
		return result;
	}
}
