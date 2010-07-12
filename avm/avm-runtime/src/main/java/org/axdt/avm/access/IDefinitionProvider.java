package org.axdt.avm.access;

import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IDefinitionProvider {
	/*
	 * TODO think about proper protocol
	 * i can think of 3 information sources
	 *  * as source files - wich uses normal file: or resource: protocol
	 *  * parsed asdoc asdoc: or asdoc+as3:
	 *  * swc manifest swc: or swc+as3:
	 *  * use avm: for external as info
	 */
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
