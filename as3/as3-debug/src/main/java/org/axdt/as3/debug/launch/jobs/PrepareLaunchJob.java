/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.launch.jobs;

import java.net.MalformedURLException;
import java.net.URL;

import org.axdt.as3.debug.IAs3DebugConstants;
import org.axdt.as3.debug.compiler.As3DelegatingCompiler;
import org.axdt.as3.debug.preferences.As3CompilerPreferences;
import org.axdt.as3.debug.preferences.As3DebugPreferences;
import org.axdt.as3.debug.variables.As3PathVariableHelper;
import org.axdt.compiler.AxdtCompilerConfig;
import org.axdt.core.config.ISwfConfig;
import org.axdt.launch.AbstractLaunchJob;
import org.axdt.launch.AxdtCompilerTarget;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;

/**
 * @author nkuebler
 * @author mb0
 */
public class PrepareLaunchJob extends AbstractLaunchJob {

	protected ILaunchConfiguration config;

	public PrepareLaunchJob(AxdtLaunchContext context) {
		super("Prepare launch", context);
		config = context.getConfig();
	}

	@Override
	protected IStatus doRun(IProgressMonitor monitor) throws Exception {
		context.setCompilerTarget(getCompilerTarget());
		context.setCompilerId(getCompilerId());
		context.enqueueJob(new CompileJob(context));
		context.enqueueJob(new RefreshJob(context));
		String playerId = getPlayerId();
		if (playerId != null) {
			context.setPlayerId(playerId);
			context.setTargetUrl(getTargetUrl());
			if (context.isDebugLaunch()) {
				context.setDebuggerId(getDebuggerId());
				context.enqueueJob(new DebugJob(context));
			} else {
				context.enqueueJob(new RunPlayerJob(context));
			}
		}
		return null;
	}
	
	protected String getDebuggerId() {
		As3DebugPreferences pref = As3DebugPreferences.getInstance();
		return pref.getStore().getString(As3DebugPreferences.DEBUGGER_CHOICE);
	}

	protected URL getTargetUrl() throws MalformedURLException, CoreException {
		As3DebugPreferences pref = As3DebugPreferences.getInstance();
		AxdtCompilerTarget target = context.getCompilerTarget();
		if (pref.getBoolean(config,
				As3DebugPreferences.USE_ALT_URI)) {
			String template = pref.getString(config,
					As3DebugPreferences.ALT_URI);
			String targetPath = target .getTarget().getFullPath().toString();
			return As3PathVariableHelper.resolveURL(targetPath, template)
					.toURL();
		}
		return target.getDeployFileLocation().toFile().toURI().toURL();
	}

	protected String getPlayerId() throws CoreException {
		As3DebugPreferences pref = As3DebugPreferences.getInstance();
		if (pref.getBoolean(config, As3DebugPreferences.OPEN_SWF))
			return pref.getString(config, ISwfConfig.OPEN_PLAYER);
		return null;
	}

	protected String getCompilerId() throws CoreException {
		String compilerid = config.getAttribute(
				AxdtCompilerConfig.COMPILER_CHOICE,
				AxdtCompilerConfig.CHOICE_NONE);
		if (AxdtCompilerConfig.CHOICE_NONE.equals(compilerid))
			return null;
		return compilerid;
	}

	protected AxdtCompilerTarget getCompilerTarget() throws CoreException {
		As3DelegatingCompiler compiler = As3DelegatingCompiler.getInstance();
		IFile file = getTargetFile();
		AxdtCompilerTarget target = compiler.getTargetFor(file);
		target.setLaunchMode(context.getLaunchMode());
		setTargetContext(target, As3CompilerPreferences.SEARCH_LIBS, true);
		setTargetContext(target, As3CompilerPreferences.SEARCH_CONFIG, false);
		setTargetContext(target, AxdtCompilerConfig.COMPATIBILITY_CHOICE,
				AxdtCompilerConfig.CHOICE_NONE);
		setTargetContext(target, AxdtCompilerConfig.CACHE_CHOICE,
				AxdtCompilerConfig.CHOICE_NONE);
		return target;
	}

	protected IFile getTargetFile() throws CoreException {
		String pathStr = config.getAttribute(IAs3DebugConstants.TARGET, "");
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		return root.getFile(new Path(pathStr));
	}

	protected void setTargetContext(AxdtCompilerTarget target, String key,
			boolean defaultValue) throws CoreException {
		target.setContext(key, config.getAttribute(key, defaultValue));
	}

	protected void setTargetContext(AxdtCompilerTarget target, String key,
			String defaultValue) throws CoreException {
		target.setContext(key, config.getAttribute(key, defaultValue));
	}
}
