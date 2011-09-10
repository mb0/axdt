/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.parser.antlr;

import java.io.StringReader;
import java.util.Iterator;

import org.axdt.as3.As3StandaloneSetup;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Namespace;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

public class As3ParserTest extends AbstractXtextTests {
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(As3StandaloneSetup.class);
	}
	
	public As3ParserTest() {
	}
	protected IParseResult parse(String text) {
		IParser parser = getParser();
		return parser.parse(new StringReader(text));
	}
	protected void assertParseResult(IParseResult result) {
		assertNotNull(result);
		Iterator<INode> iter = result.getSyntaxErrors().iterator();
		if (iter.hasNext()) {
			SyntaxErrorMessage first = iter.next().getSyntaxErrorMessage();
			fail(first.getMessage() + " "+ first.getIssueCode());
		}
	}
	private void assertResultType(String input, Class<?> class1) {
		IParseResult result = parse(input);
		assertParseResult(result);
		assertType(class1, result.getRootASTElement());
	}
	private void assertType(Class<?> class1, EObject root) {
		assertTrue("expected instance of "+ class1.getSimpleName() +" but was "+ root.getClass().getSimpleName(), class1.isInstance(root));
	}

	private void assertResultTypes(String input, Class<?>... classes) {
		IParseResult result = parse(input);
		assertParseResult(result);
		assertType(As3Program.class, result.getRootASTElement());
		EList<EObject> root = result.getRootASTElement().eContents();
		for (int i = 0; i < root.size(); i++) {
			if (i >= classes.length) fail("too many elements. next unexpected :"+ root.get(i));
			assertTrue("expected "+ classes[i].getSimpleName() +" but was "+ root.get(i).getClass().getSimpleName(), classes[i].isInstance(root.get(i)));
		}
		if (root.size() < classes.length) fail("too few elements. next expected: "+ classes[root.size()]);
	}
	protected void assertParseError(IParseResult result) {
		assertNotNull(result);
		Iterable<INode> errors = result.getSyntaxErrors();
		assertEquals("expected errors but has none", true, errors.iterator().hasNext());
	}
	public void testProgram() throws Exception {
		assertResultType("", As3Program.class);
	}
	public void testPackage() throws Exception {
		Class<?> t = As3Package.class;
		assertResultTypes("package {}", t);
		assertResultTypes("package a {}", t);
		assertResultTypes("package a.b.c {}", t);
		assertResultTypes("package a.b.c { import a.b.B; class C{}}", t);
	}
	public void testNamespace() throws Exception {
		Class<?> t = As3Namespace.class;
		assertResultTypes("namespace n;", t);
		assertResultTypes("namespace n \n ", t);
		assertResultTypes("namespace n = \"http://an.url/path\";", t);
		assertResultTypes("namespace n \n = \n m \n ", t);
		assertResultTypes("namespace \n n \n", t);
	}
	public void testImport() throws Exception {
		Class<?> t = As3ImportList.class;
		assertResultTypes("import a.b.B;", t);
		assertResultTypes("import \n a \n . \n b \n . \n B;", t);
		assertResultTypes("import a.b.B;\nimport a.b.c.*;", t);
		assertResultTypes("import a.b.B \n\n import a.b.c.*;", t);
		assertResultTypes("import a.b.B\nimport a.b.c.*\nimport a.b.C\nimport a.B\n", t);
	}
	public void testInclude() throws Exception {
		IParseResult result;
		result = parse("include 'file';");
		assertParseResult(result);
		result = parse("include 'file'\n");
		assertParseResult(result);
		result = parse("include \n 'file';");
		assertParseError(result);
	}
	public void testInterface() throws Exception {
		IParseResult result;
		result = parse("interface A {}");
		assertParseResult(result);
		result = parse("interface A { function b():void; function c():void; }");
		assertParseResult(result);
		result = parse("interface A { function get b():int; function get c():int; }");
		assertParseResult(result);
	}
	public void testVariable() throws Exception {
		IParseResult result;
		result = parse("var a:A;");
		assertParseResult(result);
		result = parse("public static var a:A;");
		assertParseResult(result);
		result = parse("var get:int = 5;");
		assertParseResult(result);
	}
	public void testFunction() throws Exception {
		IParseResult result;
		result = parse("function f():void{}");
		assertParseResult(result);
		result = parse("function get p():A{}");
		assertParseResult(result);
		result = parse("function set p(v:A):void{}");
		assertParseResult(result);
		result = parse("function get(k:B):A{}");
		assertParseResult(result);
		result = parse("function set(k:B,v:A):void{}");
		assertParseResult(result);
		result = parse("override public function f():void{}");
		assertParseResult(result);
		result = parse("function f(...):void{}");
		assertParseResult(result);
		result = parse("function f(...b):void{}");
		assertParseResult(result);
		result = parse("function f(...b:B):void{}");
		assertParseResult(result);
		result = parse("function f(b:B=null):void{}");
		assertParseResult(result);
		result = parse("function f(b:* =null):void{}");
		assertParseResult(result);
		result = parse("function f(b:*=null):void{}");
		assertParseResult(result);
	}
	public void testClass() throws Exception {
		IParseResult result;
		result = parse("class B{}");
		assertParseResult(result);
		result = parse("public dynamic class B{}");
		assertParseResult(result);
	}
	public void testEmbed() throws Exception {
		IParseResult result;
		result = parse("[Embed(source='demo.mpf',mimeType=\"application/octet-stream\")]\nclass B{}");
		assertParseResult(result);
	}
	public void testConditional() throws Exception {
		IParseResult result;
		result = parse("a::b public class B{ }");
		assertParseResult(result);
		result = parse("a::b public interface J{ }");
		assertParseResult(result);
		result = parse("a::b private static var w;");
		assertParseResult(result);
		result = parse("a::b override protected function g():void {}");
		assertParseResult(result);
	}
}
