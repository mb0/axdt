/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avm Declared Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.axdt.avm.AvmEPackage#getAvmDeclaredType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AvmDeclaredType extends AvmDeclaredElement, AvmType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.axdt.avm.model.List<org.axdt.avm.model.AvmTypeReference>" many="false"
	 * @generated
	 */
	List<AvmTypeReference> getSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AvmTypeReference getExtendedClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.axdt.avm.model.List<T>" many="false"
	 * @generated
	 */
	<T extends AvmTypeReference> List<T> getExtendedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.axdt.avm.model.List<T>" many="false"
	 * @generated
	 */
	<T extends AvmMember> List<T> getMembers();

} // AvmDeclaredType
