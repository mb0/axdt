package org.axdt.core.config;

import java.util.List;

import org.axdt.common.config.IAxdtConfig;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

public interface ICoreConfig extends IAxdtConfig {

	String ID = "org.axdt.core.config";

	String SOURCE_PATHS = "sourcePaths";
	String LIBRARY_PATHS = "libraryPaths";
	String OUTPUT_PATH = "outputPath";
	String CONFIG_PATH = "configPath";
	
	List<IPath> getSourcePaths(IResource res);
	List<IPath> getSourceLocations(IResource res);
	List<IPath> getLibraryLocations(IResource res);
	IContainer getOutputResource(IResource res);
	IContainer getConfigResource(IResource res);
}
