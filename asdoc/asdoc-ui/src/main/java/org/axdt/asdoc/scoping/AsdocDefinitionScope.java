/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.scoping;

import java.util.List;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.access.IAsdocDefinitionProvider;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.util.AsdocESwitch;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.access.IDefinitionProvider;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.scoping.AvmDefinitionScope;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.OnChangeEvictingCache;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * @author mb0
 */
public class AsdocDefinitionScope extends AvmDefinitionScope {

	public AsdocDefinitionScope(IAsdocDefinitionProvider definitionProvider,
			boolean onlyTypes) {
		super(definitionProvider, onlyTypes);
	}

	@Override
	public Iterable<IEObjectDescription> internalGetContents() {
		List<Iterable<IEObjectDescription>> contents = Lists.newArrayList();
		for (AsdocRoot root : getDefinitionProvider().getDocRoots())
			contents.add(getContents(root));
		Iterable<IEObjectDescription> result = Iterables.concat(contents);
		if (!onlyTypes)
			return result;
		return Iterables.filter(result, new Predicate<IEObjectDescription>() {
			final EClass type = AvmEPackage.eINSTANCE.getAvmType();

			public boolean apply(IEObjectDescription input) {
				return type.isSuperTypeOf(input.getEClass());
			}
		});
	}

	public Iterable<IEObjectDescription> getContents(AsdocRoot root) {
		String cacheKey = "allDescriptions@AsdocDefinitionScope";
		OnChangeEvictingCache.CacheAdapter cache = new OnChangeEvictingCache()
				.getOrCreate(root);
		Iterable<IEObjectDescription> result = cache.get(cacheKey);
		if (result == null) {
			result = new DescriptionCollector().collect(root.eAllContents());
			cache.set(cacheKey, result);
		}
		return result;
	}

	@Override
	public IAsdocDefinitionProvider getDefinitionProvider() {
		return (IAsdocDefinitionProvider) super.getDefinitionProvider();
	}
}

class DescriptionCollector extends AsdocESwitch<Boolean> {
	private final List<IEObjectDescription> collected = Lists.newArrayList();

	public DescriptionCollector() {
	}

	public List<IEObjectDescription> collect(TreeIterator<EObject> contents) {
		while (contents.hasNext()) {
			EObject next = contents.next();
			Boolean traverse = doSwitch(next);
			if (!traverse)
				contents.prune();
		}
		return collected;
	}

	@Override
	public Boolean caseAsdocPackage(AsdocPackage object) {
		return true;
	}

	@Override
	public Boolean caseAsdocType(AsdocType object) {
		collectDefinition(object, IDefinitionProvider.PROTOCOL + ":/types/");
		return false;
	}

	@Override
	public Boolean caseAsdocMember(AsdocMember object) {
		collectDefinition(object, IDefinitionProvider.PROTOCOL + ":/members/");
		return false;
	}

	@Override
	public Boolean defaultCase(EObject object) {
		return false;
	}

	protected void collectDefinition(AvmDefinition identifiable, String prefix) {
		String fqn = identifiable.getCanonicalName();
		// we use mirror resources thus return a proxy
		InternalEObject proxy = (InternalEObject) AsdocEFactory.eINSTANCE
				.create(identifiable.eClass());
		proxy.eSetProxyURI(URI.createURI(prefix + fqn));
		collected.add(EObjectDescription.create(fqn, proxy));
	}
}
