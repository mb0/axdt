/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import java.util.Map;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointListener;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;

import com.google.common.collect.Maps;

import flash.tools.debugger.Frame;
import flash.tools.debugger.InProgressException;
import flash.tools.debugger.NoResponseException;
import flash.tools.debugger.NotConnectedException;
import flash.tools.debugger.PlayerDebugException;
import flash.tools.debugger.Session;
import flash.tools.debugger.SourceFile;
import flash.tools.debugger.SuspendReason;
import flash.tools.debugger.SwfInfo;
import flash.tools.debugger.events.BreakEvent;
import flash.tools.debugger.events.SwfLoadedEvent;
import flash.tools.debugger.events.SwfUnloadedEvent;
import flash.tools.debugger.events.TraceEvent;

public class FlexDebugThread extends FlexDebugElement implements IThread {

	private final Object lock = new Object();
	private IBreakpoint[] breakpoints;
	private final Session session;
	private int state = STATE_STARTING;
	private IStackFrame[] cachedFrames;
	private Map<String, Integer> fileCache = null;

	public FlexDebugThread(FlexDebugTarget debugTarget, Session session) {
		super(debugTarget);
		this.session = session;
	}

	public Session getSession() {
		return session;
	}

	public boolean canStepInto() {
		return isSuspended();
	}

	public boolean canStepOver() {
		return isSuspended();
	}

	public boolean canStepReturn() {
		return isSuspended();
	}

	public boolean isStepping() {
		synchronized (lock) {
			return state == STATE_STEPPING;
		}
	}

	public boolean isStarting() {
		synchronized (lock) {
			return state == STATE_STARTING;
		}
	}

	public void stepInto() throws DebugException {
		step(DebugEvent.STEP_INTO);
	}

	public void stepOver() throws DebugException {
		step(DebugEvent.STEP_OVER);
	}

	public void stepReturn() throws DebugException {
		step(DebugEvent.STEP_RETURN);
	}

	protected void step(int type) throws DebugException {
		new FlexDebugCommand.Step(this, type).schedule();
	}

	public void stepping(int kind) {
		synchronized (lock) {
			state = STATE_STEPPING;
			getDebugTarget().fireResumeEvent(kind);
		}
	}

	public void terminate() throws DebugException {
		new FlexDebugCommand.Terminate(this).schedule();
	}

	public void terminated() {
		synchronized (lock) {
			state = STATE_TERMINATED;
			getDebugTarget().fireTerminateEvent();
			IBreakpointManager manager = DebugPlugin.getDefault()
					.getBreakpointManager();
			manager.removeBreakpointListener(getDebugTarget());
		}
	}

	public void suspend() throws DebugException {
		new FlexDebugCommand.Suspend(this).schedule();
	}

	public void suspended(int kind) {
		synchronized (lock) {
			state = STATE_SUSPENDED;
			updateCachedFrames();
			fireSuspendEvent(kind);
		}
	}

	public void resume() throws DebugException {
		new FlexDebugCommand.Resume(this).schedule();
	}

	public void resumed(int kind) {
		synchronized (lock) {
			state = STATE_RESUMED;
			getDebugTarget().fireResumeEvent(kind);
		}
	}

	public IStackFrame[] getStackFrames() throws DebugException {
		if (!isSuspended())
			return EMPTY_FRAMES;
		if (cachedFrames == null) {
			updateCachedFrames();
		}
		return cachedFrames;
	}

	private void updateCachedFrames() {
		try {
			Frame[] frames = session.getFrames();
			if (frames == null || frames.length == 0)
				cachedFrames = EMPTY_FRAMES;
			IStackFrame[] result = new IStackFrame[frames.length];
			for (int i = 0; i < frames.length; i++) {
				result[i] = new FlexStackFrame(this, frames[i]);
			}
			cachedFrames = result;
		} catch (NotConnectedException e) {
			cachedFrames = null;
			e.printStackTrace();
		}
	}

