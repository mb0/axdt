package org.axdt.common.preferences.fields;

import org.axdt.common.preferences.FieldSpec;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

/**
 * @author mb0
 *
 */
public class ComboField extends FieldSpec<String> {

	public ComboField(String key, String desc, String[][] choices) {
		super(key, desc, choices);
	}

	public FieldEditor createFieldEditor(Composite comp) {
		return new ComboFieldEditor(key, desc, getChoices(), comp);
	}

	public void setDefault(IEclipsePreferences store) {
		if (getChoices().length > 0)
			store.put(key, getChoices()[0][1]);
	}

	public String[][] getChoices() {
		return (String[][]) defValue;
	}

	public void setDefault(IPreferenceStore store, Object value) {
		store.setDefault(key, (String) value);
	}

	public void setValue(IPreferenceStore store, Object value) {
		store.setDefault(key, (String) value);
	}

	public void setValue(ILaunchConfigurationWorkingCopy config, IPreferenceStore store) {
		config.setAttribute(key, getValue(store));
	}

	public String getDefault(IPreferenceStore store) {
		return store.getDefaultString(key);
	}

	public String getValue(IPreferenceStore store) {
		return store.getString(key);
	}

	@Override
	public String getValue(ILaunchConfiguration config, IPreferenceStore store)
			throws CoreException {
		return config.getAttribute(key, getDefault(store));
	}
}