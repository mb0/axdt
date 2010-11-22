/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import java.util.Map;

import org.axdt.launch.AxdtLaunchContext;
import org.axdt.launch.JobMutexRule;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;

import flash.tools.debugger.Location;
import flash.tools.debugger.PlayerDebugException;
import flash.tools.debugger.Session;

public class FlexDebugTarget extends FlexDebugElement implements IDebugTarget {

	protected final Session session;
	protected final FlexDebugThread thread;
	protected final IThread[] threads;

	private ILaunch launch;

	public FlexDebugTarget(Session session) {
		super(null);
		this.session = session;
		thread = new FlexDebugThread(this, session);
		threads = new IThread[] { thread };
	}

	public Job init(AxdtLaunchContext context) throws PlayerDebugException {
		launch = context.getLaunch();
		session.bind();
		launch.addDebugTarget(this);
		return new EventRouter(thread);
	}

	@Override
	public ILaunch getLaunch() {
		return launch;
	}

	public void breakpointAdded(IBreakpoint breakpoint) {
		if (!supportsBreakpoint(breakpoint))
			return;
		try {
			if (!breakpoint.isEnabled())
				return;
			FlexLineBreakpoint bp = (FlexLineBreakpoint) breakpoint;
			IResource resource = bp.getMarker().getResource();
			String location = resource.getLocation().toString();
			int line = bp.getLineNumber();
			for (Location loc : session.getBreakpointList()) {
				if (loc.getLine() == line && loc.getFile() != null
						&& location.equals(loc.getFile().getFullPath()))
					return;
			}
			Map<String, Integer> files = thread.getFilesMap();
			Integer fileId = files.get(location);
			if (fileId != null)
				session.setBreakpoint(fileId, line);
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (PlayerDebugException e) {
			e.printStackTrace();
		}
	}

	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (!supportsBreakpoint(breakpoint))
			return;
		FlexLineBreakpoint bp = (FlexLineBreakpoint) breakpoint;
		try {
			IResource resource = bp.getMarker().getResource();
			String location = resource.getLocation().toString();
			for (Location loc : session.getBreakpointList()) {
				String fullPath = loc.getFile().getFullPath();
				if (location.equals(fullPath)) {
					session.clearBreakpoint(loc);
					break;
				}
			}
		} catch (PlayerDebugException e) {
			e.printStackTrace();
		}
	}

	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (!supportsBreakpoint(breakpoint))
			return;
		try {
			if (breakpoint.isEnabled())
				breakpointAdded(breakpoint);
			else
				breakpointRemoved(breakpoint, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public boolean canDisconnect() {
		return true;
	}

	public boolean canResume() {
		return thread.canResume();
	}

	public boolean canSuspend() {
		return thread.canSuspend();
	}

	public boolean canTerminate() {
		return thread.canTerminate();
	}

	public boolean isSuspended() {
		return thread.isSuspended();
	}

	public boolean isTerminated() {
		return thread.isTerminated();
	}

	public boolean isDisconnected() {
		return thread.isDisconnected();
	}

	public void disconnect() throws DebugException {
		thread.disconnect();
	}

	public void resume() throws DebugException {
		thread.resume();
	}

	public void suspend() throws DebugException {
		thread.suspend();
	}

	public void terminate() throws DebugException {
		thread.terminate();
	}

	public boolean supportsStorageRetrieval() {
		return false;
	}

	public IMemoryBlock getMemoryBlock(long startAddress, long length)
			throws DebugException {
		notSupported("unsopported", null);
		return null;
	}

	public IProcess getProcess() {
		return null;
	}

	public IThread[] getThreads() throws DebugException {
		return threads;
	}

	public boolean hasThreads() throws DebugException {
		return true;
	}

	public String getName() throws DebugException {
		return "Flex 4 " + session.getURI();
	}

	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		return breakpoint instanceof FlexLineBreakpoint;
	}

	public FlexDebugTarget getDebugTarget() {
		return this;
	}

	public static class EventRouter extends Job {

		private final FlexDebugThread thread;

		public EventRouter(FlexDebugThread thread) {
			super("Debugging");
			this.thread = thread;
			setRule(JobMutexRule.getMutex());
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			monitor.beginTask("Terminate to stop debugging.",
					IProgressMonitor.UNKNOWN);
			try {
				do {
					Thread.sleep(1000);
					thread.processEvents();
				} while (!monitor.isCanceled() && !thread.isDisconnected());
				return thread.isTerminated() ? Status.OK_STATUS
						: Status.CANCEL_STATUS;
			} catch (Exception e) {
				return new Status(IStatus.ERROR, PLUGIN_ID, e.getMessage(), e);
			} finally {
				thread.disconnect();
			}
		}
	}
}
