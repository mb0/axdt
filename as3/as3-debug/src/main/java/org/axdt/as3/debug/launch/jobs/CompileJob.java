/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.launch.jobs;

import org.axdt.as3.debug.compiler.As3DelegatingCompiler;
import org.axdt.launch.AbstractLaunchJob;
import org.axdt.launch.AxdtLaunchContext;
import org.axdt.launch.JobMutexRule;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * @author nkuebler
 * @author mb0
 */
public class CompileJob extends AbstractLaunchJob {

	public CompileJob(AxdtLaunchContext context) {
		super("Compile Swf", context);
		setRule(JobMutexRule.getMutex());
	}

	@Override
	protected IStatus doRun(IProgressMonitor monitor) throws Exception {
		monitor.beginTask("Compiling Targets", 100);
		boolean successful = As3DelegatingCompiler.getInstance().compile(
				context, monitor);
		if (!successful)
			return Status.CANCEL_STATUS;
		return null;
	}
}
