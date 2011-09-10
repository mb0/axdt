/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.axdt.avm.AvmEPackage;
import org.axdt.avm.builder.AvmContainerPackageManager;
import org.axdt.avm.naming.AvmQualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class AvmContainer implements IContainer {

	protected final IContainer container;
	protected final String handle;
	protected final Map<QualifiedName, IEObjectDescription> packages = Maps
			.newHashMap();
	protected final Set<IEObjectDescription> roots = Sets.newHashSet();
	protected Resource tempResource;
	protected AvmContainerPackageManager packageManager = AvmContainerPackageManager.getInstance();

	public AvmContainer(IContainer container, String handle) {
		this.container = container;
		this.handle = handle;
	}

	public void init(ResourceSet context) {
		if (context == null || tempResource != null)
			return;
		URI tempUri = URI.createPlatformPluginURI("packages.avm", false);
		tempResource = context.getResource(tempUri, false);
		if (tempResource == null)
			tempResource = context.createResource(tempUri);
		for (IEObjectDescription desc : container.getExportedObjects())
			collectParent(desc.getQualifiedName(), desc);
	}

	protected AvmContainerPackage collectParent(QualifiedName qname,
			IEObjectDescription desc) {
		AvmContainerPackage res = null;
		if (qname.getSegmentCount() > 1) {
			AvmQualifiedName name = AvmQualifiedName.ensure(qname.skipLast(1));
			IEObjectDescription objDesc = packages.get(name);
			if (objDesc != null) {
				res = (AvmContainerPackage) objDesc.getEObjectOrProxy();
				res.addChild(desc);
			} else {
				for (Object elem:tempResource.getContents()) {
					if (elem instanceof AvmContainerPackage) {
						AvmContainerPackage old = (AvmContainerPackage) elem;
						if (old.getQualifiedName().equals(name)) {
							res = old;
							objDesc = old.getDescription();
						}
					}
				}
				if (res == null) {
					res = new AvmContainerPackage(name, desc);
					objDesc = res.getDescription();
					tempResource.getContents().add(res);
					res.setParent(collectParent(name, objDesc));
				}
				packages.put(name, objDesc);
				if (name.getSegmentCount() == 1)
					roots.add(objDesc);
			}
		}
		return res;
	}

	public boolean isEmpty() {
		return container.isEmpty();
	}

	protected Collection<IEObjectDescription> getPackages() {
//		Collection<AvmQualifiedName> packageNames = packageManager.getPackageNames(handle);
		return packages.values();
	}
	public Iterable<IEObjectDescription> getExportedObjects() {
		Iterable<IEObjectDescription> objects = container.getExportedObjects();
		return Iterables.concat(objects, getPackages());
	}

	public Iterable<IEObjectDescription> getExportedObjects(final EClass type,
			final QualifiedName name, final boolean ignoreCase) {
		Iterable<IEObjectDescription> objects = container.getExportedObjects(
				type, name, ignoreCase);
		if (!EcoreUtil2.isAssignableFrom(type,
				AvmEPackage.eINSTANCE.getAvmPackage()))
			return objects;
		return Iterables.concat(objects, Iterables.filter(getPackages(),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {
						QualifiedName n = input.getName();
						return ignoreCase ? name.equalsIgnoreCase(n) : name
								.equals(n);
					}
				}));
	}

	public Iterable<IEObjectDescription> getExportedObjectsByType(
			final EClass type) {
		Iterable<IEObjectDescription> objects = container
				.getExportedObjectsByType(type);
		if (!EcoreUtil2.isAssignableFrom(type,
				AvmEPackage.eINSTANCE.getAvmPackage()))
			return objects;
		return Iterables.concat(objects, getPackages());
	}

	public Iterable<IEObjectDescription> getExportedObjectsByObject(
			final EObject object) {
		Iterable<IEObjectDescription> objects = container
				.getExportedObjectsByObject(object);
		final URI uri = EcoreUtil2.getNormalizedURI(object);
		return Iterables.concat(objects, Iterables.filter(getPackages(),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {
						return input.getEObjectOrProxy() == object
								|| uri.equals(input.getEObjectURI());
					}
				}));
	}

	public Iterable<IResourceDescription> getResourceDescriptions() {
		return container.getResourceDescriptions();
	}

	public int getResourceDescriptionCount() {
		return container.getResourceDescriptionCount();
	}

	public boolean hasResourceDescription(URI uri) {
		return container.hasResourceDescription(uri);
	}

	public IResourceDescription getResourceDescription(URI uri) {
		return getResourceDescription(uri);
	}

}