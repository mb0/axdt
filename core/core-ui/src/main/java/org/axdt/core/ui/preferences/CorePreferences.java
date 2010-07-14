package org.axdt.core.ui.preferences;

import java.util.List;

import org.axdt.common.preferences.AbstractPreferences;
import org.axdt.core.config.ICoreConfig;
import org.axdt.core.config.ISwfConfig;
import org.axdt.core.ui.CoreUiActivator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import com.google.common.collect.Lists;

public class CorePreferences extends AbstractPreferences 
		implements ICoreConfig, ISwfConfig {
	
	private static CorePreferences instance;

	public static CorePreferences getInstance() {
		if (instance == null)
			new CorePreferences();
		return instance;
	}
	
	public CorePreferences() {
		super("Preferences for Axdt projects");
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
		
		addGroup("Project folders", true);
		add(SOURCE_PATHS, "&Source paths", "src test");
		add(OUTPUT_PATH, "&Deploy path", "deploy");
		add(CONFIG_PATH, "&Config path", "config");
		add(LIBRARY_PATHS, "&Library paths", "lib");
		
		addGroup("When opening Swf files",true, EXCLUDE_IN_PROPERTIES);
		add(OPEN_BROWSER, "&Use an", new String[][] {
				new String[] {"Internal editor", CHOICE_EDITOR},
				new String[] {"Internal view", CHOICE_VIEW},
				new String[] {"External browser", CHOICE_EXTERNAL}
		});
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

	public IContainer getOutputResource(IResource res) {
		IProject project = checkProject(res);
		return getRelativeResource(project, res, OUTPUT_PATH);
	}

	public IContainer getConfigResource(IResource res) {
		IProject project = checkProject(res);
		return getRelativeResource(project, res, CONFIG_PATH);
	}
	private IContainer getRelativeResource(IProject project, IResource context,
			String configName) {
		String path = getProjectStore(context).getString(configName);
		return project.getFolder(path);
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
		if (res  == null)
			throw new IllegalArgumentException("resource must be specified");
		IProject project = res.getProject();
		if (project == null)
			throw new IllegalArgumentException("project must be specified");
		return project;
	}
}