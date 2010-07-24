package org.axdt.as3.debug.compiler;

import java.io.File;
import java.util.List;

import org.axdt.core.AxdtCore;
import org.axdt.core.config.ICoreConfig;
import org.axdt.launch.AxdtCompilerTarget;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import com.google.common.collect.Lists;

public class As3CompilerTarget extends AxdtCompilerTarget {

	private ICoreConfig axdtConfig = null;

	public As3CompilerTarget(IResource resource) {
		super(resource);
	}

	protected ICoreConfig getConfig() {
		if (axdtConfig == null)
			axdtConfig = AxdtCore.getPlugin().getAxdtConfig(ICoreConfig.ID,
					ICoreConfig.class);
		return axdtConfig;
	}

	@Override
	public IContainer getConfigContainer() {
		return getConfig() != null
				? getConfig().getConfigResource(resource) 
				: null;
	}

	@Override
	public IContainer getDeployContainer() {
		return getConfig() != null
				? getConfig().getOutputResource(resource)
				: null;
	}

	@Override
	public List<IPath> getSourceLocations() {
		return getConfig() != null 
				? getConfig().getSourceLocations(resource) 
				: null;
	}

	public List<File> getResolvedLibraries() {
		List<IPath> libraryPaths = getLibraryLocations();
		List<File> result = Lists.newArrayList();
		for (IPath lib:libraryPaths) {
			File file = lib.toFile();
			if (file != null && file.exists() && file.isDirectory()) {
				File[] listFiles = file.listFiles();
				for (File entry:listFiles) {
					if (entry.getName().endsWith(".swc"))
						result.add(entry);
				}
			}
		}
		return result;
	}
	@Override
	public List<IPath> getLibraryLocations() {
		return getConfig() != null ? getConfig().getLibraryLocations(resource) : null;
	}
}
