/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model;

import junit.textui.TestRunner;

import org.axdt.core.AxdtEFactory;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axdt Package Root Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtPackageRoot#isExternal() <em>Is External</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtPackageRoot#isArchive() <em>Is Archive</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtPackageRoot#getPackages() <em>Get Packages</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtPackageRoot#getPackage(java.lang.String) <em>Get Package</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtPackageRoot#addPackage(java.lang.String) <em>Add Package</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AxdtPackageRootSourceTest extends AxdtElementTest {
	@Override
	protected IResource setDefaultResource() {
		IProject iProject = getIProject("foo");
		// package root can be project
		getFixture().setResource(iProject);
		return iProject;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AxdtPackageRootSourceTest.class);
	}

	/**
	 * Constructs a new Axdt Package Root Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtPackageRootSourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Axdt Package Root Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxdtPackageRootSource getFixture() {
		return (AxdtPackageRootSource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AxdtEFactory.eINSTANCE.createAxdtPackageRootSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtPackageRoot#isExternal() <em>Is External</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtPackageRoot#isExternal()
	 */
	public void testIsExternal() {
		// TODO: enable external resources
		assertFalse(getFixture().isExternal());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtPackageRoot#isArchive() <em>Is Archive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtPackageRoot#isArchive()
	 */
	public void testIsArchive() {
		// TODO: enable archived resources
		assertFalse(getFixture().isExternal());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtPackageRoot#getPackages() <em>Get Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtPackageRoot#getPackages()
	 * @generated
	 */
	public void testGetPackages() {
		// TODO: implement this operation test method
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtPackageRoot#getPackage(java.lang.String) <em>Get Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtPackageRoot#getPackage(java.lang.String)
	 * @generated
	 */
	public void testGetPackage() {
		// TODO: implement this operation test method
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtPackageRoot#addPackage(java.lang.String) <em>Add Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtPackageRoot#addPackage(java.lang.String)
	 * @generated
	 */
	public void testAddPackage__String() {
		// TODO: implement this operation test method
	}
	@Override
	public void testGetParent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testExists() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testIsReadOnly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testIsConnected() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testConnect() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testDisconnect() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void testGetHandle() {
		IProject iProject = getIProject("foo");
		getFixture().setResource(iProject);
		AxdtPackageRootHandle handle = getFixture().getHandle();
		assertSame(iProject, handle.getResource());
		assertSame(getFixture(), handle.getDelegate());
	}

} //AxdtPackageRootSourceTest
