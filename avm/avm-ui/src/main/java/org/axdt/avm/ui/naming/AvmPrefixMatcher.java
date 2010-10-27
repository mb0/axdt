/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.ui.naming;

import org.eclipse.xtext.naming.IQualifiedNameSupport;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author mb0
 */
public class AvmPrefixMatcher extends PrefixMatcher implements IQualifiedNameSupport {
	public static final String DELEGATE_NAME = "org.axdt.avm.ui.naming.AvmPrefixMatcher$delegate";

	@Inject
	@Named(DELEGATE_NAME)
	private PrefixMatcher delegate;

	@Override
	public boolean isCandidateMatchingPrefix(String name, String prefix) {
		int index;
		if ((index = name.indexOf(getSubDelimiter())) > -1)
			name = name.substring(index + 1);
		else if ((index = name.indexOf(getDelimiter())) > -1)
			name = name.substring(index + 2);
		return delegate.isCandidateMatchingPrefix(name, prefix);
	}

	public void setDelegate(PrefixMatcher delegate) {
		this.delegate = delegate;
	}

	public PrefixMatcher getDelegate() {
		return delegate;
	}

	public String getDelimiter() {
		return "::";
	}
	
	public char getSubDelimiter() {
		return '#';
	}

	public String getWildCard() {
		return "*";
	}
}
