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
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import com.google.inject.internal.Lists;

public class AvmTypeScope extends AvmElementScope<AvmDeclaredType> {

	protected final EObject ctx;

	public AvmTypeScope(AvmDeclaredType element, EObject initial, EReference ref, AvmScopeProvider scopeProvider) {
		super(element, ref, scopeProvider);
		this.ctx = initial;
	}

	@Override
	protected Iterable<? extends AvmReferable> getCandidates() {
		AvmTypeAccess access = new AvmTypeAccess.Extended(element, true, true, true, true);
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
		return result;
	}
}