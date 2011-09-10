/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.scoping;

import java.util.List;

import org.axdt.as3.model.As3Import;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.common.collect.Lists;

public class As3ImportScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	protected boolean isRelativeImport() {
		return false;
	}

	protected ImportScope createImportScope(IScope parent,
			List<ImportNormalizer> namespaceResolvers, ISelectable importFrom,
			EClass type, boolean ignoreCase) {
		return new As3ImportScope(namespaceResolvers, parent, importFrom, type,
				ignoreCase);
	}

	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			final EObject context, boolean ignoreCase) {
		List<ImportNormalizer> importedNamespaceResolvers = Lists
				.newArrayList();
		collectImportDefinitions(context, importedNamespaceResolvers,
				ignoreCase);
		return importedNamespaceResolvers;
	}

	public boolean hasImports(EObject context) {
		// if it is a package it has always package default imports
		// as well as the program for top level scope
		return context instanceof As3Package || context instanceof As3Program;
	}

	public List<ImportNormalizer> getImportResolvers(final EObject context,
			final boolean ignoreCase) {
		return getImportedNamespaceResolvers(context, ignoreCase);
	}

	protected void collectImportDefinitions(EObject context,
			List<ImportNormalizer> list, boolean ignoreCase) {
		if (hasImports(context) || context instanceof As3ImportList) {
			// XXX explicit imports first ?
			for (EObject child : context.eContents())
				collectImportDefinitions(child, list, ignoreCase);
			if (context instanceof As3Package) {
				String packageName = ((As3Package) context).getCanonicalName();
				if (packageName != null && packageName.length() > 0) {
					ImportNormalizer normalizer = createImportedNamespaceResolver(
							packageName + ".*", ignoreCase);
					if (normalizer != null)
						list.add(normalizer);
				}
			}
		} else if (context instanceof As3Import) {
			As3Import imprt = (As3Import) context;
			ImportNormalizer normalizer = createImportedNamespaceResolver(
					imprt.getCanonicalName(), ignoreCase);
			if (normalizer != null)
				list.add(normalizer);
		}
	}
}
