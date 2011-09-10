/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmReferable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.IScope;

public abstract class AvmGenericScope<T extends EObject> extends AvmElementScope<T> {
	private static Resource tempResource = null;

	public AvmGenericScope(IScope parent, T element, EReference ref, IScope lookup) {
		super(parent, element, ref, lookup);
	}
	public String getReferenceText(EObject reference) {
		ICompositeNode node = NodeModelUtils.getNode(reference);
		return new LinkingHelper().getCrossRefNodeAsString(node, false);
	}

	public AvmReferable getDynamicIdentifiable(final EObject reference) {
		if (reference == null) return null;
		final String text = getReferenceText(reference);
		Resource resource = getTempResource();
		if (text == null || resource == null) return null;
		EObject find = null;
		for (EObject obj: resource.getContents()) {
			if (obj instanceof AvmField) {
				if (text.equals(((AvmField) obj).getName()))
					find = obj;
			}
		}
		AvmField field;
		if (find != null) {
			field = (AvmField) find;
		} else {
			field = createDynamicField(text);
			getTempResource().getContents().add(field);
		}
		return field;
	}

	protected abstract AvmField createDynamicField(String name);

	protected Resource getTempResource() {
		if (tempResource != null)
			return tempResource;
		URI tempUri = URI.createPlatformPluginURI("generic.avm", false);
		ResourceSet set = element.eResource().getResourceSet();
		tempResource = set.getResource(tempUri, false);
		if (tempResource == null)
			tempResource = set.createResource(tempUri);
		return tempResource;
	}
}
