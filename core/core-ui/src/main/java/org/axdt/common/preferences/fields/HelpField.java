package org.axdt.common.preferences.fields;

import org.axdt.common.preferences.FieldSpec;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @author mb0
 *
 */
public class HelpField extends FieldSpec<Boolean> {

	public HelpField(String desc) {
		super(null, desc, null);
	}

	public FieldEditor createFieldEditor(Composite comp) {
		comp.setLayout(new GridLayout(1,false));
		Label label = new Label(comp, SWT.NONE);
		label.setFont(comp.getFont());
		label.setText(desc);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL|GridData.GRAB_HORIZONTAL);
		label.setLayoutData(layoutData);
		return null;
	}

	public Boolean getDefault(IPreferenceStore pref) {
		return false;
	}

	public Boolean getValue(IPreferenceStore pref) {
		return false;
	}

	@Override
	public Boolean getValue(ILaunchConfiguration config, IPreferenceStore store)
			throws CoreException {
		return false;
	}
}