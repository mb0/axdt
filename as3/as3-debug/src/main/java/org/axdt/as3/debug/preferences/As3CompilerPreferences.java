package org.axdt.as3.debug.preferences;

import java.util.Arrays;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.common.preferences.AbstractPreferences;
import org.axdt.compiler.IAxdtCompiler;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class As3CompilerPreferences extends AbstractPreferences {

	public static final String COMPILER_CHOICE = "COMPILER_CHOICE";
	public static final String GATHER_LIBS = "GATHER_LIBS";
	public static final String SEARCH_CONFIG = "SEARCH_CONFIG";
	public static final String FLEX3_COMPATIBILITY = "FLEX3_COMPATIBILITY";

	private static As3CompilerPreferences instance;

	public static As3CompilerPreferences getInstance() {
		if (instance == null) {
			instance = new As3CompilerPreferences();
		}
		return instance;
	}
	public As3CompilerPreferences() {
		super("Preferences for the As3 compilers");
	}
	public String getQualifier() {
		return As3DebugPlugin.PLUGIN_ID;
	}

	public void initializeFieldSpecs() {
		add(COMPILER_CHOICE,"Select Default Compiler",getCompilerChoices());
		add(GATHER_LIBS, "Automatically add all swc files in the lib folder.", true);
		add(FLEX3_COMPATIBILITY, "Use Flex3 compatibility mode.", false);
		addGroup("Search and apply the ${target_name}-config.xml:", true);
		add(SEARCH_CONFIG, "In the config folder.", false);
		// TODO add help link
	}
	private String[][] getCompilerChoices() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = registry.getConfigurationElementsFor(IAxdtCompiler.EXTENSION_ID);
		return Lists.transform(Arrays.asList(elements),
			new Function<IConfigurationElement, String[]>(){
				public String[] apply(IConfigurationElement c) {
					return new String[]{c.getAttribute("name"), c.getAttribute("id")};
		}}).toArray(new String[elements.length][]);
	}
}
