/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
