package org.axdt.as3.debug.compiler;

import org.axdt.as3.debug.preferences.As3CompilerPreferences;
import org.axdt.compiler.AbstractDelegatingAxdtCompiler;
import org.axdt.compiler.AxdtCompilerTarget;
import org.eclipse.core.resources.IFile;

public class As3CompilerDelegate extends AbstractDelegatingAxdtCompiler {
	private static As3CompilerDelegate instance = null;
	/**
	 * @return the singleton as3 compiler delegate
	 */
	public static As3CompilerDelegate getInstance() {
		if (instance == null) {
			instance = new As3CompilerDelegate();
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
