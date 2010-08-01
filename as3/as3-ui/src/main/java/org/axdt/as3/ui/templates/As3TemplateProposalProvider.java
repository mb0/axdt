/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.templates;

import org.axdt.core.ui.img.AxdtImages;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Replacement for DefaultTemplateProposalProvider the only differences are a
 * custom template icon and custom template context to fix indentation
 * 
 * @author mb0
 */
@Singleton
public class As3TemplateProposalProvider extends
		DefaultTemplateProposalProvider {

	@Inject
	protected IImageHelper imageHelper;

	protected Image image;

	// XXX why is getScopeProvider private ?!
	protected IScopeProvider scopeProvider2;

	@Inject
	public As3TemplateProposalProvider(TemplateStore templateStore,
			ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}

	public Image getImage(Template template) {
		if (image == null)
			image = imageHelper.getImage(AxdtImages.TEMPLATE);
		return image;
	}

	protected TemplateContext doCreateTemplateContext(
			TemplateContextType contextType, ContentAssistContext context) {
		return new As3TemplateContext(contextType, context.getDocument(),
				new Position(context.getReplaceRegion().getOffset(), context
						.getReplaceRegion().getLength()), context,
				scopeProvider2);
	}

	@Inject
	@Override
	public void setScopeProvider(IScopeProvider scopeProvider) {
		scopeProvider2 = scopeProvider;
		super.setScopeProvider(scopeProvider);
	}
}
