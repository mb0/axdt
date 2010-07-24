package org.axdt.as3.debug.launch.jobs;

import org.axdt.launch.AbstractLaunchJob;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;

public class RefreshJob extends AbstractLaunchJob {

	public RefreshJob(AxdtLaunchContext context) {
		super("Refresh deploy folder", context);
		setRule(ResourcesPlugin.getWorkspace().getRoot());
	}

	@Override
	protected IStatus doRun(IProgressMonitor monitor) throws Exception {
		IContainer container = context.getCompilerTarget().getDeployContainer();
		container.refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(monitor, 1));
		return null;
	}

}
