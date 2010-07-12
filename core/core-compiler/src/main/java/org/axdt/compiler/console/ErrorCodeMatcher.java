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
			ErrorCodeHyperlink link = new ErrorCodeHyperlink(code, null);
			console.addHyperlink(link, event.getOffset(), event.getLength());
		} catch (Exception e) {
			Logger.getLogger(getClass()).error("error matching error code in console output", e);
		}
	}
}