	public boolean hasStackFrames() throws DebugException {
		return isSuspended();
		// try {
		// Frame[] frames = session.getFrames();
		// return frames != null && frames.length > 0;
		// } catch (NotConnectedException e) {
		// throw debugError(e);
		// }
	}

	public int getPriority() throws DebugException {
		return 0;
	}

	public IStackFrame getTopStackFrame() throws DebugException {
		IStackFrame[] stackFrames = getStackFrames();
		return stackFrames.length < 1 ? null : stackFrames[0];
	}

	public String getName() throws DebugException {
		return "Thread (" + (isSuspended() ? "Suspended" : "Running") + ")";
	}

	public IBreakpoint[] getBreakpoints() {
		return breakpoints != null ? breakpoints : EMPTY_BREAKPOINTS;
	}

	public FlexDebugTarget getDebugTarget() {
		return (FlexDebugTarget) super.getDebugTarget();
	}

	public boolean canResume() {
		return session.isConnected() && isSuspended();
	}

	public boolean canSuspend() {
		return session.isConnected() && !isSuspended();
	}

	public boolean isSuspended() {
		try {
			return session.isSuspended();
		} catch (NotConnectedException e) {
			return false;
		}
	}

	public boolean canTerminate() {
		return true;
	}

	public boolean isTerminated() {
		synchronized (lock) {
			return state == STATE_TERMINATED;
		}
	}

	public boolean isDisconnected() {
		return !session.isConnected();
	}

	public void disconnect() {
		if (session != null)
			session.unbind();
		IBreakpointManager manager = DebugPlugin.getDefault()
				.getBreakpointManager();
		manager.removeBreakpointListener(getDebugTarget());
	}

	public void customMessage(int kind, String msg) {
		DebugEvent event = new DebugEvent(getDebugTarget(),
				DebugEvent.MODEL_SPECIFIC, kind);
		event.setData(msg);
		fireEvent(event);
	}

	public void processEvents() {
		int eventCount = session.getEventCount();
		if (eventCount <= 0)
			return;
		while (session.getEventCount() > 0) {
			flash.tools.debugger.events.DebugEvent event = session.nextEvent();
			if (event instanceof BreakEvent) {
				try {
					if (session.suspendReason() == SuspendReason.ScriptLoaded) {
						if (!isStarting())
							installBreakpoints();
						resume();
					} else {
						suspended(DebugEvent.BREAKPOINT);
					}
				} catch (PlayerDebugException e) {
					e.printStackTrace();
				} catch (DebugException e) {
					e.printStackTrace();
				}
			} else if (event instanceof TraceEvent) {
				customMessage(DETAIL_TRACE, event.information);
			} else if (event instanceof SwfLoadedEvent) {
				fileCache = null;
				SwfLoadedEvent swfLoaded = (SwfLoadedEvent) event;
				customMessage(DETAIL_INFO, "swf loaded " + swfLoaded.path);
			} else if (event instanceof SwfUnloadedEvent) {
				SwfUnloadedEvent swfUnloaded = (SwfUnloadedEvent) event;
				customMessage(DETAIL_INFO, "swf unloaded " + swfUnloaded.path);
			} else {
				customMessage(DETAIL_INFO, event.toString() + " "
						+ event.information);
			}
		}
	}

	private void installBreakpoints() {
		IBreakpointListener target = getDebugTarget();
		IBreakpointManager manager = DebugPlugin.getDefault()
				.getBreakpointManager();
		for (IBreakpoint bp : manager.getBreakpoints(MODEL_ID)) {
			target.breakpointAdded(bp);
		}
		manager.addBreakpointListener(target);
	}

	public Map<String, Integer> getFilesMap() throws InProgressException,
			NoResponseException {
		if (fileCache == null) {
			Map<String, Integer> map = Maps.newHashMap();
			for (SwfInfo swf : session.getSwfs()) {
				for (SourceFile file : swf.getSourceList(session)) {
					map.put(file.getFullPath(), file.getId());
				}
			}
			fileCache = map;
		}
		return fileCache;
	}
}