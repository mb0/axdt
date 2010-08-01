/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.compiler.console;

import org.apache.log4j.Logger;
import org.eclipse.ui.console.PatternMatchEvent;

public class ErrorCodeMatcher extends PatternMatchAdapter {

	@Override
	public String getPattern() {
		return "#[0-9]+";
	}
	
	@Override
	public void matchFound(PatternMatchEvent event) {
		try {
			String text = getMatchedText(event);
			int code = Integer.parseInt(text.substring(1));
			ErrorCodeHyperlink link = new ErrorCodeHyperlink(code, getResolver());
			console.addHyperlink(link, event.getOffset(), event.getLength());
		} catch (Exception e) {
			Logger.getLogger(getClass()).error("error matching error code in console output", e);
		}
	}

	protected IErrorCodeUriResolver getResolver() {
		return IErrorCodeUriResolver.Provider.getInstance().getResolver();
	}
}
