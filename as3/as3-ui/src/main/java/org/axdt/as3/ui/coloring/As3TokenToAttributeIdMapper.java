/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.coloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;


public class As3TokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if("RULE_NUMBER".equals(tokenName)) {
			return As3HighlightingConfiguration.NUMBER_ID;
		}
		if("RULE_DOC_COMMENT".equals(tokenName)) {
			return As3HighlightingConfiguration.DOC_COMMENT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
