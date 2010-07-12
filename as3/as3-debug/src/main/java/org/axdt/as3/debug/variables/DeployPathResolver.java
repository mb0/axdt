package org.axdt.as3.debug.variables;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IDynamicVariableResolver;

public class DeployPathResolver implements IDynamicVariableResolver {

	public String resolveValue(IDynamicVariable variable, String argument)
			throws CoreException {
		String name = variable.getName();
		if (name.startsWith("deploy_")) {
//			IStringVariableManager manager = VariablesPlugin.getDefault().getStringVariableManager();
//			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//			String string = manager.performStringSubstitution("${resource_path:"+argument+"}");
//			IResource member = root.findMember(string);
			// TODO
//			IContainer path = AS3Preferences.getDeployPath(member);
//			if (name.endsWith("_loc")) {
//				return path.getLocation().toPortableString();
//			}
//			if (name.endsWith("_path")) {
//				return path.getFullPath().toPortableString();
//			}
//			if (name.endsWith("_name")) {
//				return path.getFullPath().removeTrailingSeparator().lastSegment();
//			}
		}
		return "NOT_IMPLEMENTED";
	}

}
