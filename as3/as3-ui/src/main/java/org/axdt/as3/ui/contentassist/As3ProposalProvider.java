/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * @author mb0
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist
 */
public class As3ProposalProvider extends AbstractAs3ProposalProvider {
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		//skip keywords
		if (Character.isLetter(keyword.getValue().charAt(0)))
			super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	protected ConfigurableCompletionProposal doCreateProposal(String proposal, StyledString displayString, Image image,
			int priority, ContentAssistContext context) {
		int replacementOffset = context.getReplaceRegion().getOffset();
		int replacementLength = context.getReplaceRegion().getLength();
		ConfigurableCompletionProposal result;
		if (proposal.contains("::"))
			result = doCreateQualifiedProposal(proposal,context.getCurrentModel(), displayString, image, replacementOffset, replacementLength);
		else
			result = doCreateProposal(proposal, displayString, image, replacementOffset, replacementLength);
		result.setPriority(priority);
		result.setMatcher(context.getMatcher());
		result.setReplaceContextLength(context.getReplaceContextLength());
		return result;
	}
	
	protected ConfigurableCompletionProposal doCreateQualifiedProposal(String proposal,
			EObject currentModel, StyledString displayString, Image image,
			int replacementOffset, int replacementLength) {
		int lastIndex = proposal.lastIndexOf("::");
		String quali = proposal.substring(0,lastIndex);
		proposal = proposal.substring(lastIndex+2);
		return new As3QualifiedCompletionProposal(proposal, quali, currentModel, replacementOffset, replacementLength, proposal.length(), image, displayString);
	}
}
