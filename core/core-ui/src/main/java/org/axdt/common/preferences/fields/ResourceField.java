package org.axdt.common.preferences.fields;

import org.eclipse.swt.widgets.Composite;

/**
 * @author mb0
 *
 */
public class ResourceField extends StringField {
	protected String[] extensions;

	public ResourceField(String key, String desc, String defValue, String[] extensions) {
		super(key, desc, defValue);
		this.extensions = extensions;
	}

	public ResourceFieldEditor createFieldEditor(Composite comp) {
		ResourceFieldEditor editor = new ResourceFieldEditor(key, desc, comp);
		editor.setFileExtensions(extensions);
		if ("".equals(defValue)) editor.setEmptyStringAllowed(true);
		return editor;
	}
}