/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.contentassist;

import org.axdt.as3.scoping.As3ImportScopeProvider;
import org.axdt.as3.services.As3GrammarAccess;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.inject.Inject;

/**
 * @author mb0
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist
 */
public class As3ProposalProvider extends AbstractAs3ProposalProvider {

	@Inject
	private IGrammarAccess grammarAccess;
	
	@Inject
	private As3ImportScopeProvider importScopeProvider;
	
	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		String value = keyword.getValue();
		//skip keywords
		if (value.equals("}")) {
			As3GrammarAccess grammar = (As3GrammarAccess) grammarAccess;
			CrossReference ref = grammar.getAs3PropertyIdentifierAccess().getReferenceAvmReferableCrossReference_1_0();
			lookupCrossReference(ref, contentAssistContext, acceptor);
		} else if (Character.isLetter(value.charAt(0)))
			super.completeKeyword(keyword, contentAssistContext, acceptor);
	}
	protected ConfigurableCompletionProposal doCreateProposal(String proposal, StyledString displayString, Image image,
			int priority, ContentAssistContext context) {
		int replacementOffset = context.getReplaceRegion().getOffset();
		int replacementLength = context.getReplaceRegion().getLength();
		ConfigurableCompletionProposal result = null;
		if (proposal.contains(".")) {
			result = new As3QualifiedCompletionProposal(proposal, importScopeProvider, context.getCurrentModel(), replacementOffset, replacementLength, proposal.length(), image, displayString);
			result.setPriority(priority-400);
		}
		if (result == null){
			result = doCreateProposal(proposal, displayString, image, replacementOffset, replacementLength);
			result.setPriority(priority);
		}
		result.setMatcher(context.getMatcher());
		result.setReplaceContextLength(context.getReplaceContextLength());
		return result;
	}
}
