/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.outline;

import org.eclipse.xtext.ui.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;

public class As3OutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	@SuppressWarnings("rawtypes")
	private static final Class[] types = { 
		// provide list of classes to adapt to, e.g.:
		// Entity.class
		// Service.class
	};

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		return types;
	}

}

