/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import java.util.ArrayList;
import java.util.List;

import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;

import com.google.common.collect.Lists;

public class CollectPackageListTest extends AbstractCollectorTest {
	public void testParseList() throws Exception {
		CollectPackageList parser = new CollectPackageList();
		assertPackageList(parser.collectPackages(createRoot("simple"), false));
		assertPackageList(parser.collectPackages(createRoot("simple"), true));
	}

	public void testParseListPersist() throws Exception {
		CollectPackageList parser = new CollectPackageList();
		AsdocRoot root = createRoot("simple");
		assertTrue(root.eContents().isEmpty());
		assertPackageList(parser.collectPackages(root, false));
		assertFalse(root.eContents().isEmpty());
		assertEquals(1, root.getPackages().size());
		assertEquals("foo", root.getPackages().get(0).getName());
		assertEquals(3, root.getPackages().get(0).getPackages().size());
	}

	public void testFlex4AsdocPackageList() throws Exception {
		CollectPackageList.TransformLink2Package linkParser = new CollectPackageList.TransformLink2Package(
				null);
		assertNull(linkParser.getFQN(null));
		assertNull(linkParser.getFQN("fooooo"));
		assertEquals("flash.utils",
				linkParser.getFQN("flash/utils/package-detail.html"));
		assertEquals("flash.utils", linkParser.getFQN("javascript:" +
				"savePackageListScrollTop();" +
				"void window.open(baseRef + " +
				"'flash/utils/package-detail.html'" +
				", '_self');"));
	}

	private void assertPackageList(List<AsdocPackage> list) {
		ArrayList<String> expected = Lists.newArrayList("", "foo.bar",
				"foo.globals", "foo.members");
		int size = expected.size();
		assertEquals(size, list.size());
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), list.get(i).getCanonicalName());
		}
	}
}
