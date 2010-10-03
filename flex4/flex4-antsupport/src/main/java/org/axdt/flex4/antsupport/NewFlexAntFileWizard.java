/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.antsupport;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.axdt.common.wizards.AbstractFileWizard;
import org.axdt.core.config.ICoreConfig;
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
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

/**
 * @author mb0
 */
public class NewFlexAntFileWizard extends AbstractFileWizard {

	protected NewFlexAntWizardPage page;

	public NewFlexAntFileWizard() {
		super();
		setWindowTitle("New Flex ant file");
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page = new NewFlexAntWizardPage(selection);
		page.setTitle("Flex ant file");
		page.setDescription("This wizard creates a new flex ant build file.");
		addPage(page);
	}

	@Override
	protected IRunnableWithProgress getRunnableFinish() {
		final IPath containerPath = page.getContainerPath();
		final String fileName = page.getFileName();
		final String target = page.targetText.getText();
		return new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(containerPath, fileName, target, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
	}

	protected void doFinish(IPath containerPath, String fileName,
			String target, IProgressMonitor monitor) throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(containerPath);
		IContainer container = null;
		if (resource == null || !resource.exists()) {
			if (containerPath.segmentCount() > 1
					&& root.getProject(containerPath.segment(0)).exists()) {
				IProject project = root.getProject(containerPath.segment(0));
				container = createFolder(project, containerPath, monitor);
			}
		} else if (!(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerPath
					+ "\" does not exist.");
		}
		if (container == null)
			container = (IContainer) resource;

		IFile file = container.getFile(new Path(fileName));
		createInitialContent(file, openContentStream(file, target), monitor);
		monitor.worked(1);

		monitor.setTaskName("Opening file for editing...");
		selectRevealAndOpen(file);
		monitor.worked(1);
	}

	/**
	 * We will initialize file contents with a sample text.
	 * 
	 * @param file
	 * @param target
	 */
	private InputStream openContentStream(IFile file, String target) {
		IProject project = file.getProject();
		CorePreferences pref = CorePreferences.getInstance();
		String srcDir = pref.getStringList(project, ICoreConfig.SOURCE_PATHS)[0];
		IPreferenceStore store = pref.getProjectStore(project);
		String outDir = store.getString(ICoreConfig.OUTPUT_PATH);
		String targetPath = "path/to/Application.as";
		String targetName = "Application";
		if (target != null
				&& (target.endsWith(".as") || target.endsWith(".mxml"))) {
			targetPath = target;
			targetName = new Path(target).removeFileExtension().lastSegment();
		}
		StringBuilder buf = new StringBuilder();
		buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		buf.append("<project name=\"nicegui\" default=\"compile\">\n\n");
		buf.append("\t<property name=\"FLEX_HOME\" value=\"${flex.home}\" />\n");
		buf.append("\t<property name=\"SRC_DIR\" location=\"").append(srcDir)
				.append("\" />\n");
		buf.append("\t<property name=\"OUT_DIR\" location=\"").append(outDir)
				.append("\" />\n");
		buf.append("\t<property name=\"DOC_DIR\" location=\"${OUT_DIR}/asdoc\" />\n");
		buf.append("\t<property name=\"TARGET_NAME\" value=\"")
				.append(targetName).append("\" />\n");
		buf.append("\t<property name=\"TARGET_PATH\" location=\"")
				.append(targetPath).append("\" />\n\n");
		buf.append("\t<property name=\"WRAP_NAME\" value=\"index.html\" />\n\n");
		buf.append("\t<target name=\"compile\">\n");
		buf.append("\t\t<mxmlc output=\"${OUT_DIR}/${TARGET_NAME}.swf\" file=\"${TARGET_PATH}\">\n");
		buf.append("\t\t\t<load-config filename=\"${flex.frameworks}/flex-config.xml\" />\n");
		buf.append("\t\t</mxmlc>\n");
		buf.append("\t</target>\n\n");
		buf.append("\t<target name=\"wrapper\">\n");
		buf.append("\t\t<html-wrapper swf=\"${TARGET_NAME}\" output=\"${OUT_DIR}\"\n");
		buf.append("\t\t\tfile=\"${WRAP_NAME}\" width=\"100%\" height=\"100%\"\n");
		buf.append("\t\t\thistory=\"true\" express-install=\"true\" version-detection=\"true\" />\n");
		buf.append("\t</target>\n\n");
		buf.append("\t<target name=\"asdoc\" depends=\"clean-asdoc\">\n");
		buf.append("\t\t<asdoc output=\"${DOC_DIR}\">\n");
		buf.append("\t\t\t<load-config filename=\"${flex.frameworks}/flex-config.xml\" />\n");
		buf.append("\t\t\t<doc-sources path-element=\"${SRC_DIR}\"/>\n");
		buf.append("\t\t</asdoc>\n");
		buf.append("\t</target>\n\n");
		buf.append("\t<target name=\"library\">\n");
		buf.append("\t\t<fileset id=\"sources\" dir=\"${SRC_DIR}\">\n");
		buf.append("\t\t\t<include name=\"**/*.as\"/>\n");
		buf.append("\t\t</fileset>\n");
		buf.append("\t\t<pathconvert property=\"classes\" pathsep=\" \" refid=\"sources\">\n");
		buf.append("\t\t\t<chainedmapper>\n");
		buf.append("\t\t\t\t<globmapper from=\"${SRC_DIR}/*\" to=\"*\"/>\n");
		buf.append("\t\t\t\t<mapper type=\"package\" from=\"*.as\" to=\"*\"/>\n");
		buf.append("\t\t\t</chainedmapper>\n");
		buf.append("\t\t</pathconvert>\n");
		buf.append("\t\t<compc output=\"${OUT_DIR}/${TARGET_NAME}.swc\" include-classes=\"${classes}\">\n");
		buf.append("\t\t\t<load-config filename=\"${flex.frameworks}/flex-config.xml\" />\n");
		buf.append("\t\t</compc>\n");
		buf.append("\t</target>\n\n");
		buf.append("\t<target name=\"clean\" depends=\"clean-library,clean-compile,clean-asdoc,clean-wrapper\" />\n\n");
		buf.append("\t<target name=\"clean-compile\">\n");
		buf.append("\t\t<delete file=\"${OUT_DIR}/${TARGET_NAME}.swf\"/>\n");
		buf.append("\t</target>\n\n");
		buf.append("\t<target name=\"clean-wrapper\">\n");
		buf.append("\t\t<delete dir=\"${OUT_DIR}/history\"/>\n");
		buf.append("\t\t<delete>\n");
		buf.append("\t\t\t<fileset dir=\"${OUT_DIR}\">\n");
		buf.append("\t\t\t\t<include name=\"${WRAP_NAME}\"/>\n");
		buf.append("\t\t\t\t<include name=\"swfobject.js\"/>\n");
		buf.append("\t\t\t\t<include name=\"playerProductInstall.swf\"/>\n");
		buf.append("\t\t\t</fileset>\n");
		buf.append("\t\t</delete>\n");
		buf.append("\t</target>\n\n");
		buf.append("\t<target name=\"clean-asdoc\">\n");
		buf.append("\t\t<delete dir=\"${DOC_DIR}\"/>\n");
		buf.append("\t</target>\n\n");
		buf.append("\t<target name=\"clean-library\">\n");
		buf.append("\t\t<delete file=\"${OUT_DIR}/${TARGET_NAME}.swc\"/>\n");
		buf.append("\t</target>\n");
		buf.append("</project>");
		return new ByteArrayInputStream(buf.toString().getBytes());
	}
}
