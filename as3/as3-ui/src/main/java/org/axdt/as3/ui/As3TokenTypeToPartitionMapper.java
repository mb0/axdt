package org.axdt.as3.ui;

import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

public class As3TokenTypeToPartitionMapper extends
		TerminalsTokenTypeToPartitionMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_DOC_COMMENT".equals(tokenName))
			return COMMENT_PARTITION;
		return super.calculateId(tokenName, tokenType);
	}
}
