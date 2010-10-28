/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EFactory;
import org.axdt.as3.As3EPackage;

import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.IExpression;

import org.axdt.avm.model.AvmType;
import org.axdt.avm.util.AvmTypeAccess;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IExpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class IExpressionImpl extends MinimalEObjectImpl.Container implements IExpression {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int flags = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.IEXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract AvmTypeAccess resolveType();

	protected As3Class getClassProxy(String typeName) {
		As3Class proxy = As3EFactory.eINSTANCE.createAs3Class();
		URI uri = URI.createURI("avm:/types/"+typeName);
		((InternalEObject) proxy).eSetProxyURI(uri);
		return proxy;
	}

	protected boolean checkTypeName(AvmType type, String... names) {
		String typeName = null;
		if (type.eIsProxy()) {
			InternalEObject internal = (InternalEObject) type;
			URI proxyURI = internal.eProxyURI();
			if ("avm".equals(proxyURI.scheme())) {
				String uri = internal.eProxyURI().toString();
				String prefix = "avm:/types/";
				if (uri.startsWith(prefix))
					typeName = uri.substring(prefix.length());
				else // unexpected type proxy uri
					return false;
			} else {
				type = (AvmType) EcoreUtil2.resolve(type, this);
				if (type.eIsProxy()) // could not be resolved
					return false;
			}
		}
		if (typeName == null)
			typeName = type.getCanonicalName();
		for (String string : names)
			if (string.equals(typeName))
				return true;
		return false;
	}
} //IExpressionImpl
