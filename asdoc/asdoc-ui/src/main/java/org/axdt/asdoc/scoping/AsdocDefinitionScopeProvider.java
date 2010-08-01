/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.scoping;

import org.axdt.asdoc.access.AsdocDefinitionProviderFactory;
import org.axdt.asdoc.access.IAsdocDefinitionProvider;
import org.axdt.avm.access.IDefinitionProvider;
import org.axdt.avm.access.IDefinitionProvider.Factory;
import org.axdt.avm.scoping.AvmDefinitionScope;
import org.axdt.avm.scoping.AbstractDefinitionScopeProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class AsdocDefinitionScopeProvider extends AbstractDefinitionScopeProvider {

	@Inject
	private AsdocDefinitionProviderFactory definitionProviderFactory;

	@Override
	public AvmDefinitionScope createDefinitionScope(IDefinitionProvider definitionProvider) {
		return new AsdocDefinitionScope((IAsdocDefinitionProvider) definitionProvider, false);
	}

	@Override
	public AvmDefinitionScope createTypeScope(IDefinitionProvider definitionProvider) {
		return new AsdocDefinitionScope((IAsdocDefinitionProvider) definitionProvider, true);
	}

	public void setDefinitionProviderFactory(AsdocDefinitionProviderFactory typeProviderFactory) {
		this.definitionProviderFactory = typeProviderFactory;
	}

	public Factory getDefinitionProviderFactory() {
		return definitionProviderFactory;
	}
}
