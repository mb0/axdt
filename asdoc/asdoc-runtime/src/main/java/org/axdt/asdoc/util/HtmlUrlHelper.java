/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.util;

import org.axdt.asdoc.model.AsdocExecutable;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocParameter;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.eclipse.emf.ecore.EObject;

public class HtmlUrlHelper extends AsdocUrlHelper {
	
	public static String PACKAGE_LIST = "package-list.html";
	public static String CLASS_LIST = "class-list.html";
	public static String PACKAGE = "package.html";
	public static String PACKAGE_DETAIL = "package-detail.html";
	public static String PACKAGE_SUMMARY = "package-summary.html";

	public String rootUrl(AsdocRoot root) {
		return "";
	}
	public String packageUrl(AsdocPackage pack) {
		if (pack.getCanonicalName().length() == 0)
			return "";
		return pack.getCanonicalName().replace(".", "/") + "/";
	}
	public String typeUrl(AsdocType type) {
		EObject container = type.eContainer();
		if (container instanceof AsdocPackage) {
			String pack = packageUrl((AsdocPackage) container);
			return pack + type.getName() +".html";
		}
		return null;
	}
	public String memberUrl(AsdocMember member) {
		// member can be contained in a package or type
		EObject container = member.eContainer();
		if (member.getName() == null || container == null)
			return null;
		String result = null;
		if (container instanceof AsdocType) {
			result = typeUrl((AsdocType) container);
		} else if (container instanceof AsdocPackage) {
			result = packageUrl((AsdocPackage) container);
			if (result != null)	result += "package.html";
		}
		if (result != null) {
			result += "#"+ member.getName();
			if (member instanceof AsdocExecutable)
				result += "()";
		}
		return result;
	}
	public String paramUrl(AsdocParameter param) {
		// parameter has no own documentation 
		// so return the containers uri if available
		EObject container = param.eContainer();
		if (container instanceof AsdocMember)
			return memberUrl((AsdocMember) container);
		return null;
	}
	
	public String packages(AsdocPackage pack, boolean summary) {
		return summary ? packageSummary(pack) : packageList(pack);
	}
	public String packageList(AsdocPackage pack) {
		return check(pack.getRoot().getBaseUri()).concat(PACKAGE_LIST);
	}
	public String packageSummary(AsdocPackage pack) {
		return check(pack.getRoot().getBaseUri()).concat(PACKAGE_SUMMARY);
	}
	public String types(AsdocPackage pack, boolean detail) {
		return detail ? packageDetail(pack) : classList(pack);
	}
	public String classList(AsdocPackage pack) {
		return check(pack.getFullUri()).concat(CLASS_LIST);
	}
	public String packageDetail(AsdocPackage pack) {
		return check(pack.getFullUri()).concat(PACKAGE_DETAIL);
	}
}
