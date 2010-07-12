package org.axdt.core.ui.preferences;

import java.util.List;

import org.axdt.common.preferences.AbstractPreferences;
import org.axdt.core.config.ICoreConfig;
import org.axdt.core.ui.CoreUiActivator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import com.google.common.collect.Lists;

public class CorePreferences extends AbstractPreferences implements ICoreConfig {
	
	private static CorePreferences instance;

	public static CorePreferences getInstance() {
		if (instance == null)
			new CorePreferences();
		return instance;
	}
	
	public CorePreferences() {
		super("Preferences for the AXDT project");
		assert(instance == null);
		instance = this;
	}
	public String getConfigId() {
		return ID;
	}
	public String getQualifier() {
		return CoreUiActivator.PLUGIN_ID;
	}

	public void initializeFieldSpecs() {
		add(SOURCE_PATHS, "Source &paths", "src");
		add(OUTPUT_PATH, "&Deploy path", "deploy");
		add(CONFIG_PATH, "&Config path", "config");
		add(LIBRARY_PATHS, "&Library &paths", "lib");
	}
	public List<IPath> getSourcePaths(IResource res) {
		IPath projectPath = checkProject(res).getFullPath();
		return getRelativePaths(projectPath, res, SOURCE_PATHS);
	}
	public List<IPath> getSourceLocations(IResource res) {
		IPath projectLocation = checkProject(res).getLocation();
		return getRelativePaths(projectLocation, res, SOURCE_PATHS);
	}
	public List<IPath> getLibraryLocations(IResource res) {
		IPath projectLocation = checkProject(res).getLocation();
		return getRelativePaths(projectLocation, res, LIBRARY_PATHS);
	}
	public IPath getOutputLocation(IResource res) {
		IPath projectLocation = checkProject(res).getLocation();
		return getRelativePath(projectLocation, res, OUTPUT_PATH);
	}
	public IPath getConfigLocation(IResource res) {
		IPath projectLocation = checkProject(res).getLocation();
		return getRelativePath(projectLocation, res, CONFIG_PATH);
	}
	private IPath getRelativePath(IPath base, IResource context,
			String configName) {
		String path = getProjectStore(context).getString(configName);
		return base.append(path);
	}
	private List<IPath> getRelativePaths(IPath base, IResource context,
			String configName) {
		String[] paths = getProjectStore(context).getString(configName).split("[,; ]");
		List<IPath> result = Lists.newArrayList();
		for (String path: paths)
			result.add(base.append(path));
		return result;
	}
	protected IProject checkProject(IResource res) {
		IProject project = res.getProject();
		if (project == null)
			throw new IllegalArgumentException("project must be specified");
		return project;
	}
}