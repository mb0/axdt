package org.axdt.asdoc.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AsdocParserTests extends TestSuite {
	public AsdocParserTests(String name) {
		super(name);
	}
	public static Test suite() {
		TestSuite suite = new AsdocParserTests("parser Tests");
		suite.addTestSuite(CollectPackageListTest.class);
		suite.addTestSuite(CollectTypeListTest.class);
		suite.addTestSuite(CollectGlobalInfoTest.class);
		suite.addTestSuite(CollectTypeInfoTest.class);
		suite.addTestSuite(AsdocParserTest.class);
		return suite;
	}
}
