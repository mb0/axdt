package org.axdt.as3.debug.launch;

import org.axdt.as3.debug.As3DebugPlugin;
import org.axdt.as3.debug.IAs3DebugConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchGroup;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class As3LaunchShortcut implements ILaunchShortcut {
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			Object first = ((IStructuredSelection) selection).getFirstElement();
			if (first instanceof IFile) {
				launch((IFile) first, mode);
			}
		}
	}
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		IFile file = (IFile) input.getAdapter(IFile.class);
		if (file != null) {
			launch(file, mode);
		}
	}
	protected ILaunchConfiguration findExistingLaunchConfigurations(IResource file) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = manager
				.getLaunchConfigurationType(getLaunchConfigurationType());
		if (type == null) {
			return null;
		}
		try {
			ILaunchConfiguration[] configs = manager.getLaunchConfigurations(type);
			for (int i = 0; i < configs.length; i++) {
				String configPath = configs[i].getAttribute(IAs3DebugConstants.TARGET, "");
				if (file.getFullPath().toString().equals(configPath)) {
					return configs[i];
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void launch(IFile file, String mode) {
		ILaunchConfiguration launchConfig = findExistingLaunchConfigurations(file);
		if (launchConfig == null) {
			launchConfig = createNewLaunchConfig(file, mode);
			IWorkbenchWindow aww = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			ILaunchGroup launchGroup = DebugUITools.getLaunchGroup(launchConfig, mode);
			DebugUITools.openLaunchConfigurationDialog(aww.getShell(), launchConfig, launchGroup
					.getIdentifier(), null);
		} else {
			DebugUITools.launch(launchConfig, mode);
		}
	}
	private ILaunchConfiguration createNewLaunchConfig(IFile file, String mode) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType configType = manager
				.getLaunchConfigurationType(IAs3DebugConstants.CONFIGURATION_TYPE);
		if (configType == null) {
			As3DebugPlugin.getDefault().log("there is no launch configuration type "
					+ IAs3DebugConstants.CONFIGURATION_TYPE);
			return null;
		}
		 // XXX we want compatibility with eclipse 3.5
		@SuppressWarnings("deprecation")
		String name = manager.generateUniqueLaunchConfigurationNameFrom(file.getName());
		try {
			ILaunchConfigurationWorkingCopy workingCopy = configType.newInstance(null, name);
			workingCopy.setAttribute(IAs3DebugConstants.TARGET, file.getFullPath().toString());
			return workingCopy.doSave();
		} catch (Exception e) {
			As3DebugPlugin.getDefault().log("Error creating launch configuration", e);
		}
		return null;
	}
	protected String getLaunchConfigurationType() {
		return IAs3DebugConstants.CONFIGURATION_TYPE;
	}
}
