package org.axdt.as3.formatting;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultHiddenTokenHelper;

public class As3HiddenTokenHelper extends DefaultHiddenTokenHelper {
	public boolean isWhitespace(AbstractRule rule) {
		return rule != null
			&& "WS".equals(rule.getName());
//			&& ("WS".equals(rule.getName()) || "LT".equals(rule.getName()));
	}

	public boolean isComment(AbstractRule rule) {
		return rule != null
			&&("ML_COMMENT".equals(rule.getName())
			|| "SL_COMMENT".equals(rule.getName())
			|| "DOC_COMMENT".equals(rule.getName()));
	}
}
