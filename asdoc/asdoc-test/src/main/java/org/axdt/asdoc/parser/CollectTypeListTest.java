package org.axdt.asdoc.parser;

import java.util.List;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.model.AvmDeclaredElement;

import com.google.common.collect.Lists;

public class CollectTypeListTest extends AbstractCollectorTest {

	public void testClassList() throws Exception {
		CollectTypeList parser = new CollectTypeList();
		AsdocRoot root = createRoot();
		List<String> expectedMembers = Lists.newArrayList("Members","StaticMembers");
		List<String> expectedBar = Lists.newArrayList("IBar","IBar2","ISuperBar","Bar","SuperBar");
		AsdocPackage pack = root.createPackage("foo.members");
		assertClassList(expectedMembers,parser.collectTypes(pack, false));
		pack = root.createPackage("foo.bar");
		assertClassList(expectedBar, parser.collectTypes(pack, false));
		root = createRoot();
		pack = root.createPackage("foo.members");
		assertClassList(expectedMembers, parser.collectTypes(pack, true));
		pack = root.createPackage("foo.bar");
		assertClassList(expectedBar, parser.collectTypes(pack, true));
	}
	private void assertClassList(List<String> expected,
			List<AvmDeclaredElement> list) {
		int size = expected.size();
		assertEquals(size, list.size());
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), list.get(i).getName());
		}
	}
}
