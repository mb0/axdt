/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
