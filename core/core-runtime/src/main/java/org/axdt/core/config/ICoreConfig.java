package org.axdt.core.config;

import java.util.List;

import org.axdt.common.config.IAxdtConfig;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

public interface ICoreConfig extends IAxdtConfig {

	String ID = "org.axdt.core.config";

	String SOURCE_PATHS = "SOURCE_PATHS";
	String LIBRARY_PATHS = "LIBRARY_PATHS";
	String OUTPUT_PATH = "OUTPUT_PATH";
	String CONFIG_PATH = "CONFIG_PATH";
	
	List<IPath> getSourcePaths(IResource res);
	List<IPath> getSourceLocations(IResource res);
	List<IPath> getLibraryLocations(IResource res);
	IPath getOutputLocation(IResource res);
	IPath getConfigLocation(IResource res);
}
