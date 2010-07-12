package org.axdt.avm.ui.proposal;

import org.axdt.avm.model.AvmType;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalFactory;

public abstract class AbstractAvmProposalProvider implements IAvmProposalProvider {

	public void createTypeProposals(ICompletionProposalFactory proposalFactory,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createTypeProposals(proposalFactory, context, DefinitionMatchFilters.all(), acceptor);
	}

	public void createSubTypeProposals(AvmType superType,
			ICompletionProposalFactory proposalFactory, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createSubTypeProposals(superType, proposalFactory, context, DefinitionMatchFilters.all(), acceptor);
	}

}
