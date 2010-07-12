package org.axdt.common.preferences;

public class PrefGroup {

	private String title;
	private boolean keepLayout;
	private int start;
	private int end;

	public PrefGroup(String title, boolean keepLayout, int startIndex) {
		this.title = title;
		this.keepLayout = keepLayout;
		start = startIndex;
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
}
