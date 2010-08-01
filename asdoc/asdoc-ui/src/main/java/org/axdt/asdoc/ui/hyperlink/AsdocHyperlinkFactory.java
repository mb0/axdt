/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.ui.hyperlink;

import org.axdt.asdoc.model.AsdocDefinition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class AsdocHyperlinkFactory {

	@Inject
	private Provider<AsdocHyperlink> asdocHyperlinkProvider;

	public boolean canHandle(EObject to) {
		return to instanceof AsdocDefinition;
	}

	public void createHyperlink(Region region, EObject to, IHyperlinkAcceptor acceptor) {
		AsdocDefinition element = (AsdocDefinition) to;
		String label = element.getCanonicalName();
		AsdocHyperlink result = asdocHyperlinkProvider.get();
		result.setHyperlinkRegion(region);
		result.setHyperlinkText(label);
		result.setDefinition(element);
		acceptor.accept(result);
	}
	
	public Provider<AsdocHyperlink> getAsdocHyperlinkProvider() {
		return asdocHyperlinkProvider;
	}

	public void setAsdocHyperlinkProvider(Provider<AsdocHyperlink> asdocHyperlinkProvider) {
		this.asdocHyperlinkProvider = asdocHyperlinkProvider;
	}
}
