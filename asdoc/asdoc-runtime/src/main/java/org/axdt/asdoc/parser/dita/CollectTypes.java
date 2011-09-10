/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.dita;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.axdt.asdoc.model.AsdocClass;
import org.axdt.asdoc.model.AsdocConstructor;
import org.axdt.asdoc.model.AsdocDefinition;
import org.axdt.asdoc.model.AsdocElement;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.parser.AbstractCollector;
import org.axdt.asdoc.util.DitaUrlHelper;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.w3c.dom.Node;

import com.google.common.collect.Lists;

public class CollectTypes extends AbstractCollector {

	String typeDetailStr = "./apiClassifierDetail/apiClassifierDef";
	XPathExpression typeDetail = xml.xexpr(typeDetailStr);
	XPathExpression typeIsInt = xml.xexpr(typeDetailStr + "/apiInterface");
	XPathExpression typeIsDynamic = xml.xexpr(typeDetailStr + "/apiDynamic");
	XPathExpression typeExtendsDetail = xml.xexpr("./apiBaseClassifier/text()");
	XPathExpression typeImplementsDetail = xml
			.xexpr("./apiBaseInterface/text()");

	XPathExpression valDetail = xml.xexpr("./apiValueDetail/apiValueDef");
	XPathExpression valIsAccess = xml.xexpr("./apiValueAccess/@value");
	XPathExpression valIsProp = xml.xexpr("./apiProperty");
	XPathExpression valType = xml.xexpr("./apiType/@value|./apiValueClassifier/text()");

	XPathExpression opDetail = xml
			.xexpr("./apiOperationDetail/apiOperationDef");

	XPathExpression nameExpr = xml.xexpr("./apiName/text()");
	XPathExpression accessExpr = xml.xexpr("./apiAccess/@value");
	XPathExpression staticExpr = xml.xexpr("./apiStatic");
	XPathExpression opReturn = xml.xexpr("./apiReturn/apiType/@value|./apiReturn/apiOperationClassifier/text()");

	static final String nameType = "apiClassifier";
	static final String nameValue = "apiValue";
	static final String nameOperation = "apiOperation";
	static final String nameConstructor = "apiConstructor";

	public CollectTypes() {
		super();
	}

	public boolean collectAllDetails(AsdocPackage pack) throws Exception {
		boolean result = false;
		if (pack.isTypeContentAvailable()||pack.isGlobalContentAvailable()) {
			if (null != collectDetails(pack))
				result = true;
		}
		for (AsdocPackage child : pack.getPackages())
			if (collectAllDetails(child))
				result = true;
		return result;
	}
	
	public Node load(AsdocPackage pack) throws Exception {
		String uri = pack.getRoot().getBaseUri() + new DitaUrlHelper().packageUrl(pack);
		logger.info("loading : " + uri);
		return xml.load(uri);
	}

	public List<? extends AsdocDefinition> collectDetails(AsdocPackage pack) {
		try {
			Node node = load(pack).getFirstChild();
			List<AsdocType> types = Lists.newArrayList();
			List<AsdocMember> members = Lists.newArrayList();
			// simple for loop is much faster
			for(Node child=node.getFirstChild();
		    	child!=null; child=child.getNextSibling()) {
				String name = child.getNodeName();
				if (name.equals(nameType)) {
					node2Type(child, types, false);
				} else {
					node2Member(child, members);
				}
			}
			if (!members.isEmpty()) {
				pack.setGlobalContentAvailable(true);
				Collections.sort(members, this);
				pack.getMembers().addAll(members);
				if (types.isEmpty())
					return members;
				else {
					Collections.sort(types, this);
					pack.getTypes().addAll(types);
					List<AsdocDefinition> result = Lists.newArrayList();
					result.addAll(types);
					result.addAll(members);
					return result;
				}
			}
			if (types.isEmpty())
				return null;
			Collections.sort(types, this);
			pack.getTypes().addAll(types);
			return types;
		} catch (FileNotFoundException e) {
			if (pack.getRoot() != pack)
				logger.info("missing package file", e);
		} catch (Exception e) {
			logger.error("details", e);
		}
		return null;
	}

	public boolean collectAllTypes(AsdocPackage pack) throws Exception {
		boolean result = false;
		if (pack.isTypeContentAvailable()) {
			if (null != collectTypes(pack))
				result = true;
		}
		for (AsdocPackage child : pack.getPackages())
			if (collectAllTypes(child))
				result = true;
		return result;
	}

