/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.parser.antlr;

import java.io.StringReader;
import java.util.List;

import org.axdt.as3.As3StandaloneSetup;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.SyntaxError;

public class As3ParserTest extends AbstractXtextTests {
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(As3StandaloneSetup.class);
	}
	
	public As3ParserTest() {
	}
	protected IParseResult parse(String text) {
		IAntlrParser parser = getAntlrParser();
		return parser.parse(null, new StringReader(text));
	}
	protected IParseResult parseExpression(String text) {
		IAntlrParser parser = getAntlrParser();
		return parser.parse(null, new StringReader("i = "+text+";"));
	}
	protected IParseResult parseExpression(String text,String vars) {
		IAntlrParser parser = getAntlrParser();
		return parser.parse(null, new StringReader(vars+"i = "+text+";"));
	}
	protected void assertParseResult(IParseResult result) {
		assertNotNull(result);
		List<SyntaxError> errors = result.getParseErrors();
		if (errors.size() > 0) {
			assertEquals(errors.get(0).getMessage() + " "+ errors.get(0).getIssueCode() , false, true);
		}
	}
	protected void assertParseError(IParseResult result) {
		assertNotNull(result);
		List<SyntaxError> errors = result.getParseErrors();
		assertEquals("expected errors but has none", true, errors.size()>0);
	}
	public void testProgram() throws Exception {
		IParseResult result;
		result = parse("");
		assertParseResult(result);
	}
	public void testPackage() throws Exception {
		IParseResult result;
		result = parse("package {}");
		assertParseResult(result);
		result = parse("package a {}");
		assertParseResult(result);
		result = parse("package a.b.c {}");
		assertParseResult(result);
		result = parse("package a.b.c { import a.b.B; class C{}}");
		assertParseResult(result);
	}
	public void testNamespace() throws Exception {
		IParseResult result;
		result = parse("namespace n;");
		assertParseResult(result);
		result = parse("namespace n \n ");
		assertParseResult(result);
		result = parse("namespace n = \"http://an.url/path\";");
		assertParseResult(result);
		result = parse("namespace n \n = \n m \n ");
		assertParseResult(result);
		result = parse("namespace \n n");
		assertParseError(result);
	}
	public void testImport() throws Exception {
		IParseResult result;
		result = parse("import a.b.B;");
		assertParseResult(result);
		result = parse("import \n a \n . \n b \n . \n B;");
		assertParseResult(result);
		result = parse("import a.b.B;\nimport a.b.c.*;");
		assertParseResult(result);
		result = parse("import a.b.B \n\n import a.b.c.*;");
		assertParseResult(result);
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
	}
	public void testVariable() throws Exception {
		IParseResult result;
		result = parse("var a:A;");
		assertParseResult(result);
		result = parse("public static var a:A;");
		assertParseResult(result);
		result = parse("var a:int = 5;");
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
		result = parse("var f:* = function f(b:*=null):void{};");
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
		result = parse("[Embed(source='demo.mpf',mimeType=\"application/octet-stream\")] var Levels:Class;");
		assertParseResult(result);
	}
	public void testConditional() throws Exception {
		IParseResult result;
		result = parse("a::b { i++; }");
		assertParseResult(result);
		result = parse("a::b public class B{ }");
		assertParseResult(result);
		result = parse("a::b public interface J{ }");
		assertParseResult(result);
		result = parse("a::b private static var w;");
		assertParseResult(result);
		result = parse("a::b override protected function g():void {}");
		assertParseResult(result);
	}
	public void testIdentifier() throws Exception {
		IParseResult result;
		result = parseExpression("ident");
		assertParseResult(result);
	}
	public void testQualifiedIdentifier() throws Exception {
		IParseResult result;
		result = parseExpression("a::b");
		assertParseResult(result);
		result = parseExpression("a..b::c");
		assertParseResult(result);
		result = parseExpression("a..*::b");
		assertParseResult(result);
	}
	public void testLiteral() throws Exception {
		IParseResult result;
		result = parseExpression("1337");
		assertParseResult(result);
		result = parseExpression("1.3e-37");
		assertParseResult(result);
		result = parseExpression("\"String\"");
		assertParseResult(result);
		result = parseExpression("'String'");
		assertParseResult(result);
		result = parseExpression("'\n\t\f ü←\u00DE'");
		assertParseResult(result);
		result = parseExpression("false");
		assertParseResult(result);
		result = parseExpression("true");
		assertParseResult(result);
		result = parseExpression("null");
		assertParseResult(result);
		result = parseExpression("0x1234");
		assertParseResult(result);
	}
	public void testPostfix() throws Exception {
		IParseResult result;
		result = parseExpression("a.b");
		assertParseResult(result);
		result = parseExpression("a['b']");
		assertParseResult(result);
		result = parseExpression("a['b'].c");
		assertParseResult(result);
		result = parseExpression("a.b.c","var a:*;");
		assertParseResult(result);
	}
	public void testInvocation() throws Exception {
		IParseResult result;
		result = parseExpression("a()");
		assertParseResult(result);
		result = parseExpression("a(1)");
		assertParseResult(result);
		result = parseExpression("a(1,'2')");
		assertParseResult(result);
		result = parseExpression("a(b(1),'2')");
		assertParseResult(result);
	}
	public void testWhile() throws Exception {
		IParseResult result;
		result = parse("while(true);");
		assertParseResult(result);
		result = parse("while(i<10){i+=1;i+=1;}");
		assertParseResult(result);
		result = parse("while(i<10){if (true) i+=1;}");
		assertParseResult(result);
	}
	public void testTry() throws Exception {
		IParseResult result;
		result = parse("try { jump(); } catch (e:E) {}");
		assertParseResult(result);
	}
	public void testExpressionStatementList() throws Exception {
		IParseResult result;
		result = parse("true == false, 1 > 0;");
		assertParseResult(result);
	}
	public void testParenExpression() throws Exception {
		IParseResult result;
		result = parseExpression("2*(4+3)");
		assertParseResult(result);
	}
	public void testSwitchStatement() throws Exception {
		IParseResult result;
		result = parse("switch (i) { case 1: i+=1; case 2: i+=1; default: i+=1;}");
		assertParseResult(result);
		result = parse("switch (i) { case 1: call(); case 2: call(); default: call();}");
		assertParseResult(result);
	}
	public void testIfStatement() throws Exception {
		IParseResult result;
		result = parse("if(true)run();else run();");
		assertParseResult(result);
		result = parse("if(true)run();else if(true)run();");
		assertParseResult(result);
		result = parse("if(true){run();}else if(true){run();}");
		assertParseResult(result);
		result = parse("if(true){if(true)run();}else if(true){run();}");
		assertParseResult(result);
	}
	public void testForStatement() throws Exception {
		IParseResult result;
		result = parse("for(i=1;i<100;i++)run();");
		assertParseResult(result);
		result = parse("for(i=1;i<100;i++){}");
		assertParseResult(result);
		result = parse("for(var i:int = 1;i<100;i++){}");
		assertParseResult(result);
	}
	public void testForInStatement() throws Exception {
		IParseResult result;
		result = parse("for(i in list)run();");
		assertParseResult(result);
		result = parse("for(var i:* in list){}");
		assertParseResult(result);
		result = parse("for each(i in list){}");
		assertParseResult(result);
	}
	public void testAssignmentExpression() throws Exception {
		IParseResult result;
		result = parse("i = j = 0;");
		assertParseResult(result);
		result = parse("i = 0\n");
		assertParseResult(result);
		result = parse("i \n . \n j \n = \n j \n = \n 0 \n");
		assertParseResult(result);
	}
	public void testUnicodeIdent() throws Exception {
		IParseResult result;
		result = parseExpression("grüße");
		assertParseResult(result);
		// TODO work on unicode identifiers
//		result = parseExpression("éáíóúêâîôûèàìòù");
//		assertParseResult(result);
	}
	public void testXmlLiteral() throws Exception {
		// TODO work on xml literals
//		IParseResult result;
//		result = parseExpression("<xml/>");
//		assertParseResult(result);
	}
	public void testRegexLiteral() throws Exception {
		IParseResult result;
		// TODO regex not working add a custom lexer
		result = parseExpression("/^regex$/gi");
		assertParseResult(result);
	}
	public void testStatements() throws Exception {
		IParseResult result;
		result = parse("var i:int\ni++;");
		assertParseResult(result);
		result = parse("1++\n2++\n");
		assertParseResult(result);
	}
}
