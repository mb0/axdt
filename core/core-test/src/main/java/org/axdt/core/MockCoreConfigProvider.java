/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core;

import java.util.Collections;
import java.util.List;

import org.axdt.common.config.AbstractMapConfig;
import org.axdt.common.config.IAxdtConfig;
import org.axdt.common.config.IAxdtConfigProvider;
import org.axdt.core.config.ICoreConfig;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import com.google.common.collect.Lists;

public class MockCoreConfigProvider extends AbstractMapConfig implements IAxdtConfigProvider, ICoreConfig {
	
	private static IAxdtConfigProvider old = null;

	public static void reinstall(boolean mock) {
		uninstall();
		install(mock);
	}
	public static void install(boolean mock) {
		if (old == null)
			old = AxdtCore.getPlugin().getConfigProvider();
		AxdtCore.getPlugin().setConfigProvider(new MockCoreConfigProvider(mock));
	}
	public static void uninstall() {
		AxdtCore.getPlugin().setConfigProvider(old);
	}
	
	protected final boolean mockNull;
	
	public MockCoreConfigProvider(boolean mockNull) {
		this.mockNull = mockNull;
	}

	public IAxdtConfig getAxdtConfig(String name) {
		return !ICoreConfig.ID.equals(name) ? null : this;
	}
	
	public String getConfigId() {
		return ICoreConfig.ID;
	}
	public boolean useResource(IResource res) {
		return res != null && res.getProject() != null;
	}
	public List<IPath> getSourcePaths(IResource res) {
		if (!useResource(res)) return null;
		if (mockNull) return Collections.emptyList();
		IPath path = res.getProject().getFullPath();
		return Lists.newArrayList(path.append("src"),path.append("test"));
	}
	public List<IPath> getSourceLocations(IResource res) {
		if (!useResource(res)) return null;
		if (mockNull) return Collections.emptyList();
		IPath path = res.getProject().getLocation();
		return Lists.newArrayList(path.append("src"),path.append("test"));
	}
	
	public List<IPath> getLibraryLocations(IResource res) {
		if (!useResource(res)) return null;
		if (mockNull) return Collections.emptyList();
		IPath path = res.getProject().getLocation();
		return Lists.newArrayList(path.append("foo"),path.append("bar"));
	}
	
	public IContainer getOutputResource(IResource res) {
		if (!useResource(res)||mockNull) return null;
		IProject path = res.getProject();
		return path.getFolder("bin");
	}
	public IContainer getConfigResource(IResource res) {
		if (!useResource(res)||mockNull) return null;
		IProject path = res.getProject();
		return path.getFolder("spam");
	}
}
