/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
