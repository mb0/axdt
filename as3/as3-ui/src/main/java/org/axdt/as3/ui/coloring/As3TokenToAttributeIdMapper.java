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
