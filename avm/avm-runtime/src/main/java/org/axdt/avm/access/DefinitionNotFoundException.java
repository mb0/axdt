/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

public class DefinitionNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DefinitionNotFoundException() {
		super();
	}

	public DefinitionNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public DefinitionNotFoundException(String message) {
		super(message);
	}

	public DefinitionNotFoundException(Throwable cause) {
		super(cause);
	}
}
