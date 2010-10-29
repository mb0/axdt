/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.config;

import org.axdt.common.config.AbstractMapConfig;
import org.axdt.common.config.IAxdtConfig;
import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import com.google.inject.ImplementedBy;

@ImplementedBy(IFormattingConfig.Default.class)
public interface IFormattingConfig extends IAxdtConfig {
	String ID = "org.axdt.as3.formatting";
	String INDENT_STYLE = "indentStyle";
	String MAX_LINE_WIDTH = "maxLineWidth";
	
	IndentStyle getIndentStyle(IResource res);
	
	public static class Default extends AbstractMapConfig implements IFormattingConfig {
		
		public Default() {
			store.put(INDENT_STYLE, IndentStyle.OTBS.name());
			store.put(MAX_LINE_WIDTH, "100");
		}

		public String getConfigId() {
			return ID;
		}

		public IndentStyle getIndentStyle(IResource res) {
			return IndentStyle.OTBS;
		}
	}

	public static enum IndentStyle {
		OTBS("One True Brace Style default", 0, 0, 1),
		BSD("Allman/BSD Style default", 0, 1, 1),
		OTBS_STRICT("One True Brace Style strict", 0, 0, 0),
		BSD_STRICT("Allman/BSD Style strict", 1, 1, 1);

		public final String label;
		public final int bcMin;
		public final int bcMax;
		public final int bcDefault;

		private IndentStyle(String label, int bcMin, int bcDefault,
				int bcMax) {
			this.label = label;
			this.bcMin = bcMin;
			this.bcDefault = bcDefault;
			this.bcMax = bcMax;
		}

		public void breakBefore(FormattingConfig c, Keyword leftCurly) {
			if (bcMax == 0)
				c.setNoLinewrap().before(leftCurly);
			else
				c.setLinewrap(bcMin, bcDefault, bcMax).before(leftCurly);
		}

		public static String[][] comboArray() {
			IndentStyle[] values = values();
			String[][] result = new String[values.length][];
			for (int i = 0; i < values.length; i++)
				result[i] = new String[] { values[i].label, values[i].name() };
			return result;
		}
	}
}
