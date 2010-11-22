/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger;

import org.axdt.core.ui.IAxdtEditor;
import org.axdt.flex4.debugger.model.FlexLineBreakpoint;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class FlexLineBreakpointAdapterFactory implements IAdapterFactory {

	public class FlexLineBreakpointAdapter implements IToggleBreakpointsTarget,
			FlexDebugConstants {

		private IBreakpointManager bpm;

		public FlexLineBreakpointAdapter() {
			bpm = DebugPlugin.getDefault().getBreakpointManager();
		}

		public void toggleLineBreakpoints(IWorkbenchPart part,
				ISelection selection) throws CoreException {
			IAxdtEditor editor = getEditor(part);
			if (editor != null) {
				IResource resource = (IResource) editor.getEditorInput()
						.getAdapter(IResource.class);
				IBreakpoint[] breakpoints = bpm.getBreakpoints(MODEL_ID);
				int lineNumber = ((ITextSelection) selection).getStartLine() + 1;
				for (IBreakpoint bp : breakpoints) {
					if (resource.equals(bp.getMarker().getResource())) {
						if (((ILineBreakpoint) bp).getLineNumber() == lineNumber) {
							bp.delete();
							return;
						}
					}
				}
				bpm.addBreakpoint(new FlexLineBreakpoint(resource, lineNumber));
			}
		}

		public boolean canToggleLineBreakpoints(IWorkbenchPart part,
				ISelection selection) {
			return true;
		}

		private IAxdtEditor getEditor(IWorkbenchPart part) {
			if (part instanceof IAxdtEditor) {
				IAxdtEditor editorPart = (IAxdtEditor) part;
				IResource resource = (IResource) editorPart.getEditorInput()
						.getAdapter(IResource.class);
				if (resource != null) {
					String extension = resource.getFileExtension();
					if (extension != null && extension.equals("as")) {
						return editorPart;
					}
				}
			}
			return null;
		}

		public void toggleMethodBreakpoints(IWorkbenchPart part,
				ISelection selection) throws CoreException {
		}

		public boolean canToggleMethodBreakpoints(IWorkbenchPart part,
				ISelection selection) {
			return false;
		}

		public void toggleWatchpoints(IWorkbenchPart part, ISelection selection)
				throws CoreException {
		}

		public boolean canToggleWatchpoints(IWorkbenchPart part,
				ISelection selection) {
			return false;
		}

	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adaptableObject instanceof IAxdtEditor) {
			IAxdtEditor editorPart = (IAxdtEditor) adaptableObject;
			IResource resource = (IResource) editorPart.getEditorInput()
					.getAdapter(IResource.class);
			if (resource != null) {
				String extension = resource.getFileExtension();
				if (extension != null && extension.equals("as")) {
					return new FlexLineBreakpointAdapter();
				}
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { IToggleBreakpointsTarget.class };
	}

}
