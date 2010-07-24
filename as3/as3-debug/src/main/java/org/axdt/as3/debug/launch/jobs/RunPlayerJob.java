package org.axdt.as3.debug.launch.jobs;

import org.axdt.core.ui.swf.SwfEditorLauncher;
import org.axdt.launch.AbstractLaunchJob;
import org.axdt.launch.AxdtLaunchContext;
import org.axdt.launch.JobMutexRule;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Display;

public class RunPlayerJob extends AbstractLaunchJob {

	public RunPlayerJob(AxdtLaunchContext context) {
		super("Open swf", context);
		setRule(JobMutexRule.getMutex());
	}

	@Override
	protected IStatus doRun(IProgressMonitor monitor) throws Exception {
		String playerId = context.getPlayerId();
		if (playerId == null)
			throw new IllegalStateException("no player configured");
		Display.getDefault().asyncExec(
				new SwfEditorLauncher.Runner(playerId, context
						.getTargetUrl()));
		return null;
	}
}
