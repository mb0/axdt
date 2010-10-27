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
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.parser.AsdocParser;

public class AsdocDitaParser extends AsdocParser {

	protected CollectPackages packageCollector;
	protected CollectTypes typeCollector;

	public AsdocDitaParser() {
		super();
	}

	public boolean parsePackageLevel(AsdocRoot root) throws Exception {
		List<AsdocPackage> packages = collectPackages().collectPackages(root);
		root.setPackageContentParsed(true);
		return packages != null;
	}

	public boolean parseTypeLevel(AsdocRoot root) throws Exception {
		// boolean result = collectTypes().collectAllTypes(root);
		// root.setTypeContentParsed(true);
		// parse all details right away instead
		boolean result = collectTypes().collectAllDetails(root);
		root.setTypeContentParsed(true);
		root.setGlobalContentParsed(true);
		// root.setMemberContentParsed(true);
		return result;
	}

	public boolean parseGlobalLevel(AsdocRoot root) throws Exception {
		boolean result = collectTypes().collectAllGlobals(root);
		root.setGlobalContentParsed(true);
		return result;
	}

	public boolean parseMemberLevel(AsdocRoot root) throws Exception {
		boolean result = collectTypes().collectAllMembers(root);
		root.setMemberContentParsed(true);
		return result;
	}

	public boolean parseMemberLevel(AsdocType type) throws Exception {
		return collectTypes().collectMembers(type) != null;
	}

	public CollectPackages collectPackages() {
		if (packageCollector == null)
			packageCollector = new CollectPackages();
		return packageCollector;
	}

	public CollectTypes collectTypes() {
		if (typeCollector == null)
			typeCollector = new CollectTypes();
		return typeCollector;
	}
}
