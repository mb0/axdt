package org.axdt.asdoc.access;

import org.axdt.asdoc.model.AsdocRoot;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IDocRootProvider {
	Iterable<AsdocRoot> getDocRoots(ResourceSet resourceSet);
	Iterable<AsdocRoot> initializeAsdocs(Object[] docItems);
}
