package org.axdt.avm.access;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IFragmentProvider;

public interface IMirror extends IFragmentProvider {

	void initialize(AvmResource avmResource);
	TreeIterator<EObject> getAllContents(AvmResource.Fallback fallback);
	EList<EObject> getContents(AvmResource.Fallback fallback);
}
