/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.preferences.fields;

import org.axdt.common.preferences.FieldSpec;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.widgets.Composite;

public class IntegerField extends FieldSpec<Integer> {
	public IntegerField(String key, String desc, Integer defValue) {
		super(key, desc, defValue);
	}

	public FieldEditor createFieldEditor(Composite comp) {
		return new IntegerFieldEditor(key, desc, comp);
	}

	public void setDefault(IEclipsePreferences store) {
		store.putInt(key, (Integer) defValue);
	}

	public void setDefault(IPreferenceStore store, Object value) {
		store.setDefault(key, (Integer) value);
	}

	public void setValue(IPreferenceStore store, Object value) {
		store.setValue(key, (Integer) value);
	}

	public void setValue(ILaunchConfigurationWorkingCopy config, IPreferenceStore store) {
		config.setAttribute(key, getValue(store));
	}

	public Integer getDefault(IPreferenceStore store) {
		return store.getDefaultInt(key);
	}

	public Integer getValue(IPreferenceStore store) {
		return store.getInt(key);
	}

	@Override
	public Integer getValue(ILaunchConfiguration config, IPreferenceStore store)
			throws CoreException {
		return config.getAttribute(key, getDefault(store));
	}
}
