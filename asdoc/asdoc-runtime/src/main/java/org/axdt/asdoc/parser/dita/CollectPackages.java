/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.dita;

import java.util.List;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.parser.AbstractCollector;
import org.axdt.asdoc.util.DitaUrlHelper;
import org.w3c.dom.Node;

import com.google.common.collect.Lists;

public class CollectPackages extends AbstractCollector {
	public CollectPackages() {
		super();
	}

	public List<AsdocPackage> collectPackages(AsdocRoot root) throws Exception {
		String uri = new DitaUrlHelper().packageList(root);
		logger.info("loading: " + uri);
		try {
			Node node = xml.load(uri).getFirstChild();
			List<AsdocPackage> result = Lists.newArrayList();
			traverse(node, root, result);
			return result.isEmpty() ? null : result;
		} catch (Exception e) {
			logger.error(e);
		}
		return null;
	}

	protected void traverse(Node node, AsdocRoot root, List<AsdocPackage> result) {
		if ("apiItemRef".equals(node.getNodeName())) {
			String fqn = linkToFqn(node.getAttributes().getNamedItem("href"));
			if (fqn != null) {
				AsdocPackage pack = root.createPackage(fqn);
				pack.setTypeContentAvailable(true);
				result.add(pack == root ? 0 : result.size(), pack);
			}
		}
		if (node.hasChildNodes()) {
			for(Node child=node.getFirstChild();
		    	child!=null; child=child.getNextSibling()) {
				traverse(child,root,result);
			}
		}
	}
	protected String linkToFqn(Node child) {
		String link = child.getNodeValue();
		int index = link.lastIndexOf(DitaUrlHelper.EXT);
		if (index < 0) return null;
		String fqn = link.substring(0, index);
		logger.debug("found " + fqn);
		if (DitaUrlHelper.GLOBAL.equals(fqn))
			return "";
		return fqn;
	}
}
