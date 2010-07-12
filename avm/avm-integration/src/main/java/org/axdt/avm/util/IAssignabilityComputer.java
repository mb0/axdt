package org.axdt.avm.util;

import org.axdt.avm.model.AvmTypeReference;

import com.google.inject.ImplementedBy;

@ImplementedBy(AssignabilityComputer.class)
public interface IAssignabilityComputer {
	/**
	 * returns whether the type reference on the right can be assigned to the type reference on the left.
	 * Example:
	 * 
	 *   List<?> left = (List<? extends String>) right;
	 * 
	 */
	public boolean isAssignableFrom(AvmTypeReference left, AvmTypeReference right);
}
