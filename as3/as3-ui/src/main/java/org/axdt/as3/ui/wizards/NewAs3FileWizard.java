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
		String contents = "";
//		AS3Plugin plugin = AS3Plugin.getDefault();
//		TemplateStore templateStore = plugin.getTemplateStore();
//		TemplateContextType contextType = plugin.getCotextTypeRegistry().getContextType(
//				AS3ContextType.CONTEXT_TYPE_ID);
//		AS3TemplateContext context = new AS3TemplateContext(contextType, new Document(" "), 0, 0);
//		try {
//			StringBuffer buf = new StringBuffer("");
//			if (!tempType.equals("Simple")) {
//				String pattern;
//				if (tempType.equals("Example")) {
//					pattern = "import flash.display.*;\nimport flash.text.*;\n"
//							+ "public class ${type_name} extends Sprite {\n"
//							+ "\tpublic function ${type_name}() {\n"
//							+ "\t\tvar txt:TextField = new TextField();\n"
//							+ "\t\ttxt.width = 400;\n"
//							+ "\t\ttxt.height = 400;\n"
//							+ "\t\ttxt.multiline = true;\n"
//							+ "\t\ttxt.wordWrap = true;\n"
//							+ "\t\ttxt.defaultTextFormat = new TextFormat(\"_sans\", 40, 0xff9900);\n"
//							+ "\t\ttxt.htmlText = '<p><b>Hello ${user}!</b></p>'\n"
//							+ "\t\t\t+ '<p><i>Please</i> contribute some of your time to '\n"
//							+ "\t\t\t+ '<u><b><a href=\"http://axdt.org\">AXDT</a></b></u>!</p>'\n"
//							+ "\t\t\t+ '<p>Have fun!</p>';\n" + "\t\taddChild(txt);\n\t}\n}";
//				} else {
//					Template t1 = templateStore.findTemplateById("org.axdt.as3.templates.new"
//							+ tempType);
//					buf.append("public ");
//					pattern = t1.getPattern();
//				}
//				StringTokenizer tokenizer = new StringTokenizer(pattern, "\r\n", false);
//				if (tokenizer.hasMoreElements()) buf.append(tokenizer.nextToken() + "\n");
//				while (tokenizer.hasMoreTokens())
//					buf.append("\t" + tokenizer.nextToken() + "\n");
//			}
//			Template t = templateStore.findTemplateById("org.axdt.as3.templates.newPackage");
//			Template template = new Template(t.getName(), t.getDescription(), t.getContextTypeId(),
//					t.getPattern().replace("${cursor}", buf.toString()).replace("${package_name}",
//							packageName).replace("${type_name}", typeName), false);
//			TemplateBuffer templateBuffer = context.evaluate(template);
//			contents = templateBuffer.getString();
//		} catch (Exception e1) {
			contents = "package " + packageName + "{\n\t// template error \n}";
//			logger.error("Error loading template", e1);
//		}
		return new ByteArrayInputStream(contents.getBytes());
	}
}
