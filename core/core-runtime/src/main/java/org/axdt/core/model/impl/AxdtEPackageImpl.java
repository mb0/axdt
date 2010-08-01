/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model.impl;

import java.util.List;

import org.axdt.avm.AvmEPackage;
import org.axdt.core.AxdtEFactory;
import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.AxdtElement;
import org.axdt.core.model.AxdtHandle;
import org.axdt.core.model.AxdtModel;
import org.axdt.core.model.AxdtPackageRoot;
import org.axdt.core.model.AxdtPackageRootHandle;
import org.axdt.core.model.AxdtPackageRootSource;
import org.axdt.core.model.AxdtProject;
import org.axdt.core.model.AxdtProjectHandle;
import org.axdt.core.model.AxdtProjectSource;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AxdtEPackageImpl extends EPackageImpl implements AxdtEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtPackageRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtProjectSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtPackageRootSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtProjectHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axdtPackageRootHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coreExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iCommandEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iPathEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iWorkspaceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iContainerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectDescriptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.axdt.core.AxdtEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AxdtEPackageImpl() {
		super(eNS_URI, AxdtEFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AxdtEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AxdtEPackage init() {
		if (isInited) return (AxdtEPackage)EPackage.Registry.INSTANCE.getEPackage(AxdtEPackage.eNS_URI);

		// Obtain or create and register package
		AxdtEPackageImpl theAxdtEPackage = (AxdtEPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AxdtEPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AxdtEPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AvmEPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAxdtEPackage.createPackageContents();

		// Initialize created meta-data
		theAxdtEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAxdtEPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AxdtEPackage.eNS_URI, theAxdtEPackage);
		return theAxdtEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtElement() {
		return axdtElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtModel() {
		return axdtModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxdtModel_ConnectedProjects() {
		return (EReference)axdtModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtProject() {
		return axdtProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtPackageRoot() {
		return axdtPackageRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtProjectSource() {
		return axdtProjectSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxdtProjectSource_Project() {
		return (EAttribute)axdtProjectSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxdtProjectSource_OutputLocation() {
		return (EAttribute)axdtProjectSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxdtProjectSource_LibrariesLocation() {
		return (EAttribute)axdtProjectSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxdtProjectSource_ConfigLocation() {
		return (EAttribute)axdtProjectSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxdtProjectSource_ConnectedPackageRoots() {
		return (EReference)axdtProjectSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxdtProjectSource_Parent() {
		return (EReference)axdtProjectSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtPackageRootSource() {
		return axdtPackageRootSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxdtPackageRootSource_Resource() {
		return (EAttribute)axdtPackageRootSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxdtPackageRootSource_Parent() {
		return (EReference)axdtPackageRootSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtHandle() {
		return axdtHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxdtHandle_Resource() {
		return (EAttribute)axdtHandleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxdtHandle_Delegate() {
		return (EReference)axdtHandleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtProjectHandle() {
		return axdtProjectHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxdtPackageRootHandle() {
		return axdtPackageRootHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCoreException() {
		return coreExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getICommand() {
		return iCommandEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIPath() {
		return iPathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIWorkspace() {
		return iWorkspaceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIResource() {
		return iResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIContainer() {
		return iContainerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProject() {
		return iProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProjectDescription() {
		return iProjectDescriptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtEFactory getAxdtEFactory() {
		return (AxdtEFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		axdtElementEClass = createEClass(AXDT_ELEMENT);

		axdtHandleEClass = createEClass(AXDT_HANDLE);
		createEAttribute(axdtHandleEClass, AXDT_HANDLE__RESOURCE);
		createEReference(axdtHandleEClass, AXDT_HANDLE__DELEGATE);

		axdtModelEClass = createEClass(AXDT_MODEL);
		createEReference(axdtModelEClass, AXDT_MODEL__CONNECTED_PROJECTS);

		axdtProjectEClass = createEClass(AXDT_PROJECT);

		axdtProjectSourceEClass = createEClass(AXDT_PROJECT_SOURCE);
		createEAttribute(axdtProjectSourceEClass, AXDT_PROJECT_SOURCE__PROJECT);
		createEAttribute(axdtProjectSourceEClass, AXDT_PROJECT_SOURCE__OUTPUT_LOCATION);
		createEAttribute(axdtProjectSourceEClass, AXDT_PROJECT_SOURCE__LIBRARIES_LOCATION);
		createEAttribute(axdtProjectSourceEClass, AXDT_PROJECT_SOURCE__CONFIG_LOCATION);
		createEReference(axdtProjectSourceEClass, AXDT_PROJECT_SOURCE__CONNECTED_PACKAGE_ROOTS);
		createEReference(axdtProjectSourceEClass, AXDT_PROJECT_SOURCE__PARENT);

		axdtProjectHandleEClass = createEClass(AXDT_PROJECT_HANDLE);

		axdtPackageRootEClass = createEClass(AXDT_PACKAGE_ROOT);

		axdtPackageRootSourceEClass = createEClass(AXDT_PACKAGE_ROOT_SOURCE);
		createEAttribute(axdtPackageRootSourceEClass, AXDT_PACKAGE_ROOT_SOURCE__RESOURCE);
		createEReference(axdtPackageRootSourceEClass, AXDT_PACKAGE_ROOT_SOURCE__PARENT);

		axdtPackageRootHandleEClass = createEClass(AXDT_PACKAGE_ROOT_HANDLE);

		// Create data types
		coreExceptionEDataType = createEDataType(CORE_EXCEPTION);
		iCommandEDataType = createEDataType(ICOMMAND);
		iPathEDataType = createEDataType(IPATH);
		iWorkspaceEDataType = createEDataType(IWORKSPACE);
		iResourceEDataType = createEDataType(IRESOURCE);
		iContainerEDataType = createEDataType(ICONTAINER);
		iProjectEDataType = createEDataType(IPROJECT);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		iProjectDescriptionEDataType = createEDataType(IPROJECT_DESCRIPTION);
		listEDataType = createEDataType(LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter axdtHandleEClass_T = addETypeParameter(axdtHandleEClass, "T");
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAxdtElement());
		axdtHandleEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		axdtHandleEClass.getESuperTypes().add(this.getAxdtElement());
		axdtModelEClass.getESuperTypes().add(this.getAxdtElement());
		axdtProjectEClass.getESuperTypes().add(this.getAxdtElement());
		axdtProjectSourceEClass.getESuperTypes().add(this.getAxdtProject());
		g1 = createEGenericType(this.getAxdtHandle());
		EGenericType g2 = createEGenericType(this.getAxdtProjectSource());
		g1.getETypeArguments().add(g2);
		axdtProjectHandleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAxdtProject());
		axdtProjectHandleEClass.getEGenericSuperTypes().add(g1);
		axdtPackageRootEClass.getESuperTypes().add(this.getAxdtElement());
		axdtPackageRootSourceEClass.getESuperTypes().add(this.getAxdtPackageRoot());
		g1 = createEGenericType(this.getAxdtHandle());
		g2 = createEGenericType(this.getAxdtPackageRootSource());
		g1.getETypeArguments().add(g2);
		axdtPackageRootHandleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAxdtPackageRoot());
		axdtPackageRootHandleEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(axdtElementEClass, AxdtElement.class, "AxdtElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(axdtElementEClass, this.getIPath(), "getPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, this.getIResource(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, ecorePackage.getEBoolean(), "isHandle", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, this.getAxdtElement(), "getHandle", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, ecorePackage.getEBoolean(), "isConnected", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, ecorePackage.getEBoolean(), "exists", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, this.getAxdtElement(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtElementEClass, ecorePackage.getEBoolean(), "isReadOnly", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(axdtHandleEClass, AxdtHandle.class, "AxdtHandle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxdtHandle_Resource(), this.getIResource(), "resource", null, 0, 1, AxdtHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(axdtHandleEClass_T);
		initEReference(getAxdtHandle_Delegate(), g1, null, "delegate", null, 0, 1, AxdtHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(axdtHandleEClass, null, "checkDelegate", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(axdtHandleEClass_T);
		initEOperation(op, g1);

		initEClass(axdtModelEClass, AxdtModel.class, "AxdtModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxdtModel_ConnectedProjects(), this.getAxdtProjectSource(), this.getAxdtProjectSource_Parent(), "connectedProjects", null, 0, -1, AxdtModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(axdtModelEClass, this.getAxdtProject(), "getProject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProject(), "project", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(axdtModelEClass, this.getAxdtPackageRoot(), "getPackageRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(axdtModelEClass, null, "getProjects", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAxdtProject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(axdtModelEClass, ecorePackage.getEBoolean(), "hasAxdtNature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProject(), "project", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(axdtModelEClass, this.getICommand(), "newBuilderCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProjectDescription(), "description", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "builderId", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtModelEClass, this.getIWorkspace(), "getWorkspace", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(axdtModelEClass, null, "connectHandle", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getAxdtElement());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getAxdtHandle());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "handle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(axdtProjectEClass, AxdtProject.class, "AxdtProject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(axdtProjectEClass, null, "getRequiredProjectNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(axdtProjectEClass, this.getAxdtPackageRoot(), "getDefaultPackageRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(axdtProjectEClass, null, "getConfiguredSourcePaths", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getIPath());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(axdtProjectEClass, null, "addToBuildSpec", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "builderId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getCoreException());

		op = addEOperation(axdtProjectEClass, null, "removeFromBuildSpec", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "builderId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getCoreException());

		op = addEOperation(axdtProjectEClass, null, "getPackageRoots", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAxdtPackageRoot());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(axdtProjectSourceEClass, AxdtProjectSource.class, "AxdtProjectSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxdtProjectSource_Project(), this.getIProject(), "project", null, 0, 1, AxdtProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxdtProjectSource_OutputLocation(), this.getIPath(), "outputLocation", null, 0, 1, AxdtProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxdtProjectSource_LibrariesLocation(), this.getIPath(), "librariesLocation", null, 0, 1, AxdtProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxdtProjectSource_ConfigLocation(), this.getIPath(), "configLocation", null, 0, 1, AxdtProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxdtProjectSource_ConnectedPackageRoots(), this.getAxdtPackageRootSource(), this.getAxdtPackageRootSource_Parent(), "connectedPackageRoots", null, 0, -1, AxdtProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxdtProjectSource_Parent(), this.getAxdtModel(), this.getAxdtModel_ConnectedProjects(), "parent", null, 0, 1, AxdtProjectSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axdtProjectHandleEClass, AxdtProjectHandle.class, "AxdtProjectHandle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(axdtPackageRootEClass, AxdtPackageRoot.class, "AxdtPackageRoot", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(axdtPackageRootEClass, ecorePackage.getEBoolean(), "isExternal", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(axdtPackageRootEClass, ecorePackage.getEBoolean(), "isArchive", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(axdtPackageRootSourceEClass, AxdtPackageRootSource.class, "AxdtPackageRootSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxdtPackageRootSource_Resource(), this.getIResource(), "resource", null, 0, 1, AxdtPackageRootSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxdtPackageRootSource_Parent(), this.getAxdtProjectSource(), this.getAxdtProjectSource_ConnectedPackageRoots(), "parent", null, 0, 1, AxdtPackageRootSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axdtPackageRootHandleEClass, AxdtPackageRootHandle.class, "AxdtPackageRootHandle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(coreExceptionEDataType, CoreException.class, "CoreException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iCommandEDataType, ICommand.class, "ICommand", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iPathEDataType, IPath.class, "IPath", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iWorkspaceEDataType, IWorkspace.class, "IWorkspace", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iResourceEDataType, IResource.class, "IResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iContainerEDataType, IContainer.class, "IContainer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProjectDescriptionEDataType, IProjectDescription.class, "IProjectDescription", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AxdtEPackageImpl
