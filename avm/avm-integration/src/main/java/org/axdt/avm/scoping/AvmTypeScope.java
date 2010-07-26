package org.axdt.avm.scoping;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmReferable;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScopeProvider;

public class AvmTypeScope extends AvmElementScope<AvmDeclaredType> {

	public AvmTypeScope(AvmDeclaredType element, EReference ref, IScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
	}

	@Override
	protected Iterable<? extends AvmReferable> getCandidates() {
		return getAllMembers(element);
	}
}