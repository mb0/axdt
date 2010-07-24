package org.axdt.launch;

import java.net.URL;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;

import com.google.common.collect.Lists;

/**
 * @author nkuebler
 * @author mb0
 */
public class AxdtLaunchContext {

	protected final List<AbstractLaunchJob> jobQueue;
	protected final ILaunch launch;
	protected final ILaunchConfiguration config;
	protected final String launchMode;

	// should be initialized by a prepare job
	protected AxdtCompilerTarget compilerTarget = null;
	protected String compilerId = null;
	protected String playerId = null;
	protected URL targetUrl;
	private String debuggerId;

	public AxdtLaunchContext(ILaunch launch, ILaunchConfiguration config,
			String launchMode) {
		this.jobQueue = Collections.synchronizedList(
				Lists.<AbstractLaunchJob>newLinkedList());
		this.launch = launch;
		this.config = config;
		this.launchMode = launchMode;
	}

	public ILaunch getLaunch() {
		return launch;
	}

	public ILaunchConfiguration getConfig() {
		return config;
	}

	public String getLaunchMode() {
		return launchMode;
	}

	public AbstractLaunchJob getNextJob() {
		synchronized (jobQueue) {
			return jobQueue.isEmpty() ? null : jobQueue.remove(0);
		}
	}

	public void enqueueJob(AbstractLaunchJob job) {
		jobQueue.add(job);
	}

	public AxdtCompilerTarget getCompilerTarget() {
		return compilerTarget;
	}

	public void setCompilerTarget(AxdtCompilerTarget target) {
		this.compilerTarget = target;
	}

	public String getCompilerId() {
		return compilerId;
	}

	public void setCompilerId(String compilerId) {
		this.compilerId = compilerId;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public URL getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(URL targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getDebuggerId() {
		return debuggerId;
	}

	public void setDebuggerId(String debuggerId) {
		this.debuggerId = debuggerId;
	}

	public boolean isDebugLaunch() {
		return "debug".equals(launchMode);
	}

	public void workJobs(IProgressMonitor monitor) {
		try {
			AbstractLaunchJob job = getNextJob();
			while (job != null) {
				launch.addProcess(job);
				job.schedule();
				job.join();
				job = getNextJob();
			}
		} catch (InterruptedException e) {
			Logger.getLogger(getClass()).error("error joining launch job", e);
		} finally {
			monitor.done();
		}
	}
}
