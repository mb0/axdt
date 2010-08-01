/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.scoping;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.ImportNormalizer;

import com.google.common.base.Function;
import com.google.common.base.Predicates;

public class As3ImportScope extends AbstractScope {

	private final IScope parent;
	private final IScope localElements;
	private final Set<ImportNormalizer> normalizers;

	public As3ImportScope(IScope parent, IScope localElements, Set<ImportNormalizer> normalizers) {
		this.parent = parent;
		this.localElements = localElements;
		this.normalizers = normalizers;
	}

	@Override
	public IEObjectDescription getContentByName(String name) {
		boolean isQualified = name.indexOf("::")>=0;
		if (isQualified)
			return getOuterScope().getContentByName(name);
		for (ImportNormalizer normalizer : normalizers) {
			String shortToLongName = normalizer.shortToLongName(name);
			if (shortToLongName != null) {
				IEObjectDescription element = localElements.getContentByName(shortToLongName);
				if (element != null)
					return new AliasedEObjectDescription(name, element);
			}
		}
		return getOuterScope().getContentByName(name);
	}

	@Override
	public IEObjectDescription getContentByEObject(EObject object) {
		IEObjectDescription candidate = localElements.getContentByEObject(object);
		if (candidate != null)
			for (ImportNormalizer normalizer : normalizers) {
				String longToShortName = normalizer.longToShortName(candidate.getQualifiedName());
				if (longToShortName != null) {
					IEObjectDescription element = getContentByName(longToShortName);
					if (element != null && element.getEObjectOrProxy() == object)
						return new AliasedEObjectDescription(longToShortName, candidate);
				}
			}
		return getOuterScope().getContentByEObject(object);
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetContents() {
		return filter(transform(localElements.getAllContents(),
				new Function<IEObjectDescription, IEObjectDescription>() {
					public IEObjectDescription apply(final IEObjectDescription input) {
						for (ImportNormalizer normalizer : normalizers) {
							final String newName = normalizer.longToShortName(input.getName());
							if (newName != null) {
								return new AliasedEObjectDescription(newName, input);
							}
						}
						return null;
					}
				}), Predicates.notNull());
	}

	public IScope getOuterScope() {
		return parent;
	}

}
