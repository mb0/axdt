/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.util;

import org.axdt.asdoc.model.AsdocElement;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocParameter;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;

public abstract class AsdocUrlHelper {
 
	public abstract String rootUrl(AsdocRoot root);

	public abstract String packageUrl(AsdocPackage pack);

	public abstract String typeUrl(AsdocType type);

	public abstract String memberUrl(AsdocMember member);

	public abstract String paramUrl(AsdocParameter param);
	
	public String url(AsdocElement elem) {
		if (elem instanceof AsdocPackage) {
			if (elem instanceof AsdocRoot)
				return rootUrl((AsdocRoot) elem);
			return packageUrl((AsdocPackage) elem);
		}
		if (elem instanceof AsdocType)
			return typeUrl((AsdocType) elem);
		if (elem instanceof AsdocMember)
			return memberUrl((AsdocMember) elem);
		if (elem instanceof AsdocParameter)
			return paramUrl((AsdocParameter) elem);
		return null;
	}

	public String check(String uri) {
		return uri.endsWith("/") ? uri : uri+"/";
	}
	public static class NULL extends AsdocUrlHelper {

		public String rootUrl(AsdocRoot root) {
			return null;
		}

		public String packageUrl(AsdocPackage pack) {
			return null;
		}

		public String typeUrl(AsdocType type) {
			return null;
		}

		public String memberUrl(AsdocMember member) {
			return null;
		}

		public String paramUrl(AsdocParameter param) {
			return null;
		}
	}
}