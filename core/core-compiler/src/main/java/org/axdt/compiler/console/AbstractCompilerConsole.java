package org.axdt.compiler.console;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public abstract class AbstractCompilerConsole extends MessageConsole {

	public static AbstractCompilerConsole setConsole(
			AbstractCompilerConsole newConsole) {
		IConsoleManager consoleManager = ConsolePlugin.getDefault()
				.getConsoleManager();
		IConsole[] consoles = consoleManager.getConsoles();
		for (IConsole c : consoles) {
			if (c instanceof AbstractCompilerConsole) {
				AbstractCompilerConsole console = (AbstractCompilerConsole) c;
				consoleManager.removeConsoles(new IConsole[] { console });
			}
		}
		consoleManager.addConsoles(new IConsole[] { newConsole });
		consoleManager.showConsoleView(newConsole);
		return newConsole;
	}

	public AbstractCompilerConsole(String name, ImageDescriptor imageDescriptor) {
		super(String.format("%s (%s)", name, new SimpleDateFormat("HH:mm:ss")
				.format(new Date())), imageDescriptor);
		configure();
	}

	protected void configure() {
		addPatternMatchListener(new FileMatcher());
		addPatternMatchListener(new ErrorCodeMatcher());
	}
	public void logMessage(String msg, String path, int line, int column, String level, int errorCode, String source) {
		StringBuilder buf = new StringBuilder();
		final boolean isError = errorCode != -1;
		if (isError) {
			buf.append(formatError(errorCode)).append(' ');
			buf.append(msg).append("\n\t");
			buf.append(formatLocation(path,line,column)).append("\n\t");
			buf.append(source);
		} else {
			buf.append(msg);
		}
		final String string = buf.toString();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (isError) 
					error(string);
				else info(string);
			}
		});
	}
	
	protected String formatLocation(String path, int line, int column) {
		return String.format("'%s:%d:%d'", path, line, column);
	}

	protected String formatError(int errorCode) {
		return String.format("#%d", errorCode);
	}

	public void error(String string) {
		Color red = Display.getDefault().getSystemColor(SWT.COLOR_DARK_RED);
		append(string, red);
	}

	public void info(String string) {
		Color gray = Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
		append(string, gray);
	}

	public void append(String str) {
		append(str, null);
	}

	public void append(String str, Color color) {
		MessageConsoleStream stream = newMessageStream();
		if (color != null)
			stream.setColor(color);
		stream.println(str);
		try {
			stream.close();
		} catch (IOException e) {
			Logger.getLogger(getClass()).error("error closing compiler console stream", e);
		}
	}
}
