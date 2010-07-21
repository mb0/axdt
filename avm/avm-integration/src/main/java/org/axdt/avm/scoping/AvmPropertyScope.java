package org.axdt.avm.scoping;

import java.util.Collections;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.common.collect.Iterables;

public abstract class AvmPropertyScope<T extends EObject> extends AvmGenericScope<T> {

	public AvmPropertyScope(T element, EReference ref, IScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
	}

	@Override
	protected Iterable<? extends AvmReferable> getCandidates() {
		AvmType type = getQualifierType();
		Iterable<AvmReferable> dynIdent = null;
		if (type != null) {
			type = resolveType(type);
			if (type.isDynamic()) {
				EObject reference = getReference();
				if (reference != null) {
					String text = getReferenceText(reference);
					if (text != null)
						dynIdent = Collections.singleton(getDynamicIdentifiable(text));
				}
			}
			if (type instanceof AvmDeclaredType) {
				AvmDeclaredType typeDec = (AvmDeclaredType) type;
				Iterable<? extends AvmReferable> members = getAllMembers(typeDec);
				if (dynIdent != null)
					members = Iterables.concat(members, dynIdent);
				return Iterables.filter(members, new UniqueNames());
			}
		}
		if (dynIdent != null) return dynIdent;
		return Iterables.emptyIterable();
	}
	
	protected abstract AvmType getQualifierType();
	protected abstract EObject getReference();
}
