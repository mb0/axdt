/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.launch;

import org.eclipse.core.runtime.jobs.ISchedulingRule;

/**
 * @author mb0
 */
public class JobMutexRule implements ISchedulingRule {
	private static JobMutexRule mutex = null;

	public static ISchedulingRule getMutex() {
		if (mutex == null)
			mutex = new JobMutexRule();
		return mutex;
	}
	
	private JobMutexRule() {
	}
	
	public boolean contains(ISchedulingRule rule) {
		return rule == this;
	}

	public boolean isConflicting(ISchedulingRule rule) {
		return rule == this;
	}
}
