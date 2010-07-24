package org.axdt.debugger;

import org.axdt.common.IAxdtExtension;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author nkuebler
 */
public interface IAxdtDebugger extends IAxdtExtension {

	String EXTENSION_ID = "org.axdt.core.compiler.axdtDebugger";

	boolean debug(AxdtLaunchContext context, IProgressMonitor monitor)
			throws Exception;
}
