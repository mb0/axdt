package org.axdt.as3.ui.preferences;

import org.axdt.common.preferences.AbstractPreferencePage;

import com.google.inject.Inject;

public class As3EditorPreferencePage extends AbstractPreferencePage {

	@Inject
	public As3EditorPreferencePage(As3EditorPreferences prefs) {
		super(prefs);
	}

}
