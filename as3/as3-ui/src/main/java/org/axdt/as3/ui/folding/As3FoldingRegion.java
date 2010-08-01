/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.folding;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegion;

public class As3FoldingRegion extends DefaultFoldingRegion {

	private final String regionType;

	public As3FoldingRegion(Position position, String regionType, StyledString alias) {
		super(position, alias);
		this.regionType = regionType;
	}
	public String getRegionType() {
		return regionType;
	}
}
