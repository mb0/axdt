/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.config;

import java.util.Map;

import org.eclipse.core.resources.IResource;

import com.google.common.collect.Maps;

public abstract class AbstractMapConfig implements IAxdtConfig {
	protected Map<String, String> store = Maps.newHashMap(); 

	public boolean getBoolean(IResource resource, String name) {
		return "true".equals(getString(resource, name));
	}
	
	public int getInt(IResource resource, String name) {
		return Integer.parseInt(getString(resource, name));
	}
	
	public double getDouble(IResource resource, String name) {
		return Double.parseDouble(getString(resource, name));
	}

	public String getString(IResource resource, String name) {
		return store.get(name);
	}
}
