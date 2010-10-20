/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.formatting;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import org.axdt.as3.As3StandaloneSetup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.INodeModelStreamer;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.parsetree.reconstr.impl.TokenStringBuffer;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class As3FormatterTest extends AbstractXtextTests {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(As3StandaloneSetup.class);
	}
	public String formatEObject(String input) throws Exception {
		XtextResourceSet resourceSet = get(XtextResourceSet.class);
		XtextResource resource = (XtextResource) resourceSet.createResource(URI.createURI("dummy:/Test1.as"));
		resource.reparse(input);
		ByteArrayOutputStream formatted = new ByteArrayOutputStream();
		Builder options = SaveOptions.newBuilder();
		options.format();
		options.noValidation();
		resource.doSave(formatted, options.getOptions().toOptionsMap());
		return formatted.toString();
	}

	public String formatNodeModel(String input, boolean preserve) throws Exception {
		IAntlrParser parser = getAntlrParser();
		IParseResult parseResult = parser.parse(null, new StringReader(input));
		IFormatter formatter = getInjector().getInstance(IFormatter.class);
		TokenStringBuffer buf = new TokenStringBuffer();
		ITokenStream fmt = formatter.createFormatterStream("", buf, preserve);
		INodeModelStreamer nodeModelStreamer = getInjector().getInstance(INodeModelStreamer.class);
		nodeModelStreamer.feedTokenStream(fmt, parseResult.getRootNode(), 0, input.length());
		return buf.toString();
	}
	public void assertFormat(String expected, String toformat) throws Exception {
		assertEquals(expected, formatNodeModel(toformat, false));
	}
	public void assertFormatPreserve(String expected, String toformat) throws Exception {
		assertEquals(expected, formatNodeModel(toformat, true));
	}
	public void assertFormatDefault(String expected, String toformat) throws Exception {
		assertEquals(expected, formatEObject(toformat));
	}
	public void testIgnoreLineBreaksProblem() throws Exception {
		assertFormat("1++;\n\n2++;", "\n\n1++\n\n2++\n\n");
	}
	public void testIgnoreLineBreaksProblemDefault() throws Exception {
		assertFormatDefault("1++;\n2++;", "\n\n1++\n\n2++\n\n");
	}
	public void testIgnoreLineBreaksProblemPreserve() throws Exception {
		assertFormatPreserve("\n\n1++;\n\n2++;", "\n\n1++\n\n2++\n\n");
	}
	public void testIgnoreLineBreaks() throws Exception {
		assertFormat("a();\nb();", "a();b();");
		assertFormat("a();\nb();", "a();\nb();");
		assertFormat("a();\n\nb();", "a();\n\n\nb();");
		assertFormatDefault("a();\nb();", "a();b();");
		assertFormatDefault("a();\nb();", "a();\nb();");
		assertFormatDefault("a();\nb();", "a();\n\n\nb();");
	}
	public void testExpressions() throws Exception {
		assertFormatDefault("1 + 1;", " 1+ 1 ; ");
		assertFormatPreserve(" 1+ 1 ;", " 1+ 1 ; ");
		assertFormatDefault("a.b.c++;", " a . b . c ++ ; ");
		assertFormatDefault("new T(a, b);", "new T ( a , b ) ; ");
		assertFormatDefault("a.b(c, d);", "a.b(c,d);");
		assertFormatDefault("function(a:*, c:*):void {\n\ta++;\n};", "function(a:*,c:*):void{a++;};");
	}
	public void testMetadata() throws Exception {
		assertFormatDefault("[Meta]\nclass A {\n}","[Meta]class A{}");
		assertFormatPreserve("[Meta]class A{}","[Meta]class A{}");
		assertFormat("[Meta(foo = \"bar\")]\nclass A {\n}","[Meta(foo=\"bar\")]class A{}");
	}
	public void testBlockStatement() throws Exception {
		assertFormatDefault("{\n\t1++;\n\t2++;\n}", "{1++;\n2++;}");
		assertFormatDefault("{\n\t1++;\n\t2++;\n}", "{1++;2++;}");
	}
	public void testIfElse() throws Exception {
		assertFormatDefault("if (true) {\n} else {\n}", "if(true){}else{}");
	}
	public void testShortIfElse() throws Exception {
		assertFormatDefault("if (true) 1++;\nelse 2++;", "if(true)1++;else 2++;");
		assertFormatDefault("if (true) 1++;\nelse 2++;", "if(true)\n\t1++;else\n\t2++;");
		// there is no easy way to add indentation so better use a block
		assertFormat("if (true) 1++;\nelse 2++;", "if(true)\n\t1++;else\n\t2++;");
	}
	public void testInitializers() throws Exception {
		// initializers can have breaks
		assertFormat("[\n\t1,\n\t2,\n\t3\n];", "[\n1,\n2,\n3\n];");
		assertFormat("{\n\t'a':1,\n\t'b':2,\n\t'c':3\n};", "{\n'a':1,\n'b':2,\n'c':3\n};");
		// the trade off are bounding spaces
		assertFormat("[ 1, 2, 3 ];", "[1,2,3];");
		assertFormat("{ 'a':1, 'b':2, 'c':3 };", "{'a':1,'b':2,'c':3};");
	}
	public void testStatements() throws Exception {
		assertFormatDefault("if (true) {\n}", "if(true){}");
		assertFormatDefault("if (true) {\n\t1 + 1;\n}", "if(true){1+1;}");
		assertFormatDefault("if (true) 1++;\nelse 2++;", "if(true)1++;else 2++;");
		assertFormatDefault("while (true) c++;", "while(true)c++;");
		assertFormatDefault("while (true) {\n\t1++;\n\t2++;\n}", "while(true){1++;2++;}");
		assertFormatDefault("do {\n\t1++;\n\t2++;\n} while (true);", "do{1++;2++;}while(true);");
		assertFormatDefault("for (a in b) c(a);", "for(a in b)c(a);");
		assertFormatDefault("for each (a in b) c(a);", "for each(a in b)c(a);");
		assertFormatDefault("var i:* = 0;", "var i:*   =0;");
		assertFormatDefault("var i:* = 0;", "var i:*=0;");
	}
	public void testEndComment() throws Exception {
		assertFormat("1++;\n//comment", "1++;//comment");
		assertFormat("1++;\n//comment", "1++;\n//comment");
		assertFormatPreserve("1++;//comment", "1++;//comment");
		assertFormatPreserve("1++;  //comment", "1++;  //comment");
		assertFormatDefault("1++;\n//comment", "1++;\n\n//comment");
		assertFormatDefault("1++;\n//comment", "1++;//comment");
		assertFormatDefault("1++;\n//comment\n2++;", "1++;//comment\n2++;");
	}
	public void testCommentInBlock() throws Exception {
		// this seems a bit strange because of the comment indention fix
		assertFormat("class A {\n\t1++;\n\t//comment\n}","class A{1++;//comment\n}");
		assertFormat("class A {\n\t//comment\n\t1++;\n}","class A{\n//comment\n1++;}");
		assertFormat("class A {\t//comment\n\t1++;\n}","class A{//comment\n1++;}");
		assertFormatDefault("class A {\n\t1++;\n\t//comment\n}","class A{1++;//comment\n}");
		assertFormat("class A {//comment\n}","class A{//comment\n}");
	}
	public void testComments() throws Exception {
		assertFormat("a++;\n/* ml comment */\na++;", "a++;/* ml comment */a++;");
		assertFormatDefault("a++;\n/* ml comment */\na++;", "a++;\n/* ml comment */\na++;");
		assertFormatDefault("a++;\n/* ml comment */\na++;", "a++;\n\n\n/* ml comment */\n\n\na++;");
		assertFormat("a++;\n\n/* ml comment */\n\na++;", "a++;\n\n\n/* ml comment */\n\n\na++;");
		assertFormatDefault("a++;\n/** doc comment */\na++;", "a++;/** doc comment */a++;");
		assertFormat("a++;\n\n/** doc comment */\na++;", "a++;\n\n\n/** doc comment */\n\n\na++;");
	}
	public void testImportDirective() throws Exception {
		assertFormatDefault("import a.b.c;\nimport c.b.a;","import a . b . c ; import c . b . a ; ");
	}
	public void testClassDirective() throws Exception {
		assertFormat("public class a {\n}", "public class a{}");
		assertFormatDefault("public class a {\n}", "public class a{}");
		assertFormatDefault("package {\n\tpublic class a {\n\t}\n}", "package{public class a{}}");
		assertFormatDefault("class a {\n\tpublic function a() {\n\t\tsuper();\n\t}\n}", "class a{public function a(){super();}}");
		assertFormat("package {\n\tpublic class a {\n\t}\n}", "package{public class a{}}");
		assertFormat("package {\n\n\timport a.b;\n\timport foo.bar;\n\n\tpublic class a {\n\n\t}\n}",
				"package{\n\n\n\nimport a.b;import foo.bar;\n\n\n\npublic class a{\n\n\n\n}}");
		assertFormatDefault("package {\n\timport a.b;\n\timport foo.bar;\n\tpublic class a {\n\t}\n}",
				"package{import a.b;import foo.bar;public class a{}}");
		assertFormatDefault("package {\n\n\timport a.b;\n\timport foo.bar;\n\tpublic class a {\n\n\t}\n}",
				"package{\n\n\n\nimport a.b;import foo.bar;\n\n\n\npublic class a{\n\n\n\n}}");
	}
	public void testDirectives() throws Exception {
		assertFormatDefault("var a:b = new b();\na.c();\na.d[a.f()]..foo();", "var a:b=new b();a.c();a.d[a.f()]..foo();");
		assertFormat("package\n{\n\n\timport a.b;\n\timport foo.bar;\n\n\tpublic class a\n\t{\n\n\t}\n}", "package\n\n\n\n{\n\n\n\nimport a.b;import foo.bar;\n\n\n\npublic class a\n\n\n\n{\n\n\n\n}}");
		assertFormat("interface a {\n\tfunction b():c;\n}", "interface a{function b():c;}");
	}
}
