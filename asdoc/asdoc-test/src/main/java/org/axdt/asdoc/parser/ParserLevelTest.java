/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import junit.framework.TestCase;

import org.axdt.asdoc.model.ParseLevel;


public class ParserLevelTest extends TestCase {
	public ParserLevelTest() {
		super();
	}
	public void testParseLevel() throws Exception {
		assertEquals(ParseLevel.EMPTY_VALUE,0);
		assertTrue(ParseLevel.EMPTY_VALUE < ParseLevel.PACKAGE_VALUE);
		assertTrue(ParseLevel.PACKAGE_VALUE < ParseLevel.TYPE_VALUE);
		assertTrue(ParseLevel.TYPE_VALUE < ParseLevel.MEMBER_VALUE);
		assertTrue(ParseLevel.PACKAGE.getValue()<=ParseLevel.PACKAGE_VALUE);
		assertEquals(0, 0 & ParseLevel.PACKAGE_VALUE);
		assertEquals(ParseLevel.PACKAGE_VALUE, ParseLevel.PACKAGE_VALUE & ParseLevel.PACKAGE_VALUE);
	}
}
