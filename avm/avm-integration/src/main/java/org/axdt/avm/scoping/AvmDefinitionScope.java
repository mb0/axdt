/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import java.util.Iterator;

import org.axdt.avm.access.DefinitionNotFoundException;
import org.axdt.avm.access.IDefinitionProvider;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.util.Strings;

public abstract class AvmDefinitionScope extends AbstractScope {
	
	protected final IDefinitionProvider definitionProvider;
	protected final boolean onlyTypes;
	
	public AvmDefinitionScope(IDefinitionProvider definitionProvider, boolean onlyTypes) {
		this.definitionProvider = definitionProvider;
		this.onlyTypes = onlyTypes;
	}
	@Override
	public Iterable<IEObjectDescription> internalGetContents() {
		throw new UnsupportedOperationException();
	}
	@Override
	public IEObjectDescription getContentByName(String name) {
		if (Strings.isEmpty(name)) return null;
		if (onlyTypes) {
			try {
			AvmType type = definitionProvider.findTypeByName(name);
			return EObjectDescription.create(name, type);
			} catch (DefinitionNotFoundException e) {
				return null;
			}
		}
		Iterable<AvmDefinition> definitions = definitionProvider.findDefinitions(name);
		Iterator<AvmDefinition> iterator = definitions.iterator();
		if (!iterator.hasNext()) return null;
		AvmDefinition def = iterator.next(); 
		return EObjectDescription.create(name, def);
	}
	
	@Override
	public IEObjectDescription getContentByEObject(EObject object) {
		if (object instanceof AvmDefinition) {
			return EObjectDescription.create(((AvmDefinition) object).getCanonicalName(), object);
		}
		return null;
	}

	public IScope getOuterScope() {
		return IScope.NULLSCOPE;
	}
	
	public IDefinitionProvider getDefinitionProvider() {
		return definitionProvider;
	}
}
