package org.axdt.as3.scoping;



public class As3ImportNormalizer {

	public final String name;
	public final String qualifier;
	
	public static As3ImportNormalizer parse(String raw) {
		int lastIndex = raw.indexOf("::"), offset = 2;
		String qualifier, name;
		if (lastIndex<0) {
			--offset;
			lastIndex = raw.indexOf('.');
			if (lastIndex<0)
				return new As3ImportNormalizer(raw, null);
		}
		name = raw.substring(0,lastIndex);
		qualifier = raw.substring(lastIndex+offset);
		return new As3ImportNormalizer(name, qualifier);
	}
	
	public As3ImportNormalizer(String name, String qualifier) {
		this.name = "*".equals(name) ? null : name;
		this.qualifier = qualifier;
	}

	@Override
	public String toString() {
		return toString(name);
	}
	public String toString(String name) {
		return (qualifier == null ? "" : qualifier )+"::"+ (name == null ? "*" : name);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qualifier == null) ? 0 : qualifier.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		As3ImportNormalizer other = (As3ImportNormalizer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return equalsQualifier(other);
	}
	
	public boolean equalsQualifier(As3ImportNormalizer other) {
		if (qualifier == null) {
			if (other.qualifier != null)
				return false;
		} else if (!qualifier.equals(other.qualifier))
			return false;
		return true;
	}
	
	public String shortToLongName(String shortName) {
		if (name != null) {
			if (name.equals(shortName)) {
				return toString();
			}
		} else {
			return toString(shortName);
		}
		return null;
	}

	public String longToShortName(String from) {
		if (name != null) {
			if (name.equals(from)) {
				return name;
			}
		} else {
			As3ImportNormalizer fromRaw = parse(from);
			if (equalsQualifier(fromRaw)) {
				return fromRaw.name;
			}
		}
		return null;
	}
}
