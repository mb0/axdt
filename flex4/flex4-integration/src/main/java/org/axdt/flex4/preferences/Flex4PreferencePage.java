/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.flex4.preferences;

import org.axdt.common.preferences.AbstractPreferencePage;

public class Flex4PreferencePage extends AbstractPreferencePage {
	public Flex4PreferencePage() {
		super(Flex4Preferences.getInstance());
	}
}
