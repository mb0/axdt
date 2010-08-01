/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.compiler.console;

import org.axdt.launch.WorkspaceFileMatcher;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.console.FileLink;

/**
 * @author mb0
 */
public class CompilerConsoleFileMatcher extends WorkspaceFileMatcher {

	@Override
	protected String createPattern() {
		return String.format("'%s[^']*'", root.getLocation().toOSString()
				.replace("\\", "\\\\"));
	}

	@Override
	protected LinkContext openLink(LinkContext context) throws Exception {
		context.correctPosition(1, -1);
		String text = context.getText(getDocument());
		String[] split = splitTextPosition(text);
		IPath location = new Path(split[0]);
		int line = Integer.parseInt(split[1]);
		IFile file = getFile(location);
		if (file.exists()) {
			context.setLink(new FileLink(file, null, -1, -1, line));
			return context;
		}
		return null;
	}
}
