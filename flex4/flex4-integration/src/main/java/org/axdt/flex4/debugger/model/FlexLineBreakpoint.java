/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import org.axdt.flex4.debugger.FlexDebugConstants;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;

public class FlexLineBreakpoint extends LineBreakpoint implements
		FlexDebugConstants {

	public FlexLineBreakpoint() {
	}

	public FlexLineBreakpoint(final IResource res, final int line)
			throws CoreException {
		run(getMarkerRule(), new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = res.createMarker(MARKER_ID);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, line);
				marker.setAttribute(IBreakpoint.ID, MODEL_ID);
				marker.setAttribute(IMarker.MESSAGE,
						"Breakpoint " + res.getName() + " [line: " + line + "]");
				setMarker(marker);
			}
		});
	}

	public String getModelIdentifier() {
		return MODEL_ID;
	}
}
