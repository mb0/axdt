package org.axdt.flex4.compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.axdt.as3.debug.preferences.As3CompilerPreferences;
import org.axdt.compiler.AbstractAxdtCompiler;
import org.axdt.compiler.AxdtCompilerTarget;
import org.eclipse.core.runtime.IProgressMonitor;

import flex2.tools.oem.Application;
import flex2.tools.oem.Configuration;

public class Flex4Compiler extends AbstractAxdtCompiler {
	
	private static final String APPLICATION = "app";
	
	public Flex4Compiler() {
	}

	@Override
	public boolean compile(AxdtCompilerTarget target, IProgressMonitor monitor)
			throws Exception {
		Application app = getApplication(target);
		configureApplication(app, target);
		checkAndMakeDir(app.getOutput().getParentFile());
		Flex4Console logger = Flex4Console.getDefault();
		app.setLogger(logger);
		app.setProgressMeter(new CompilerProgressMonitor(monitor, target.getDeployFileName()));
		logger.append("compiling " + target.getDeployFileName());
		long status = app.build(true);
		app.setProgressMeter(null);
		return status > 0;
	}

	protected boolean checkAndMakeDir(File file) {
		return file.exists() ? false : file.mkdir();
	}

	protected Application getApplication(AxdtCompilerTarget target) throws FileNotFoundException {
		Application result = target.getContextValue(APPLICATION, Application.class);
		if (result == null) {
			result = createApplication(target);
			target.setContext(APPLICATION, result);
		}
		return result;
	}
	
	protected void configureApplication(Application app, AxdtCompilerTarget target) {
		app.setOutput(target.getDeployFileLocation().toFile());
		Configuration config = app.getDefaultConfiguration();
		config.addSourcePath(AxdtCompilerTarget.pathsToFileArray(target.getSourceLocations()));
		boolean gatherLibs = target.getContextValue(As3CompilerPreferences.SEARCH_LIBS, Boolean.class);
		if (gatherLibs) {
			List<File> libraries = target.getResolvedLibraries();
			if (!libraries.isEmpty()) config.addLibraryPath(libraries.toArray(new File[libraries.size()]));
		}
		if (target.getContextValue(As3CompilerPreferences.FLEX3_COMPATIBILITY, Boolean.class))
			config.setCompatibilityVersion(3, 0, 0);
		File configConfigFile = getConfigConfigFile(target);
		if (configConfigFile != null)
			config.addConfiguration(configConfigFile);
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
