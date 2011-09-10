/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * modified org.eclipse.xtext.resource.impl.EObjectDescriptionLookUp 
 * @author mb0
 */
public abstract class AvmLibrary implements ISelectable {
	
	// hash lookup cache
	private volatile Map<QualifiedName, List<IEObjectDescription>> nameToObjects;

	abstract public List<IEObjectDescription> getExportedObjects();

	public boolean isEmpty() {
		return getExportedObjects().isEmpty();
	}

	public Iterable<IEObjectDescription> getExportedObjects(final EClass type,
			final QualifiedName name, boolean ignoreCase) {
		if (isEmpty())
			return Collections.emptyList();
		QualifiedName lowerCase = name.toLowerCase();
		List<IEObjectDescription> values = getNameToObjects().get(lowerCase);
		if (values == null)
			return Collections.emptyList();
		Predicate<IEObjectDescription> predicate = ignoreCase 
			?	new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {
						return EcoreUtil2.isAssignableFrom(type, input.getEClass());
					}
				}
			:	new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription input) {
					return name.equals(input.getName()) && EcoreUtil2.isAssignableFrom(type, input.getEClass());
				}
			};
		return Iterables.filter(values, predicate);
	}

	public Iterable<IEObjectDescription> getExportedObjectsByType(final EClass type) {
		if (isEmpty())
			return Collections.emptyList();
		return Iterables.filter(getExportedObjects(), new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				return EcoreUtil2.isAssignableFrom(type, input.getEClass());
			}
		});
	}

	public Iterable<IEObjectDescription> getExportedObjectsByObject(
			final EObject object) {
		if (isEmpty())
			return Collections.emptyList();
		final URI uri = EcoreUtil2.getNormalizedURI(object);
		return Iterables.filter(getExportedObjects(), new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				if (input.getEObjectOrProxy() == object)
					return true;
				if (uri.equals(input.getEObjectURI())) {
					return true;
				}
				return false;
			}
		});
	}

	protected Map<QualifiedName, List<IEObjectDescription>> getNameToObjects() {
		if (nameToObjects == null) {
			synchronized (this) {
				if (nameToObjects == null) {
					Map<QualifiedName, List<IEObjectDescription>> nameToObjects = Maps.newHashMapWithExpectedSize(getExportedObjects().size());
					if (getExportedObjects() instanceof RandomAccess) {
						for(int i = 0; i < getExportedObjects().size(); i++) {
							IEObjectDescription description = getExportedObjects().get(i);
							putIntoMap(nameToObjects, description);
						}
					} else {
						for(IEObjectDescription description: getExportedObjects()) {
							putIntoMap(nameToObjects, description);
						}
					}
					this.nameToObjects = nameToObjects; 
				}
			}
		}
		return this.nameToObjects;
	}

	protected void putIntoMap(Map<QualifiedName, List<IEObjectDescription>> nameToObjects,
			IEObjectDescription description) {
		QualifiedName indexKey = description.getName().toLowerCase();
		List<IEObjectDescription> values = nameToObjects.get(indexKey);
		if (values == null) {
			values = Lists.newArrayListWithExpectedSize(2);
			nameToObjects.put(indexKey, values);
		}
		values.add(description);
	}
}
