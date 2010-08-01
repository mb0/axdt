/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.scoping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.axdt.as3.model.As3Import;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.IDirective;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class As3ImportScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	public As3ImportScopeProvider() {
		super();
	}
	
	@Override
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
	
	protected Set<ImportNormalizer> getImportNormalizer(EObject context) {
		Set<ImportNormalizer> namespaceImports = new HashSet<ImportNormalizer>();
		List<As3QName> list = Lists.newArrayList();
		collectImportDefinitions(context, list);
		for (As3QName value:list) {
			if (value != null)
				namespaceImports.add(createImportNormalizer(value));
		}
		return namespaceImports;
	}
	protected void collectImportDefinitions(EObject context, List<As3QName> result) {
		if (context instanceof As3Program
			|| context instanceof As3Package
			|| context instanceof As3ImportList) {
			// XXX explicit imports first ?
			for (EObject child:context.eContents())
				collectImportDefinitions(child, result);
			// TODO we need to handle toplevel scope differently.
			if (context instanceof As3Program) {
				result.add(new As3QName("*"));
			} else if (context instanceof As3Package) {
				String packageName = ((As3Package) context).getCanonicalName();
				if (packageName != null && packageName.length()>0)
					result.add(new As3QName(packageName,"*"));
			}
		} else if (context instanceof As3Import) {
			As3Import imprt = (As3Import) context;
			String qualifier = imprt.getQualifier();
			if (qualifier != null)
				result.add(new As3QName(imprt.getQualifier(), imprt.getName()));
		}
	}

	protected ImportNormalizer createImportNormalizer(QualifiedName qname) {
		return new ImportNormalizer(qname);
	}
	protected ImportNormalizer createImportNormalizer(final String name) {
		int offset = 2, index = name.indexOf("::");
		if (index < 0) {
			index = name.lastIndexOf('.');
			--offset;
		}
		return createImportNormalizer(
			index < 0
				? new As3QName(name)
				: new As3QName(name.substring(0,index), name.substring(index+offset))
		);
	}
	protected IScope getImportedElements(IScope parent, IScope localElements, EObject context,
			EReference reference) {
		Set<ImportNormalizer> normalizers = getImportNormalizer(context);
		return new As3ImportScope(parent, localElements, normalizers);
	}
}
