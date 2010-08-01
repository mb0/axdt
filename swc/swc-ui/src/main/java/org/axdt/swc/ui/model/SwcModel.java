/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.swc.ui.model;

public class SwcModel extends SwcContainer {

	protected final String modelName;
	protected final SwcContainer files;
	protected final SwcContainer catalog;

	public SwcModel(String modelName) {
		super(null, "");
		this.modelName = modelName;
		files = addContainer(new SwcContainer(this, "files"));
		catalog = addContainer(new SwcContainer(this, "catalog"));
	}

	public void addScriptName(String value) {
		// expects a string id of the format some.package:Entry
		String[] split = value.split(":");
		String[] packs;
		String entryName;
		if (split.length == 2) {
			packs = split[0].split("\\.");
			entryName = split[1];
		} else {
			packs = new String[0];
			entryName = split[0];
		}

		SwcContainer current = catalog;
		for (String packName : packs) {
			SwcContainer pack = current.containers.get(packName);
			if (pack == null) {
				pack = new SwcPackage(current, packName);
				current.addContainer(pack);
			}
			current = pack;
		}
		current.addEntry(new SwcEntry(current, entryName));
	}

	public void addFileName(String name) {
		int lastSlash = name.lastIndexOf("/");
		String entryName = lastSlash < 0 ? name : name.substring(lastSlash + 1);
		String[] conts = lastSlash < 0 ? new String[0] : name.substring(0,
				lastSlash).split("/");
		SwcContainer current = files;
		for (String contName : conts) {
			SwcContainer pack = current.containers.get(contName);
			if (pack == null) {
				pack = new SwcContainer(current, contName);
				current.addContainer(pack);
			}
			current = pack;
		}
		current.addEntry(new SwcEntry(current, entryName));
	}

	public String getModelName() {
		return modelName;
	}

	@Override
	public String toString() {
		return "catalog.xml";
	}
}
