/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.ccil.cowan.tagsoup.Parser;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class HtmlLoader {

	public final XPath xpPath;
	private Parser parser;
	private SAXTransformerFactory saxFactory;

	public HtmlLoader() {
		MutableNamespaceContext nc = new MutableNamespaceContext();
		nc.setNamespace("html", "http://www.w3.org/1999/xhtml");
		saxFactory = (SAXTransformerFactory) TransformerFactory.newInstance();
		xpPath = XPathFactory.newInstance().newXPath();
		xpPath.setNamespaceContext(nc);
		parser = new Parser();
	}

	public Node load(String location) throws IOException, SAXException,
			TransformerConfigurationException {
		if (location == null)
			return null;
		TransformerHandler transformerHandler = saxFactory
				.newTransformerHandler();
		DOMResult result = new DOMResult();
		transformerHandler.setResult(result);
		parser.setContentHandler(transformerHandler);
		parser.parse(getInputSource(location));
		return result.getNode();
	}

	public InputSource getInputSource(String location) throws IOException {
		URLConnection connection = new URL(location).openConnection();
		return new InputSource(connection.getInputStream());
	}

	public Node[] eIter(XPathExpression xexpr, Node node)
			throws XPathExpressionException {
		if (node == null)
			return new Node[0];
		NodeList list = (NodeList) xexpr.evaluate(node, XPathConstants.NODESET);
		Node[] result = new Node[list.getLength()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.item(i);
		}
		return result;
	}

	public Node eval(XPathExpression xexpr, Node node)
			throws XPathExpressionException {
		if (node == null)
			return null;
		return (Node) xexpr.evaluate(node, XPathConstants.NODE);
	}

	public String attr(Node node, String name) {
		Node item = node.getAttributes().getNamedItem(name);
		return item == null ? null : item.getTextContent();
	}
}
