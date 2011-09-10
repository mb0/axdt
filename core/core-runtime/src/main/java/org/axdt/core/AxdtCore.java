/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core;

import org.axdt.common.config.IAxdtConfig;
import org.axdt.common.config.IAxdtConfigProvider;
import org.axdt.core.model.AxdtModel;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class AxdtCore extends Plugin {
	public static final String PLUGIN_ÌD = "org.axdt.core";
	// TODO compatibility with flexmojos
	public static final String NATURE_ID = "org.axdt.as3.imp.nature";
	// TODO compatibility with flexmojos
	public static final String BUILDER_ID = "org.eclipse.xtext.ui.shared.xtextBuilder";

	private static AxdtCore AXDT_CORE_PLUGIN;

	private AxdtModel model;
	private IAxdtConfigProvider configProvider;
	public void setConfigProvider(IAxdtConfigProvider configProvider) {
		this.configProvider = configProvider;
	}
	public IAxdtConfigProvider getConfigProvider() {
		return configProvider;
	}
	
	public static AxdtCore getPlugin() {
		return AXDT_CORE_PLUGIN;
	}
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		AXDT_CORE_PLUGIN = this;
		model = AxdtEFactory.eINSTANCE.createAxdtModel();
		configProvider = new IAxdtConfigProvider.ExtensionDelegate();
	}
	@Override
	public void stop(BundleContext context) throws Exception {
		try {
			AXDT_CORE_PLUGIN = null;
			model = null;
		} finally {
			super.stop(context);
		}
	}
	
	public static AxdtModel getModel() {
		if (AXDT_CORE_PLUGIN == null)
			throw new IllegalStateException("plugin is not active");
		return AXDT_CORE_PLUGIN.model;
	}
	
	public IAxdtConfig getAxdtConfig(String configId) {
		return configProvider != null ? configProvider.getAxdtConfig(configId) : null;
	}
	
	public <T extends IAxdtConfig> T getAxdtConfig(String key, Class<T> type) {
		IAxdtConfig axdtConfig = getAxdtConfig(key);
		return type.isInstance(axdtConfig) ? type.cast(axdtConfig) : null;
	}
}
