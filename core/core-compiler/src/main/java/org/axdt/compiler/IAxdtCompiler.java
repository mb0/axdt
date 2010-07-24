package org.axdt.compiler;

import org.axdt.common.IAxdtExtension;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author mb0
 */
public interface IAxdtCompiler extends IAxdtExtension {
	String EXTENSION_ID = "org.axdt.core.compiler.axdtCompiler";
	
	boolean compile(AxdtLaunchContext context, IProgressMonitor monitor) throws Exception;
}
