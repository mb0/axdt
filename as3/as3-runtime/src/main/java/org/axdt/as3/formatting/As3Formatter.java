/*
 * generated by Xtext
 */
package org.axdt.as3.formatting;

import java.io.IOException;

import org.axdt.as3.services.As3GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting.IElementMatcherProvider.IElementMatcher;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementPattern;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfigBasedStream;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class As3Formatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		As3GrammarAccess f = (As3GrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(100);
		c.setLinewrap(1,1,2).after(f.getVirtualSemiRule());
		c.setNoSpace().before(f.getVirtualSemiRule());
		c.setLinewrap(1,1,2).after(f.getAs3OperationSignatureAccess().getSemicolonKeyword_13());
		c.setNoSpace().before(f.getAs3OperationSignatureAccess().getSemicolonKeyword_13());

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

		// indention
		// TODO make allman or bsd style configurable
		c.setIndentation(f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1(), f.getAs3BlockAccess()
				.getRightCurlyBracketKeyword_4());
		c.setLinewrap(1,1,2).after(f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1());
		c.setLinewrap(1,1,1).after(f.getAs3BlockAccess().getRightCurlyBracketKeyword_4());
		c.setLinewrap(0,0,1).before(f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1());
		c.setIndentation(f.getAs3ClassAccess().getLeftCurlyBracketKeyword_8(), f
				.getAs3ClassAccess().getRightCurlyBracketKeyword_11());
		c.setLinewrap(1,2,2).after(f.getAs3ClassAccess().getLeftCurlyBracketKeyword_8());
		c.setLinewrap(0,0,1).before(f.getAs3ClassAccess().getLeftCurlyBracketKeyword_8());
		c.setLinewrap().after(f.getAs3ClassAccess().getRightCurlyBracketKeyword_11());
		c.setIndentation(f.getAs3InterfaceAccess().getLeftCurlyBracketKeyword_7(), f
				.getAs3InterfaceAccess().getRightCurlyBracketKeyword_10());
		c.setLinewrap(1,2,2).after(f.getAs3InterfaceAccess().getLeftCurlyBracketKeyword_7());
		c.setLinewrap(0,0,1).before(f.getAs3InterfaceAccess().getLeftCurlyBracketKeyword_7());
		c.setLinewrap().after(f.getAs3InterfaceAccess().getRightCurlyBracketKeyword_10());
		c.setIndentation(f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4(), f
				.getAs3PackageAccess().getRightCurlyBracketKeyword_7());
		c.setLinewrap(1,2,2).after(f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4());
		c.setLinewrap(0,0,1).before(f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4());
		c.setLinewrap().after(f.getAs3PackageAccess().getRightCurlyBracketKeyword_7());

		// comments
		c.setLinewrap(0,0,2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0,1,2).before(f.getML_COMMENTRule());
		c.setLinewrap(1,1,2).before(f.getDOC_COMMENTRule());
		c.setLinewrap(0,1,2).after(f.getML_COMMENTRule());
		c.setLinewrap(1,1,1).after(f.getDOC_COMMENTRule());

		// misc
		c.setNoSpace().before(f.getAs3PropertyOperatorAccess().getLeftSquareBracketKeyword_1_0());
		c.setNoSpace().before(f.getAs3FunctionExpressionAccess().getLeftParenthesisKeyword_3());
		c.setNoSpace().before(f.getAs3OperationAccess().getLeftParenthesisKeyword_7());
		c.setNoSpace().before(f.getAs3OperationSignatureAccess().getLeftParenthesisKeyword_7());
		c.setNoSpace().around(f.getAs3QueryOperatorAccess().getFullStopFullStopKeyword_0_0());
		c.setNoLinewrap().after(f.getAs3DoStatementAccess().getStatementIStatementParserRuleCall_2_0());
		c.setLinewrap(1,1,2).after(f.getAs3ImportListRule());
	}

	@Override
	public ITokenStream createFormatterStream(String indent, ITokenStream out,
			boolean preserveWhitespaces) {
		return new IgnorantFormattingConfigBasedStream(out, indent, getConfig(), createMatcher(),
				getHiddenTokenHelper(), preserveWhitespaces);
	}

	/**
	 * Customized FormattingConfigBasedStream that filters out un-hidden line terminators 
	 * @author mb0
	 */
	private static class IgnorantFormattingConfigBasedStream extends FormattingConfigBasedStream {

		public IgnorantFormattingConfigBasedStream(ITokenStream out, String indentation,
				FormattingConfig cfg, IElementMatcher<ElementPattern> matcher,
				IHiddenTokenHelper hiddenTokenHelper, boolean preserveSpaces) {
			super(out, indentation, cfg, matcher, hiddenTokenHelper, preserveSpaces);
		}

		@Override
		public void writeSemantic(EObject grammarElement, String value) throws IOException {
			String preserve = null;
			if (grammarElement instanceof RuleCall) {
				RuleCall ruleCall = (RuleCall) grammarElement;
				String ruleName = ruleCall.getRule().getName();
				if ("LT".equals(ruleName)) {
					preserve = value;
					value = null;					
				} else if ("VirtualSemi".equals(ruleName) && !";".equals(value)) {
					preserve = value;
					value = ";";
				}
			}
			if (value != null)
				super.writeSemantic(grammarElement, value);
			if (preserve != null) {
				if (preservedWS == null)
					preservedWS = preserve;
				else
					preservedWS += preserve;
			}
		}
	}
}