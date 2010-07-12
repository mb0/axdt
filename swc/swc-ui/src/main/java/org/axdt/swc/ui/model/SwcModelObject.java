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
