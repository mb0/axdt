/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.html;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.util.HtmlUrlHelper;
import org.w3c.dom.Node;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public class CollectTypeList extends AbstractHtmlCollector {
	
	private static final List<String> ignored = Lists.newArrayList("", "appendixes", "conventions",
			"index", "package");
	public CollectTypeList() {
		super();
	}

	public void collectAllTypes(AsdocPackage pack, boolean detail) throws Exception {
		if (pack.isTypeContentAvailable())
			collectTypes(pack, detail);
		for (AsdocPackage child:pack.getPackages())
			collectAllTypes(child, detail);
	}
	
	public List<AsdocType> collectTypes(AsdocPackage pack, boolean detail) throws Exception {
		String uri = new HtmlUrlHelper().types(pack, detail);
		logger.info("loading : " + uri);
		try {
			Node node = xml.load(uri);
			if (detail) {
				Node found = xml.eval(findMain, node);
				if (found == null)
					found = xml.eval(findFlex4Main, node);
				node = found;
			}
			List<AsdocType> result = xml.eIter(findLinks, node, new TransformLink2Element(pack));
			Collections.sort(result, this);
			pack.getTypes().addAll(result);
			return result;
		} catch (FileNotFoundException e) {
			return Collections.emptyList();
		}
	}

	protected class TransformLink2Element implements
			Function<Node, AsdocType> {

		private final AsdocPackage pack;

		public TransformLink2Element(AsdocPackage pack) {
			this.pack = pack;
		}

		public AsdocType apply(Node link) {
			String href = xml.attr(link, "href");
			if (isMember(href)) {
				pack.setGlobalContentAvailable(true);
				return null;
			} else if (isType(href)) {
				return createType(link, href);
			}
			logger.debug("ignored link: " + href);
			return null;
		}

		boolean isMember(String href) {
			return href.startsWith(HtmlUrlHelper.PACKAGE + "#")
					&& !(href.endsWith("#methodSummary") || href
							.endsWith("#constantSummary"));
		}

		boolean isType(String href) {
			String typeName = href.split("\\.")[0].trim();
			return !(typeName == null || ignored.contains(typeName) || typeName
					.startsWith("javascript:") || typeName.contains("-"));
		}

		AsdocType createType(Node link, String href) {
			String name = href.split("\\.")[0].trim();
			AsdocType type = isInterface(link)
					? asFactory.createAsdocInterface()
					: asFactory.createAsdocClass();
			type.setName(name);
			return type;
		}

		boolean isInterface(Node link) {
			if ("i".equals(link.getParentNode().getNodeName())
					|| link.hasChildNodes()
					&& "i".equals(link.getFirstChild().getNodeName()))
				return true;
			return false;
		}
	}
}
