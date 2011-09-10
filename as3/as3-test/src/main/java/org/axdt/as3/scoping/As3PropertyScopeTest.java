package org.axdt.as3.scoping;

import org.axdt.as3.As3StandaloneSetup;
import org.eclipse.xtext.junit.AbstractXtextTests;

public class As3PropertyScopeTest extends AbstractXtextTests {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(As3StandaloneSetup.class);
	}
}
