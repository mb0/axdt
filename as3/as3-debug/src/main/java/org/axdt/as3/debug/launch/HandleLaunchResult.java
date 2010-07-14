package org.axdt.as3.debug.launch;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.as3.debug.preferences.As3DebugPreferences;
import org.axdt.as3.debug.variables.As3PathVariableHelper;
import org.axdt.compiler.AxdtCompilerTarget;
import org.axdt.core.config.ISwfConfig;
import org.axdt.core.ui.swf.SwfEditorLauncher;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;

public class HandleLaunchResult implements Runnable {

	private final ILaunch launch;
	private final ILaunchConfiguration config;
	private final boolean successful;
	private final IPath targetPath;
	private final IPath deployPath;
	private final IPath deployFile;

	public HandleLaunchResult(ILaunch launch,
			ILaunchConfiguration configuration, AxdtCompilerTarget target,
			boolean successful) {
		this.launch = launch;
		this.config = configuration;
		this.successful = successful;
		deployPath = target.getDeployLocation();
		deployFile = target.getDeployFileLocation();
		targetPath = target.getTarget().getFullPath();
	}

	public void run() {
		if (successful) {
			refreshDeployDir();
			openResult();
		}
		cleanUpLaunch();
	}

	protected void refreshDeployDir() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IContainer deployDir = root.getContainerForLocation(deployPath);
		try {
			deployDir.refreshLocal(IResource.DEPTH_ONE,
					new NullProgressMonitor());
		} catch (CoreException e) {
			As3DebugPlugin.getDefault()
					.log("Error refreshing deploy folder", e);
		}
	}

	protected void openResult() {
		try {
			As3DebugPreferences pref = As3DebugPreferences.getInstance();
			boolean openBrowser = pref.getBoolean(config, As3DebugPreferences.OPEN_SWF);
			if (openBrowser) {
				String browserChoice = pref.getString(config, ISwfConfig.OPEN_BROWSER);
				if (ISwfConfig.CHOICE_PREFERENCE.equals(browserChoice))
					browserChoice = null;
				SwfEditorLauncher launcher = new SwfEditorLauncher(browserChoice);
				if (pref.getBoolean(config, As3DebugPreferences.USE_ALT_PATH))
					launcher.open(As3PathVariableHelper.resolveURL(
							targetPath.toString(), 
							pref.getString(config,
							As3DebugPreferences.ALT_PATH)).toURL());
				else
					launcher.open(deployFile);
			}
		} catch (Exception e) {
			As3DebugPlugin.getDefault().log("Error opening swf", e);
		}
	}

	protected void cleanUpLaunch() {
		DebugPlugin.getDefault().getLaunchManager().removeLaunch(launch);
	}
}
