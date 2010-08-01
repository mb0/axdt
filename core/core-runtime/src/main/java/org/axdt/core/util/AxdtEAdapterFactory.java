/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.util;

import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.core.AxdtEPackage
 * @generated
 */
public class AxdtEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AxdtEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AxdtEPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxdtESwitch<Adapter> modelSwitch =
		new AxdtESwitch<Adapter>() {
			@Override
			public Adapter caseAxdtElement(AxdtElement object) {
				return createAxdtElementAdapter();
			}
			@Override
			public <T extends AxdtElement> Adapter caseAxdtHandle(AxdtHandle<T> object) {
				return createAxdtHandleAdapter();
			}
			@Override
			public Adapter caseAxdtModel(AxdtModel object) {
				return createAxdtModelAdapter();
			}
			@Override
			public Adapter caseAxdtProject(AxdtProject object) {
				return createAxdtProjectAdapter();
			}
			@Override
			public Adapter caseAxdtProjectSource(AxdtProjectSource object) {
				return createAxdtProjectSourceAdapter();
			}
			@Override
			public Adapter caseAxdtProjectHandle(AxdtProjectHandle object) {
				return createAxdtProjectHandleAdapter();
			}
			@Override
			public Adapter caseAxdtPackageRoot(AxdtPackageRoot object) {
				return createAxdtPackageRootAdapter();
			}
			@Override
			public Adapter caseAxdtPackageRootSource(AxdtPackageRootSource object) {
				return createAxdtPackageRootSourceAdapter();
			}
			@Override
			public Adapter caseAxdtPackageRootHandle(AxdtPackageRootHandle object) {
				return createAxdtPackageRootHandleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtElement <em>Axdt Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtElement
	 * @generated
	 */
	public Adapter createAxdtElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtHandle <em>Axdt Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtHandle
	 * @generated
	 */
	public Adapter createAxdtHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtProject <em>Axdt Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtProject
	 * @generated
	 */
	public Adapter createAxdtProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtPackageRoot <em>Axdt Package Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtPackageRoot
	 * @generated
	 */
	public Adapter createAxdtPackageRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtModel <em>Axdt Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtModel
	 * @generated
	 */
	public Adapter createAxdtModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtProjectSource <em>Axdt Project Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtProjectSource
	 * @generated
	 */
	public Adapter createAxdtProjectSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtProjectHandle <em>Axdt Project Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtProjectHandle
	 * @generated
	 */
	public Adapter createAxdtProjectHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtPackageRootSource <em>Axdt Package Root Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtPackageRootSource
	 * @generated
	 */
	public Adapter createAxdtPackageRootSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.core.model.AxdtPackageRootHandle <em>Axdt Package Root Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.core.model.AxdtPackageRootHandle
	 * @generated
	 */
	public Adapter createAxdtPackageRootHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AxdtEAdapterFactory
