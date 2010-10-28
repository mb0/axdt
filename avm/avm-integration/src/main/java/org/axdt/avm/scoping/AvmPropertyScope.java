/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import java.util.Collections;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import com.google.common.collect.Iterables;

public abstract class AvmPropertyScope<T extends EObject> extends AvmGenericScope<T> {

	public AvmPropertyScope(T element, EReference ref, AvmScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
	}

	@Override
	protected Iterable<? extends AvmReferable> getCandidates() {
		AvmTypeAccess access = getQualifierType();
		Iterable<AvmReferable> dynIdent = null;
		if (access != null && access != AvmTypeAccess.NULL) {
			AvmType type = access.getType();
			type = resolveType(type, null);
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
				Iterable<? extends AvmReferable> members = getAllMembers(typeDec, access);
				if (dynIdent != null)
					members = Iterables.concat(members, dynIdent);
				return members;
			}
		}
		if (dynIdent != null) return dynIdent;
		return Collections.emptySet();
	}
	
	protected abstract AvmTypeAccess getQualifierType();
	protected abstract EObject getReference();
}
