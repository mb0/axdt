/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.preferences;

import org.axdt.as3.formatting.ConfigurableDeclarativeFormatter;
import org.axdt.common.preferences.AbstractPreferencePage;
import org.eclipse.xtext.formatting.IFormatter;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class As3FormattingPreferencePage extends AbstractPreferencePage {
	
	@Inject
	protected Injector injector;

	@Inject
	public As3FormattingPreferencePage(As3FormattingPreferences prefs) {
		super(prefs);
	}
	

	@Override
	protected void performApply() {
		IFormatter formatter = injector.getInstance(IFormatter.class);
		if (formatter instanceof ConfigurableDeclarativeFormatter) {
			ConfigurableDeclarativeFormatter configFormatter = (ConfigurableDeclarativeFormatter) formatter;
			configFormatter.clearConfig();
		}
	}
}
