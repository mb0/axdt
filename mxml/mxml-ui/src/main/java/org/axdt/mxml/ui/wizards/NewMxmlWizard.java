package org.axdt.mxml.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.axdt.common.wizards.AbstractFileWizard;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.INewWizard;

public class NewMxmlWizard extends AbstractFileWizard implements INewWizard {

	private NewMxmlWizardPage page;
	public NewMxmlWizard() {
		super();
		setWindowTitle("New Mxml file");
	}
	@Override
	public void addPages() {
		page = new NewMxmlWizardPage(selection);
		page.setTitle("Mxml file");
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
		createInitialContent(file, openContentStream(), monitor);
		monitor.worked(1);
		
		monitor.setTaskName("Opening file for editing...");
		selectRevealAndOpen(file);
		monitor.worked(1);
	}
	
	private InputStream openContentStream() {
		String contents = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
			+ "<mx:Application xmlns:mx=\"http://www.adobe.com/2006/mxml\" layout=\"vertical\">\n"
			+ "\t<mx:Script>\n\t<![CDATA[\n\t\n" + "\t]]>\n\t</mx:Script>\n"
			+ "</mx:Application>";
		return new ByteArrayInputStream(contents.getBytes());
	}
}
