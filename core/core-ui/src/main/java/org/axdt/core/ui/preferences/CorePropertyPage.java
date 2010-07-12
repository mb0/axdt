package org.axdt.core.ui.preferences;

import org.axdt.common.preferences.AbstractPreferencePage;
import org.axdt.common.preferences.AbstractPreferences;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.preference.IPreferenceStore;

public class CorePropertyPage extends AbstractPreferencePage {
	
	public CorePropertyPage() {
		super(CorePreferences.getInstance());
	}
	@Override
	protected IPreferenceStore retrievePreferenceStore(AbstractPreferences prefs) {
		return prefs.getProjectStore((IProject)getElement());
	}
}
