/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core.model.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.core.AxdtCore;
import org.axdt.core.AxdtEFactory;
import org.axdt.core.AxdtEPackage;
import org.axdt.core.config.ICoreConfig;
import org.axdt.core.model.AxdtModel;
import org.axdt.core.model.AxdtPackageRoot;
import org.axdt.core.model.AxdtPackageRootSource;
import org.axdt.core.model.AxdtProjectHandle;
import org.axdt.core.model.AxdtProjectSource;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axdt Project Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.core.model.impl.AxdtProjectSourceImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.axdt.core.model.impl.AxdtProjectSourceImpl#getOutputLocation <em>Output Location</em>}</li>
 *   <li>{@link org.axdt.core.model.impl.AxdtProjectSourceImpl#getLibrariesLocation <em>Libraries Location</em>}</li>
 *   <li>{@link org.axdt.core.model.impl.AxdtProjectSourceImpl#getConfigLocation <em>Config Location</em>}</li>
 *   <li>{@link org.axdt.core.model.impl.AxdtProjectSourceImpl#getConnectedPackageRoots <em>Connected Package Roots</em>}</li>
 *   <li>{@link org.axdt.core.model.impl.AxdtProjectSourceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxdtProjectSourceImpl extends AxdtElementImpl implements AxdtProjectSource {
	
	
	private static final Logger logger = Logger.getLogger(AxdtProjectSourceImpl.class);
	
	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected IProject project = PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputLocation() <em>Output Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLocation()
	 * @generated
	 * @ordered
	 */
	protected static final IPath OUTPUT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputLocation() <em>Output Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLocation()
	 * @generated
	 * @ordered
	 */
	protected IPath outputLocation = OUTPUT_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrariesLocation() <em>Libraries Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrariesLocation()
	 * @generated
	 * @ordered
	 */
	protected static final IPath LIBRARIES_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrariesLocation() <em>Libraries Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrariesLocation()
	 * @generated
	 * @ordered
	 */
	protected IPath librariesLocation = LIBRARIES_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigLocation() <em>Config Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigLocation()
	 * @generated
	 * @ordered
	 */
	protected static final IPath CONFIG_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigLocation() <em>Config Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigLocation()
	 * @generated
	 * @ordered
	 */
	protected IPath configLocation = CONFIG_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedPackageRoots() <em>Connected Package Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedPackageRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<AxdtPackageRootSource> connectedPackageRoots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtProjectSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxdtEPackage.Literals.AXDT_PROJECT_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setProject(IProject newProject) {
		if (newProject == null || !newProject.equals(project)) setParent(null);
		IProject oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxdtEPackage.AXDT_PROJECT_SOURCE__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPath getOutputLocation() {
		return outputLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLocation(IPath newOutputLocation) {
		IPath oldOutputLocation = outputLocation;
		outputLocation = newOutputLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxdtEPackage.AXDT_PROJECT_SOURCE__OUTPUT_LOCATION, oldOutputLocation, outputLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPath getLibrariesLocation() {
		return librariesLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrariesLocation(IPath newLibrariesLocation) {
		IPath oldLibrariesLocation = librariesLocation;
		librariesLocation = newLibrariesLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxdtEPackage.AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION, oldLibrariesLocation, librariesLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPath getConfigLocation() {
		return configLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigLocation(IPath newConfigLocation) {
		IPath oldConfigLocation = configLocation;
		configLocation = newConfigLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxdtEPackage.AXDT_PROJECT_SOURCE__CONFIG_LOCATION, oldConfigLocation, configLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AxdtPackageRootSource> getConnectedPackageRoots() {
		if (connectedPackageRoots == null) {
			connectedPackageRoots = new EObjectContainmentWithInverseEList<AxdtPackageRootSource>(AxdtPackageRootSource.class, this, AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS, AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE__PARENT);
		}
		return connectedPackageRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtModel getParent() {
		if (eContainerFeatureID() != AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT) return null;
		return (AxdtModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AxdtModel newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AxdtModel newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS, AxdtModel.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<String> getRequiredProjectNames() {
		IProject iProject = getResource();
		if (iProject == null) return null;
		try {
			IProject[] referencedProjects = iProject.getReferencedProjects();
			List<String> result = Lists.newArrayList();
			for (IProject reference:referencedProjects)
				result.add(reference.getName());
			return result;
		} catch (CoreException e) {
			logger.error("accessing required projects", e);
		}
		return Collections.emptyList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AxdtPackageRoot getDefaultPackageRoot() {
		if (project == null) return null;
		List<IPath> paths = getConfiguredSourcePaths();
		AxdtModel model = AxdtCore.getModel();
		if (!paths.isEmpty()) {
			// default package root must be a container
			// no external resources or archives allowed 
			IContainer container = model.getResource().getFolder(paths.get(0));
			return model.getPackageRoot(container);
		}
		// if there is no package root configured use project root
		return model.getPackageRoot(getResource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<IPath> getConfiguredSourcePaths() {
		if (project == null) return null;
		ICoreConfig config = AxdtCore.getPlugin().getAxdtConfig(ICoreConfig.ID, ICoreConfig.class);
		return config == null
				? Collections.<IPath>emptyList()
				: config.getSourcePaths(project);
	}

	protected int findBuilderIndex(ICommand[] buildSpec, String builderId) {
		for (int index = 0; index < buildSpec.length; index++)
			if (buildSpec[index].getBuilderName().equals(builderId))
				return index;
		return -1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addToBuildSpec(String builderId) throws CoreException {
		IProjectDescription description = project.getDescription();
		ICommand[] buildSpec = description.getBuildSpec();
		int index = findBuilderIndex(buildSpec, builderId);
		if (index == -1) {
			AxdtModel model = AxdtEFactory.eINSTANCE.createAxdtModel();
			ICommand command = model.newBuilderCommand(description, builderId);
			ICommand[] newBuildSpec = new ICommand[buildSpec.length+1];
			System.arraycopy(buildSpec, 0, newBuildSpec, 1, buildSpec.length);
			newBuildSpec[0] = command;
			description.setBuildSpec(newBuildSpec);
			project.setDescription(description, null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeFromBuildSpec(String builderId) throws CoreException {
		IProjectDescription description = project.getDescription();
		ICommand[] buildSpec = description.getBuildSpec();
		int index = findBuilderIndex(buildSpec, builderId);
		if (index >= 0) {
			ICommand[] newBuildSpec = new ICommand[buildSpec.length-1];
			System.arraycopy(buildSpec, 0, newBuildSpec, 0, index);
			System.arraycopy(buildSpec, index+1, newBuildSpec, index, newBuildSpec.length - index);
			description.setBuildSpec(newBuildSpec);
			project.setDescription(description, null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List<AxdtPackageRoot> getPackageRoots() {
		if (project == null) return null;
		List<IPath> paths = getConfiguredSourcePaths();
		AxdtModel model = AxdtCore.getModel();
		if (!paths.isEmpty()) {
			List<AxdtPackageRoot> result = Lists.newArrayList();
			for (IPath path:paths) {
				IContainer container = model.getResource().getFolder(path);
				result.add(model.getPackageRoot(container));
			}
			return result;
		}
		// if there is no package root configured use project root
		return Collections.singletonList(model.getPackageRoot(getResource()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedPackageRoots()).basicAdd(otherEnd, msgs);
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AxdtModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS:
				return ((InternalEList<?>)getConnectedPackageRoots()).basicRemove(otherEnd, msgs);
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT:
				return eInternalContainer().eInverseRemove(this, AxdtEPackage.AXDT_MODEL__CONNECTED_PROJECTS, AxdtModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PROJECT:
				return getProject();
			case AxdtEPackage.AXDT_PROJECT_SOURCE__OUTPUT_LOCATION:
				return getOutputLocation();
			case AxdtEPackage.AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION:
				return getLibrariesLocation();
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONFIG_LOCATION:
				return getConfigLocation();
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS:
				return getConnectedPackageRoots();
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PROJECT:
				setProject((IProject)newValue);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__OUTPUT_LOCATION:
				setOutputLocation((IPath)newValue);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION:
				setLibrariesLocation((IPath)newValue);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONFIG_LOCATION:
				setConfigLocation((IPath)newValue);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS:
				getConnectedPackageRoots().clear();
				getConnectedPackageRoots().addAll((Collection<? extends AxdtPackageRootSource>)newValue);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT:
				setParent((AxdtModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__OUTPUT_LOCATION:
				setOutputLocation(OUTPUT_LOCATION_EDEFAULT);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION:
				setLibrariesLocation(LIBRARIES_LOCATION_EDEFAULT);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONFIG_LOCATION:
				setConfigLocation(CONFIG_LOCATION_EDEFAULT);
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS:
				getConnectedPackageRoots().clear();
				return;
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT:
				setParent((AxdtModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case AxdtEPackage.AXDT_PROJECT_SOURCE__OUTPUT_LOCATION:
				return OUTPUT_LOCATION_EDEFAULT == null ? outputLocation != null : !OUTPUT_LOCATION_EDEFAULT.equals(outputLocation);
			case AxdtEPackage.AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION:
				return LIBRARIES_LOCATION_EDEFAULT == null ? librariesLocation != null : !LIBRARIES_LOCATION_EDEFAULT.equals(librariesLocation);
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONFIG_LOCATION:
				return CONFIG_LOCATION_EDEFAULT == null ? configLocation != null : !CONFIG_LOCATION_EDEFAULT.equals(configLocation);
			case AxdtEPackage.AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS:
				return connectedPackageRoots != null && !connectedPackageRoots.isEmpty();
			case AxdtEPackage.AXDT_PROJECT_SOURCE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (project: ");
		result.append(project);
		result.append(", outputLocation: ");
		result.append(outputLocation);
		result.append(", librariesLocation: ");
		result.append(librariesLocation);
		result.append(", configLocation: ");
		result.append(configLocation);
		result.append(')');
		return result.toString();
	}

	public void configure() throws CoreException {
		addToBuildSpec(AxdtCore.BUILDER_ID);
	}

	public void deconfigure() throws CoreException {
		removeFromBuildSpec(AxdtCore.BUILDER_ID);
	}

	@Override
	public IProject getResource() {
		return getProject();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AxdtProjectHandle getHandle() {
		AxdtProjectHandle handle = AxdtEFactoryImpl.eINSTANCE.createAxdtProjectHandle();
		handle.setResource(getResource());
		handle.setDelegate(this);
		return handle;
	}
} //AxdtProjectSourceImpl
