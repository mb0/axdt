/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.resource;

import org.axdt.core.AxdtCore;
import org.axdt.core.model.AxdtProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class AvmResourceSetProvider implements IResourceSetProvider {
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	public ResourceSet get(IProject project) {
		XtextResourceSet set = resourceSetProvider.get();
		AxdtProject axdtProject = AxdtCore.getModel().getProject(project);
		if (axdtProject != null && axdtProject.exists()) {
			set.setClasspathURIContext(axdtProject);
		}
		return set;
	}

}
