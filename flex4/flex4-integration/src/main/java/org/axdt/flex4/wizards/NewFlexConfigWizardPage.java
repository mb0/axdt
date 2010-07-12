package org.axdt.flex4.wizards;

import org.axdt.common.wizards.AbstractFileWizardPage;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;

public class NewFlexConfigWizardPage extends AbstractFileWizardPage {

	public NewFlexConfigWizardPage(IStructuredSelection selection) {
		super("wizardPage",selection);
	}

	protected void initializeWithSelection(IResource resource) {
		IContainer container;
		if (resource instanceof IContainer) {
			container = (IContainer) resource;
			fileText.setText("");
		} else {
			IResource res = (IResource) resource;
			container = res.getParent();
			fileText.setText(res.getFullPath().removeFileExtension().lastSegment()+"-config.xml");
		}
		String cont = container.getFullPath().toString() + "/";
		containerText.setText(cont);
	}
	@Override
	public String getExtension() {
		return ".xml";
	}
}
