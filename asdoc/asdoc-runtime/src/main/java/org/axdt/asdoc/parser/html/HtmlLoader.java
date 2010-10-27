/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.html;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;

import org.axdt.asdoc.parser.AsdocXmlHelper;
import org.ccil.cowan.tagsoup.Parser;
import org.w3c.dom.Node;

public class HtmlLoader extends AsdocXmlHelper {

	private Parser parser;
	private SAXTransformerFactory saxFactory;

	public HtmlLoader() {
		super();
		MutableNamespaceContext nc = new MutableNamespaceContext();
		nc.setNamespace("html", "http://www.w3.org/1999/xhtml");
		xpath.setNamespaceContext(nc);
		saxFactory = (SAXTransformerFactory) TransformerFactory.newInstance();
		parser = new Parser();
	}

	@Override
	public Node readXML(String uri) throws Exception {
		TransformerHandler handler = saxFactory.newTransformerHandler();
		DOMResult result = new DOMResult();
		handler.setResult(result);
		parser.setContentHandler(handler);
		parser.parse(getInputSource(uri));
		return result.getNode();
	}
}
