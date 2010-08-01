/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.compiler;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import flex2.tools.oem.ProgressMeter;

/**
 * @author mb0
 */
public class CompilerProgressMonitor extends SubProgressMonitor implements
		ProgressMeter {
	private final String name;

	public CompilerProgressMonitor(IProgressMonitor monitor, String name) {
		super(monitor, 100);
		this.name = name;
	}

	public void end() {
		done();
	}

	public void percentDone(int arg0) {
		worked(1);
	}

	public void start() {
		beginTask("Compiling " + name, 100);
	}
}
