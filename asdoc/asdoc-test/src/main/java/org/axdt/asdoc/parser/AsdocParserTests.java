/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.axdt.asdoc.parser.dita.AsdocDitaParserTest;
import org.axdt.asdoc.parser.html.AsdocHtmlParserTest;

public class AsdocParserTests extends TestSuite {
	public AsdocParserTests(String name) {
		super(name);
	}
	public static Test suite() {
		TestSuite suite = new AsdocParserTests("parser Tests");
		suite.addTestSuite(ParserLevelTest.class);
		suite.addTestSuite(AsdocHtmlParserTest.class);
		suite.addTestSuite(AsdocDitaParserTest.class);
		return suite;
	}
}
