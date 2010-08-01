/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import org.axdt.avm.access.AbstractDefinitionProviderFactory;
import org.axdt.avm.access.IAxdtProjectProvider;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class AsdocDefinitionProviderFactory extends AbstractDefinitionProviderFactory {

	private final IDocRootProvider docRootProvider;

	@Inject
	public AsdocDefinitionProviderFactory(IAxdtProjectProvider projectProvider, IDocRootProvider docProvider) {
		this.docRootProvider = docProvider;
	}
	
	public IAsdocDefinitionProvider createDefinitionProvider(ResourceSet resourceSet) {
		IAsdocDefinitionProvider result = new AsdocDefinitionProvider(docRootProvider, resourceSet);
		return result;
	}
}
