/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.html;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.util.HtmlUrlHelper;
import org.w3c.dom.Node;

import com.google.common.base.Function;

public class CollectPackageList extends AbstractHtmlCollector {

	private Pattern pattern;
	
	public CollectPackageList() {
		super();
		pattern = Pattern.compile("^.*'(.*/" + HtmlUrlHelper.PACKAGE_DETAIL
				+ ")'.*$");
	}

	public List<AsdocPackage> collectPackages(AsdocRoot root, boolean summary)
			throws Exception {
		String uri = new HtmlUrlHelper().packages(root, summary);
		logger.info("loading: " + uri);
		Node node = xml.load(uri);
		if (summary)
			node = xml.eval(findMain, node);
		return xml.eIter(findLinks, node, new TransformLink2Package(root));
	}

	public String getFQN(String href) {
		if (href == null)
			return null;
		if (!href.endsWith(HtmlUrlHelper.PACKAGE_DETAIL)) {
			Matcher matcher = pattern.matcher(href);
			if (!matcher.matches()) {
				logger.debug("ignored link: " + href);
				return null;
			}
			href = matcher.group(1);
		}
		int lastSlash = href.lastIndexOf('/');
		return lastSlash < 0 ? ""
				: href.substring(0, lastSlash).replace('/', '.');
	}

	protected class TransformLink2Package implements
			Function<Node, AsdocPackage> {

		private final AsdocRoot root;

		public TransformLink2Package(AsdocRoot root) {
			this.root = root;
		}

		public AsdocPackage apply(Node link) {
			String href = xml.attr(link, "href");
			String fqn = getFQN(href);
			if (fqn != null) {
				AsdocPackage pack = root.createPackage(fqn);
				pack.setTypeContentAvailable(true);
				return pack;
			}
			return null;
		}
	}
}
