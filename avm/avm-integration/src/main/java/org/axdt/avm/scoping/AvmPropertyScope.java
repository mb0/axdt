/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import java.util.Collections;

import org.axdt.avm.access.AvmContainerPackage;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.collect.Iterables;

public abstract class AvmPropertyScope<T extends EObject> extends AvmGenericScope<T> {

	public AvmPropertyScope(IScope parent, T element, EReference ref, IScope lookup) {
		super(parent, element, ref, lookup);
	}
	
	@Override
	protected Iterable<IEObjectDescription> getCandidates() {
		AvmTypeAccess access = getQualifierType();
		if (access == null) return Collections.emptySet();
		Iterable<IEObjectDescription> dynDesc = null;
		if (access instanceof AvmTypeAccess.Builder) {
			AvmPackage pack = ((AvmTypeAccess.Builder) access).getPackage();
			if (pack instanceof AvmContainerPackage) {
				return ((AvmContainerPackage) pack).getChildren();
			}
			return Iterables.transform(Iterables.filter(pack.eContents(), AvmReferable.class), GetDesciption);
		} else if (access != AvmTypeAccess.NULL) {
			AvmType type = access.getType();
			type = resolveType(type, null);
			if (type.isDynamic()) {
				AvmReferable dynIdent = getDynamicIdentifiable(getReference());
				if (dynIdent != null)
					dynDesc = Collections.singleton(GetDesciption.apply(dynIdent));
			}
			if (type instanceof AvmDeclaredType) {
				AvmDeclaredType typeDec = (AvmDeclaredType) type;
				Iterable<IEObjectDescription> members = Iterables.transform(getAllMembers(typeDec, access), GetDesciption);
				if (dynDesc != null)
					members = Iterables.concat(members, dynDesc);
				return members;
			}
		}
		if (dynDesc != null) return dynDesc;
		return Collections.emptySet();
	}
	
	protected abstract AvmTypeAccess getQualifierType();
	protected abstract EObject getReference();
}
