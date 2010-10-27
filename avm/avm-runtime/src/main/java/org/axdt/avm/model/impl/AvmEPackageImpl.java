/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model.impl;

import java.util.List;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.AvmClass;
import org.axdt.avm.model.AvmConstructor;
import org.axdt.avm.model.AvmDeclaredElement;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.axdt.avm.model.AvmElement;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmGeneric;
import org.axdt.avm.model.AvmGenericReference;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmInterface;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmNamespace;
import org.axdt.avm.model.AvmNull;
import org.axdt.avm.model.AvmNullReference;
import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmProperty;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVariable;
import org.axdt.avm.model.AvmVisibility;
import org.axdt.avm.model.AvmVoid;
import org.axdt.avm.model.AvmVoidReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvmEPackageImpl extends EPackageImpl implements AvmEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmIdentifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmDefinitionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmVoidReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmNullReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmGenericReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmDeclaredTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmReferableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmDeclaredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmDeclaredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmExecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmGenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum avmVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

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
	 * @see org.axdt.avm.AvmEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AvmEPackageImpl() {
		super(eNS_URI, AvmEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AvmEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AvmEPackage init() {
		if (isInited) return (AvmEPackage)EPackage.Registry.INSTANCE.getEPackage(AvmEPackage.eNS_URI);

		// Obtain or create and register package
		AvmEPackageImpl theAvmEPackage = (AvmEPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AvmEPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AvmEPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAvmEPackage.createPackageContents();

		// Initialize created meta-data
		theAvmEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAvmEPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AvmEPackage.eNS_URI, theAvmEPackage);
		return theAvmEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmIdentifiable() {
		return avmIdentifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmDefinition() {
		return avmDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmDefinitionContainer() {
		return avmDefinitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmPackage() {
		return avmPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmType() {
		return avmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmTypeReference() {
		return avmTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmVoidReference() {
		return avmVoidReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmNullReference() {
		return avmNullReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmGenericReference() {
		return avmGenericReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmDeclaredTypeReference() {
		return avmDeclaredTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvmDeclaredTypeReference_Type() {
		return (EReference)avmDeclaredTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmReferable() {
		return avmReferableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmDeclaredElement() {
		return avmDeclaredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmDeclaredType() {
		return avmDeclaredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmClass() {
		return avmClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmInterface() {
		return avmInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmMember() {
		return avmMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmExecutable() {
		return avmExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmVariable() {
		return avmVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmField() {
		return avmFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmProperty() {
		return avmPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmNamespace() {
		return avmNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmParameter() {
		return avmParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmConstructor() {
		return avmConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmOperation() {
		return avmOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmElement() {
		return avmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvmElement_Asdoc() {
		return (EAttribute)avmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmVoid() {
		return avmVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmNull() {
		return avmNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvmGeneric() {
		return avmGenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvmVisibility() {
		return avmVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvmEFactory getAvmEFactory() {
		return (AvmEFactory)getEFactoryInstance();
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
		avmIdentifiableEClass = createEClass(AVM_IDENTIFIABLE);

		avmDefinitionEClass = createEClass(AVM_DEFINITION);

		avmDefinitionContainerEClass = createEClass(AVM_DEFINITION_CONTAINER);

		avmPackageEClass = createEClass(AVM_PACKAGE);

		avmTypeEClass = createEClass(AVM_TYPE);

		avmTypeReferenceEClass = createEClass(AVM_TYPE_REFERENCE);

		avmDeclaredElementEClass = createEClass(AVM_DECLARED_ELEMENT);

		avmDeclaredTypeEClass = createEClass(AVM_DECLARED_TYPE);

		avmClassEClass = createEClass(AVM_CLASS);

		avmInterfaceEClass = createEClass(AVM_INTERFACE);

		avmMemberEClass = createEClass(AVM_MEMBER);

		avmExecutableEClass = createEClass(AVM_EXECUTABLE);

		avmVariableEClass = createEClass(AVM_VARIABLE);

		avmFieldEClass = createEClass(AVM_FIELD);

		avmPropertyEClass = createEClass(AVM_PROPERTY);

		avmNamespaceEClass = createEClass(AVM_NAMESPACE);

		avmParameterEClass = createEClass(AVM_PARAMETER);

		avmConstructorEClass = createEClass(AVM_CONSTRUCTOR);

		avmOperationEClass = createEClass(AVM_OPERATION);

		avmElementEClass = createEClass(AVM_ELEMENT);
		createEAttribute(avmElementEClass, AVM_ELEMENT__ASDOC);

		avmNullEClass = createEClass(AVM_NULL);

		avmVoidEClass = createEClass(AVM_VOID);

		avmGenericEClass = createEClass(AVM_GENERIC);

		avmVoidReferenceEClass = createEClass(AVM_VOID_REFERENCE);

		avmNullReferenceEClass = createEClass(AVM_NULL_REFERENCE);

		avmGenericReferenceEClass = createEClass(AVM_GENERIC_REFERENCE);

		avmDeclaredTypeReferenceEClass = createEClass(AVM_DECLARED_TYPE_REFERENCE);
		createEReference(avmDeclaredTypeReferenceEClass, AVM_DECLARED_TYPE_REFERENCE__TYPE);

		avmReferableEClass = createEClass(AVM_REFERABLE);

		// Create enums
		avmVisibilityEEnum = createEEnum(AVM_VISIBILITY);

		// Create data types
		listEDataType = createEDataType(LIST);
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

		// Create type parameters
		addETypeParameter(listEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		avmDefinitionEClass.getESuperTypes().add(this.getAvmIdentifiable());
		avmPackageEClass.getESuperTypes().add(this.getAvmDefinitionContainer());
		avmPackageEClass.getESuperTypes().add(this.getAvmDefinition());
		avmTypeEClass.getESuperTypes().add(this.getAvmDefinition());
		avmTypeEClass.getESuperTypes().add(this.getAvmReferable());
		avmDeclaredElementEClass.getESuperTypes().add(this.getAvmDefinition());
		avmDeclaredTypeEClass.getESuperTypes().add(this.getAvmDeclaredElement());
		avmDeclaredTypeEClass.getESuperTypes().add(this.getAvmType());
		avmClassEClass.getESuperTypes().add(this.getAvmDeclaredType());
		avmInterfaceEClass.getESuperTypes().add(this.getAvmDeclaredType());
		avmMemberEClass.getESuperTypes().add(this.getAvmDeclaredElement());
		avmMemberEClass.getESuperTypes().add(this.getAvmReferable());
		avmExecutableEClass.getESuperTypes().add(this.getAvmIdentifiable());
		avmVariableEClass.getESuperTypes().add(this.getAvmReferable());
		avmFieldEClass.getESuperTypes().add(this.getAvmMember());
		avmFieldEClass.getESuperTypes().add(this.getAvmVariable());
		avmPropertyEClass.getESuperTypes().add(this.getAvmField());
		avmNamespaceEClass.getESuperTypes().add(this.getAvmMember());
		avmParameterEClass.getESuperTypes().add(this.getAvmVariable());
		avmConstructorEClass.getESuperTypes().add(this.getAvmMember());
		avmConstructorEClass.getESuperTypes().add(this.getAvmExecutable());
		avmOperationEClass.getESuperTypes().add(this.getAvmMember());
		avmOperationEClass.getESuperTypes().add(this.getAvmExecutable());
		avmNullEClass.getESuperTypes().add(this.getAvmType());
		avmVoidEClass.getESuperTypes().add(this.getAvmType());
		avmGenericEClass.getESuperTypes().add(this.getAvmType());
		avmVoidReferenceEClass.getESuperTypes().add(this.getAvmTypeReference());
		avmNullReferenceEClass.getESuperTypes().add(this.getAvmTypeReference());
		avmGenericReferenceEClass.getESuperTypes().add(this.getAvmTypeReference());
		avmDeclaredTypeReferenceEClass.getESuperTypes().add(this.getAvmTypeReference());
		avmReferableEClass.getESuperTypes().add(this.getAvmIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(avmIdentifiableEClass, AvmIdentifiable.class, "AvmIdentifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmIdentifiableEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmDefinitionEClass, AvmDefinition.class, "AvmDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmDefinitionEClass, ecorePackage.getEString(), "getQualifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmDefinitionEClass, ecorePackage.getEString(), "getCanonicalName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmDefinitionContainerEClass, AvmDefinitionContainer.class, "AvmDefinitionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(avmDefinitionContainerEClass, null, "getTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(this.getAvmDeclaredType());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(avmDefinitionContainerEClass, null, "getMembers", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getAvmMember());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(avmPackageEClass, AvmPackage.class, "AvmPackage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmTypeEClass, AvmType.class, "AvmType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmTypeEClass, ecorePackage.getEBoolean(), "isDynamic", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmTypeEClass, ecorePackage.getEBoolean(), "isFinal", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmTypeEClass, ecorePackage.getEBoolean(), "isInterface", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmTypeEClass, ecorePackage.getEBoolean(), "isClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(avmTypeEClass, this.getAvmType(), "calculateCommonType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAvmType(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmTypeReferenceEClass, AvmTypeReference.class, "AvmTypeReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmTypeReferenceEClass, this.getAvmType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmDeclaredElementEClass, AvmDeclaredElement.class, "AvmDeclaredElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmDeclaredElementEClass, ecorePackage.getEString(), "getQualifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmDeclaredElementEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmDeclaredElementEClass, this.getAvmVisibility(), "getVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmDeclaredTypeEClass, AvmDeclaredType.class, "AvmDeclaredType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(avmDeclaredTypeEClass, null, "getSuperTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAvmTypeReference());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(avmDeclaredTypeEClass, this.getAvmTypeReference(), "getExtendedClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(avmDeclaredTypeEClass, null, "getExtendedInterfaces", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getAvmTypeReference());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(avmDeclaredTypeEClass, null, "getMembers", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getAvmMember());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(avmClassEClass, AvmClass.class, "AvmClass", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmInterfaceEClass, AvmInterface.class, "AvmInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmMemberEClass, AvmMember.class, "AvmMember", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmMemberEClass, ecorePackage.getEBoolean(), "isStatic", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmExecutableEClass, AvmExecutable.class, "AvmExecutable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(avmExecutableEClass, null, "getParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getAvmParameter());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		addEOperation(avmExecutableEClass, this.getAvmTypeReference(), "getReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmVariableEClass, AvmVariable.class, "AvmVariable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmVariableEClass, this.getAvmTypeReference(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmVariableEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmFieldEClass, AvmField.class, "AvmField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmFieldEClass, ecorePackage.getEBoolean(), "isConstant", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmFieldEClass, this.getAvmTypeReference(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmPropertyEClass, AvmProperty.class, "AvmProperty", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmPropertyEClass, ecorePackage.getEBoolean(), "isReadonly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmPropertyEClass, ecorePackage.getEBoolean(), "isWriteonly", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmPropertyEClass, this.getAvmOperation(), "getGetter", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmPropertyEClass, this.getAvmOperation(), "getSetter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmNamespaceEClass, AvmNamespace.class, "AvmNamespace", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmParameterEClass, AvmParameter.class, "AvmParameter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmParameterEClass, ecorePackage.getEBoolean(), "isRest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmConstructorEClass, AvmConstructor.class, "AvmConstructor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmOperationEClass, AvmOperation.class, "AvmOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(avmOperationEClass, ecorePackage.getEBoolean(), "isFinal", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmOperationEClass, ecorePackage.getEBoolean(), "isNative", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(avmOperationEClass, ecorePackage.getEBoolean(), "isOverride", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(avmElementEClass, AvmElement.class, "AvmElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAvmElement_Asdoc(), ecorePackage.getEString(), "asdoc", null, 0, 1, AvmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avmNullEClass, AvmNull.class, "AvmNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmVoidEClass, AvmVoid.class, "AvmVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmGenericEClass, AvmGeneric.class, "AvmGeneric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmVoidReferenceEClass, AvmVoidReference.class, "AvmVoidReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmNullReferenceEClass, AvmNullReference.class, "AvmNullReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmGenericReferenceEClass, AvmGenericReference.class, "AvmGenericReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmDeclaredTypeReferenceEClass, AvmDeclaredTypeReference.class, "AvmDeclaredTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvmDeclaredTypeReference_Type(), this.getAvmType(), null, "type", null, 0, 1, AvmDeclaredTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avmReferableEClass, AvmReferable.class, "AvmReferable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(avmVisibilityEEnum, AvmVisibility.class, "AvmVisibility");
		addEEnumLiteral(avmVisibilityEEnum, AvmVisibility.PUBLIC);
		addEEnumLiteral(avmVisibilityEEnum, AvmVisibility.INTERNAL);
		addEEnumLiteral(avmVisibilityEEnum, AvmVisibility.PROTECTED);
		addEEnumLiteral(avmVisibilityEEnum, AvmVisibility.PRIVATE);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AvmEPackageImpl
