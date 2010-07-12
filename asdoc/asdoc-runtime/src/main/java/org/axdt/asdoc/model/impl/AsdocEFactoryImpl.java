/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.*;
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
public class AsdocEFactoryImpl extends EFactoryImpl implements AsdocEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AsdocEFactory init() {
		try {
			AsdocEFactory theAsdocEFactory = (AsdocEFactory)EPackage.Registry.INSTANCE.getEFactory("http://axdt.org/uri/Asdoc"); 
			if (theAsdocEFactory != null) {
				return theAsdocEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AsdocEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocEFactoryImpl() {
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
			case AsdocEPackage.ASDOC_PACKAGE: return createAsdocPackage();
			case AsdocEPackage.ASDOC_ROOT: return createAsdocRoot();
			case AsdocEPackage.ASDOC_TYPE: return createAsdocType();
			case AsdocEPackage.ASDOC_FIELD: return createAsdocField();
			case AsdocEPackage.ASDOC_PROPERTY: return createAsdocProperty();
			case AsdocEPackage.ASDOC_NAMESPACE: return createAsdocNamespace();
			case AsdocEPackage.ASDOC_PARAMETER: return createAsdocParameter();
			case AsdocEPackage.ASDOC_CONSTRUCTOR: return createAsdocConstructor();
			case AsdocEPackage.ASDOC_OPERATION: return createAsdocOperation();
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
			case AsdocEPackage.PARSE_LEVEL:
				return createParseLevelFromString(eDataType, initialValue);
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
			case AsdocEPackage.PARSE_LEVEL:
				return convertParseLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocPackage createAsdocPackage() {
		AsdocPackageImpl asdocPackage = new AsdocPackageImpl();
		return asdocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocRoot createAsdocRoot() {
		AsdocRootImpl asdocRoot = new AsdocRootImpl();
		return asdocRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocType createAsdocType() {
		AsdocTypeImpl asdocType = new AsdocTypeImpl();
		return asdocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocField createAsdocField() {
		AsdocFieldImpl asdocField = new AsdocFieldImpl();
		return asdocField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocProperty createAsdocProperty() {
		AsdocPropertyImpl asdocProperty = new AsdocPropertyImpl();
		return asdocProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocNamespace createAsdocNamespace() {
		AsdocNamespaceImpl asdocNamespace = new AsdocNamespaceImpl();
		return asdocNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocParameter createAsdocParameter() {
		AsdocParameterImpl asdocParameter = new AsdocParameterImpl();
		return asdocParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocConstructor createAsdocConstructor() {
		AsdocConstructorImpl asdocConstructor = new AsdocConstructorImpl();
		return asdocConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocOperation createAsdocOperation() {
		AsdocOperationImpl asdocOperation = new AsdocOperationImpl();
		return asdocOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AsdocRoot createDocRoot() {
		AsdocRootImpl docRoot = new AsdocRootImpl();
		docRoot.setCanonicalName("");
		return docRoot;
	}
	public AsdocRoot createDocRoot(String uri) {
		AsdocRoot asdocRoot = createDocRoot();
		asdocRoot.setBaseUri(uri);
		return asdocRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseLevel createParseLevelFromString(EDataType eDataType, String initialValue) {
		ParseLevel result = ParseLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParseLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocEPackage getAsdocEPackage() {
		return (AsdocEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AsdocEPackage getPackage() {
		return AsdocEPackage.eINSTANCE;
	}

} //AsdocEFactoryImpl