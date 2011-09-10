/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.parser.antlr;

import java.io.StringReader;
import java.util.Iterator;

import org.axdt.as3.As3StandaloneSetup;
import org.axdt.as3.model.As3ExpressionStatement;
import org.axdt.as3.model.As3ForInStatement;
import org.axdt.as3.model.As3ForStatement;
import org.axdt.as3.model.As3IfStatement;
import org.axdt.as3.model.As3SwitchStatement;
import org.axdt.as3.model.As3TryStatement;
import org.axdt.as3.model.As3WhileStatement;
import org.axdt.as3.services.As3GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

public class As3ParserStatementTest extends AbstractXtextTests {
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(As3StandaloneSetup.class);
	}
	
	public As3ParserStatementTest() {
	}
	protected IParseResult parse(String text) {
		IParser parser = getParser();
		return parser.parse(new StringReader(text));
	}
	
	protected IParseResult parseStatement(String text) {
		As3GrammarAccess g = (As3GrammarAccess) getGrammarAccess();
		return getParser().parse(g.getIStatementRule(), new StringReader(text));
	}
	protected void assertParseResult(IParseResult result) {
		assertNotNull(result);
		Iterator<INode> iter = result.getSyntaxErrors().iterator();
		if (iter.hasNext()) {
			SyntaxErrorMessage first = iter.next().getSyntaxErrorMessage();
			fail(first.getMessage() + " "+ first.getIssueCode());
		}
	}
	protected void assertResultType(IParseResult result, Class<?> class1) {
		assertNotNull(result);
		Iterator<INode> iter = result.getSyntaxErrors().iterator();
		if (iter.hasNext()) {
			SyntaxErrorMessage first = iter.next().getSyntaxErrorMessage();
			fail(first.getMessage() + " "+ first.getIssueCode());
		}
		EObject root = result.getRootASTElement();
		assertTrue("expected instance of "+ class1.getSimpleName() +" but was "+ root.getClass().getSimpleName(), class1.isInstance(root));
	}
	protected void assertResults(Class<?> class1, String... texts) {
		for (String text:texts) assertResultType(parseStatement(text), class1);
	}
	protected void assertParseError(IParseResult result) {
		assertNotNull(result);
		Iterable<INode> errors = result.getSyntaxErrors();
		assertEquals("expected errors but has none", true, errors.iterator().hasNext());
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
	public void testConditional() throws Exception {
		IParseResult result;
		result = parse("a::b { i++; }");
		assertParseResult(result);
	}
	public void testWhile() throws Exception {
		assertResults(As3WhileStatement.class,
				"while(true);",
				"while(i<10){i+=1;i+=1;}",
				"while(i<10){if (true) i+=1;}"
		);
	}
	public void testTry() throws Exception {
		assertResults(As3TryStatement.class,
				"try { jump(); } catch (e:E) {}"
		);
	}
	public void testExpressionStatementList() throws Exception {
		assertResults(As3ExpressionStatement.class,
				"true == false, 1 > 0;"
		);
	}
	public void testSwitchStatement() throws Exception {
		assertResults(As3SwitchStatement.class,
				"switch (i) { case 1: i+=1; case 2: i+=1; default: i+=1;}",
				"switch (i) { case 1: call(); case 2: call(); default: call();}"
		);
	}
	public void testIfStatement() throws Exception {
		assertResults(As3IfStatement.class,
				"if(true)run();else run();",
				"if(true)run();else if(true)run();",
				"if(true){run();}else if(true){run();}",
				"if(true){if(true)run();}else if(true){run();}"
		);
	}
	public void testForStatement() throws Exception {
		assertResults(As3ForStatement.class,
				"for(i=1;i<100;i++)run();",
				"for(i=1;i<100;i++){}",
				"for(var i:int = 1;i<100;i++){}"
		);
	}
	public void testForInStatement() throws Exception {
		assertResults(As3ForInStatement.class,
				"for(i in list)run();",
				"for(var i:* in list){}",
				"for each(i in list){}"
		);
	}
	public void testStatements() throws Exception {
		IParseResult result;
		result = parse("var i:int\ni++;");
		assertParseResult(result);
		result = parse("1++\n2++\n");
		assertParseResult(result);
	}
	public void testVector() throws Exception {
		IParseResult result;
		result = parse("var v:Vector.<String>;");
		assertParseResult(result);
		result = parse("var v:Vector.<int> = new Vector.<int>();");
		assertParseResult(result);
		result = parse("var friends:Vector.<String> = Vector.<String>(arr);");
		assertParseResult(result);
		result = parse("var friends:Vector.<int> = new <int>[1, 2, 3];");
		assertParseResult(result);
	}
}
