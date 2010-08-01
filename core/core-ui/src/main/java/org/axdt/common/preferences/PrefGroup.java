/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.preferences;

public class PrefGroup {
	
	protected int flags;
	protected String title;
	protected boolean keepLayout;
	protected int start;
	protected int end;

	public PrefGroup(String title, boolean keepLayout, int flags, int startIndex) {
		this.title = title;
		this.keepLayout = keepLayout;
		this.start = startIndex;
		this.flags = flags;
	}

	public void setEnd(int endIndex) {
		this.end = endIndex;
	}

	public String getTitle() {
		return title;
	}

	public boolean keepLayout() {
		return keepLayout;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public int getFlags() {
		return flags;
	}
}
