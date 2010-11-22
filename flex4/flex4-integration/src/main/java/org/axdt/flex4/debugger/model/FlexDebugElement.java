/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import org.axdt.flex4.debugger.FlexDebugConstants;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;

public abstract class FlexDebugElement extends DebugElement implements
		FlexDebugConstants {

	public FlexDebugElement(IDebugTarget target) {
		super(target);
	}

	public String getModelIdentifier() {
		return MODEL_ID;
	}

	protected DebugException debugError(Exception e) {
		return new DebugException(new Status(IStatus.ERROR, PLUGIN_ID,
				e.getMessage(), e));
	}

	abstract public String getName() throws DebugException;
}
