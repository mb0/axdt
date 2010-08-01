/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.swf;

import java.net.URL;

import org.axdt.common.IAxdtExtension;

/**
 * @author nkuebler
 * @author mb0
 */
public interface IAxdtSwfPlayer extends IAxdtExtension {
	String EXTENSION_ID = "org.axdt.core.runtime.swfPlayer";
	
	IAxdtSwfPlayerInstance launch(URL target) throws Exception;
	boolean isAvailable();
}
