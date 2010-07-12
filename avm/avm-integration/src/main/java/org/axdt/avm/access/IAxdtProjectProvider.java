package org.axdt.avm.access;

import org.axdt.core.model.AxdtProject;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IAxdtProjectProvider {
	AxdtProject getAxdtProject(ResourceSet resourceSet);
}
