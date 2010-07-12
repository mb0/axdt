package org.axdt.common.preferences.fields;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * @author mb0
 *
 */
public class FileField extends StringField {
	protected String[] extensions;
	protected boolean absolute;

	public FileField(String key, String desc, String defValue, boolean absolute, String[] extensions) {
		super(key, desc, defValue);
		this.absolute = absolute;
		this.extensions = extensions;
	}

	public FieldEditor createFieldEditor(Composite comp) {
		FileFieldEditor editor = new FileFieldEditor(key, desc, absolute, comp);
		editor.setFileExtensions(extensions);
		if ("".equals(defValue)) editor.setEmptyStringAllowed(true);
		return editor;
	}
}