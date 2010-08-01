/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.variables;

import org.axdt.core.ui.preferences.CorePreferences;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IDynamicVariableResolver;
import org.eclipse.core.variables.IStringVariableManager;
import org.eclipse.core.variables.VariablesPlugin;

public class DeployPathResolver implements IDynamicVariableResolver {

	public String resolveValue(IDynamicVariable variable, String argument)
			throws CoreException {
		// XXX dirty hack
		String name = variable.getName();
		if (name.startsWith("deploy_")) {
			IStringVariableManager manager = VariablesPlugin.getDefault()
					.getStringVariableManager();
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			String string = manager
					.performStringSubstitution("${resource_path:" + argument
							+ "}");
			IResource member = root.findMember(string);
			CorePreferences instance = CorePreferences.getInstance();
			IResource res = instance.getOutputResource(member);
			if (res == null)
				return "NOT_IMPLEMENTED";
			if (name.endsWith("_loc"))
				return res.getLocation().toPortableString();
			if (name.endsWith("_path"))
				return res.getFullPath().toPortableString();
			if (name.endsWith("_name"))
				return res.getFullPath().removeTrailingSeparator()
						.lastSegment();
		}
		return "NOT_IMPLEMENTED";
	}

}
