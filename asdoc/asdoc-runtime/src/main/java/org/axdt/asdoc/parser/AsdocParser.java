/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.model.ParseLevel;
import org.eclipse.emf.ecore.resource.Resource;

public abstract class AsdocParser {
	protected Logger logger = Logger.getLogger(getClass());
	
	public AsdocRoot parseDoc(AsdocRoot root, ParseLevel level) throws Exception {
		boolean modified = false;
		if (ParseLevel.PACKAGE_VALUE <= level.getValue()
				&& !root.isPackageContentParsed()) {
			logger.info("Parsing package list");
			modified = parsePackageLevel(root) || modified;
		}
		if (ParseLevel.TYPE_VALUE <= level.getValue()
				&& !root.isTypeContentParsed()) {
			logger.info("Parsing type list");
			modified = parseTypeLevel(root) || modified;
		}
		if (ParseLevel.GLOBAL_VALUE <= level.getValue()
				&& root.isGlobalContentAvailable()
				&& !root.isGlobalContentParsed()) {
			logger.info("Parsing type list");
			modified = parseGlobalLevel(root) || modified;
		}
		if (ParseLevel.MEMBER_VALUE <= level.getValue() 
				&& !root.isMemberContentParsed()) {
			logger.info("Parsing type members");
			modified = parseMemberLevel(root) || modified;
		}
		if (modified) {
			Resource eResource = root.eResource();
			if (eResource != null) eResource.setModified(true);
		}
		return root;
	}

	public abstract boolean parsePackageLevel(AsdocRoot root) throws Exception;

	public abstract boolean parseTypeLevel(AsdocRoot root) throws Exception;

	public abstract boolean parseGlobalLevel(AsdocRoot root) throws Exception;

	public abstract boolean parseMemberLevel(AsdocRoot root) throws Exception;

	public abstract boolean parseMemberLevel(AsdocType asdocType) throws Exception;
}
