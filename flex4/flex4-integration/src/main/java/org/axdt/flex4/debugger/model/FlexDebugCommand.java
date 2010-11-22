/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import org.axdt.flex4.debugger.FlexDebugConstants;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;

import flash.tools.debugger.PlayerDebugException;

public abstract class FlexDebugCommand extends Job implements
		FlexDebugConstants {
	protected final FlexDebugThread thread;

	public FlexDebugCommand(FlexDebugThread thread, String name) {
		super(name);
		setSystem(true);
		this.thread = thread;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		doRun();
		return Status.OK_STATUS;
	}

	abstract protected void doRun();

	public static class Step extends FlexDebugCommand {

		private final int kind;

		public Step(FlexDebugThread thread, int kind) {
			super(thread, "Step");
			this.kind = kind;
		}

		protected void doRun() {
			try {
				if (kind == DebugEvent.STEP_INTO)
					thread.getSession().stepInto();
				else if (kind == DebugEvent.STEP_OVER)
					thread.getSession().stepOver();
				else if (kind == DebugEvent.STEP_RETURN)
					thread.getSession().stepOut();
				thread.stepping(kind);
			} catch (PlayerDebugException e) {
				e.printStackTrace();
			}
		}
	}

	public static class Terminate extends FlexDebugCommand {

		public Terminate(FlexDebugThread thread) {
			super(thread, "Terminate");
		}

		protected void doRun() {
			thread.getSession().terminate();
			thread.terminated();
		}
	}

	public static class Suspend extends FlexDebugCommand {

		public Suspend(FlexDebugThread thread) {
			super(thread, "Suspend");
		}

		protected void doRun() {
			try {
				thread.getSession().suspend();
				thread.suspended(DebugEvent.CLIENT_REQUEST);
			} catch (PlayerDebugException e) {
				e.printStackTrace();
			}
		}
	}

	public static class Resume extends FlexDebugCommand {

		public Resume(FlexDebugThread thread) {
			super(thread, "Resume");
		}

		protected void doRun() {
			try {
				thread.getSession().resume();
				thread.resumed(DebugEvent.CLIENT_REQUEST);
			} catch (PlayerDebugException e) {
				e.printStackTrace();
			}
		}
	}
}
