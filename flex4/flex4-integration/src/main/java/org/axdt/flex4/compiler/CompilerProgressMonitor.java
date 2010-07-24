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
