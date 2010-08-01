/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.formatting;

import java.util.Set;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultHiddenTokenHelper;

import com.google.common.collect.Sets;

/**
 * @author mb0
 */
public class As3HiddenTokenHelper extends DefaultHiddenTokenHelper {

	private static final Set<String> COMMENT_RULES = Sets.newHashSet(
			"DOC_COMMENT", "ML_COMMENT", "SL_COMMENT");

	public boolean isWhitespace(AbstractRule rule) {
		return rule != null && "WS".equals(rule.getName());
	}

	public boolean isComment(AbstractRule rule) {
		return rule != null && COMMENT_RULES.contains(rule);
	}
}
