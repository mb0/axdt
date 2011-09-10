/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.folding;

import org.axdt.as3.ui.preferences.As3EditorPreferences;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider;

import com.google.inject.Inject;

public class As3FoldingStructureProvider extends DefaultFoldingStructureProvider {
	@Inject
	protected As3EditorPreferences preferences;
	
	@Override
	public void initialize() {
		calculateProjectionAnnotationModel(true);
	}
	protected ProjectionAnnotation createProjectionAnnotation(boolean allowCollapsed, Position foldedRegion) {
		boolean isCollapsed = allowCollapsed &&
			foldedRegion instanceof As3FoldedPosition
				? shouldFold((As3FoldedPosition) foldedRegion) : false;
		return new ProjectionAnnotation(isCollapsed);
	}
	protected boolean shouldFold(As3FoldedPosition region) {
		String regionType = region.getRegionType();
		if (regionType == null) return false;
		return preferences.getStore().getBoolean(regionType);
	}
}
