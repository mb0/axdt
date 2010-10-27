/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public abstract class AbstractDefinitionProviderFactory implements IDefinitionProvider.Factory {

	public IDefinitionProvider findDefinitionProvider(ResourceSet resourceSet) {
		if (resourceSet == null)
			throw new IllegalArgumentException("resourceSet may not be null.");
		return (IDefinitionProvider) resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().get(IDefinitionProvider.PROTOCOL);
	}

	public IDefinitionProvider createDefinitionProvider() {
		return createDefinitionProvider(new ResourceSetImpl());
	}

}
