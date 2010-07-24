package org.axdt.flex4.debugger;

import org.axdt.debugger.DebuggerConsoleFileMatcher;
import org.axdt.launch.AbstractConsole;
import org.eclipse.swt.SWT;

/**
 * @author nkuebler
 * @author mb0
 */
public class Flex4DebugConsole extends AbstractConsole {
	
	public static Flex4DebugConsole create(String name) {
		return AbstractConsole.setConsole(new Flex4DebugConsole(name));
	}

	public Flex4DebugConsole(String name) {
		super(name+ " Trace console", null);
	}
	
	@Override
	protected void configure() {
		super.configure();
		addPatternMatchListener(new DebuggerConsoleFileMatcher());
	}

	public void trace(String string) {
		appendAsync(string, -1);
	}
	public void error(String string) {
		appendAsync(string, SWT.COLOR_DARK_RED);
	}

	public void info(String string) {
		appendAsync(string, SWT.COLOR_DARK_BLUE);
	}
}
