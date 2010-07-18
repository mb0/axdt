package org.axdt.avm.access;

import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IDefinitionProvider {

	String PROTOCOL = "avm";
	/**
	 * Find a type by its fully qualified name, e.g. flash.display::Sprite
	 */
	AvmType findTypeByName(String name) throws DefinitionNotFoundException;
	AvmMember findMemberByName(String name) throws DefinitionNotFoundException;
	Iterable<AvmDefinition> findDefinitions(String name);
	
	/**
	 * Returns the resource set that will contain dynamically created resources.
	 * @return the resource set.
	 */
	ResourceSet getResourceSet();
	
	interface Factory {
		
		IDefinitionProvider createDefinitionProvider(ResourceSet resourceSet);
		
		IDefinitionProvider findDefinitionProvider(ResourceSet resourceSet);
		
		IDefinitionProvider createDefinitionProvider();
		
	}
}
