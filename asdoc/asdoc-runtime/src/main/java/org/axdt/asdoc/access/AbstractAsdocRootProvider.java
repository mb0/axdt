/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import java.io.IOException;
import java.util.Map;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseType;
import org.axdt.asdoc.util.AsdocEXMLProcessor;
import org.axdt.asdoc.util.DitaUrlHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.collect.Maps;

public abstract class AbstractAsdocRootProvider implements IDocRootProvider {
	
	protected final Map<String, AsdocRoot> roots;

	protected final AsdocEXMLProcessor xmlProcessor;

	public AbstractAsdocRootProvider() {
		xmlProcessor = new AsdocEXMLProcessor();
		roots = Maps.newHashMap();
	}
	
	public AsdocRoot getRoot(String url) {
		return roots.get(url);
	}
	public AsdocRoot addRoot(String name, String url) {
		AsdocRoot root = roots.get(url);
		if (root == null) {
			root = createRoot(name, url);
			if (root != null) {
				roots.put(url, root);
			}
		}
		return root;
	}
	protected abstract URI createDocRootUri(String url);
	
	protected Resource loadResource(URI resourceUri) {
		ResourceSet set = xmlProcessor.createResourceSet();
		Resource resource = set.getResource(resourceUri, false);
		if (resource == null)
			resource = set.createResource(resourceUri);
		try {
			resource.load(null);
		} catch (IOException e) {
		}
		return resource;
	}
	protected ParseType getParseType(String url) {
		return url.endsWith(DitaUrlHelper.PACKAGE_LIST) ? ParseType.DITA : ParseType.HTML;
	}
	protected AsdocRoot createRoot(String name, String url) {
		AsdocRoot root = null;
		URI docRootUri = createDocRootUri(url);
		Resource resource = loadResource(docRootUri);
		if (resource.getContents().size()>0) {
			EObject eobject = resource.getContents().get(0);
			if (eobject instanceof AsdocRoot) {
				root = (AsdocRoot) eobject;
				if (root.getVersion() < AsdocEPackage.CURRENT_VERSION)
					root = null;
			}
		} 
		if (root == null) {
			ParseType parseType = getParseType(url);
			if (parseType.equals(ParseType.DITA))
				url = url.substring(0, url.length() - DitaUrlHelper.PACKAGE_LIST.length());
			root = AsdocEFactory.eINSTANCE.createAsdocRoot(url);
			root.setParseType(parseType);
			root.setVersion(AsdocEPackage.CURRENT_VERSION);
			resource.getContents().clear();
			resource.getContents().add(root);
			resource.setModified(true);
		}
		return root;
	}
}
