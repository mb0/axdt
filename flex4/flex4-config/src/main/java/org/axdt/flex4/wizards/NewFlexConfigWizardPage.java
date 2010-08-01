/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
		IContainer container = null;
		if (resource instanceof IContainer) {
			container = (IContainer) resource;
		} else {
			if (containerText.getText().trim().length() == 0)
				container = resource.getParent();
			fileText.setText(resource.getFullPath().removeFileExtension().lastSegment()+"-config.xml");
		}
		if (container != null) {
			String cont = container.getFullPath().toString() + "/";
			containerText.setText(cont);
		}
	}
	@Override
	public String getExtension() {
		return ".xml";
	}
}
