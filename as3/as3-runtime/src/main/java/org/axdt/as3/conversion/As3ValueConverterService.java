/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @author mb0
 */
public class As3ValueConverterService extends DefaultTerminalConverters {

	@ValueConverter(rule = "NUMBER")
	public IValueConverter<Double> NUMBER() {
		return new IValueConverter<Double>() {
			public Double toValue(String string, INode node) {
				if (Strings.isEmpty(string))
					throw new ValueConverterException("Couldn't convert "
							+ "empty string to number", node, null);
				try {
					if (string.startsWith("0x")) {
						string = string.substring(2);
						return new Double(Long.parseLong(string, 16));
					}
					return Double.valueOf(string);
				} catch (NumberFormatException e) {
					throw new ValueConverterException("Couldn't convert '"
							+ string + "' to number", node, e);
				}
			}

			public String toString(Double value) {
				return value.toString();
			}
		};
	}

	@ValueConverter(rule = "FQN")
	public IValueConverter<String> FQN() {
		return new IValueConverter<String>() {
			public String toValue(String string, INode node) {
				if (string == null)
					return null;
				return string.replaceAll("\\s+", "");
			}

			public String toString(String value) {
				return value;
			}
		};
	}

	@ValueConverter(rule = "ImportFQN")
	public IValueConverter<String> ImportFQN() {
		return new IValueConverter<String>() {
			public String toValue(String string, INode node) {
				if (string == null)
					return null;
				return string.replaceAll("\\s+", "");
			}

			public String toString(String value) {
				return value;
			}
		};
	}

	@ValueConverter(rule = "LT")
	public IValueConverter<String> LT() {
		return new IValueConverter<String>() {
			public String toValue(String string, INode node) {
				return "\n";
			}

			public String toString(String value) {
				return value;
			}
		};
	}
}
