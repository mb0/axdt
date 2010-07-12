package org.axdt.asdoc.parser;

import java.util.ArrayList;
import java.util.List;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;

import com.google.common.collect.Lists;

public class CollectPackageListTest extends AbstractCollectorTest {
	public void testParseList() throws Exception {
		CollectPackageList parser = new CollectPackageList();
		assertPackageList(parser.collectPackages(createRoot(), false));
		assertPackageList(parser.collectPackages(createRoot(), true));
	}
	public void testParseListPersist() throws Exception {
		CollectPackageList parser = new CollectPackageList();
		AsdocRoot root = createRoot();
		assertTrue(root.eContents().isEmpty());
		assertPackageList(parser.collectPackages(root, false));
		assertFalse(root.eContents().isEmpty());
		assertEquals(1,root.getPackages().size());
		assertEquals("foo",root.getPackages().get(0).getName());
		assertEquals(3,root.getPackages().get(0).getPackages().size());
		
	}

	private void assertPackageList(List<AsdocPackage> list) {
		ArrayList<String> expected = Lists.newArrayList("", "foo.bar", "foo.globals",
		"foo.members");
		int size = expected.size();
		assertEquals(size, list.size());
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), list.get(i).getCanonicalName());
		}
	}
}
