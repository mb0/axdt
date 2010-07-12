package org.axdt.as3.debug.launch;

import java.net.URI;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.as3.debug.preferences.As3DebugPreferences;
import org.axdt.as3.debug.variables.As3PathVariableHelper;
import org.axdt.compiler.AxdtCompilerTarget;
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
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.swt.program.Program;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

public class HandleLaunchResult implements Runnable {

	private final ILaunch launch;
	private final ILaunchConfiguration config;
	private final boolean successful;
	private final IPath targetPath;
	private final IPath deployPath;
	private final IPath deployFile;

	public HandleLaunchResult(ILaunch launch, ILaunchConfiguration configuration, AxdtCompilerTarget target, boolean successful) {
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
			deployDir.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
		} catch (CoreException e) {
			As3DebugPlugin.getDefault().log("Error refreshing deploy folder", e);
		}
	}

	protected void openResult() {
		try {
			As3DebugPreferences pref = As3DebugPreferences.getInstance();
			boolean openBrowser = pref.getBoolean(config, As3DebugPreferences.OPEN_SWF);
			if (openBrowser) {
				URI uri = deployFile.toFile().toURI();
				boolean useAlternativePath = pref.getBoolean(config, As3DebugPreferences.USE_ALT_PATH);
				if (useAlternativePath) {
					String path = pref.getString(config, As3DebugPreferences.ALT_PATH);
					uri = As3PathVariableHelper.resolveLocation(targetPath.toString(), path);
				}
				String viewChoice = pref.getString(config, As3DebugPreferences.OPEN_WITH);
				openBrowserView(viewChoice,uri);
			}
		} catch (Exception e) {
			As3DebugPlugin.getDefault().log("Error opening swf", e);
		}
	}

	protected void openBrowserView(String viewChoice, URI uri) throws Exception {
		IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();
		boolean internalAvail = browserSupport.isInternalWebBrowserAvailable();
		String name = targetPath.toString();
		int style = IWorkbenchBrowserSupport.NAVIGATION_BAR | IWorkbenchBrowserSupport.LOCATION_BAR;
		if (internalAvail && As3DebugPreferences.CHOICE_SWFVIEW.equals(viewChoice)) {
			style |= IWorkbenchBrowserSupport.AS_EDITOR;
		} else if (internalAvail && As3DebugPreferences.CHOICE_INTERNAL.equals(viewChoice)) {
			style |= IWorkbenchBrowserSupport.AS_VIEW;
		} else {
			Program.launch(uri.toString());
			return;
		}
		IWebBrowser browser = browserSupport.createBrowser(style, name, name, name);
		if (uri.getScheme() == null);
		browser.openURL(uri.toURL());
	}

	protected void cleanUpLaunch() {
		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
		launchManager.removeLaunch(launch);
	}
}
