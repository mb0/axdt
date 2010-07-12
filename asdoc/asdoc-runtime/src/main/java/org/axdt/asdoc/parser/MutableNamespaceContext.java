package org.axdt.asdoc.parser;

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