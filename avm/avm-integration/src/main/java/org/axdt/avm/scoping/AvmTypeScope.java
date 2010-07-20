package org.axdt.avm.scoping;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmIdentifiable;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.common.collect.Iterables;

public class AvmTypeScope extends AvmElementScope<AvmDeclaredType> {

	public AvmTypeScope(AvmDeclaredType element, EReference ref, IScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
	}

	@Override
	protected Iterable<? extends AvmIdentifiable> getCandidates() {
		return Iterables.filter(getAllMembers(element), new UniqueNames());
	}
}