	public List<AsdocType> collectTypes(AsdocPackage pack) throws Exception {
		try {
			Node node = load(pack).getFirstChild();
			boolean hasGlobals = false;
			List<AsdocType> types = Lists.newArrayList();
			for(Node child=node.getFirstChild();
		    	child!=null; child=child.getNextSibling()) {
				String name = child.getNodeName();
				if (name.equals(nameType)) {
					node2Type(child, types, false);
				} else if (name.equals(nameValue)||name.equals(nameOperation)) {
					hasGlobals = true;
				}
			}
			if (hasGlobals)
				pack.setGlobalContentAvailable(true);
			if (types.isEmpty())
				return null;
			Collections.sort(types, this);
			pack.getTypes().addAll(types);
			return types;
		} catch (Exception e) {
			logger.error(e);
		}
		return null;
	}

	public boolean collectAllGlobals(AsdocPackage pack) throws Exception {
		boolean result = false;
		if (pack.isGlobalContentAvailable()) {
			if (null != collectGlobals(pack))
				result = true;
		}
		for (AsdocPackage child : pack.getPackages())
			if (collectAllGlobals(child))
				result = true;
		return result;
	}

	public List<AsdocMember> collectGlobals(AsdocPackage pack) {
		try {
			Node node = load(pack).getFirstChild();
			List<AsdocMember> members = Lists.newArrayList();
			for(Node child=node.getFirstChild();
		    	child!=null; child=child.getNextSibling()) {
				node2Member(child, members);
			}
			if (!members.isEmpty()) {
				pack.setGlobalContentAvailable(true);
				Collections.sort(members, this);
				pack.getMembers().addAll(members);
				return members;
			}
		} catch (Exception e) {
			logger.error(e);
		}
		return null;
	}
	
	public boolean collectAllMembers(AsdocPackage pack) {
		boolean result = false;
		if (pack.isTypeContentAvailable()) {
			if (collectPackageMembers(pack))
				result = true;
			pack.setMemberContentParsed(true);
		}
		for (AsdocPackage child : pack.getPackages())
			if (collectAllMembers(child))
				result = true;
		return result;
	}
	public boolean collectPackageMembers(AsdocPackage pack) {
		try {
			Node node = load(pack).getFirstChild();
			List<AsdocType> types = pack.getTypes();
			for(Node child=node.getFirstChild();
		    	child!=null; child=child.getNextSibling()) {
				if (nameType.equals(child.getNodeName()))
					node2Detail(child, types);
			}
			if (pack.eResource() != null)
				pack.eResource().setModified(true);
			return true;
		} catch (Exception e) {
			logger.error("allMembers", e);
		}
		return false;
	}

	public AsdocType collectMembers(AsdocType type) throws Exception {
		if (type.eContainer() instanceof AsdocPackage)
			return collectMembers((AsdocPackage) type.eContainer(), type);
		throw new Exception(type.getCanonicalName() + "has no package info");
	}

	public AsdocType collectMembers(AsdocPackage pack, AsdocType type)
			throws Exception {
		try {
			Node node = load(pack).getFirstChild();
			XPathExpression findTypeExpr = xml
					.xexpr("./apiClassifier[./apiName/text()='"
							+ type.getName() + "']");
			Node typeNode = xml.eval(findTypeExpr, node);
			parseType(type, typeNode);
			if (pack.eResource() != null)
				pack.eResource().setModified(true);
			return type;
		} catch (Exception e) {
			logger.error("members",e);
		}
		return null;
	}

	public AsdocType parseType(AsdocType type, Node node)
			throws Exception {
		Node detail = xml.eval(typeDetail, node);
		AvmTypeReference typeRef;
		if (type.isClass()) {
			typeRef = getTypeRef(xml.text(typeExtendsDetail, detail));
			if (typeRef != null)
				((AsdocClass) type).setExtendedClass(typeRef);
			for (Node in : xml.eIter(typeImplementsDetail, detail))
				type.getExtendedInterfaces().add(getTypeRef(in.getNodeValue()));
		} else {
			typeRef = getTypeRef(xml.text(typeImplementsDetail, detail));
			if (typeRef != null)
				type.getExtendedInterfaces().add(typeRef);
		}
		parseTypeMembers(type, node);
		type.setMemberContentParsed(true);
		return type;
	}

	public List<AsdocMember> parseTypeMembers(final AsdocType type, Node node)
			throws Exception {
		List<AsdocMember> members = Lists.newArrayList();
		for(Node child=node.getFirstChild();
	    	child!=null; child=child.getNextSibling()) {
			node2Member(child, members);
		}
		if (!members.isEmpty()) {
			Collections.sort(members, this);
			type.getMembers().addAll(members);
			return members;
		}
		return null;
	}

	public AvmTypeReference getTypeRef(String name) {
		if (name == null)
			return null;
		if ("".endsWith(name) || "*".equals(name))
			return AvmEFactory.eINSTANCE.createAvmGenericReference();
		if ("void".equals(name))
			return AvmEFactory.eINSTANCE.createAvmVoidReference();
		AvmDeclaredTypeReference ref = AvmEFactory.eINSTANCE
				.createAvmDeclaredTypeReference();
		AvmType type = getTypeProxy(getProxyURI(name));
		ref.setType(type);
		return ref;
	}

