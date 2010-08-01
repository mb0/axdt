/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.preferences;

import org.axdt.common.preferences.AbstractPreferences;

public class As3EditorPreferences extends AbstractPreferences {

	public final static String TAB_TO_SPACE = "TAB_TO_SPACE";
	public final static String TAB_WIDTH = "TAB_WIDTH";
	public final static String CLOSE_STRINGS = "CLOSE_STRINGS";
	public final static String CLOSE_BRACKETS = "CLOSE_BRACKETS";
	public final static String CLOSE_BRACES = "CLOSE_BRACES";
	public final static String CLOSE_COMMENTS = "CLOSE_COMMENTS";
	public final static String USE_FOLDING = "USE_FOLDING";
	public final static String FOLD_COMMENTS = "FOLD_COMMENTS";
	public final static String FOLD_HEADERS = "FOLD_HEADERS";
	public final static String FOLD_IMPORTS = "FOLD_IMPORTS";
	public final static String FOLD_MEMBERS = "FOLD_MEMBERS";
	
	private static As3EditorPreferences instance;

	public static As3EditorPreferences getInstance() {
		if (instance == null)
			new As3EditorPreferences();
		return (As3EditorPreferences) instance;
	}

	public As3EditorPreferences() {
		super("Preferences for As3 editor");
		instance = this; 
	}
	
	public String getQualifier() {
		return "org.axdt.as3.editor";
	}

	public void initializeFieldSpecs() {
		addGroup("Tabs", false);
		add(TAB_WIDTH, "&Tab width", 4);
		add(TAB_TO_SPACE, "Con&vert tabs to spaces", false);
		addGroup("Folding", true);
		add(USE_FOLDING, "Enable &folding", true);
		addHelp("Initially fold:");
		add(FOLD_COMMENTS, "&Comments", false);
		add(FOLD_HEADERS, "&Header comments", true);
		add(FOLD_MEMBERS, "&Members", false);
		add(FOLD_IMPORTS, "&Imports", true);
		addGroup("Automatically close", true);
		add(CLOSE_STRINGS, "\"&Strings\"", true);
		add(CLOSE_BRACKETS, "(Parentheses) and [Brac&kets]", true);
		add(CLOSE_BRACES, "{&Braces} on newline", true);
		add(CLOSE_COMMENTS, "/*C&omments*/ on newline", true);
		endGroup();
	}

}
