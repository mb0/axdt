/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import java.util.List;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Element;
import org.axdt.as3.model.As3FieldDefinition;
import org.axdt.as3.model.As3Member;
import org.axdt.as3.model.As3Type;
import org.axdt.as3.model.IDirective;
import org.axdt.avm.model.impl.AvmElementImpl;
import org.eclipse.emf.ecore.EClass;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class As3ElementImpl extends AvmElementImpl implements As3Element {
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
	protected As3ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_ELEMENT;
	}
	protected List<As3Type> internalGetTypes(Iterable<IDirective> directives) {
		List<As3Type> result = Lists.newArrayList();
		for (IDirective dir:directives) {
			if (dir instanceof As3Type)
				result.add((As3Type) dir);
		}
		return result;
	}
	protected List<As3Member> internalGetMembers(Iterable<IDirective> directives) {
		List<As3Member> result = Lists.newArrayList();
		for (IDirective dir:directives) {
			if (dir instanceof As3Member) {
				result.add((As3Member) dir);
			} else if (dir instanceof As3FieldDefinition) {
				As3FieldDefinition def = (As3FieldDefinition) dir;
				result.addAll(def.getBindings());
			}
		}
		return result;
 	}
} //As3ElementImpl
