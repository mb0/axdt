/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.util;

import java.util.List;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.*;
import org.axdt.avm.model.AvmConstructor;
import org.axdt.avm.model.AvmDeclaredElement;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.axdt.avm.model.AvmElement;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmNamespace;
import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmProperty;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmVariable;
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
 * @see org.axdt.asdoc.AsdocEPackage
 * @generated
 */
public class AsdocESwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AsdocEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocESwitch() {
		if (modelPackage == null) {
			modelPackage = AsdocEPackage.eINSTANCE;
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
			case AsdocEPackage.ASDOC_ELEMENT: {
				AsdocElement asdocElement = (AsdocElement)theEObject;
				T result = caseAsdocElement(asdocElement);
				if (result == null) result = caseAvmElement(asdocElement);
				if (result == null) result = caseAvmIdentifiable(asdocElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_DEFINITION: {
				AsdocDefinition asdocDefinition = (AsdocDefinition)theEObject;
				T result = caseAsdocDefinition(asdocDefinition);
				if (result == null) result = caseAsdocElement(asdocDefinition);
				if (result == null) result = caseAvmDefinition(asdocDefinition);
				if (result == null) result = caseAvmElement(asdocDefinition);
				if (result == null) result = caseAvmIdentifiable(asdocDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_MEMBER: {
				AsdocMember asdocMember = (AsdocMember)theEObject;
				T result = caseAsdocMember(asdocMember);
				if (result == null) result = caseAsdocDefinition(asdocMember);
				if (result == null) result = caseAvmMember(asdocMember);
				if (result == null) result = caseAsdocElement(asdocMember);
				if (result == null) result = caseAvmDeclaredElement(asdocMember);
				if (result == null) result = caseAvmElement(asdocMember);
				if (result == null) result = caseAvmIdentifiable(asdocMember);
				if (result == null) result = caseAvmDefinition(asdocMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_EXECUTABLE: {
				AsdocExecutable asdocExecutable = (AsdocExecutable)theEObject;
				T result = caseAsdocExecutable(asdocExecutable);
				if (result == null) result = caseAsdocMember(asdocExecutable);
				if (result == null) result = caseAvmExecutable(asdocExecutable);
				if (result == null) result = caseAsdocDefinition(asdocExecutable);
				if (result == null) result = caseAvmMember(asdocExecutable);
				if (result == null) result = caseAsdocElement(asdocExecutable);
				if (result == null) result = caseAvmDeclaredElement(asdocExecutable);
				if (result == null) result = caseAvmElement(asdocExecutable);
				if (result == null) result = caseAvmIdentifiable(asdocExecutable);
				if (result == null) result = caseAvmDefinition(asdocExecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_PACKAGE: {
				AsdocPackage asdocPackage = (AsdocPackage)theEObject;
				T result = caseAsdocPackage(asdocPackage);
				if (result == null) result = caseAsdocElement(asdocPackage);
				if (result == null) result = caseAvmPackage(asdocPackage);
				if (result == null) result = caseAvmElement(asdocPackage);
				if (result == null) result = caseAvmDefinitionContainer(asdocPackage);
				if (result == null) result = caseAvmDefinition(asdocPackage);
				if (result == null) result = caseAvmIdentifiable(asdocPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_ROOT: {
				AsdocRoot asdocRoot = (AsdocRoot)theEObject;
				T result = caseAsdocRoot(asdocRoot);
				if (result == null) result = caseAsdocPackage(asdocRoot);
				if (result == null) result = caseAsdocElement(asdocRoot);
				if (result == null) result = caseAvmPackage(asdocRoot);
				if (result == null) result = caseAvmElement(asdocRoot);
				if (result == null) result = caseAvmDefinitionContainer(asdocRoot);
				if (result == null) result = caseAvmDefinition(asdocRoot);
				if (result == null) result = caseAvmIdentifiable(asdocRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_TYPE: {
				AsdocType asdocType = (AsdocType)theEObject;
				T result = caseAsdocType(asdocType);
				if (result == null) result = caseAsdocDefinition(asdocType);
				if (result == null) result = caseAvmDeclaredType(asdocType);
				if (result == null) result = caseAsdocElement(asdocType);
				if (result == null) result = caseAvmDeclaredElement(asdocType);
				if (result == null) result = caseAvmType(asdocType);
				if (result == null) result = caseAvmElement(asdocType);
				if (result == null) result = caseAvmIdentifiable(asdocType);
				if (result == null) result = caseAvmDefinition(asdocType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_FIELD: {
				AsdocField asdocField = (AsdocField)theEObject;
				T result = caseAsdocField(asdocField);
				if (result == null) result = caseAsdocMember(asdocField);
				if (result == null) result = caseAvmField(asdocField);
				if (result == null) result = caseAsdocDefinition(asdocField);
				if (result == null) result = caseAvmMember(asdocField);
				if (result == null) result = caseAvmVariable(asdocField);
				if (result == null) result = caseAsdocElement(asdocField);
				if (result == null) result = caseAvmDeclaredElement(asdocField);
				if (result == null) result = caseAvmElement(asdocField);
				if (result == null) result = caseAvmIdentifiable(asdocField);
				if (result == null) result = caseAvmDefinition(asdocField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_PROPERTY: {
				AsdocProperty asdocProperty = (AsdocProperty)theEObject;
				T result = caseAsdocProperty(asdocProperty);
				if (result == null) result = caseAsdocField(asdocProperty);
				if (result == null) result = caseAvmProperty(asdocProperty);
				if (result == null) result = caseAsdocMember(asdocProperty);
				if (result == null) result = caseAvmField(asdocProperty);
				if (result == null) result = caseAsdocDefinition(asdocProperty);
				if (result == null) result = caseAvmMember(asdocProperty);
				if (result == null) result = caseAvmVariable(asdocProperty);
				if (result == null) result = caseAsdocElement(asdocProperty);
				if (result == null) result = caseAvmDeclaredElement(asdocProperty);
				if (result == null) result = caseAvmElement(asdocProperty);
				if (result == null) result = caseAvmIdentifiable(asdocProperty);
				if (result == null) result = caseAvmDefinition(asdocProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_NAMESPACE: {
				AsdocNamespace asdocNamespace = (AsdocNamespace)theEObject;
				T result = caseAsdocNamespace(asdocNamespace);
				if (result == null) result = caseAsdocMember(asdocNamespace);
				if (result == null) result = caseAvmNamespace(asdocNamespace);
				if (result == null) result = caseAsdocDefinition(asdocNamespace);
				if (result == null) result = caseAvmMember(asdocNamespace);
				if (result == null) result = caseAsdocElement(asdocNamespace);
				if (result == null) result = caseAvmDeclaredElement(asdocNamespace);
				if (result == null) result = caseAvmElement(asdocNamespace);
				if (result == null) result = caseAvmIdentifiable(asdocNamespace);
				if (result == null) result = caseAvmDefinition(asdocNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_PARAMETER: {
				AsdocParameter asdocParameter = (AsdocParameter)theEObject;
				T result = caseAsdocParameter(asdocParameter);
				if (result == null) result = caseAsdocDefinition(asdocParameter);
				if (result == null) result = caseAvmParameter(asdocParameter);
				if (result == null) result = caseAsdocElement(asdocParameter);
				if (result == null) result = caseAvmDefinition(asdocParameter);
				if (result == null) result = caseAvmVariable(asdocParameter);
				if (result == null) result = caseAvmElement(asdocParameter);
				if (result == null) result = caseAvmIdentifiable(asdocParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_CONSTRUCTOR: {
				AsdocConstructor asdocConstructor = (AsdocConstructor)theEObject;
				T result = caseAsdocConstructor(asdocConstructor);
				if (result == null) result = caseAsdocExecutable(asdocConstructor);
				if (result == null) result = caseAvmConstructor(asdocConstructor);
				if (result == null) result = caseAsdocMember(asdocConstructor);
				if (result == null) result = caseAvmExecutable(asdocConstructor);
				if (result == null) result = caseAsdocDefinition(asdocConstructor);
				if (result == null) result = caseAvmMember(asdocConstructor);
				if (result == null) result = caseAsdocElement(asdocConstructor);
				if (result == null) result = caseAvmDeclaredElement(asdocConstructor);
				if (result == null) result = caseAvmElement(asdocConstructor);
				if (result == null) result = caseAvmIdentifiable(asdocConstructor);
				if (result == null) result = caseAvmDefinition(asdocConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdocEPackage.ASDOC_OPERATION: {
				AsdocOperation asdocOperation = (AsdocOperation)theEObject;
				T result = caseAsdocOperation(asdocOperation);
				if (result == null) result = caseAsdocExecutable(asdocOperation);
				if (result == null) result = caseAvmOperation(asdocOperation);
				if (result == null) result = caseAsdocMember(asdocOperation);
				if (result == null) result = caseAvmExecutable(asdocOperation);
				if (result == null) result = caseAsdocDefinition(asdocOperation);
				if (result == null) result = caseAvmMember(asdocOperation);
				if (result == null) result = caseAsdocElement(asdocOperation);
				if (result == null) result = caseAvmDeclaredElement(asdocOperation);
				if (result == null) result = caseAvmElement(asdocOperation);
				if (result == null) result = caseAvmIdentifiable(asdocOperation);
				if (result == null) result = caseAvmDefinition(asdocOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocElement(AsdocElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocDefinition(AsdocDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocMember(AsdocMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocExecutable(AsdocExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocPackage(AsdocPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocRoot(AsdocRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocType(AsdocType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocField(AsdocField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocProperty(AsdocProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocNamespace(AsdocNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocParameter(AsdocParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocConstructor(AsdocConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asdoc Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asdoc Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsdocOperation(AsdocOperation object) {
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

} //AsdocESwitch
