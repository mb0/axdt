package org.axdt.asdoc.parser;

import org.axdt.asdoc.model.AsdocPackage;


public class AsdocUris {
	public static String PACKAGE_LIST = "package-list.html";
	public static String CLASS_LIST = "class-list.html";
	public static String PACKAGE = "package.html";
	public static String PACKAGE_DETAIL = "package-detail.html";
	public static String PACKAGE_SUMMARY = "package-summary.html";
	
	public static String check(String uri) {
		return uri.endsWith("/") ? uri : uri+"/";
	}
	public static String packages(AsdocPackage pack, boolean summary) {
		return packages(pack.getRoot().getBaseUri(), summary);
	}
	public static String packages(String uri, boolean summary) {
		return summary ? packageSummary(uri) : packageList(uri);
	}
	public static String packageList(AsdocPackage pack) {
		return packageList(pack.getRoot().getBaseUri());
	}
	public static String packageList(String uri) {
		return check(uri).concat(PACKAGE_LIST);
	}
	public static String packageSummary(AsdocPackage pack) {
		return packageSummary(pack.getRoot().getBaseUri());
	}
	public static String packageSummary(String uri) {
		return check(uri).concat(PACKAGE_SUMMARY);
	}
	public static String types(AsdocPackage pack, boolean detail) {
		return types(pack.getFullUri(),detail);
	}
	public static String types(String uri, boolean detail) {
		return detail ? packageDetail(uri) : classList(uri);
	}
	public static String classList(AsdocPackage pack) {
		return classList(pack.getFullUri());
	}
	public static String classList(String uri) {
		return check(uri).concat(CLASS_LIST);
	}
	public static String packageDetail(AsdocPackage pack) {
		return packageDetail(pack.getFullUri());
	}
	public static String packageDetail(String uri) {
		return check(uri).concat(PACKAGE_DETAIL);
	}
	public static String concat(String base, String fqn) {
		return fqn == null || fqn.length() == 0 ?
				base : base + fqn.replace('.', '/') + "/";
	}
	public static String concatType(String base, String fqn,
			String name) {
		return concat(base, fqn).concat(name+".html");
	}
}
