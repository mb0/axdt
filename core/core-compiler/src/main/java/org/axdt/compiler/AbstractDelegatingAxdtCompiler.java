/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.compiler;

import java.util.Map;

import org.axdt.common.IAxdtExtension;
import org.axdt.launch.AxdtCompilerTarget;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.common.collect.Maps;

/**
 * @author mb0
 */
public abstract class AbstractDelegatingAxdtCompiler implements IAxdtCompiler {

	protected Map<String, AxdtCompilerTarget> targets = null;

	/**
	 * Caches compiler targets. Clients should implement and use singleton
	 * access.
	 */
	protected AbstractDelegatingAxdtCompiler() {
		// TODO think about cache cleanup
		targets = Maps.newHashMap();
	}

	/**
	 * Checks the cache and returns a target for the given file. If there is no
	 * cached target a new target is created.
	 * 
	 * @param file
	 *            the file to create a compiler target for
	 * @return the corresponding compiler target
	 */
	public AxdtCompilerTarget getTargetFor(IFile file) {
		String key = file.getLocation().toOSString();
		if (!targets.containsKey(key)) {
			AxdtCompilerTarget target = createTargetFor(file);
			if (target != null)
				targets.put(key, target);
		}
		return targets.get(key);
	}

	protected AxdtCompilerTarget createTargetFor(IFile file) {
		return new AxdtCompilerTarget(file);
	}

	public boolean compile(AxdtLaunchContext context, IProgressMonitor monitor)
			throws Exception {
		String compilerId = context.getCompilerId();
		if (compilerId == null)
			compilerId = getDefaultCompilerId(context.getCompilerTarget());
		if (compilerId != null) {
			IAxdtCompiler compiler = getCompiler(compilerId);
			return doCompile(compiler, context, monitor);
		}
		return false;
	}

	protected boolean doCompile(IAxdtCompiler compiler,
			AxdtLaunchContext context, IProgressMonitor monitor)
			throws Exception {
		return compiler.compile(context, monitor);
	}

	protected IAxdtCompiler getCompiler(String compilerId) throws CoreException {
		return IAxdtExtension.Helper.executeContribution(
				IAxdtCompiler.EXTENSION_ID, compilerId, IAxdtCompiler.class);
	}

	protected String getDefaultCompilerId(AxdtCompilerTarget target) {
		return null;
	}
}
