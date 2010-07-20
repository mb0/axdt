package org.axdt.asdoc.parser;

import java.util.List;

import javax.xml.xpath.XPathExpression;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocClass;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmMember;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.base.Function;

public class CollectTypeInfo extends AbstractMemberCollector<AvmDeclaredType> {

	private static Logger logger = Logger.getLogger(CollectTypeInfo.class);
	protected XPathExpression findTypeHeader;

	public CollectTypeInfo() {
		super();
		findTypeHeader = compileXPath(".//html:table[@class='classHeaderTable']//html:tr");
	}
	public void collectAllTypeInfo(AsdocPackage pack) throws Exception {
		collectTypeInfo(pack);
		for (AsdocPackage child:pack.getPackages())
			collectAllTypeInfo(child);
	}
	public void collectTypeInfo(AsdocPackage pack) throws Exception {
		for (AvmDeclaredType child:pack.getTypes()) {
			if (child instanceof AsdocType)
				collectType(pack, (AsdocType)child);
			else
				logger.error("expected AsdocType but is "+ child.getClass().getName());
		}
	}
	public AvmDeclaredType collectType(AsdocType type) throws Exception {
		if (type.eContainer() instanceof AsdocPackage)
			return collectType((AsdocPackage) type.eContainer(),type);
		throw new Exception(type.getCanonicalName() +"has no package info");
	}
	public AvmDeclaredType collectType(AsdocPackage pack, AsdocType type) throws Exception {
		String uri = pack.getFullUri()+type.getName()+".html";
		logger.info("loading member:"+uri);
		Node node = load(uri);
		List<Node> contents = eIter(findMain,node);
		if (contents.size()<2) {
			throw new Exception(type.getCanonicalName() +"has no content divs");
		}
		parseTypeHeader(type, contents.get(0));
		parseTypeMembers(type, contents.get(1));
		type.setMemberContentParsed(true);
		if (pack.eResource() != null)
			pack.eResource().setModified(true);
		return type;
	}

	protected void parseTypeHeader(AsdocType type, Node node) throws Exception {
		List<Node> headers = eIter(findTypeHeader,node);
		for (Node header:headers) {
			NodeList parts = header.getChildNodes();
			String detail = parts.item(0).getTextContent().trim();
			Node valueNode = parts.item(1);
			if ("Package".equals(detail)) {
				String packageFqn = valueNode.getTextContent().trim();
				if (type.getQualifier() != null && !packageFqn.equals(type.getQualifier()))
					logger.warn("package does not match types package "+packageFqn);
			} else if ("Class".equals(detail)) {
				String classDetail = valueNode.getTextContent().trim();
				for (String word:classDetail.split("\\W+")) {
					// all documented types are expected to be public
					if ("public".equals(word)) continue;
					if ("class".equals(word)) continue;
					if ("dynamic".equals(word))
						((AsdocClass)type).setDynamic(true);
					if (!classDetail.endsWith(word)){
						logger.info("found unknown class word: '"+word+"'");
					}else if (!word.equals(type.getName())) {
						logger.warn("found class name does not match: '"+word+"'");
					}
				}
				logger.info("found class: '"+classDetail+"'");
			} else if ("Inheritance".equals(detail)) {
				if (!(type instanceof AsdocClass))
					logger.warn("found inheritance but got no class");
				else parseInheritance((AsdocClass) type, valueNode);
			} else if ("Implements".equals(detail)) {
				parseImplements(type, valueNode);
			} else if ("Subclasses".equals(detail)) {
				// ignore
			} else if ("Implementors".equals(detail)) {
				// ignore
			} else if ("Interface".equals(detail)) {
				// XXX investigate meaning of this 
			} else {
				logger.warn("found unknown header: (" + detail +") "+valueNode.getTextContent());
			}
		}
	}
	protected void parseImplements(AsdocType type, Node valueNode) {
		String implementsDetail = valueNode.getTextContent().trim();
		logger.info("found implements: '"+implementsDetail+"'");
		NodeList nodes = valueNode.getChildNodes();
		String qualifier = type.getQualifier();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (isText(node)) {
				String text = getText(node);
				if (",".equals(text)) continue;
				String[] split = text.split("\\W*,\\W*");
				for (String qname:split) {
					qname = parseTypeName(qname, qualifier);
					if (qname == null) continue;
					logger.info("found text inheritance: '"+qname+"'");
					type.getExtendedInterfaces().add(getTypeRef(qname));
				}
			} else 
			if ("a".equals(node.getNodeName())) {
				String qname = parseTypeName(attribute(node, "href"), qualifier);
				if (qname == null) continue;
				logger.info("found link inheritance: '"+qname+"'");
				type.getExtendedInterfaces().add(getTypeRef(qname));
			}
		}
	}
	protected void parseInheritance(AsdocClass type, Node valueNode) {
		NodeList nodes = valueNode.getChildNodes();
		String qualifier = type.getQualifier();
		for (int i = 0; i < nodes.getLength(); i++) {
			// safely skip declared type 
			if (i == 0) continue;
			Node node = nodes.item(i);
			// ignore the arrow images
			String qname = null;
			String nodeName = node.getLocalName();
			if ("a".equals(nodeName)) {
				qname = parseTypeName(attribute(node, "href"), qualifier);
			} else if (isText(node)) {
				qname = parseTypeName(node.getTextContent(), qualifier);
			}
			if (qname != null) {
				logger.info("found inheritance: '"+qname+"'");
				type.setExtendedClass(getTypeRef(qname));
				// only add first supertype of the inheritance chain
				break;
			}
		}
	}

	protected List<AvmMember> parseTypeMembers(final AsdocType result, Node node) throws Exception {
		return eIter(findDetailBody,node, new Function<Node, AvmMember>() {
			public AvmMember apply(Node from) {
				if (!from.hasChildNodes()) return null;
				try {
					AsdocMember member = parseMember(result,from);
					if (member != null) {
						result.getMembers().add(member);
						return member;
					}
				} catch (Exception e) {
					logger.error("error parsing type", e);
				}
				return null;
			}
		});
	}
	protected Logger getLogger() {
		return logger;
	}
}
