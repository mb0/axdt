package org.axdt.as3.debug.preferences;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.common.preferences.AbstractPreferences;

public class As3DebugPreferences extends AbstractPreferences {

	public static final String OPEN_SWF = "OPEN_SWF";
	public static final String OPEN_WITH = "OPEN_WITH";
	public static final String CHOICE_SWFVIEW = "CHOICE_SWFVIEW";
	public static final String CHOICE_INTERNAL = "CHOICE_INTERNAL";
	public static final String CHOICE_SYSTEM = "CHOICE_SYSTEM";
	public static final String USE_ALT_PATH = "USE_ALT_PATH";
	public static final String ALT_PATH = "ALT_PATH";

	private static As3DebugPreferences instance;

	public static As3DebugPreferences getInstance() {
		if (instance == null) {
			instance = new As3DebugPreferences();
		}
		return instance;
	}
	public As3DebugPreferences() {
		super("");
	}
	public String getQualifier() {
		return As3DebugPlugin.PLUGIN_ID;
	}

	public void initializeFieldSpecs() {
		addGroup("Browser", false);
		add(OPEN_SWF, "&Open compiled SWF files", true);
		add(OPEN_WITH, "&Use", new String[][] {
				new String[] {"internal SWFView", CHOICE_SWFVIEW},
				new String[] {"internal web browser", CHOICE_INTERNAL},
				new String[] {"system browser", CHOICE_SYSTEM}
		});
		addGroup("Launch path", false);
		add(USE_ALT_PATH, "Use &alternative path", false);
		add(new LocationPatternField(ALT_PATH, "&Path", "file://${deploy_loc}/${resource_name_noext}.swf"));
	}
}
