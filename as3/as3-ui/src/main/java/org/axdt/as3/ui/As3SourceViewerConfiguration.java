/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui;

import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;

public class As3SourceViewerConfiguration extends XtextSourceViewerConfiguration {

//	@Inject
//	private IPreferenceStoreAccess storeAccess;
//	
//	public boolean isSpacesForTab() {
//		return storeAccess.getPreferenceStore().getBoolean(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS);
//	}
	
//	public String[] getIndentPrefixes(ISourceViewer sourceViewer,
//			String contentType) {
//		String[] indentPrefixes= getIndentPrefixesForTab(getTabWidth(sourceViewer));
//		if (indentPrefixes == null)
//			return null;
//
//		int length= indentPrefixes.length;
//		
//		if (length > 2 && isSpacesForTab())  {
//			// Swap first with second last
//			String first= indentPrefixes[0];
//			indentPrefixes[0]= indentPrefixes[length - 2];
//			indentPrefixes[length - 2]= first;
//		}
//
//		return indentPrefixes;
//	}
}