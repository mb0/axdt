/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3;

import org.axdt.as3.conversion.As3ValueConverterService;
import org.axdt.as3.formatting.As3HiddenTokenHelper;
import org.axdt.as3.formatting.As3ValueSerializer;
import org.axdt.as3.resource.As3ResourceDescriptionStrategy;
import org.axdt.as3.scoping.As3ImportScopeProvider;
import org.axdt.as3.validation.As3DiagnosticConverter;
import org.axdt.avm.access.AvmContainerManager;
import org.axdt.avm.naming.AvmQualifiedNameProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IValueSerializer;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.validation.IDiagnosticConverter;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class As3RuntimeModule extends org.axdt.as3.AbstractAs3RuntimeModule {
	

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder
			.bind(IScopeProvider.class)
			.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
			.to(As3ImportScopeProvider.class);
	}
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return AvmQualifiedNameProvider.class;
	}
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return As3ValueConverterService.class;
	}
	public Class<? extends IValueSerializer> bindIValueSerializer() {
		return As3ValueSerializer.class;
	}
	public Class<? extends IHiddenTokenHelper> bindIHiddenTokenHelper() {
		return As3HiddenTokenHelper.class;
	}
	public Class<? extends IDiagnosticConverter> bindIDiagnosticConverter() {
		return As3DiagnosticConverter.class;
	}
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return As3ResourceDescriptionStrategy.class;
	}

	public Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return AvmContainerManager.class;
	}
}
