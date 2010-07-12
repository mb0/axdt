package org.axdt.compiler;

import org.eclipse.core.runtime.IProgressMonitor;

public interface IAxdtCompiler {
	String EXTENSION_ID = "org.axdt.core.compiler.axdtCompiler";
	boolean compile(AxdtCompilerTarget target, IProgressMonitor monitor) throws Exception;
}
