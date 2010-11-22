/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.debugger;

import org.axdt.debugger.DebuggerConsoleFileMatcher;
import org.axdt.flex4.debugger.model.FlexDebugElement;
import org.axdt.launch.AbstractConsole;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.swt.SWT;

/**
 * @author nkuebler
 * @author mb0
 */
public class Flex4DebugConsole extends AbstractConsole implements IDebugEventSetListener {
	
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
		DebugPlugin.getDefault().addDebugEventListener(this);
	}

	@Override
	protected void dispose() {
		DebugPlugin.getDefault().removeDebugEventListener(this);
		super.dispose();
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

	public void handleDebugEvents(DebugEvent[] events) {
		for (DebugEvent event:events) {
			if (event.getKind() == DebugEvent.MODEL_SPECIFIC
					&& event.getSource() instanceof FlexDebugElement) {
				String text = event.getData().toString();
				if (event.getDetail() == FlexDebugConstants.DETAIL_TRACE)
					trace(text);
				else info(text);
			}
		}
	}
}