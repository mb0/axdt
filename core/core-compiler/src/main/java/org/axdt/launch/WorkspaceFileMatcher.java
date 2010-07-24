package org.axdt.launch;

import org.apache.log4j.Logger;
import org.axdt.compiler.console.PatternMatchAdapter;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.PatternMatchEvent;

/**
 * @author mb0
 */
public abstract class WorkspaceFileMatcher extends PatternMatchAdapter {
	protected final IWorkspaceRoot root;
	protected final String pattern;

	public WorkspaceFileMatcher() {
		root = ResourcesPlugin.getWorkspace().getRoot();
		pattern = createPattern();
	}

	@Override
	public String getPattern() {
		return pattern;
	}

	@Override
	public void matchFound(PatternMatchEvent event) {
		try {
			LinkContext link = openLink(new LinkContext(event));
			if (link != null)
				console.addHyperlink(link.link, link.offset, link.length);
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(
					"error matching workspace path in console output", e);
		}
	}

	protected IFile getFile(IPath location) {
		int matching = root.getLocation().matchingFirstSegments(location);
		IPath fullPath = location.removeFirstSegments(matching);
		return root.getFile(fullPath);
	}

	protected String[] splitTextPosition(String text) {
		String[] split = text.split(":");
		// do we have a sane path ?
		if (split[0].length() == 1) {
			// no, we have a windows path
			String[] result = new String[split.length - 1];
			result[0] = split[0] + ":" + split[1];
			for (int i = 2; i < split.length; i++)
				result[i - 1] = split[i];
			split = result;
		}
		return split;
	}

	protected abstract String createPattern();

	protected abstract LinkContext openLink(LinkContext linkContext)
			throws Exception;

	public static class LinkContext {
		protected final PatternMatchEvent event;
		protected IHyperlink link = null;
		protected int offset;
		protected int length;

		public LinkContext(PatternMatchEvent event) {
			this.event = event;
			this.offset = event.getOffset();
			this.length = event.getLength();
		}

		public void correctPosition(int diffLeft, int diffRight) {
			offset += diffLeft;
			length += diffRight - diffLeft;
		}

		public void setLink(IHyperlink link) {
			this.link = link;
		}

		public String getText(IDocument doc) throws BadLocationException {
			return doc.get(offset, length);
		}
	}
}
