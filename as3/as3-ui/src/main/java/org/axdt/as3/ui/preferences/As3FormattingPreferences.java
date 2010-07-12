package org.axdt.as3.ui.preferences;

import org.axdt.common.preferences.AbstractPreferences;

public class As3FormattingPreferences extends AbstractPreferences {
	
//	private final static Logger logger = Logger.getLogger(As3FormattingPreferences.class);

	private static As3FormattingPreferences instance;

	public static As3FormattingPreferences getInstance() {
		if (instance == null)
			instance = new As3FormattingPreferences();
		return instance;
	}

	public As3FormattingPreferences() {
		super("Preferences for AS3 formatting support");
	}

	public String getQualifier() {
		return "org.axdt.as3.formatting";
	}

	public void initializeFieldSpecs() {
	}
}