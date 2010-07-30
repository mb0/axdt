package org.axdt.core.ui.navigator;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ViewerSorter;

public class AxdtNavigatorSorter extends ViewerSorter {

	@Override
	public int category(Object element) {
		if (element instanceof IResource) {
			return 0xf ^ ((IResource) element).getType();
		}
		return 0;
	}
}
