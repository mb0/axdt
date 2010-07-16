package org.axdt.asdoc.access;

import java.io.IOException;
import java.util.Map;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.util.AsdocEXMLProcessor;
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
	protected AsdocRoot createRoot(String name, String url) {
		AsdocRoot root = null;
		URI docRootUri = createDocRootUri(url);
		Resource resource = loadResource(docRootUri);
		if (resource.getContents().size()>0) {
			EObject eobject = resource.getContents().get(0);
			if (eobject instanceof AsdocRoot) {
				root = (AsdocRoot) eobject;
			}
		} else {
			root = AsdocEFactory.eINSTANCE.createAsdocRoot(url);
			resource.getContents().add(root);
		}
		return root;
	}
}
