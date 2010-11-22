/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import java.util.List;

import org.axdt.as3.debug.launch.model.SourceElement;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;

import com.google.common.collect.Lists;

import flash.tools.debugger.Frame;
import flash.tools.debugger.PlayerDebugException;
import flash.tools.debugger.Session;
import flash.tools.debugger.SourceFile;
import flash.tools.debugger.Variable;

public class FlexStackFrame extends FlexDebugElement implements IStackFrame,
		SourceElement {

	private final Frame frame;
	private final FlexDebugThread thread;
	private IVariable[] cachedVariables;

	public FlexStackFrame(FlexDebugThread thread, Frame frame) {
		super(thread.getDebugTarget());
		this.thread = thread;
		this.frame = frame;
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
		return thread.isStepping();
	}

	public void stepInto() throws DebugException {
		thread.step(DebugEvent.STEP_INTO);
	}

	public void stepOver() throws DebugException {
		thread.step(DebugEvent.STEP_OVER);
	}

	public void stepReturn() throws DebugException {
		thread.step(DebugEvent.STEP_RETURN);
	}

	public IThread getThread() {
		return thread;
	}

	public IVariable[] getVariables() throws DebugException {
		if (!isSuspended())
			return EMPTY_VARIABLES;
		if (cachedVariables == null) {
			try {
				Session session = thread.getSession();
				Variable[] arguments = frame.getArguments(session);
				Variable[] locals = frame.getLocals(session);
				List<IVariable> result = Lists
						.newArrayListWithExpectedSize(locals.length
								+ arguments.length + 1);
				Variable this1 = frame.getThis(session);
				if (this1 != null)
					result.add(new FlexVariable(thread, this1));
				for (Variable var : arguments) {
					result.add(new FlexVariable(thread, var));
				}
				for (Variable var : locals) {
					result.add(new FlexVariable(thread, var));
				}
				cachedVariables = result.toArray(new IVariable[result.size()]);
			} catch (PlayerDebugException e) {
				throw debugError(e);
			}
		}
		return cachedVariables;
	}

	public boolean hasVariables() throws DebugException {
		return true;
	}

	public int getLineNumber() throws DebugException {
		return frame.getLocation().getLine();
	}

	public int getCharStart() throws DebugException {
		return -1;
	}

	public int getCharEnd() throws DebugException {
		return -1;
	}

	public String getName() throws DebugException {
		return frame.getCallSignature() + " line: "
				+ frame.getLocation().getLine();
	}

	public IRegisterGroup[] getRegisterGroups() throws DebugException {
		return EMPTY_REGISTERGROUPS;
	}

	public boolean hasRegisterGroups() throws DebugException {
		return false;
	}

	public boolean canResume() {
		return thread.canResume();
	}

	public boolean canSuspend() {
		return thread.canSuspend();
	}

	public boolean isSuspended() {
		return thread.isSuspended();
	}

	public void resume() throws DebugException {
		thread.resume();
	}

	public void suspend() throws DebugException {
		thread.suspend();
	}

	public boolean canTerminate() {
		return thread.canTerminate();
	}

	public boolean isTerminated() {
		return thread.isTerminated();
	}

	public void terminate() throws DebugException {
		thread.terminate();
	}

	public String getSourcePath() {
		SourceFile file = frame.getLocation().getFile();
		return file == null ? null : file.getFullPath();
	}
}
