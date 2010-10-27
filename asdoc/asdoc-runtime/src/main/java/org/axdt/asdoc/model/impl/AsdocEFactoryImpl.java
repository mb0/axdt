/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model.impl;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocClass;
import org.axdt.asdoc.model.AsdocConstructor;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocInterface;
import org.axdt.asdoc.model.AsdocNamespace;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocParameter;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.model.ParseType;
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
			case AsdocEPackage.ASDOC_CLASS: return createAsdocClass();
			case AsdocEPackage.ASDOC_INTERFACE: return createAsdocInterface();
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
			case AsdocEPackage.PARSE_TYPE:
				return createParseTypeFromString(eDataType, initialValue);
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
			case AsdocEPackage.PARSE_TYPE:
				return convertParseTypeToString(eDataType, instanceValue);
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
	public AsdocClass createAsdocClass() {
		AsdocClassImpl asdocClass = new AsdocClassImpl();
		return asdocClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocInterface createAsdocInterface() {
		AsdocInterfaceImpl asdocInterface = new AsdocInterfaceImpl();
		return asdocInterface;
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
	public AsdocRoot createAsdocRoot() {
		AsdocRootImpl docRoot = new AsdocRootImpl();
		docRoot.setTypeContentAvailable(true);
		docRoot.setGlobalContentAvailable(true);
		docRoot.setCanonicalName("");
		return docRoot;
	}
	public AsdocRoot createAsdocRoot(String uri) {
		AsdocRoot asdocRoot = createAsdocRoot();
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
	public ParseType createParseTypeFromString(EDataType eDataType, String initialValue) {
		ParseType result = ParseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParseTypeToString(EDataType eDataType, Object instanceValue) {
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
