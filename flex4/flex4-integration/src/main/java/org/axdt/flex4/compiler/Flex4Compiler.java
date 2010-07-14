package org.axdt.flex4.compiler;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.axdt.as3.debug.preferences.As3CompilerPreferences;
import org.axdt.compiler.AbstractAxdtCompiler;
import org.axdt.compiler.AxdtCompilerConfig;
import org.axdt.compiler.AxdtCompilerTarget;
import org.axdt.flex4.preferences.Flex4Preferences;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;

import flex2.tools.oem.Application;
import flex2.tools.oem.Configuration;

public class Flex4Compiler extends AbstractAxdtCompiler {
	
	private static final String APPLICATION = "app";
	
	public Flex4Compiler() {
	}

	@Override
	public boolean compile(AxdtCompilerTarget target, IProgressMonitor monitor)
			throws Exception {
		IPreferenceStore prefs = Flex4Preferences.getInstance().getStore();
		String configPath = prefs.getString(Flex4Preferences.FLEX_CONFIG_FILE);
		String cache = target.getContextValue(AxdtCompilerConfig.CACHE_CHOICE, String.class);
		boolean useFileCache = cache != null && AxdtCompilerConfig.CHOICE_FILE.equals(cache);
		boolean useMemCache = cache != null && AxdtCompilerConfig.CHOICE_MEMORY.equals(cache);
		
		Application app = getApplication(target);
		target.setContext(APPLICATION, useMemCache ? app : null);
		
		configureApplication(app, target, configPath);
		checkAndMakeDir(app.getOutput().getParentFile());
		Flex4Console logger = Flex4Console.getDefault();
		app.setLogger(logger);
		app.setProgressMeter(new CompilerProgressMonitor(monitor, target.getDeployFileName()));
		logger.append("compiling " + target.getDeployFileName());
		
		File cacheFile = useFileCache ? getCacheFile(target.getTargetFileLocation()) : null;
		if (cacheFile != null && cacheFile.exists())
			app.load(new BufferedInputStream(new FileInputStream(cacheFile)));

		long status = app.build(true);
		
		if (cacheFile != null) {
			if (!cacheFile.exists()) {
				File parent = cacheFile.getParentFile();
				if (!parent.exists())
					parent.mkdirs();
				cacheFile.createNewFile();
			}
			app.save(new BufferedOutputStream(new FileOutputStream(cacheFile)));
		}
		app.setProgressMeter(null);
		return status > 0;
	}

	private File getCacheFile(IPath iPath) {
		String cacheFileName = Integer.toHexString(iPath.hashCode())
				+"_"+iPath.removeFileExtension().lastSegment()+".cache";
		URI resolvedUri = CommonPlugin.resolve(URI.createURI("platform:/meta/org.axdt.flex4.sdk"));
		URI uri = resolvedUri.appendSegment(cacheFileName);
		return new File(uri.toFileString()); 
	}

	protected boolean checkAndMakeDir(File file) {
		return file.exists() ? false : file.mkdirs();
	}

	protected Application getApplication(AxdtCompilerTarget target) throws FileNotFoundException {
		Application result = target.getContextValue(APPLICATION, Application.class);
		if (result == null)
			result = createApplication(target);
		return result;
	}
	
	protected void configureApplication(Application app, AxdtCompilerTarget target, String configPath) {
		app.setOutput(target.getDeployFileLocation().toFile());
		Configuration config = app.getDefaultConfiguration();
		if (configPath != null)
			config.setConfiguration(new File(configPath));
		config.addSourcePath(AxdtCompilerTarget.pathsToFileArray(target.getSourceLocations()));
		boolean gatherLibs = target.getContextValue(As3CompilerPreferences.SEARCH_LIBS, Boolean.class);
		if (gatherLibs) {
			List<File> libraries = target.getResolvedLibraries();
			if (!libraries.isEmpty()) config.addLibraryPath(libraries.toArray(new File[libraries.size()]));
		}
		File configConfigFile = getConfigConfigFile(target);
		if (configConfigFile != null)
			config.addConfiguration(configConfigFile);
		if (As3CompilerPreferences.CHOICE_FLEX3.equals(
				target.getContextValue(AxdtCompilerConfig.COMPATIBILITY_CHOICE, String.class)))
			config.setCompatibilityVersion(3, 0, 0);
		app.setConfiguration(config);
	}
	
	protected File getConfigConfigFile(AxdtCompilerTarget target) {
		boolean search = target.getContextValue(As3CompilerPreferences.SEARCH_CONFIG, Boolean.class);
		if (!search) return null;
		File file = target.getConfigFileLocation().toFile();
		if (!file.exists()) return null;
		return file;
	}
	
	private Application createApplication(AxdtCompilerTarget target) throws FileNotFoundException {
		return new Application(target.getTargetFileLocation().toFile());
	}
}
