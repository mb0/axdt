/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger;

import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IVariable;

public interface FlexDebugConstants {

	IBreakpoint[] EMPTY_BREAKPOINTS = new IBreakpoint[0];
	IStackFrame[] EMPTY_FRAMES = new IStackFrame[0];
	IRegisterGroup[] EMPTY_REGISTERGROUPS = new IRegisterGroup[0];
	IVariable[] EMPTY_VARIABLES = new IVariable[0];

	String PLUGIN_ID = "org.axdt.flex4.integration";
	String MODEL_ID = "org.axdt.flex4.debugger.model";
	String MARKER_ID = "org.axdt.flex4.debugger.lineBreakpointMarker";

	int DETAIL_INFO = 0;
	int DETAIL_TRACE = 1;

	int STATE_STARTING = 0;
	int STATE_SUSPENDED = 1;
	int STATE_RESUMED = 2;
	int STATE_STEPPING = 3;
	int STATE_DISCONNECTING = 4;
	int STATE_DISCONNECTED = 5;
	int STATE_TERMINATED = 6;
}
