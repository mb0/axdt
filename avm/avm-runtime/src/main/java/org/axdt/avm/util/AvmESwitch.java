/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.util;

import java.util.List;

import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.axdt.avm.AvmEPackage
 * @generated
 */
public class AvmESwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AvmEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmESwitch() {
		if (modelPackage == null) {
			modelPackage = AvmEPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AvmEPackage.AVM_IDENTIFIABLE: {
				AvmIdentifiable avmIdentifiable = (AvmIdentifiable)theEObject;
				T result = caseAvmIdentifiable(avmIdentifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_DEFINITION: {
				AvmDefinition avmDefinition = (AvmDefinition)theEObject;
				T result = caseAvmDefinition(avmDefinition);
				if (result == null) result = caseAvmIdentifiable(avmDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_DEFINITION_CONTAINER: {
				AvmDefinitionContainer avmDefinitionContainer = (AvmDefinitionContainer)theEObject;
				T result = caseAvmDefinitionContainer(avmDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_PACKAGE: {
				AvmPackage avmPackage = (AvmPackage)theEObject;
				T result = caseAvmPackage(avmPackage);
				if (result == null) result = caseAvmDefinitionContainer(avmPackage);
				if (result == null) result = caseAvmDefinition(avmPackage);
				if (result == null) result = caseAvmIdentifiable(avmPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_TYPE: {
				AvmType avmType = (AvmType)theEObject;
				T result = caseAvmType(avmType);
				if (result == null) result = caseAvmDefinition(avmType);
				if (result == null) result = caseAvmIdentifiable(avmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_TYPE_REFERENCE: {
				AvmTypeReference avmTypeReference = (AvmTypeReference)theEObject;
				T result = caseAvmTypeReference(avmTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_DECLARED_ELEMENT: {
				AvmDeclaredElement avmDeclaredElement = (AvmDeclaredElement)theEObject;
				T result = caseAvmDeclaredElement(avmDeclaredElement);
				if (result == null) result = caseAvmDefinition(avmDeclaredElement);
				if (result == null) result = caseAvmIdentifiable(avmDeclaredElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_DECLARED_TYPE: {
				AvmDeclaredType avmDeclaredType = (AvmDeclaredType)theEObject;
				T result = caseAvmDeclaredType(avmDeclaredType);
				if (result == null) result = caseAvmDeclaredElement(avmDeclaredType);
				if (result == null) result = caseAvmType(avmDeclaredType);
				if (result == null) result = caseAvmDefinition(avmDeclaredType);
				if (result == null) result = caseAvmIdentifiable(avmDeclaredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_CLASS: {
				AvmClass avmClass = (AvmClass)theEObject;
				T result = caseAvmClass(avmClass);
				if (result == null) result = caseAvmDeclaredType(avmClass);
				if (result == null) result = caseAvmDeclaredElement(avmClass);
				if (result == null) result = caseAvmType(avmClass);
				if (result == null) result = caseAvmDefinition(avmClass);
				if (result == null) result = caseAvmIdentifiable(avmClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_INTERFACE: {
				AvmInterface avmInterface = (AvmInterface)theEObject;
				T result = caseAvmInterface(avmInterface);
				if (result == null) result = caseAvmDeclaredType(avmInterface);
				if (result == null) result = caseAvmDeclaredElement(avmInterface);
				if (result == null) result = caseAvmType(avmInterface);
				if (result == null) result = caseAvmDefinition(avmInterface);
				if (result == null) result = caseAvmIdentifiable(avmInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_MEMBER: {
				AvmMember avmMember = (AvmMember)theEObject;
				T result = caseAvmMember(avmMember);
				if (result == null) result = caseAvmDeclaredElement(avmMember);
				if (result == null) result = caseAvmDefinition(avmMember);
				if (result == null) result = caseAvmIdentifiable(avmMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_EXECUTABLE: {
				AvmExecutable avmExecutable = (AvmExecutable)theEObject;
				T result = caseAvmExecutable(avmExecutable);
				if (result == null) result = caseAvmIdentifiable(avmExecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_VARIABLE: {
				AvmVariable avmVariable = (AvmVariable)theEObject;
				T result = caseAvmVariable(avmVariable);
				if (result == null) result = caseAvmIdentifiable(avmVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_FIELD: {
				AvmField avmField = (AvmField)theEObject;
				T result = caseAvmField(avmField);
				if (result == null) result = caseAvmMember(avmField);
				if (result == null) result = caseAvmVariable(avmField);
				if (result == null) result = caseAvmDeclaredElement(avmField);
				if (result == null) result = caseAvmDefinition(avmField);
				if (result == null) result = caseAvmIdentifiable(avmField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_PROPERTY: {
				AvmProperty avmProperty = (AvmProperty)theEObject;
				T result = caseAvmProperty(avmProperty);
				if (result == null) result = caseAvmField(avmProperty);
				if (result == null) result = caseAvmMember(avmProperty);
				if (result == null) result = caseAvmVariable(avmProperty);
				if (result == null) result = caseAvmDeclaredElement(avmProperty);
				if (result == null) result = caseAvmDefinition(avmProperty);
				if (result == null) result = caseAvmIdentifiable(avmProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_NAMESPACE: {
				AvmNamespace avmNamespace = (AvmNamespace)theEObject;
				T result = caseAvmNamespace(avmNamespace);
				if (result == null) result = caseAvmMember(avmNamespace);
				if (result == null) result = caseAvmDeclaredElement(avmNamespace);
				if (result == null) result = caseAvmDefinition(avmNamespace);
				if (result == null) result = caseAvmIdentifiable(avmNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_PARAMETER: {
				AvmParameter avmParameter = (AvmParameter)theEObject;
				T result = caseAvmParameter(avmParameter);
				if (result == null) result = caseAvmVariable(avmParameter);
				if (result == null) result = caseAvmIdentifiable(avmParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_CONSTRUCTOR: {
				AvmConstructor avmConstructor = (AvmConstructor)theEObject;
				T result = caseAvmConstructor(avmConstructor);
				if (result == null) result = caseAvmMember(avmConstructor);
				if (result == null) result = caseAvmExecutable(avmConstructor);
				if (result == null) result = caseAvmDeclaredElement(avmConstructor);
				if (result == null) result = caseAvmDefinition(avmConstructor);
				if (result == null) result = caseAvmIdentifiable(avmConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_OPERATION: {
				AvmOperation avmOperation = (AvmOperation)theEObject;
				T result = caseAvmOperation(avmOperation);
				if (result == null) result = caseAvmMember(avmOperation);
				if (result == null) result = caseAvmExecutable(avmOperation);
				if (result == null) result = caseAvmDeclaredElement(avmOperation);
				if (result == null) result = caseAvmDefinition(avmOperation);
				if (result == null) result = caseAvmIdentifiable(avmOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_ELEMENT: {
				AvmElement avmElement = (AvmElement)theEObject;
				T result = caseAvmElement(avmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_NULL: {
				AvmNull avmNull = (AvmNull)theEObject;
				T result = caseAvmNull(avmNull);
				if (result == null) result = caseAvmType(avmNull);
				if (result == null) result = caseAvmDefinition(avmNull);
				if (result == null) result = caseAvmIdentifiable(avmNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_VOID: {
				AvmVoid avmVoid = (AvmVoid)theEObject;
				T result = caseAvmVoid(avmVoid);
				if (result == null) result = caseAvmType(avmVoid);
				if (result == null) result = caseAvmDefinition(avmVoid);
				if (result == null) result = caseAvmIdentifiable(avmVoid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_GENERIC: {
				AvmGeneric avmGeneric = (AvmGeneric)theEObject;
				T result = caseAvmGeneric(avmGeneric);
				if (result == null) result = caseAvmType(avmGeneric);
				if (result == null) result = caseAvmDefinition(avmGeneric);
				if (result == null) result = caseAvmIdentifiable(avmGeneric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_VOID_REFERENCE: {
				AvmVoidReference avmVoidReference = (AvmVoidReference)theEObject;
				T result = caseAvmVoidReference(avmVoidReference);
				if (result == null) result = caseAvmTypeReference(avmVoidReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_NULL_REFERENCE: {
				AvmNullReference avmNullReference = (AvmNullReference)theEObject;
				T result = caseAvmNullReference(avmNullReference);
				if (result == null) result = caseAvmTypeReference(avmNullReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_GENERIC_REFERENCE: {
				AvmGenericReference avmGenericReference = (AvmGenericReference)theEObject;
				T result = caseAvmGenericReference(avmGenericReference);
				if (result == null) result = caseAvmTypeReference(avmGenericReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvmEPackage.AVM_DECLARED_TYPE_REFERENCE: {
				AvmDeclaredTypeReference avmDeclaredTypeReference = (AvmDeclaredTypeReference)theEObject;
				T result = caseAvmDeclaredTypeReference(avmDeclaredTypeReference);
				if (result == null) result = caseAvmTypeReference(avmDeclaredTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmIdentifiable(AvmIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDefinition(AvmDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDefinitionContainer(AvmDefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmPackage(AvmPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmType(AvmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmTypeReference(AvmTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Void Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Void Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmVoidReference(AvmVoidReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Null Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Null Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmNullReference(AvmNullReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Generic Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Generic Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmGenericReference(AvmGenericReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Declared Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Declared Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDeclaredTypeReference(AvmDeclaredTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Declared Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Declared Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDeclaredElement(AvmDeclaredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Declared Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDeclaredType(AvmDeclaredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmClass(AvmClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmInterface(AvmInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmMember(AvmMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmExecutable(AvmExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmVariable(AvmVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmField(AvmField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmProperty(AvmProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmNamespace(AvmNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmParameter(AvmParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmConstructor(AvmConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmOperation(AvmOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmElement(AvmElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmVoid(AvmVoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmNull(AvmNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Generic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Generic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmGeneric(AvmGeneric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //AvmESwitch
