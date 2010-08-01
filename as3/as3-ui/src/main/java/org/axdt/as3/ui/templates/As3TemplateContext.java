/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.templates;

import org.axdt.as3.ui.preferences.As3EditorPreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.jface.text.templates.TemplateTranslator;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;

/**
 * This template context fixes the indentation of inserted templates and
 * translates tabs to spaces if configured.
 * 
 * @author mb0
 */
public class As3TemplateContext extends XtextTemplateContext {

	public As3TemplateContext(TemplateContextType type, IDocument document,
			Position position, ContentAssistContext contentAssistContext,
			IScopeProvider scopeProvider) {
		super(type, document, position, contentAssistContext, scopeProvider);
	}

	@Override
	public TemplateBuffer evaluate(Template template)
			throws BadLocationException, TemplateException {
		// copied from org.eclipse.jface.text.templates.DocumentTemplateContext
		if (!canEvaluate(template))
			return null;

		TemplateTranslator translator = new TemplateTranslator();
		String pattern = template.getPattern();
		// only translate indentation if actually applied
		if (!isReadOnly())
			pattern = translateIndentation(template.getPattern());
		TemplateBuffer buffer = translator.translate(pattern);
		// only resolve variables if actually applied
		if (!isReadOnly())
			getContextType().resolve(buffer, this);
		return buffer;
	}

	protected String translateIndentation(String pattern)
			throws BadLocationException {
		IPreferenceStore store = As3EditorPreferences.getInstance().getStore();
		if (pattern.indexOf('\n') != -1) {
			IRegion lineInfo = getDocument().getLineInformationOfOffset(
					getCompletionOffset());
			String line = getDocument().get(lineInfo.getOffset(),
					lineInfo.getLength());
			int index = 0;
			for (; index < line.length(); index++)
				if (!Character.isWhitespace(line.charAt(index)))
					break;
			String indentation = line.substring(0, index);
			pattern = pattern.replace("\n", "\n" + indentation);
		}
		if (store.getBoolean(As3EditorPreferences.TAB_TO_SPACE)) {
			int numSpaces = store.getInt(As3EditorPreferences.TAB_WIDTH);
			String spaces = "            ".substring(0, numSpaces);
			pattern = pattern.replace("\t", spaces);
		}
		return pattern;
	}
}
