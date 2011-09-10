/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AsdocAccessTests extends TestSuite {
	public AsdocAccessTests(String name) {
		super(name);
	}
	public static Test suite() {
		TestSuite suite = new AsdocAccessTests("access Tests");
		suite.addTestSuite(AsdocResourceFactoryTest.class);
		return suite;
	}
}
