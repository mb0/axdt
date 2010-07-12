package org.axdt.flex4.compiler;

import org.axdt.compiler.console.AbstractCompilerConsole;

import flex2.tools.oem.Logger;
import flex2.tools.oem.Message;

public class Flex4Console extends AbstractCompilerConsole implements Logger {
	
	public static Flex4Console getDefault() {
		Flex4Console console = new Flex4Console();
		AbstractCompilerConsole.setConsole(console);
		return console;
	}
	
	public Flex4Console() {
		super("Flex3 Console", null);
	}
	public void log(Message msg, int errorCode, String source) {
		logMessage(msg.toString(), msg.getPath(), msg.getLine(), msg.getColumn(), msg.getLevel(), errorCode, source);
	}
}
