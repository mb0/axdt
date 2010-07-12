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
 * A test case for the model object '<em><b>Axdt Package Root Handle</b></em>'.
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
public class AxdtPackageRootHandleTest extends AxdtHandleTest {
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
		TestRunner.run(AxdtPackageRootHandleTest.class);
	}

	/**
	 * Constructs a new Axdt Package Root Handle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtPackageRootHandleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Axdt Package Root Handle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxdtPackageRootHandle getFixture() {
		return (AxdtPackageRootHandle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AxdtEFactory.eINSTANCE.createAxdtPackageRootHandle());
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
		// TODO: add support for external files
		assertFalse(getFixture().isExternal());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtPackageRoot#isArchive() <em>Is Archive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtPackageRoot#isArchive()
	 */
	public void testIsArchive() {
		// TODO: add support for archived files
		assertFalse(getFixture().isExternal());
	}
	@Override
	public void testConnect() {
	}
	@Override
	public void testDisconnect() {
	}
	@Override
	public void testExists() {
	}
	@Override
	public void testGetParent() {
	}
	@Override
	public void testIsReadOnly() {
		
	}
	@Override
	public void testCheckDelegate() {
		// TODO Auto-generated method stub
		
	}
} //AxdtPackageRootHandleTest
