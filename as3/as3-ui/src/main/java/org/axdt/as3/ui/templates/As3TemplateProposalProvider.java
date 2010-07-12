package org.axdt.as3.ui.templates;

import org.axdt.core.ui.img.AxdtImages;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Replacement for DefaultTemplateProposalProvider the only difference is that
 * it adds a custom template icon
 * 
 * @author mb0
 */
@Singleton
public class As3TemplateProposalProvider extends
		DefaultTemplateProposalProvider {

	@Inject
	protected IImageHelper imageHelper;

	protected Image image;

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
}
