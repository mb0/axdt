/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.naming;

import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * @author mb0
 */
public class AvmQualifiedNameProvider extends
		IQualifiedNameProvider.AbstractImpl {

	public String getQualifiedName(EObject obj) {
		return obj instanceof AvmDefinition
				&& obj.eContainer() instanceof AvmDefinitionContainer 
				? ((AvmDefinition) obj).getCanonicalName() 
				: null;
	}
}
