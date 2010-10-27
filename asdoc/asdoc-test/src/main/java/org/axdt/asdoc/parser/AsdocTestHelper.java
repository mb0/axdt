/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseType;

public class AsdocTestHelper {
	public static String getTestDocUri(String basePart) {
		return "jar:"+getProjectRootUri(AsdocTestHelper.class)+basePart;
	}
	protected static String getProjectRootUri(Class<?> type) {
		String classUri = type.getResource(type.getSimpleName()+".class").toExternalForm();
		String toReplace = classUri.startsWith("bundleresource:")
			? type.getCanonicalName().replace('.', '/')+".*$"
			: "target/classes/.*$";
		return classUri.replaceFirst(toReplace, "");
	}
	public static AsdocRoot createAsdoc(String testDocUri) {
		AsdocRoot root = AsdocEFactory.eINSTANCE.createAsdocRoot(testDocUri);
		root.setParseType(ParseType.HTML);
		return root;
	}
}
