/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui;

import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.hover.ProblemHover;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;
import com.ibm.icu.util.StringTokenizer;

public class As3SourceViewerConfiguration extends XtextSourceViewerConfiguration {

	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		return new ProblemAndDocHover(sourceViewer);
	}
	@Inject
	private IPreferenceStoreAccess storeAccess;
	
	public boolean isSpacesForTab() {
		return storeAccess.getPreferenceStore().getBoolean(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS);
	}
	
	public String[] getIndentPrefixes(ISourceViewer sourceViewer,
			String contentType) {
		String[] indentPrefixes= getIndentPrefixesForTab(getTabWidth(sourceViewer));
		if (indentPrefixes == null)
			return null;

		int length= indentPrefixes.length;
		
		if (length > 2 && isSpacesForTab())  {
			// Swap first with second last
			String first= indentPrefixes[0];
			indentPrefixes[0]= indentPrefixes[length - 2];
			indentPrefixes[length - 2]= first;
		}

		return indentPrefixes;
	}
}

class ProblemAndDocHover extends ProblemHover {

	public ProblemAndDocHover(ISourceViewer sourceViewer) {
		super(sourceViewer);
	}
	@Override
	protected String getHoverInfoInternal(int lineNumber, int offset) {
		String info = super.getHoverInfoInternal(lineNumber, offset);
		if (info == null|| info.length() == 0) {
			XtextSourceViewer editor = (XtextSourceViewer) sourceViewer;
			IXtextDocument document = (IXtextDocument) editor.getDocument();
			info = document.readOnly(new DescriptionForOffset(offset));
		}
		return info;
	}
	protected String getDescription(AvmElement element) {
		String result = "";
		if (element instanceof AvmDefinition) {
			result = ((AvmDefinition) element).getCanonicalName();
		}
		result += element.getAsdoc();
		return result;
	}
}
class DescriptionForOffset implements IUnitOfWork<String, XtextResource> {

	private final int offset;

	public DescriptionForOffset(int offset) {
		this.offset = offset;
	}

	public String exec(XtextResource state) throws Exception {
		EObject element = EObjectAtOffsetHelper.resolveElementAt(state, offset, null);
		String result = "";
		if (element instanceof AvmDefinition) {
			AvmDefinition def = (AvmDefinition) element;
			result = def.getCanonicalName();
			if (element instanceof AvmElement) {
				String asdoc = ((AvmElement)element).getAsdoc();
				if (asdoc != null)
					result += "\n"+ wrapText(asdoc,"\n",60);
			}
		}
		return result;
	}
	protected String wrapText(String text, String newline, int count) {
		StringTokenizer tokenizer = new StringTokenizer(text, newline, true);
		StringBuilder buf = new StringBuilder();
		while (tokenizer.hasMoreTokens()) {
			String nextLine = tokenizer.nextToken();
			if (nextLine.length() > count) {
				nextLine = wrapLine(nextLine, newline, count);
			}
			buf.append(nextLine);
		}
		return buf.toString();
	}

	protected String wrapLine(String line, String newline, int count) {
		StringBuilder buf = new StringBuilder();
		while (line.length() > count) {
			int spaceAt = line.lastIndexOf(' ', count);
			if (spaceAt >= 0) {
				buf.append(line.substring(0, spaceAt));
				buf.append(newline);
				line = line.substring(spaceAt+1);
			}
		}
		buf.append(line);
		return buf.toString();
	}
}
