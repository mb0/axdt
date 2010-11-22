/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger;

import org.axdt.core.ui.img.AxdtImageHelper;
import org.axdt.flex4.debugger.model.FlexLineBreakpoint;
import org.axdt.flex4.debugger.model.FlexVariable;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

public class FlexDebugPresentation extends LabelProvider implements
		IDebugModelPresentation {

	public IEditorInput getEditorInput(Object element) {
		if (element instanceof IFile) {
			return new FileEditorInput((IFile) element);
		} else if (element instanceof ILineBreakpoint) {
			FlexLineBreakpoint bp = (FlexLineBreakpoint) element;
			IResource resource = bp.getMarker().getResource();
			if (resource instanceof IFile)
				return new FileEditorInput((IFile) resource);
		}
		return null;
	}

	public String getEditorId(IEditorInput input, Object element) {
		return "org.axdt.as3.As3";
	}

	@Override
	public String getText(Object element) {
		return null;
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof FlexVariable) {
			FlexVariable var = (FlexVariable) element;
			String imageName = var.getImageName();
			if (imageName != null)
				return AxdtImageHelper.getInstance().getImage(imageName);
		}
		return null;
	}

	public void setAttribute(String attribute, Object value) {
	}

	public void computeDetail(IValue value, IValueDetailListener listener) {
		try {
			String valueString = value.getValueString();
			listener.detailComputed(value, valueString);
		} catch (DebugException e) {
			e.printStackTrace();
		}
	}
}
