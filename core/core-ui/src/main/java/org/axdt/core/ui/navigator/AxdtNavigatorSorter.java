/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
