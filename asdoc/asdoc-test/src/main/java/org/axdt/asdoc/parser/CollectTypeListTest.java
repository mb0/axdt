package org.axdt.asdoc.parser;

import java.util.List;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.model.AvmDeclaredElement;

import com.google.common.collect.Lists;

public class CollectTypeListTest extends AbstractCollectorTest {
	public void testFlexClassList() throws Exception {
		CollectTypeList parser = new CollectTypeList();
		AsdocRoot root =  createRoot("flex4");
		List<String> expected = Lists.newArrayList("ArgumentError","arguments",
				"Array", "Boolean", "Class", "Date",
				"DefinitionError", "Error", "EvalError", "Function");
		List<AvmDeclaredElement> list = parser.collectTypes(root, false);
		assertClassListStart(expected, list);
		
		AsdocRoot root2 = createRoot("flex4");
		List<AvmDeclaredElement> list2 = parser.collectTypes(root2, true);
		assertClassListStart(expected, list2);
		
		int size = list.size();
		assertEquals(size, list.size());
		assertEquals(list.get(size-1).getName(), list2.get(size-1).getName());
	}
	public void testClassList() throws Exception {
		CollectTypeList parser = new CollectTypeList();
		AsdocRoot root = createRoot("simple");
		List<String> expectedMembers = Lists.newArrayList("Members","StaticMembers");
		List<String> expectedBar = Lists.newArrayList("IBar","IBar2","ISuperBar","Bar","SuperBar");
		AsdocPackage pack = root.createPackage("foo.members");
		assertClassList(expectedMembers,parser.collectTypes(pack, false));
		pack = root.createPackage("foo.bar");
		assertClassList(expectedBar, parser.collectTypes(pack, false));
		root = createRoot("simple");
		pack = root.createPackage("foo.members");
		assertClassList(expectedMembers, parser.collectTypes(pack, true));
		pack = root.createPackage("foo.bar");
		assertClassList(expectedBar, parser.collectTypes(pack, true));
	}
	private void assertClassList(List<String> expected,
			List<AvmDeclaredElement> list) {
		assertEquals(expected.size(), list.size());
		assertClassListStart(expected, list);
	}
	private void assertClassListStart(List<String> expected,
			List<AvmDeclaredElement> list) {
		int size = expected.size();
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), list.get(i).getName());
		}
	}
}
