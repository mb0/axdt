/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.ui.hyperlink;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

import com.google.inject.Inject;

public class AsdocAwareHyperlinkHelper extends HyperlinkHelper {

	@Inject
	private AsdocHyperlinkFactory asdocHyperlinkFactory;
	
	@Override
	public void createHyperlinksTo(XtextResource from, Region region, EObject to, IHyperlinkAcceptor acceptor) {
		if (asdocHyperlinkFactory.canHandle(to))
			asdocHyperlinkFactory.createHyperlink(region, to, acceptor);
		else 
			super.createHyperlinksTo(from, region, to, acceptor);
	}
	
	public AsdocHyperlinkFactory getAsdocHyperlinkFactory() {
		return asdocHyperlinkFactory;
	}

	public void setAsdocHyperlinkFactory(AsdocHyperlinkFactory asdocHyperlinkFactory) {
		this.asdocHyperlinkFactory = asdocHyperlinkFactory;
	}
}
