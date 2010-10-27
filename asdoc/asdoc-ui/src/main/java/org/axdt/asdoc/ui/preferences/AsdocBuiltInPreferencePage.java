/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.ui.preferences;

import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.asdoc.access.AsdocRootProvider;
import org.axdt.asdoc.ui.preferences.DocTableFieldEditor.DocItem;
import org.axdt.common.preferences.AbstractPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;

public class AsdocBuiltInPreferencePage extends AbstractPreferencePage {

	protected final AsdocPreferences asdocPreferences;
	
	public AsdocBuiltInPreferencePage() {
		this(AsdocPreferences.getInstance());
	}
	protected AsdocBuiltInPreferencePage(AsdocPreferences asdocPreferences) {
		super(asdocPreferences, AsdocPreferences.PAGE_BUILT_INS);
		this.asdocPreferences = asdocPreferences;
	}

	@Override
	protected void performApply() {
		super.performApply();
		// if reinitialize with configuration from the workspace scope 
		IPreferenceStore store = asdocPreferences.getStore();
		List<DocItem> docItems = asdocPreferences.getBuiltinDocItems(store);
		AsdocRootProvider instance = AsdocRootProvider.getInstance();
		if (instance != null)
			instance.initializeAsdocs(docItems.toArray());
		else Logger.getLogger(getClass()).error("doc root provider was not yet initialized");
	}
}
