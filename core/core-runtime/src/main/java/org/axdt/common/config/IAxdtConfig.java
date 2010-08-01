/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.config;

import org.eclipse.core.resources.IResource;

public interface IAxdtConfig {
	String getConfigId();
	
    boolean getBoolean(IResource resource, String name);
    int getInt(IResource resource, String name);
    double getDouble(IResource resource, String name);
	String getString(IResource resource, String name);
}
