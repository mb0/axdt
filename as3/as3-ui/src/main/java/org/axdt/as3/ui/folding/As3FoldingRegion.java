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