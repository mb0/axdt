package org.axdt.as3.resource;

import org.axdt.core.AxdtCore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.ui.containers.WorkspaceProjectsStateHelper;

public class As3ProjectsStateHelper extends WorkspaceProjectsStateHelper {
	@Override
	protected boolean isAccessibleXtextProject(IProject p) {
		try {
			return p != null && p.getNature(AxdtCore.NATURE_ÌD) != null;
		} catch (CoreException e) {
			return false;
		}
	}
}
