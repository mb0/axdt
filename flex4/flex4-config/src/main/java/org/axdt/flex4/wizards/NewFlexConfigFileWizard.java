/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.axdt.common.wizards.AbstractFileWizard;
import org.axdt.core.model.AxdtProject;
import org.axdt.core.ui.preferences.CorePreferences;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

public class NewFlexConfigFileWizard extends AbstractFileWizard {

	protected NewFlexConfigWizardPage page;

	public NewFlexConfigFileWizard() {
		super();
		setWindowTitle("New Flex config file");
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page = new NewFlexConfigWizardPage(selection);
		page.setTitle("Flex config file");
		page.setDescription("This wizard creates a new flex config file.");
		addPage(page);
	}

	@Override
	protected IRunnableWithProgress getRunnableFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		return new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
	}

	protected void doFinish(String containerName, String fileName, IProgressMonitor monitor)
			throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		Path containerPath = new Path(containerName);
		IResource resource = root.findMember(new Path(containerName));
		IContainer container = null;
		if (resource == null || !resource.exists()) {
			if (containerPath.segmentCount() > 1
					&& root.getProject(containerPath.segment(0)).exists()) {
				IProject project = root.getProject(containerPath.segment(0));
				container = createFolder(project, containerPath, monitor);
			}
		} else if (!(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		if (container == null) container = (IContainer) resource;
		
		IFile file = container.getFile(new Path(fileName));
		createInitialContent(file, openContentStream(file), monitor);
		monitor.worked(1);
		
		monitor.setTaskName("Opening file for editing...");
		selectRevealAndOpen(file);
		monitor.worked(1);
	}
	/**
	 * We will initialize file contents with a sample text.
	 * @param file 
	 */
	private InputStream openContentStream(IFile file) {
		IProject project = file.getProject();
		Object adapter = project.getAdapter(AxdtProject.class);
		StringBuilder buf = new StringBuilder();
		buf.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
		buf.append("<flex-config xmlns= \"http://www.adobe.com/2006/flex-config\">\n");
		buf.append("\t<compiler>\n");
		CorePreferences pref = CorePreferences.getInstance();
		if (adapter instanceof AxdtProject) {
			IPath parent = file.getParent().getFullPath();
			appendPathElements(buf, "source-path",parent,pref.getSourcePaths(file));
			appendPathElements(buf, "library-path",parent,pref.getLibraryPaths(file));
		}
		buf.append("\t</compiler>\n");
		buf.append("\t<metadata>\n");
		buf.append("\t\t<title>Your Application</title>\n");
		buf.append("\t\t<description>Developed using Axdt</description>\n");
		buf.append("\t</metadata>\n");
		buf.append("</flex-config>");
		return new ByteArrayInputStream(buf.toString().getBytes());
	}

	private void appendPathElements(StringBuilder buf, String name, IPath parent,
			List<IPath> paths) {
		if (!paths.isEmpty()) {
			buf.append("\t\t<").append(name).append(" append=\"true\">\n");
			for (IPath path: paths) {
				buf.append("\t\t\t<path-element>");
				buf.append(path.makeRelativeTo(parent));
				buf.append("</path-element>\n");
			}
			buf.append("\t\t</").append(name).append(">\n");
		}
	}
}
