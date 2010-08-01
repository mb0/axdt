/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.compiler;

import org.axdt.compiler.console.AbstractCompilerConsole;
import org.axdt.launch.AbstractConsole;

import flex2.tools.oem.Logger;
import flex2.tools.oem.Message;

/**
 * @author mb0
 */
public class Flex4CompilerConsole extends AbstractCompilerConsole implements
		Logger {

	public static Flex4CompilerConsole getDefault() {
		Flex4CompilerConsole console = new Flex4CompilerConsole();
		AbstractConsole.setConsole(console, AbstractCompilerConsole.class);
		return console;
	}

	public Flex4CompilerConsole() {
		super("Flex3 Console", null);
	}

	public void log(Message msg, int errorCode, String source) {
		logMessage(msg.toString(), msg.getPath(), msg.getLine(),
				msg.getColumn(), msg.getLevel(), errorCode, source);
	}
}
