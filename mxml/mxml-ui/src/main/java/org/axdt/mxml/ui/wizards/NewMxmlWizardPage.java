package org.axdt.mxml.ui.wizards;

import org.axdt.common.wizards.AbstractFileWizardPage;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;

public class NewMxmlWizardPage extends AbstractFileWizardPage {

	public NewMxmlWizardPage(ISelection selection) {
		super("wizardPage", selection);
	}

	@Override
	protected void initializeWithSelection(IResource obj) {
		IContainer container = obj instanceof IContainer
			? (IContainer) obj
			: ((IResource) obj).getParent();
		String cont = container.getFullPath().toString() + "/";
		containerText.setText(cont);
	}

	@Override
	public String getExtension() {
		return ".mxml";
	}


	@Override
	protected void dialogChanged() {
		String fileName = getFileName();
		if (fileName.indexOf('.') == fileName.length()-getExtension().length()) {
			updateStatus("Type name must not contain dots");
		} else {
			super.dialogChanged();
		}
	}
}
