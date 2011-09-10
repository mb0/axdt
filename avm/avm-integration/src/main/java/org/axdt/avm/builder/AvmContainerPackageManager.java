package org.axdt.avm.builder;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.axdt.avm.builder.AvmContainerPackageCollector.ProjectResult;
import org.axdt.avm.naming.AvmQualifiedName;
import org.axdt.core.AxdtCore;
import org.axdt.core.model.AxdtPackageRoot;
import org.axdt.core.model.AxdtProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import com.google.common.collect.Maps;

public class AvmContainerPackageManager implements IResourceChangeListener {
	
	private static AvmContainerPackageManager instance = null;
	public static AvmContainerPackageManager getInstance() {
		if (instance == null) {
			instance = new AvmContainerPackageManager();
			instance.register();
		}
		return instance;
	}
	

	protected final Logger logger = Logger
			.getLogger(AvmContainerPackageManager.class);
	protected final Map<String, Map<IPath, AvmQualifiedName>> stores = Maps.newHashMap();

	public void register() {
		logger.warn("register package manager");
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		try {
			AvmContainerPackageCollector collector = new AvmContainerPackageCollector();
			workspace.getRoot().accept(collector);
			updateStore(collector.getResults());
		} catch (CoreException e) {
			logger.warn("error collecting initial package manager state", e);
		}
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this,
				IResourceChangeEvent.PRE_BUILD);
		
	}

	public void unregister() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		synchronized (stores) {
			stores.clear();
		}
	}

	public void resourceChanged(IResourceChangeEvent event) {
		try {
			IResourceDelta delta = event.getDelta();
			if (delta.getKind() != IResourceDelta.NO_CHANGE) {
				AvmContainerPackageCollector collector = new AvmContainerPackageCollector();
				delta.accept(collector);
				updateStore(collector.getResults());
			}
		} catch (CoreException e) {
			logger.warn("error collect packge from resource delta", e);
			e.printStackTrace();
		}
	}
	private void updateStore(List<ProjectResult> results) {
		printResults(results);
		for (ProjectResult res: results) {
			AxdtProject project = AxdtCore.getModel().getProject(res.getProject());
			String handle = project.getName();
			List<AxdtPackageRoot> roots = project.getPackageRoots();
			synchronized (stores) {
				Map<IPath, AvmQualifiedName> map = stores.get(handle);
				if (map == null)
					map = Maps.newHashMap();
				for (IPath add:res.getAdditions()) {
					AvmQualifiedName name = createPackage(add, roots);
					if (name != null)
						map.put(add, name);
				}
				for (IPath del:res.getDeletions())
					map.remove(del);
				stores.put(handle, map);
			}
		}
	}

	private AvmQualifiedName createPackage(IPath add, List<AxdtPackageRoot> roots) {
		for (AxdtPackageRoot root:roots) {
			IPath rootPath = root.getPath();
			if (rootPath.isPrefixOf(add)) {
				String[] segments = add.removeFirstSegments(rootPath.segmentCount()).segments();
				return new AvmQualifiedName(segments);
			}
		}
		return null;
	}

	private void printResults(List<ProjectResult> results) {
		for (ProjectResult res: results) {
			String handle = res.getProject().getName();
			System.out.println("collect "+ handle);
			for (IPath add:res.getAdditions())
				System.out.println("+\t"+ add);
			for (IPath del:res.getDeletions())
				System.out.println("-\t"+ del);
		}
	}

	public Collection<AvmQualifiedName> getPackageNames(String handle) {
		synchronized (stores) {
			return stores.get(handle).values();
		}
	}
}
