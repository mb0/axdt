/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser.html;

import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.parser.AsdocParser;

public class AsdocHtmlParser extends AsdocParser {
	
	protected CollectPackageList collectPackageList;
	protected CollectTypeList collectTypeList;
	protected CollectTypeInfo collectTypeInfo;
	
	public boolean parsePackageLevel(AsdocRoot root) throws Exception {
		collectPackageList().collectPackages(root, false);
		root.setPackageContentParsed(true);
		return true;
	}
	public boolean parseTypeLevel(AsdocRoot root) throws Exception {
		collectTypeList().collectAllTypes(root, false);
		root.setTypeContentParsed(true);
		return true;
	}
	public boolean parseGlobalLevel(AsdocRoot root) throws Exception {
		collectTypeInfo().collectAllGlobalInfo(root);
		root.setGlobalContentParsed(true);
		return true;
	}
	public boolean parseMemberLevel(AsdocRoot root) throws Exception {
		collectTypeInfo().collectAllTypeInfo(root);
		root.setMemberContentParsed(true);
		return true;
	}
	public boolean parseMemberLevel(AsdocType type) throws Exception {
		return collectTypeInfo().collectType(type) != null;
	}
	protected CollectPackageList collectPackageList() {
		if (collectPackageList == null)
			collectPackageList = new CollectPackageList();
		return collectPackageList;
	}
	protected CollectTypeList collectTypeList() {
		if (collectTypeList == null)
			collectTypeList = new CollectTypeList();
		return collectTypeList;
	}
	protected CollectTypeInfo collectTypeInfo() {
		if (collectTypeInfo == null)
			collectTypeInfo = new CollectTypeInfo();
		return collectTypeInfo;
	}
}
