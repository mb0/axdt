package org.axdt.compiler;

import org.eclipse.core.runtime.IProgressMonitor;

public abstract class AbstractAxdtCompiler implements IAxdtCompiler {
	
	public boolean compile(AxdtCompilerTarget target, IProgressMonitor monitor)
			throws Exception {
		return false;
	}
}