/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.axdt.core.AxdtEFactory
 * @generated
 */
public interface AxdtEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://axdt.org/uri/Axdt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "axdt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AxdtEPackage eINSTANCE = org.axdt.core.model.impl.AxdtEPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.axdt.core.model.impl.AxdtElementImpl <em>Axdt Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.impl.AxdtElementImpl
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtElement()
	 * @generated
	 */
	int AXDT_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Axdt Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.impl.AxdtHandleImpl <em>Axdt Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.impl.AxdtHandleImpl
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtHandle()
	 * @generated
	 */
	int AXDT_HANDLE = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_HANDLE__RESOURCE = AXDT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.AxdtProject <em>Axdt Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtProject
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtProject()
	 * @generated
	 */
	int AXDT_PROJECT = 3;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.AxdtPackageRoot <em>Axdt Package Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.AxdtPackageRoot
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtPackageRoot()
	 * @generated
	 */
	int AXDT_PACKAGE_ROOT = 6;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.impl.AxdtModelImpl <em>Axdt Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.impl.AxdtModelImpl
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtModel()
	 * @generated
	 */
	int AXDT_MODEL = 2;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.impl.AxdtProjectSourceImpl <em>Axdt Project Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.impl.AxdtProjectSourceImpl
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtProjectSource()
	 * @generated
	 */
	int AXDT_PROJECT_SOURCE = 4;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.impl.AxdtProjectHandleImpl <em>Axdt Project Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.impl.AxdtProjectHandleImpl
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtProjectHandle()
	 * @generated
	 */
	int AXDT_PROJECT_HANDLE = 5;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.impl.AxdtPackageRootSourceImpl <em>Axdt Package Root Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.impl.AxdtPackageRootSourceImpl
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtPackageRootSource()
	 * @generated
	 */
	int AXDT_PACKAGE_ROOT_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_HANDLE__DELEGATE = AXDT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Axdt Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_HANDLE_FEATURE_COUNT = AXDT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_MODEL__CONNECTED_PROJECTS = AXDT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Axdt Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_MODEL_FEATURE_COUNT = AXDT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Axdt Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_FEATURE_COUNT = AXDT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_SOURCE__PROJECT = AXDT_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_SOURCE__OUTPUT_LOCATION = AXDT_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Libraries Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION = AXDT_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Config Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_SOURCE__CONFIG_LOCATION = AXDT_PROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected Package Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS = AXDT_PROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_SOURCE__PARENT = AXDT_PROJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Axdt Project Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_SOURCE_FEATURE_COUNT = AXDT_PROJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_HANDLE__RESOURCE = AXDT_HANDLE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_HANDLE__DELEGATE = AXDT_HANDLE__DELEGATE;

	/**
	 * The number of structural features of the '<em>Axdt Project Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PROJECT_HANDLE_FEATURE_COUNT = AXDT_HANDLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Axdt Package Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PACKAGE_ROOT_FEATURE_COUNT = AXDT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PACKAGE_ROOT_SOURCE__RESOURCE = AXDT_PACKAGE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PACKAGE_ROOT_SOURCE__PARENT = AXDT_PACKAGE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Axdt Package Root Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PACKAGE_ROOT_SOURCE_FEATURE_COUNT = AXDT_PACKAGE_ROOT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.core.model.impl.AxdtPackageRootHandleImpl <em>Axdt Package Root Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.core.model.impl.AxdtPackageRootHandleImpl
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtPackageRootHandle()
	 * @generated
	 */
	int AXDT_PACKAGE_ROOT_HANDLE = 8;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PACKAGE_ROOT_HANDLE__RESOURCE = AXDT_HANDLE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PACKAGE_ROOT_HANDLE__DELEGATE = AXDT_HANDLE__DELEGATE;

	/**
	 * The number of structural features of the '<em>Axdt Package Root Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXDT_PACKAGE_ROOT_HANDLE_FEATURE_COUNT = AXDT_HANDLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>IPath</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IPath
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIPath()
	 * @generated
	 */
	int IPATH = 11;

	/**
	 * The meta object id for the '<em>IWorkspace</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IWorkspace
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIWorkspace()
	 * @generated
	 */
	int IWORKSPACE = 12;

	/**
	 * The meta object id for the '<em>IResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IResource
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIResource()
	 * @generated
	 */
	int IRESOURCE = 13;

	/**
	 * The meta object id for the '<em>IContainer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IContainer
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIContainer()
	 * @generated
	 */
	int ICONTAINER = 14;

	/**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 15;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 16;

	/**
	 * The meta object id for the '<em>Core Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.CoreException
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getCoreException()
	 * @generated
	 */
	int CORE_EXCEPTION = 9;

	/**
	 * The meta object id for the '<em>IProject Description</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProjectDescription
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIProjectDescription()
	 * @generated
	 */
	int IPROJECT_DESCRIPTION = 17;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getList()
	 * @generated
	 */
	int LIST = 18;

	/**
	 * The meta object id for the '<em>ICommand</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.ICommand
	 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getICommand()
	 * @generated
	 */
	int ICOMMAND = 10;


	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtElement <em>Axdt Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Element</em>'.
	 * @see org.axdt.core.model.AxdtElement
	 * @generated
	 */
	EClass getAxdtElement();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtHandle <em>Axdt Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Handle</em>'.
	 * @see org.axdt.core.model.AxdtHandle
	 * @generated
	 */
	EClass getAxdtHandle();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.core.model.AxdtHandle#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.axdt.core.model.AxdtHandle#getResource()
	 * @see #getAxdtHandle()
	 * @generated
	 */
	EAttribute getAxdtHandle_Resource();

	/**
	 * Returns the meta object for the reference '{@link org.axdt.core.model.AxdtHandle#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see org.axdt.core.model.AxdtHandle#getDelegate()
	 * @see #getAxdtHandle()
	 * @generated
	 */
	EReference getAxdtHandle_Delegate();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtProject <em>Axdt Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Project</em>'.
	 * @see org.axdt.core.model.AxdtProject
	 * @generated
	 */
	EClass getAxdtProject();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtPackageRoot <em>Axdt Package Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Package Root</em>'.
	 * @see org.axdt.core.model.AxdtPackageRoot
	 * @generated
	 */
	EClass getAxdtPackageRoot();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtModel <em>Axdt Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Model</em>'.
	 * @see org.axdt.core.model.AxdtModel
	 * @generated
	 */
	EClass getAxdtModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.core.model.AxdtModel#getConnectedProjects <em>Connected Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Projects</em>'.
	 * @see org.axdt.core.model.AxdtModel#getConnectedProjects()
	 * @see #getAxdtModel()
	 * @generated
	 */
	EReference getAxdtModel_ConnectedProjects();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtProjectSource <em>Axdt Project Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Project Source</em>'.
	 * @see org.axdt.core.model.AxdtProjectSource
	 * @generated
	 */
	EClass getAxdtProjectSource();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.core.model.AxdtProjectSource#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.axdt.core.model.AxdtProjectSource#getProject()
	 * @see #getAxdtProjectSource()
	 * @generated
	 */
	EAttribute getAxdtProjectSource_Project();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.core.model.AxdtProjectSource#getOutputLocation <em>Output Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Location</em>'.
	 * @see org.axdt.core.model.AxdtProjectSource#getOutputLocation()
	 * @see #getAxdtProjectSource()
	 * @generated
	 */
	EAttribute getAxdtProjectSource_OutputLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.core.model.AxdtProjectSource#getLibrariesLocation <em>Libraries Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libraries Location</em>'.
	 * @see org.axdt.core.model.AxdtProjectSource#getLibrariesLocation()
	 * @see #getAxdtProjectSource()
	 * @generated
	 */
	EAttribute getAxdtProjectSource_LibrariesLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.core.model.AxdtProjectSource#getConfigLocation <em>Config Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Location</em>'.
	 * @see org.axdt.core.model.AxdtProjectSource#getConfigLocation()
	 * @see #getAxdtProjectSource()
	 * @generated
	 */
	EAttribute getAxdtProjectSource_ConfigLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.core.model.AxdtProjectSource#getConnectedPackageRoots <em>Connected Package Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Package Roots</em>'.
	 * @see org.axdt.core.model.AxdtProjectSource#getConnectedPackageRoots()
	 * @see #getAxdtProjectSource()
	 * @generated
	 */
	EReference getAxdtProjectSource_ConnectedPackageRoots();

	/**
	 * Returns the meta object for the container reference '{@link org.axdt.core.model.AxdtProjectSource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.axdt.core.model.AxdtProjectSource#getParent()
	 * @see #getAxdtProjectSource()
	 * @generated
	 */
	EReference getAxdtProjectSource_Parent();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtProjectHandle <em>Axdt Project Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Project Handle</em>'.
	 * @see org.axdt.core.model.AxdtProjectHandle
	 * @generated
	 */
	EClass getAxdtProjectHandle();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtPackageRootSource <em>Axdt Package Root Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Package Root Source</em>'.
	 * @see org.axdt.core.model.AxdtPackageRootSource
	 * @generated
	 */
	EClass getAxdtPackageRootSource();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.core.model.AxdtPackageRootSource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.axdt.core.model.AxdtPackageRootSource#getResource()
	 * @see #getAxdtPackageRootSource()
	 * @generated
	 */
	EAttribute getAxdtPackageRootSource_Resource();

	/**
	 * Returns the meta object for the container reference '{@link org.axdt.core.model.AxdtPackageRootSource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.axdt.core.model.AxdtPackageRootSource#getParent()
	 * @see #getAxdtPackageRootSource()
	 * @generated
	 */
	EReference getAxdtPackageRootSource_Parent();

	/**
	 * Returns the meta object for class '{@link org.axdt.core.model.AxdtPackageRootHandle <em>Axdt Package Root Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axdt Package Root Handle</em>'.
	 * @see org.axdt.core.model.AxdtPackageRootHandle
	 * @generated
	 */
	EClass getAxdtPackageRootHandle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IPath <em>IPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IPath</em>'.
	 * @see org.eclipse.core.runtime.IPath
	 * @generated
	 */
	EDataType getIPath();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IWorkspace <em>IWorkspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IWorkspace</em>'.
	 * @see org.eclipse.core.resources.IWorkspace
	 * @generated
	 */
	EDataType getIWorkspace();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IResource</em>'.
	 * @see org.eclipse.core.resources.IResource
	 * @generated
	 */
	EDataType getIResource();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IContainer</em>'.
	 * @see org.eclipse.core.resources.IContainer
	 * @generated
	 */
	EDataType getIContainer();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @generated
	 */
	EDataType getIProject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.CoreException <em>Core Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Core Exception</em>'.
	 * @see org.eclipse.core.runtime.CoreException
	 * @generated
	 */
	EDataType getCoreException();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProjectDescription <em>IProject Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject Description</em>'.
	 * @see org.eclipse.core.resources.IProjectDescription
	 * @generated
	 */
	EDataType getIProjectDescription();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.ICommand <em>ICommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ICommand</em>'.
	 * @see org.eclipse.core.resources.ICommand
	 * @generated
	 */
	EDataType getICommand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AxdtEFactory getAxdtEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.axdt.core.model.impl.AxdtElementImpl <em>Axdt Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.impl.AxdtElementImpl
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtElement()
		 * @generated
		 */
		EClass AXDT_ELEMENT = eINSTANCE.getAxdtElement();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.impl.AxdtHandleImpl <em>Axdt Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.impl.AxdtHandleImpl
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtHandle()
		 * @generated
		 */
		EClass AXDT_HANDLE = eINSTANCE.getAxdtHandle();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXDT_HANDLE__RESOURCE = eINSTANCE.getAxdtHandle_Resource();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXDT_HANDLE__DELEGATE = eINSTANCE.getAxdtHandle_Delegate();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.AxdtProject <em>Axdt Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.AxdtProject
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtProject()
		 * @generated
		 */
		EClass AXDT_PROJECT = eINSTANCE.getAxdtProject();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.AxdtPackageRoot <em>Axdt Package Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.AxdtPackageRoot
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtPackageRoot()
		 * @generated
		 */
		EClass AXDT_PACKAGE_ROOT = eINSTANCE.getAxdtPackageRoot();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.impl.AxdtModelImpl <em>Axdt Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.impl.AxdtModelImpl
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtModel()
		 * @generated
		 */
		EClass AXDT_MODEL = eINSTANCE.getAxdtModel();

		/**
		 * The meta object literal for the '<em><b>Connected Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXDT_MODEL__CONNECTED_PROJECTS = eINSTANCE.getAxdtModel_ConnectedProjects();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.impl.AxdtProjectSourceImpl <em>Axdt Project Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.impl.AxdtProjectSourceImpl
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtProjectSource()
		 * @generated
		 */
		EClass AXDT_PROJECT_SOURCE = eINSTANCE.getAxdtProjectSource();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXDT_PROJECT_SOURCE__PROJECT = eINSTANCE.getAxdtProjectSource_Project();

		/**
		 * The meta object literal for the '<em><b>Output Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXDT_PROJECT_SOURCE__OUTPUT_LOCATION = eINSTANCE.getAxdtProjectSource_OutputLocation();

		/**
		 * The meta object literal for the '<em><b>Libraries Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION = eINSTANCE.getAxdtProjectSource_LibrariesLocation();

		/**
		 * The meta object literal for the '<em><b>Config Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXDT_PROJECT_SOURCE__CONFIG_LOCATION = eINSTANCE.getAxdtProjectSource_ConfigLocation();

		/**
		 * The meta object literal for the '<em><b>Connected Package Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS = eINSTANCE.getAxdtProjectSource_ConnectedPackageRoots();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXDT_PROJECT_SOURCE__PARENT = eINSTANCE.getAxdtProjectSource_Parent();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.impl.AxdtProjectHandleImpl <em>Axdt Project Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.impl.AxdtProjectHandleImpl
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtProjectHandle()
		 * @generated
		 */
		EClass AXDT_PROJECT_HANDLE = eINSTANCE.getAxdtProjectHandle();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.impl.AxdtPackageRootSourceImpl <em>Axdt Package Root Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.impl.AxdtPackageRootSourceImpl
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtPackageRootSource()
		 * @generated
		 */
		EClass AXDT_PACKAGE_ROOT_SOURCE = eINSTANCE.getAxdtPackageRootSource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXDT_PACKAGE_ROOT_SOURCE__RESOURCE = eINSTANCE.getAxdtPackageRootSource_Resource();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXDT_PACKAGE_ROOT_SOURCE__PARENT = eINSTANCE.getAxdtPackageRootSource_Parent();

		/**
		 * The meta object literal for the '{@link org.axdt.core.model.impl.AxdtPackageRootHandleImpl <em>Axdt Package Root Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.core.model.impl.AxdtPackageRootHandleImpl
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getAxdtPackageRootHandle()
		 * @generated
		 */
		EClass AXDT_PACKAGE_ROOT_HANDLE = eINSTANCE.getAxdtPackageRootHandle();

		/**
		 * The meta object literal for the '<em>IPath</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IPath
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIPath()
		 * @generated
		 */
		EDataType IPATH = eINSTANCE.getIPath();

		/**
		 * The meta object literal for the '<em>IWorkspace</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IWorkspace
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIWorkspace()
		 * @generated
		 */
		EDataType IWORKSPACE = eINSTANCE.getIWorkspace();

		/**
		 * The meta object literal for the '<em>IResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IResource
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIResource()
		 * @generated
		 */
		EDataType IRESOURCE = eINSTANCE.getIResource();

		/**
		 * The meta object literal for the '<em>IContainer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IContainer
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIContainer()
		 * @generated
		 */
		EDataType ICONTAINER = eINSTANCE.getIContainer();

		/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Core Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.CoreException
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getCoreException()
		 * @generated
		 */
		EDataType CORE_EXCEPTION = eINSTANCE.getCoreException();

		/**
		 * The meta object literal for the '<em>IProject Description</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProjectDescription
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getIProjectDescription()
		 * @generated
		 */
		EDataType IPROJECT_DESCRIPTION = eINSTANCE.getIProjectDescription();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>ICommand</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.ICommand
		 * @see org.axdt.core.model.impl.AxdtEPackageImpl#getICommand()
		 * @generated
		 */
		EDataType ICOMMAND = eINSTANCE.getICommand();

	}

} //AxdtEPackage
