/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm.model.impl;

import java.util.List;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmEFactoryImpl extends EFactoryImpl implements AvmEFactory {
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AvmEFactory init() {
		try {
			AvmEFactory theAvmEFactory = (AvmEFactory)EPackage.Registry.INSTANCE.getEFactory("http://axdt.org/uri/Avm"); 
			if (theAvmEFactory != null) {
				return theAvmEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AvmEFactoryImpl();
	}

	protected AvmVoidImpl avmVoid = null;
	protected AvmGenericImpl avmGeneric = null;

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmEFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AvmEPackage.AVM_NULL: return createAvmNull();
			case AvmEPackage.AVM_VOID: return createAvmVoid();
			case AvmEPackage.AVM_GENERIC: return createAvmGeneric();
			case AvmEPackage.AVM_VOID_REFERENCE: return createAvmVoidReference();
			case AvmEPackage.AVM_NULL_REFERENCE: return createAvmNullReference();
			case AvmEPackage.AVM_GENERIC_REFERENCE: return createAvmGenericReference();
			case AvmEPackage.AVM_DECLARED_TYPE_REFERENCE: return createAvmDeclaredTypeReference();
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
			case AvmEPackage.AVM_VISIBILITY:
				return createAvmVisibilityFromString(eDataType, initialValue);
			case AvmEPackage.LIST:
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
			case AvmEPackage.AVM_VISIBILITY:
				return convertAvmVisibilityToString(eDataType, instanceValue);
			case AvmEPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmVoidReference createAvmVoidReference() {
		AvmVoidReferenceImpl avmVoidReference = new AvmVoidReferenceImpl();
		return avmVoidReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmNullReference createAvmNullReference() {
		AvmNullReferenceImpl avmNullReference = new AvmNullReferenceImpl();
		return avmNullReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmGenericReference createAvmGenericReference() {
		AvmGenericReferenceImpl avmGenericReference = new AvmGenericReferenceImpl();
		return avmGenericReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmDeclaredTypeReference createAvmDeclaredTypeReference() {
		AvmDeclaredTypeReferenceImpl avmDeclaredTypeReference = new AvmDeclaredTypeReferenceImpl();
		return avmDeclaredTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmVoid createAvmVoid() {
		if (avmVoid == null)
			avmVoid = new AvmVoidImpl();
		return avmVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmNull createAvmNull() {
		AvmNullImpl avmNull = new AvmNullImpl();
		return avmNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmGeneric createAvmGeneric() {
		if (avmGeneric == null)
			avmGeneric = new AvmGenericImpl();
		return avmGeneric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmVisibility createAvmVisibilityFromString(EDataType eDataType, String initialValue) {
		AvmVisibility result = AvmVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvmVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public AvmEPackage getAvmEPackage() {
		return (AvmEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AvmEPackage getPackage() {
		return AvmEPackage.eINSTANCE;
	}

} //AvmEFactoryImpl
