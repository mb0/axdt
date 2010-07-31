package org.axdt.as3.ui.wizards;

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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class NewAs3FileWizard extends AbstractFileWizard {
	
//	private Logger logger = Logger.getLogger(getClass());

	protected NewAs3FileWizardPage page;
	
	public NewAs3FileWizard() {
		super();
		setWindowTitle("New As3 File");
	}

	@Override
	public void addPages() {
		page = new NewAs3FileWizardPage(selection);
		page.setTitle("ActionScript 3 file");
		page.setDescription("This wizard creates a new ActionScript 3 file.");
		addPage(page);
	}
	
	@Override
	protected IRunnableWithProgress getRunnableFinish() {
		final IPath path = page.getFilePath();
		final String packg = page.getPackageName();
		final String template = page.getTemplate();
		return new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(path, packg, template, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
	}

	protected void doFinish(IPath path, String packg, String template, IProgressMonitor monitor) throws CoreException {
		String fileName = path.lastSegment();
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath contPath = path.removeLastSegments(1);
		IResource resource = root.findMember(contPath);
		IContainer container = null;
		if (resource == null || !resource.exists()) {
			if (contPath.segmentCount() > 1 && root.getProject(contPath.segment(0)).exists()) {
				IProject project = root.getProject(contPath.segment(0));
				container = createFolder(project, contPath, monitor);
			}
		} else if (!(resource instanceof IContainer)) {
			throwCoreException("\"" + path + "\" is not a valid Container.");
		}
		if (container == null) container = (IContainer) resource;
		
		final IFile file = container.getFile(new Path(fileName));
		String fileString = path.removeFileExtension().lastSegment();
		InputStream stream = openContentStream(fileString, packg, template);
		createInitialContent(file,stream, monitor);
		monitor.worked(1);
		
		monitor.setTaskName("Opening file for editing...");
		selectRevealAndOpen(file);
		monitor.worked(1);
	}
	private InputStream openContentStream(String typeName, String packageName, String tempType) {
		StringBuilder buf = new StringBuilder();
		buf.append("package ");
		packageName = packageName.trim();
		if (packageName.length() > 0)
			buf.append(packageName).append(' ');
		buf.append("{\n");
		if("Class".equals(tempType)) {
			buf.append("\tpublic class ");
			buf.append(typeName);
			buf.append(" {\n");
			buf.append("\t\tpublic function ");
			buf.append(typeName);
			buf.append("() {\n");
			buf.append("\t\t\t\n");
			buf.append("\t\t}\n");
			buf.append("\t}\n");
		} else if("Interface".equals(tempType)) {
			buf.append("\tpublic interface ");
			buf.append(typeName);
			buf.append(" {\n\t\t\n\t}\n");
		} else {
			buf.append("\t\n");
		}
		buf.append("}\n");
		return new ByteArrayInputStream(buf.toString().getBytes());
	}
}
