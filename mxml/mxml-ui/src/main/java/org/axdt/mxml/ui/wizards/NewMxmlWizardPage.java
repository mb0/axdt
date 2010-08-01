/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
		int indexOf = fileName.indexOf('.');
		if (indexOf > 0 && !fileName.matches("^[^.]+\\"+getExtension()+"$")) {
			updateStatus("Type name must not contain dots");
		} else {
			super.dialogChanged();
		}
	}
}
