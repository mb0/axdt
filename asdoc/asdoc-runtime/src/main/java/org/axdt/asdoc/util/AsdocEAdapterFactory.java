/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.util;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.*;
import org.axdt.avm.model.AvmClass;
import org.axdt.avm.model.AvmConstructor;
import org.axdt.avm.model.AvmDeclaredElement;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.axdt.avm.model.AvmElement;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmInterface;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmNamespace;
import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmProperty;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmVariable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.asdoc.AsdocEPackage
 * @generated
 */
public class AsdocEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AsdocEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AsdocEPackage.eINSTANCE;
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
	protected AsdocESwitch<Adapter> modelSwitch =
		new AsdocESwitch<Adapter>() {
			@Override
			public Adapter caseAsdocElement(AsdocElement object) {
				return createAsdocElementAdapter();
			}
			@Override
			public Adapter caseAsdocDefinition(AsdocDefinition object) {
				return createAsdocDefinitionAdapter();
			}
			@Override
			public Adapter caseAsdocMember(AsdocMember object) {
				return createAsdocMemberAdapter();
			}
			@Override
			public Adapter caseAsdocExecutable(AsdocExecutable object) {
				return createAsdocExecutableAdapter();
			}
			@Override
			public Adapter caseAsdocPackage(AsdocPackage object) {
				return createAsdocPackageAdapter();
			}
			@Override
			public Adapter caseAsdocRoot(AsdocRoot object) {
				return createAsdocRootAdapter();
			}
			@Override
			public Adapter caseAsdocType(AsdocType object) {
				return createAsdocTypeAdapter();
			}
			@Override
			public Adapter caseAsdocClass(AsdocClass object) {
				return createAsdocClassAdapter();
			}
			@Override
			public Adapter caseAsdocInterface(AsdocInterface object) {
				return createAsdocInterfaceAdapter();
			}
			@Override
			public Adapter caseAsdocField(AsdocField object) {
				return createAsdocFieldAdapter();
			}
			@Override
			public Adapter caseAsdocProperty(AsdocProperty object) {
				return createAsdocPropertyAdapter();
			}
			@Override
			public Adapter caseAsdocNamespace(AsdocNamespace object) {
				return createAsdocNamespaceAdapter();
			}
			@Override
			public Adapter caseAsdocParameter(AsdocParameter object) {
				return createAsdocParameterAdapter();
			}
			@Override
			public Adapter caseAsdocConstructor(AsdocConstructor object) {
				return createAsdocConstructorAdapter();
			}
			@Override
			public Adapter caseAsdocOperation(AsdocOperation object) {
				return createAsdocOperationAdapter();
			}
			@Override
			public Adapter caseAvmElement(AvmElement object) {
				return createAvmElementAdapter();
			}
			@Override
			public Adapter caseAvmIdentifiable(AvmIdentifiable object) {
				return createAvmIdentifiableAdapter();
			}
			@Override
			public Adapter caseAvmDefinition(AvmDefinition object) {
				return createAvmDefinitionAdapter();
			}
			@Override
			public Adapter caseAvmDeclaredElement(AvmDeclaredElement object) {
				return createAvmDeclaredElementAdapter();
			}
			@Override
			public Adapter caseAvmMember(AvmMember object) {
				return createAvmMemberAdapter();
			}
			@Override
			public Adapter caseAvmExecutable(AvmExecutable object) {
				return createAvmExecutableAdapter();
			}
			@Override
			public Adapter caseAvmDefinitionContainer(AvmDefinitionContainer object) {
				return createAvmDefinitionContainerAdapter();
			}
			@Override
			public Adapter caseAvmPackage(AvmPackage object) {
				return createAvmPackageAdapter();
			}
			@Override
			public Adapter caseAvmType(AvmType object) {
				return createAvmTypeAdapter();
			}
			@Override
			public Adapter caseAvmDeclaredType(AvmDeclaredType object) {
				return createAvmDeclaredTypeAdapter();
			}
			@Override
			public Adapter caseAvmClass(AvmClass object) {
				return createAvmClassAdapter();
			}
			@Override
			public Adapter caseAvmInterface(AvmInterface object) {
				return createAvmInterfaceAdapter();
			}
			@Override
			public Adapter caseAvmVariable(AvmVariable object) {
				return createAvmVariableAdapter();
			}
			@Override
			public Adapter caseAvmField(AvmField object) {
				return createAvmFieldAdapter();
			}
			@Override
			public Adapter caseAvmProperty(AvmProperty object) {
				return createAvmPropertyAdapter();
			}
			@Override
			public Adapter caseAvmNamespace(AvmNamespace object) {
				return createAvmNamespaceAdapter();
			}
			@Override
			public Adapter caseAvmParameter(AvmParameter object) {
				return createAvmParameterAdapter();
			}
			@Override
			public Adapter caseAvmConstructor(AvmConstructor object) {
				return createAvmConstructorAdapter();
			}
			@Override
			public Adapter caseAvmOperation(AvmOperation object) {
				return createAvmOperationAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocElement <em>Asdoc Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocElement
	 * @generated
	 */
	public Adapter createAsdocElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocDefinition <em>Asdoc Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocDefinition
	 * @generated
	 */
	public Adapter createAsdocDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocMember <em>Asdoc Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocMember
	 * @generated
	 */
	public Adapter createAsdocMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocExecutable <em>Asdoc Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocExecutable
	 * @generated
	 */
	public Adapter createAsdocExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocPackage <em>Asdoc Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocPackage
	 * @generated
	 */
	public Adapter createAsdocPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocRoot <em>Asdoc Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocRoot
	 * @generated
	 */
	public Adapter createAsdocRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocType <em>Asdoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocType
	 * @generated
	 */
	public Adapter createAsdocTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocClass <em>Asdoc Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocClass
	 * @generated
	 */
	public Adapter createAsdocClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocInterface <em>Asdoc Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocInterface
	 * @generated
	 */
	public Adapter createAsdocInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocField <em>Asdoc Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocField
	 * @generated
	 */
	public Adapter createAsdocFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocProperty <em>Asdoc Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocProperty
	 * @generated
	 */
	public Adapter createAsdocPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocNamespace <em>Asdoc Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocNamespace
	 * @generated
	 */
	public Adapter createAsdocNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocParameter <em>Asdoc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocParameter
	 * @generated
	 */
	public Adapter createAsdocParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocConstructor <em>Asdoc Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocConstructor
	 * @generated
	 */
	public Adapter createAsdocConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.asdoc.model.AsdocOperation <em>Asdoc Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.asdoc.model.AsdocOperation
	 * @generated
	 */
	public Adapter createAsdocOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmElement <em>Avm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmElement
	 * @generated
	 */
	public Adapter createAvmElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmIdentifiable <em>Avm Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmIdentifiable
	 * @generated
	 */
	public Adapter createAvmIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDefinition <em>Avm Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDefinition
	 * @generated
	 */
	public Adapter createAvmDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDeclaredElement <em>Avm Declared Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDeclaredElement
	 * @generated
	 */
	public Adapter createAvmDeclaredElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmMember <em>Avm Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmMember
	 * @generated
	 */
	public Adapter createAvmMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmExecutable <em>Avm Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmExecutable
	 * @generated
	 */
	public Adapter createAvmExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDefinitionContainer <em>Avm Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDefinitionContainer
	 * @generated
	 */
	public Adapter createAvmDefinitionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmPackage <em>Avm Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmPackage
	 * @generated
	 */
	public Adapter createAvmPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmType <em>Avm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmType
	 * @generated
	 */
	public Adapter createAvmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDeclaredType <em>Avm Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDeclaredType
	 * @generated
	 */
	public Adapter createAvmDeclaredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmClass <em>Avm Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmClass
	 * @generated
	 */
	public Adapter createAvmClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmInterface <em>Avm Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmInterface
	 * @generated
	 */
	public Adapter createAvmInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmVariable <em>Avm Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmVariable
	 * @generated
	 */
	public Adapter createAvmVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmField <em>Avm Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmField
	 * @generated
	 */
	public Adapter createAvmFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmProperty <em>Avm Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmProperty
	 * @generated
	 */
	public Adapter createAvmPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmNamespace <em>Avm Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmNamespace
	 * @generated
	 */
	public Adapter createAvmNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmParameter <em>Avm Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmParameter
	 * @generated
	 */
	public Adapter createAvmParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmConstructor <em>Avm Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmConstructor
	 * @generated
	 */
	public Adapter createAvmConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmOperation <em>Avm Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmOperation
	 * @generated
	 */
	public Adapter createAvmOperationAdapter() {
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

} //AsdocEAdapterFactory
