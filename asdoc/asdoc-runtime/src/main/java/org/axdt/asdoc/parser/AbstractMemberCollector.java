/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.xpath.XPathExpression;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocConstructor;
import org.axdt.asdoc.model.AsdocExecutable;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.access.IDefinitionProvider;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public abstract class AbstractMemberCollector<T extends AvmDefinition> extends AbstractCollector {

	protected static final List<String> expectedMemberHeaderClasses = Lists.newArrayList(
		"detailHeaderName","detailHeaderType");
	// for some reason some docs use upper first, so ignore case
	protected static final List<String> expectedMemberTypes = Lists.newArrayList(
		"method","function","property","constant","constructor"); 
	protected static final List<String> acceptedDocNodes = Lists.newArrayList(
		"b","code","div","ol","p","pre","span","table","ul");
	protected static final List<String> acceptedDocTableClasses = Lists.newArrayList(
		"innertable","+ topic/table adobe-d/adobetable");
	protected XPathExpression findDetailBody;
	protected XPathExpression findDetailType;
	protected XPathExpression findDetailSpan;
	protected List<String> noneVisibilityMods = Lists.newArrayList("AS3", "static", "override", "final");
	
	public AbstractMemberCollector() {
		super();
		findDetailBody = compileXPath("./html:div[@class='detailBody']");
		findDetailType = compileXPath(".//html:td");
		findDetailSpan = compileXPath(".//html:span[0][@class='label']");
	}
	protected boolean isDiv(Node node) {
		return "div".equals(node.getNodeName());
	}
	protected boolean isTable(Node node) {
		return "table".equals(node.getNodeName());
	}
	protected boolean isText(Node node) {
		return node.getNodeType() == Node.TEXT_NODE;
	}
	protected boolean emptyText(Node node) {
		return getText(node).length() == 0;
	}
	protected String getText(Node node) {
		return node.getTextContent().trim();
	}
	protected boolean isBr(Node node) {
		return "br".equals(node.getNodeName());
	}
	protected boolean isP(Node node) {
		return "p".equals(node.getNodeName());
	}
	protected boolean isCode(Node node) {
		return "code".equals(node.getNodeName());
	}
	protected boolean isSpan(Node node) {
		return "span".equals(node.getNodeName());
	}
	protected boolean isUnreal(Node node) {
		return isText(node) || isBr(node) || emptyText(node);
	}
	protected Node nextReal(Node node) {
		return getReal(node.getNextSibling());
	}
	protected Node getReal(Node node) {
		while (node != null && isUnreal(node))
			node = node.getNextSibling();
		return node;
	}
	protected AsdocMember parseMember(T result, Node detail) throws Exception {
		List<String> memberHeader = parseMemberType(detail);
		if (memberHeader.size()<2) {
			getLogger().debug("member '"+result.getCanonicalName()+"' has unexpected header. probably example");
			return null;
		}
		String memberType = memberHeader.get(1);
		if (memberType == null || !expectedMemberTypes.contains(memberType.toLowerCase())) {
			if ("event".equals(memberType.toLowerCase())) {
				// TODO add events to meta model
			} else {
				getLogger().error("member '"+result.getCanonicalName()+"' has unexpected type '"+memberType+"'");
			}
			return null;
		}
		Node child = getReal(detail.getFirstChild());
		// child contains declaration string
		String childCode = getText(child);
		AsdocMember member = createMember(result,memberHeader,childCode, child);
		if (member == null) {
			getLogger().info("member '"+result.getCanonicalName()+"' could not be created");
			return null;
		}
		getLogger().info("found member "+ childCode);
		child = nextReal(child);
		if (child == null) return member;
		boolean isAccessor = isText(child);
		// ignore accessor info 
		if (isAccessor)	child = nextReal(child);
		// ignore deprecated div
		if (isDiv(child)) child = nextReal(child);
		// TODO tables with info about flash player version and the sort
		while (child != null && isTable(child)) {
			child = nextReal(child);
		}
		// ignore all empty text nodes, breaks and paragraphs
		while (child != null && (isText(child) || isBr(child) || isP(child)&&emptyText(child))) {
			child = nextReal(child);
		}
		while (child != null && isDocNode(child)) {
			// clean up doc and add to member
			StringBuilder asdoc = new StringBuilder();
			do {
				asdoc.append(getText(child)+"\n");
				child = getReal(child.getNextSibling());
			} while (child != null && child.getNodeType() == Node.TEXT_NODE);
			member.setAsdoc(asdoc.toString().trim());
			getLogger().info("found asdoc: "+ member.getAsdoc());
		}
		// we might be at the end
		if (child == null) return member;
		// or some info spans follow
		if (member instanceof AsdocProperty) {
			AsdocProperty prop = (AsdocProperty) member;
			// we are looking for an implementation span
			List<String> codes = Lists.newArrayList();
			while (child != null) {
				if (isSpan(child) && "label".equals(attribute(child, "class"))
					&& "Implementation".equals(getText(child))) {
					child = nextReal(child);
					while (child != null) {
						if (!isBr(child)) {
							if (isCode(child)) {
								codes.add(getText(child));
							} else break;
						}
						child = nextReal(child);
					}
					break;
				}
				child = nextReal(child);
			}
			if (!codes.isEmpty()) {
				for (String code:codes) {
					String[] parts = code.split(" function ",2);
					if (parts.length < 2) continue;
					AvmVisibility visibility = getVisibility(prop, parts[0]);
					if (parts[0].contains("static"))
						prop.setStatic(true);
					if (visibility != null && (prop.getVisibility()==null
						|| prop.getVisibility().getValue() < visibility.getValue())) {
						prop.setVisibility(visibility);
					}
					if (parts[1].startsWith("get ")) {
						prop.setWriteonly(false);
						if (codes.size()==1)
							prop.setReadonly(true);
					} else {
						if (codes.size()==1)
							prop.setWriteonly(true);
						prop.setReadonly(false);
					}
				}
			}
		}
		return member;
	}
	protected boolean isDocNode(Node node) throws Exception {
		return acceptedDocNodes.contains(node.getNodeName())
			&& !(isSpan(node) && node.hasAttributes())
			&& !(isP(node) && node.hasChildNodes() && eval(findDetailSpan, node) != null)
			&& !(isTable(node) || acceptedDocTableClasses.contains(attribute(node, "class")));
	}
	protected void checkMemberMods(AsdocMember result, String mods) {
		AvmVisibility visibility = AvmVisibility.INTERNAL;
		for (String mod:mods.split("\\W+")) {
			if (mod.length() == 0) continue;
			if ("static".equals(mod)) {
				result.setStatic(true);
			} else if ("final".equals(mod)) {
				// TODO set final
			} else if ("override".equals(mod)) {
				// TODO set override
			} else {
				visibility = getVisibility(result, mod);
			}
		}
		result.setVisibility(visibility);
	}
	protected AvmVisibility getVisibility(AsdocMember target, String mods) {
		AvmVisibility result = null;
		for (String mod:mods.split("\\W+")) {
			if (mod.length() == 0) continue;
			if ("public".equals(mod)) {
				result = AvmVisibility.PUBLIC;
			} else if ("protected".equals(mod)) {
				result = AvmVisibility.PROTECTED;
			} else if ("private".equals(mod)) {
				result = AvmVisibility.PRIVATE;
			} else if (noneVisibilityMods.contains(mod)) {
				// ignore or handled outside 
			} else {
				getLogger().error("member '"+target.getCanonicalName()+"' has unknown mod: "+ mod);
			}
		}
		return result;
	}
	protected List<String> parseMemberType(Node detail) throws Exception {
		Node header = detail.getPreviousSibling();
		while (isText(header) || isBr(header)) 
			header = header.getPreviousSibling();
		if (isDiv(header)) {
			getLogger().info("found example "+ header.getTextContent());
			return Lists.newArrayList("Example");
		}
		List<String> result = eIter(findDetailType, header, new Function<Node, String>() {
			public String apply(Node from) {
				if (from == null || from.getTextContent() == null) return null;
				String attr = attribute(from, "class");
				return expectedMemberHeaderClasses.contains(attr) ? from.getTextContent().trim() : null;
			}
		});
		if (result == null || result.size() < 2  || result.size() > 3)
			getLogger().error("type member header is expected to have 2 or 3 elements");
		return result;
	}
	protected AsdocMember createMember(T parent, List<String> memberHeader, String code, Node child) {
		String type = memberHeader.get(1);
		if ("constant".equals(type.toLowerCase()))
			return createField(parent, memberHeader, code, child, true);
		if ("property".equals(type))
			return createField(parent, memberHeader, code, child, false);
		return createFunction(parent, memberHeader, code, child);
	}
	protected AsdocExecutable createFunction(T parent, List<String> memberHeader,
			String code, Node child) {
		String name = memberHeader.get(0);
		name = name.replaceAll("\\W+", "");
		AsdocExecutable result;
		AsdocConstructor constr = null;
		AsdocOperation opr = null;
		if (parent instanceof AvmDeclaredType && name.equals(parent.getName())) {
			result = constr = asFactory.createAsdocConstructor();
		} else {
			result = opr = asFactory.createAsdocOperation();
		}
		result.setName(name);
		String nameFound = null;
		String[] split = code.split("function",2);
		if (split == null || split.length < 2) {
			getLogger().error("operation '"+name+"' in '"+parent.getCanonicalName()+"' has unexpected function code '"+code+"'");
			return null;
		}
		checkMemberMods(result, split[0].trim());
		String decl = split[1].trim();
		int lastParen = decl.lastIndexOf(")");
		if (constr != null) {
			nameFound = decl;
		} else {
			int last = decl.lastIndexOf(":");
			if (last > 0 && last > lastParen) {
				String resultType = decl.substring(last+1).trim();
				String resultName = findLink(parent, resultType, child);
				opr.setReturnType(getTypeRef(resultName));
				nameFound = decl.substring(0,last).trim();
			} else {
				getLogger().error("operation '"+name+"' in '"+parent.getCanonicalName()+"' shoud have a return type");
				nameFound = decl;
			}
		}
		// check for parameters
		if (lastParen > 0) {
			nameFound = nameFound.substring(0,nameFound.indexOf("("));
		}
		if (!name.equals(nameFound))
			getLogger().error("operation name '"+name+"' in '"+parent.getCanonicalName()+"' does not match '"+nameFound+"'");
		return result;
	}
	protected String findLink(T parent, String simpleName, Node child) {
		NodeList list = child.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (!"a".equals(node.getLocalName())) continue;
			String nodeText = node.getTextContent();
			if (simpleName.equals(nodeText))
				return parseTypeName(attribute(node, "href"), getPackageName(parent));
			else
				nodeText.toString();
		}
		return simpleName;
	}
	protected String getPackageName(EObject parent) {
		for (;parent != null; parent = parent.eContainer())
			if (parent instanceof AvmPackage)
				return ((AvmPackage) parent).getCanonicalName();
		return null;
	}
	protected AsdocField createField(T parent, List<String> memberHeader,
			String code, Node child, boolean constant) {
		String keyword = constant ? "const" : "var";
		String name = memberHeader.get(0);
		name = name.replaceAll("\\W+", "");
		String decl, foundName;
		AsdocField result;
		if (!code.contains(keyword+" ")) {
			// is property with getter and/or setter
			result = asFactory.createAsdocProperty();
			decl = code;
		} else {
			result = asFactory.createAsdocField();
			result.setConstant(constant);
			String[] split = code.split(keyword,2);
			checkMemberMods(result, split[0].trim());
			decl = split[1].trim();
		}
		result.setName(name);
		if (decl.contains("=")) {
			String[] split = decl.split("=",2);
			decl = split[0].trim();
			// String init = split[1].trim();
		}
		int last = decl.lastIndexOf(":");
		if (last < 0) {
			foundName = decl;
		} else {
			int first = decl.indexOf(":");
			if (first != last)
				last = first;
			String resultType = decl.substring(last+1).trim();
			String resultName = findLink(parent,resultType,child);
			result.setType(getTypeRef(resultName));
			foundName = decl.substring(0,last).trim(); 
		}
		// ignore global constant -Infinity, we use an unary expression 
		if (foundName.charAt(0)=='-')
			return null;
		if (!name.equals(foundName))
			getLogger().error("member name does not match '"+name+"' '"+foundName+"'");
		return result;
	}
	public URI getProxyURI(String name) {
		if (name == null || "*".equals(name) || "void".equals(name))
			return null;
		name = name.trim();
		if (name.length()==0) return null;
		if (name.lastIndexOf(']')!=0)
			name = name.replaceFirst("\\.<[^>]*>", "");
		// check if we already got a qualified name
		if (name.contains(":") && !name.contains("::"))
			name = name.replaceFirst(":", "::");
		boolean isQualified = name.contains("::");
		String partition = ":"+ (isQualified ? "/types/" : "/lookup/");
		String uri = IDefinitionProvider.PROTOCOL + partition + name;
		return URI.createURI(uri);
	}
	public AvmTypeReference getTypeRef(String name) {
		if ("*".equals(name))
			return AvmEFactory.eINSTANCE.createAvmGenericReference();
		if ("void".equals(name))
			return AvmEFactory.eINSTANCE.createAvmVoidReference();
		AvmDeclaredTypeReference ref = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
		AvmType type = getTypeProxy(getProxyURI(name));
		ref.setType(type);
		return ref;
	}
	public AvmType getTypeProxy(URI uri) {
		AvmDeclaredType proxy = asFactory.createAsdocClass();
		((InternalEObject) proxy).eSetProxyURI(uri);
		return proxy;
	}
	protected abstract Logger getLogger();
	

	public String parseTypeName(String rawLinkOrName, String qualifier) {
		if (rawLinkOrName == null) return null;
		rawLinkOrName = rawLinkOrName.trim();
		if (rawLinkOrName.length()==0) return null;
		if (rawLinkOrName.endsWith(".html")) {
			// if simple the target is in the same package
			if (!rawLinkOrName.contains("/"))
				return (qualifier == null || qualifier.length() < 1 ? "" :qualifier+"::")
						+ rawLinkOrName.replace(".html", "");
			// if relative calculate with current package
			if (qualifier != null && rawLinkOrName.contains("..")) {
				Matcher matcher = Pattern.compile("^((?:[.]{2}/)+)(?:((?:[^/]+/)*[^/]+)/)?([^.]+)\\.html$").matcher(rawLinkOrName);
				if (matcher.matches()) {
					int parentLevel = matcher.group(1).length()/3;
					String[] split = qualifier.split("\\.");
					String subQuali = matcher.group(2);
					if (split.length == parentLevel && subQuali == null || subQuali.length() == 0)
						return matcher.group(3);
					if (split.length >= parentLevel) {
						String result = "";
						for (int i = 0; i < split.length - parentLevel; i++)
							result += i == 0 ? split[i] : "." + split[i];
						if (subQuali != null)
							result += (result.length() > 0 ? "." : "") + subQuali.replace('/', '.');
						return result+"::"+matcher.group(3);
					}
				}
				// else fall back to unqualified name
			}
			// if absolute we use an unqualified type name
			return rawLinkOrName.replaceAll("^(?:.*/)?([^.]+)\\.html$", "$1").replace('/', '.');
		}
		int lastDot = rawLinkOrName.lastIndexOf('.');
		return lastDot < 0 ? rawLinkOrName
				: rawLinkOrName.replaceFirst("^(?:([^.]+(?:[.][^.]+)*)[.])?([^.]+)$", "$1::$2");
	}
}
