package org.axdt.as3.debug.preferences;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.common.preferences.AbstractPreferences;
import org.axdt.core.config.ISwfConfig;

public class As3DebugPreferences extends AbstractPreferences
		implements ISwfConfig {

	public static final String OPEN_SWF = "OPEN_SWF";
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
		add(OPEN_SWF, "&Open compiled Swf files", true);
		add(USE_ALT_PATH, "Use &alternative path", false);
		add(new LocationPatternField(ALT_PATH, "&Path", "file://${deploy_loc}/${resource_name_noext}.swf"));
		
		addGroup("When opening Swf files",true, EXCLUDE_IN_PREFERENCE);
		add(OPEN_BROWSER, "&Use", new String[][] {
				new String[] {"Workspace preference", CHOICE_PREFERENCE},
				new String[] {"Internal editor", CHOICE_EDITOR},
				new String[] {"Internal view", CHOICE_VIEW},
				new String[] {"External browser", CHOICE_EXTERNAL}
		});
	}
}
