package org.axdt.as3.ui.templates;

import java.util.List;

import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.xtext.ui.editor.templates.CrossReferenceTemplateVariableResolver;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;

import com.google.common.base.Function;
import com.google.common.collect.Lists;


public class As3CrossReferenceTemplateVariableResolver extends
		CrossReferenceTemplateVariableResolver {
	@Override
	public List<String> resolveValues(TemplateVariable variable, XtextTemplateContext castedContext) {
		return Lists.transform(super.resolveValues(variable, castedContext), new Function<String, String>() {
			private int index;
			public String apply(String from) {
				return (index = from.indexOf("::")) > 0 ? from.substring(index+2) : from;
			}
		});
	}
}
