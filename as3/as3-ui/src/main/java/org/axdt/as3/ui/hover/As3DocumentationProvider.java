package org.axdt.as3.ui.hover;

import org.axdt.asdoc.model.AsdocElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class As3DocumentationProvider implements IEObjectDocumentationProvider {

	String ruleName = "DOC_COMMENT";
	String startTag = "/\\*\\*?"; // regular expression
	String endTag = "\\*/"; // regular expression
	String linePrefix = "\\** ?"; // regular expression
	String linePostfix = "\\**"; // regular expression
	String whitespace = "( |\\t)*"; // regular expression

	protected String findComment(EObject o) {
		String returnValue = null;
		ICompositeNode node = NodeModelUtils.getNode(o);
		if (node != null) {
			INode parent = node.getParent().getParent();
			ILeafNode last = null;
			for (ILeafNode leaf : parent.getLeafNodes()) {
				if (leaf.getTotalOffset() >= node.getFirstChild().getTotalOffset())
					break;
				if (leaf.isHidden() && leaf.getGrammarElement() instanceof TerminalRule
						&& ruleName.equalsIgnoreCase(((TerminalRule) leaf.getGrammarElement()).getName())) {
					last = leaf;
				}
			}
			if (last != null) {
				String comment = last.getText();
				if (comment.matches("(?s)" + startTag + ".*")) {
					returnValue = comment;
				}
			}
		}
		return returnValue;
	}

	public String getDocumentation(EObject o) {
		String returnValue = findComment(o);
		if (returnValue != null) {
			returnValue = returnValue.replaceAll("\\A" + startTag, "");
			returnValue = returnValue.replaceAll(endTag + "\\z", "");
			returnValue = returnValue.replaceAll("(?m)^" + whitespace
					+ linePrefix, "");
			returnValue = returnValue.replaceAll("(?m)" + whitespace
					+ linePostfix + whitespace + "$", "");
			return returnValue.trim();
		} else if (o instanceof AsdocElement) {
			return ((AsdocElement) o).getAsdoc();
		} else {
			return "";
		}
	}
}
