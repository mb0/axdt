/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.compiler.console;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.axdt.launch.AbstractConsole;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;

/**
 * @author mb0
 */
public abstract class AbstractCompilerConsole extends AbstractConsole {

	public AbstractCompilerConsole(String name, ImageDescriptor imageDescriptor) {
		super(String.format("%s (%s)", name,
				new SimpleDateFormat("HH:mm:ss").format(new Date())),
				imageDescriptor);
	}

	@Override
	protected void configure() {
		super.configure();
		addPatternMatchListener(new CompilerConsoleFileMatcher());
		addPatternMatchListener(new ErrorCodeMatcher());
	}

	public void logMessage(String msg, String path, int line, int column,
			String level, int errorCode, String source) {
		if (errorCode != -1) {
			StringBuilder buf = new StringBuilder();
			buf.append(formatError(errorCode)).append(' ');
			buf.append(msg).append("\n\t");
			buf.append(formatLocation(path, line, column)).append("\n\t");
			buf.append(source);
			error(buf.toString());
		} else if ("error".equals(level))
			error(msg);
		else if ("warning".equals(level))
			warn(msg);
		else
			info(msg);
	}

	protected String formatLocation(String path, int line, int column) {
		return String.format("'%s:%d:%d'", path, line, column);
	}

	protected String formatError(int errorCode) {
		return String.format("#%d", errorCode);
	}

	public void error(String string) {
		appendAsync(string, SWT.COLOR_DARK_RED);
	}

	public void warn(String string) {
		appendAsync(string, SWT.COLOR_DARK_YELLOW);
	}

	public void info(String string) {
		appendAsync(string, SWT.COLOR_DARK_GRAY);
	}
}
