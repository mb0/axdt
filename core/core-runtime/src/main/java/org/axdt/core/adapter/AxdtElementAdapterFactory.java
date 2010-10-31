/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.adapter;

import java.util.List;

import org.axdt.core.AxdtCore;
import org.axdt.core.model.AxdtElement;
import org.axdt.core.model.AxdtPackageRoot;
import org.axdt.core.model.AxdtProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.IPath;

public class AxdtElementAdapterFactory implements IAdapterFactory {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adaptableObject instanceof IResource
				&& AxdtElement.class.isAssignableFrom(adapterType)) {
			return getResourceAdapter((IResource) adaptableObject, adapterType);
		}
		return null;
	}

	protected Object getResourceAdapter(IResource resource,
			Class<? extends AxdtElement> adapterType) {
		AxdtProject axdtProject = getAxdtProject(resource);
		if (axdtProject == null)
			return null;
		if (adapterType.isAssignableFrom(AxdtProject.class)
				&& resource.getType() == IResource.PROJECT) {
			return axdtProject.getHandle();
		}
		if (adapterType.isAssignableFrom(AxdtPackageRoot.class)) {
			List<IPath> sourcePaths = axdtProject.getConfiguredSourcePaths();
			if (sourcePaths.contains(resource.getFullPath()))
				return AxdtCore.getModel().getPackageRoot(resource);
		}
		return null;
	}

	protected AxdtProject getAxdtProject(IResource resource) {
		try {
			if (resource != null) {
				IProject project = resource.getProject();
				if (project != null)
					return (AxdtProject) project.getNature(AxdtCore.NATURE_ID);
			}
		} catch (CoreException e) {
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { AxdtProject.class, AxdtPackageRoot.class };
	}

}
