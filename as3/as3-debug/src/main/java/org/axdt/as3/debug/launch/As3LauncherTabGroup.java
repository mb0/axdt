/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.launch;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.as3.debug.IAs3DebugConstants;
import org.axdt.as3.debug.preferences.As3CompilerPreferences;
import org.axdt.as3.debug.preferences.As3DebugPreferences;
import org.axdt.common.preferences.AbstractLauncherPreferenceTab;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.graphics.Image;

/**
 * @author mb0
 */
public class As3LauncherTabGroup extends AbstractLaunchConfigurationTabGroup {

	public As3LauncherTabGroup() {
	}

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] {
				new AS3LauncherTabMain(),
				new AS3LauncherTabBrowser(),
				new CommonTab() });
	}
}

class LaucherCompilerPreferences extends As3CompilerPreferences {
	@Override
	public void initializeFieldSpecs() {
		addGroup(null, false);
		add(IAs3DebugConstants.TARGET, "Build target", "", new String[] {
				"as", "mxml" });
		super.initializeFieldSpecs();
	}
}

class AS3LauncherTabMain extends AbstractLauncherPreferenceTab {

	public AS3LauncherTabMain() {
		super(new LaucherCompilerPreferences());
	}

	public Image getImage() {
		return As3DebugPlugin.getDefault().getImageRegistry()
				.get(As3DebugPlugin.MAIN_TAB_IMAGE);
	}

	public String getName() {
		return "Main";
	}
}

class AS3LauncherTabBrowser extends AbstractLauncherPreferenceTab {

	public AS3LauncherTabBrowser() {
		super(As3DebugPreferences.getInstance());
	}

	public String getName() {
		return "Browser";
	}
}
