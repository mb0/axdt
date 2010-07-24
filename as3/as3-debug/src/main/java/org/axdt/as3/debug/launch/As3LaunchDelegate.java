package org.axdt.as3.debug.launch;

import org.axdt.as3.debug.launch.jobs.PrepareLaunchJob;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

/**
 * @author mb0
 * @author nkuebler
 */
public class As3LaunchDelegate extends LaunchConfigurationDelegate {

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		try {
			AxdtLaunchContext context = new AxdtLaunchContext(launch,
					configuration, mode);
			// TODO allow contributed workflows 
			context.enqueueJob(new PrepareLaunchJob(context));
			context.workJobs(monitor);
		} finally {
			DebugPlugin.getDefault().getLaunchManager().removeLaunch(launch);
		}
	}
}
