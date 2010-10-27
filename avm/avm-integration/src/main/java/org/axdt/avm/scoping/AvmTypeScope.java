/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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