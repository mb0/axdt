/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.launch;

import org.apache.log4j.Logger;
import org.axdt.core.ui.CoreUiActivator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * @author mb0
 * @author nkuebler
 */
public abstract class AbstractLaunchJob extends Job {

	protected boolean terminated = false;
	protected final AxdtLaunchContext context;

	public AbstractLaunchJob(String name, AxdtLaunchContext context) {
		super(name);
		this.context = context;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.setTaskName(getName());
		try {
			IStatus status = doRun(monitor);
			if (status == null) {
				if (isCanceled(monitor))
					status = Status.CANCEL_STATUS;
				else
					status = Status.OK_STATUS;
			}
			return status;
		} catch (Exception e) {
			String msg = "Error launching task " + getName();
			Logger.getLogger(getClass()).error(msg, e);
			return new Status(IStatus.ERROR, CoreUiActivator.PLUGIN_ID, msg, e);
		} finally {
			monitor.done();
			terminated = true;
		}
	}

	protected abstract IStatus doRun(IProgressMonitor monitor) throws Exception;

	protected boolean isCanceled(IProgressMonitor monitor) {
		return monitor.isCanceled();
	}
}
