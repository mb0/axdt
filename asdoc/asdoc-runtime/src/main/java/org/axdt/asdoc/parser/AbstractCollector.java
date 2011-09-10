/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocElement;
import org.axdt.avm.access.AvmAccess;
import org.eclipse.emf.common.util.URI;

import com.google.common.collect.Lists;

public abstract class AbstractCollector implements Comparator<AsdocElement> {
	protected final Logger logger = Logger.getLogger(getClass());
	
	protected AsdocXmlHelper xml;
	
	protected AsdocEFactory asFactory = AsdocEFactory.eINSTANCE;
	protected static List<String> globalTypes = Lists.newArrayList("Object", "Array", "String", "Boolean", "int", "uint", "Number", "Date", "Function", "Class", "Math");
	
	public AbstractCollector() {
		xml = new AsdocXmlHelper();
	}
	public int compare(AsdocElement o1, AsdocElement o2) {
		return o1.getName().compareTo(o2.getName());
	}
	public URI getProxyURI(String name) {
		if (name == null || "*".equals(name) || "void".equals(name))
			return null;
		name = name.trim();
		if (name.length() == 0)
			return null;
		if (name.lastIndexOf(']') != 0)
			name = name.replaceFirst("\\.<[^>]*>", "");
		if (name.contains(":"))
			name = name.replaceFirst(":", ".");
		// check if we already got a qualified name
		boolean isQualified = name.contains(".") || globalTypes.contains(name);
		String partition = ":" + (isQualified ? "/types/" : "/lookup/");
		String uri = AvmAccess.PROTOCOL + partition + name;
		return URI.createURI(uri);
	}
}
