/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.naming;

import org.axdt.avm.model.AvmDefinition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * @author mb0
 */
public class AvmQualifiedNameProvider extends
		IQualifiedNameProvider.AbstractImpl {

	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof AvmDefinition) {
			return ((AvmDefinition) obj).getQualifiedName();
		}
		return null;
	}
}
