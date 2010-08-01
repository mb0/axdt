/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.preferences;

import org.axdt.common.preferences.AbstractPreferences;

public class As3FormattingPreferences extends AbstractPreferences {
	
//	private final static Logger logger = Logger.getLogger(As3FormattingPreferences.class);

	private static As3FormattingPreferences instance;

	public static As3FormattingPreferences getInstance() {
		if (instance == null)
			instance = new As3FormattingPreferences();
		return instance;
	}

	public As3FormattingPreferences() {
		super("Preferences for AS3 formatting support");
	}

	public String getQualifier() {
		return "org.axdt.as3.formatting";
	}

	public void initializeFieldSpecs() {
	}
}
