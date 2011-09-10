/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.preferences;

import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.axdt.common.preferences.AbstractPreferences;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class Flex4Preferences extends AbstractPreferences {

	public static final String FLEX_CONFIG_FILE = "flexConfig";

	private static Flex4Preferences instance;

	public static Flex4Preferences getInstance() {
		if (instance == null) {
			instance = new Flex4Preferences();
		}
		return instance;
	}

	public Flex4Preferences() {
		super("Flex SDK preferences");
	}

	public String getQualifier() {
		return "org.axdt.sdk.flex4";
	}

	public URL getDefaultConfig() {
		Bundle bundle = Platform.getBundle(getQualifier());
		Path path = new Path("flexsdk/frameworks/flex-config.xml");
		URL[] urls = FileLocator.findEntries(bundle, path);
		try {
			if (urls.length > 0)
				return FileLocator.resolve(urls[0]);
		} catch (IOException e) {
			Logger.getLogger(getClass()).error(
					"error resolving flex config file", e);
		}
		return null;
	}

	public void initializeFieldSpecs() {
		addGroup("Flex SDK", true);
		URL url = getDefaultConfig();
		String path = url == null ? "ERROR" : url.getPath();
		add(FLEX_CONFIG_FILE, "Default &config", path);
		// TODO add help link
	}
}
