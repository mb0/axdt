/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.antsupport;

import org.axdt.common.wizards.AbstractFileWizardPage;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

/**
 * @author mb0
 */
public class NewFlexAntWizardPage extends AbstractFileWizardPage {

	protected Text targetText;

	public NewFlexAntWizardPage(IStructuredSelection selection) {
		super("wizardPage", selection);
	}

	@Override
	protected void createContent(Composite parent) {
		super.createContent(parent);
		createCompilerTargetContent(parent);
	}

	@Override
	protected void createContainerContentLable(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("&Container name:");
	}

	protected void createCompilerTargetContent(Composite parent) {
		Label label = new Label(parent, SWT.NULL);
		label.setText("Compilation &target:");
		targetText = new Text(parent, SWT.BORDER | SWT.SINGLE);
		targetText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		targetText.addModifyListener(this);
		Button button = new Button(parent, SWT.PUSH);
		button.setText("&Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse2();
			}
		});
	}

	protected void handleBrowse2() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IContainer context = root;
		IResource member = root.findMember(new Path(containerText.getText()));
		if (member != null) {
			IProject project = member.getProject();
			if (project != null)
				context = project;
		}
		TargetResourceSelectionDialog dialog = new TargetResourceSelectionDialog(
				getShell(), context);
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length >= 1) {
				initializeWithSelection((IResource) result[0]);
			}
		}
	}
	@Override
	protected void dialogChanged() {
		super.dialogChanged();
		if (getErrorMessage() != null) return;
		String text = targetText.getText();
		if (text.trim().length() == 0)
			return;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath containerPath = getContainerPath();
		IResource container = root.findMember(containerPath);
		IResource member = container.getProject().findMember(new Path(text));
		if (member == null)
			updateStatus("Compilation target must exist or left empty.");
	}

	private class TargetResourceSelectionDialog extends
			ResourceListSelectionDialog {
		public TargetResourceSelectionDialog(Shell shell, IContainer root) {
			super(shell, root, IResource.FILE);
		}

		@Override
		protected boolean select(IResource resource) {
			String extension = resource.getFileExtension();
			return extension != null
					&& ("as".equals(extension) || "mxml".equals(extension));
		}
	}

	@Override
	protected void createFileContent(Composite parent) {
		super.createFileContent(parent);
	}

	protected void initializeWithSelection(IResource resource) {
		IProject project = resource != null ? resource.getProject() : null;
		if (resource instanceof IFile) {
			IPath fullPath = resource.getFullPath();
			fullPath = fullPath.makeRelativeTo(project.getFullPath());
			targetText.setText(fullPath.toString());
			if (containerText.getText().trim().length() == 0)
				containerText.setText(project.getFullPath().toString());
		} else if (resource instanceof IContainer) {
			containerText.setText(resource.getFullPath().toString());
		}
		if (fileText.getText().trim().length() == 0)
			fileText.setText("build.xml");
	}

	@Override
	public String getExtension() {
		return ".xml";
	}
}
