package org.axdt.as3.debug.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

public class As3LaunchDelegate extends LaunchConfigurationDelegate {

	private static LaunchMutexRule mutex = null;

	private static ISchedulingRule getMutex() {
		if (mutex == null)
			mutex = new LaunchMutexRule();
		return mutex;
	}

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		As3LaunchJob job = new As3LaunchJob(launch, configuration);
		job.setRule(getMutex());
		launch.addProcess(job);
		job.schedule();
	}

	private static class LaunchMutexRule implements ISchedulingRule {
		public boolean contains(ISchedulingRule rule) {
			return rule == this;
		}

		public boolean isConflicting(ISchedulingRule rule) {
			return rule == this;
		}
	}
}
