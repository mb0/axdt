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

	public static final String COMPILER_CHOICE = "compiler";
	public static final String SEARCH_LIBS = "searchLibraries";
	public static final String SEARCH_CONFIG = "searchConfiguration";
	public static final String FLEX3_COMPATIBILITY = "flex3Compatibility";

	private static As3CompilerPreferences instance;

	public static As3CompilerPreferences getInstance() {
		if (instance == null) {
			instance = new As3CompilerPreferences();
		}
		return instance;
	}
	public As3CompilerPreferences() {
		super("Compiler preferences");
	}
	public String getQualifier() {
		return As3DebugPlugin.PLUGIN_ID;
	}

	public void initializeFieldSpecs() {
		addGroup("Compiler", false);
		add(COMPILER_CHOICE,"Use ",getCompilerChoices());
		addGroup("Configuration", true);
		add(SEARCH_CONFIG, "Search the config folder for ${target_name}-config.xml", false);
		addHelp("Axdt always searches the target's folder.");
		add(FLEX3_COMPATIBILITY, "Use Flex3 compatibility mode", false);
		addGroup("Libraries", true);
		add(SEARCH_LIBS, "Search the library folders for Swc files", true);
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
