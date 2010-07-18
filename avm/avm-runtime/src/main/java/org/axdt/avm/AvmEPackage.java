/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.axdt.avm.AvmEFactory
 * @model kind="package"
 * @generated
 */
public interface AvmEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "avm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://axdt.org/uri/Avm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "avm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvmEPackage eINSTANCE = org.axdt.avm.model.impl.AvmEPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmIdentifiable <em>Avm Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmIdentifiable
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmIdentifiable()
	 * @generated
	 */
	int AVM_IDENTIFIABLE = 0;

	/**
	 * The number of structural features of the '<em>Avm Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_IDENTIFIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmDefinition <em>Avm Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinition
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDefinition()
	 * @generated
	 */
	int AVM_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Avm Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_DEFINITION_FEATURE_COUNT = AVM_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmDefinitionContainer <em>Avm Definition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDefinitionContainer
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDefinitionContainer()
	 * @generated
	 */
	int AVM_DEFINITION_CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Avm Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_DEFINITION_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmPackage <em>Avm Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmPackage
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmPackage()
	 * @generated
	 */
	int AVM_PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Avm Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_PACKAGE_FEATURE_COUNT = AVM_DEFINITION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmType <em>Avm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmType
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmType()
	 * @generated
	 */
	int AVM_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Avm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_TYPE_FEATURE_COUNT = AVM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmTypeReferenceImpl <em>Avm Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmTypeReferenceImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmTypeReference()
	 * @generated
	 */
	int AVM_TYPE_REFERENCE = 5;

	/**
	 * The number of structural features of the '<em>Avm Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_TYPE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmVoidReferenceImpl <em>Avm Void Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmVoidReferenceImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVoidReference()
	 * @generated
	 */
	int AVM_VOID_REFERENCE = 23;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmNullReferenceImpl <em>Avm Null Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmNullReferenceImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmNullReference()
	 * @generated
	 */
	int AVM_NULL_REFERENCE = 24;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmGenericReferenceImpl <em>Avm Generic Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmGenericReferenceImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmGenericReference()
	 * @generated
	 */
	int AVM_GENERIC_REFERENCE = 25;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmDeclaredTypeReferenceImpl <em>Avm Declared Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmDeclaredTypeReferenceImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDeclaredTypeReference()
	 * @generated
	 */
	int AVM_DECLARED_TYPE_REFERENCE = 26;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmDeclaredElement <em>Avm Declared Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredElement
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDeclaredElement()
	 * @generated
	 */
	int AVM_DECLARED_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Avm Declared Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_DECLARED_ELEMENT_FEATURE_COUNT = AVM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmDeclaredType <em>Avm Declared Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmDeclaredType
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDeclaredType()
	 * @generated
	 */
	int AVM_DECLARED_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Avm Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_DECLARED_TYPE_FEATURE_COUNT = AVM_DECLARED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmClass <em>Avm Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmClass
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmClass()
	 * @generated
	 */
	int AVM_CLASS = 8;

	/**
	 * The number of structural features of the '<em>Avm Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_CLASS_FEATURE_COUNT = AVM_DECLARED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmInterface <em>Avm Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmInterface
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmInterface()
	 * @generated
	 */
	int AVM_INTERFACE = 9;

	/**
	 * The number of structural features of the '<em>Avm Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_INTERFACE_FEATURE_COUNT = AVM_DECLARED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmMember <em>Avm Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmMember
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmMember()
	 * @generated
	 */
	int AVM_MEMBER = 10;

	/**
	 * The number of structural features of the '<em>Avm Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_MEMBER_FEATURE_COUNT = AVM_DECLARED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmField <em>Avm Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmField
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmField()
	 * @generated
	 */
	int AVM_FIELD = 13;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmProperty <em>Avm Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmProperty
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmProperty()
	 * @generated
	 */
	int AVM_PROPERTY = 14;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmNamespace <em>Avm Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmNamespace
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmNamespace()
	 * @generated
	 */
	int AVM_NAMESPACE = 15;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmParameter <em>Avm Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmParameter
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmParameter()
	 * @generated
	 */
	int AVM_PARAMETER = 16;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmExecutable <em>Avm Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmExecutable
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmExecutable()
	 * @generated
	 */
	int AVM_EXECUTABLE = 11;

	/**
	 * The number of structural features of the '<em>Avm Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_EXECUTABLE_FEATURE_COUNT = AVM_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmVariable <em>Avm Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmVariable
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVariable()
	 * @generated
	 */
	int AVM_VARIABLE = 12;

	/**
	 * The number of structural features of the '<em>Avm Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_VARIABLE_FEATURE_COUNT = AVM_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_FIELD_FEATURE_COUNT = AVM_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_PROPERTY_FEATURE_COUNT = AVM_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_NAMESPACE_FEATURE_COUNT = AVM_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_PARAMETER_FEATURE_COUNT = AVM_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmConstructor <em>Avm Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmConstructor
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmConstructor()
	 * @generated
	 */
	int AVM_CONSTRUCTOR = 17;

	/**
	 * The number of structural features of the '<em>Avm Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_CONSTRUCTOR_FEATURE_COUNT = AVM_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmOperation <em>Avm Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmOperation
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmOperation()
	 * @generated
	 */
	int AVM_OPERATION = 18;

	/**
	 * The number of structural features of the '<em>Avm Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_OPERATION_FEATURE_COUNT = AVM_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmElementImpl <em>Avm Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmElementImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmElement()
	 * @generated
	 */
	int AVM_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_ELEMENT__ASDOC = 0;

	/**
	 * The number of structural features of the '<em>Avm Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmVoidImpl <em>Avm Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmVoidImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVoid()
	 * @generated
	 */
	int AVM_VOID = 21;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmNullImpl <em>Avm Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmNullImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmNull()
	 * @generated
	 */
	int AVM_NULL = 20;

	/**
	 * The number of structural features of the '<em>Avm Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_NULL_FEATURE_COUNT = AVM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_VOID_FEATURE_COUNT = AVM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.impl.AvmGenericImpl <em>Avm Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.impl.AvmGenericImpl
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmGeneric()
	 * @generated
	 */
	int AVM_GENERIC = 22;

	/**
	 * The number of structural features of the '<em>Avm Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_GENERIC_FEATURE_COUNT = AVM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Void Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_VOID_REFERENCE_FEATURE_COUNT = AVM_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Null Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_NULL_REFERENCE_FEATURE_COUNT = AVM_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Generic Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_GENERIC_REFERENCE_FEATURE_COUNT = AVM_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_DECLARED_TYPE_REFERENCE__TYPE = AVM_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avm Declared Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_DECLARED_TYPE_REFERENCE_FEATURE_COUNT = AVM_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.avm.model.AvmVisibility <em>Avm Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.avm.model.AvmVisibility
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVisibility()
	 * @generated
	 */
	int AVM_VISIBILITY = 27;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getList()
	 * @generated
	 */
	int LIST = 28;

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmIdentifiable <em>Avm Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Identifiable</em>'.
	 * @see org.axdt.avm.model.AvmIdentifiable
	 * @generated
	 */
	EClass getAvmIdentifiable();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmDefinition <em>Avm Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Definition</em>'.
	 * @see org.axdt.avm.model.AvmDefinition
	 * @generated
	 */
	EClass getAvmDefinition();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmDefinitionContainer <em>Avm Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Definition Container</em>'.
	 * @see org.axdt.avm.model.AvmDefinitionContainer
	 * @generated
	 */
	EClass getAvmDefinitionContainer();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmPackage <em>Avm Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Package</em>'.
	 * @see org.axdt.avm.model.AvmPackage
	 * @generated
	 */
	EClass getAvmPackage();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmType <em>Avm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Type</em>'.
	 * @see org.axdt.avm.model.AvmType
	 * @generated
	 */
	EClass getAvmType();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmTypeReference <em>Avm Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Type Reference</em>'.
	 * @see org.axdt.avm.model.AvmTypeReference
	 * @generated
	 */
	EClass getAvmTypeReference();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmVoidReference <em>Avm Void Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Void Reference</em>'.
	 * @see org.axdt.avm.model.AvmVoidReference
	 * @generated
	 */
	EClass getAvmVoidReference();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmNullReference <em>Avm Null Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Null Reference</em>'.
	 * @see org.axdt.avm.model.AvmNullReference
	 * @generated
	 */
	EClass getAvmNullReference();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmGenericReference <em>Avm Generic Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Generic Reference</em>'.
	 * @see org.axdt.avm.model.AvmGenericReference
	 * @generated
	 */
	EClass getAvmGenericReference();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmDeclaredTypeReference <em>Avm Declared Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Declared Type Reference</em>'.
	 * @see org.axdt.avm.model.AvmDeclaredTypeReference
	 * @generated
	 */
	EClass getAvmDeclaredTypeReference();

	/**
	 * Returns the meta object for the reference '{@link org.axdt.avm.model.AvmDeclaredTypeReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.axdt.avm.model.AvmDeclaredTypeReference#getType()
	 * @see #getAvmDeclaredTypeReference()
	 * @generated
	 */
	EReference getAvmDeclaredTypeReference_Type();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmDeclaredElement <em>Avm Declared Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Declared Element</em>'.
	 * @see org.axdt.avm.model.AvmDeclaredElement
	 * @generated
	 */
	EClass getAvmDeclaredElement();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmDeclaredType <em>Avm Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Declared Type</em>'.
	 * @see org.axdt.avm.model.AvmDeclaredType
	 * @generated
	 */
	EClass getAvmDeclaredType();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmClass <em>Avm Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Class</em>'.
	 * @see org.axdt.avm.model.AvmClass
	 * @generated
	 */
	EClass getAvmClass();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmInterface <em>Avm Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Interface</em>'.
	 * @see org.axdt.avm.model.AvmInterface
	 * @generated
	 */
	EClass getAvmInterface();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmMember <em>Avm Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Member</em>'.
	 * @see org.axdt.avm.model.AvmMember
	 * @generated
	 */
	EClass getAvmMember();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmField <em>Avm Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Field</em>'.
	 * @see org.axdt.avm.model.AvmField
	 * @generated
	 */
	EClass getAvmField();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmProperty <em>Avm Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Property</em>'.
	 * @see org.axdt.avm.model.AvmProperty
	 * @generated
	 */
	EClass getAvmProperty();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmNamespace <em>Avm Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Namespace</em>'.
	 * @see org.axdt.avm.model.AvmNamespace
	 * @generated
	 */
	EClass getAvmNamespace();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmParameter <em>Avm Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Parameter</em>'.
	 * @see org.axdt.avm.model.AvmParameter
	 * @generated
	 */
	EClass getAvmParameter();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmExecutable <em>Avm Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Executable</em>'.
	 * @see org.axdt.avm.model.AvmExecutable
	 * @generated
	 */
	EClass getAvmExecutable();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmVariable <em>Avm Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Variable</em>'.
	 * @see org.axdt.avm.model.AvmVariable
	 * @generated
	 */
	EClass getAvmVariable();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmConstructor <em>Avm Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Constructor</em>'.
	 * @see org.axdt.avm.model.AvmConstructor
	 * @generated
	 */
	EClass getAvmConstructor();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmOperation <em>Avm Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Operation</em>'.
	 * @see org.axdt.avm.model.AvmOperation
	 * @generated
	 */
	EClass getAvmOperation();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmElement <em>Avm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Element</em>'.
	 * @see org.axdt.avm.model.AvmElement
	 * @generated
	 */
	EClass getAvmElement();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.avm.model.AvmElement#getAsdoc <em>Asdoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asdoc</em>'.
	 * @see org.axdt.avm.model.AvmElement#getAsdoc()
	 * @see #getAvmElement()
	 * @generated
	 */
	EAttribute getAvmElement_Asdoc();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmVoid <em>Avm Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Void</em>'.
	 * @see org.axdt.avm.model.AvmVoid
	 * @generated
	 */
	EClass getAvmVoid();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmNull <em>Avm Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Null</em>'.
	 * @see org.axdt.avm.model.AvmNull
	 * @generated
	 */
	EClass getAvmNull();

	/**
	 * Returns the meta object for class '{@link org.axdt.avm.model.AvmGeneric <em>Avm Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm Generic</em>'.
	 * @see org.axdt.avm.model.AvmGeneric
	 * @generated
	 */
	EClass getAvmGeneric();

	/**
	 * Returns the meta object for enum '{@link org.axdt.avm.model.AvmVisibility <em>Avm Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Avm Visibility</em>'.
	 * @see org.axdt.avm.model.AvmVisibility
	 * @generated
	 */
	EEnum getAvmVisibility();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="E"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AvmEFactory getAvmEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmIdentifiable <em>Avm Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmIdentifiable
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmIdentifiable()
		 * @generated
		 */
		EClass AVM_IDENTIFIABLE = eINSTANCE.getAvmIdentifiable();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmDefinition <em>Avm Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmDefinition
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDefinition()
		 * @generated
		 */
		EClass AVM_DEFINITION = eINSTANCE.getAvmDefinition();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmDefinitionContainer <em>Avm Definition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmDefinitionContainer
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDefinitionContainer()
		 * @generated
		 */
		EClass AVM_DEFINITION_CONTAINER = eINSTANCE.getAvmDefinitionContainer();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmPackage <em>Avm Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmPackage
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmPackage()
		 * @generated
		 */
		EClass AVM_PACKAGE = eINSTANCE.getAvmPackage();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmType <em>Avm Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmType
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmType()
		 * @generated
		 */
		EClass AVM_TYPE = eINSTANCE.getAvmType();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmTypeReferenceImpl <em>Avm Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmTypeReferenceImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmTypeReference()
		 * @generated
		 */
		EClass AVM_TYPE_REFERENCE = eINSTANCE.getAvmTypeReference();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmVoidReferenceImpl <em>Avm Void Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmVoidReferenceImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVoidReference()
		 * @generated
		 */
		EClass AVM_VOID_REFERENCE = eINSTANCE.getAvmVoidReference();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmNullReferenceImpl <em>Avm Null Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmNullReferenceImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmNullReference()
		 * @generated
		 */
		EClass AVM_NULL_REFERENCE = eINSTANCE.getAvmNullReference();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmGenericReferenceImpl <em>Avm Generic Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmGenericReferenceImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmGenericReference()
		 * @generated
		 */
		EClass AVM_GENERIC_REFERENCE = eINSTANCE.getAvmGenericReference();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmDeclaredTypeReferenceImpl <em>Avm Declared Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmDeclaredTypeReferenceImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDeclaredTypeReference()
		 * @generated
		 */
		EClass AVM_DECLARED_TYPE_REFERENCE = eINSTANCE.getAvmDeclaredTypeReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVM_DECLARED_TYPE_REFERENCE__TYPE = eINSTANCE.getAvmDeclaredTypeReference_Type();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmDeclaredElement <em>Avm Declared Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmDeclaredElement
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDeclaredElement()
		 * @generated
		 */
		EClass AVM_DECLARED_ELEMENT = eINSTANCE.getAvmDeclaredElement();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmDeclaredType <em>Avm Declared Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmDeclaredType
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmDeclaredType()
		 * @generated
		 */
		EClass AVM_DECLARED_TYPE = eINSTANCE.getAvmDeclaredType();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmClass <em>Avm Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmClass
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmClass()
		 * @generated
		 */
		EClass AVM_CLASS = eINSTANCE.getAvmClass();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmInterface <em>Avm Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmInterface
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmInterface()
		 * @generated
		 */
		EClass AVM_INTERFACE = eINSTANCE.getAvmInterface();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmMember <em>Avm Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmMember
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmMember()
		 * @generated
		 */
		EClass AVM_MEMBER = eINSTANCE.getAvmMember();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmField <em>Avm Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmField
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmField()
		 * @generated
		 */
		EClass AVM_FIELD = eINSTANCE.getAvmField();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmProperty <em>Avm Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmProperty
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmProperty()
		 * @generated
		 */
		EClass AVM_PROPERTY = eINSTANCE.getAvmProperty();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmNamespace <em>Avm Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmNamespace
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmNamespace()
		 * @generated
		 */
		EClass AVM_NAMESPACE = eINSTANCE.getAvmNamespace();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmParameter <em>Avm Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmParameter
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmParameter()
		 * @generated
		 */
		EClass AVM_PARAMETER = eINSTANCE.getAvmParameter();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmExecutable <em>Avm Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmExecutable
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmExecutable()
		 * @generated
		 */
		EClass AVM_EXECUTABLE = eINSTANCE.getAvmExecutable();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmVariable <em>Avm Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmVariable
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVariable()
		 * @generated
		 */
		EClass AVM_VARIABLE = eINSTANCE.getAvmVariable();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmConstructor <em>Avm Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmConstructor
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmConstructor()
		 * @generated
		 */
		EClass AVM_CONSTRUCTOR = eINSTANCE.getAvmConstructor();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmOperation <em>Avm Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmOperation
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmOperation()
		 * @generated
		 */
		EClass AVM_OPERATION = eINSTANCE.getAvmOperation();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmElementImpl <em>Avm Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmElementImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmElement()
		 * @generated
		 */
		EClass AVM_ELEMENT = eINSTANCE.getAvmElement();

		/**
		 * The meta object literal for the '<em><b>Asdoc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVM_ELEMENT__ASDOC = eINSTANCE.getAvmElement_Asdoc();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmVoidImpl <em>Avm Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmVoidImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVoid()
		 * @generated
		 */
		EClass AVM_VOID = eINSTANCE.getAvmVoid();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmNullImpl <em>Avm Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmNullImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmNull()
		 * @generated
		 */
		EClass AVM_NULL = eINSTANCE.getAvmNull();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.impl.AvmGenericImpl <em>Avm Generic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.impl.AvmGenericImpl
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmGeneric()
		 * @generated
		 */
		EClass AVM_GENERIC = eINSTANCE.getAvmGeneric();

		/**
		 * The meta object literal for the '{@link org.axdt.avm.model.AvmVisibility <em>Avm Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.avm.model.AvmVisibility
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getAvmVisibility()
		 * @generated
		 */
		EEnum AVM_VISIBILITY = eINSTANCE.getAvmVisibility();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.axdt.avm.model.impl.AvmEPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

	}

} //AvmEPackage
