/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model;

import java.util.List;

import junit.textui.TestRunner;

import org.axdt.core.AxdtCore;
import org.axdt.core.AxdtEFactory;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axdt Project Handle</b></em>'.
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
public class AxdtProjectHandleTest extends AxdtHandleTest {

	@Override
	protected IResource setDefaultResource() {
		IProject iProject = getIProject("foo");
		getFixture().setResource(iProject);
		return iProject;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AxdtProjectHandleTest.class);
	}

	/**
	 * Constructs a new Axdt Project Handle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtProjectHandleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Axdt Project Handle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxdtProjectHandle getFixture() {
		return (AxdtProjectHandle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AxdtEFactory.eINSTANCE.createAxdtProjectHandle());
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
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getRequiredProjectNames() <em>Get Required Project Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getRequiredProjectNames()
	 */
	public void testGetRequiredProjectNames() {
		assertNull(getFixture().getRequiredProjectNames());
		setDefaultResource();
		assertFalse(getFixture().isConnected());
		List<String> list = getFixture().getRequiredProjectNames();
		assertTrue(getFixture().isConnected());
		assertNotNull(list);
		assertTrue(list.isEmpty());
		// test rest in project source
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getDefaultPackageRoot() <em>Get Default Package Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getDefaultPackageRoot()
	 */
	public void testGetDefaultPackageRoot() {
		assertNull(getFixture().getDefaultPackageRoot());
		setDefaultResource();
		AxdtPackageRoot packageRoot = getFixture().getDefaultPackageRoot();
		assertNotNull(packageRoot);
		assertTrue(packageRoot instanceof AxdtPackageRootHandle);
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getConfiguredSourcePaths() <em>Get Configured Source Paths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getConfiguredSourcePaths()
	 */
	public void testGetConfiguredSourcePaths() {
		assertNull(getFixture().getConfiguredSourcePaths());
		setDefaultResource();
		List<IPath> list = getFixture().getConfiguredSourcePaths();
		assertNotNull(list);
		assertEquals(1, list.size());
		assertEquals("/foo/src", list.get(0).toString());
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#addToBuildSpec(java.lang.String) <em>Add To Build Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtProject#addToBuildSpec(java.lang.String)
	 */
	public void testAddToBuildSpec__String() throws CoreException {
		// delegating call connect on demand
		IProject iProject = getIProject("foo");
		createIProject(iProject);
		getFixture().setProject(iProject);
		assertFalse(getFixture().isConnected());
		getFixture().addToBuildSpec("fooo");
		assertTrue(getFixture().isConnected());
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#removeFromBuildSpec(java.lang.String) <em>Remove From Build Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtProject#removeFromBuildSpec(java.lang.String)
	 */
	public void testRemoveFromBuildSpec__String() throws CoreException {
		// delegating call connect on demand
		IProject iProject = getIProject("foo");
		createIProject(iProject);
		getFixture().setProject(iProject);
		assertFalse(getFixture().isConnected());
		getFixture().removeFromBuildSpec("fooo");
		assertTrue(getFixture().isConnected());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getPackageRoots() <em>Get Package Roots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getPackageRoots()
	 */
	public void testGetPackageRoots() {
		assertNull(getFixture().getPackageRoots());
		assertFalse(getFixture().isConnected());
		getFixture().setProject(getIProject("foo"));
		List<AxdtPackageRoot> list = getFixture().getPackageRoots();
		assertTrue(getFixture().isConnected());
		assertNotNull(list);
		assertFalse(list.isEmpty());
	}
	@Override
	public void testConnect() {
		assertNull(getFixture().getDelegate());
		assertFalse(getFixture().isConnected());
		getFixture().connect();
		assertNull(getFixture().getDelegate());
		assertFalse(getFixture().isConnected());
		getFixture().setProject(getIProject("foo"));
		getFixture().connect();
		assertNotNull(getFixture().getDelegate());
		assertTrue(getFixture().isConnected());
	}
	@Override
	public void testDisconnect() {
		getFixture().setProject(getIProject("foo"));
		getFixture().connect();
		assertNotNull(getFixture().getDelegate());
		assertTrue(getFixture().isConnected());
		getFixture().disconnect();
		assertNull(getFixture().getDelegate());
		assertFalse(getFixture().isConnected());
	}
	@Override
	public void testCheckDelegate() {
		assertNull(getFixture().checkDelegate());
		getFixture().setProject(getIProject("foo"));
		assertNull(getFixture().getDelegate());
		assertFalse(getFixture().isConnected());
		AxdtProjectSource delegate = getFixture().checkDelegate();
		assertNotNull(delegate);
		assertTrue(getFixture().isConnected());
		assertSame(delegate, getFixture().getDelegate());
	}
	@Override
	public void testExists() {
		assertFalse(getFixture().exists());
		IProject project = getIProject("test");
		createIProject(project);
		getFixture().setProject(project);
		assertFalse(getFixture().exists());
		getFixture().connect();
		assertTrue(getFixture().exists());
		AxdtCore.getModel().getConnectedProjects().remove(getFixture().getDelegate());
	}
	@Override
	public void testGetParent() {
		assertNull(getFixture().getParent());
		IProject project = getIProject("test");
		getFixture().setProject(project);
		assertNull(getFixture().getParent());
		getFixture().connect();
		assertSame(AxdtCore.getModel(), getFixture().getParent());
	}
} //AxdtProjectHandleTest
