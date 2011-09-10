/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import java.util.Iterator;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocNamespace;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.access.AvmMirror;
import org.axdt.avm.access.AvmResourceFactory;
import org.axdt.avm.access.DefinitionNotFoundException;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class AsdocResourceFactory extends AvmResourceFactory  {

	private final IDocRootProvider docRootProvider;
	private Iterable<AsdocRoot> asdocRoots = null;
	
	protected AsdocResourceFactory(IDocRootProvider docRootProvider,
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
	protected AvmMirror createMirrorForFQN(String name) throws DefinitionNotFoundException {
		if (name == null)
			throw new DefinitionNotFoundException("null");
		boolean isType = name.startsWith("/types/");
		boolean isPack = !isType && name.startsWith("/packages/");
		if (isType)
			name = name.substring(7);
		else if(isPack)
			name = name.substring(10);
		else if(name.startsWith("/members/"))
			name = name.substring(9);
		else throw new DefinitionNotFoundException("requires either types or members path");
		Iterable<AsdocRoot> asdocRoots = getDocRoots();
		String qualifier = null;
		String simpleName = name;
		if (isPack) {
			qualifier = name;
		} else {
			int index = name.lastIndexOf(".");
			if (index >= 0) {
				qualifier = name.substring(0, index);
				simpleName = name.substring(index+1);
			}
		}
		for (AsdocRoot root:asdocRoots) {
			AsdocPackage pack = qualifier != null ? root.getPackage(qualifier) : root;
			if (pack == null) continue;
			if (isPack) return new AsdocMirror(pack);
			for (AvmDefinition definition:(isType ? pack.getTypes() : pack.getMembers()))
				if (simpleName.equals(definition.getName()))
					return new AsdocMirror(definition);
		}
		Iterator<AsdocRoot> iterator = asdocRoots.iterator();
		if (iterator.hasNext() && !isType && 
				( name.equals("flash.utils.flash_proxy")
				|| name.equals("flash.utils.object_proxy")
				|| name.equals("AS3")
				)) {
			return new AsdocMirror(createNS(name, iterator.next()));
		}
		throw new DefinitionNotFoundException("No such type available '" + name + "'");
	}

	private AsdocNamespace createNS(String name, AsdocRoot root) {
		AsdocNamespace ns = AsdocEFactory.eINSTANCE.createAsdocNamespace();
		ns.setAsdoc("Built-in namespace "+ name);
		ns.setVisibility(AvmVisibility.PUBLIC);
		int lastdot = name.lastIndexOf('.');
		AsdocPackage pack = root;
		if (lastdot >= 0) {
			String q = name.substring(0, lastdot);
			name = name.substring(lastdot+1);
			pack = root.createPackage(q);
		}
		ns.setName(name);
		pack.getMembers().add(ns);
		return ns;
	}
}
