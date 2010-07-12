package org.axdt.asdoc.ui.preferences;

import org.axdt.common.preferences.fields.StringField;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.widgets.Composite;

public class DocTableField extends StringField {

	public DocTableField(String key, String desc, String defValue) {
		super(key, desc, defValue);
	}

	@Override
	public FieldEditor createFieldEditor(Composite comp) {
		return new DocTableFieldEditor(key, desc, comp);
	}
}
