/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import org.axdt.avm.AvmEPackage;
import org.axdt.avm.access.IDefinitionProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;

public abstract class AbstractDefinitionScopeProvider extends AbstractScopeProvider {

	public IScope getScope(EObject context, EReference reference) {
		if (context.eResource() == null)
			throw new IllegalStateException("context must be contained in a resource");
		ResourceSet resourceSet = context.eResource().getResourceSet();
		if (resourceSet == null)
			throw new IllegalStateException("context must be contained in a resource set");
		EClass referenceType = reference.getEReferenceType();
		if (EcoreUtil2.isAssignableFrom(referenceType, AvmEPackage.Literals.AVM_REFERABLE)) {
			return createDefinitionScope(getDefinitionProvider(resourceSet));
		} else if (EcoreUtil2.isAssignableFrom(referenceType, AvmEPackage.Literals.AVM_TYPE)) {
			return createTypeScope(getDefinitionProvider(resourceSet));
		} else {
			return IScope.NULLSCOPE;
		}
	}
	public IDefinitionProvider getDefinitionProvider(ResourceSet resourceSet) {
		IDefinitionProvider definitionProvider = getDefinitionProviderFactory().findDefinitionProvider(resourceSet);
		if (definitionProvider == null)
			definitionProvider = getDefinitionProviderFactory().createDefinitionProvider(resourceSet);
		return definitionProvider;
	}

	public abstract AvmDefinitionScope createDefinitionScope(IDefinitionProvider definitionProvider);
	public abstract AvmDefinitionScope createTypeScope(IDefinitionProvider definitionProvider);

	public abstract IDefinitionProvider.Factory getDefinitionProviderFactory();
}
