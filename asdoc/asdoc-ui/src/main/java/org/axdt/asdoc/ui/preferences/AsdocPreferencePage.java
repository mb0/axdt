package org.axdt.asdoc.ui.preferences;

import org.apache.log4j.Logger;
import org.axdt.asdoc.access.AsdocRootProvider;
import org.axdt.common.preferences.AbstractPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;

public class AsdocPreferencePage extends AbstractPreferencePage {

	protected final AsdocPreferences asdocPreferences;
	
	public AsdocPreferencePage() {
		this(AsdocPreferences.getInstance());
	}
	protected AsdocPreferencePage(AsdocPreferences asdocPreferences) {
		super(asdocPreferences);
		this.asdocPreferences = asdocPreferences;
	}

	@Override
	protected void performApply() {
		super.performApply();
		// if reinitialize with configuration from the workspace scope 
		IPreferenceStore store = asdocPreferences.getStore();
		Object[] docItems = asdocPreferences.getDocItems(store);
		AsdocRootProvider instance = AsdocRootProvider.getInstance();
		if (instance != null)
			instance.initializeAsdocs(docItems);
		else Logger.getLogger(getClass()).error("doc root provider was not yet initialized");
	}
}
