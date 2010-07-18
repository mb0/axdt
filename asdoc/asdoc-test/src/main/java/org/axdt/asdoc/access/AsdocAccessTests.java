package org.axdt.asdoc.access;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AsdocAccessTests extends TestSuite {
	public AsdocAccessTests(String name) {
		super(name);
	}
	public static Test suite() {
		TestSuite suite = new AsdocAccessTests("access Tests");
		suite.addTestSuite(AsdocDefinitionProviderTest.class);
		return suite;
	}
}
