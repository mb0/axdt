package org.axdt.common.preferences;

import org.axdt.common.config.IAxdtConfig;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;

public interface IAxdtPreferences extends IAxdtConfig {
	String PAGE_DEFAULT = "PAGE_DEFAULT";

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
