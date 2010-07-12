package org.axdt.as3.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

import com.google.common.base.Join;
import com.google.common.collect.Lists;

public class As3QName extends QualifiedName {

		private final List<String> qualifier;
		private final String name;

		public As3QName(String name) {
			this(Collections.singletonList(""), name);
		}
		public As3QName(String quali, String name) {
			this(Strings.split(quali, "."),name);
		}
		public As3QName(List<String> quali, String name) {
			super("");
			this.qualifier = quali;
			this.name = name;
		}
		@Override
		public List<String> segments() {
			if (hasWildCard()) return Collections.unmodifiableList(qualifier);
			ArrayList<String> result = Lists.newArrayList(qualifier);
			result.add(name);
			return result;
		}
		@Override
		public boolean hasWildCard() {
			return "*".equals(name);
		}
		@Override
		public String toString() {
			return qualifier.isEmpty() ? name : Join.join(".", qualifier).concat("::"+name);
		}
		@Override
		public String lastSegment() {
			if (!hasWildCard()) return name;
			return qualifier.isEmpty() ? null : qualifier.get(qualifier.size()-1);
		}
		
		public QualifiedName replaceWildcard(String fragment) {
			if (!hasWildCard())
				throw new IllegalStateException("No wildcard");
			return new As3QName(qualifier,fragment);
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
			As3QName other = (As3QName) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (qualifier == null) {
				if (other.qualifier != null)
					return false;
			} else if (!qualifier.equals(other.qualifier))
				return false;
			return true;
		}
	}