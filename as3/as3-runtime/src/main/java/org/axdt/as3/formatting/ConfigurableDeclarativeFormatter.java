/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.formatting;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.formatting.IElementMatcherProvider;
import org.eclipse.xtext.formatting.IIndentationInformation;
import org.eclipse.xtext.formatting.IElementMatcherProvider.IElementMatcher;
import org.eclipse.xtext.formatting.impl.BaseFormatter;
import org.eclipse.xtext.formatting.impl.ElementMatcherProvider;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.MatcherNFAProvider;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementPattern;
import org.eclipse.xtext.formatting.impl.MatcherState;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * taken from org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
 * @author Moritz Eysholdt - original code
 * @author mb0 - changes to make formatter reconfigurable
 */
public abstract class ConfigurableDeclarativeFormatter extends BaseFormatter {
	@Singleton
	protected static class ConfigStore {
		protected FormattingConfig config;
		protected IElementMatcherProvider matcherProvider;
	}

	@Inject
	private ConfigStore config;

	@Inject
	private IGrammarAccess grammarAccess;

	@Inject
	private IHiddenTokenHelper hiddenTokenHelper;

	@Inject(optional = true)
	private IIndentationInformation indentInfo = new IIndentationInformation() {
		public String getIndentString() {
			return "\t";
		}
	};

	protected abstract void configureFormatting(FormattingConfig config);

	@SuppressWarnings("deprecation")
	protected FormattingConfig createFormattingConfig() {
		FormattingConfig cfg = new FormattingConfig(grammarAccess, hiddenTokenHelper, indentInfo);
		cfg.setWhitespaceRule(getWSRule());
		return cfg;
	}

	protected IElementMatcher<ElementPattern> createMatcher() {
		return getMatcherProvider().createMatcher(getConfig().getLocatorsForSemanticTokens());
	}

	protected FormattingConfig getConfig() {
		synchronized (config) {
			if (config.config == null) {
				config.config = createFormattingConfig();
				config.matcherProvider = new CustomMatcherProvider(grammarAccess);
				configureFormatting(config.config);
			}
		}
		return config.config;
	}
	
	public void clearConfig() {
		synchronized (config) {
			config.config = null;
			config.matcherProvider = null;
			purgeMatcherStateAdapters();
		}
	}
	
	private void purgeMatcherStateAdapters() {
		TreeIterator<EObject> contents = grammarAccess.getGrammar().eAllContents();
		List<MatcherState> toRemove = Lists.newArrayList();
		while (contents.hasNext()) {
			EObject next = contents.next();
			if (next instanceof AbstractElement) {
				for (Adapter a : next.eAdapters())
					if (a instanceof MatcherState)
						toRemove.add((MatcherState) a);
			}
			if (toRemove.isEmpty()) continue;
			next.eAdapters().removeAll(toRemove);
			toRemove.clear();
		}
	}

	protected IGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}

	protected IHiddenTokenHelper getHiddenTokenHelper() {
		return hiddenTokenHelper;
	}

	protected IIndentationInformation getIndentInfo() {
		return indentInfo;
	}

	protected IElementMatcherProvider getMatcherProvider() {
		return config.matcherProvider;
	}
	protected static class CustomMatcherProvider extends ElementMatcherProvider {

		public CustomMatcherProvider(IGrammarAccess grammarAccess) {
			grammar = grammarAccess;
			nfaProvider = new MatcherNFAProvider();
		}
		
	}
}
