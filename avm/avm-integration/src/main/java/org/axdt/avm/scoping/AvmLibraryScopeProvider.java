/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import java.util.Collections;
import java.util.List;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.access.AvmResourceFactory;
import org.axdt.avm.scoping.AvmLibraryScope.CompoundSelectable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

public abstract class AvmLibraryScopeProvider implements IScopeProvider {
	
	@Inject
	protected AvmResourceFactory.Provider resourceFactoryProvider;
	
	public IScope getScope(EObject context, EReference reference) {
		return getScope(context.eResource(), reference.getEReferenceType(), null, false);
	}
	
	public IScope getScope(Resource resource, final EClass type, Predicate<IEObjectDescription> filter, boolean ignoreCase) {
		if (resource == null)
			throw new IllegalStateException("context must be contained in a resource");
		ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet == null)
			throw new IllegalStateException("context must be contained in a resource set");
		// TODO: make sure the resourceSet has an AvmResourceFactory
		resourceFactoryProvider.provideFactory(resourceSet);
		CompoundSelectable selectable = new CompoundSelectable(getLibraries(resourceSet));
		return new AvmLibraryScope(selectable, filter, type, ignoreCase);
	}

	protected abstract List<ISelectable> getLibraries(ResourceSet resourceSet);
	
	public static final ISelectable globals = new ISelectable() {

		final IEObjectDescription voidDesc = EObjectDescription
				.create("void", AvmEFactory.eINSTANCE.createAvmVoid());
		final IEObjectDescription genericDesc = EObjectDescription
				.create("*", AvmEFactory.eINSTANCE.createAvmGeneric());

		public boolean isEmpty() {
			return false;
		}

		public Iterable<IEObjectDescription> getExportedObjects() {
			return Collections.emptyList();
		}

		public Iterable<IEObjectDescription> getExportedObjects(EClass type,
				QualifiedName name, boolean ignoreCase) {
			if (name.getSegmentCount() == 1) {
				String first = name.getFirstSegment();
				if ("void".equals(first) && type.isSuperTypeOf(AvmEPackage.eINSTANCE.getAvmVoid()))
					return Collections.singleton(voidDesc);
				if ("*".equals(first) && type.isSuperTypeOf(AvmEPackage.eINSTANCE.getAvmGeneric()))
					return Collections.singleton(genericDesc);
			}
			return Collections.emptyList();
		}

		public Iterable<IEObjectDescription> getExportedObjectsByType(EClass type) {
			if (AvmEPackage.eINSTANCE.getAvmGeneric().isSuperTypeOf(type))
				return Collections.singleton(genericDesc);
			if (type.isSuperTypeOf(AvmEPackage.eINSTANCE.getAvmType()))
				return Collections.singleton(voidDesc);
			return Collections.emptyList();
		}

		public Iterable<IEObjectDescription> getExportedObjectsByObject(
				EObject object) {
			final URI uri = EcoreUtil2.getNormalizedURI(object);
			if (voidDesc.getEObjectURI().equals(uri))
				return Collections.singleton(voidDesc);
			if (genericDesc.getEObjectURI().equals(uri))
				return Collections.singleton(genericDesc);
			return Collections.emptyList();
		}

	};
}
