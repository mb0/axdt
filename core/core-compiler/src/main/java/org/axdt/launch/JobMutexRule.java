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
