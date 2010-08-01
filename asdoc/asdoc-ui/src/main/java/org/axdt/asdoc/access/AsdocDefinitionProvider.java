/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import java.util.Collections;
import java.util.Set;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocNamespace;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.access.AbstractDefinitionProvider;
import org.axdt.avm.access.DefinitionNotFoundException;
import org.axdt.avm.access.IMirror;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.collect.Sets;

public class AsdocDefinitionProvider extends AbstractDefinitionProvider implements IAsdocDefinitionProvider {

	private final IDocRootProvider docRootProvider;
	private Iterable<AsdocRoot> asdocRoots = null;
	
	public AsdocDefinitionProvider(IDocRootProvider docRootProvider,
			ResourceSet resourceSet) {
		super(resourceSet);
		this.docRootProvider = docRootProvider;
	}

	public Iterable<AsdocRoot> getDocRoots() {
		if (asdocRoots == null)
			asdocRoots = docRootProvider.getDocRoots(getResourceSet());
		return asdocRoots;
	}
	
	@Override
	public AvmType findTypeByName(String name) throws DefinitionNotFoundException {
		assert(name != null);
		assert(!name.startsWith("::"));
		if (name == "void")
			return AvmEFactory.eINSTANCE.createAvmVoid();
		if (name == "*")
			return AvmEFactory.eINSTANCE.createAvmGeneric();
		URI resourceUri = URI.createURI(PROTOCOL+":/types/"+name);
		Resource resource = getResourceSet().getResource(resourceUri, true);
		EObject eObject = resource.getEObject(null);
		if (eObject instanceof AvmType)
			return (AvmType) eObject;
		throw new DefinitionNotFoundException("No such type available '" + name + "'");
	}

	public AvmMember findMemberByName(String name) throws DefinitionNotFoundException {
		assert(name != null);
		assert(!name.startsWith("::"));
		URI resourceUri = URI.createURI(PROTOCOL+":/members/"+name);
		Resource resource = getResourceSet().getResource(resourceUri, true);
		EObject eObject = resource.getEObject(null);
		if (eObject instanceof AvmMember)
			return (AvmMember) eObject;
		throw new DefinitionNotFoundException("No such member available '" + name + "'");
	}

	public Iterable<AvmDefinition> findDefinitions(String name) {
		if (name == null || name.startsWith("::"))
			return Collections.emptySet();
		if (name == "void")
			return Collections.<AvmDefinition>singleton(AvmEFactory.eINSTANCE.createAvmVoid());
		if (name == "*")
			return Collections.<AvmDefinition>singleton(AvmEFactory.eINSTANCE.createAvmGeneric());
		Set<AvmDefinition> result = Sets.newHashSetWithExpectedSize(2);
		try {
			result.add(findTypeByName(name));
		} catch (DefinitionNotFoundException e) {}
		try {
			result.add(findMemberByName(name));
		} catch (DefinitionNotFoundException e) {}
		return result;
	}
	@Override
	protected IMirror createMirrorForFQN(String name) throws DefinitionNotFoundException {
		if (name == null)
			throw new DefinitionNotFoundException("null");
		boolean isType = name.startsWith("/types/");
		if (isType)
			name = name.substring(7);
		else if(name.startsWith("/members/"))
			name = name.substring(9);
		else throw new DefinitionNotFoundException("requires either types or members path");
		int index = name.indexOf("::");
		boolean qualified = index >= 0;
		String qualifier = qualified ? name.substring(0, index) : null;
		String simpleName = qualified ? name.substring(index+2) : name;
		Iterable<AsdocRoot> asdocRoots = getDocRoots();
		for (AsdocRoot root:asdocRoots) {
			AsdocPackage pack = qualified ? root.getPackage(qualifier) : root;
			if (pack == null) continue;
			Iterable<? extends AvmDefinition> list
				= isType ? pack.getTypes() : pack.getMembers();
			for (AvmDefinition definition:list)
				if (simpleName.equals(definition.getName()))
					return new AsdocMirror(definition);
		}
		if (!isType && 
				( name.equals("flash_proxy")
				|| name.equals("object_proxy")
				|| name.equals("AS3")
				)) {
			AsdocNamespace ns = AsdocEFactory.eINSTANCE.createAsdocNamespace();
			ns.setAsdoc("Built-in namespace "+ name);
			ns.setName(name);
			ns.setVisibility(AvmVisibility.PUBLIC);
			return new AsdocMirror(ns);
		}
		throw new DefinitionNotFoundException("No such type available '" + name + "'");
	}
}
