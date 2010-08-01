/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.compiler.console;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.console.IPatternMatchListener;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;

public class PatternMatchAdapter implements IPatternMatchListener {

	protected TextConsole console;

	public void connect(TextConsole console) {
		this.console = console;
	}

	public void disconnect() {
		console = null;
	}

	public void matchFound(PatternMatchEvent event) {
	}

	public String getPattern() {
		return null;
	}

	public int getCompilerFlags() {
		return 0;
	}

	public String getLineQualifier() {
		return null;
	}

	public IDocument getDocument() {
		return console.getDocument();
	}

	public String getMatchedText(PatternMatchEvent event)
			throws BadLocationException {
		return getDocument().get(event.getOffset(), event.getLength());
	}
}
