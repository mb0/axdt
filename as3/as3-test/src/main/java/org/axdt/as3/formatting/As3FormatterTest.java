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
	public void testIgnoreLineBreaksPreserve() throws Exception {
		assertFormat("1++;\n\n2++;", "\n\n1++\n\n2++\n\n");
		assertFormatPreserve("\n\n1++;\n\n2++;", "\n\n1++\n\n2++\n\n");
		assertFormatDefault("1++;\n2++;", "\n\n1++\n\n2++\n\n");
	}
	public void testIgnoreLineBreaks() throws Exception {
		assertFormatDefault("a();\nb();", "a();b();");
		assertFormatDefault("a();\nb();", "a();\nb();");
		assertFormatDefault("a();\nb();", "a();\n\n\nb();");
		assertFormat("a();\nb();", "a();b();");
		assertFormat("a();\nb();", "a();\nb();");
		assertFormat("a();\n\nb();", "a();\n\n\nb();");
	}
	public void testLiterals() throws Exception {
		assertFormatDefault("{a:'b', 'b':5, c:d};", "{a:'b','b':5,c:d} ; ");
	}
	public void testExpressions() throws Exception {
		assertFormatDefault("1 + 1;", " 1+ 1 ; ");
		assertFormatPreserve(" 1+ 1 ;", " 1+ 1 ; ");
		assertFormatDefault("a.b.c++;", " a . b . c ++ ; ");
		assertFormatDefault("new T(a, b);", "new T ( a , b ) ; ");
		assertFormatDefault("a.b(c, d);", "a.b(c,d);");
		assertFormatDefault("function(a:*, c:*):void {\n\ta++;\n};", "function(a:*,c:*):void{a++;};");
	}
	public void testBlockStatement() throws Exception {
		assertFormatDefault("{\n\t1++;\n\t2++;\n}", "{1++;\n2++;}");
		assertFormatDefault("{\n\t1++;\n\t2++;\n}", "{1++;2++;}");
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
		// for now use explicit default modifiers
		assertFormatDefault("public var i:* = 0;", "var i:*   =0;");
		assertFormatDefault("public var i:* = 0;", "var i:*=0;");
	}
	public void testComments() throws Exception {
		assertFormatDefault("a++; //comment", "a++;//comment");
		assertFormatDefault("a++; /* ml comment */ a++;", "a++;/* ml comment */a++;");
		assertFormatDefault("a++;\n/* ml comment */\na++;", "a++;\n/* ml comment */\na++;");
		assertFormatDefault("a++;\n/* ml comment */\na++;", "a++;\n\n\n/* ml comment */\n\n\na++;");
		assertFormat("a++;\n\n/* ml comment */\n\na++;", "a++;\n\n\n/* ml comment */\n\n\na++;");
		assertFormatDefault("a++;\n/** doc comment */\na++;", "a++;/** doc comment */a++;");
		assertFormat("a++;\n\n/** doc comment */\na++;", "a++;\n\n\n/** doc comment */\n\n\na++;");
	}
	public void testDirecties() throws Exception {
		assertFormatDefault("import a.b.c;\nimport c.b.a;","import a . b . c ; import c . b . a ; ");
		assertFormatDefault("public class a {\n\tpublic function a() {\n\t\tsuper();\n\t}\n}", "class a{public function a(){super();}}");
		assertFormat("package {\n\tpublic class a {\n\t}\n}", "package{public class a{}}");
		assertFormatDefault("public var a:b = new b();\na.c();\na.d[a.f()]..foo();", "var a:b=new b();a.c();a.d[a.f()]..foo();");
		assertFormatDefault("package {\n\timport a.b;\n\timport foo.bar;\n\tpublic class a {\n\t}\n}", "package{import a.b;import foo.bar;public class a{}}");
		assertFormatDefault("package {\n\n\timport a.b;\n\timport foo.bar;\n\tpublic class a {\n\n\t}\n}", "package{\n\n\n\nimport a.b;import foo.bar;\n\n\n\npublic class a{\n\n\n\n}}");
		assertFormat("package {\n\n\timport a.b;\n\timport foo.bar;\n\n\tpublic class a {\n\n\t}\n}", "package{\n\n\n\nimport a.b;import foo.bar;\n\n\n\npublic class a{\n\n\n\n}}");
		assertFormat("package\n{\n\n\timport a.b;\n\timport foo.bar;\n\n\tpublic class a\n\t{\n\n\t}\n}", "package\n\n\n\n{\n\n\n\nimport a.b;import foo.bar;\n\n\n\npublic class a\n\n\n\n{\n\n\n\n}}");
		assertFormat("interface a {\n\tfunction b():c;\n}", "interface a{function b():c;}");
	}
}
