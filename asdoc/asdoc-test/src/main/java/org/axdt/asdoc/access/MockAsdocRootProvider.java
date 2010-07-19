package org.axdt.asdoc.access;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.parser.AbstractCollectorTest;
import org.axdt.asdoc.parser.AsdocParser;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.collect.Lists;

public class MockAsdocRootProvider implements IDocRootProvider {
	
	private static MockAsdocRootProvider instance;
	
	public static MockAsdocRootProvider getInstance() throws Exception {
		if (instance == null)
			instance = new MockAsdocRootProvider();
		return instance;
	}
	
	private AsdocRoot asdocRoot;

	public MockAsdocRootProvider() throws Exception {
		String dataFolder = AbstractCollectorTest.getTestDocUri()+"simple";
		AsdocParser asdocParser = new AsdocParser();
		asdocRoot = AsdocEFactory.eINSTANCE.createAsdocRoot(dataFolder);
		asdocRoot = asdocParser.parseDoc(asdocRoot, ParseLevel.MEMBER);
	}
	
	public Iterable<AsdocRoot> getDocRoots(ResourceSet resourceSet) {
		return Lists.newArrayList(asdocRoot);
	}

	public Iterable<AsdocRoot> initializeAsdocs(Object[] docItems) {
		return Lists.newArrayList(asdocRoot);
	}

}
