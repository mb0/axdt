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
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

public class AsdocXmlHelper {

	public final XPath xpath;

	public AsdocXmlHelper() {
		xpath = XPathFactory.newInstance().newXPath();
	}

	public Node load(String uri) throws Exception {
		if (uri == null)
			return null;
		return readXML(uri);
	}

	public Node readXML(String uri) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(getInputSource(uri));
	}

	public InputSource getInputSource(String location) throws IOException {
		URLConnection connection = new URL(location).openConnection();
		return new InputSource(connection.getInputStream());
	}

	public List<Node> eIter(XPathExpression xexpr, Node node) throws Exception {
		List<Node> result = Lists.newArrayList();
		if (node == null)
			return result;
		NodeList list = (NodeList) xexpr.evaluate(node, XPathConstants.NODESET);
		int size = list.getLength();
		for (int i = 0; i < size; i++) {
			result.add(list.item(i));
		}
		return result;
	}

	public <T> List<T> eIter(XPathExpression xexpr, Node node,
			Function<Node, ? extends T> fun) throws Exception {
		if (node == null)
			return Collections.emptyList();
		List<T> result = Lists.newArrayList();
		NodeList list = (NodeList) xexpr.evaluate(node, XPathConstants.NODESET);
		int size = list.getLength();
		for (int i = 0; i < size; i++) {
			T applied = fun.apply(list.item(i));
			if (applied != null)
				result.add(applied);
		}
		return result;
	}

	public void eWalk(XPathExpression xexpr, Node node, Predicate<Node> fun)
			throws Exception {
		if (node == null)
			return;
		NodeList list = (NodeList) xexpr.evaluate(node, XPathConstants.NODESET);
		int size = list.getLength();
		for (int i = 0; i < size; i++) {
			fun.apply(list.item(i));
		}
	}

	public Node eval(XPathExpression xexpr, Node node)
			throws XPathExpressionException {
		if (node == null)
			return null;
		return (Node) xexpr.evaluate(node, XPathConstants.NODE);
	}

	public String text(XPathExpression xexpr, Node node)
			throws XPathExpressionException {
		Node eval = eval(xexpr,node);
		return eval != null ? eval.getNodeValue() : null;
	}
	
	public boolean is(XPathExpression xexpr, Node node)
			throws XPathExpressionException {
		return eval(xexpr,node) != null;
	}

	public String attr(Node node, String name) {
		Node item = node.getAttributes().getNamedItem(name);
		return item == null ? null : item.getTextContent();
	}

	public XPathExpression xexpr(String expr) {
		try {
			return xpath.compile(expr);
		} catch (XPathExpressionException e) {
			throw new RuntimeException(e);
		}
	}
}
