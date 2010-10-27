/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.html;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.NamespaceContext;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

class MutableNamespaceContext implements NamespaceContext {

	private Map<String, String> map;

	public MutableNamespaceContext() {
		map = Maps.newHashMap();
	}

	public void setNamespace(String prefix, String namespaceURI) {
		map.put(prefix, namespaceURI);
	}

	public String getNamespaceURI(String prefix) {
		return map.get(prefix);
	}

	public String getPrefix(String namespaceURI) {
		for (String prefix : map.keySet()) {
			if (map.get(prefix).equals(namespaceURI)) {
				return prefix;
			}
		}
		return null;
	}

	public Iterator<String> getPrefixes(String namespaceURI) {
		List<String> prefixes = Lists.newArrayList();
		for (String prefix : map.keySet()) {
			if (map.get(prefix).equals(namespaceURI)) {
				prefixes.add(prefix);
			}
		}
		return prefixes.iterator();
	}
}
