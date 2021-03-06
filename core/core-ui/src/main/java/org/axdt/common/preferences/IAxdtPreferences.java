/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.preferences;

import org.axdt.common.config.IAxdtConfig;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;

public interface IAxdtPreferences extends IAxdtConfig {
	String PAGE_DEFAULT = "PAGE_DEFAULT";
	int EXCLUDE_IN_PREFERENCE = 1<<3;
	int EXCLUDE_IN_PROPERTIES = 1<<4;
	int EXCLUDE_IN_LAUNCH = 1<<5;

	String getQualifier();
	void initializeDefaultPreferences();
	void initializeFieldSpecs();
	
	IPreferenceStore getStore();
	IPreferenceStore getConfigStore();
	IPreferenceStore getProjectStore(IResource res);
	
	boolean getBoolean(ILaunchConfiguration config, String name) throws CoreException;
	String getString(ILaunchConfiguration config, String name) throws CoreException;
	
	PrefPage getPage(String pageKey);
}
