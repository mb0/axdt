/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.naming;

import java.util.regex.Pattern;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.IQualifiedNameConverter;

public class AvmQualifiedNameConverter implements IQualifiedNameConverter {

	public static String DELIMITER = ".";
	public static Pattern DELIMITER_RE = Pattern.compile("\\.");
//	private static int counter;

	public String toString(QualifiedName qname) {
		if (qname == null)
			throw new IllegalArgumentException("Qualified name cannot be null");
		if (qname.getSegmentCount() == 1)
			return qname.getFirstSegment();
		StringBuilder builder = new StringBuilder();
		boolean isFirst = true;
		for (String segment : qname.getSegments()) {
			if (!isFirst) builder.append(DELIMITER);
			isFirst = false;
			builder.append(segment);
		}
		return builder.toString();
	}

	public QualifiedName toQualifiedName(String qname) {
		if (qname == null)
			throw new IllegalArgumentException("Qualified name cannot be null");
//		counter++;
//		if (counter%100==0)
//			System.out.println(counter);
		return qname.contains(DELIMITER)
			? QualifiedName.create(DELIMITER_RE.split(qname))
			: QualifiedName.create(qname);
	}
}
