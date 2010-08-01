/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.swc.ui.model;

import java.util.Collection;
import java.util.Map;

import com.google.common.collect.Maps;

public class SwcContainer extends SwcModelObject {

	Map<String, SwcContainer> containers;
	Map<String, SwcEntry> entries;

	public SwcContainer(SwcContainer parent, String name) {
		super(parent, name);
		containers = Maps.newHashMap();
		entries = Maps.newHashMap();
	}

	public boolean hasContainers() {
		return !containers.isEmpty();
	}

	public boolean hasEntries() {
		return !entries.isEmpty();
	}

	public Collection<SwcContainer> getContainers() {
		return containers.values();
	}

	public Collection<SwcEntry> getEntries() {
		return entries.values();
	}

	public SwcContainer addContainer(SwcContainer cont) {
		containers.put(cont.getName(), cont);
		return cont;
	}

	public SwcEntry addEntry(SwcEntry entry) {
		entries.put(entry.getName(), entry);
		return entry;
	}
}
