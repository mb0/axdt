package org.axdt.as3.formatting;

import java.io.IOException;
import java.util.Set;

import org.axdt.as3.services.As3GrammarAccess;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.formatting.IElementMatcherProvider.IElementMatcher;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfigBasedStream;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementLocator;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementPattern;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;

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
		if (ele == null)
			return false;
		EObject container = ele.eContainer();
		return container != null && isVSemiRule(container.eContainer());
	}

	@Override
	public void writeSemantic(EObject grammarElement, String value)
			throws IOException {
		String preserve = null;
		if (";".equals(value)) {
			if (isVSemiPart(grammarElement))
				grammarElement = grammarElement.eContainer().eContainer();
		} else if (BREAKS.contains(value)) {
			preserve = value;
			value = null;
			if (isVSemiPart(grammarElement)) {
				value = ";";
				grammarElement = grammarElement.eContainer().eContainer();
			}
		}
		if (value != null)
			super.writeSemantic(grammarElement, value);
		if (preserve != null)
			preservedWS = preservedWS != null ? preservedWS + preserve
					: preserve;
	}

	protected Set<ElementLocator> collectLocators(EObject ele) {
		boolean addVsemi = isVSemiRule(last);
		Set<ElementLocator> locators = isVSemiRule(ele) ? Sets
				.newHashSet(getBeforeVSemiLocator()) : super
				.collectLocators(ele);
		if (addVsemi)
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
