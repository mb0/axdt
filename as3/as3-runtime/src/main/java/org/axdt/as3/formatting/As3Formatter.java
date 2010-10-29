/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.formatting;

import org.axdt.as3.config.IFormattingConfig;
import org.axdt.as3.config.IFormattingConfig.IndentStyle;
import org.axdt.as3.services.As3GrammarAccess;
import org.axdt.as3.services.As3GrammarAccess.As3ArrayInitializerElements;
import org.axdt.as3.services.As3GrammarAccess.As3MetadataTagElements;
import org.axdt.as3.services.As3GrammarAccess.ObjectInitialiserElements;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.util.Pair;

import com.google.inject.Inject;

/**
 * @author mb0
 */
public class As3Formatter extends ConfigurableDeclarativeFormatter {

	@Inject
	protected IFormattingConfig formattingConfig; 
	
	@Override
	protected As3GrammarAccess getGrammarAccess() {
		return (As3GrammarAccess) super.getGrammarAccess();
	}

	@Override
	protected void configureFormatting(FormattingConfig c) {
		IndentStyle indentStyle = formattingConfig.getIndentStyle(null);
		int autoLineWrap = formattingConfig.getInt(null, IFormattingConfig.MAX_LINE_WIDTH);

		int minMemberWrap = 1;
		
		As3GrammarAccess f = getGrammarAccess();
		c.setAutoLinewrap(autoLineWrap);
		c.setLinewrap(1, 1, 2).after(f.getVirtualSemiRule());
		c.setNoSpace().before(f.getVirtualSemiRule());

		c.setLinewrap(1, 1, 2).after(
				f.getAs3OperationSignatureAccess().getSemicolonKeyword_12());
		c.setNoSpace().before(
				f.getAs3OperationSignatureAccess().getSemicolonKeyword_12());

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
		c.setNoSpace().before(
				f.getIPostfixExpressionAccess()
						.getPlusSignPlusSignKeyword_1_3_1());
		c.setNoSpace().before(
				f.getIPostfixExpressionAccess()
						.getHyphenMinusHyphenMinusKeyword_1_4_1());

		// pairs
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().bounds(pair.getFirst(), pair.getSecond());
		}
		c.setNoSpace().before(
				f.getAs3ArgumentsAccess().getLeftParenthesisKeyword_1());
		c.setNoSpace().bounds(
				f.getAs3PropertyOperatorAccess()
						.getLeftSquareBracketKeyword_1_0(),
				f.getAs3PropertyOperatorAccess()
						.getRightSquareBracketKeyword_1_4());
		// initializers
		As3ArrayInitializerElements arrayInitializer = f
				.getAs3ArrayInitializerAccess();
		configureInitializers(c,
				arrayInitializer.getLeftSquareBracketKeyword_1(),
				arrayInitializer.getRightSquareBracketKeyword_5(),
				arrayInitializer.getCommaKeyword_3_1());
		ObjectInitialiserElements objectInitialiser = f
				.getObjectInitialiserAccess();
		configureInitializers(c,
				objectInitialiser.getLeftCurlyBracketKeyword_1(),
				objectInitialiser.getRightCurlyBracketKeyword_4(),
				objectInitialiser.getCommaKeyword_3_1_1());
		// metadata
		As3MetadataTagElements metadataTag = f.getAs3MetadataTagAccess();
		c.setNoSpace().bounds(metadataTag.getLeftSquareBracketKeyword_0(),
				metadataTag.getRightSquareBracketKeyword_3());
		c.setNoSpace().around(metadataTag.getLeftParenthesisKeyword_2_0());
		c.setNoSpace().around(metadataTag.getRightParenthesisKeyword_2_3());
		c.setLinewrap(1, 1, 1).after(
				metadataTag.getRightSquareBracketKeyword_3());
		// indentations
		c.setIndentation(f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1(),
				f.getAs3BlockAccess().getRightCurlyBracketKeyword_4());
		c.setLinewrap(1, 1, 2).after(
				f.getAs3BlockAccess().getLeftCurlyBracketKeyword_1());
		c.setLinewrap(1, 1, 2).after(
				f.getAs3BlockAccess().getRightCurlyBracketKeyword_4());
		indentStyle.breakBefore(c, f.getAs3BlockAccess()
				.getLeftCurlyBracketKeyword_1());
		c.setIndentation(f.getAs3ClassAccess().getLeftCurlyBracketKeyword_7(),
				f.getAs3ClassAccess().getRightCurlyBracketKeyword_10());
		c.setLinewrap(minMemberWrap, 2, 2).after(
				f.getAs3ClassAccess().getLeftCurlyBracketKeyword_7());
		indentStyle.breakBefore(c, f.getAs3ClassAccess()
				.getLeftCurlyBracketKeyword_7());
		c.setLinewrap().after(
				f.getAs3ClassAccess().getRightCurlyBracketKeyword_10());
		c.setIndentation(f.getAs3InterfaceAccess()
				.getLeftCurlyBracketKeyword_6(), f.getAs3InterfaceAccess()
				.getRightCurlyBracketKeyword_9());
		c.setLinewrap(minMemberWrap, 2, 2).after(
				f.getAs3InterfaceAccess().getLeftCurlyBracketKeyword_6());
		indentStyle.breakBefore(c, f.getAs3InterfaceAccess()
				.getLeftCurlyBracketKeyword_6());
		c.setLinewrap().after(
				f.getAs3InterfaceAccess().getRightCurlyBracketKeyword_9());
		c.setIndentation(
				f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4(), f
						.getAs3PackageAccess().getRightCurlyBracketKeyword_7());
		c.setLinewrap(minMemberWrap, 2, 2).after(
				f.getAs3PackageAccess().getLeftCurlyBracketKeyword_4());
		indentStyle.breakBefore(c, f.getAs3PackageAccess()
				.getLeftCurlyBracketKeyword_4());
		c.setLinewrap().after(
				f.getAs3PackageAccess().getRightCurlyBracketKeyword_7());
		// indentations for auto line wrap
		c.setIndentation(f.getAs3OperationAccess()
				.getLeftParenthesisKeyword_6(), f.getAs3OperationAccess()
				.getRightParenthesisKeyword_9());
		c.setIndentation(f.getAs3OperationAccess().getFunctionKeyword_1(), f
				.getAs3OperationAccess().getBodyAssignment_12());
		c.setIndentation(f.getAs3FunctionExpressionAccess()
				.getLeftParenthesisKeyword_3(), f
				.getAs3FunctionExpressionAccess()
				.getRightParenthesisKeyword_6());
		c.setIndentation(f.getAs3FunctionExpressionAccess()
				.getFunctionKeyword_0(), f.getAs3FunctionExpressionAccess()
				.getBodyAssignment_10());
		// comments
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(1, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 2).before(f.getDOC_COMMENTRule());
		c.setLinewrap(1, 1, 2).after(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 1).after(f.getDOC_COMMENTRule());

