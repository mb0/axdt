/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.util;

import org.axdt.asdoc.model.AsdocElement;
import org.axdt.asdoc.model.AsdocExecutable;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocParameter;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.eclipse.emf.ecore.EObject;

public class DitaUrlHelper extends AsdocUrlHelper {
	

	public static String PACKAGE_LIST = "packages.dita";
	public static String GLOBAL = "__Global__";
	public static String EXT = ".xml";
	
	public String packageList(AsdocRoot root) {
		return root.getBaseUri() + PACKAGE_LIST;
	}
	public String rootUrl(AsdocRoot root) {
		return GLOBAL + EXT;
	}

	public String packageUrl(AsdocPackage pack) {
		if (pack.getCanonicalName() == null)
			return GLOBAL + EXT;
		return pack.getCanonicalName() + EXT;
	}

	public String typeUrl(AsdocType type) {
		EObject container = type.eContainer();
		if (container instanceof AsdocPackage) {
			AsdocPackage pack = (AsdocPackage) container;
			String fullUri = packageUrl(pack);
			if (fullUri != null)
				return fullUri + "#" + pack.getCanonicalName() + ":"
						+ type.getName();
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
			AsdocPackage pack = (AsdocPackage) container;
			result = packageUrl(pack);
			if (result != null) {
				result = result + "#global"
						+ (member instanceof AsdocExecutable ? "Operation"
								: "Value") + ":" + pack.getCanonicalName();
			}
		}
		if (result != null)
			result += ":" + member.getName();
		return result;
	}

	public String paramUrl(AsdocParameter param) {
		// parameter has no own documentation
		// so return the containers uri if available
		EObject container = param.eContainer();
		if (container instanceof AsdocElement)
			return url((AsdocElement) container);
		return null;
	}
}
