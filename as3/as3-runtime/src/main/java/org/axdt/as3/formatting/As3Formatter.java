/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.formatting;

import org.axdt.as3.services.As3GrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.util.Pair;

/**
 * @author mb0
 */
public class As3Formatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected As3GrammarAccess getGrammarAccess() {
		return (As3GrammarAccess) super.getGrammarAccess();
	}

	@Override
	protected void configureFormatting(FormattingConfig c) {
		As3GrammarAccess f = getGrammarAccess();
		c.setAutoLinewrap(100);
		c.setLinewrap(1,1,2).after(f.getVirtualSemiRule());
		c.setNoSpace().before(f.getVirtualSemiRule());
		
		c.setLinewrap(1,1,2).after(f.getAs3OperationSignatureAccess().getSemicolonKeyword_14());
		c.setNoSpace().before(f.getAs3OperationSignatureAccess().getSemicolonKeyword_14());

		// colon
		c.setNoSpace().around(f.getResultTypeAccess().getColonKeyword_0_1());
		c.setNoSpace().around(f.getVarTypeAssignAccess().getColonKeyword_1());
		c.setNoSpace().around(f.getVarTypeAccess().getColonKeyword_0());
		c.setNoSpace().around(f.getAs3LiteralFieldAccess().getColonKeyword_2());

		// dot
		for (Keyword comma : f.findKeywords(".")) {
			c.setNoSpace().around(comma);
		}
		// import fqn is a data type rule
		// we use the converter and a rewritten IValueSerializer

		// comma
		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}

		// arithmetic
		c.setNoSpace().before(f.getIPostfixExpressionAccess().getPlusSignPlusSignKeyword_1_3_1());
		c.setNoSpace().before(
				f.getIPostfixExpressionAccess().getHyphenMinusHyphenMinusKeyword_1_4_1());

		// pairs
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().bounds(pair.getFirst(),pair.getSecond());
	    }
		c.setNoSpace().before(f.getAs3ArgumentsAccess().getLeftParenthesisKeyword_1());
		
		c.setNoSpace().bounds(f.getObjectInitialiserAccess().getLeftCurlyBracketKeyword_1(),
				f.getObjectInitialiserAccess().getRightCurlyBracketKeyword_4());
		c.setNoSpace().bounds(f.getAs3PropertyOperatorAccess().getLeftSquareBracketKeyword_1_0(),
				f.getAs3PropertyOperatorAccess().getRightSquareBracketKeyword_1_4());

		// indentations
		// TODO make allman or bsd style configurable
		c.setIndentation(f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1(), f.getAs3BlockAccess()
				.getRightCurlyBracketKeyword_4());
		c.setLinewrap(1,1,2).after(f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1());
		c.setLinewrap(1,1,1).after(f.getAs3BlockAccess().getRightCurlyBracketKeyword_4());
		c.setLinewrap(0,0,1).before(f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1());
		c.setIndentation(f.getAs3ClassAccess().getLeftCurlyBracketKeyword_9(), f
				.getAs3ClassAccess().getRightCurlyBracketKeyword_12());
		c.setLinewrap(1,2,2).after(f.getAs3ClassAccess().getLeftCurlyBracketKeyword_9());
		c.setLinewrap(0,0,1).before(f.getAs3ClassAccess().getLeftCurlyBracketKeyword_9());
		c.setLinewrap().after(f.getAs3ClassAccess().getRightCurlyBracketKeyword_12());
		c.setIndentation(f.getAs3InterfaceAccess().getLeftCurlyBracketKeyword_8(), f
				.getAs3InterfaceAccess().getRightCurlyBracketKeyword_11());
		c.setLinewrap(1,2,2).after(f.getAs3InterfaceAccess().getLeftCurlyBracketKeyword_8());
		c.setLinewrap(0,0,1).before(f.getAs3InterfaceAccess().getLeftCurlyBracketKeyword_8());
		c.setLinewrap().after(f.getAs3InterfaceAccess().getRightCurlyBracketKeyword_11());
		c.setIndentation(f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4(), f
				.getAs3PackageAccess().getRightCurlyBracketKeyword_7());
		c.setLinewrap(1,2,2).after(f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4());
		c.setLinewrap(0,0,1).before(f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4());
		c.setLinewrap().after(f.getAs3PackageAccess().getRightCurlyBracketKeyword_7());
		// indentations for auto line wrap
		c.setIndentation(f.getAs3OperationAccess().getLeftParenthesisKeyword_8(),
				f.getAs3OperationAccess().getRightParenthesisKeyword_11());
		c.setIndentation(f.getAs3OperationAccess().getFunctionKeyword_3(),
				f.getAs3OperationAccess().getBodyAssignment_14());
		c.setIndentation(f.getAs3FunctionExpressionAccess().getLeftParenthesisKeyword_3(),
				f.getAs3FunctionExpressionAccess().getRightParenthesisKeyword_6());
		c.setIndentation(f.getAs3FunctionExpressionAccess().getFunctionKeyword_0(),
				f.getAs3FunctionExpressionAccess().getBodyAssignment_10());
		// comments
		c.setLinewrap(0,0,2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0,1,2).before(f.getML_COMMENTRule());
		c.setLinewrap(1,1,2).before(f.getDOC_COMMENTRule());
		c.setLinewrap(0,1,2).after(f.getML_COMMENTRule());
		c.setLinewrap(1,1,1).after(f.getDOC_COMMENTRule());

		// misc
		c.setNoSpace().before(f.getAs3PropertyOperatorAccess().getLeftSquareBracketKeyword_1_0());
		c.setNoSpace().before(f.getAs3FunctionExpressionAccess().getLeftParenthesisKeyword_3());
		c.setNoSpace().before(f.getAs3OperationAccess().getLeftParenthesisKeyword_8());
		c.setNoSpace().before(f.getAs3OperationSignatureAccess().getLeftParenthesisKeyword_8());
		c.setNoSpace().around(f.getAs3QueryOperatorAccess().getFullStopFullStopKeyword_0_0());
		c.setNoLinewrap().after(f.getAs3DoStatementAccess().getStatementIStatementParserRuleCall_2_0());
		c.setLinewrap(1,1,2).after(f.getAs3ImportListRule());
		c.setLinewrap(1).before(f.getAs3PackageRule());
		c.setLinewrap(1).before(f.getAs3ClassRule());
		c.setLinewrap(1).before(f.getAs3InterfaceRule());
		c.setLinewrap(1).before(f.getAs3OperationRule());
		c.setLinewrap(1).before(f.getAs3OperationSignatureRule());
		c.setLinewrap(1).before(f.getAs3FieldDefinitionRule());
	}

	@Override
	public ITokenStream createFormatterStream(String indent, ITokenStream out,
			boolean preserveWhitespaces) {
		return new As3FormattingStream(out, indent, getConfig(), createMatcher(),
				getHiddenTokenHelper(), preserveWhitespaces, getGrammarAccess());
	}
}
