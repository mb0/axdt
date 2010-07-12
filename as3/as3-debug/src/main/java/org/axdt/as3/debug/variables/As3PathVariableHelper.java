package org.axdt.as3.debug.variables;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IStringVariableManager;
import org.eclipse.core.variables.VariablesPlugin;

public class As3PathVariableHelper {

	public static URI resolveLocation(String targetPath, String templateString) throws URISyntaxException, CoreException {
		IStringVariableManager manager = VariablesPlugin.getDefault().getStringVariableManager();
		templateString = addTarget(templateString,"resource_loc", targetPath);
		templateString = addTarget(templateString,"resource_name", targetPath);
		templateString = addTarget(templateString,"resource_name_noext", targetPath);
		templateString = addTarget(templateString,"resource_path", targetPath);
		templateString = addTarget(templateString,"deploy_loc", targetPath);
		templateString = addTarget(templateString,"deploy_name", targetPath);
		templateString = addTarget(templateString,"deploy_path", targetPath);
		String string = manager.performStringSubstitution(templateString, true);
		return new URI(string);
	}
	public static String addTarget(String pathStr, String string, String targetPath) {
		return pathStr.replace("${"+string+"}", "${"+string+":"+targetPath+"}");
	}
}
