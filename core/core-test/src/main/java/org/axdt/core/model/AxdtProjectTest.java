/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model;

import org.eclipse.core.runtime.CoreException;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axdt Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtProject#getRequiredProjectNames() <em>Get Required Project Names</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProject#getDefaultPackageRoot() <em>Get Default Package Root</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProject#getConfiguredSourcePaths() <em>Get Configured Source Paths</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProject#addToBuildSpec(java.lang.String) <em>Add To Build Spec</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProject#removeFromBuildSpec(java.lang.String) <em>Remove From Build Spec</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtProject#getPackageRoots() <em>Get Package Roots</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AxdtProjectTest extends AxdtElementTest {

	/**
	 * Constructs a new Axdt Project test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtProjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Axdt Project test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxdtProject getFixture() {
		return (AxdtProject)fixture;
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getRequiredProjectNames() <em>Get Required Project Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getRequiredProjectNames()
	 */
	public abstract void testGetRequiredProjectNames();

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getDefaultPackageRoot() <em>Get Default Package Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getDefaultPackageRoot()
	 */
	public abstract void testGetDefaultPackageRoot();

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getConfiguredSourcePaths() <em>Get Configured Source Paths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getConfiguredSourcePaths()
	 */
	public abstract void testGetConfiguredSourcePaths();

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#addToBuildSpec(java.lang.String) <em>Add To Build Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtProject#addToBuildSpec(java.lang.String)
	 */
	public abstract void testAddToBuildSpec__String() throws CoreException;

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#removeFromBuildSpec(java.lang.String) <em>Remove From Build Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtProject#removeFromBuildSpec(java.lang.String)
	 */
	public abstract void testRemoveFromBuildSpec__String() throws CoreException;

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getPackageRoots() <em>Get Package Roots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getPackageRoots()
	 */
	public abstract void testGetPackageRoots();

} //AxdtProjectTest
