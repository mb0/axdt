/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.autoedit;

import org.axdt.as3.ui.preferences.As3EditorPreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.DefaultLineTracker;
import org.eclipse.jface.text.TabsToSpacesConverter;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategy;

import com.google.inject.Inject;

public class As3AutoEditStrategy extends DefaultAutoEditStrategy {
	@Inject
	protected As3EditorPreferences preferences;

	protected void configure(IEditStrategyAcceptor acceptor) {
		IPreferenceStore store = preferences.getStore();
		if (store.getBoolean(As3EditorPreferences.CLOSE_STRINGS))
			configureStringLiteral(acceptor);
		if (store.getBoolean(As3EditorPreferences.CLOSE_BRACKETS))
			configureParenthesis(acceptor);
		if (store.getBoolean(As3EditorPreferences.CLOSE_BRACKETS))
			configureSquareBrackets(acceptor);
		if (store.getBoolean(As3EditorPreferences.CLOSE_BRACES))
			configureCurlyBracesBlock(acceptor);
		if (store.getBoolean(As3EditorPreferences.CLOSE_COMMENTS))
			configureMultilineComments(acceptor);
		if (store.getBoolean(As3EditorPreferences.TAB_TO_SPACE))
			configureTabsToSpace(acceptor, 
					store.getInt(As3EditorPreferences.TAB_WIDTH));
	}
	
	protected void configureTabsToSpace(IEditStrategyAcceptor acceptor, int tabWidth) {
		TabsToSpacesConverter converter = new TabsToSpacesConverter();
		converter.setNumberOfSpacesPerTab(tabWidth);
		converter.setLineTracker(new DefaultLineTracker());
		acceptor.accept(converter);
	}
}
