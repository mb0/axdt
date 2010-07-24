package org.axdt.as3.debug.preferences;

import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.common.IAxdtExtension;
import org.axdt.common.preferences.AbstractPreferences;
import org.axdt.core.config.ISwfConfig;
import org.axdt.core.swf.IAxdtSwfPlayer;
import org.axdt.core.ui.preferences.CorePreferences;
import org.axdt.debugger.IAxdtDebugger;
import org.eclipse.core.runtime.IConfigurationElement;

import com.google.common.collect.Lists;
import com.google.common.collect.ObjectArrays;

/**
 * @author mb0
 */
public class As3DebugPreferences extends AbstractPreferences implements
		ISwfConfig {

	public static final String OPEN_SWF = "openSwf";
	public static final String USE_ALT_URI = "useAlternativeUri";
	public static final String ALT_URI = "alternativeUri";
	public static final String DEBUGGER_CHOICE = "debugger";

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
		add(USE_ALT_URI, "Use &alternative path", false);
		add(new LocationPatternField(ALT_URI, "&Path",
				"file://${deploy_loc}/${resource_name_noext}.swf"));

		addGroup("When opening Swf files", true, EXCLUDE_IN_PREFERENCE);
		add(OPEN_PLAYER, "&Use", getPlayerChoices());

		addGroup("Debugger", true, EXCLUDE_IN_LAUNCH);
		add(DEBUGGER_CHOICE, "Use ", getDebuggerChoices());
	}

	public String[][] getDebuggerChoices() {
		List<String[]> result = Lists.newArrayList();
		for (IConfigurationElement contrib : IAxdtExtension.Helper
				.getContributions(IAxdtDebugger.EXTENSION_ID)) {
			result.add(new String[] {
					contrib.getAttribute(IAxdtSwfPlayer.NAME_ATTRIBUTE),
					contrib.getAttribute(IAxdtSwfPlayer.ID_ATTRIBUTE) });
		}
		return result.toArray(new String[result.size()][]);
	}

	public IAxdtDebugger getDebugger(String id) {
		try {
			return IAxdtExtension.Helper.executeContribution(
					IAxdtDebugger.EXTENSION_ID, id, IAxdtDebugger.class);
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(
					"error creating debugger contribution" + id, e);
			return null;
		}
	}

	public String[][] getPlayerChoices() {
		CorePreferences corePreferences = CorePreferences.getInstance();
		String[][] result = corePreferences.getPlayerChoices();
		return ObjectArrays.concat(new String[][] { new String[] {
				"Workspace preference", CHOICE_PREFERENCE } }, result,
				String[].class);
	}
}
