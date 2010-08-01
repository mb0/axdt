/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.ui.preferences;

import org.axdt.common.preferences.AbstractPreferencePage;
import org.axdt.common.preferences.AbstractPreferences;
import org.axdt.common.preferences.IAxdtPreferences;
import org.axdt.common.preferences.PrefGroup;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.preference.IPreferenceStore;

public class CorePropertyPage extends AbstractPreferencePage {
	
	public CorePropertyPage() {
		super(CorePreferences.getInstance());
	}
	@Override
	protected IPreferenceStore retrievePreferenceStore(AbstractPreferences prefs) {
		return prefs.getProjectStore((IProject)getElement());
	}
	@Override
	protected boolean isExcluded(PrefGroup group) {
		return 0 != (group.getFlags() & IAxdtPreferences.EXCLUDE_IN_PROPERTIES);
	}
}
