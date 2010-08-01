/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.parser;

import java.util.List;

import junit.framework.TestCase;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.avm.model.AvmMember;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

public abstract class AbstractCollectorTest extends TestCase {
	protected final String dataFolder;

	public AbstractCollectorTest() {
		super();
		dataFolder = getTestDocUri();
	}
	public static String getTestDocUri() {
		return "jar:"+getProjectRootUri(AbstractCollectorTest.class)+"testdocs.zip!/";
	}
	public static String getProjectRootUri(Class<?> type) {
		String classUri = type.getResource(type.getSimpleName()+".class").toExternalForm();
		String toReplace = classUri.startsWith("bundleresource:")
			? type.getCanonicalName().replace('.', '/')+".*$"
			: "target/classes/.*$";
		return classUri.replaceFirst(toReplace, "");
	}
	protected AsdocRoot createRoot(String name) {
		return AsdocEFactory.eINSTANCE.createAsdocRoot(dataFolder+name);
	}
	protected void assertEqualsElements(List<?> expected, List<?> list) {
		int size = expected.size();
		assertEquals(size, list.size());
		for (int i = 0; i < size; i++) {
			assertEquals(expected.get(i), list.get(i));
		}
	}
	protected void assertEqualsTypes(List<Class<?>> expected, List<? extends EObject> list) {
		int size = expected.size();
		assertEquals(size, list.size());
		for (int i = 0; i < size; i++) {
			assertTrue("expected "+expected.get(i).getCanonicalName()+" got "+list.get(i).getClass().getCanonicalName(),
					expected.get(i).isInstance(list.get(i)));
		}
	}

	protected void assertMemberNamesList(List<String> expected, List<? extends AvmMember> list) {
		assertEqualsElements(expected, Lists.transform(list, new Function<AvmMember, String>() {
			public String apply(AvmMember from) {
				return from.getName();
			}
		}));
	}
}
