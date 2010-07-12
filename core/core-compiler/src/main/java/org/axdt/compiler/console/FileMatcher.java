package org.axdt.compiler.console;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.console.FileLink;
import org.eclipse.ui.console.PatternMatchEvent;

public class FileMatcher extends PatternMatchAdapter {

	protected final IWorkspaceRoot root;
	protected final String pattern;

	public FileMatcher() {
		root = ResourcesPlugin.getWorkspace().getRoot();
		String workspacePath = root.getLocation().toOSString().replace("\\", "\\\\");
		pattern = String.format("'%s[^']*'", workspacePath);
	}

	@Override
	public String getPattern() {
		return pattern;
	}

	@Override
	public void matchFound(PatternMatchEvent event) {
		try {
			String text = getMatchedText(event);
			if (text == null) return;
			if (text.charAt(0)=='\'') 
				text = text.substring(1);
			if (text.charAt(text.length()-1)=='\'') 
				text = text.substring(0,text.length()-1);
			String[] split = text.split(":");
			// do we have a sane path ?
			if (split[0].length() == 1) {
				// no, we have a windows path
				split = new String[] {
					split[0] + ":" + split[1],
					split[2], split[3]
				};
			}
			IPath path = new Path(split[0]);
			int line = Integer.parseInt(split[1]);
			int matching = root.getLocation().matchingFirstSegments(path);
			path = path.removeFirstSegments(matching);
			IFile file = root.getFile(path);
			if (file.exists()) {
				FileLink link = new FileLink(file, null, -1, -1, line);
				console.addHyperlink(link, event.getOffset() + 1, event.getLength() - 2);
			}
		} catch (Exception e) {
			Logger.getLogger(getClass()).error("error matching workspace path in console output", e);
		}
	}
}
