/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.debug.compiler;

import org.axdt.as3.debug.preferences.As3CompilerPreferences;
import org.axdt.compiler.AbstractDelegatingAxdtCompiler;
import org.axdt.launch.AxdtCompilerTarget;
import org.eclipse.core.resources.IFile;

public class As3DelegatingCompiler extends AbstractDelegatingAxdtCompiler {
	private static As3DelegatingCompiler instance = null;
	/**
	 * @return the singleton as3 compiler delegate
	 */
	public static As3DelegatingCompiler getInstance() {
		if (instance == null) {
			instance = new As3DelegatingCompiler();
		}
		return instance;
	}
	@Override
	protected String getDefaultCompilerId(AxdtCompilerTarget target) {
		return As3CompilerPreferences.getInstance().getStore().getString(As3CompilerPreferences.COMPILER_CHOICE);
	}
	@Override
	protected AxdtCompilerTarget createTargetFor(IFile file) {
		return new As3CompilerTarget(file);
	}
}
