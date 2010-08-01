/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.compiler;

/**
 * @author mb0
 */
public interface AxdtCompilerConfig {

	String LAUNCH_MODE = "launchMode";
	String COMPILER_CHOICE = "compiler";
	String COMPATIBILITY_CHOICE = "compatibility";
	String CACHE_CHOICE = "cache";

	String CHOICE_FILE = "file";
	String CHOICE_MEMORY = "memory";
	String CHOICE_NONE = "none";
}
