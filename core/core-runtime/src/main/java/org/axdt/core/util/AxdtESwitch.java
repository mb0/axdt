/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.core.util;

import java.util.List;

import org.axdt.core.AxdtEPackage;
import org.axdt.core.model.*;
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
 * @see org.axdt.core.AxdtEPackage
 * @generated
 */
public class AxdtESwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AxdtEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxdtESwitch() {
		if (modelPackage == null) {
			modelPackage = AxdtEPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T1 doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(EClass theEClass, EObject theEObject) {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AxdtEPackage.AXDT_ELEMENT: {
				AxdtElement axdtElement = (AxdtElement)theEObject;
				T1 result = caseAxdtElement(axdtElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_HANDLE: {
				AxdtHandle<?> axdtHandle = (AxdtHandle<?>)theEObject;
				T1 result = caseAxdtHandle(axdtHandle);
				if (result == null) result = caseAxdtElement(axdtHandle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_MODEL: {
				AxdtModel axdtModel = (AxdtModel)theEObject;
				T1 result = caseAxdtModel(axdtModel);
				if (result == null) result = caseAxdtElement(axdtModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_PROJECT: {
				AxdtProject axdtProject = (AxdtProject)theEObject;
				T1 result = caseAxdtProject(axdtProject);
				if (result == null) result = caseAxdtElement(axdtProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_PROJECT_SOURCE: {
				AxdtProjectSource axdtProjectSource = (AxdtProjectSource)theEObject;
				T1 result = caseAxdtProjectSource(axdtProjectSource);
				if (result == null) result = caseAxdtProject(axdtProjectSource);
				if (result == null) result = caseAxdtElement(axdtProjectSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_PROJECT_HANDLE: {
				AxdtProjectHandle axdtProjectHandle = (AxdtProjectHandle)theEObject;
				T1 result = caseAxdtProjectHandle(axdtProjectHandle);
				if (result == null) result = caseAxdtHandle(axdtProjectHandle);
				if (result == null) result = caseAxdtProject(axdtProjectHandle);
				if (result == null) result = caseAxdtElement(axdtProjectHandle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_PACKAGE_ROOT: {
				AxdtPackageRoot axdtPackageRoot = (AxdtPackageRoot)theEObject;
				T1 result = caseAxdtPackageRoot(axdtPackageRoot);
				if (result == null) result = caseAxdtElement(axdtPackageRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_PACKAGE_ROOT_SOURCE: {
				AxdtPackageRootSource axdtPackageRootSource = (AxdtPackageRootSource)theEObject;
				T1 result = caseAxdtPackageRootSource(axdtPackageRootSource);
				if (result == null) result = caseAxdtPackageRoot(axdtPackageRootSource);
				if (result == null) result = caseAxdtElement(axdtPackageRootSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AxdtEPackage.AXDT_PACKAGE_ROOT_HANDLE: {
				AxdtPackageRootHandle axdtPackageRootHandle = (AxdtPackageRootHandle)theEObject;
				T1 result = caseAxdtPackageRootHandle(axdtPackageRootHandle);
				if (result == null) result = caseAxdtHandle(axdtPackageRootHandle);
				if (result == null) result = caseAxdtPackageRoot(axdtPackageRootHandle);
				if (result == null) result = caseAxdtElement(axdtPackageRootHandle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtElement(AxdtElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AxdtElement> T1 caseAxdtHandle(AxdtHandle<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtProject(AxdtProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Package Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Package Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtPackageRoot(AxdtPackageRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtModel(AxdtModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Project Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Project Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtProjectSource(AxdtProjectSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Project Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Project Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtProjectHandle(AxdtProjectHandle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Package Root Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Package Root Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtPackageRootSource(AxdtPackageRootSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axdt Package Root Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axdt Package Root Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAxdtPackageRootHandle(AxdtPackageRootHandle object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //AxdtESwitch
