/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
