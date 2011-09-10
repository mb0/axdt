/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger;

import java.net.URL;

import org.axdt.core.swf.IAxdtSwfPlayerInstance;
import org.axdt.core.ui.swf.SwfEditorLauncher;
import org.axdt.debugger.IAxdtDebugger;
import org.axdt.flex4.debugger.model.FlexDebugTarget;
import org.axdt.launch.AxdtCompilerTarget;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;

import flash.tools.debugger.IProgress;
import flash.tools.debugger.Session;
import flash.tools.debugger.SessionManager;
import flash.tools.debugger.threadsafe.ThreadSafeBootstrap;

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
		SessionManager sessionManager = null;
		try {
			AxdtCompilerTarget target = context.getCompilerTarget();
			Flex4DebugConsole.create(target.getDeployFileName());
			monitor.setTaskName("Listening for connections");
			sessionManager = ThreadSafeBootstrap.sessionManager();
			sessionManager.setPreference(SessionManager.PREF_INVOKE_GETTERS, 0);
			sessionManager.setPreference(SessionManager.PREF_GETVAR_RESPONSE_TIMEOUT, 500000);

			sessionManager.startListening();
			monitor.setTaskName("Launching player");
			IAxdtSwfPlayerInstance player = openPlayer(playerId, context.getTargetUrl());
			Session session = sessionManager.accept(new ProgressAdapter(
					"Connecting...", monitor));
			Job eventRouter = new FlexDebugTarget(session).init(context);
			context.enqueueJob(eventRouter);
			context.enqueueJob(new ClosePlayer(player));
		} finally {
			try {
				if (sessionManager != null)
					sessionManager.stopListening();
			} catch (Exception e) {
			}
		}
		return true;
	}

	public IAxdtSwfPlayerInstance openPlayer(String playerId, URL url) {
		SwfEditorLauncher.Runner runner = new SwfEditorLauncher.Runner(
				playerId, url);
		Display.getDefault().syncExec(runner);
		return runner.getPlayerInstance();
	}
	
	public static class ClosePlayer extends Job {

		private final IAxdtSwfPlayerInstance player;

		public ClosePlayer(IAxdtSwfPlayerInstance player) {
			super("Close player");
			setSystem(true);
			this.player = player;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				player.terminate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return Status.OK_STATUS;
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
}