		// misc
		c.setNoSpace().before(
				f.getAs3PropertyOperatorAccess()
						.getLeftSquareBracketKeyword_1_0());
		c.setNoSpace().before(
				f.getAs3FunctionExpressionAccess()
						.getLeftParenthesisKeyword_3());
		c.setNoSpace().before(
				f.getAs3OperationAccess().getLeftParenthesisKeyword_6());
		c.setNoSpace().before(
				f.getAs3OperationSignatureAccess()
						.getLeftParenthesisKeyword_6());
		c.setNoSpace().around(
				f.getAs3QueryOperatorAccess().getFullStopFullStopKeyword_0_0());
		c.setNoLinewrap().before(
				f.getAs3DoStatementAccess().getWhileKeyword_4());
		c.setLinewrap(minMemberWrap, Math.max(1, minMemberWrap), 2).after(
				f.getAs3ImportListRule());
		c.setNoLinewrap().between(
				f.getAs3BlockAccess().getRightCurlyBracketKeyword_4(),
				f.getAs3IfStatementAccess().getElseKeyword_5_1());
	}

	protected void configureInitializers(FormattingConfig c,
			AbstractElement left, AbstractElement right, EObject sep) {
		c.setLinewrap(0, 0, 1).bounds(left, right);
		c.setLinewrap(0, 0, 1).after(sep);
		c.setIndentation(left, right);
	}

	@Override
	public ITokenStream createFormatterStream(String indent, ITokenStream out,
			boolean preserveWhitespaces) {
		return new As3FormattingStream(out, indent, getConfig(),
				createMatcher(), getHiddenTokenHelper(), preserveWhitespaces,
				getGrammarAccess());
	}
}
