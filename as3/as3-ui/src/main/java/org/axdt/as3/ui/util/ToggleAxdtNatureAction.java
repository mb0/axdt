/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.util;

import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.core.AxdtCore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.ui.XtextProjectHelper;

import com.google.common.collect.Lists;

public class ToggleAxdtNatureAction implements IObjectActionDelegate {

	private IStructuredSelection selection;

	public void run(IAction action) {
		if (selection == null) return;
		List<IProject> selectedProjects = getSelectedProjects(selection);
		for (IProject project:selectedProjects) {
			if (project.isOpen())
				try {
					toggleNature(project);
				} catch (CoreException e) {
					Logger.getLogger(getClass()).error(e.getMessage(), e);
				}
		}
	}

	private void toggleNature(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		boolean foundXtextNature = false;
		for (int i = 0; i < natures.length; i++) {
			if (XtextProjectHelper.NATURE_ID.equals(natures[i]))
				foundXtextNature = true;
			if (AxdtCore.NATURE_ID.equals(natures[i])) {
				String[] newNatures = new String[natures.length - 1];
				System.arraycopy(natures, 0, newNatures, 0, i);
				System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
				return;
			}
		}
		String[] newNatures = new String[natures.length + (foundXtextNature ? 1 : 2)];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = AxdtCore.NATURE_ID;
		if (!foundXtextNature)
			newNatures[natures.length+1] = XtextProjectHelper.NATURE_ID;
		description.setNatureIds(newNatures);
		project.setDescription(description, null);
	}

	private List<IProject> getSelectedProjects(IStructuredSelection sel) {
		List<IProject> result = Lists.newArrayListWithExpectedSize(sel.size());
		for (Object elem:sel.toArray()) {
			IProject project = null;
			if (elem instanceof IFile)
				project = ((IFile) elem).getProject();
			else if (elem instanceof IProject)
				project = (IProject) elem;
			if (project != null && !result.contains(project))
				result.add(project);
		}
		return result;
	}

	public static boolean hasNature(IProject project) {
		try {
			if (project.isAccessible()) {
				return project.hasNature(XtextProjectHelper.NATURE_ID)
					&& project.hasNature(AxdtCore.NATURE_ID);
			}
		} catch (CoreException e) {
			Logger.getLogger(ToggleAxdtNatureAction.class).error(e.getMessage(), e);
		}
		return false;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection)
			this.selection = (IStructuredSelection) selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
}
