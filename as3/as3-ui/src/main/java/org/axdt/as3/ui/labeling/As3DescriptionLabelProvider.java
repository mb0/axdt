/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.labeling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

import com.google.inject.Inject;

public class As3DescriptionLabelProvider extends
		DefaultDescriptionLabelProvider {

	@Inject
	private ILabelProvider delegateLabelProvider;
	
	@Override
	public Image getImage(Object description) {
		if (description instanceof IEObjectDescription) {
			IEObjectDescription eDesc = (IEObjectDescription) description;
			EObject objectOrProxy = eDesc.getEObjectOrProxy();
			return delegateLabelProvider.getImage(objectOrProxy);
		}
		return super.getImage(description);
	}
}
