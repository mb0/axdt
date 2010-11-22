/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger.model;

import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

import com.google.common.collect.Lists;

import flash.tools.debugger.PlayerDebugException;
import flash.tools.debugger.Value;
import flash.tools.debugger.ValueAttribute;
import flash.tools.debugger.Variable;
import flash.tools.debugger.VariableAttribute;
import flash.tools.debugger.VariableType;

public class FlexValue extends FlexDebugElement implements IValue {

	private final FlexDebugThread thread;
	protected final Value value;
	protected IVariable[] cachedMembers;

	public FlexValue(FlexDebugThread thread, Value value) {
		super(thread.getDebugTarget());
		this.thread = thread;
		this.value = value;
	}

	public String getReferenceTypeName() throws DebugException {
		if (value == null)
			return "error";
		return value.getTypeName();
	}

	public String getValueString() throws DebugException {
		if (value == null)
			return "error";
		Number num;
		switch (value.getType()) {
		case VariableType.BOOLEAN:
			Boolean bool = (Boolean) value.getValueAsObject();
			return bool ? "true" : "false";
		case VariableType.NUMBER:
			num = (Number) value.getValueAsObject();
			double dub = num.doubleValue();
			long lon = (long) dub;
			if (dub == lon)
				return lon + "";
			return dub + "";
		case VariableType.STRING:
			String string = value.getValueAsString();
			if (value.isAttributeSet(ValueAttribute.IS_EXCEPTION))
				return "<" + string + ">";
			return "\"" + string + "\"";
		case VariableType.OBJECT:
		case VariableType.MOVIECLIP:
			num = (Number) value.getValueAsObject();
			String typeName = value.getTypeName();
			if (typeName == null)
				typeName = value.getClassName();
			else {
				int indexOf = typeName.indexOf('@');
				if (indexOf >= 0)
					typeName = typeName.substring(0, indexOf);
			}
			return typeName + " (id=" + num.longValue() + ")";
		case VariableType.FUNCTION:
			String res;
			if (value.isAttributeSet(VariableAttribute.HAS_GETTER))
				res = "getter";
			else if (value.isAttributeSet(VariableAttribute.HAS_SETTER))
				res = "setter";
			else
				res = "function";
			return res + " (id=" + value.getValueAsObject() + ")";
		case VariableType.NULL:
			return "null";
		case VariableType.UNDEFINED:
			return "undefined";
		default:
			return "unknown";
		}
	}

	public boolean isAllocated() throws DebugException {
		return value != null && value.getValueAsObject() != Value.UNDEFINED;
	}

	public IVariable[] getVariables() throws DebugException {
		try {
			if (value == null)
				return EMPTY_VARIABLES;
			if (cachedMembers == null) {
				switch (value.getType()) {
				case VariableType.MOVIECLIP:
				case VariableType.OBJECT:
				case VariableType.FUNCTION:
					Variable[] members = value.getMembers(thread.getSession());
					if (members == null)
						return EMPTY_VARIABLES;
					List<IVariable> result = Lists
							.newArrayListWithExpectedSize(members.length);
					for (int i = 0; i < members.length; i++) {
						if (members[i]
								.isAttributeSet(VariableAttribute.IS_STATIC))
							continue;
						result.add(new FlexVariable(thread, members[i]));
					}
					cachedMembers = result
							.toArray(new IVariable[result.size()]);
					break;
				default:
					cachedMembers = EMPTY_VARIABLES;
				}
			}
			return cachedMembers;
		} catch (PlayerDebugException e) {
			throw debugError(e);
		}
	}

	public boolean hasVariables() throws DebugException {
		IVariable[] variables = getVariables();
		return variables.length > 0;
	}

	@Override
	public String getName() throws DebugException {
		return getValueString();
	}
}
