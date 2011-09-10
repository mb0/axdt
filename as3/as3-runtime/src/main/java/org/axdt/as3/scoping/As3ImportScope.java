/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.scoping;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class As3ImportScope extends ImportScope {

	protected List<ImportNormalizer> normalizers;
	protected final EClass type;
	
	public As3ImportScope(List<ImportNormalizer> namespaceResolvers,
			IScope parent, ISelectable importFrom, EClass type,
			boolean ignoreCase) {
		super(namespaceResolvers, parent, importFrom, type, ignoreCase);
		this.type = type;
	}

	@Override
	protected List<ImportNormalizer> removeDuplicates(
			List<ImportNormalizer> namespaceResolvers) {
		normalizers = super.removeDuplicates(namespaceResolvers);
		return normalizers;
	}

	@Override
	protected Iterable<IEObjectDescription> getLocalElementsByName(QualifiedName name) {
		List<IEObjectDescription> result = newArrayList();
		ImportNormalizer foundForNormalizer = null;
		ISelectable importFrom = getImportFrom();
		for (ImportNormalizer normalizer : normalizers) {
			final QualifiedName resolvedName = normalizer.resolve(name);
			if (resolvedName != null) {
				Iterable<IEObjectDescription> resolvedElements = importFrom.getExportedObjects(type, resolvedName,
						isIgnoreCase());
				for (IEObjectDescription resolvedElement : resolvedElements) {
					if (foundForNormalizer == null)
						foundForNormalizer = normalizer;
					QualifiedName alias = normalizer.deresolve(resolvedElement.getName());
					if (alias == null)
						throw new IllegalStateException("Couldn't deresolve " + resolvedElement.getName()
								+ " with import " + normalizer);
					final AliasedEObjectDescription aliasedEObjectDescription = new AliasedEObjectDescription(alias,
							resolvedElement);
					result.add(aliasedEObjectDescription);
				}
			}
		}
		return result;
	}
	
	@Override
	protected Iterable<IEObjectDescription> getAliasedElements(Iterable<IEObjectDescription> candidates) {
		Multimap<QualifiedName, IEObjectDescription> keyToDescription = LinkedHashMultimap.create();
		Multimap<QualifiedName, ImportNormalizer> keyToNormalizer = HashMultimap.create();

		for (IEObjectDescription imported : candidates) {
			QualifiedName fullyQualifiedName = imported.getName();
			for (ImportNormalizer normalizer : normalizers) {
				QualifiedName alias = normalizer.deresolve(fullyQualifiedName);
				// XXX: dont use relative namespaces
				if (alias != null && alias.getSegmentCount() == 1) {
					QualifiedName key = alias;
					if (isIgnoreCase()) {
						key = key.toLowerCase();
					}
					keyToDescription.put(key, new AliasedEObjectDescription(alias, imported));
					keyToNormalizer.put(key, normalizer);
				}
			}
		}
		for (QualifiedName name : keyToNormalizer.keySet()) {
			if (keyToNormalizer.get(name).size() > 1)
				keyToDescription.removeAll(name);
		}
		return keyToDescription.values();
	}
	
	protected boolean isShadowed(IEObjectDescription input) {
		QualifiedName name = input.getName();
		int count = name.getSegmentCount();
		if (count < 1 || count > 1)
			return false;
		return getLocalElementsByName(name).iterator().hasNext();
	}
}
