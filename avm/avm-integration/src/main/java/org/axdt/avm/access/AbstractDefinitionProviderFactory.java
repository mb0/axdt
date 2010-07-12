package org.axdt.avm.access;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public abstract class AbstractDefinitionProviderFactory implements IDefinitionProvider.Factory {

	public IDefinitionProvider findDefinitionProvider(ResourceSet resourceSet) {
		if (resourceSet == null)
			throw new IllegalArgumentException("resourceSet may not be null.");
		return (IDefinitionProvider) resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().get("as3");//ClassURIHelper.PROTOCOL);
	}

	public IDefinitionProvider createDefinitionProvider() {
		return createDefinitionProvider(new ResourceSetImpl());
	}

}
