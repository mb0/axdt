/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.preferences;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IStringVariableManager;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;

public class LocationPatternFieldEditor extends StringButtonFieldEditor {
	public LocationPatternFieldEditor(String key, String desc,
			Composite comp) {
		super(key,desc,comp);
	}
	@Override
	protected boolean checkState() {
		IStringVariableManager manager = VariablesPlugin.getDefault().getStringVariableManager();
		try {
			manager.validateStringVariables(getTextControl().getText());
		} catch (CoreException e) {
			showErrorMessage(e.getMessage());
			return false;
		}
		clearErrorMessage();
		return true;
	}
	@Override
	protected String changePressed() {
		String var = getVariable();
		getTextControl().insert(var);
		return getTextControl().getText();
	}
	protected String getVariable() {
		StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(getShell());
		dialog.setTitle(getLabelText());
		dialog.setMultipleSelection(false);
		if (dialog.open() == Window.OK) {
			return dialog.getVariableExpression();
		}
		return null;
	}
}
