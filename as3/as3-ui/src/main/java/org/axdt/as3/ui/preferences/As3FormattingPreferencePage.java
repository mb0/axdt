package org.axdt.as3.ui.preferences;

import org.axdt.common.preferences.AbstractPreferencePage;

import com.google.inject.Inject;

public class As3FormattingPreferencePage extends AbstractPreferencePage {

	@Inject
	public As3FormattingPreferencePage(As3FormattingPreferences prefs) {
		super(prefs);
	}

}
