/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import java.util.List;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public abstract class AvmTypeScope extends AvmElementScope<AvmDeclaredType> {

	protected final EObject ctx;

	public AvmTypeScope(IScope parent, AvmDeclaredType element, EObject initial, EReference ref) {
		super(parent, element, ref, parent);
		this.ctx = initial;
	}

	@Override
	protected Iterable<IEObjectDescription> getCandidates() {
		AvmTypeAccess access = AvmTypeAccess.Factory.thisAccess(element)
								.setStatic(true);
		if (ctx != null && ctx != element) {
			for (EObject current = ctx;current != null;) {
				EObject next = current.eContainer();
				if (next == element) {
					if (current instanceof AvmMember) {
						AvmMember member = (AvmMember) current;
						if (member.isStatic())
							access.setInstance(false);
					}
					break;
				}
				current = next;
			}
		}
		List<AvmMember> result = Lists.newArrayList();
		collectAllMembers(access, result, true, true);
		return Iterables.transform(result, GetDesciption);
	}
}