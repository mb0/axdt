/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.util;

import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.avm.AvmEPackage
 * @generated
 */
public class AvmEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AvmEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AvmEPackage.eINSTANCE;
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
	protected AvmESwitch<Adapter> modelSwitch =
		new AvmESwitch<Adapter>() {
			@Override
			public Adapter caseAvmIdentifiable(AvmIdentifiable object) {
				return createAvmIdentifiableAdapter();
			}
			@Override
			public Adapter caseAvmDefinition(AvmDefinition object) {
				return createAvmDefinitionAdapter();
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
			public Adapter caseAvmTypeReference(AvmTypeReference object) {
				return createAvmTypeReferenceAdapter();
			}
			@Override
			public Adapter caseAvmDeclaredElement(AvmDeclaredElement object) {
				return createAvmDeclaredElementAdapter();
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
			public Adapter caseAvmMember(AvmMember object) {
				return createAvmMemberAdapter();
			}
			@Override
			public Adapter caseAvmExecutable(AvmExecutable object) {
				return createAvmExecutableAdapter();
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
			public Adapter caseAvmElement(AvmElement object) {
				return createAvmElementAdapter();
			}
			@Override
			public Adapter caseAvmVoid(AvmVoid object) {
				return createAvmVoidAdapter();
			}
			@Override
			public Adapter caseAvmNull(AvmNull object) {
				return createAvmNullAdapter();
			}
			@Override
			public Adapter caseAvmGeneric(AvmGeneric object) {
				return createAvmGenericAdapter();
			}
			@Override
			public Adapter caseAvmVoidReference(AvmVoidReference object) {
				return createAvmVoidReferenceAdapter();
			}
			@Override
			public Adapter caseAvmNullReference(AvmNullReference object) {
				return createAvmNullReferenceAdapter();
			}
			@Override
			public Adapter caseAvmGenericReference(AvmGenericReference object) {
				return createAvmGenericReferenceAdapter();
			}
			@Override
			public Adapter caseAvmDeclaredTypeReference(AvmDeclaredTypeReference object) {
				return createAvmDeclaredTypeReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmTypeReference <em>Avm Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmTypeReference
	 * @generated
	 */
	public Adapter createAvmTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmVoidReference <em>Avm Void Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmVoidReference
	 * @generated
	 */
	public Adapter createAvmVoidReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmNullReference <em>Avm Null Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmNullReference
	 * @generated
	 */
	public Adapter createAvmNullReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmGenericReference <em>Avm Generic Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmGenericReference
	 * @generated
	 */
	public Adapter createAvmGenericReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDeclaredTypeReference <em>Avm Declared Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDeclaredTypeReference
	 * @generated
	 */
	public Adapter createAvmDeclaredTypeReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmVoid <em>Avm Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmVoid
	 * @generated
	 */
	public Adapter createAvmVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmNull <em>Avm Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmNull
	 * @generated
	 */
	public Adapter createAvmNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmGeneric <em>Avm Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmGeneric
	 * @generated
	 */
	public Adapter createAvmGenericAdapter() {
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

} //AvmEAdapterFactory
