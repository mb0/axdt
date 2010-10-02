/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.scoping;

import static com.google.common.collect.Iterables.filter;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.axdt.as3.model.As3Import;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.IDirective;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeDelegatingScopeProvider;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class As3ImportScopeProvider extends
		AbstractGlobalScopeDelegatingScopeProvider {

	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;

	public void setCache(IResourceScopeCache cache) {
		this.cache = cache;
	}
	
	@Inject
	private IQualifiedNameProvider nameProvider;

	public void setNameProvider(IQualifiedNameProvider nameProvider) {
		this.nameProvider = nameProvider;
	}

	public IQualifiedNameProvider getNameProvider() {
		return nameProvider;
	}

	public IScope getScope(EObject context, EReference reference) {
		if (context == null)
			return getGlobalScope(context, reference);
		IScope result = null;
		if (context.eContainer() == null) {
			// global scope
			result = getGlobalScope(context, reference);
			result = getResourceScope(result, context, reference);
		} else {
			// outer scope
			result = getScope(context.eContainer(), reference);
		}

		// local scope used by the import scope
		if (hasImports(context)) {
			IScope localElements = getLocalElements(result, context, reference);
			// imports
			result = getImportedElements(result, localElements, context, reference);
		}
		// local scope
		if (nameProvider.getQualifiedName(context) != null) {
			result = getLocalElements(result, context, reference);
		}
		return result;
	}

	protected boolean hasImports(EObject context) {
		// if is local definitions
		if (context instanceof As3Package) {
			// check if there are any imports
			return Iterables.any(((As3Package)context).getDirectives(),new Predicate<IDirective>(){
				public boolean apply(IDirective input) {
					return input instanceof As3ImportList;
				}
			});
		}
		// if it is a package it has always package default imports
		// as well as the program for top level scope
		return context instanceof As3Package || context instanceof As3Program;
	}
	
	protected IScope getResourceScope(final IScope parent, final EObject context, final EReference reference) {
		if (context.eResource() == null)
			return parent;
		return getScope(getKey(context.eResource(), reference), context, parent, new Provider<Map<String, IEObjectDescription>>() {
			public Map<String, IEObjectDescription> get() {
				return internalGetResourceScopeMap(parent, context, reference);
			}
		});
	}
	
	protected Map<String, IEObjectDescription> internalGetResourceScopeMap(IScope parent, final EObject context,
			final EReference reference) {
		Iterable<EObject> contents = new Iterable<EObject>() {
			public Iterator<EObject> iterator() {
				// context can be a proxy when the iterable will be queried
				if (context.eResource() == null)
					return Collections.<EObject> emptyList().iterator();
				return EcoreUtil.getAllProperContents(context.eResource(), true);
			}
		};
		contents = Iterables.filter(contents, typeFilter(reference.getEReferenceType()));
		return toMap(Scopes.scopedElementsFor(contents, nameProvider));
	}

	protected IScope getLocalElements(final IScope parent, final EObject context, final EReference reference) {
		return getScope(getKey(context, reference), context, parent, new Provider<Map<String, IEObjectDescription>>() {
			public Map<String, IEObjectDescription> get() {
				return internalGetLocalElementsMap(parent, context, reference);
			}
		});
	}

	protected Map<String, IEObjectDescription> internalGetLocalElementsMap(final IScope parent, final EObject context,
			final EReference reference) {
		final String commonPrefix = nameProvider.getQualifiedName(context) + ".";

		Iterable<EObject> contents = new Iterable<EObject>() {
			public Iterator<EObject> iterator() {
				return EcoreUtil.getAllProperContents(context, true);
			}
		};
		// filter by type
		contents = filter(contents, typeFilter(reference.getEReferenceType()));
		// transform to IScopedElements
		Function<EObject, IEObjectDescription> descriptionComputation = new Function<EObject, IEObjectDescription>() {
			public IEObjectDescription apply(EObject from) {
				final String fqn = nameProvider.getQualifiedName(from);
				if (fqn == null)
					return null;
				String name = fqn;
				if (fqn.startsWith(commonPrefix)) {
					name = fqn.substring(commonPrefix.length());
				}
				return new EObjectDescription(name, from, Collections.<String, String> emptyMap()) {
					@Override
					public String getQualifiedName() {
						return fqn;
					}
				};
			}
		};
		Iterable<IEObjectDescription> elements = Iterables.filter(Iterables.transform(contents, descriptionComputation),
				Predicates.notNull());
		return toMap(elements);
	}

	protected Object getKey(Notifier context, EReference reference) {
		return Tuples.create(As3ImportScopeProvider.class, context, reference);
	}

	private Predicate<EObject> typeFilter(final EClass type) {
		return new Predicate<EObject>() {

			public boolean apply(EObject input) {
				return type.isInstance(input);
			}
		};
	}

	protected Set<As3ImportNormalizer> getImportNormalizer(final EObject context) {
		return cache.get(Tuples.pair(context, "imports"), context.eResource(), new Provider<Set<As3ImportNormalizer>>() {

			public Set<As3ImportNormalizer> get() {
				return internalGetImportNormalizers(context);
			}
		});
	}

	protected Set<As3ImportNormalizer> internalGetImportNormalizers(final EObject context) {
		Set<As3ImportNormalizer> namespaceImports = Sets.newLinkedHashSet();
		collectImportDefinitions(context, namespaceImports);
		return namespaceImports;
	}
	
	protected void collectImportDefinitions(EObject context, Set<As3ImportNormalizer> set) {
		if (context instanceof As3Program
			|| context instanceof As3Package
			|| context instanceof As3ImportList) {
			// XXX explicit imports first ?
			for (EObject child:context.eContents())
				collectImportDefinitions(child, set);
			// TODO we need to handle toplevel scope differently.
			if (context instanceof As3Program) {
				set.add(new As3ImportNormalizer(null, null));
			} else if (context instanceof As3Package) {
				String packageName = ((As3Package) context).getCanonicalName();
				if (packageName != null && packageName.length()>0)
					set.add(new As3ImportNormalizer(null, packageName));
			}
		} else if (context instanceof As3Import) {
			As3Import imprt = (As3Import) context;
			String qualifier = imprt.getQualifier();
			if (qualifier != null)
				set.add(new As3ImportNormalizer(imprt.getName(), imprt.getQualifier()));
		}
	}

	protected IScope getImportedElements(IScope parent, IScope localElements, EObject context,
			EReference reference) {
		return new As3ImportScope(parent, localElements, getImportNormalizer(context));
	}

	protected IScope getScope(Object cacheKey, EObject eobject, IScope parentScope, Provider<Map<String, IEObjectDescription>> mapProvider) {
		Map<String, IEObjectDescription> map = cache.get(cacheKey, eobject.eResource(), mapProvider);
		return map.isEmpty() ? parentScope : createMapBasedScope(parentScope, map);
	}
	protected IScope createMapBasedScope(IScope parentScope, Map<String, IEObjectDescription> map) {
		return new MapBasedScope(parentScope, map);
	}

	protected Map<String, IEObjectDescription> toMap(Iterable<IEObjectDescription> scopedElementsFor) {
		Map<String, IEObjectDescription> result = Maps.newLinkedHashMap();
		for (IEObjectDescription ieObjectDescription : scopedElementsFor) {
			if (!result.containsKey(ieObjectDescription.getName()))
				result.put(ieObjectDescription.getName(), ieObjectDescription);
		}
		return result;
	}
}
