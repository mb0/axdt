package org.axdt.common.preferences.fields;

import org.axdt.common.preferences.FieldSpec;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

/**
 * @author mb0
 *
 */
public class BooleanField extends FieldSpec<Boolean> {
	public BooleanField(String key, String desc, Boolean defValue) {
		super(key, desc, defValue);
	}

	public FieldEditor createFieldEditor(Composite comp) {
		return new BooleanFieldEditor(key, desc, comp);
	}

	public void setDefault(IEclipsePreferences store) {
		store.putBoolean(key, (Boolean) defValue);
	}

	public void setDefault(IPreferenceStore store, Object value) {
		store.setDefault(key, (Boolean) value);
	}

	public void setValue(IPreferenceStore store, Object value) {
		store.setValue(key, (Boolean) value);
	}

	public void setValue(ILaunchConfigurationWorkingCopy config, IPreferenceStore store) {
		config.setAttribute(key, getValue(store));
	}

	public Boolean getDefault(IPreferenceStore store) {
		return store.getDefaultBoolean(key);
	}

	public Boolean getValue(IPreferenceStore store) {
		return store.getBoolean(key);
	}

	public Boolean getValue(ILaunchConfiguration config, IPreferenceStore store) throws CoreException {
		return config.getAttribute(key, getDefault(store));
	}
}