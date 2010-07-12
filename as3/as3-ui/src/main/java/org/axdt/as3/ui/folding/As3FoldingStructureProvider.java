package org.axdt.as3.ui.folding;

import org.axdt.as3.ui.preferences.As3EditorPreferences;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegion;
import org.eclipse.xtext.ui.editor.folding.StyledProjectionAnnotation;

import com.google.inject.Inject;

public class As3FoldingStructureProvider extends DefaultFoldingStructureProvider {
	@Inject
	protected As3EditorPreferences preferences;
	@Override
	public void initialize() {
		calculateProjectionAnnotationModel(true);
	}
	protected ProjectionAnnotation createProjectionAnnotation(boolean allowCollapse, IFoldingRegion foldingRegion) {
		allowCollapse = allowCollapse &&
			foldingRegion instanceof As3FoldingRegion
				? shouldFold((As3FoldingRegion) foldingRegion)
				: false;
		return new StyledProjectionAnnotation(allowCollapse, foldingRegion.getAlias());
	}
	protected boolean shouldFold(As3FoldingRegion region) {
		String regionType = region.getRegionType();
		if (regionType != null) {
			return preferences.getStore().getBoolean(regionType);
		}
		return false;
	}
}
