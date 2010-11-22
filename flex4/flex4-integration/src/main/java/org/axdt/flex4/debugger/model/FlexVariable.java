/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import org.axdt.core.ui.img.AxdtImages;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

import flash.tools.debugger.PlayerDebugException;
import flash.tools.debugger.Value;
import flash.tools.debugger.Variable;
import flash.tools.debugger.VariableAttribute;

public class FlexVariable extends FlexDebugElement implements IVariable {

	protected final FlexDebugThread thread;
	protected final Variable variable;
	protected FlexValue cachedValue;

	public FlexVariable(FlexDebugThread thread, Variable variable) {
		super(thread.getDebugTarget());
		this.thread = thread;
		this.variable = variable;
	}

	public void setValue(String expression) throws DebugException {
	}

	public void setValue(IValue value) throws DebugException {
	}

	public boolean supportsValueModification() {
		return false;
	}

	public boolean verifyValue(String expression) throws DebugException {
		return false;
	}

	public boolean verifyValue(IValue value) throws DebugException {
		return false;
	}

	public IValue getValue() throws DebugException {
		if (cachedValue == null) {
			Value value = null;
			value = variable.getValue();
			cachedValue = new FlexValue(thread, value);
		}
		return cachedValue;
	}

	public String getName() throws DebugException {
		return variable.getName();
	}

	public String getImageName() {
		if ("this".equals(variable.getName()))
			return null;
		if (variable.isAttributeSet(VariableAttribute.IS_LOCAL))
			return AxdtImages.VARIABLE;
		if (variable.isAttributeSet(VariableAttribute.IS_ARGUMENT))
			return AxdtImages.PARAMETER;
		switch (variable.getScope()) {
		case VariableAttribute.PRIVATE_SCOPE:
			return AxdtImages.FIELD_PRIVATE;
		case VariableAttribute.PROTECTED_SCOPE:
			return AxdtImages.FIELD_PROTECTED;
		case VariableAttribute.INTERNAL_SCOPE:
			return AxdtImages.FIELD_DEFAULT;
		default:
			return AxdtImages.FIELD_PUBLIC;
		}
	}

	public boolean canToInvokeGetter() {
		return variable.needsToInvokeGetter();
	}

	public void invokeGetter() {
		if (!variable.needsToInvokeGetter())
			return;
		try {
			variable.invokeGetter(thread.getSession());
			Value value = variable.getValue();
			cachedValue = new FlexValue(thread, value);
			fireChangeEvent(DebugEvent.CHANGE);
		} catch (PlayerDebugException e) {
			e.printStackTrace();
		}
	}

	public String getReferenceTypeName() throws DebugException {
		return getValue().getReferenceTypeName();
	}

	public boolean hasValueChanged() throws DebugException {
		return variable.hasValueChanged(thread.getSession());
	}
}
