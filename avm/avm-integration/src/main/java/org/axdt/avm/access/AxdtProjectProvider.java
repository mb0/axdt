package org.axdt.avm.access;

import org.axdt.core.model.AxdtProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;

public class AxdtProjectProvider implements IAxdtProjectProvider {

	public AxdtProject getAxdtProject(ResourceSet resourceSet) {
		if (resourceSet instanceof XtextResourceSet) {
			XtextResourceSet xtextResourceSet = (XtextResourceSet) resourceSet;
			Object context = xtextResourceSet.getClasspathURIContext();
			if (context instanceof AxdtProject)
				return (AxdtProject) context;
		}
		return null;
	}

}
