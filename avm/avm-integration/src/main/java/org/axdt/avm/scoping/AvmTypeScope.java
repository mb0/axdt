package org.axdt.avm.scoping;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmIdentifiable;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.collect.Iterables;

public class AvmTypeScope extends AvmElementScope<AvmDeclaredType> {

	public AvmTypeScope(AvmDeclaredType element, IScope parentScope) {
		super(element, parentScope);
	}

	@Override
	protected Iterable<? extends AvmIdentifiable> getCandidates() {
		return Iterables.filter(getAllMembers(element), new UniqueNames());
	}
}