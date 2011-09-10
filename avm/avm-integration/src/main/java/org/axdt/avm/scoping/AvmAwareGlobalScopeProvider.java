/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import org.axdt.avm.access.AvmContainer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

/**
 * @author mb0
 */
public class AvmAwareGlobalScopeProvider extends DefaultGlobalScopeProvider {
	
	@Inject
	private AvmLibraryScopeProvider libraryScopeProvider;
	
	@Override
	protected IScope getScope(final Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		IScope result = libraryScopeProvider.getScope(context, type, filter, ignoreCase);
		return getScope(result, context, ignoreCase, type, filter);
	}
	public IScope getScope(Resource resource, final EReference reference) {
		return getScope(resource, reference, null);
	}
	public IScope getScope(Resource resource, final EReference reference, Predicate<IEObjectDescription> filter) {
		return getScope(resource, isIgnoreCase(reference), reference.getEReferenceType(), filter);
	}
	protected IScope createContainerScopeWithContext(Resource eResource, IScope parent, IContainer container,
			Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		if (eResource != null && container instanceof AvmContainer)
			((AvmContainer) container).init(eResource.getResourceSet());
		return super.createContainerScopeWithContext(eResource, parent, container, filter, type, ignoreCase);
	}
	@Override
	protected IScope createContainerScope(IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		return new AvmShadyScope(parent, container, filter, type, ignoreCase);
	}
}
