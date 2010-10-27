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
import org.axdt.asdoc.model.AsdocDefinition;
import org.axdt.asdoc.model.AsdocElement;
import org.axdt.asdoc.model.AsdocExecutable;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocInterface;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocNamespace;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocParameter;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.model.ParseType;
import org.axdt.avm.AvmEPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdocEPackageImpl extends EPackageImpl implements AsdocEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocExecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdocOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parseLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parseTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.axdt.asdoc.AsdocEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AsdocEPackageImpl() {
		super(eNS_URI, AsdocEFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AsdocEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AsdocEPackage init() {
		if (isInited) return (AsdocEPackage)EPackage.Registry.INSTANCE.getEPackage(AsdocEPackage.eNS_URI);

		// Obtain or create and register package
		AsdocEPackageImpl theAsdocEPackage = (AsdocEPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AsdocEPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AsdocEPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AvmEPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAsdocEPackage.createPackageContents();

		// Initialize created meta-data
		theAsdocEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAsdocEPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AsdocEPackage.eNS_URI, theAsdocEPackage);
		return theAsdocEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocElement() {
		return asdocElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocDefinition() {
		return asdocDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocDefinition_Name() {
		return (EAttribute)asdocDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocMember() {
		return asdocMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocMember_Visibility() {
		return (EAttribute)asdocMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocMember_Static() {
		return (EAttribute)asdocMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocExecutable() {
		return asdocExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocExecutable_Parameters() {
		return (EReference)asdocExecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocPackage() {
		return asdocPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocPackage_CanonicalName() {
		return (EAttribute)asdocPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocPackage_Packages() {
		return (EReference)asdocPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocPackage_Parent() {
		return (EReference)asdocPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocPackage_Types() {
		return (EReference)asdocPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocPackage_Members() {
		return (EReference)asdocPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocPackage_PackageContentParsed() {
		return (EAttribute)asdocPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocPackage_TypeContentParsed() {
		return (EAttribute)asdocPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocPackage_GlobalContentParsed() {
		return (EAttribute)asdocPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocPackage_MemberContentParsed() {
		return (EAttribute)asdocPackageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocPackage_TypeContentAvailable() {
		return (EAttribute)asdocPackageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocPackage_GlobalContentAvailable() {
		return (EAttribute)asdocPackageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocRoot() {
		return asdocRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocRoot_BaseUri() {
		return (EAttribute)asdocRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocRoot_Version() {
		return (EAttribute)asdocRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocRoot_ParseType() {
		return (EAttribute)asdocRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocType() {
		return asdocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocType_Visibility() {
		return (EAttribute)asdocTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocType_Members() {
		return (EReference)asdocTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocType_ExtendedInterfaces() {
		return (EReference)asdocTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocType_MemberContentParsed() {
		return (EAttribute)asdocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocClass() {
		return asdocClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocClass_Dynamic() {
		return (EAttribute)asdocClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocClass_Final() {
		return (EAttribute)asdocClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocClass_ExtendedClass() {
		return (EReference)asdocClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocInterface() {
		return asdocInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocField() {
		return asdocFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocField_Constant() {
		return (EAttribute)asdocFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocField_Type() {
		return (EReference)asdocFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocProperty() {
		return asdocPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocProperty_Readonly() {
		return (EAttribute)asdocPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocProperty_Writeonly() {
		return (EAttribute)asdocPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocNamespace() {
		return asdocNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocParameter() {
		return asdocParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocParameter_Type() {
		return (EReference)asdocParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocParameter_Rest() {
		return (EAttribute)asdocParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocConstructor() {
		return asdocConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsdocOperation() {
		return asdocOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocOperation_Native() {
		return (EAttribute)asdocOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocOperation_Override() {
		return (EAttribute)asdocOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsdocOperation_ReturnType() {
		return (EReference)asdocOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsdocOperation_Final() {
		return (EAttribute)asdocOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParseLevel() {
		return parseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParseType() {
		return parseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocEFactory getAsdocEFactory() {
		return (AsdocEFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		asdocElementEClass = createEClass(ASDOC_ELEMENT);

		asdocDefinitionEClass = createEClass(ASDOC_DEFINITION);
		createEAttribute(asdocDefinitionEClass, ASDOC_DEFINITION__NAME);

		asdocMemberEClass = createEClass(ASDOC_MEMBER);
		createEAttribute(asdocMemberEClass, ASDOC_MEMBER__VISIBILITY);
		createEAttribute(asdocMemberEClass, ASDOC_MEMBER__STATIC);

		asdocExecutableEClass = createEClass(ASDOC_EXECUTABLE);
		createEReference(asdocExecutableEClass, ASDOC_EXECUTABLE__PARAMETERS);

		asdocPackageEClass = createEClass(ASDOC_PACKAGE);
		createEAttribute(asdocPackageEClass, ASDOC_PACKAGE__CANONICAL_NAME);
		createEReference(asdocPackageEClass, ASDOC_PACKAGE__PACKAGES);
		createEReference(asdocPackageEClass, ASDOC_PACKAGE__PARENT);
		createEReference(asdocPackageEClass, ASDOC_PACKAGE__TYPES);
		createEReference(asdocPackageEClass, ASDOC_PACKAGE__MEMBERS);
		createEAttribute(asdocPackageEClass, ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED);
		createEAttribute(asdocPackageEClass, ASDOC_PACKAGE__TYPE_CONTENT_PARSED);
		createEAttribute(asdocPackageEClass, ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED);
		createEAttribute(asdocPackageEClass, ASDOC_PACKAGE__MEMBER_CONTENT_PARSED);
		createEAttribute(asdocPackageEClass, ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE);
		createEAttribute(asdocPackageEClass, ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE);

		asdocRootEClass = createEClass(ASDOC_ROOT);
		createEAttribute(asdocRootEClass, ASDOC_ROOT__BASE_URI);
		createEAttribute(asdocRootEClass, ASDOC_ROOT__VERSION);
		createEAttribute(asdocRootEClass, ASDOC_ROOT__PARSE_TYPE);

		asdocTypeEClass = createEClass(ASDOC_TYPE);
		createEAttribute(asdocTypeEClass, ASDOC_TYPE__VISIBILITY);
		createEReference(asdocTypeEClass, ASDOC_TYPE__MEMBERS);
		createEReference(asdocTypeEClass, ASDOC_TYPE__EXTENDED_INTERFACES);
		createEAttribute(asdocTypeEClass, ASDOC_TYPE__MEMBER_CONTENT_PARSED);

		asdocClassEClass = createEClass(ASDOC_CLASS);
		createEAttribute(asdocClassEClass, ASDOC_CLASS__DYNAMIC);
		createEAttribute(asdocClassEClass, ASDOC_CLASS__FINAL);
		createEReference(asdocClassEClass, ASDOC_CLASS__EXTENDED_CLASS);

		asdocInterfaceEClass = createEClass(ASDOC_INTERFACE);

		asdocFieldEClass = createEClass(ASDOC_FIELD);
		createEAttribute(asdocFieldEClass, ASDOC_FIELD__CONSTANT);
		createEReference(asdocFieldEClass, ASDOC_FIELD__TYPE);

		asdocPropertyEClass = createEClass(ASDOC_PROPERTY);
		createEAttribute(asdocPropertyEClass, ASDOC_PROPERTY__READONLY);
		createEAttribute(asdocPropertyEClass, ASDOC_PROPERTY__WRITEONLY);

		asdocNamespaceEClass = createEClass(ASDOC_NAMESPACE);

		asdocParameterEClass = createEClass(ASDOC_PARAMETER);
		createEReference(asdocParameterEClass, ASDOC_PARAMETER__TYPE);
		createEAttribute(asdocParameterEClass, ASDOC_PARAMETER__REST);

		asdocConstructorEClass = createEClass(ASDOC_CONSTRUCTOR);

		asdocOperationEClass = createEClass(ASDOC_OPERATION);
		createEAttribute(asdocOperationEClass, ASDOC_OPERATION__NATIVE);
		createEAttribute(asdocOperationEClass, ASDOC_OPERATION__OVERRIDE);
		createEReference(asdocOperationEClass, ASDOC_OPERATION__RETURN_TYPE);
		createEAttribute(asdocOperationEClass, ASDOC_OPERATION__FINAL);

		// Create enums
		parseLevelEEnum = createEEnum(PARSE_LEVEL);
		parseTypeEEnum = createEEnum(PARSE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AvmEPackage theAvmEPackage = (AvmEPackage)EPackage.Registry.INSTANCE.getEPackage(AvmEPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		asdocElementEClass.getESuperTypes().add(theAvmEPackage.getAvmElement());
		asdocElementEClass.getESuperTypes().add(theAvmEPackage.getAvmIdentifiable());
		asdocDefinitionEClass.getESuperTypes().add(this.getAsdocElement());
		asdocDefinitionEClass.getESuperTypes().add(theAvmEPackage.getAvmDefinition());
		asdocMemberEClass.getESuperTypes().add(this.getAsdocDefinition());
		asdocMemberEClass.getESuperTypes().add(theAvmEPackage.getAvmMember());
		asdocExecutableEClass.getESuperTypes().add(this.getAsdocMember());
		asdocExecutableEClass.getESuperTypes().add(theAvmEPackage.getAvmExecutable());
		asdocPackageEClass.getESuperTypes().add(this.getAsdocElement());
		asdocPackageEClass.getESuperTypes().add(theAvmEPackage.getAvmPackage());
		asdocRootEClass.getESuperTypes().add(this.getAsdocPackage());
		asdocTypeEClass.getESuperTypes().add(this.getAsdocDefinition());
		asdocTypeEClass.getESuperTypes().add(theAvmEPackage.getAvmDeclaredType());
		asdocClassEClass.getESuperTypes().add(this.getAsdocType());
		asdocClassEClass.getESuperTypes().add(theAvmEPackage.getAvmClass());
		asdocInterfaceEClass.getESuperTypes().add(this.getAsdocType());
		asdocInterfaceEClass.getESuperTypes().add(theAvmEPackage.getAvmInterface());
		asdocFieldEClass.getESuperTypes().add(this.getAsdocMember());
		asdocFieldEClass.getESuperTypes().add(theAvmEPackage.getAvmField());
		asdocPropertyEClass.getESuperTypes().add(this.getAsdocField());
		asdocPropertyEClass.getESuperTypes().add(theAvmEPackage.getAvmProperty());
		asdocNamespaceEClass.getESuperTypes().add(this.getAsdocMember());
		asdocNamespaceEClass.getESuperTypes().add(theAvmEPackage.getAvmNamespace());
		asdocParameterEClass.getESuperTypes().add(this.getAsdocDefinition());
		asdocParameterEClass.getESuperTypes().add(theAvmEPackage.getAvmParameter());
		asdocConstructorEClass.getESuperTypes().add(this.getAsdocExecutable());
		asdocConstructorEClass.getESuperTypes().add(theAvmEPackage.getAvmConstructor());
		asdocOperationEClass.getESuperTypes().add(this.getAsdocExecutable());
		asdocOperationEClass.getESuperTypes().add(theAvmEPackage.getAvmOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(asdocElementEClass, AsdocElement.class, "AsdocElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(asdocElementEClass, ecorePackage.getEString(), "getFullUri", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(asdocElementEClass, this.getAsdocRoot(), "getRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(asdocDefinitionEClass, AsdocDefinition.class, "AsdocDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, AsdocDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocMemberEClass, AsdocMember.class, "AsdocMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocMember_Visibility(), theAvmEPackage.getAvmVisibility(), "visibility", "3", 0, 1, AsdocMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocMember_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, AsdocMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocExecutableEClass, AsdocExecutable.class, "AsdocExecutable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsdocExecutable_Parameters(), this.getAsdocParameter(), null, "parameters", null, 0, -1, AsdocExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocPackageEClass, AsdocPackage.class, "AsdocPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocPackage_CanonicalName(), ecorePackage.getEString(), "canonicalName", null, 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsdocPackage_Packages(), this.getAsdocPackage(), this.getAsdocPackage_Parent(), "packages", null, 0, -1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsdocPackage_Parent(), this.getAsdocPackage(), this.getAsdocPackage_Packages(), "parent", null, 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsdocPackage_Types(), this.getAsdocType(), null, "types", null, 0, -1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsdocPackage_Members(), this.getAsdocMember(), null, "members", null, 0, -1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocPackage_PackageContentParsed(), ecorePackage.getEBoolean(), "packageContentParsed", "false", 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocPackage_TypeContentParsed(), ecorePackage.getEBoolean(), "typeContentParsed", "false", 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocPackage_GlobalContentParsed(), ecorePackage.getEBoolean(), "globalContentParsed", "false", 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocPackage_MemberContentParsed(), ecorePackage.getEBoolean(), "memberContentParsed", "false", 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocPackage_TypeContentAvailable(), ecorePackage.getEBoolean(), "typeContentAvailable", "false", 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocPackage_GlobalContentAvailable(), ecorePackage.getEBoolean(), "globalContentAvailable", "false", 0, 1, AsdocPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(asdocPackageEClass, this.getAsdocPackage(), "getChildPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asdocPackageEClass, this.getAsdocPackage(), "createChildPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(asdocRootEClass, AsdocRoot.class, "AsdocRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocRoot_BaseUri(), ecorePackage.getEString(), "baseUri", null, 0, 1, AsdocRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocRoot_Version(), ecorePackage.getEInt(), "version", "1", 0, 1, AsdocRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocRoot_ParseType(), this.getParseType(), "parseType", "", 0, 1, AsdocRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(asdocRootEClass, this.getAsdocPackage(), "getPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fqn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(asdocRootEClass, this.getAsdocPackage(), "createPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fqn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(asdocTypeEClass, AsdocType.class, "AsdocType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocType_Visibility(), theAvmEPackage.getAvmVisibility(), "visibility", "3", 0, 1, AsdocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsdocType_Members(), this.getAsdocMember(), null, "members", null, 0, -1, AsdocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsdocType_ExtendedInterfaces(), theAvmEPackage.getAvmTypeReference(), null, "extendedInterfaces", null, 0, -1, AsdocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocType_MemberContentParsed(), ecorePackage.getEBoolean(), "memberContentParsed", "false", 0, 1, AsdocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocClassEClass, AsdocClass.class, "AsdocClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocClass_Dynamic(), ecorePackage.getEBoolean(), "dynamic", "false", 0, 1, AsdocClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsdocClass_Final(), ecorePackage.getEBoolean(), "final", "false", 0, 1, AsdocClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAsdocClass_ExtendedClass(), theAvmEPackage.getAvmTypeReference(), null, "extendedClass", null, 0, 1, AsdocClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocInterfaceEClass, AsdocInterface.class, "AsdocInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asdocFieldEClass, AsdocField.class, "AsdocField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocField_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, AsdocField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsdocField_Type(), theAvmEPackage.getAvmTypeReference(), null, "type", null, 0, 1, AsdocField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocPropertyEClass, AsdocProperty.class, "AsdocProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocProperty_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, AsdocProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocProperty_Writeonly(), ecorePackage.getEBoolean(), "writeonly", null, 0, 1, AsdocProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocNamespaceEClass, AsdocNamespace.class, "AsdocNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asdocParameterEClass, AsdocParameter.class, "AsdocParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsdocParameter_Type(), theAvmEPackage.getAvmTypeReference(), null, "type", null, 0, 1, AsdocParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocParameter_Rest(), ecorePackage.getEBoolean(), "rest", null, 0, 1, AsdocParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asdocConstructorEClass, AsdocConstructor.class, "AsdocConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asdocOperationEClass, AsdocOperation.class, "AsdocOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsdocOperation_Native(), ecorePackage.getEBoolean(), "native", "false", 0, 1, AsdocOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsdocOperation_Override(), ecorePackage.getEBoolean(), "override", "false", 0, 1, AsdocOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAsdocOperation_ReturnType(), theAvmEPackage.getAvmTypeReference(), null, "returnType", null, 0, 1, AsdocOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsdocOperation_Final(), ecorePackage.getEBoolean(), "final", "false", 0, 1, AsdocOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parseLevelEEnum, ParseLevel.class, "ParseLevel");
		addEEnumLiteral(parseLevelEEnum, ParseLevel.EMPTY);
		addEEnumLiteral(parseLevelEEnum, ParseLevel.PACKAGE);
		addEEnumLiteral(parseLevelEEnum, ParseLevel.TYPE);
		addEEnumLiteral(parseLevelEEnum, ParseLevel.GLOBAL);
		addEEnumLiteral(parseLevelEEnum, ParseLevel.MEMBER);

		initEEnum(parseTypeEEnum, ParseType.class, "ParseType");
		addEEnumLiteral(parseTypeEEnum, ParseType.NONE);
		addEEnumLiteral(parseTypeEEnum, ParseType.HTML);
		addEEnumLiteral(parseTypeEEnum, ParseType.DITA);

		// Create resource
		createResource(eNS_URI);
	}

} //AsdocEPackageImpl
