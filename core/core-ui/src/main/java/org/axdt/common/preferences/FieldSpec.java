/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.preferences;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

public abstract class FieldSpec<K> {
	protected final String key;
	protected Object defValue;
	protected String desc;

	public FieldSpec(String key, String desc, Object defValue) {
		this.key = key;
		this.desc = desc;
		this.defValue = defValue;
	}

	public void setDefault(IEclipsePreferences store){
	}

	public void setDefault(IPreferenceStore store, Object value) {
	}
	public void setValue(IPreferenceStore store, Object value) {
	}
	public void setValue(ILaunchConfigurationWorkingCopy config, IPreferenceStore store) {
	}

	public abstract K getDefault(IPreferenceStore store);
	public abstract K getValue(IPreferenceStore store);
	public abstract K getValue(ILaunchConfiguration config, IPreferenceStore store) throws CoreException;
	
	public abstract FieldEditor createFieldEditor(Composite comp);
}
