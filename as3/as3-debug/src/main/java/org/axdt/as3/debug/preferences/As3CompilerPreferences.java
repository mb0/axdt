package org.axdt.as3.debug.preferences;

import java.util.Arrays;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.common.preferences.AbstractPreferences;
import org.axdt.compiler.AxdtCompilerConfig;
import org.axdt.compiler.IAxdtCompiler;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class As3CompilerPreferences extends AbstractPreferences implements AxdtCompilerConfig {

	public static final String SEARCH_LIBS = "searchLibraries";
	public static final String SEARCH_CONFIG = "searchConfiguration";
	public static final String CHOICE_FLEX3 = "flex3";
	
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
		addGroup("Compiler", true);
		add(COMPILER_CHOICE, "Use ", getCompilerChoices());
		add(COMPATIBILITY_CHOICE, "Compatibility mode",
				getCompatibilityChoices());
		add(CACHE_CHOICE, "Incremental cache",
				getCachingChoices());
		
		addGroup("Configuration", false);
		add(SEARCH_CONFIG,
				"Search the config folder for ${target_name}-config.xml", false);
		addHelp("Axdt always searches the target's folder.");
		add(SEARCH_LIBS, "Search the library folders for Swc files", true);
		// TODO add help link
	}

	private String[][] getCachingChoices() {
		return new String[][] { 
				new String[] { "File cache", CHOICE_FILE },
				new String[] { "Memory cache", CHOICE_MEMORY },
				new String[] { "No cache", CHOICE_NONE } };
	}

	private String[][] getCompatibilityChoices() {
		return new String[][] { 
				new String[] { "None", CHOICE_NONE },
				new String[] { "Flex 3", CHOICE_FLEX3 } };
	}

	private String[][] getCompilerChoices() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = registry
				.getConfigurationElementsFor(IAxdtCompiler.EXTENSION_ID);
		return Lists.transform(Arrays.asList(elements),
				new Function<IConfigurationElement, String[]>() {
					public String[] apply(IConfigurationElement c) {
						return new String[] {
								c.getAttribute("name"),
								c.getAttribute("id") };
					}
				}).toArray(new String[elements.length][]);
	}
}
