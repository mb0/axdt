package org.axdt.as3.debug.launch;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.as3.debug.IAs3DebugConstants;
import org.axdt.as3.debug.compiler.As3DelegatingCompiler;
import org.axdt.as3.debug.preferences.As3CompilerPreferences;
import org.axdt.compiler.AxdtCompilerTarget;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.swt.widgets.Display;

public class As3LaunchJob extends Job implements IProcess {

	protected final ILaunch launch;
	protected final ILaunchConfiguration configuration;
	protected boolean terminated;

	public As3LaunchJob(ILaunch launch, ILaunchConfiguration configuration) {
		super("As3 Launch Job");
		this.launch = launch;
		this.configuration = configuration;
		terminated = false;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			doCompile(monitor);
		} catch (Exception e) {
			As3DebugPlugin.getDefault().log("Error compiling swf", e);
			return new Status(IStatus.ERROR, As3DebugPlugin.PLUGIN_ID, "Error compiling swf" + e.getMessage());
		}
		return new Status(IStatus.OK, As3DebugPlugin.PLUGIN_ID, "launching is done");
	}

	protected void doCompile(IProgressMonitor monitor) throws Exception {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String pathString = configuration.getAttribute(IAs3DebugConstants.TARGET, "");
		IFile file = root.getFile(new Path(pathString));
		As3DelegatingCompiler compiler = As3DelegatingCompiler.getInstance();
		AxdtCompilerTarget target = compiler.getTargetFor(file);
		setTargetContext(target,As3CompilerPreferences.SEARCH_LIBS,true);
		setTargetContext(target,As3CompilerPreferences.SEARCH_CONFIG,false);
		setTargetContext(target,As3CompilerPreferences.FLEX3_COMPATIBILITY,false);
		String compilerid = As3CompilerPreferences.getInstance().getString(configuration, As3CompilerPreferences.COMPILER_CHOICE);
		monitor.beginTask("Compiling Targets", 100);
		boolean successful = compiler.compile(target, compilerid, monitor);
		monitor.done();
		terminated = true;
		handleSuccess(target,successful);
	}
	protected void setTargetContext(AxdtCompilerTarget target, String key, boolean defaultValue) throws CoreException {
		target.setContext(key, configuration.getAttribute(key, defaultValue));
	}
	protected void handleSuccess(AxdtCompilerTarget compilerTarget, boolean successful) {
		HandleLaunchResult handler = new HandleLaunchResult(launch, configuration, compilerTarget, successful);
		Display.getDefault().asyncExec(handler);
	}

	public boolean canTerminate() {
		return !terminated;
	}

	public boolean isTerminated() {
		return terminated;
	}

	public void terminate() throws DebugException {
		cancel();
		terminated = true;
	}

	public String getLabel() {
		return getName();
	}

	public ILaunch getLaunch() {
		return launch;
	}

	public IStreamsProxy getStreamsProxy() {
		return null;
	}

	public void setAttribute(String key, String value) {
	}

	public String getAttribute(String key) {
		return null;
	}

	public int getExitValue() throws DebugException {
		return 0;
	}
}
