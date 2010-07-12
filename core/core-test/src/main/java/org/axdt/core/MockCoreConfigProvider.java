package org.axdt.core;

import java.util.List;
import java.util.Map;

import org.axdt.common.config.IAxdtConfig;
import org.axdt.common.config.IAxdtConfigProvider;
import org.axdt.core.config.ICoreConfig;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class MockCoreConfigProvider implements IAxdtConfigProvider, ICoreConfig {
	
	private static IAxdtConfigProvider old = null;
	private Map<String, String> store = Maps.newHashMap(); 

	public static void install() {
		if (old == null)
			old = AxdtCore.getPlugin().getConfigProvider();
		AxdtCore.getPlugin().setConfigProvider(new MockCoreConfigProvider());
	}
	public static void uninstall() {
		AxdtCore.getPlugin().setConfigProvider(old);
	}

	public IAxdtConfig getAxdtConfig(String name) {
		return !ICoreConfig.ID.equals(name) ? null : this;
	}
	
	public String getString(IResource resource, String name) {
		return (String) store.get(name);
	}
	
	public int getInt(IResource resource, String name) {
		return Integer.parseInt(getString(resource, name));
	}
	
	public double getDouble(IResource resource, String name) {
		return Double.parseDouble(getString(resource, name));
	}
	
	public String getConfigId() {
		return ICoreConfig.ID;
	}
	
	public boolean getBoolean(IResource resource, String name) {
		return "true".equals(getString(resource, name));
	}
	
	public List<IPath> getSourcePaths(IResource res) {
		if (res == null || res.getProject() == null) return null;
		IPath path = res.getProject().getFullPath();
		return Lists.newArrayList(path.append("src"),path.append("test"));
	}
	public List<IPath> getSourceLocations(IResource res) {
		if (res == null || res.getProject() == null) return null;
		IPath path = res.getProject().getLocation();
		return Lists.newArrayList(path.append("src"),path.append("test"));
	}
	public IPath getOutputLocation(IResource res) {
		if (res == null || res.getProject() == null) return null;
		IPath path = res.getProject().getLocation();
		return path.append("bin");
	}
	
	public List<IPath> getLibraryLocations(IResource res) {
		if (res == null || res.getProject() == null) return null;
		IPath path = res.getProject().getLocation();
		return Lists.newArrayList(path.append("foo"),path.append("bar"));
	}
	
	public IPath getConfigLocation(IResource res) {
		if (res == null || res.getProject() == null) return null;
		IPath path = res.getProject().getLocation();
		return path.append("spam");
	}
}
