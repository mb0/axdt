/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.ui.proposal;

import org.axdt.asdoc.access.IDocRootProvider;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.ui.proposal.AbstractAvmProposalProvider;
import org.axdt.avm.util.SuperTypeCollector;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalFactory;

import com.google.inject.Inject;

public class AsdocProposalProvider extends AbstractAvmProposalProvider {
	
	@Inject
	private SuperTypeCollector superTypeCollector;
	
	@Inject
	private IDocRootProvider docRootProvider;

	public void createTypeProposals(ICompletionProposalFactory proposalFactory,
			ContentAssistContext context, Filter filter, ICompletionProposalAcceptor acceptor) {
		EObject model = context.getCurrentModel();
		if (model == null || model.eResource() == null || model.eResource().getResourceSet() == null)
			return;
		Iterable<AsdocRoot> asdocRoots = docRootProvider.getDocRoots(model.eResource().getResourceSet());
		createTypeProposals(asdocRoots, proposalFactory, context, filter, acceptor);
	}

	protected void createTypeProposals(Iterable<AsdocRoot> asdocRoots,
			ICompletionProposalFactory proposalFactory, ContentAssistContext context,
			Filter filter, ICompletionProposalAcceptor acceptor) {
		
	}

	public void createSubTypeProposals(AvmType superType,
			ICompletionProposalFactory proposalFactory, ContentAssistContext context,
			Filter filter, ICompletionProposalAcceptor acceptor) {
		
	}

	public SuperTypeCollector getSuperTypeCollector() {
		return superTypeCollector;
	}

	public void setSuperTypeCollector(SuperTypeCollector superTypeCollector) {
		this.superTypeCollector = superTypeCollector;
	}

	public IDocRootProvider getDocRootProvider() {
		return docRootProvider;
	}

	public void setDocRootProvider(IDocRootProvider docRootProvider) {
		this.docRootProvider = docRootProvider;
	}
}
