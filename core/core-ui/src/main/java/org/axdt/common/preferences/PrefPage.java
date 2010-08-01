/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.preferences;

import java.util.List;

public class PrefPage {

	private final String key;
	private final AbstractPreferences pref;
	private String desc;
	FieldSpec<?>[] specs;
	PrefGroup[] groups;

	public PrefPage(AbstractPreferences pref, String key, String desc) {
		this.pref = pref;
		this.key = key;
		this.desc = desc;
	}

	public String getKey() {
		return key;
	}

	public String getDescription() {
		return desc;
	}

	public void setSpecs(List<FieldSpec<?>> list) {
		specs = list.toArray(new FieldSpec[list.size()]);
	}

	public AbstractPreferences getPreferences() {
		return pref;
	}

	public FieldSpec<?>[] getFieldSpecs() {
		return specs;
	}

	public void setGroups(List<PrefGroup> list) {
		groups = list.toArray(new PrefGroup[list.size()]);
	}

	public PrefGroup openGroup(int index) {
		for (PrefGroup g:groups) {
			if (g.getStart() == index) return g;
		}
		return null;
	}

	public PrefGroup closeGroup(int index) {
		for (PrefGroup g:groups) {
			if (g.getEnd() == index) return g;
		}
		return null;
	}
}
