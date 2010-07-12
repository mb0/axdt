/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core.model;

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Axdt Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.axdt.core.model.AxdtElement#getPath() <em>Get Path</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getResource() <em>Get Resource</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#isHandle() <em>Is Handle</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getHandle() <em>Get Handle</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#isConnected() <em>Is Connected</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#connect() <em>Connect</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#disconnect() <em>Disconnect</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#exists() <em>Exists</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#getParent() <em>Get Parent</em>}</li>
 *   <li>{@link org.axdt.core.model.AxdtElement#isReadOnly() <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AxdtElementTest extends TestCase {

	protected IProject getIProject(String name) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		return root.getProject(name);
	}
	protected void createIProject(IProject project) {
		try {
			project.create(null);
			toDelete.add(project);
			project.open(null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	/**
	 * The fixture for this Axdt Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtElement fixture = null;
	protected final List<IResource> toDelete = Lists.newArrayList();
	protected void cleanUpResources() {
		for (IResource res:toDelete) {
			try {
				res.delete(true, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * Constructs a new Axdt Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Axdt Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void setFixture(AxdtElement fixture) {
		this.fixture = fixture;
		if (fixture == null)
			cleanUpResources();
	}

	/**
	 * Returns the fixture for this Axdt Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtElement getFixture() {
		return fixture;
	}

	protected abstract IResource setDefaultResource();
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#getPath() <em>Get Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#getPath()
	 */
	public void testGetPath() {
		assertNull(getFixture().getPath());
		IResource resource = setDefaultResource();
		assertSame(resource.getFullPath(), getFixture().getPath());
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#isHandle() <em>Is Handle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#isHandle()
	 */
	public void testIsHandle() {
		// override in axdt handle and model
		assertFalse(getFixture().isHandle());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#getHandle() <em>Get Handle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#getHandle()
	 */
	public abstract void testGetHandle();
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#isConnected() <em>Is Connected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#isConnected()
	 */
	public void testIsConnected() {
		// by default no element is connected except the model
		assertFalse(getFixture().isConnected());
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#connect()
	 */
	public abstract void testConnect();
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#disconnect()
	 */
	public abstract void testDisconnect();
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#exists() <em>Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#exists()
	 */
	public abstract void testExists();
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#getParent() <em>Get Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#getParent()
	 */
	public abstract void testGetParent();
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#isReadOnly() <em>Is Read Only</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#isReadOnly()
	 * @generated
	 */
	public void testIsReadOnly() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#getResource() <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#getResource()
	 */
	public void testGetResource() {
		assertNull(getFixture().getResource());
		IResource resource = setDefaultResource();
		assertSame(resource, getFixture().getResource());
	}

	/**
	 * Tests the '{@link org.axdt.core.model.AxdtElement#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtElement#getName()
	 */
	public void testGetName() {
		assertNull(getFixture().getName());
		IResource resource = setDefaultResource();
		assertSame(resource.getName(), getFixture().getName());
	}
} //AxdtElementTest
