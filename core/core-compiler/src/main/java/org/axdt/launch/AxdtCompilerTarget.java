package org.axdt.launch;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.axdt.compiler.AxdtCompilerConfig;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
 * @author mb0
 */
public class AxdtCompilerTarget {

	protected final IResource resource;
	protected final Map<String, Object> contexts;

	public AxdtCompilerTarget(IResource resource) {
		if (resource == null || !resource.getProject().exists())
			throw new IllegalArgumentException(
					"resource cannot be null and needs to reside with a project.");
		this.resource = resource;
		contexts = new HashMap<String, Object>(4);
	}

	public Object getContext(String key) {
		return contexts.get(key);
	}

	public void setContext(String key, Object value) {
		contexts.put(key, value);
	}

	@SuppressWarnings("unchecked")
	public <T> T getContextValue(String key, Class<T> clazz) {
		Object context = contexts.get(key);
		if (context != null && clazz.isAssignableFrom(context.getClass())) {
			return (T) context;
		}
		return null;
	}

	public IResource getTarget() {
		return resource;
	}

	public IProject getProject() {
		return resource.getProject();
	}

	public IPath getTargetFileLocation() {
		return resource.getLocation();
	}

	public String getTargetName() {
		return getTargetFileLocation().removeFileExtension().lastSegment();
	}

	public String getTargetFileName() {
		return getTargetFileLocation().lastSegment();
	}

	public String getDeployFileName() {
		return String.format("%s.swf", getTargetName());
	}

	public String getConfigFileName() {
		return String.format("%s-config.xml", getTargetName());
	}

	public IContainer getDeployContainer() {
		return getProject();
	}

	public IContainer getConfigContainer() {
		return getProject();
	}

	public List<IPath> getSourceLocations() {
		return Lists.newArrayList(getProject().getLocation());
	}

	public List<IPath> getLibraryLocations() {
		return Collections.singletonList(getProject().getLocation());
	}

	public List<File> getResolvedLibraries() {
		return Collections.emptyList();
	}

	public IPath getDeployFileLocation() {
		return getDeployContainer().getLocation().append(getDeployFileName());
	}

	public IPath getConfigFileLocation() {
		return getConfigContainer().getLocation().append(getConfigFileName());
	}

	public static File[] pathsToFileArray(List<IPath> paths) {
		List<File> list = Lists.transform(paths, new Path2File());
		return list.toArray(new File[list.size()]);
	}

	public static List<IPath> resourcesToPaths(List<IResource> resources) {
		return Lists.transform(resources, new Resource2Path());
	}

	private static class Path2File implements Function<IPath, File> {
		public File apply(IPath from) {
			return new File(from.toOSString());
		}
	}

	private static class Resource2Path implements Function<IResource, IPath> {
		public IPath apply(IResource from) {
			return from.getLocation();
		}
	}

	public String getLaunchMode() {
		return getContextValue(AxdtCompilerConfig.LAUNCH_MODE, String.class);
	}

	public void setLaunchMode(String launchMode) {
		setContext(AxdtCompilerConfig.LAUNCH_MODE, launchMode);
	}
}
