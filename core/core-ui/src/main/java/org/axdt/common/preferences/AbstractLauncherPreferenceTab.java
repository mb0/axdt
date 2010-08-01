/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.preferences;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class AbstractLauncherPreferenceTab extends AbstractFieldEditorPage implements ILaunchConfigurationTab {

	protected ILaunchConfigurationDialog fLaunchConfigurationDialog;
	protected boolean initialized;
	
	public AbstractLauncherPreferenceTab(PrefPage page) {
		super(page);
		setPreferenceStore(retrievePreferenceStore(page.getPreferences()));
		initialized = false;
	}

	public AbstractLauncherPreferenceTab(AbstractPreferences pref) {
		this(pref, AbstractPreferences.PAGE_DEFAULT);
	}

	public AbstractLauncherPreferenceTab(AbstractPreferences pref, String pageKey) {
		this(pref.getPage(pageKey));
	}

	protected IPreferenceStore retrievePreferenceStore(AbstractPreferences prefs) {
		PreferenceStore store = new PreferenceStore();
		IPreferenceStore prefstore = prefs.getStore();
		for (FieldSpec<?> spec:page.getFieldSpecs()) {
			spec.setDefault(store, spec.getDefault(prefstore));
		}
		return store;
	}

	public void createControl(Composite parent) {
		Control createContents = createContents(parent);
		GridLayout layout = (GridLayout)getFieldEditorParent().getLayout();
		layout.marginWidth = layout.marginHeight = 10;
		setControl(createContents);
	}

	public void initializeFrom(ILaunchConfiguration config) {
		IPreferenceStore store = getPreferenceStore();
		for (FieldSpec<?> spec:page.getFieldSpecs()) {
			try {
				spec.setValue(store, spec.getValue(config, store));
			} catch (CoreException e) {
			}
		}
		initialized = true;
		initialize();
	}

	@Override
	protected void initialize() {
		if (initialized)
			super.initialize();
	}

	public void performApply(ILaunchConfigurationWorkingCopy config) {
		performOk();
		IPreferenceStore store = getPreferenceStore();
		for (FieldSpec<?> spec:page.getFieldSpecs()) {
			spec.setValue(config, store);
		}
	}
	
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		performDefaults();
		performApply(configuration);
	}

	public boolean canSave() {
		return true;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		if (fLaunchConfigurationDialog != null) {
			fLaunchConfigurationDialog.updateButtons();
			fLaunchConfigurationDialog.updateMessage();
		}
	}

	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		initializeFrom(workingCopy);
	}

	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
		performApply(workingCopy);
	}

	public boolean isValid(ILaunchConfiguration launchConfig) {
		checkState();
		return isValid();
	}

	public void launched(ILaunch launch) {
	}

	public void setLaunchConfigurationDialog(ILaunchConfigurationDialog dialog) {
		fLaunchConfigurationDialog = dialog;
	}
	
	protected ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();
	}
	
	@Override
	protected boolean isExcluded(PrefGroup group) {
		return 0 != (group.getFlags() & IAxdtPreferences.EXCLUDE_IN_LAUNCH);
	}
}
