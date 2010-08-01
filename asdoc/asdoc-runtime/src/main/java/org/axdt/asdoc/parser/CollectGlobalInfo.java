/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.avm.model.AvmMember;
import org.w3c.dom.Node;

import com.google.common.base.Function;

public class CollectGlobalInfo extends AbstractMemberCollector<AsdocPackage> {

	private static Logger logger = Logger.getLogger(CollectPackageList.class);

	public CollectGlobalInfo() {
		super();
	}

	public void collectAllGlobalInfo(AsdocPackage pack) throws Exception {
		if (pack.isGlobalContentAvailable())
			collectGlobalInfo(pack);
		for (AsdocPackage child:pack.getPackages())
			collectAllGlobalInfo(child);
	}
	public void collectGlobalInfo(final AsdocPackage pack) throws Exception {
		String uri = pack.getFullUri()+AsdocUris.PACKAGE;
		logger.info("loading: "+ uri);
		try {
			Node node = load(uri);
			Node found = eval(findMain, node);
			if (found == null)
				found = eval(findFlex4Main, node);
			eIter(findDetailBody, found, new Function<Node, AvmMember>() {
				public AvmMember apply(Node from) {
					if (!from.hasChildNodes()) return null;
					try {
						AsdocMember member = parseMember(pack,from);
						if (member != null) {
							member.getName();
							pack.getMembers().add(member);
						}
						return member;
					} catch (Exception e) {
						logger.error("error parsing type", e);
						return null;
					}
				}
			});
		} catch (FileNotFoundException e) {
			logger.info("file not found '"+uri.toString()+"'.");
		}
	}
	
	protected Logger getLogger() {
		return logger;
	}
}
