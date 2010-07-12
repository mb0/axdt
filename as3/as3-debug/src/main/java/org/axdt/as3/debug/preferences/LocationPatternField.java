package org.axdt.as3.debug.preferences;

import org.axdt.common.preferences.fields.StringField;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.widgets.Composite;

public class LocationPatternField extends StringField {

	public LocationPatternField(String key, String desc, String defValue) {
		super(key, desc, defValue);
	}
	@Override
	public FieldEditor createFieldEditor(Composite comp) {
		return new LocationPatternFieldEditor(key, desc, comp);
	}
}
