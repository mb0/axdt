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
import org.axdt.as3.model.As3AccessExpression;
import org.axdt.as3.model.As3AssignmentExpression;
import org.axdt.as3.model.As3BooleanLiteral;
import org.axdt.as3.model.As3FunctionExpression;
import org.axdt.as3.model.As3InvocationExpression;
import org.axdt.as3.model.As3MultiplicativeExpression;
import org.axdt.as3.model.As3NewExpression;
import org.axdt.as3.model.As3NewVectorExpression;
import org.axdt.as3.model.As3NullLiteral;
import org.axdt.as3.model.As3NumberLiteral;
import org.axdt.as3.model.As3ParenListExpression;
import org.axdt.as3.model.As3QueryExpression;
import org.axdt.as3.model.As3RegexLiteral;
import org.axdt.as3.model.As3StringLiteral;
import org.axdt.as3.model.IIdentifier;
import org.axdt.as3.services.As3GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;

public class As3ParserExpressionTest extends AbstractXtextTests {
	protected IParseResult result;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(As3StandaloneSetup.class);
	}
	
	protected IParseResult parseExpression(String text) {
		As3GrammarAccess g = (As3GrammarAccess) getGrammarAccess();
		return getParser().parse(g.getIAssignmentExpressionRule(), new StringReader(text));
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
		for (String text:texts) assertResultType(parseExpression(text), class1);
	}
	public void testIdentifier() throws Exception {
		assertResults(IIdentifier.class,
				"ident",
				"grüße",
				"éáíóúêâîôûèàìòù",
				"\\u5B54\\u592B\\u5B50",
				"孔夫子",
				"$sys",
				"_pri"
		);
	}
	public void testFunction() throws Exception {
		assertResults(As3FunctionExpression.class,
				"function():void{}",
				"function(k:B,v:A):void{}",
				"function(...):void{}",
				"function(...b):void{}",
				"function(...b:B):void{}",
				"function(b:B=null):void{}",
				"function(b:* =null):void{}",
				"function(b:*=null):void{}",
				"function f(b:*=null):void{}"
		);
	}
	public void testQualifiedIdentifier() throws Exception {
		assertResults(IIdentifier.class, "a::b");
		assertResults(As3QueryExpression.class, "a..b::c");
	}
	public void testLiteral() throws Exception {
		assertResults(As3BooleanLiteral.class, "false", "true");
		assertResults(As3NullLiteral.class, "null");
	}
	public void testNumberLiteral() throws Exception {
		assertResults(As3NumberLiteral.class,
				"1337", "1.3e-37", "0x1234"
		);
	}
	public void testStringLiteral() throws Exception {
		assertResults(As3StringLiteral.class,
				"\"String\"", "'String'", "'\n\t\f ü←\u00DE'"
		);
	}
	public void testRegexLiteral() throws Exception {
		assertResults(As3RegexLiteral.class,
				"/^regex$/gi", "/^[\\w_-]*\\/[0-9]+$/gi"
		);
	}

	public void testPostfix() throws Exception {
		assertResults(As3AccessExpression.class,
				"a.b", "a['b']", "a['b'].c", "a.b.c"
		);
	}
	public void testInvocation() throws Exception {
		assertResults(As3InvocationExpression.class,
				"a()", "a(1)", "a(1,'2')", "a(b(1),'2')", "a(b(1),'2')"
		);
	}
	public void testMultiplicative() throws Exception {
		assertResults(As3MultiplicativeExpression.class,
				"a*b", "a*b*c", "a * b * c", "a / b / c", "a / b"
		);
	}
	public void testParenList() throws Exception {
		assertResults(As3ParenListExpression.class,
				"(2*(4+3))", "(2, 4+3)"
		);
	}
	public void testAssignment() throws Exception {
		assertResults(As3AssignmentExpression.class,
				"i = 0", "i = j = 0", "i \n . \n j \n = \n j \n = \n 0"
		);
	}
	public void testXmlLiteral() throws Exception {
		// TODO work on xml literals
//		result = parseExpression("<xml/>");
//		assertParseResult(result);
	}
	public void testNewVector() throws Exception {
		assertResults(As3NewExpression.class, "new Vector.<int>()");
		assertResults(As3InvocationExpression.class, "Vector.<String>([\"Bob\", \"Larry\", \"Sarah\"])");
		assertResults(As3NewVectorExpression.class, "new <String>[\"Bob\", \"Larry\", \"Sarah\"]");
	}
}
