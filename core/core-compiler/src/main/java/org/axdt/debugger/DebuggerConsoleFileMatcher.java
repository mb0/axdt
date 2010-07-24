package org.axdt.debugger;

import org.axdt.launch.WorkspaceFileMatcher;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.console.FileLink;

public class DebuggerConsoleFileMatcher extends WorkspaceFileMatcher {

	@Override
	protected String createPattern() {
		return String.format("\\[%s[^\\]]*\\]", root.getLocation().toOSString()
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
