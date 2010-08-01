/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