	public AvmType getTypeProxy(URI uri) {
		AvmDeclaredType proxy = asFactory.createAsdocClass();
		((InternalEObject) proxy).eSetProxyURI(uri);
		return proxy;
	}

	protected AsdocMember parseMember(Node node)
			throws XPathExpressionException {
		String name = node.getNodeName();
		if (nameValue.equals(name))
			return parseValue(node);
		if (nameOperation.equals(name))
			return parseOperation(node);
		if (nameConstructor.equals(name))
			return parseConstructor(node);
		return null;
	}

	protected AsdocMember parseValue(Node node)
			throws XPathExpressionException {
		AsdocField result = null;
		Node detail = xml.eval(valDetail, node);
		String accessType = xml.text(valIsAccess, detail);
		if (accessType != null) {
			AsdocProperty property = asFactory.createAsdocProperty();
			if ("read".equals(accessType))
				property.setReadonly(true);
			else if ("write".equals(accessType))
				property.setWriteonly(true);
			result = property;
		} else {
			result = asFactory.createAsdocField();
			result.setConstant(!xml.is(valIsProp, detail));
		}
		String name = parseBasic(node, result);
		if (name == null || name.length() < 1 || name.charAt(0) == '-')
			return null;
		result.setName(name);
		result.setType(getTypeRef(xml.text(valType, detail)));
		result.setVisibility(getVisibility(xml.text(accessExpr, detail)));
		result.setStatic(xml.is(staticExpr, detail));
		return result;
	}

	protected AvmVisibility getVisibility(String access) {
		AvmVisibility result = null;
		if ("public".equals(access)) {
			result = AvmVisibility.PUBLIC;
		} else if ("protected".equals(access)) {
			result = AvmVisibility.PROTECTED;
		} else if ("private".equals(access)) {
			result = AvmVisibility.PRIVATE;
		}
		return result;
	}

	protected AsdocMember parseOperation(Node node)
			throws XPathExpressionException {
		AsdocOperation result = asFactory.createAsdocOperation();
		result.setName(parseBasic(node, result));
		Node detail = xml.eval(opDetail, node);
		result.setReturnType(getTypeRef(xml.text(opReturn, detail)));
		result.setVisibility(getVisibility(xml.text(accessExpr, detail)));
		result.setStatic(xml.is(staticExpr, detail));
		return result;
	}

	
	protected AsdocMember parseConstructor(Node node)
			throws XPathExpressionException {
		AsdocConstructor result = asFactory.createAsdocConstructor();
		result.setName(parseBasic(node, result));
		return result;
	}
	
	protected String parseBasic(Node node, AsdocElement elem) {
		String name = null;
		for(Node child=node.getFirstChild();
	    	child!=null; child=child.getNextSibling()) {
			if (!child.hasChildNodes()) continue;
			String nodeName = child.getNodeName();
			if ("shortdesc".equals(nodeName)) {
				String result = child.getFirstChild().getNodeValue();
				if (result != null)
					elem.setAsdoc(result.trim());
			} else if ("apiName".equals(nodeName)) {
				name = child.getFirstChild().getNodeValue();
			}
		}
		return name;
	}
	
	protected void node2Member(Node node, List<AsdocMember> result) {
		try {
			AsdocMember member = parseMember(node);
			if (member != null)
				result.add(member);
		} catch (XPathExpressionException e) {
			logger.error("node2Member", e);
		}
	}
	
	protected AsdocType node2Type(Node node, List<AsdocType> result, boolean parseDetails) {
		try {
			AsdocType type;
			if (xml.is(typeIsInt, node)) {
				type = asFactory.createAsdocInterface();
			} else {
				AsdocClass clss = asFactory.createAsdocClass();
				clss.setDynamic(xml.is(typeIsDynamic, node));
				type = clss;
			}
			String name = xml.attr(node, "id");
			int index = name.lastIndexOf(':');
			if (index > -1)
				name = name.substring(index + 1);
			type.setName(parseBasic(node, type));
			
			if (parseDetails)
				parseType(type, node);
			result.add(type);
			return type;
		} catch (Exception e) {
			logger.error("collect type", e);
		}
		return null;
	}
	protected boolean node2Detail(Node node, List<AsdocType> types) {
		try {
			String name = xml.attr(node, "id");
			int index = name.lastIndexOf(':');
			if (index > -1)
				name = name.substring(index + 1);
			for (AsdocType type:types) {
				if (name.equals(type.getName())) {
					if (!type.isMemberContentParsed())
						parseType(type, node);
					return true;
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
		return false;
	}
}
