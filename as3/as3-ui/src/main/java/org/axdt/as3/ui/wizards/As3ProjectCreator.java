/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.wizards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.axdt.core.AxdtCore;
import org.axdt.core.ui.preferences.CorePreferences;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.internal.xtend.type.baseimpl.BuiltinMetaModel;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.AbstractProjectCreator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class As3ProjectCreator extends AbstractProjectCreator {

	@Inject
	protected CorePreferences corePreference;
	
	@Inject
	protected Injector injector;

	protected List<String> getAllFolders() {
		String string = corePreference.getStore().getString(CorePreferences.SOURCE_PATHS);
		return Arrays.asList(string.split("[,; ]"));
	}
	
	@Override
	protected ProjectFactory createProjectFactory() {
		return injector.getInstance(ProjectFactory.class);
	}

	protected String getModelFolderName() {
		String string = corePreference.getStore().getString(CorePreferences.SOURCE_PATHS);
		String[] split = string.split("[,; ]");
		return split != null && split.length > 0 ?
				split[0] : "";
	}

	@Override
	protected String getCreateModelProjectMessage() {
		return "Creating as3 project " + getProjectInfo().getProjectName();
	}

	@Override
	protected List<IProject> getReferencedProjects() {
		// TODO enable referenced projects
		return Collections.emptyList();
	}

	@Override
	protected String[] getBuilders() {
		return new String[] { AxdtCore.BUILDER_ID };
	}

	@Override
	protected String[] getProjectNatures() {
		return new String[] { AxdtCore.NATURE_ÌD, XtextProjectHelper.NATURE_ID };
	}

	@Override
	protected void enhanceProject(final IProject project,
			final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project
				.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(
				output, null);
		execCtx.getResourceManager().setFileEncoding("UTF-8");
		execCtx.registerMetaModel(new BuiltinMetaModel(null));

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("org::axdt::as3::ui::wizards::NewAs3Project::main",
				getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
}
