/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocConstructor;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AsdocConstructorImpl extends AsdocExecutableImpl implements AsdocConstructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_CONSTRUCTOR;
	}

	public AvmTypeReference getReturnType() {
		if (eContainer() instanceof AvmDeclaredType) {
			AvmDeclaredTypeReference reference = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
			reference.setType((AvmType) eContainer());
			return reference;
		}
		return null;
	}
} //AsdocConstructorImpl
