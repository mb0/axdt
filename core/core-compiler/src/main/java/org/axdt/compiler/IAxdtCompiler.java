/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.compiler;

import org.axdt.common.IAxdtExtension;
import org.axdt.launch.AxdtLaunchContext;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author mb0
 */
public interface IAxdtCompiler extends IAxdtExtension {
	String EXTENSION_ID = "org.axdt.core.compiler.axdtCompiler";
	
	boolean compile(AxdtLaunchContext context, IProgressMonitor monitor) throws Exception;
}
