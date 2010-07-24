package org.axdt.as3.debug.launch.jobs;

import org.axdt.as3.debug.compiler.As3DelegatingCompiler;
import org.axdt.launch.AbstractLaunchJob;
import org.axdt.launch.AxdtLaunchContext;
import org.axdt.launch.JobMutexRule;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

/**
 * @author nkuebler
 * @author mb0
 */
public class CompileJob extends AbstractLaunchJob {

	public CompileJob(AxdtLaunchContext context) {
		super("Compile Swf", context);
		setRule(JobMutexRule.getMutex());
	}

	@Override
	protected IStatus doRun(IProgressMonitor monitor) throws Exception {
		monitor.beginTask("Compiling Targets", 100);
		boolean successful = As3DelegatingCompiler.getInstance().compile(
				context, monitor);
		if (!successful)
			throw new IllegalStateException("compilation was not successful");
		return null;
	}
}
