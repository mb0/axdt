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
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.CompoundMultiLineTerminalsEditStrategy;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;

import com.google.inject.Inject;

public class As3AutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {
	@Inject
	protected As3EditorPreferences preferences;

	protected void configure(IEditStrategyAcceptor acceptor) {
		IPreferenceStore store = preferences.getStore();
		CompoundMultiLineTerminalsEditStrategy compound = null;
		configureIndentationEditStrategy(acceptor);
		if (store.getBoolean(As3EditorPreferences.CLOSE_STRINGS))
			configureStringLiteral(acceptor);
		if (store.getBoolean(As3EditorPreferences.CLOSE_BRACKETS)) {
			configureParenthesis(acceptor);
			compound = addMultilineTerminals(compound, "(", ")");
		}
		if (store.getBoolean(As3EditorPreferences.CLOSE_BRACKETS)) {
			configureSquareBrackets(acceptor);
			compound = addMultilineTerminals(compound, "[", "]");
		}
		if (store.getBoolean(As3EditorPreferences.CLOSE_BRACES)) {
			configureCurlyBracesBlock(acceptor);
			compound = addMultilineTerminals(compound, " {", "}");
		}
		if (store.getBoolean(As3EditorPreferences.CLOSE_COMMENTS))
			configureMultilineComments(acceptor);
		if (compound != null)
			acceptor.accept(compound, IDocument.DEFAULT_CONTENT_TYPE);
	}
	
	protected CompoundMultiLineTerminalsEditStrategy addMultilineTerminals(CompoundMultiLineTerminalsEditStrategy current, String left, String right) {
		if (current != null) return current.and(left, right);
		return compoundMultiLineTerminals.newInstanceFor(left, right);
	}
}
