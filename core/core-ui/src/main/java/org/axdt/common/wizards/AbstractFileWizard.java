/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.wizards;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public abstract class AbstractFileWizard extends Wizard implements INewWizard {
	protected ISelection selection;

	public boolean performFinish() {
		IRunnableWithProgress op = getRunnableFinish();
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	protected abstract IRunnableWithProgress getRunnableFinish();

	protected IFolder createFolder(IContainer project, IPath containerPath, IProgressMonitor monitor)
			throws CoreException {
		IFolder folder = null;
		for (int i = 1; i < containerPath.segmentCount(); i++) {
			Path segPath = new Path(containerPath.segment(i));
			if (folder == null) folder = project.getFolder(segPath);
			else folder = folder.getFolder(segPath);
			if (!folder.exists()) {
				folder.create(false, true, monitor);
			}
		}
		return folder;
	}

	protected void throwCoreException(String string) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, "org.axdt.core.ui.wizard", IStatus.OK, string, null);
		throw new CoreException(status);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		setNeedsProgressMonitor(true);
	}
	
	protected void selectRevealAndOpen(final IFile file) {
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				BasicNewProjectResourceWizard.selectAndReveal(file, window);
				try {
					IDE.openEditor(window.getActivePage(), file, true);
				} catch (PartInitException e) {
				}
			}
		});
	}
	protected void createInitialContent(IFile file, InputStream stream, IProgressMonitor monitor) throws CoreException {
		try {
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
	}
}
