/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core.model;

import java.util.List;

import junit.textui.TestRunner;

import org.axdt.core.AxdtCore;
import org.axdt.core.AxdtEFactory;
import org.axdt.core.MockCoreConfigProvider;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axdt Project Source</b></em>'.
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
 */
public class AxdtProjectSourceTest extends AxdtProjectTest {

	@Override
	protected IProject setDefaultResource() {
		IProject iProject = getIProject("foo");
		getFixture().setProject(iProject);
		return iProject;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AxdtProjectSourceTest.class);
	}

	/**
	 * Constructs a new Axdt Project Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtProjectSourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Axdt Project Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxdtProjectSource getFixture() {
		return (AxdtProjectSource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AxdtEFactory.eINSTANCE.createAxdtProjectSource());
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
		List<String> names = getFixture().getRequiredProjectNames();
		assertNotNull(names);
		assertTrue(names.isEmpty());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getDefaultPackageRoot() <em>Get Default Package Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getDefaultPackageRoot()
	 */
	public void testGetDefaultPackageRoot() {
		assertNull(getFixture().getDefaultPackageRoot());
		IProject iProject = getIProject("bar");
		getFixture().setProject(iProject);
		// if we have no configuration use the project root
		AxdtPackageRoot root = getFixture().getDefaultPackageRoot();
		assertEquals(iProject, root.getResource());
		MockCoreConfigProvider.install();
		root = getFixture().getDefaultPackageRoot();
		assertNotNull(root);
		assertEquals("/bar/src", root.getPath().toString());
		MockCoreConfigProvider.uninstall();
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getConfiguredSourcePaths() <em>Get Configured Source Paths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getConfiguredSourcePaths()
	 */
	public void testGetConfiguredSourcePaths() {
		assertNull(getFixture().getConfiguredSourcePaths());
		getFixture().setProject(getIProject("bar"));
		assertTrue(getFixture().getConfiguredSourcePaths().isEmpty());
		MockCoreConfigProvider.install();
		List<IPath> paths = getFixture().getConfiguredSourcePaths();
		assertEquals(2, getFixture().getConfiguredSourcePaths().size());
		assertEquals("/bar/src", paths.get(0).toString());
		assertEquals("/bar/test", paths.get(1).toString());
		MockCoreConfigProvider.uninstall();
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#addToBuildSpec(java.lang.String) <em>Add To Build Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtProject#addToBuildSpec(java.lang.String)
	 */
	public void testAddToBuildSpec__String() throws CoreException {
		IProject iProject = getIProject("test");
		createIProject(iProject);
		assertEquals(0, iProject.getDescription().getBuildSpec().length);
		getFixture().setProject(iProject);
		getFixture().addToBuildSpec("foo.bar.Spam");
		ICommand[] specs = iProject.getDescription().getBuildSpec();
		assertEquals(1, specs.length);
		assertEquals("foo.bar.Spam", specs[0].getBuilderName());
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#removeFromBuildSpec(java.lang.String) <em>Remove From Build Spec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtProject#removeFromBuildSpec(java.lang.String)
	 */
	public void testRemoveFromBuildSpec__String() throws CoreException {
		IProject iProject = getIProject("test");
		createIProject(iProject);
		assertEquals(0, iProject.getDescription().getBuildSpec().length);
		getFixture().setProject(iProject);
		getFixture().addToBuildSpec("foo.bar.Spam");
		assertEquals(1, iProject.getDescription().getBuildSpec().length);
		getFixture().removeFromBuildSpec("foo.bar.Spam");
		assertEquals(0, iProject.getDescription().getBuildSpec().length);
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtProject#getPackageRoots() <em>Get Package Roots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject#getPackageRoots()
	 */
	public void testGetPackageRoots() {
		assertNull(getFixture().getPackageRoots());
		IProject iProject = getIProject("bar");
		getFixture().setProject(iProject);
		List<AxdtPackageRoot> roots = getFixture().getPackageRoots();
		assertEquals(1, roots.size());
		assertEquals(iProject, roots.get(0).getResource());
		MockCoreConfigProvider.install();
		roots = getFixture().getPackageRoots();
		assertEquals(2, roots.size());
		assertEquals("/bar/src", roots.get(0).getPath().toString());
		assertEquals("/bar/test", roots.get(1).getPath().toString());
		MockCoreConfigProvider.uninstall();
	}
	@Override
	public void testGetParent() {
		assertNull(getFixture().getParent());
		AxdtModel model = AxdtEFactory.eINSTANCE.createAxdtModel();
		getFixture().setParent(model);
		assertSame(model, getFixture().getParent());
		getFixture().setParent(null);
		assertNull(getFixture().getParent());
	}
	public void testGetParent2() {
		assertNull(getFixture().getParent());
		AxdtModel model = AxdtEFactory.eINSTANCE.createAxdtModel();
		model.getConnectedProjects().add(getFixture());
		assertSame(model, getFixture().getParent());
		model.getConnectedProjects().remove(getFixture());
		assertNull(getFixture().getParent());
	}
	@Override
	public void testExists() {
		assertFalse(getFixture().exists());
		setDefaultResource();
		IProject iProject = getIProject("foo");
		createIProject(iProject);
		getFixture().setProject(iProject);
		assertFalse(getFixture().exists());
		AxdtModel model = AxdtCore.getModel();
		getFixture().setParent(model);
		assertTrue(getFixture().exists());
		// only update to equal resource handle is allowed
		getFixture().setProject(getIProject("foo"));
		assertTrue(getFixture().exists());
		// or the axdt project is closed
		getFixture().setProject(getIProject("bar"));
		assertFalse(getFixture().exists());
	}
	@Override
	public void testConnect() {
		
	}
	@Override
	public void testDisconnect() {
		
	}
	@Override
	public void testIsReadOnly() {
		
	}
	@Override
	public void testGetHandle() {
		IProject iProject = getIProject("foo");
		getFixture().setProject(iProject);
		AxdtProjectHandle handle = getFixture().getHandle();
		assertSame(iProject, handle.getProject());
		assertSame(getFixture(), handle.getDelegate());
	}
} //AxdtProjectSourceTest
