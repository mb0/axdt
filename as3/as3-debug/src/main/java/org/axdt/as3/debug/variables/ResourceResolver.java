package org.axdt.as3.debug.variables;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IDynamicVariableResolver;
import org.eclipse.core.variables.IStringVariableManager;
import org.eclipse.core.variables.VariablesPlugin;

public class ResourceResolver implements IDynamicVariableResolver {

	public String resolveValue(IDynamicVariable variable, String argument)
			throws CoreException {
		IStringVariableManager manager = VariablesPlugin.getDefault()
				.getStringVariableManager();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String string = manager.performStringSubstitution("${resource_path:"
				+ argument + "}");
		IResource member = root.findMember(string);
		String name = variable.getName();
		if (name.equals("resource_name_noext")) {
			return member.getFullPath().removeFileExtension().lastSegment();
		}
		return "NOT_IMPLEMENTED";
	}
}
