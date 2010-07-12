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
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axdt Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtModel#getProject(org.eclipse.core.resources.IProject) <em>Get Axdt Project</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtModel#hasAxdtNature(org.eclipse.core.resources.IProject) <em>Has Axdt Nature</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtModel#newBuilderCommand(org.eclipse.core.resources.IProjectDescription, java.lang.String) <em>New Builder Command</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtModel#getWorkspace() <em>Get Workspace</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getPath() <em>Get Path</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getResource() <em>Get Resource</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getParent() <em>Get Parent</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#isReadOnly() <em>Is Read Only</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getElementName() <em>Get Element Name</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#open(org.eclipse.core.runtime.IProgressMonitor) <em>Open</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#sync(org.eclipse.core.runtime.IProgressMonitor) <em>Sync</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#close() <em>Close</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#isOpen() <em>Is Open</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#exists() <em>Exists</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#isHandle() <em>Is Handle</em>}</li>
 * </ul>
 * </p>
 */
public class AxdtModelTest extends AxdtElementTest {

	@Override
	protected IResource setDefaultResource() {
		throw new RuntimeException("unexpected");
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AxdtModelTest.class);
	}

	/**
	 * Constructs a new Axdt Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Axdt Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void setFixture(AxdtModel fixture) {
		this.fixture = fixture;
		if (fixture == null)
			cleanUpResources();
	}

	/**
	 * Returns the fixture for this Axdt Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AxdtModel getFixture() {
		return (AxdtModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AxdtEFactory.eINSTANCE.createAxdtModel());
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

	public void testSingleton() throws Exception {
		assertSame(getFixture(),AxdtEFactory.eINSTANCE.createAxdtModel());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtModel#getProject(org.eclipse.core.resources.IProject) <em>Get Axdt Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtModel#getProject(org.eclipse.core.resources.IProject)
	 */
	public void testGetProject__IProject() {
		assertNull(getFixture().getProject(null));
		IProject iProject = getIProject("foo");
		AxdtProject project = getFixture().getProject(iProject);
		assertNotNull(project);
		assertSame(iProject.getFullPath(), project.getPath());
		assertTrue(project instanceof AxdtProjectHandle);
		assertEquals(project, getFixture().getProject(iProject));
		assertNotSame(project, getFixture().getProject(iProject));
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtModel#getPackageRoot(org.eclipse.core.resources.IResource) <em>Get Package Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtModel#getPackageRoot(org.eclipse.core.resources.IResource)
	 */
	public void testGetPackageRoot__IResource() {
		assertNull(getFixture().getPackageRoot(null));
		IProject iProject = getIProject("foo");
		AxdtPackageRoot root = getFixture().getPackageRoot(iProject);
		assertNotNull(root);
		assertSame(iProject.getFullPath(), root.getPath());
		assertTrue(root instanceof AxdtPackageRootHandle);
		assertEquals(root, getFixture().getPackageRoot(iProject));
		assertNotSame(root, getFixture().getPackageRoot(iProject));
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtModel#getProjects() <em>Get Projects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtModel#getProjects()
	 */
	public void testGetProjects() throws CoreException {
		List<AxdtProject> projects = getFixture().getProjects();
		assertNotNull(projects);
		assertTrue(projects.isEmpty());
		IProject iProject = getIProject("test");
		createIProject(iProject);
		assertTrue(getFixture().getProjects().isEmpty());
		IProjectDescription description = iProject.getDescription();
		description.setNatureIds(new String[] {AxdtCore.NATURE_ÌD});
		iProject.setDescription(description, null);
		AxdtProject project = getFixture().getProject(iProject);
		projects = getFixture().getProjects();
		assertEquals(1, projects.size());
		assertEquals(project, projects.get(0));
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtModel#hasAxdtNature(org.eclipse.core.resources.IProject) <em>Has Axdt Nature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtModel#hasAxdtNature(org.eclipse.core.resources.IProject)
	 */
	public void testHasAxdtNature__IProject() throws CoreException {
		assertFalse(getFixture().hasAxdtNature(null));
		assertFalse(getFixture().hasAxdtNature(getIProject("foo")));
		IProject project = getIProject("other");
		createIProject(project);
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String [] {AxdtCore.NATURE_ÌD});
		project.setDescription(description, null);
		assertTrue(getFixture().hasAxdtNature(project));
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtModel#newBuilderCommand(org.eclipse.core.resources.IProjectDescription, java.lang.String) <em>New Builder Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @see org.axdt.core.model.AxdtModel#newBuilderCommand(org.eclipse.core.resources.IProjectDescription, java.lang.String)
	 */
	public void testNewBuilderCommand__IProjectDescription_String() throws CoreException {
		assertNull(getFixture().newBuilderCommand(null, null));
		IProject project = getIProject("foo");
		createIProject(project);
		IProjectDescription description = project.getDescription();
		ICommand command = getFixture().newBuilderCommand(description, null);
		assertNotNull(command);
		assertEquals("", command.getBuilderName());
		assertEquals("foooo", getFixture().newBuilderCommand(description, "foooo").getBuilderName());
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtModel#getWorkspace() <em>Get Workspace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtModel#getWorkspace()
	 */
	public void testGetWorkspace() {
		assertSame(ResourcesPlugin.getWorkspace(), getFixture().getWorkspace());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtModel#connectHandle(org.axdt.core.model.AxdtHandle) <em>Connect Handle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtModel#connectHandle(org.axdt.core.model.AxdtHandle)
	 */
	public void testConnectHandle__AxdtHandle() {
		// should be tested in AxdtHandle.connect
	}
	public void testEResource() throws Exception {
		assertNotNull(getFixture().eResource());
		assertSame(getFixture(),getFixture().eResource().getContents().get(0));
	}

	@Override
	public void testGetPath() {
		assertSame(Path.ROOT, getFixture().getPath());
	}

	@Override
	public void testGetResource() {
		assertSame(ResourcesPlugin.getWorkspace().getRoot(), getFixture().getResource());
	}

	@Override
	public void testGetName() {
		assertEquals("", getFixture().getName());
	}

	@Override
	public void testExists() {
		assertTrue(getFixture().exists());
	}

	@Override
	public void testGetParent() {
		assertNull(getFixture().getParent());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#isReadOnly() <em>Is Read Only</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#isReadOnly()
	 */
	public void testIsReadOnly() {
		assertFalse(getFixture().isReadOnly());
	}

	@Override
	public void testIsConnected() {
		assertTrue(getFixture().isConnected());
		
	}
	@Override
	public void testConnect() {
		// does nothing
		getFixture().connect();
	}
	@Override
	public void testDisconnect() {
		// does nothing
		getFixture().disconnect();
	}
	@Override
	public void testIsHandle() {
		// the model is itself the handle for the model
		assertTrue(getFixture().isHandle());
	}
	@Override
	public void testGetHandle() {
		assertSame(getFixture(),getFixture().getHandle());
	}
} //AxdtModelTest
