/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger;

import java.util.Iterator;

import org.axdt.flex4.debugger.model.FlexVariable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class InvokeVariableGetter implements IViewActionDelegate {

	private IStructuredSelection selection;

	public InvokeVariableGetter() {
	}

	public void run(IAction action) {
		if (selection == null)
			return;
		@SuppressWarnings("rawtypes")
		Iterator iter = selection.iterator();
		while (iter.hasNext()) {
			Object ele = iter.next();
			if (ele instanceof FlexVariable) {
				FlexVariable var = (FlexVariable) ele;
				var.invokeGetter();
			}
		}
	}

	public void selectionChanged(IAction action, ISelection sel) {
		boolean enabled = false;
		selection = null;
		if (!sel.isEmpty() && sel instanceof IStructuredSelection) {
			selection = (IStructuredSelection) sel;
			@SuppressWarnings("rawtypes")
			Iterator iter = selection.iterator();
			while (iter.hasNext()) {
				Object ele = iter.next();
				if (ele instanceof FlexVariable) {
					FlexVariable var = (FlexVariable) ele;
					if (var.canToInvokeGetter()) {
						enabled = true;
						break;
					}
				}

			}
		}
		action.setEnabled(enabled);
	}

	public void init(IViewPart view) {
	}

}
