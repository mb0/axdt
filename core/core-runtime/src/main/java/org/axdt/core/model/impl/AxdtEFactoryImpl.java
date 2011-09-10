/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.model.impl;

import java.util.List;

import java.util.Set;
import org.axdt.core.AxdtEFactory;
import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.*;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AxdtEFactoryImpl extends EFactoryImpl implements AxdtEFactory {
	private AxdtModelImpl model;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AxdtEFactory init() {
		try {
			AxdtEFactory theAxdtEFactory = (AxdtEFactory)EPackage.Registry.INSTANCE.getEFactory("http://axdt.org/uri/Axdt"); 
			if (theAxdtEFactory != null) {
				return theAxdtEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AxdtEFactoryImpl();
	}


	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AxdtEFactoryImpl() {
		super();
		model = new AxdtModelImpl();
		Resource resource = new ResourceFactoryImpl().createResource(URI.createPlatformPluginURI("model.axdt", false));
		resource.getContents().add(model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AxdtEPackage.AXDT_MODEL: return createAxdtModel();
			case AxdtEPackage.AXDT_PROJECT_SOURCE: return createAxdtProjectSource();
			case AxdtEPackage.AXDT_PROJECT_HANDLE: return createAxdtProjectHandle();
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE: return createAxdtPackageRootSource();
			case AxdtEPackage.AXDT_PACKAGE_ROOT_HANDLE: return createAxdtPackageRootHandle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AxdtEPackage.CORE_EXCEPTION:
				return createCoreExceptionFromString(eDataType, initialValue);
			case AxdtEPackage.ICOMMAND:
				return createICommandFromString(eDataType, initialValue);
			case AxdtEPackage.IPATH:
				return createIPathFromString(eDataType, initialValue);
			case AxdtEPackage.IRESOURCE:
				return createIResourceFromString(eDataType, initialValue);
			case AxdtEPackage.ICONTAINER:
				return createIContainerFromString(eDataType, initialValue);
			case AxdtEPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case AxdtEPackage.IPROJECT_DESCRIPTION:
				return createIProjectDescriptionFromString(eDataType, initialValue);
			case AxdtEPackage.SET:
				return createSetFromString(eDataType, initialValue);
			case AxdtEPackage.LIST:
				return createListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AxdtEPackage.CORE_EXCEPTION:
				return convertCoreExceptionToString(eDataType, instanceValue);
			case AxdtEPackage.ICOMMAND:
				return convertICommandToString(eDataType, instanceValue);
			case AxdtEPackage.IPATH:
				return convertIPathToString(eDataType, instanceValue);
			case AxdtEPackage.IRESOURCE:
				return convertIResourceToString(eDataType, instanceValue);
			case AxdtEPackage.ICONTAINER:
				return convertIContainerToString(eDataType, instanceValue);
			case AxdtEPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case AxdtEPackage.IPROJECT_DESCRIPTION:
				return convertIProjectDescriptionToString(eDataType, instanceValue);
			case AxdtEPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			case AxdtEPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AxdtModel createAxdtModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtProjectSource createAxdtProjectSource() {
		AxdtProjectSourceImpl axdtProjectSource = new AxdtProjectSourceImpl();
		return axdtProjectSource;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtProjectHandle createAxdtProjectHandle() {
		AxdtProjectHandleImpl axdtProjectHandle = new AxdtProjectHandleImpl();
		return axdtProjectHandle;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtPackageRootSource createAxdtPackageRootSource() {
		AxdtPackageRootSourceImpl axdtPackageRootSource = new AxdtPackageRootSourceImpl();
		return axdtPackageRootSource;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtPackageRootHandle createAxdtPackageRootHandle() {
		AxdtPackageRootHandleImpl axdtPackageRootHandle = new AxdtPackageRootHandleImpl();
		return axdtPackageRootHandle;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPath createIPathFromString(EDataType eDataType, String initialValue) {
		return (IPath)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPathToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource createIResourceFromString(EDataType eDataType, String initialValue) {
		return (IResource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIResourceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer createIContainerFromString(EDataType eDataType, String initialValue) {
		return (IContainer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreException createCoreExceptionFromString(EDataType eDataType, String initialValue) {
		return (CoreException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoreExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProjectDescription createIProjectDescriptionFromString(EDataType eDataType, String initialValue) {
		return (IProjectDescription)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectDescriptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<?> createSetFromString(EDataType eDataType, String initialValue) {
		return (Set<?>)super.createFromString(initialValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICommand createICommandFromString(EDataType eDataType, String initialValue) {
		return (ICommand)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertICommandToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtEPackage getAxdtEPackage() {
		return (AxdtEPackage)getEPackage();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AxdtEPackage getPackage() {
		return AxdtEPackage.eINSTANCE;
	}
} //AxdtEFactoryImpl
