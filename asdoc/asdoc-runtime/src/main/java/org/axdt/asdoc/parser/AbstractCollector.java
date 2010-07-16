package org.axdt.asdoc.parser;

import java.util.Collections;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.axdt.asdoc.AsdocEFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public abstract class AbstractCollector {
	protected HtmlLoader loader;
	private XPath xpath;
	
	protected XPathExpression findMain;
	protected XPathExpression findLinks;
	protected XPathExpression findFlex4Main;

	protected AsdocEFactory asFactory = AsdocEFactory.eINSTANCE;
	
	public AbstractCollector() {
		findFlex4Main = compileXPath("//html:div[@class='maincontainer']//html:div[@class='content']");
		findMain = compileXPath("//html:div[@class='MainContent']");
		findLinks = compileXPath(".//html:a[@href]");
	}
	
	protected Node load(String uri) throws Exception {
		if (loader == null)
			loader = new HtmlLoader();
		return loader.load(uri);
	}
	protected XPathExpression compileXPath(String expr) {
		if (xpath == null) {
			MutableNamespaceContext nc = new MutableNamespaceContext();
			nc.setNamespace("html", "http://www.w3.org/1999/xhtml");
			xpath = XPathFactory.newInstance().newXPath();
			xpath.setNamespaceContext(nc);
		}
		try {
			return xpath.compile(expr);
		} catch (XPathExpressionException e) {
			throw new RuntimeException(e);
		}
	}
	protected static Node eval(XPathExpression xexpr, Node node) throws XPathExpressionException {
		if (node == null) return null;
		return (Node) xexpr.evaluate(node, XPathConstants.NODE);
	}
	public static String attribute(Node node, String name) {
		Node item = node.getAttributes().getNamedItem(name);
		return item == null ? null : item.getTextContent();
	}
	protected static <T> List<T> eIter(XPathExpression xexpr, Node node,
			Function<Node, ? extends T> fun) throws Exception {
		if (node == null) return Collections.emptyList();
		List<T> result = Lists.newArrayList();
		NodeList list = (NodeList) xexpr.evaluate(node, XPathConstants.NODESET);
		int size = list.getLength();
		for (int i = 0; i < size; i++) {
			T applied = fun.apply(list.item(i));
			if (applied != null)
				result.add(applied );
		}
		return result;
	}
	protected static List<Node> eIter(XPathExpression xexpr, Node node) throws Exception {
		List<Node> result = Lists.newArrayList();
		if (node == null) return result;
		NodeList list = (NodeList) xexpr.evaluate(node, XPathConstants.NODESET);
		int size = list.getLength();
		for (int i = 0; i < size; i++) {
			result.add(list.item(i));
		}
		return result;
	}
}
