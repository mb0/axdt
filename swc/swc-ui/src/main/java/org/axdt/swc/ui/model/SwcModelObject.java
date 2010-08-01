/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.swc.ui.model;

public class SwcModelObject {

	protected final String name;
	protected final SwcContainer parent;

	public SwcModelObject(SwcContainer parent, String name) {
		this.parent = parent;
		this.name = name;
	}

	public SwcContainer getParent() {
		return parent;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
