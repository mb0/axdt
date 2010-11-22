/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.launch;

import org.axdt.as3.debug.launch.model.SourceElement;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;

public class As3SourceLookupDirector extends AbstractSourceLookupDirector {

	public void initializeParticipants() {
		addParticipants(new ISourceLookupParticipant[] { new AbstractSourceLookupParticipant() {
			IPath root = ResourcesPlugin.getWorkspace().getRoot().getLocation();

			public String getSourceName(Object object) throws CoreException {
				String sourcePath = null;
				if (object instanceof SourceElement)
					sourcePath = ((SourceElement) object).getSourcePath();
				if (sourcePath != null) {
					IPath path = new Path(sourcePath);
					if (path.isAbsolute() && root.isPrefixOf(path)) {
						IPath rel = path.removeFirstSegments(root
								.segmentCount());
						return rel.toString();
					}
				}
				return null;
			}
		} });
	}

}
