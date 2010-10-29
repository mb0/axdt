/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.preferences;

import org.axdt.as3.config.IFormattingConfig;
import org.axdt.common.preferences.AbstractPreferences;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.preference.IPreferenceStore;

public class As3FormattingPreferences extends AbstractPreferences implements IFormattingConfig {
	
//	private final static Logger logger = Logger.getLogger(As3FormattingPreferences.class);
	
	private static As3FormattingPreferences instance;

	public static As3FormattingPreferences getInstance() {
		if (instance == null)
			new As3FormattingPreferences();
		return instance;
	}

	public As3FormattingPreferences() {
		super("Preferences for As3 formatting support");
		instance = this; 
	}

	public String getQualifier() {
		return ID;
	}

	public void initializeFieldSpecs() {
		add(INDENT_STYLE, "&Indent style", IndentStyle.comboArray());
		add(MAX_LINE_WIDTH, "&Maximum line width", 100);
	}

	public IndentStyle getIndentStyle(IResource res) {
		IPreferenceStore store = getProjectStore(res);
		String blockStyle = store.getString(INDENT_STYLE);
		return IndentStyle.valueOf(blockStyle);
	}
}
