/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger;

import java.io.IOException;
import java.net.URL;

import org.axdt.core.swf.IAxdtSwfPlayerInstance;
import org.axdt.core.ui.swf.SwfEditorLauncher;
import org.axdt.debugger.IAxdtDebugger;
import org.axdt.launch.AbstractLaunchJob;
import org.axdt.launch.AxdtCompilerTarget;
import org.axdt.launch.AxdtLaunchContext;
import org.axdt.launch.JobMutexRule;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Display;

import flash.tools.debugger.Bootstrap;
import flash.tools.debugger.IProgress;
import flash.tools.debugger.NoResponseException;
import flash.tools.debugger.NotConnectedException;
import flash.tools.debugger.NotSuspendedException;
import flash.tools.debugger.Session;
import flash.tools.debugger.SessionManager;
import flash.tools.debugger.SuspendedException;
import flash.tools.debugger.VersionException;
import flash.tools.debugger.events.BreakEvent;
import flash.tools.debugger.events.DebugEvent;
import flash.tools.debugger.events.SwfLoadedEvent;
import flash.tools.debugger.events.SwfUnloadedEvent;
import flash.tools.debugger.events.TraceEvent;

/**
 * @author nkuebler
 * @author mb0
 */
public class Flex4Debugger implements IAxdtDebugger {

	public boolean debug(AxdtLaunchContext context, IProgressMonitor monitor)
			throws Exception {
		String playerId = context.getPlayerId();
		// XXX we cannot debug without player
		if (playerId == null)
			throw new IllegalStateException("no player configured");
		DebugContext ctx = new DebugContext();
		AxdtCompilerTarget target = context.getCompilerTarget();
		ctx.console = Flex4DebugConsole.create(target.getDeployFileName());
		monitor.setTaskName("Listening for connections");
		ctx.startListening();
		monitor.setTaskName("Launching player");
		ctx.openPlayer(playerId, context.getTargetUrl());
		monitor.setTaskName("Connecting to player");
		DebugSession job = new DebugSession(context, ctx);
		job.schedule();
		return true;
	}

	public static class DebugContext {
		protected IAxdtSwfPlayerInstance player = null;
		protected SessionManager sessionManager = null;
		protected Session session = null;
		protected Flex4DebugConsole console = null;
		protected boolean firstBreak = true;

		public void startListening() throws IOException {
			sessionManager = Bootstrap.sessionManager();
			sessionManager.setPreference(SessionManager.PREF_ACCEPT_TIMEOUT,
					10000);
			sessionManager.startListening();
		}

		public void startSession(IProgressMonitor monitor) throws IOException,
				VersionException {
			session = sessionManager.accept(new ProgressAdapter(
					"(Terminate to end the debug session)", monitor));
			session.bind();
		}

		public void openPlayer(String playerId, URL url) {
			SwfEditorLauncher.Runner runner = new SwfEditorLauncher.Runner(
					playerId, url);
			Display.getDefault().syncExec(runner);
			player = runner.getPlayerInstance();
		}

		public void dispose() throws IOException {
			if (session != null)
				session.terminate();
			if (sessionManager != null)
				try {
					sessionManager.stopListening();
				} catch (Exception e) {}
			if (player != null)
				player.terminate();
		}
	}

	public static class ProgressAdapter implements IProgress {

		protected final IProgressMonitor monitor;

		public ProgressAdapter(String name, IProgressMonitor monitor) {
			this.monitor = monitor;
			monitor.beginTask(name, IProgressMonitor.UNKNOWN);
		}

		public void setProgress(int value, int total) {
			monitor.worked(1);
		}
	}

	public static class DebugSession extends AbstractLaunchJob {

		protected final DebugContext ctx;

		public DebugSession(AxdtLaunchContext context, DebugContext dbgContext) {
			super("Debugger session", context);
			this.ctx = dbgContext;
			setRule(JobMutexRule.getMutex());
		}

		@Override
		protected IStatus doRun(IProgressMonitor monitor) throws Exception {
			try {
				ctx.startSession(monitor);
				// session starts paused by default
				do {
					Thread.sleep(1000);
					processEvents(ctx);
				} while (!monitor.isCanceled() && ctx.session.isConnected());
				ctx.console.info("closing session");
				return null;
			} finally {
				ctx.dispose();
			}
		}

		protected void processEvents(DebugContext ctx)
				throws SuspendedException, NotConnectedException,
				NoResponseException, NotSuspendedException {
			while (ctx.session.getEventCount() > 0) {
				DebugEvent event = ctx.session.nextEvent();
				if (event instanceof SwfLoadedEvent) {
					SwfLoadedEvent swfLoaded = (SwfLoadedEvent) event;
					ctx.console.info("swf loaded " + swfLoaded.url);
				} else if (event instanceof SwfUnloadedEvent) {
					SwfUnloadedEvent swfUnloaded = (SwfUnloadedEvent) event;
					ctx.console.info("swf unloaded " + swfUnloaded.path);
				} else if (event instanceof TraceEvent) {
					ctx.console.trace(event.information);
				} else if (event instanceof BreakEvent) {
					if (ctx.firstBreak) {
						ctx.firstBreak = false;
						// TODO apply breakpoints
						ctx.session.resume();
					}
				} else {
					ctx.console
							.info(event.toString() + " " + event.information);
				}
			}
		}
	}
}
