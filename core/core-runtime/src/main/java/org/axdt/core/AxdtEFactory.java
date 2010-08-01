/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core;

import org.axdt.core.model.AxdtModel;
import org.axdt.core.model.AxdtPackageRootHandle;
import org.axdt.core.model.AxdtPackageRootSource;
import org.axdt.core.model.AxdtProjectHandle;
import org.axdt.core.model.AxdtProjectSource;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.core.AxdtEPackage
 * @generated
 */
public interface AxdtEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AxdtEFactory eINSTANCE = org.axdt.core.model.impl.AxdtEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Axdt Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axdt Model</em>'.
	 * @generated
	 */
	AxdtModel createAxdtModel();

	/**
	 * Returns a new object of class '<em>Axdt Project Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axdt Project Source</em>'.
	 * @generated
	 */
	AxdtProjectSource createAxdtProjectSource();

	/**
	 * Returns a new object of class '<em>Axdt Project Handle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axdt Project Handle</em>'.
	 * @generated
	 */
	AxdtProjectHandle createAxdtProjectHandle();

	/**
	 * Returns a new object of class '<em>Axdt Package Root Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axdt Package Root Source</em>'.
	 * @generated
	 */
	AxdtPackageRootSource createAxdtPackageRootSource();

	/**
	 * Returns a new object of class '<em>Axdt Package Root Handle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axdt Package Root Handle</em>'.
	 * @generated
	 */
	AxdtPackageRootHandle createAxdtPackageRootHandle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AxdtEPackage getAxdtEPackage();

} //AxdtEFactory
