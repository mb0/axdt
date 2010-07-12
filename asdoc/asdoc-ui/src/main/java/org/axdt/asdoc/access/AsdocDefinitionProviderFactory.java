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
