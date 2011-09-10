package org.axdt.avm.naming;

import java.io.Serializable;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;

/**
 * Serializeable version of QualifiedName
 * incomplete implementation
 * @author mb0
 */
public class AvmQualifiedName extends QualifiedName implements Serializable {

	public static final AvmQualifiedName EMPTY = new AvmQualifiedName("");
	private static final long serialVersionUID = 1L;
	public static AvmQualifiedName create(String... segments) {
		if (segments != null) {
			for (String segment : segments)
				if (segment == null) {
					throw new IllegalArgumentException("Segment cannot be null");
				}
		}
		return segments != null ? 
				new AvmQualifiedName(segments.clone()) : EMPTY;
	}
	public static AvmQualifiedName ensure(QualifiedName qualifiedName) {
		if (qualifiedName == null) return null;
		if (qualifiedName instanceof AvmQualifiedName)
			return (AvmQualifiedName) qualifiedName;
		List<String> list = qualifiedName.getSegments();
		return new AvmQualifiedName(list.toArray(new String[list.size()]));
	}
	public AvmQualifiedName(String... segments) {
		super(segments);
	}
	public AvmQualifiedName append(String segment) {
		int count = getSegmentCount();
		String[] newSegments = getSegments().toArray(new String[count + 1]);
		newSegments[count] = segment;
		return new AvmQualifiedName(newSegments);
	}

	public AvmQualifiedName skipLast(int skipCount) {
		int count = getSegmentCount();
		if (skipCount == count) {
			return EMPTY;
		}
		if (skipCount > count || skipCount < 0) {
			throw new IllegalArgumentException("Cannot skip " + skipCount + " fragments from QualifiedName with "
					+ count + " segments");
		}
		List<String> list = getSegments().subList(0, count-skipCount);
		return new AvmQualifiedName(list.toArray(new String[list.size()]));
	}
}
