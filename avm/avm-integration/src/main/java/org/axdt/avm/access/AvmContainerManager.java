/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;


import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;


public class AvmContainerManager extends StateBasedContainerManager {

	protected IContainer createContainer(final String handle,
			final IResourceDescriptions resourceDescriptions) {
		return new AvmContainer(super.createContainer(handle,
				resourceDescriptions), handle);
	}
}
