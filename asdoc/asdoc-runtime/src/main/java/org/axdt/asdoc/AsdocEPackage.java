/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc;

import org.axdt.avm.AvmEPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.axdt.asdoc.AsdocEFactory
 * @model kind="package"
 * @generated
 */
public interface AsdocEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "asdoc";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://axdt.org/uri/Asdoc";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asdoc";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsdocEPackage eINSTANCE = org.axdt.asdoc.model.impl.AsdocEPackageImpl.init();
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocElementImpl <em>Asdoc Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocElementImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocElement()
	 * @generated
	 */
	int ASDOC_ELEMENT = 0;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ELEMENT__ASDOC = AvmEPackage.AVM_ELEMENT__ASDOC;
	/**
	 * The number of structural features of the '<em>Asdoc Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ELEMENT_FEATURE_COUNT = AvmEPackage.AVM_ELEMENT_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocDefinitionImpl <em>Asdoc Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocDefinitionImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocDefinition()
	 * @generated
	 */
	int ASDOC_DEFINITION = 1;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_DEFINITION__ASDOC = ASDOC_ELEMENT__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_DEFINITION__NAME = ASDOC_ELEMENT_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Asdoc Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_DEFINITION_FEATURE_COUNT = ASDOC_ELEMENT_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocMemberImpl <em>Asdoc Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocMemberImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocMember()
	 * @generated
	 */
	int ASDOC_MEMBER = 2;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_MEMBER__ASDOC = ASDOC_DEFINITION__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_MEMBER__NAME = ASDOC_DEFINITION__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_MEMBER__VISIBILITY = ASDOC_DEFINITION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_MEMBER__STATIC = ASDOC_DEFINITION_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Asdoc Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_MEMBER_FEATURE_COUNT = ASDOC_DEFINITION_FEATURE_COUNT + 2;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocExecutableImpl <em>Asdoc Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocExecutableImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocExecutable()
	 * @generated
	 */
	int ASDOC_EXECUTABLE = 3;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_EXECUTABLE__ASDOC = ASDOC_MEMBER__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_EXECUTABLE__NAME = ASDOC_MEMBER__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_EXECUTABLE__VISIBILITY = ASDOC_MEMBER__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_EXECUTABLE__STATIC = ASDOC_MEMBER__STATIC;
	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_EXECUTABLE__PARAMETERS = ASDOC_MEMBER_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Asdoc Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_EXECUTABLE_FEATURE_COUNT = ASDOC_MEMBER_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocPackageImpl <em>Asdoc Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocPackageImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocPackage()
	 * @generated
	 */
	int ASDOC_PACKAGE = 4;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__ASDOC = ASDOC_ELEMENT__ASDOC;
	/**
	 * The feature id for the '<em><b>Canonical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__CANONICAL_NAME = ASDOC_ELEMENT_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__PACKAGES = ASDOC_ELEMENT_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__PARENT = ASDOC_ELEMENT_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__TYPES = ASDOC_ELEMENT_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__MEMBERS = ASDOC_ELEMENT_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Package Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED = ASDOC_ELEMENT_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Type Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__TYPE_CONTENT_PARSED = ASDOC_ELEMENT_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Global Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED = ASDOC_ELEMENT_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Member Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__MEMBER_CONTENT_PARSED = ASDOC_ELEMENT_FEATURE_COUNT + 8;
	/**
	 * The feature id for the '<em><b>Type Content Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE = ASDOC_ELEMENT_FEATURE_COUNT + 9;
	/**
	 * The feature id for the '<em><b>Global Content Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE = ASDOC_ELEMENT_FEATURE_COUNT + 10;
	/**
	 * The number of structural features of the '<em>Asdoc Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PACKAGE_FEATURE_COUNT = ASDOC_ELEMENT_FEATURE_COUNT + 11;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocRootImpl <em>Asdoc Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocRootImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocRoot()
	 * @generated
	 */
	int ASDOC_ROOT = 5;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__ASDOC = ASDOC_PACKAGE__ASDOC;
	/**
	 * The feature id for the '<em><b>Canonical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__CANONICAL_NAME = ASDOC_PACKAGE__CANONICAL_NAME;
	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__PACKAGES = ASDOC_PACKAGE__PACKAGES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__PARENT = ASDOC_PACKAGE__PARENT;
	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__TYPES = ASDOC_PACKAGE__TYPES;
	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__MEMBERS = ASDOC_PACKAGE__MEMBERS;
	/**
	 * The feature id for the '<em><b>Package Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__PACKAGE_CONTENT_PARSED = ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED;
	/**
	 * The feature id for the '<em><b>Type Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__TYPE_CONTENT_PARSED = ASDOC_PACKAGE__TYPE_CONTENT_PARSED;
	/**
	 * The feature id for the '<em><b>Global Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__GLOBAL_CONTENT_PARSED = ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED;
	/**
	 * The feature id for the '<em><b>Member Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__MEMBER_CONTENT_PARSED = ASDOC_PACKAGE__MEMBER_CONTENT_PARSED;
	/**
	 * The feature id for the '<em><b>Type Content Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__TYPE_CONTENT_AVAILABLE = ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE;
	/**
	 * The feature id for the '<em><b>Global Content Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__GLOBAL_CONTENT_AVAILABLE = ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE;
	/**
	 * The feature id for the '<em><b>Base Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT__BASE_URI = ASDOC_PACKAGE_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Asdoc Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_ROOT_FEATURE_COUNT = ASDOC_PACKAGE_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocTypeImpl <em>Asdoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocTypeImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocType()
	 * @generated
	 */
	int ASDOC_TYPE = 6;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__ASDOC = ASDOC_DEFINITION__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__NAME = ASDOC_DEFINITION__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__VISIBILITY = ASDOC_DEFINITION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__INTERFACE = ASDOC_DEFINITION_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__DYNAMIC = ASDOC_DEFINITION_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__FINAL = ASDOC_DEFINITION_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__MEMBERS = ASDOC_DEFINITION_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Extended Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__EXTENDED_CLASS = ASDOC_DEFINITION_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__EXTENDED_INTERFACES = ASDOC_DEFINITION_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Member Content Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE__MEMBER_CONTENT_PARSED = ASDOC_DEFINITION_FEATURE_COUNT + 7;
	/**
	 * The number of structural features of the '<em>Asdoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_TYPE_FEATURE_COUNT = ASDOC_DEFINITION_FEATURE_COUNT + 8;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocFieldImpl <em>Asdoc Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocFieldImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocField()
	 * @generated
	 */
	int ASDOC_FIELD = 7;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_FIELD__ASDOC = ASDOC_MEMBER__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_FIELD__NAME = ASDOC_MEMBER__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_FIELD__VISIBILITY = ASDOC_MEMBER__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_FIELD__STATIC = ASDOC_MEMBER__STATIC;
	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_FIELD__CONSTANT = ASDOC_MEMBER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_FIELD__TYPE = ASDOC_MEMBER_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Asdoc Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_FIELD_FEATURE_COUNT = ASDOC_MEMBER_FEATURE_COUNT + 2;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocPropertyImpl <em>Asdoc Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocPropertyImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocProperty()
	 * @generated
	 */
	int ASDOC_PROPERTY = 8;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__ASDOC = ASDOC_FIELD__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__NAME = ASDOC_FIELD__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__VISIBILITY = ASDOC_FIELD__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__STATIC = ASDOC_FIELD__STATIC;
	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__CONSTANT = ASDOC_FIELD__CONSTANT;
	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__TYPE = ASDOC_FIELD__TYPE;
	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__READONLY = ASDOC_FIELD_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Writeonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY__WRITEONLY = ASDOC_FIELD_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Asdoc Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PROPERTY_FEATURE_COUNT = ASDOC_FIELD_FEATURE_COUNT + 2;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocNamespaceImpl <em>Asdoc Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocNamespaceImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocNamespace()
	 * @generated
	 */
	int ASDOC_NAMESPACE = 9;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_NAMESPACE__ASDOC = ASDOC_MEMBER__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_NAMESPACE__NAME = ASDOC_MEMBER__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_NAMESPACE__VISIBILITY = ASDOC_MEMBER__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_NAMESPACE__STATIC = ASDOC_MEMBER__STATIC;
	/**
	 * The number of structural features of the '<em>Asdoc Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_NAMESPACE_FEATURE_COUNT = ASDOC_MEMBER_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocParameterImpl <em>Asdoc Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocParameterImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocParameter()
	 * @generated
	 */
	int ASDOC_PARAMETER = 10;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PARAMETER__ASDOC = ASDOC_DEFINITION__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PARAMETER__NAME = ASDOC_DEFINITION__NAME;
	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PARAMETER__TYPE = ASDOC_DEFINITION_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PARAMETER__REST = ASDOC_DEFINITION_FEATURE_COUNT + 1;
	/**
	 * The number of structural features of the '<em>Asdoc Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_PARAMETER_FEATURE_COUNT = ASDOC_DEFINITION_FEATURE_COUNT + 2;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocConstructorImpl <em>Asdoc Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocConstructorImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocConstructor()
	 * @generated
	 */
	int ASDOC_CONSTRUCTOR = 11;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_CONSTRUCTOR__ASDOC = ASDOC_EXECUTABLE__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_CONSTRUCTOR__NAME = ASDOC_EXECUTABLE__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_CONSTRUCTOR__VISIBILITY = ASDOC_EXECUTABLE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_CONSTRUCTOR__STATIC = ASDOC_EXECUTABLE__STATIC;
	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_CONSTRUCTOR__PARAMETERS = ASDOC_EXECUTABLE__PARAMETERS;
	/**
	 * The number of structural features of the '<em>Asdoc Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_CONSTRUCTOR_FEATURE_COUNT = ASDOC_EXECUTABLE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.impl.AsdocOperationImpl <em>Asdoc Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.impl.AsdocOperationImpl
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocOperation()
	 * @generated
	 */
	int ASDOC_OPERATION = 12;
	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__ASDOC = ASDOC_EXECUTABLE__ASDOC;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__NAME = ASDOC_EXECUTABLE__NAME;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__VISIBILITY = ASDOC_EXECUTABLE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__STATIC = ASDOC_EXECUTABLE__STATIC;
	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__PARAMETERS = ASDOC_EXECUTABLE__PARAMETERS;
	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__NATIVE = ASDOC_EXECUTABLE_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__OVERRIDE = ASDOC_EXECUTABLE_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__RETURN_TYPE = ASDOC_EXECUTABLE_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION__FINAL = ASDOC_EXECUTABLE_FEATURE_COUNT + 3;
	/**
	 * The number of structural features of the '<em>Asdoc Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASDOC_OPERATION_FEATURE_COUNT = ASDOC_EXECUTABLE_FEATURE_COUNT + 4;
	/**
	 * The meta object id for the '{@link org.axdt.asdoc.model.ParseLevel <em>Parse Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.asdoc.model.ParseLevel
	 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getParseLevel()
	 * @generated
	 */
	int PARSE_LEVEL = 13;
	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocElement <em>Asdoc Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Element</em>'.
	 * @see org.axdt.asdoc.model.AsdocElement
	 * @generated
	 */
	EClass getAsdocElement();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocDefinition <em>Asdoc Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Definition</em>'.
	 * @see org.axdt.asdoc.model.AsdocDefinition
	 * @generated
	 */
	EClass getAsdocDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.asdoc.model.AsdocDefinition#getName()
	 * @see #getAsdocDefinition()
	 * @generated
	 */
	EAttribute getAsdocDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocMember <em>Asdoc Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Member</em>'.
	 * @see org.axdt.asdoc.model.AsdocMember
	 * @generated
	 */
	EClass getAsdocMember();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocMember#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.axdt.asdoc.model.AsdocMember#getVisibility()
	 * @see #getAsdocMember()
	 * @generated
	 */
	EAttribute getAsdocMember_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocMember#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.axdt.asdoc.model.AsdocMember#isStatic()
	 * @see #getAsdocMember()
	 * @generated
	 */
	EAttribute getAsdocMember_Static();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocExecutable <em>Asdoc Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Executable</em>'.
	 * @see org.axdt.asdoc.model.AsdocExecutable
	 * @generated
	 */
	EClass getAsdocExecutable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.asdoc.model.AsdocExecutable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.axdt.asdoc.model.AsdocExecutable#getParameters()
	 * @see #getAsdocExecutable()
	 * @generated
	 */
	EReference getAsdocExecutable_Parameters();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocPackage <em>Asdoc Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Package</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage
	 * @generated
	 */
	EClass getAsdocPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocPackage#getCanonicalName <em>Canonical Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical Name</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#getCanonicalName()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EAttribute getAsdocPackage_CanonicalName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.asdoc.model.AsdocPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#getPackages()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EReference getAsdocPackage_Packages();

	/**
	 * Returns the meta object for the container reference '{@link org.axdt.asdoc.model.AsdocPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#getParent()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EReference getAsdocPackage_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.asdoc.model.AsdocPackage#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#getTypes()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EReference getAsdocPackage_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.asdoc.model.AsdocPackage#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#getMembers()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EReference getAsdocPackage_Members();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocPackage#isPackageContentParsed <em>Package Content Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Content Parsed</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#isPackageContentParsed()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EAttribute getAsdocPackage_PackageContentParsed();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocPackage#isTypeContentParsed <em>Type Content Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Content Parsed</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#isTypeContentParsed()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EAttribute getAsdocPackage_TypeContentParsed();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocPackage#isGlobalContentParsed <em>Global Content Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Content Parsed</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#isGlobalContentParsed()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EAttribute getAsdocPackage_GlobalContentParsed();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocPackage#isMemberContentParsed <em>Member Content Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Content Parsed</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#isMemberContentParsed()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EAttribute getAsdocPackage_MemberContentParsed();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocPackage#isTypeContentAvailable <em>Type Content Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Content Available</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#isTypeContentAvailable()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EAttribute getAsdocPackage_TypeContentAvailable();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocPackage#isGlobalContentAvailable <em>Global Content Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Content Available</em>'.
	 * @see org.axdt.asdoc.model.AsdocPackage#isGlobalContentAvailable()
	 * @see #getAsdocPackage()
	 * @generated
	 */
	EAttribute getAsdocPackage_GlobalContentAvailable();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocRoot <em>Asdoc Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Root</em>'.
	 * @see org.axdt.asdoc.model.AsdocRoot
	 * @generated
	 */
	EClass getAsdocRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocRoot#getBaseUri <em>Base Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Uri</em>'.
	 * @see org.axdt.asdoc.model.AsdocRoot#getBaseUri()
	 * @see #getAsdocRoot()
	 * @generated
	 */
	EAttribute getAsdocRoot_BaseUri();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocType <em>Asdoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Type</em>'.
	 * @see org.axdt.asdoc.model.AsdocType
	 * @generated
	 */
	EClass getAsdocType();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#getVisibility()
	 * @see #getAsdocType()
	 * @generated
	 */
	EAttribute getAsdocType_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocType#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#isInterface()
	 * @see #getAsdocType()
	 * @generated
	 */
	EAttribute getAsdocType_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocType#isDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#isDynamic()
	 * @see #getAsdocType()
	 * @generated
	 */
	EAttribute getAsdocType_Dynamic();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocType#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#isFinal()
	 * @see #getAsdocType()
	 * @generated
	 */
	EAttribute getAsdocType_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.asdoc.model.AsdocType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#getMembers()
	 * @see #getAsdocType()
	 * @generated
	 */
	EReference getAsdocType_Members();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.asdoc.model.AsdocType#getExtendedClass <em>Extended Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Class</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#getExtendedClass()
	 * @see #getAsdocType()
	 * @generated
	 */
	EReference getAsdocType_ExtendedClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.asdoc.model.AsdocType#getExtendedInterfaces <em>Extended Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Interfaces</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#getExtendedInterfaces()
	 * @see #getAsdocType()
	 * @generated
	 */
	EReference getAsdocType_ExtendedInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocType#isMemberContentParsed <em>Member Content Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Content Parsed</em>'.
	 * @see org.axdt.asdoc.model.AsdocType#isMemberContentParsed()
	 * @see #getAsdocType()
	 * @generated
	 */
	EAttribute getAsdocType_MemberContentParsed();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocField <em>Asdoc Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Field</em>'.
	 * @see org.axdt.asdoc.model.AsdocField
	 * @generated
	 */
	EClass getAsdocField();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocField#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.axdt.asdoc.model.AsdocField#isConstant()
	 * @see #getAsdocField()
	 * @generated
	 */
	EAttribute getAsdocField_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.asdoc.model.AsdocField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.axdt.asdoc.model.AsdocField#getType()
	 * @see #getAsdocField()
	 * @generated
	 */
	EReference getAsdocField_Type();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocProperty <em>Asdoc Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Property</em>'.
	 * @see org.axdt.asdoc.model.AsdocProperty
	 * @generated
	 */
	EClass getAsdocProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocProperty#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.axdt.asdoc.model.AsdocProperty#isReadonly()
	 * @see #getAsdocProperty()
	 * @generated
	 */
	EAttribute getAsdocProperty_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocProperty#isWriteonly <em>Writeonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writeonly</em>'.
	 * @see org.axdt.asdoc.model.AsdocProperty#isWriteonly()
	 * @see #getAsdocProperty()
	 * @generated
	 */
	EAttribute getAsdocProperty_Writeonly();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocNamespace <em>Asdoc Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Namespace</em>'.
	 * @see org.axdt.asdoc.model.AsdocNamespace
	 * @generated
	 */
	EClass getAsdocNamespace();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocParameter <em>Asdoc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Parameter</em>'.
	 * @see org.axdt.asdoc.model.AsdocParameter
	 * @generated
	 */
	EClass getAsdocParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.asdoc.model.AsdocParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.axdt.asdoc.model.AsdocParameter#getType()
	 * @see #getAsdocParameter()
	 * @generated
	 */
	EReference getAsdocParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocParameter#isRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest</em>'.
	 * @see org.axdt.asdoc.model.AsdocParameter#isRest()
	 * @see #getAsdocParameter()
	 * @generated
	 */
	EAttribute getAsdocParameter_Rest();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocConstructor <em>Asdoc Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Constructor</em>'.
	 * @see org.axdt.asdoc.model.AsdocConstructor
	 * @generated
	 */
	EClass getAsdocConstructor();

	/**
	 * Returns the meta object for class '{@link org.axdt.asdoc.model.AsdocOperation <em>Asdoc Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asdoc Operation</em>'.
	 * @see org.axdt.asdoc.model.AsdocOperation
	 * @generated
	 */
	EClass getAsdocOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocOperation#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see org.axdt.asdoc.model.AsdocOperation#isNative()
	 * @see #getAsdocOperation()
	 * @generated
	 */
	EAttribute getAsdocOperation_Native();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocOperation#isOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override</em>'.
	 * @see org.axdt.asdoc.model.AsdocOperation#isOverride()
	 * @see #getAsdocOperation()
	 * @generated
	 */
	EAttribute getAsdocOperation_Override();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.asdoc.model.AsdocOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.axdt.asdoc.model.AsdocOperation#getReturnType()
	 * @see #getAsdocOperation()
	 * @generated
	 */
	EReference getAsdocOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.asdoc.model.AsdocOperation#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.axdt.asdoc.model.AsdocOperation#isFinal()
	 * @see #getAsdocOperation()
	 * @generated
	 */
	EAttribute getAsdocOperation_Final();

	/**
	 * Returns the meta object for enum '{@link org.axdt.asdoc.model.ParseLevel <em>Parse Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parse Level</em>'.
	 * @see org.axdt.asdoc.model.ParseLevel
	 * @generated
	 */
	EEnum getParseLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AsdocEFactory getAsdocEFactory();

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
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocElementImpl <em>Asdoc Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocElementImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocElement()
		 * @generated
		 */
		EClass ASDOC_ELEMENT = eINSTANCE.getAsdocElement();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocDefinitionImpl <em>Asdoc Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocDefinitionImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocDefinition()
		 * @generated
		 */
		EClass ASDOC_DEFINITION = eINSTANCE.getAsdocDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_DEFINITION__NAME = eINSTANCE.getAsdocDefinition_Name();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocMemberImpl <em>Asdoc Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocMemberImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocMember()
		 * @generated
		 */
		EClass ASDOC_MEMBER = eINSTANCE.getAsdocMember();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_MEMBER__VISIBILITY = eINSTANCE.getAsdocMember_Visibility();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_MEMBER__STATIC = eINSTANCE.getAsdocMember_Static();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocExecutableImpl <em>Asdoc Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocExecutableImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocExecutable()
		 * @generated
		 */
		EClass ASDOC_EXECUTABLE = eINSTANCE.getAsdocExecutable();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_EXECUTABLE__PARAMETERS = eINSTANCE.getAsdocExecutable_Parameters();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocPackageImpl <em>Asdoc Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocPackageImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocPackage()
		 * @generated
		 */
		EClass ASDOC_PACKAGE = eINSTANCE.getAsdocPackage();

		/**
		 * The meta object literal for the '<em><b>Canonical Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PACKAGE__CANONICAL_NAME = eINSTANCE.getAsdocPackage_CanonicalName();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_PACKAGE__PACKAGES = eINSTANCE.getAsdocPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_PACKAGE__PARENT = eINSTANCE.getAsdocPackage_Parent();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_PACKAGE__TYPES = eINSTANCE.getAsdocPackage_Types();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_PACKAGE__MEMBERS = eINSTANCE.getAsdocPackage_Members();

		/**
		 * The meta object literal for the '<em><b>Package Content Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED = eINSTANCE.getAsdocPackage_PackageContentParsed();

		/**
		 * The meta object literal for the '<em><b>Type Content Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PACKAGE__TYPE_CONTENT_PARSED = eINSTANCE.getAsdocPackage_TypeContentParsed();

		/**
		 * The meta object literal for the '<em><b>Global Content Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED = eINSTANCE.getAsdocPackage_GlobalContentParsed();

		/**
		 * The meta object literal for the '<em><b>Member Content Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PACKAGE__MEMBER_CONTENT_PARSED = eINSTANCE.getAsdocPackage_MemberContentParsed();

		/**
		 * The meta object literal for the '<em><b>Type Content Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE = eINSTANCE.getAsdocPackage_TypeContentAvailable();

		/**
		 * The meta object literal for the '<em><b>Global Content Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE = eINSTANCE.getAsdocPackage_GlobalContentAvailable();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocRootImpl <em>Asdoc Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocRootImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocRoot()
		 * @generated
		 */
		EClass ASDOC_ROOT = eINSTANCE.getAsdocRoot();

		/**
		 * The meta object literal for the '<em><b>Base Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_ROOT__BASE_URI = eINSTANCE.getAsdocRoot_BaseUri();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocTypeImpl <em>Asdoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocTypeImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocType()
		 * @generated
		 */
		EClass ASDOC_TYPE = eINSTANCE.getAsdocType();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_TYPE__VISIBILITY = eINSTANCE.getAsdocType_Visibility();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_TYPE__INTERFACE = eINSTANCE.getAsdocType_Interface();

		/**
		 * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_TYPE__DYNAMIC = eINSTANCE.getAsdocType_Dynamic();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_TYPE__FINAL = eINSTANCE.getAsdocType_Final();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_TYPE__MEMBERS = eINSTANCE.getAsdocType_Members();

		/**
		 * The meta object literal for the '<em><b>Extended Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_TYPE__EXTENDED_CLASS = eINSTANCE.getAsdocType_ExtendedClass();

		/**
		 * The meta object literal for the '<em><b>Extended Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_TYPE__EXTENDED_INTERFACES = eINSTANCE.getAsdocType_ExtendedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Member Content Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_TYPE__MEMBER_CONTENT_PARSED = eINSTANCE.getAsdocType_MemberContentParsed();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocFieldImpl <em>Asdoc Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocFieldImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocField()
		 * @generated
		 */
		EClass ASDOC_FIELD = eINSTANCE.getAsdocField();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_FIELD__CONSTANT = eINSTANCE.getAsdocField_Constant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_FIELD__TYPE = eINSTANCE.getAsdocField_Type();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocPropertyImpl <em>Asdoc Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocPropertyImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocProperty()
		 * @generated
		 */
		EClass ASDOC_PROPERTY = eINSTANCE.getAsdocProperty();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PROPERTY__READONLY = eINSTANCE.getAsdocProperty_Readonly();

		/**
		 * The meta object literal for the '<em><b>Writeonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PROPERTY__WRITEONLY = eINSTANCE.getAsdocProperty_Writeonly();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocNamespaceImpl <em>Asdoc Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocNamespaceImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocNamespace()
		 * @generated
		 */
		EClass ASDOC_NAMESPACE = eINSTANCE.getAsdocNamespace();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocParameterImpl <em>Asdoc Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocParameterImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocParameter()
		 * @generated
		 */
		EClass ASDOC_PARAMETER = eINSTANCE.getAsdocParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_PARAMETER__TYPE = eINSTANCE.getAsdocParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_PARAMETER__REST = eINSTANCE.getAsdocParameter_Rest();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocConstructorImpl <em>Asdoc Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocConstructorImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocConstructor()
		 * @generated
		 */
		EClass ASDOC_CONSTRUCTOR = eINSTANCE.getAsdocConstructor();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.impl.AsdocOperationImpl <em>Asdoc Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.impl.AsdocOperationImpl
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getAsdocOperation()
		 * @generated
		 */
		EClass ASDOC_OPERATION = eINSTANCE.getAsdocOperation();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_OPERATION__NATIVE = eINSTANCE.getAsdocOperation_Native();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_OPERATION__OVERRIDE = eINSTANCE.getAsdocOperation_Override();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASDOC_OPERATION__RETURN_TYPE = eINSTANCE.getAsdocOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASDOC_OPERATION__FINAL = eINSTANCE.getAsdocOperation_Final();

		/**
		 * The meta object literal for the '{@link org.axdt.asdoc.model.ParseLevel <em>Parse Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.asdoc.model.ParseLevel
		 * @see org.axdt.asdoc.model.impl.AsdocEPackageImpl#getParseLevel()
		 * @generated
		 */
		EEnum PARSE_LEVEL = eINSTANCE.getParseLevel();

	}

} //AsdocEPackage
