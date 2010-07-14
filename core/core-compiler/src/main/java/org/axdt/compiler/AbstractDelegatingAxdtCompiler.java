package org.axdt.compiler;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Maps;

public abstract class AbstractDelegatingAxdtCompiler implements IAxdtCompiler {

	protected Map<String, AxdtCompilerTarget> targets = null;
	
	/**
	 * Uses an extension cache. Clients should implement
	 * and use singleton access.
	 */
	protected AbstractDelegatingAxdtCompiler() {
		// TODO think about cache cleanup
		targets = Maps.newHashMap();
	}
	/**
	 * Checks the cache and returns a target for the given file. 
	 * If there is no cached target a new target is created.
	 * 
	 * @param file the file to create a compiler target for
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
	public boolean compile(AxdtCompilerTarget target, IProgressMonitor monitor)
			throws Exception {
		return compile(target, null, monitor);
	}
	public boolean compile(AxdtCompilerTarget target, String compilerId, IProgressMonitor monitor)
		throws Exception {
		if (compilerId == null)
			compilerId = getDefaultCompilerId(target);
		if (compilerId != null) {
			IAxdtCompiler compiler = getCompiler(compilerId);
			return doCompile(compiler, target, monitor);
		}
		return false;
	}
	protected boolean doCompile(IAxdtCompiler compiler,
			AxdtCompilerTarget target, IProgressMonitor monitor) throws Exception {
		if (compiler == null) return false;
		ClassLoader oldLoader = Thread.currentThread().getContextClassLoader();
		ClassLoader extLoader = compiler.getClass().getClassLoader();
		Thread.currentThread().setContextClassLoader(extLoader);
		boolean result = false;
		try {
			result = compiler.compile(target, monitor);
		} finally {
			Thread.currentThread().setContextClassLoader(oldLoader);
		}
		return result;
	}
	protected IAxdtCompiler getCompiler(String compilerId) throws CoreException {
		IConfigurationElement contrib = getCompilerContribution(compilerId);
		if (contrib != null) {
			Object extension = contrib.createExecutableExtension("class");
			if (extension != null && extension instanceof IAxdtCompiler) {
				return (IAxdtCompiler) extension;
			}
		}
		return null;
	}
	protected IConfigurationElement getCompilerContribution(String compilerId) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = registry.getConfigurationElementsFor(IAxdtCompiler.EXTENSION_ID);
		for (IConfigurationElement element : elements) {
			if (compilerId.equals(element.getAttribute("id")))
				return element;
		}
		return null;
	}
	protected String getDefaultCompilerId(AxdtCompilerTarget target) {
		return null;
	}
}
