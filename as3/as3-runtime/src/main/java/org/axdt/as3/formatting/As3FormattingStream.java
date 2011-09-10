/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.formatting;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.axdt.as3.services.As3GrammarAccess;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.formatting.IElementMatcherProvider.IElementMatcher;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementLocator;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementPattern;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfig.IndentationLocatorStart;
import org.eclipse.xtext.formatting.impl.FormattingConfigBasedStream;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Customized FormattingConfigBasedStream that filters out un-hidden line terminators 
 * and assures correct virtual semicolon formatting
 * @author mb0
 */
public class As3FormattingStream extends FormattingConfigBasedStream {

	protected static final Set<String> BREAKS = Sets.newHashSet("\n", "\r",
			"\r\n");
	protected final As3GrammarAccess grammarAccess;
	protected ElementLocator afterVSemiLocator;
	protected ElementLocator beforeVSemiLocator;
	protected List<CommentEntry> queuedComments = Lists.newArrayList();

	public As3FormattingStream(ITokenStream out, String indentation,
			FormattingConfig cfg, IElementMatcher<ElementPattern> matcher,
			IHiddenTokenHelper hiddenTokenHelper, boolean preserveSpaces,
			As3GrammarAccess grammarAccess) {
		super(out, indentation, cfg, matcher, hiddenTokenHelper, preserveSpaces);
		this.grammarAccess = grammarAccess;
	}

	protected boolean isVSemiRule(EObject ele) {
		EAttribute ruleName = XtextPackage.eINSTANCE.getAbstractRule_Name();
		return ele != null && ele.eIsSet(ruleName)
				&& "VirtualSemi".equals(ele.eGet(ruleName));
	}

	protected boolean isVSemiPart(EObject ele) {
		return ele instanceof RuleCall && isVSemiRule(((RuleCall)ele).getRule());
	}

	@Override
	public void writeSemantic(EObject grammarElement, String value)
			throws IOException {
		String preserve = null;
		if (BREAKS.contains(value)) {
			preserve = value;
			value = null;
			if (isVSemiPart(grammarElement)) {
				value = ";";
			}
		}
		if (value != null)
			super.writeSemantic(grammarElement, value);
		if (preserve != null)
			preservedWS = preservedWS != null ? preservedWS + preserve
					: preserve;
	}
	@Override
	public void writeHidden(EObject grammarElement, String value)
			throws IOException {
		if (isComment(grammarElement)) {
			Set<ElementLocator> collectLocators = collectLocators(grammarElement);
			queuedComments.add(new CommentEntry(grammarElement, value, preservedWS, collectLocators));
			preservedWS = null;
		} else 
			super.writeHidden(grammarElement, value);
	}
	protected boolean isComment(EObject grammarElement) {
		return grammarElement instanceof AbstractRule && hiddenTokenHelper.isComment((AbstractRule) grammarElement);
	}
	protected void writeComment(CommentEntry entry) throws IOException {
		LineEntry e = createLineEntry(entry.grammarElement, entry.value, true, entry.locators, entry.preservedWS, indentationLevel,
				null);
		if (currentLine == null)
			currentLine = createLine();
		Line newLine = currentLine.add(e);
		if (newLine != null)
			currentLine = newLine;
	}

	protected class CommentEntry {

		private final EObject grammarElement;
		private final String value;
		private final String preservedWS;
		private final Set<ElementLocator> locators;

		public CommentEntry(EObject grammarElement, String value,
				String preservedWS, Set<ElementLocator> locators) {
					this.grammarElement = grammarElement;
					this.value = value;
					this.preservedWS = preservedWS;
					this.locators = locators;
		}
		
	}
	@Override
	public void flush() throws IOException {
		writeQueuedComments(null);
		super.flush();
	}
	protected boolean writeQueuedComments(ElementLocator indentStart) {
		boolean addedIndentStart = false;
		if (!queuedComments.isEmpty()) {
			for (CommentEntry comment:queuedComments) {
				try {
					if (indentStart != null && !addedIndentStart) {
						comment.locators.add(indentStart);
						currentLine.flush();
						currentLine = null;
						addedIndentStart = true;
					}
					writeComment(comment);
				} catch (IOException e) {
				}
			}
			queuedComments.clear();
		}
		return addedIndentStart;
	}
	protected Set<ElementLocator> collectLocators(EObject ele) {
		boolean curIsVSemi = isVSemiPart(ele);
		boolean lastIsVSemi = isVSemiPart(last);
		Set<ElementLocator> locators = super.collectLocators(ele);
		if (!queuedComments.isEmpty() && !isComment(ele)) {
			ElementLocator indentStart = null;
			for (ElementLocator locator : locators) {
				if (locator instanceof IndentationLocatorStart) {
					indentStart = locator;
					break;
				}
			}
			if (writeQueuedComments(indentStart))
				locators.remove(indentStart);
		}
		if (curIsVSemi)
			locators.add(getBeforeVSemiLocator()); 
		if (lastIsVSemi)
			locators.add(getAfterVSemiLocator());
		last = ele;
		return locators;
	}

	protected ElementLocator getBeforeVSemiLocator() {
		if (beforeVSemiLocator == null)
			beforeVSemiLocator = lookupVSemiLocator(false);
		return beforeVSemiLocator;
	}

	protected ElementLocator getAfterVSemiLocator() {
		if (afterVSemiLocator == null)
			afterVSemiLocator = lookupVSemiLocator(true);
		return afterVSemiLocator;
	}

	protected ElementLocator lookupVSemiLocator(boolean left) {
		ParserRule rule = grammarAccess.getVirtualSemiRule();
		for (ElementPattern pattern : cfg.getLocatorsForSemanticTokens()) {
			ElementLocator locator = pattern.getLocator();
			EObject compare = left ? locator.getLeft() : locator.getRight();
			if (rule.equals(compare))
				return locator;
		}
		return null;
	}
}
