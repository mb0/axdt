/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3;

import org.axdt.avm.AvmEPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.axdt.as3.As3EFactory
 * @generated
 */
public interface As3EPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "as3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://axdt.org/uri/As3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "as3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	As3EPackage eINSTANCE = org.axdt.as3.model.impl.As3EPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.ICaseElement <em>ICase Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.ICaseElement
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getICaseElement()
	 * @generated
	 */
	int ICASE_ELEMENT = 16;

	/**
	 * The number of structural features of the '<em>ICase Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICASE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IDirective <em>IDirective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IDirective
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIDirective()
	 * @generated
	 */
	int IDIRECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIRECTIVE__VSEMI = ICASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDirective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIRECTIVE_FEATURE_COUNT = ICASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IStatement <em>IStatement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IStatement
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIStatement()
	 * @generated
	 */
	int ISTATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATEMENT__VSEMI = IDIRECTIVE__VSEMI;

	/**
	 * The number of structural features of the '<em>IStatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATEMENT_FEATURE_COUNT = IDIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.IExpressionImpl <em>IExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.IExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIExpression()
	 * @generated
	 */
	int IEXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>IExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IAssignmentExpression <em>IAssignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IAssignmentExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIAssignmentExpression()
	 * @generated
	 */
	int IASSIGNMENT_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>IAssignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IASSIGNMENT_EXPRESSION_FEATURE_COUNT = IEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IConditionalExpression <em>IConditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IConditionalExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIConditionalExpression()
	 * @generated
	 */
	int ICONDITIONAL_EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>IConditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONDITIONAL_EXPRESSION_FEATURE_COUNT = IASSIGNMENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.ILogicalExpression <em>ILogical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.ILogicalExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getILogicalExpression()
	 * @generated
	 */
	int ILOGICAL_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>ILogical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILOGICAL_EXPRESSION_FEATURE_COUNT = ICONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IBitwiseExpression <em>IBitwise Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IBitwiseExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIBitwiseExpression()
	 * @generated
	 */
	int IBITWISE_EXPRESSION = 6;

	/**
	 * The number of structural features of the '<em>IBitwise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBITWISE_EXPRESSION_FEATURE_COUNT = ILOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IEqualityExpression <em>IEquality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IEqualityExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIEqualityExpression()
	 * @generated
	 */
	int IEQUALITY_EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>IEquality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEQUALITY_EXPRESSION_FEATURE_COUNT = IBITWISE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IRelationalExpression <em>IRelational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IRelationalExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIRelationalExpression()
	 * @generated
	 */
	int IRELATIONAL_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>IRelational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRELATIONAL_EXPRESSION_FEATURE_COUNT = IEQUALITY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IArithmeticExpression <em>IArithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IArithmeticExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIArithmeticExpression()
	 * @generated
	 */
	int IARITHMETIC_EXPRESSION = 9;

	/**
	 * The number of structural features of the '<em>IArithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARITHMETIC_EXPRESSION_FEATURE_COUNT = IRELATIONAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IUnaryExpression <em>IUnary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IUnaryExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIUnaryExpression()
	 * @generated
	 */
	int IUNARY_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>IUnary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUNARY_EXPRESSION_FEATURE_COUNT = IARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IPostfixExpression <em>IPostfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IPostfixExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIPostfixExpression()
	 * @generated
	 */
	int IPOSTFIX_EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>IPostfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPOSTFIX_EXPRESSION_FEATURE_COUNT = IUNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IPrimaryExpression <em>IPrimary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IPrimaryExpression
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIPrimaryExpression()
	 * @generated
	 */
	int IPRIMARY_EXPRESSION = 12;

	/**
	 * The number of structural features of the '<em>IPrimary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRIMARY_EXPRESSION_FEATURE_COUNT = IPOSTFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IIdentifier <em>IIdentifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IIdentifier
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIIdentifier()
	 * @generated
	 */
	int IIDENTIFIER = 13;

	/**
	 * The number of structural features of the '<em>IIdentifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTIFIER_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.ILiteral <em>ILiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.ILiteral
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getILiteral()
	 * @generated
	 */
	int ILITERAL = 14;

	/**
	 * The number of structural features of the '<em>ILiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILITERAL_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.ILiteralFieldName <em>ILiteral Field Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.ILiteralFieldName
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getILiteralFieldName()
	 * @generated
	 */
	int ILITERAL_FIELD_NAME = 15;

	/**
	 * The number of structural features of the '<em>ILiteral Field Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILITERAL_FIELD_NAME_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.INonAttributeIdentifier <em>INon Attribute Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.INonAttributeIdentifier
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getINonAttributeIdentifier()
	 * @generated
	 */
	int INON_ATTRIBUTE_IDENTIFIER = 17;

	/**
	 * The number of structural features of the '<em>INon Attribute Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INON_ATTRIBUTE_IDENTIFIER_FEATURE_COUNT = IIDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.IAttribute <em>IAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.IAttribute
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIAttribute()
	 * @generated
	 */
	int IATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>IAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.IForInitImpl <em>IFor Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.IForInitImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIForInit()
	 * @generated
	 */
	int IFOR_INIT = 19;

	/**
	 * The number of structural features of the '<em>IFor Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOR_INIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.IForInInitImpl <em>IFor In Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.IForInInitImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIForInInit()
	 * @generated
	 */
	int IFOR_IN_INIT = 20;

	/**
	 * The number of structural features of the '<em>IFor In Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFOR_IN_INIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ElementImpl <em>As3 Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ElementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Element()
	 * @generated
	 */
	int AS3_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ELEMENT__ASDOC = AvmEPackage.AVM_ELEMENT__ASDOC;

	/**
	 * The number of structural features of the '<em>As3 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ELEMENT_FEATURE_COUNT = AvmEPackage.AVM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3IdentifiableImpl <em>As3 Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3IdentifiableImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Identifiable()
	 * @generated
	 */
	int AS3_IDENTIFIABLE = 22;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IDENTIFIABLE__ASDOC = AS3_ELEMENT__ASDOC;

	/**
	 * The number of structural features of the '<em>As3 Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IDENTIFIABLE_FEATURE_COUNT = AS3_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3DefinitionImpl <em>As3 Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3DefinitionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Definition()
	 * @generated
	 */
	int AS3_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFINITION__ASDOC = AS3_IDENTIFIABLE__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFINITION__METADATA = AS3_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFINITION__VISIBILITY = AS3_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFINITION__CUSTOM_VISIBILITY = AS3_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFINITION__NAME = AS3_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>As3 Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFINITION_FEATURE_COUNT = AS3_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3MemberImpl <em>As3 Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3MemberImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Member()
	 * @generated
	 */
	int AS3_MEMBER = 24;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER__ASDOC = AS3_DEFINITION__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER__METADATA = AS3_DEFINITION__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER__VISIBILITY = AS3_DEFINITION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER__CUSTOM_VISIBILITY = AS3_DEFINITION__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER__NAME = AS3_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER__VSEMI = AS3_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER__STATIC = AS3_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MEMBER_FEATURE_COUNT = AS3_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.As3Executable <em>As3 Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.As3Executable
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Executable()
	 * @generated
	 */
	int AS3_EXECUTABLE = 25;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXECUTABLE__PARAMETERS = AvmEPackage.AVM_EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXECUTABLE_FEATURE_COUNT = AvmEPackage.AVM_EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ParameterImpl <em>As3 Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ParameterImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Parameter()
	 * @generated
	 */
	int AS3_PARAMETER = 39;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ParameterAssignImpl <em>As3 Parameter Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ParameterAssignImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ParameterAssign()
	 * @generated
	 */
	int AS3_PARAMETER_ASSIGN = 40;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3FieldBindingImpl <em>As3 Field Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3FieldBindingImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3FieldBinding()
	 * @generated
	 */
	int AS3_FIELD_BINDING = 42;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl <em>As3 Field Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3FieldDefinitionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3FieldDefinition()
	 * @generated
	 */
	int AS3_FIELD_DEFINITION = 43;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ProgramImpl <em>As3 Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ProgramImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Program()
	 * @generated
	 */
	int AS3_PROGRAM = 26;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROGRAM__ASDOC = AS3_ELEMENT__ASDOC;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROGRAM__PACKAGE = AS3_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROGRAM__DIRECTIVES = AS3_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROGRAM_FEATURE_COUNT = AS3_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ImportImpl <em>As3 Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ImportImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Import()
	 * @generated
	 */
	int AS3_IMPORT = 27;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IMPORT__VSEMI = IDIRECTIVE__VSEMI;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IMPORT__QUALIFIED_NAME = IDIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IMPORT_FEATURE_COUNT = IDIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ImportListImpl <em>As3 Import List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ImportListImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ImportList()
	 * @generated
	 */
	int AS3_IMPORT_LIST = 28;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IMPORT_LIST__VSEMI = IDIRECTIVE__VSEMI;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IMPORT_LIST__IMPORTS = IDIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Import List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IMPORT_LIST_FEATURE_COUNT = IDIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3IncludeImpl <em>As3 Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3IncludeImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Include()
	 * @generated
	 */
	int AS3_INCLUDE = 29;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INCLUDE__VSEMI = IDIRECTIVE__VSEMI;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INCLUDE__TARGET = IDIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INCLUDE_FEATURE_COUNT = IDIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3UseImpl <em>As3 Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3UseImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Use()
	 * @generated
	 */
	int AS3_USE = 30;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_USE__VSEMI = IDIRECTIVE__VSEMI;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_USE__TARGET = IDIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_USE_FEATURE_COUNT = IDIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PackageImpl <em>As3 Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PackageImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Package()
	 * @generated
	 */
	int AS3_PACKAGE = 31;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PACKAGE__ASDOC = AS3_IDENTIFIABLE__ASDOC;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PACKAGE__DIRECTIVES = AS3_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Canonical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PACKAGE__CANONICAL_NAME = AS3_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PACKAGE_FEATURE_COUNT = AS3_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3TypeImpl <em>As3 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3TypeImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Type()
	 * @generated
	 */
	int AS3_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__ASDOC = AS3_DEFINITION__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__METADATA = AS3_DEFINITION__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__VISIBILITY = AS3_DEFINITION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__CUSTOM_VISIBILITY = AS3_DEFINITION__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__NAME = AS3_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__VSEMI = AS3_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__EXTENDED_INTERFACES = AS3_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE__DIRECTIVES = AS3_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>As3 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE_FEATURE_COUNT = AS3_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ClassImpl <em>As3 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ClassImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Class()
	 * @generated
	 */
	int AS3_CLASS = 33;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__ASDOC = AS3_TYPE__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__METADATA = AS3_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__VISIBILITY = AS3_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__CUSTOM_VISIBILITY = AS3_TYPE__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__NAME = AS3_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__VSEMI = AS3_TYPE__VSEMI;

	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__EXTENDED_INTERFACES = AS3_TYPE__EXTENDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__DIRECTIVES = AS3_TYPE__DIRECTIVES;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__DYNAMIC = AS3_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__FINAL = AS3_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extended Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS__EXTENDED_CLASS = AS3_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>As3 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CLASS_FEATURE_COUNT = AS3_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3InterfaceImpl <em>As3 Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3InterfaceImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Interface()
	 * @generated
	 */
	int AS3_INTERFACE = 34;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__ASDOC = AS3_TYPE__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__METADATA = AS3_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__VISIBILITY = AS3_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__CUSTOM_VISIBILITY = AS3_TYPE__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__NAME = AS3_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__VSEMI = AS3_TYPE__VSEMI;

	/**
	 * The feature id for the '<em><b>Extended Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__EXTENDED_INTERFACES = AS3_TYPE__EXTENDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE__DIRECTIVES = AS3_TYPE__DIRECTIVES;

	/**
	 * The number of structural features of the '<em>As3 Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INTERFACE_FEATURE_COUNT = AS3_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3NamespaceImpl <em>As3 Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3NamespaceImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Namespace()
	 * @generated
	 */
	int AS3_NAMESPACE = 35;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__ASDOC = AS3_MEMBER__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__METADATA = AS3_MEMBER__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__VISIBILITY = AS3_MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__CUSTOM_VISIBILITY = AS3_MEMBER__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__NAME = AS3_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__VSEMI = AS3_MEMBER__VSEMI;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__STATIC = AS3_MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE__EXPRESSION = AS3_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NAMESPACE_FEATURE_COUNT = AS3_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3VariableImpl <em>As3 Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3VariableImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Variable()
	 * @generated
	 */
	int AS3_VARIABLE = 36;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE__ASDOC = AS3_IDENTIFIABLE__ASDOC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE__TYPE = AS3_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE__NAME = AS3_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_FEATURE_COUNT = AS3_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3VariableAssignImpl <em>As3 Variable Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3VariableAssignImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3VariableAssign()
	 * @generated
	 */
	int AS3_VARIABLE_ASSIGN = 37;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_ASSIGN__ASDOC = AS3_VARIABLE__ASDOC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_ASSIGN__TYPE = AS3_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_ASSIGN__NAME = AS3_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_ASSIGN__EXPRESSION = AS3_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Variable Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_ASSIGN_FEATURE_COUNT = AS3_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3VariableDefinitionImpl <em>As3 Variable Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3VariableDefinitionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3VariableDefinition()
	 * @generated
	 */
	int AS3_VARIABLE_DEFINITION = 38;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_DEFINITION__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_DEFINITION__CONSTANT = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_DEFINITION__BINDINGS = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Variable Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VARIABLE_DEFINITION_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER__ASDOC = AS3_VARIABLE__ASDOC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER__TYPE = AS3_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER__NAME = AS3_VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>As3 Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_FEATURE_COUNT = AS3_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_ASSIGN__ASDOC = AS3_PARAMETER__ASDOC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_ASSIGN__TYPE = AS3_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_ASSIGN__NAME = AS3_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_ASSIGN__EXPRESSION = AS3_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Parameter Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_ASSIGN_FEATURE_COUNT = AS3_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ParameterRestImpl <em>As3 Parameter Rest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ParameterRestImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ParameterRest()
	 * @generated
	 */
	int AS3_PARAMETER_REST = 41;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_REST__ASDOC = AS3_PARAMETER__ASDOC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_REST__TYPE = AS3_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_REST__NAME = AS3_PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>As3 Parameter Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PARAMETER_REST_FEATURE_COUNT = AS3_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__ASDOC = AS3_MEMBER__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__METADATA = AS3_MEMBER__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__VISIBILITY = AS3_MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__CUSTOM_VISIBILITY = AS3_MEMBER__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__NAME = AS3_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__VSEMI = AS3_MEMBER__VSEMI;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__STATIC = AS3_MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__TYPE = AS3_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING__EXPRESSION = AS3_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Field Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_BINDING_FEATURE_COUNT = AS3_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION__VSEMI = IDIRECTIVE__VSEMI;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION__STATIC = IDIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION__CONSTANT = IDIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION__BINDINGS = IDIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION__METADATA = IDIRECTIVE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION__VISIBILITY = IDIRECTIVE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY = IDIRECTIVE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>As3 Field Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FIELD_DEFINITION_FEATURE_COUNT = IDIRECTIVE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3OperationImpl <em>As3 Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3OperationImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Operation()
	 * @generated
	 */
	int AS3_OPERATION = 44;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__ASDOC = AS3_MEMBER__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__METADATA = AS3_MEMBER__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__VISIBILITY = AS3_MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__CUSTOM_VISIBILITY = AS3_MEMBER__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__NAME = AS3_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__VSEMI = AS3_MEMBER__VSEMI;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__STATIC = AS3_MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__PARAMETERS = AS3_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__OVERRIDE = AS3_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__FINAL = AS3_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__GETTER = AS3_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__SETTER = AS3_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__RETURN_TYPE = AS3_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__BODY = AS3_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION__NATIVE = AS3_MEMBER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>As3 Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OPERATION_FEATURE_COUNT = AS3_MEMBER_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ConstructorImpl <em>As3 Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ConstructorImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Constructor()
	 * @generated
	 */
	int AS3_CONSTRUCTOR = 45;

	/**
	 * The feature id for the '<em><b>Asdoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__ASDOC = AS3_MEMBER__ASDOC;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__METADATA = AS3_MEMBER__METADATA;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__VISIBILITY = AS3_MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Custom Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__CUSTOM_VISIBILITY = AS3_MEMBER__CUSTOM_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__NAME = AS3_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__VSEMI = AS3_MEMBER__VSEMI;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__STATIC = AS3_MEMBER__STATIC;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__PARAMETERS = AS3_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR__BODY = AS3_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONSTRUCTOR_FEATURE_COUNT = AS3_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3MetadataTagImpl <em>As3 Metadata Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3MetadataTagImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3MetadataTag()
	 * @generated
	 */
	int AS3_METADATA_TAG = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_METADATA_TAG__NAME = IATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_METADATA_TAG__PARAMETERS = IATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Metadata Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_METADATA_TAG_FEATURE_COUNT = IATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3MetadataParameterImpl <em>As3 Metadata Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3MetadataParameterImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3MetadataParameter()
	 * @generated
	 */
	int AS3_METADATA_PARAMETER = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_METADATA_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_METADATA_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>As3 Metadata Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_METADATA_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3AttributeExpressionImpl <em>As3 Attribute Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3AttributeExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AttributeExpression()
	 * @generated
	 */
	int AS3_ATTRIBUTE_EXPRESSION = 48;

	/**
	 * The number of structural features of the '<em>As3 Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ATTRIBUTE_EXPRESSION_FEATURE_COUNT = IATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3SimpleAttributeExpressionImpl <em>As3 Simple Attribute Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3SimpleAttributeExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SimpleAttributeExpression()
	 * @generated
	 */
	int AS3_SIMPLE_ATTRIBUTE_EXPRESSION = 49;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT = AS3_ATTRIBUTE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Simple Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_ATTRIBUTE_EXPRESSION_FEATURE_COUNT = AS3_ATTRIBUTE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3QualifiedAttributeExpressionImpl <em>As3 Qualified Attribute Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3QualifiedAttributeExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QualifiedAttributeExpression()
	 * @generated
	 */
	int AS3_QUALIFIED_ATTRIBUTE_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUALIFIED_ATTRIBUTE_EXPRESSION__QUALIFIER = AS3_ATTRIBUTE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUALIFIED_ATTRIBUTE_EXPRESSION__IDENTIFIER = AS3_ATTRIBUTE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Qualified Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUALIFIED_ATTRIBUTE_EXPRESSION_FEATURE_COUNT = AS3_ATTRIBUTE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3DefaultXmlNamespaceStatementImpl <em>As3 Default Xml Namespace Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3DefaultXmlNamespaceStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DefaultXmlNamespaceStatement()
	 * @generated
	 */
	int AS3_DEFAULT_XML_NAMESPACE_STATEMENT = 51;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFAULT_XML_NAMESPACE_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFAULT_XML_NAMESPACE_STATEMENT__EXPRESSION = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Default Xml Namespace Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFAULT_XML_NAMESPACE_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3TryStatementImpl <em>As3 Try Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3TryStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3TryStatement()
	 * @generated
	 */
	int AS3_TRY_STATEMENT = 52;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TRY_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TRY_STATEMENT__BLOCK = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TRY_STATEMENT__CATCHES = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TRY_STATEMENT__FINAL_BLOCK = ISTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>As3 Try Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TRY_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3CatchClauseImpl <em>As3 Catch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3CatchClauseImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3CatchClause()
	 * @generated
	 */
	int AS3_CATCH_CLAUSE = 53;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CATCH_CLAUSE__ERROR = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CATCH_CLAUSE__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>As3 Catch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CATCH_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ThrowStatementImpl <em>As3 Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ThrowStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ThrowStatement()
	 * @generated
	 */
	int AS3_THROW_STATEMENT = 54;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_THROW_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_THROW_STATEMENT__EXPRESSION = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_THROW_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ReturnStatementImpl <em>As3 Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ReturnStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ReturnStatement()
	 * @generated
	 */
	int AS3_RETURN_STATEMENT = 55;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_RETURN_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_RETURN_STATEMENT__EXPRESSION = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_RETURN_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3WithStatementImpl <em>As3 With Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3WithStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3WithStatement()
	 * @generated
	 */
	int AS3_WITH_STATEMENT = 56;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WITH_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WITH_STATEMENT__TARGET = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WITH_STATEMENT__STATEMENT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 With Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WITH_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3BreakStatementImpl <em>As3 Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3BreakStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BreakStatement()
	 * @generated
	 */
	int AS3_BREAK_STATEMENT = 57;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BREAK_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BREAK_STATEMENT__LABEL_NAME = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BREAK_STATEMENT__LABEL = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BREAK_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ContinueStatementImpl <em>As3 Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ContinueStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ContinueStatement()
	 * @generated
	 */
	int AS3_CONTINUE_STATEMENT = 58;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONTINUE_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONTINUE_STATEMENT__LABEL_NAME = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONTINUE_STATEMENT__LABEL = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONTINUE_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3IterationStatementImpl <em>As3 Iteration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3IterationStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3IterationStatement()
	 * @generated
	 */
	int AS3_ITERATION_STATEMENT = 59;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ITERATION_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ITERATION_STATEMENT__STATEMENT = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Iteration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ITERATION_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ConditionalIterationStatementImpl <em>As3 Conditional Iteration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ConditionalIterationStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ConditionalIterationStatement()
	 * @generated
	 */
	int AS3_CONDITIONAL_ITERATION_STATEMENT = 60;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_ITERATION_STATEMENT__VSEMI = AS3_ITERATION_STATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_ITERATION_STATEMENT__STATEMENT = AS3_ITERATION_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_ITERATION_STATEMENT__CONDITIONS = AS3_ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Conditional Iteration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_ITERATION_STATEMENT_FEATURE_COUNT = AS3_ITERATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3DoStatementImpl <em>As3 Do Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3DoStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DoStatement()
	 * @generated
	 */
	int AS3_DO_STATEMENT = 61;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DO_STATEMENT__VSEMI = AS3_CONDITIONAL_ITERATION_STATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DO_STATEMENT__STATEMENT = AS3_CONDITIONAL_ITERATION_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DO_STATEMENT__CONDITIONS = AS3_CONDITIONAL_ITERATION_STATEMENT__CONDITIONS;

	/**
	 * The number of structural features of the '<em>As3 Do Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DO_STATEMENT_FEATURE_COUNT = AS3_CONDITIONAL_ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3WhileStatementImpl <em>As3 While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3WhileStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3WhileStatement()
	 * @generated
	 */
	int AS3_WHILE_STATEMENT = 62;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WHILE_STATEMENT__VSEMI = AS3_CONDITIONAL_ITERATION_STATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WHILE_STATEMENT__STATEMENT = AS3_CONDITIONAL_ITERATION_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WHILE_STATEMENT__CONDITIONS = AS3_CONDITIONAL_ITERATION_STATEMENT__CONDITIONS;

	/**
	 * The number of structural features of the '<em>As3 While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_WHILE_STATEMENT_FEATURE_COUNT = AS3_CONDITIONAL_ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ForStatementImpl <em>As3 For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ForStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ForStatement()
	 * @generated
	 */
	int AS3_FOR_STATEMENT = 63;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_STATEMENT__VSEMI = AS3_CONDITIONAL_ITERATION_STATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_STATEMENT__STATEMENT = AS3_CONDITIONAL_ITERATION_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_STATEMENT__CONDITIONS = AS3_CONDITIONAL_ITERATION_STATEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_STATEMENT__INIT = AS3_CONDITIONAL_ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_STATEMENT__ITER = AS3_CONDITIONAL_ITERATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_STATEMENT_FEATURE_COUNT = AS3_CONDITIONAL_ITERATION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ForInStatementImpl <em>As3 For In Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ForInStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ForInStatement()
	 * @generated
	 */
	int AS3_FOR_IN_STATEMENT = 64;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_IN_STATEMENT__VSEMI = AS3_ITERATION_STATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_IN_STATEMENT__STATEMENT = AS3_ITERATION_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_IN_STATEMENT__TARGET = AS3_ITERATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_IN_STATEMENT__INIT = AS3_ITERATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_IN_STATEMENT__FOR_EACH = AS3_ITERATION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>As3 For In Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FOR_IN_STATEMENT_FEATURE_COUNT = AS3_ITERATION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ConditionalStatementImpl <em>As3 Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ConditionalStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ConditionalStatement()
	 * @generated
	 */
	int AS3_CONDITIONAL_STATEMENT = 65;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_STATEMENT__CONDITIONS = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3SwitchStatementImpl <em>As3 Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3SwitchStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SwitchStatement()
	 * @generated
	 */
	int AS3_SWITCH_STATEMENT = 66;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SWITCH_STATEMENT__VSEMI = AS3_CONDITIONAL_STATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SWITCH_STATEMENT__CONDITIONS = AS3_CONDITIONAL_STATEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SWITCH_STATEMENT__CASES = AS3_CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SWITCH_STATEMENT_FEATURE_COUNT = AS3_CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3CaseLabelImpl <em>As3 Case Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3CaseLabelImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3CaseLabel()
	 * @generated
	 */
	int AS3_CASE_LABEL = 67;

	/**
	 * The number of structural features of the '<em>As3 Case Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CASE_LABEL_FEATURE_COUNT = ICASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3DefaultCaseImpl <em>As3 Default Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3DefaultCaseImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DefaultCase()
	 * @generated
	 */
	int AS3_DEFAULT_CASE = 68;

	/**
	 * The number of structural features of the '<em>As3 Default Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DEFAULT_CASE_FEATURE_COUNT = AS3_CASE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ExpressionCaseImpl <em>As3 Expression Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ExpressionCaseImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionCase()
	 * @generated
	 */
	int AS3_EXPRESSION_CASE = 69;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_CASE__EXPRESSIONS = AS3_CASE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Expression Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_CASE_FEATURE_COUNT = AS3_CASE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3IfStatementImpl <em>As3 If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3IfStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3IfStatement()
	 * @generated
	 */
	int AS3_IF_STATEMENT = 70;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IF_STATEMENT__VSEMI = AS3_CONDITIONAL_STATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IF_STATEMENT__CONDITIONS = AS3_CONDITIONAL_STATEMENT__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IF_STATEMENT__STATEMENT = AS3_CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IF_STATEMENT__ELSE_STATEMENT = AS3_CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_IF_STATEMENT_FEATURE_COUNT = AS3_CONDITIONAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3LabeledStatementImpl <em>As3 Labeled Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3LabeledStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LabeledStatement()
	 * @generated
	 */
	int AS3_LABELED_STATEMENT = 71;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LABELED_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LABELED_STATEMENT__NAME = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LABELED_STATEMENT__STATEMENT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LABELED_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3BlockImpl <em>As3 Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3BlockImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Block()
	 * @generated
	 */
	int AS3_BLOCK = 72;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BLOCK__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BLOCK__DIRECTIVES = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BLOCK_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3SuperStatementImpl <em>As3 Super Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3SuperStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SuperStatement()
	 * @generated
	 */
	int AS3_SUPER_STATEMENT = 73;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SUPER_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SUPER_STATEMENT__ARGUMENTS = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Super Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SUPER_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ExpressionStatementImpl <em>As3 Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ExpressionStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionStatement()
	 * @generated
	 */
	int AS3_EXPRESSION_STATEMENT = 74;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_STATEMENT__EXPRESSIONS = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3EmptyStatementImpl <em>As3 Empty Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3EmptyStatementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3EmptyStatement()
	 * @generated
	 */
	int AS3_EMPTY_STATEMENT = 75;

	/**
	 * The feature id for the '<em><b>Vsemi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EMPTY_STATEMENT__VSEMI = ISTATEMENT__VSEMI;

	/**
	 * The number of structural features of the '<em>As3 Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EMPTY_STATEMENT_FEATURE_COUNT = ISTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ExpressionListImpl <em>As3 Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ExpressionListImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionList()
	 * @generated
	 */
	int AS3_EXPRESSION_LIST = 76;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_LIST__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>As3 Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ListExpressionImpl <em>As3 List Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ListExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ListExpression()
	 * @generated
	 */
	int AS3_LIST_EXPRESSION = 77;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LIST_EXPRESSION__EXPRESSIONS = AS3_EXPRESSION_LIST__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>As3 List Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LIST_EXPRESSION_FEATURE_COUNT = AS3_EXPRESSION_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ArgumentsImpl <em>As3 Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ArgumentsImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Arguments()
	 * @generated
	 */
	int AS3_ARGUMENTS = 78;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ARGUMENTS__EXPRESSIONS = AS3_EXPRESSION_LIST__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>As3 Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ARGUMENTS_FEATURE_COUNT = AS3_EXPRESSION_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3BinaryExpressionImpl <em>As3 Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3BinaryExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BinaryExpression()
	 * @generated
	 */
	int AS3_BINARY_EXPRESSION = 81;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BINARY_EXPRESSION__LEFT = IEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BINARY_EXPRESSION__OPERATION = IEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BINARY_EXPRESSION__RIGHT = IEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>As3 Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BINARY_EXPRESSION_FEATURE_COUNT = IEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3AssignmentExpressionImpl <em>As3 Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3AssignmentExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AssignmentExpression()
	 * @generated
	 */
	int AS3_ASSIGNMENT_EXPRESSION = 79;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ASSIGNMENT_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ASSIGNMENT_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ASSIGNMENT_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ConditionalExpressionImpl <em>As3 Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ConditionalExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ConditionalExpression()
	 * @generated
	 */
	int AS3_CONDITIONAL_EXPRESSION = 80;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_EXPRESSION__CONDITION = ICONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_EXPRESSION__STATEMENT = ICONDITIONAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT = ICONDITIONAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>As3 Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_CONDITIONAL_EXPRESSION_FEATURE_COUNT = ICONDITIONAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3LogicalExpressionImpl <em>As3 Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3LogicalExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LogicalExpression()
	 * @generated
	 */
	int AS3_LOGICAL_EXPRESSION = 82;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LOGICAL_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LOGICAL_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LOGICAL_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LOGICAL_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3BitwiseExpressionImpl <em>As3 Bitwise Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3BitwiseExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BitwiseExpression()
	 * @generated
	 */
	int AS3_BITWISE_EXPRESSION = 83;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BITWISE_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BITWISE_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BITWISE_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Bitwise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BITWISE_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3EqualityExpressionImpl <em>As3 Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3EqualityExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3EqualityExpression()
	 * @generated
	 */
	int AS3_EQUALITY_EXPRESSION = 84;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EQUALITY_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EQUALITY_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EQUALITY_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EQUALITY_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3RelationalExpressionImpl <em>As3 Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3RelationalExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3RelationalExpression()
	 * @generated
	 */
	int AS3_RELATIONAL_EXPRESSION = 85;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_RELATIONAL_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_RELATIONAL_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_RELATIONAL_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_RELATIONAL_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ShiftExpressionImpl <em>As3 Shift Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ShiftExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ShiftExpression()
	 * @generated
	 */
	int AS3_SHIFT_EXPRESSION = 86;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SHIFT_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SHIFT_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SHIFT_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Shift Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SHIFT_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3AdditiveExpressionImpl <em>As3 Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3AdditiveExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AdditiveExpression()
	 * @generated
	 */
	int AS3_ADDITIVE_EXPRESSION = 87;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ADDITIVE_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ADDITIVE_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ADDITIVE_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ADDITIVE_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3MultiplicativeExpressionImpl <em>As3 Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3MultiplicativeExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3MultiplicativeExpression()
	 * @generated
	 */
	int AS3_MULTIPLICATIVE_EXPRESSION = 88;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MULTIPLICATIVE_EXPRESSION__LEFT = AS3_BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MULTIPLICATIVE_EXPRESSION__OPERATION = AS3_BINARY_EXPRESSION__OPERATION;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MULTIPLICATIVE_EXPRESSION__RIGHT = AS3_BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>As3 Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = AS3_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3UnaryExpressionImpl <em>As3 Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3UnaryExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3UnaryExpression()
	 * @generated
	 */
	int AS3_UNARY_EXPRESSION = 89;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_UNARY_EXPRESSION__EXPRESSION = IUNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_UNARY_EXPRESSION_FEATURE_COUNT = IUNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3DeleteExpressionImpl <em>As3 Delete Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3DeleteExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DeleteExpression()
	 * @generated
	 */
	int AS3_DELETE_EXPRESSION = 90;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DELETE_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Delete Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_DELETE_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3VoidExpressionImpl <em>As3 Void Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3VoidExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3VoidExpression()
	 * @generated
	 */
	int AS3_VOID_EXPRESSION = 91;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VOID_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Void Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_VOID_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3TypeOfExpressionImpl <em>As3 Type Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3TypeOfExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3TypeOfExpression()
	 * @generated
	 */
	int AS3_TYPE_OF_EXPRESSION = 92;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE_OF_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Type Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_TYPE_OF_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PreIncrementExpressionImpl <em>As3 Pre Increment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PreIncrementExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PreIncrementExpression()
	 * @generated
	 */
	int AS3_PRE_INCREMENT_EXPRESSION = 93;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PRE_INCREMENT_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Pre Increment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PRE_INCREMENT_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PreDecrementExpressionImpl <em>As3 Pre Decrement Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PreDecrementExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PreDecrementExpression()
	 * @generated
	 */
	int AS3_PRE_DECREMENT_EXPRESSION = 94;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PRE_DECREMENT_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Pre Decrement Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PRE_DECREMENT_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3UnaryPlusExpressionImpl <em>As3 Unary Plus Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3UnaryPlusExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3UnaryPlusExpression()
	 * @generated
	 */
	int AS3_UNARY_PLUS_EXPRESSION = 95;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_UNARY_PLUS_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Unary Plus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_UNARY_PLUS_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3UnaryMinusExpressionImpl <em>As3 Unary Minus Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3UnaryMinusExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3UnaryMinusExpression()
	 * @generated
	 */
	int AS3_UNARY_MINUS_EXPRESSION = 96;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_UNARY_MINUS_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Unary Minus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_UNARY_MINUS_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3BitwiseNotExpressionImpl <em>As3 Bitwise Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3BitwiseNotExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BitwiseNotExpression()
	 * @generated
	 */
	int AS3_BITWISE_NOT_EXPRESSION = 97;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BITWISE_NOT_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Bitwise Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BITWISE_NOT_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3LogicalNotExpressionImpl <em>As3 Logical Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3LogicalNotExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LogicalNotExpression()
	 * @generated
	 */
	int AS3_LOGICAL_NOT_EXPRESSION = 98;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LOGICAL_NOT_EXPRESSION__EXPRESSION = AS3_UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Logical Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LOGICAL_NOT_EXPRESSION_FEATURE_COUNT = AS3_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PostfixExpressionImpl <em>As3 Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PostfixExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostfixExpression()
	 * @generated
	 */
	int AS3_POSTFIX_EXPRESSION = 99;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POSTFIX_EXPRESSION__EXPRESSION = IPOSTFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POSTFIX_EXPRESSION_FEATURE_COUNT = IPOSTFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PostIncrementExpressionImpl <em>As3 Post Increment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PostIncrementExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostIncrementExpression()
	 * @generated
	 */
	int AS3_POST_INCREMENT_EXPRESSION = 100;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POST_INCREMENT_EXPRESSION__EXPRESSION = AS3_POSTFIX_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Post Increment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POST_INCREMENT_EXPRESSION_FEATURE_COUNT = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PostDecrementExpressionImpl <em>As3 Post Decrement Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PostDecrementExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostDecrementExpression()
	 * @generated
	 */
	int AS3_POST_DECREMENT_EXPRESSION = 101;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POST_DECREMENT_EXPRESSION__EXPRESSION = AS3_POSTFIX_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>As3 Post Decrement Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POST_DECREMENT_EXPRESSION_FEATURE_COUNT = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3InvocationExpressionImpl <em>As3 Invocation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3InvocationExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3InvocationExpression()
	 * @generated
	 */
	int AS3_INVOCATION_EXPRESSION = 102;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INVOCATION_EXPRESSION__EXPRESSION = AS3_POSTFIX_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INVOCATION_EXPRESSION__ARGUMENTS = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Invocation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_INVOCATION_EXPRESSION_FEATURE_COUNT = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3AccessExpressionImpl <em>As3 Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3AccessExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AccessExpression()
	 * @generated
	 */
	int AS3_ACCESS_EXPRESSION = 103;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ACCESS_EXPRESSION__EXPRESSION = AS3_POSTFIX_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ACCESS_EXPRESSION__OPERATOR = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ACCESS_EXPRESSION_FEATURE_COUNT = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3QueryExpressionImpl <em>As3 Query Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3QueryExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QueryExpression()
	 * @generated
	 */
	int AS3_QUERY_EXPRESSION = 104;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUERY_EXPRESSION__EXPRESSION = AS3_POSTFIX_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUERY_EXPRESSION__OPERATOR = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Query Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUERY_EXPRESSION_FEATURE_COUNT = AS3_POSTFIX_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PostfixOperatorImpl <em>As3 Postfix Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PostfixOperatorImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostfixOperator()
	 * @generated
	 */
	int AS3_POSTFIX_OPERATOR = 105;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POSTFIX_OPERATOR__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POSTFIX_OPERATOR__EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>As3 Postfix Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_POSTFIX_OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PropertyOperatorImpl <em>As3 Property Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PropertyOperatorImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PropertyOperator()
	 * @generated
	 */
	int AS3_PROPERTY_OPERATOR = 106;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROPERTY_OPERATOR__IDENTIFIER = AS3_POSTFIX_OPERATOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROPERTY_OPERATOR__EXPRESSIONS = AS3_POSTFIX_OPERATOR__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>As3 Property Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROPERTY_OPERATOR_FEATURE_COUNT = AS3_POSTFIX_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3QueryOperatorImpl <em>As3 Query Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3QueryOperatorImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QueryOperator()
	 * @generated
	 */
	int AS3_QUERY_OPERATOR = 107;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUERY_OPERATOR__IDENTIFIER = AS3_POSTFIX_OPERATOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUERY_OPERATOR__EXPRESSIONS = AS3_POSTFIX_OPERATOR__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>As3 Query Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUERY_OPERATOR_FEATURE_COUNT = AS3_POSTFIX_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3SimpleIdentifierImpl <em>As3 Simple Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3SimpleIdentifierImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SimpleIdentifier()
	 * @generated
	 */
	int AS3_SIMPLE_IDENTIFIER = 108;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_IDENTIFIER__NAME = INON_ATTRIBUTE_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_IDENTIFIER__REFERENCE = INON_ATTRIBUTE_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Simple Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_IDENTIFIER_FEATURE_COUNT = INON_ATTRIBUTE_IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3PropertyIdentifierImpl <em>As3 Property Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3PropertyIdentifierImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PropertyIdentifier()
	 * @generated
	 */
	int AS3_PROPERTY_IDENTIFIER = 109;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROPERTY_IDENTIFIER__NAME = AS3_SIMPLE_IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROPERTY_IDENTIFIER__REFERENCE = AS3_SIMPLE_IDENTIFIER__REFERENCE;

	/**
	 * The number of structural features of the '<em>As3 Property Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PROPERTY_IDENTIFIER_FEATURE_COUNT = AS3_SIMPLE_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3QualifiedIdentifierImpl <em>As3 Qualified Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3QualifiedIdentifierImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QualifiedIdentifier()
	 * @generated
	 */
	int AS3_QUALIFIED_IDENTIFIER = 110;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUALIFIED_IDENTIFIER__EXPRESSIONS = IIDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUALIFIED_IDENTIFIER__IDENTIFIER = IIDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>As3 Qualified Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_QUALIFIED_IDENTIFIER_FEATURE_COUNT = IIDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3AttributeQualifiedIdentifierImpl <em>As3 Attribute Qualified Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3AttributeQualifiedIdentifierImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AttributeQualifiedIdentifier()
	 * @generated
	 */
	int AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER = 111;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER__EXPRESSIONS = AS3_QUALIFIED_IDENTIFIER__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER__IDENTIFIER = AS3_QUALIFIED_IDENTIFIER__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>As3 Attribute Qualified Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT = AS3_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3NonAttributeQualifiedIdentifierImpl <em>As3 Non Attribute Qualified Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3NonAttributeQualifiedIdentifierImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NonAttributeQualifiedIdentifier()
	 * @generated
	 */
	int AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER = 112;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER__EXPRESSIONS = AS3_QUALIFIED_IDENTIFIER__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER__IDENTIFIER = AS3_QUALIFIED_IDENTIFIER__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>As3 Non Attribute Qualified Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT = AS3_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3SimpleQualifiedIdentifierImpl <em>As3 Simple Qualified Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3SimpleQualifiedIdentifierImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SimpleQualifiedIdentifier()
	 * @generated
	 */
	int AS3_SIMPLE_QUALIFIED_IDENTIFIER = 113;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_QUALIFIED_IDENTIFIER__EXPRESSIONS = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_QUALIFIED_IDENTIFIER__IDENTIFIER = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_QUALIFIED_IDENTIFIER__QUALIFIER = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Simple Qualified Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SIMPLE_QUALIFIED_IDENTIFIER_FEATURE_COUNT = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ExpressionQualifiedIdentifierImpl <em>As3 Expression Qualified Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ExpressionQualifiedIdentifierImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionQualifiedIdentifier()
	 * @generated
	 */
	int AS3_EXPRESSION_QUALIFIED_IDENTIFIER = 114;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_QUALIFIED_IDENTIFIER__EXPRESSIONS = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_QUALIFIED_IDENTIFIER__IDENTIFIER = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_QUALIFIED_IDENTIFIER__QUALIFIER = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Expression Qualified Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_EXPRESSION_QUALIFIED_IDENTIFIER_FEATURE_COUNT = AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ThisExpressionImpl <em>As3 This Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ThisExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ThisExpression()
	 * @generated
	 */
	int AS3_THIS_EXPRESSION = 115;

	/**
	 * The number of structural features of the '<em>As3 This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_THIS_EXPRESSION_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3SuperExpressionImpl <em>As3 Super Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3SuperExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SuperExpression()
	 * @generated
	 */
	int AS3_SUPER_EXPRESSION = 116;

	/**
	 * The number of structural features of the '<em>As3 Super Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_SUPER_EXPRESSION_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ParenListExpressionImpl <em>As3 Paren List Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ParenListExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ParenListExpression()
	 * @generated
	 */
	int AS3_PAREN_LIST_EXPRESSION = 117;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PAREN_LIST_EXPRESSION__EXPRESSIONS = AS3_EXPRESSION_LIST__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>As3 Paren List Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_PAREN_LIST_EXPRESSION_FEATURE_COUNT = AS3_EXPRESSION_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3FunctionExpressionImpl <em>As3 Function Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3FunctionExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3FunctionExpression()
	 * @generated
	 */
	int AS3_FUNCTION_EXPRESSION = 118;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FUNCTION_EXPRESSION__PARAMETERS = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FUNCTION_EXPRESSION__RETURN_TYPE = IPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FUNCTION_EXPRESSION__BODY = IPRIMARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FUNCTION_EXPRESSION__NAME = IPRIMARY_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>As3 Function Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_FUNCTION_EXPRESSION_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3NewExpressionImpl <em>As3 New Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3NewExpressionImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NewExpression()
	 * @generated
	 */
	int AS3_NEW_EXPRESSION = 119;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NEW_EXPRESSION__TARGET = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 New Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NEW_EXPRESSION_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ArrayInitializerImpl <em>As3 Array Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ArrayInitializerImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ArrayInitializer()
	 * @generated
	 */
	int AS3_ARRAY_INITIALIZER = 120;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ARRAY_INITIALIZER__ELEMENTS = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Array Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ARRAY_INITIALIZER_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ArrayElementImpl <em>As3 Array Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ArrayElementImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ArrayElement()
	 * @generated
	 */
	int AS3_ARRAY_ELEMENT = 121;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ARRAY_ELEMENT__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>As3 Array Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_ARRAY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3ObjectInitializerImpl <em>As3 Object Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3ObjectInitializerImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ObjectInitializer()
	 * @generated
	 */
	int AS3_OBJECT_INITIALIZER = 122;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OBJECT_INITIALIZER__FIELDS = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Object Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_OBJECT_INITIALIZER_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3LiteralFieldImpl <em>As3 Literal Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3LiteralFieldImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LiteralField()
	 * @generated
	 */
	int AS3_LITERAL_FIELD = 123;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LITERAL_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LITERAL_FIELD__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>As3 Literal Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_LITERAL_FIELD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3XmlInitializerImpl <em>As3 Xml Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3XmlInitializerImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3XmlInitializer()
	 * @generated
	 */
	int AS3_XML_INITIALIZER = 124;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_XML_INITIALIZER__VALUE = IPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Xml Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_XML_INITIALIZER_FEATURE_COUNT = IPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3NullLiteralImpl <em>As3 Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3NullLiteralImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NullLiteral()
	 * @generated
	 */
	int AS3_NULL_LITERAL = 125;

	/**
	 * The number of structural features of the '<em>As3 Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NULL_LITERAL_FEATURE_COUNT = ILITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3BooleanLiteralImpl <em>As3 Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3BooleanLiteralImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BooleanLiteral()
	 * @generated
	 */
	int AS3_BOOLEAN_LITERAL = 126;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BOOLEAN_LITERAL__VALUE = ILITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_BOOLEAN_LITERAL_FEATURE_COUNT = ILITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3NumberLiteralImpl <em>As3 Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3NumberLiteralImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NumberLiteral()
	 * @generated
	 */
	int AS3_NUMBER_LITERAL = 127;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NUMBER_LITERAL__VALUE = ILITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_NUMBER_LITERAL_FEATURE_COUNT = ILITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3StringLiteralImpl <em>As3 String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3StringLiteralImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3StringLiteral()
	 * @generated
	 */
	int AS3_STRING_LITERAL = 128;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_STRING_LITERAL__VALUE = ILITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_STRING_LITERAL_FEATURE_COUNT = ILITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.axdt.as3.model.impl.As3RegexLiteralImpl <em>As3 Regex Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.axdt.as3.model.impl.As3RegexLiteralImpl
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3RegexLiteral()
	 * @generated
	 */
	int AS3_REGEX_LITERAL = 129;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_REGEX_LITERAL__VALUE = ILITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>As3 Regex Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS3_REGEX_LITERAL_FEATURE_COUNT = ILITERAL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '<em>Iterable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Iterable
	 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIterable()
	 * @generated
	 */
	int ITERABLE = 130;


	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IDirective <em>IDirective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDirective</em>'.
	 * @see org.axdt.as3.model.IDirective
	 * @generated
	 */
	EClass getIDirective();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.IDirective#getVsemi <em>Vsemi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vsemi</em>'.
	 * @see org.axdt.as3.model.IDirective#getVsemi()
	 * @see #getIDirective()
	 * @generated
	 */
	EAttribute getIDirective_Vsemi();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IStatement <em>IStatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStatement</em>'.
	 * @see org.axdt.as3.model.IStatement
	 * @generated
	 */
	EClass getIStatement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IExpression <em>IExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IExpression</em>'.
	 * @see org.axdt.as3.model.IExpression
	 * @generated
	 */
	EClass getIExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IAssignmentExpression <em>IAssignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAssignment Expression</em>'.
	 * @see org.axdt.as3.model.IAssignmentExpression
	 * @generated
	 */
	EClass getIAssignmentExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IConditionalExpression <em>IConditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IConditional Expression</em>'.
	 * @see org.axdt.as3.model.IConditionalExpression
	 * @generated
	 */
	EClass getIConditionalExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.ILogicalExpression <em>ILogical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILogical Expression</em>'.
	 * @see org.axdt.as3.model.ILogicalExpression
	 * @generated
	 */
	EClass getILogicalExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IBitwiseExpression <em>IBitwise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBitwise Expression</em>'.
	 * @see org.axdt.as3.model.IBitwiseExpression
	 * @generated
	 */
	EClass getIBitwiseExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IEqualityExpression <em>IEquality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEquality Expression</em>'.
	 * @see org.axdt.as3.model.IEqualityExpression
	 * @generated
	 */
	EClass getIEqualityExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IRelationalExpression <em>IRelational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRelational Expression</em>'.
	 * @see org.axdt.as3.model.IRelationalExpression
	 * @generated
	 */
	EClass getIRelationalExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IArithmeticExpression <em>IArithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IArithmetic Expression</em>'.
	 * @see org.axdt.as3.model.IArithmeticExpression
	 * @generated
	 */
	EClass getIArithmeticExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IUnaryExpression <em>IUnary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IUnary Expression</em>'.
	 * @see org.axdt.as3.model.IUnaryExpression
	 * @generated
	 */
	EClass getIUnaryExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IPostfixExpression <em>IPostfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPostfix Expression</em>'.
	 * @see org.axdt.as3.model.IPostfixExpression
	 * @generated
	 */
	EClass getIPostfixExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IPrimaryExpression <em>IPrimary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPrimary Expression</em>'.
	 * @see org.axdt.as3.model.IPrimaryExpression
	 * @generated
	 */
	EClass getIPrimaryExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IIdentifier <em>IIdentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IIdentifier</em>'.
	 * @see org.axdt.as3.model.IIdentifier
	 * @generated
	 */
	EClass getIIdentifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.ILiteral <em>ILiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILiteral</em>'.
	 * @see org.axdt.as3.model.ILiteral
	 * @generated
	 */
	EClass getILiteral();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.ILiteralFieldName <em>ILiteral Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILiteral Field Name</em>'.
	 * @see org.axdt.as3.model.ILiteralFieldName
	 * @generated
	 */
	EClass getILiteralFieldName();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.ICaseElement <em>ICase Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICase Element</em>'.
	 * @see org.axdt.as3.model.ICaseElement
	 * @generated
	 */
	EClass getICaseElement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.INonAttributeIdentifier <em>INon Attribute Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INon Attribute Identifier</em>'.
	 * @see org.axdt.as3.model.INonAttributeIdentifier
	 * @generated
	 */
	EClass getINonAttributeIdentifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IAttribute <em>IAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAttribute</em>'.
	 * @see org.axdt.as3.model.IAttribute
	 * @generated
	 */
	EClass getIAttribute();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IForInit <em>IFor Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFor Init</em>'.
	 * @see org.axdt.as3.model.IForInit
	 * @generated
	 */
	EClass getIForInit();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.IForInInit <em>IFor In Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFor In Init</em>'.
	 * @see org.axdt.as3.model.IForInInit
	 * @generated
	 */
	EClass getIForInInit();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Element <em>As3 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Element</em>'.
	 * @see org.axdt.as3.model.As3Element
	 * @generated
	 */
	EClass getAs3Element();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Identifiable <em>As3 Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Identifiable</em>'.
	 * @see org.axdt.as3.model.As3Identifiable
	 * @generated
	 */
	EClass getAs3Identifiable();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Definition <em>As3 Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Definition</em>'.
	 * @see org.axdt.as3.model.As3Definition
	 * @generated
	 */
	EClass getAs3Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3Definition#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.axdt.as3.model.As3Definition#getMetadata()
	 * @see #getAs3Definition()
	 * @generated
	 */
	EReference getAs3Definition_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Definition#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.axdt.as3.model.As3Definition#getVisibility()
	 * @see #getAs3Definition()
	 * @generated
	 */
	EAttribute getAs3Definition_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Definition#getCustomVisibility <em>Custom Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Visibility</em>'.
	 * @see org.axdt.as3.model.As3Definition#getCustomVisibility()
	 * @see #getAs3Definition()
	 * @generated
	 */
	EReference getAs3Definition_CustomVisibility();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Definition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3Definition#getName()
	 * @see #getAs3Definition()
	 * @generated
	 */
	EAttribute getAs3Definition_Name();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Member <em>As3 Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Member</em>'.
	 * @see org.axdt.as3.model.As3Member
	 * @generated
	 */
	EClass getAs3Member();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Member#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.axdt.as3.model.As3Member#isStatic()
	 * @see #getAs3Member()
	 * @generated
	 */
	EAttribute getAs3Member_Static();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Executable <em>As3 Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Executable</em>'.
	 * @see org.axdt.as3.model.As3Executable
	 * @generated
	 */
	EClass getAs3Executable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3Executable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.axdt.as3.model.As3Executable#getParameters()
	 * @see #getAs3Executable()
	 * @generated
	 */
	EReference getAs3Executable_Parameters();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Parameter <em>As3 Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Parameter</em>'.
	 * @see org.axdt.as3.model.As3Parameter
	 * @generated
	 */
	EClass getAs3Parameter();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ParameterAssign <em>As3 Parameter Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Parameter Assign</em>'.
	 * @see org.axdt.as3.model.As3ParameterAssign
	 * @generated
	 */
	EClass getAs3ParameterAssign();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ParameterAssign#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3ParameterAssign#getExpression()
	 * @see #getAs3ParameterAssign()
	 * @generated
	 */
	EReference getAs3ParameterAssign_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ParameterRest <em>As3 Parameter Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Parameter Rest</em>'.
	 * @see org.axdt.as3.model.As3ParameterRest
	 * @generated
	 */
	EClass getAs3ParameterRest();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3FieldBinding <em>As3 Field Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Field Binding</em>'.
	 * @see org.axdt.as3.model.As3FieldBinding
	 * @generated
	 */
	EClass getAs3FieldBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3FieldBinding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.axdt.as3.model.As3FieldBinding#getType()
	 * @see #getAs3FieldBinding()
	 * @generated
	 */
	EReference getAs3FieldBinding_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3FieldBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3FieldBinding#getExpression()
	 * @see #getAs3FieldBinding()
	 * @generated
	 */
	EReference getAs3FieldBinding_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3FieldDefinition <em>As3 Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Field Definition</em>'.
	 * @see org.axdt.as3.model.As3FieldDefinition
	 * @generated
	 */
	EClass getAs3FieldDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3FieldDefinition#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.axdt.as3.model.As3FieldDefinition#getVisibility()
	 * @see #getAs3FieldDefinition()
	 * @generated
	 */
	EAttribute getAs3FieldDefinition_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3FieldDefinition#getCustomVisibility <em>Custom Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Visibility</em>'.
	 * @see org.axdt.as3.model.As3FieldDefinition#getCustomVisibility()
	 * @see #getAs3FieldDefinition()
	 * @generated
	 */
	EReference getAs3FieldDefinition_CustomVisibility();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3FieldDefinition#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.axdt.as3.model.As3FieldDefinition#isStatic()
	 * @see #getAs3FieldDefinition()
	 * @generated
	 */
	EAttribute getAs3FieldDefinition_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3FieldDefinition#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.axdt.as3.model.As3FieldDefinition#isConstant()
	 * @see #getAs3FieldDefinition()
	 * @generated
	 */
	EAttribute getAs3FieldDefinition_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3FieldDefinition#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.axdt.as3.model.As3FieldDefinition#getBindings()
	 * @see #getAs3FieldDefinition()
	 * @generated
	 */
	EReference getAs3FieldDefinition_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3FieldDefinition#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.axdt.as3.model.As3FieldDefinition#getMetadata()
	 * @see #getAs3FieldDefinition()
	 * @generated
	 */
	EReference getAs3FieldDefinition_Metadata();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Program <em>As3 Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Program</em>'.
	 * @see org.axdt.as3.model.As3Program
	 * @generated
	 */
	EClass getAs3Program();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Program#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see org.axdt.as3.model.As3Program#getPackage()
	 * @see #getAs3Program()
	 * @generated
	 */
	EReference getAs3Program_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3Program#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see org.axdt.as3.model.As3Program#getDirectives()
	 * @see #getAs3Program()
	 * @generated
	 */
	EReference getAs3Program_Directives();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Import <em>As3 Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Import</em>'.
	 * @see org.axdt.as3.model.As3Import
	 * @generated
	 */
	EClass getAs3Import();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Import#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.axdt.as3.model.As3Import#getQualifiedName()
	 * @see #getAs3Import()
	 * @generated
	 */
	EAttribute getAs3Import_QualifiedName();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ImportList <em>As3 Import List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Import List</em>'.
	 * @see org.axdt.as3.model.As3ImportList
	 * @generated
	 */
	EClass getAs3ImportList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3ImportList#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.axdt.as3.model.As3ImportList#getImports()
	 * @see #getAs3ImportList()
	 * @generated
	 */
	EReference getAs3ImportList_Imports();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Include <em>As3 Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Include</em>'.
	 * @see org.axdt.as3.model.As3Include
	 * @generated
	 */
	EClass getAs3Include();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Include#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.axdt.as3.model.As3Include#getTarget()
	 * @see #getAs3Include()
	 * @generated
	 */
	EAttribute getAs3Include_Target();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Use <em>As3 Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Use</em>'.
	 * @see org.axdt.as3.model.As3Use
	 * @generated
	 */
	EClass getAs3Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Use#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.axdt.as3.model.As3Use#getTarget()
	 * @see #getAs3Use()
	 * @generated
	 */
	EReference getAs3Use_Target();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Package <em>As3 Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Package</em>'.
	 * @see org.axdt.as3.model.As3Package
	 * @generated
	 */
	EClass getAs3Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3Package#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see org.axdt.as3.model.As3Package#getDirectives()
	 * @see #getAs3Package()
	 * @generated
	 */
	EReference getAs3Package_Directives();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Package#getCanonicalName <em>Canonical Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical Name</em>'.
	 * @see org.axdt.as3.model.As3Package#getCanonicalName()
	 * @see #getAs3Package()
	 * @generated
	 */
	EAttribute getAs3Package_CanonicalName();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Type <em>As3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Type</em>'.
	 * @see org.axdt.as3.model.As3Type
	 * @generated
	 */
	EClass getAs3Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3Type#getExtendedInterfaces <em>Extended Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Interfaces</em>'.
	 * @see org.axdt.as3.model.As3Type#getExtendedInterfaces()
	 * @see #getAs3Type()
	 * @generated
	 */
	EReference getAs3Type_ExtendedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3Type#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see org.axdt.as3.model.As3Type#getDirectives()
	 * @see #getAs3Type()
	 * @generated
	 */
	EReference getAs3Type_Directives();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Class <em>As3 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Class</em>'.
	 * @see org.axdt.as3.model.As3Class
	 * @generated
	 */
	EClass getAs3Class();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Class#isDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see org.axdt.as3.model.As3Class#isDynamic()
	 * @see #getAs3Class()
	 * @generated
	 */
	EAttribute getAs3Class_Dynamic();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Class#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.axdt.as3.model.As3Class#isFinal()
	 * @see #getAs3Class()
	 * @generated
	 */
	EAttribute getAs3Class_Final();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Class#getExtendedClass <em>Extended Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Class</em>'.
	 * @see org.axdt.as3.model.As3Class#getExtendedClass()
	 * @see #getAs3Class()
	 * @generated
	 */
	EReference getAs3Class_ExtendedClass();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Interface <em>As3 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Interface</em>'.
	 * @see org.axdt.as3.model.As3Interface
	 * @generated
	 */
	EClass getAs3Interface();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Namespace <em>As3 Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Namespace</em>'.
	 * @see org.axdt.as3.model.As3Namespace
	 * @generated
	 */
	EClass getAs3Namespace();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Namespace#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3Namespace#getExpression()
	 * @see #getAs3Namespace()
	 * @generated
	 */
	EReference getAs3Namespace_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Variable <em>As3 Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Variable</em>'.
	 * @see org.axdt.as3.model.As3Variable
	 * @generated
	 */
	EClass getAs3Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.axdt.as3.model.As3Variable#getType()
	 * @see #getAs3Variable()
	 * @generated
	 */
	EReference getAs3Variable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3Variable#getName()
	 * @see #getAs3Variable()
	 * @generated
	 */
	EAttribute getAs3Variable_Name();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3VariableAssign <em>As3 Variable Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Variable Assign</em>'.
	 * @see org.axdt.as3.model.As3VariableAssign
	 * @generated
	 */
	EClass getAs3VariableAssign();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3VariableAssign#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3VariableAssign#getExpression()
	 * @see #getAs3VariableAssign()
	 * @generated
	 */
	EReference getAs3VariableAssign_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3VariableDefinition <em>As3 Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Variable Definition</em>'.
	 * @see org.axdt.as3.model.As3VariableDefinition
	 * @generated
	 */
	EClass getAs3VariableDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3VariableDefinition#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.axdt.as3.model.As3VariableDefinition#isConstant()
	 * @see #getAs3VariableDefinition()
	 * @generated
	 */
	EAttribute getAs3VariableDefinition_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3VariableDefinition#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.axdt.as3.model.As3VariableDefinition#getBindings()
	 * @see #getAs3VariableDefinition()
	 * @generated
	 */
	EReference getAs3VariableDefinition_Bindings();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Operation <em>As3 Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Operation</em>'.
	 * @see org.axdt.as3.model.As3Operation
	 * @generated
	 */
	EClass getAs3Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.axdt.as3.model.As3Operation#getReturnType()
	 * @see #getAs3Operation()
	 * @generated
	 */
	EReference getAs3Operation_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.axdt.as3.model.As3Operation#getBody()
	 * @see #getAs3Operation()
	 * @generated
	 */
	EReference getAs3Operation_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Operation#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see org.axdt.as3.model.As3Operation#isNative()
	 * @see #getAs3Operation()
	 * @generated
	 */
	EAttribute getAs3Operation_Native();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Operation#isOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override</em>'.
	 * @see org.axdt.as3.model.As3Operation#isOverride()
	 * @see #getAs3Operation()
	 * @generated
	 */
	EAttribute getAs3Operation_Override();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Operation#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.axdt.as3.model.As3Operation#isFinal()
	 * @see #getAs3Operation()
	 * @generated
	 */
	EAttribute getAs3Operation_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Operation#isGetter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter</em>'.
	 * @see org.axdt.as3.model.As3Operation#isGetter()
	 * @see #getAs3Operation()
	 * @generated
	 */
	EAttribute getAs3Operation_Getter();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3Operation#isSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter</em>'.
	 * @see org.axdt.as3.model.As3Operation#isSetter()
	 * @see #getAs3Operation()
	 * @generated
	 */
	EAttribute getAs3Operation_Setter();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Constructor <em>As3 Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Constructor</em>'.
	 * @see org.axdt.as3.model.As3Constructor
	 * @generated
	 */
	EClass getAs3Constructor();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3Constructor#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.axdt.as3.model.As3Constructor#getBody()
	 * @see #getAs3Constructor()
	 * @generated
	 */
	EReference getAs3Constructor_Body();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3MetadataTag <em>As3 Metadata Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Metadata Tag</em>'.
	 * @see org.axdt.as3.model.As3MetadataTag
	 * @generated
	 */
	EClass getAs3MetadataTag();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3MetadataTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3MetadataTag#getName()
	 * @see #getAs3MetadataTag()
	 * @generated
	 */
	EAttribute getAs3MetadataTag_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3MetadataTag#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.axdt.as3.model.As3MetadataTag#getParameters()
	 * @see #getAs3MetadataTag()
	 * @generated
	 */
	EReference getAs3MetadataTag_Parameters();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3MetadataParameter <em>As3 Metadata Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Metadata Parameter</em>'.
	 * @see org.axdt.as3.model.As3MetadataParameter
	 * @generated
	 */
	EClass getAs3MetadataParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3MetadataParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3MetadataParameter#getName()
	 * @see #getAs3MetadataParameter()
	 * @generated
	 */
	EAttribute getAs3MetadataParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3MetadataParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.axdt.as3.model.As3MetadataParameter#getValue()
	 * @see #getAs3MetadataParameter()
	 * @generated
	 */
	EReference getAs3MetadataParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3AttributeExpression <em>As3 Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Attribute Expression</em>'.
	 * @see org.axdt.as3.model.As3AttributeExpression
	 * @generated
	 */
	EClass getAs3AttributeExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3SimpleAttributeExpression <em>As3 Simple Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Simple Attribute Expression</em>'.
	 * @see org.axdt.as3.model.As3SimpleAttributeExpression
	 * @generated
	 */
	EClass getAs3SimpleAttributeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3SimpleAttributeExpression#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ident</em>'.
	 * @see org.axdt.as3.model.As3SimpleAttributeExpression#getIdent()
	 * @see #getAs3SimpleAttributeExpression()
	 * @generated
	 */
	EReference getAs3SimpleAttributeExpression_Ident();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3QualifiedAttributeExpression <em>As3 Qualified Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Qualified Attribute Expression</em>'.
	 * @see org.axdt.as3.model.As3QualifiedAttributeExpression
	 * @generated
	 */
	EClass getAs3QualifiedAttributeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3QualifiedAttributeExpression#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see org.axdt.as3.model.As3QualifiedAttributeExpression#getQualifier()
	 * @see #getAs3QualifiedAttributeExpression()
	 * @generated
	 */
	EReference getAs3QualifiedAttributeExpression_Qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3QualifiedAttributeExpression#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.axdt.as3.model.As3QualifiedAttributeExpression#getIdentifier()
	 * @see #getAs3QualifiedAttributeExpression()
	 * @generated
	 */
	EReference getAs3QualifiedAttributeExpression_Identifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3DefaultXmlNamespaceStatement <em>As3 Default Xml Namespace Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Default Xml Namespace Statement</em>'.
	 * @see org.axdt.as3.model.As3DefaultXmlNamespaceStatement
	 * @generated
	 */
	EClass getAs3DefaultXmlNamespaceStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3DefaultXmlNamespaceStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3DefaultXmlNamespaceStatement#getExpression()
	 * @see #getAs3DefaultXmlNamespaceStatement()
	 * @generated
	 */
	EReference getAs3DefaultXmlNamespaceStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3TryStatement <em>As3 Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Try Statement</em>'.
	 * @see org.axdt.as3.model.As3TryStatement
	 * @generated
	 */
	EClass getAs3TryStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3TryStatement#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.axdt.as3.model.As3TryStatement#getBlock()
	 * @see #getAs3TryStatement()
	 * @generated
	 */
	EReference getAs3TryStatement_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3TryStatement#getCatches <em>Catches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catches</em>'.
	 * @see org.axdt.as3.model.As3TryStatement#getCatches()
	 * @see #getAs3TryStatement()
	 * @generated
	 */
	EReference getAs3TryStatement_Catches();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3TryStatement#getFinalBlock <em>Final Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Block</em>'.
	 * @see org.axdt.as3.model.As3TryStatement#getFinalBlock()
	 * @see #getAs3TryStatement()
	 * @generated
	 */
	EReference getAs3TryStatement_FinalBlock();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3CatchClause <em>As3 Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Catch Clause</em>'.
	 * @see org.axdt.as3.model.As3CatchClause
	 * @generated
	 */
	EClass getAs3CatchClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3CatchClause#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.axdt.as3.model.As3CatchClause#getError()
	 * @see #getAs3CatchClause()
	 * @generated
	 */
	EReference getAs3CatchClause_Error();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3CatchClause#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.axdt.as3.model.As3CatchClause#getBlock()
	 * @see #getAs3CatchClause()
	 * @generated
	 */
	EReference getAs3CatchClause_Block();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ThrowStatement <em>As3 Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Throw Statement</em>'.
	 * @see org.axdt.as3.model.As3ThrowStatement
	 * @generated
	 */
	EClass getAs3ThrowStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ThrowStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3ThrowStatement#getExpression()
	 * @see #getAs3ThrowStatement()
	 * @generated
	 */
	EReference getAs3ThrowStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ReturnStatement <em>As3 Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Return Statement</em>'.
	 * @see org.axdt.as3.model.As3ReturnStatement
	 * @generated
	 */
	EClass getAs3ReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3ReturnStatement#getExpression()
	 * @see #getAs3ReturnStatement()
	 * @generated
	 */
	EReference getAs3ReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3WithStatement <em>As3 With Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 With Statement</em>'.
	 * @see org.axdt.as3.model.As3WithStatement
	 * @generated
	 */
	EClass getAs3WithStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3WithStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.axdt.as3.model.As3WithStatement#getTarget()
	 * @see #getAs3WithStatement()
	 * @generated
	 */
	EReference getAs3WithStatement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3WithStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.axdt.as3.model.As3WithStatement#getStatement()
	 * @see #getAs3WithStatement()
	 * @generated
	 */
	EReference getAs3WithStatement_Statement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3BreakStatement <em>As3 Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Break Statement</em>'.
	 * @see org.axdt.as3.model.As3BreakStatement
	 * @generated
	 */
	EClass getAs3BreakStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3BreakStatement#getLabelName <em>Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Name</em>'.
	 * @see org.axdt.as3.model.As3BreakStatement#getLabelName()
	 * @see #getAs3BreakStatement()
	 * @generated
	 */
	EAttribute getAs3BreakStatement_LabelName();

	/**
	 * Returns the meta object for the reference '{@link org.axdt.as3.model.As3BreakStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.axdt.as3.model.As3BreakStatement#getLabel()
	 * @see #getAs3BreakStatement()
	 * @generated
	 */
	EReference getAs3BreakStatement_Label();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ContinueStatement <em>As3 Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Continue Statement</em>'.
	 * @see org.axdt.as3.model.As3ContinueStatement
	 * @generated
	 */
	EClass getAs3ContinueStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3ContinueStatement#getLabelName <em>Label Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Name</em>'.
	 * @see org.axdt.as3.model.As3ContinueStatement#getLabelName()
	 * @see #getAs3ContinueStatement()
	 * @generated
	 */
	EAttribute getAs3ContinueStatement_LabelName();

	/**
	 * Returns the meta object for the reference '{@link org.axdt.as3.model.As3ContinueStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.axdt.as3.model.As3ContinueStatement#getLabel()
	 * @see #getAs3ContinueStatement()
	 * @generated
	 */
	EReference getAs3ContinueStatement_Label();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3IterationStatement <em>As3 Iteration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Iteration Statement</em>'.
	 * @see org.axdt.as3.model.As3IterationStatement
	 * @generated
	 */
	EClass getAs3IterationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3IterationStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.axdt.as3.model.As3IterationStatement#getStatement()
	 * @see #getAs3IterationStatement()
	 * @generated
	 */
	EReference getAs3IterationStatement_Statement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ConditionalIterationStatement <em>As3 Conditional Iteration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Conditional Iteration Statement</em>'.
	 * @see org.axdt.as3.model.As3ConditionalIterationStatement
	 * @generated
	 */
	EClass getAs3ConditionalIterationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ConditionalIterationStatement#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see org.axdt.as3.model.As3ConditionalIterationStatement#getConditions()
	 * @see #getAs3ConditionalIterationStatement()
	 * @generated
	 */
	EReference getAs3ConditionalIterationStatement_Conditions();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3DoStatement <em>As3 Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Do Statement</em>'.
	 * @see org.axdt.as3.model.As3DoStatement
	 * @generated
	 */
	EClass getAs3DoStatement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3WhileStatement <em>As3 While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 While Statement</em>'.
	 * @see org.axdt.as3.model.As3WhileStatement
	 * @generated
	 */
	EClass getAs3WhileStatement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ForStatement <em>As3 For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 For Statement</em>'.
	 * @see org.axdt.as3.model.As3ForStatement
	 * @generated
	 */
	EClass getAs3ForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ForStatement#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.axdt.as3.model.As3ForStatement#getInit()
	 * @see #getAs3ForStatement()
	 * @generated
	 */
	EReference getAs3ForStatement_Init();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ForStatement#getIter <em>Iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iter</em>'.
	 * @see org.axdt.as3.model.As3ForStatement#getIter()
	 * @see #getAs3ForStatement()
	 * @generated
	 */
	EReference getAs3ForStatement_Iter();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ForInStatement <em>As3 For In Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 For In Statement</em>'.
	 * @see org.axdt.as3.model.As3ForInStatement
	 * @generated
	 */
	EClass getAs3ForInStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ForInStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.axdt.as3.model.As3ForInStatement#getTarget()
	 * @see #getAs3ForInStatement()
	 * @generated
	 */
	EReference getAs3ForInStatement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ForInStatement#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.axdt.as3.model.As3ForInStatement#getInit()
	 * @see #getAs3ForInStatement()
	 * @generated
	 */
	EReference getAs3ForInStatement_Init();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3ForInStatement#isForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Each</em>'.
	 * @see org.axdt.as3.model.As3ForInStatement#isForEach()
	 * @see #getAs3ForInStatement()
	 * @generated
	 */
	EAttribute getAs3ForInStatement_ForEach();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ConditionalStatement <em>As3 Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Conditional Statement</em>'.
	 * @see org.axdt.as3.model.As3ConditionalStatement
	 * @generated
	 */
	EClass getAs3ConditionalStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ConditionalStatement#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see org.axdt.as3.model.As3ConditionalStatement#getConditions()
	 * @see #getAs3ConditionalStatement()
	 * @generated
	 */
	EReference getAs3ConditionalStatement_Conditions();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3SwitchStatement <em>As3 Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Switch Statement</em>'.
	 * @see org.axdt.as3.model.As3SwitchStatement
	 * @generated
	 */
	EClass getAs3SwitchStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3SwitchStatement#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.axdt.as3.model.As3SwitchStatement#getCases()
	 * @see #getAs3SwitchStatement()
	 * @generated
	 */
	EReference getAs3SwitchStatement_Cases();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3CaseLabel <em>As3 Case Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Case Label</em>'.
	 * @see org.axdt.as3.model.As3CaseLabel
	 * @generated
	 */
	EClass getAs3CaseLabel();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3DefaultCase <em>As3 Default Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Default Case</em>'.
	 * @see org.axdt.as3.model.As3DefaultCase
	 * @generated
	 */
	EClass getAs3DefaultCase();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ExpressionCase <em>As3 Expression Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Expression Case</em>'.
	 * @see org.axdt.as3.model.As3ExpressionCase
	 * @generated
	 */
	EClass getAs3ExpressionCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ExpressionCase#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see org.axdt.as3.model.As3ExpressionCase#getExpressions()
	 * @see #getAs3ExpressionCase()
	 * @generated
	 */
	EReference getAs3ExpressionCase_Expressions();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3IfStatement <em>As3 If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 If Statement</em>'.
	 * @see org.axdt.as3.model.As3IfStatement
	 * @generated
	 */
	EClass getAs3IfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3IfStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.axdt.as3.model.As3IfStatement#getStatement()
	 * @see #getAs3IfStatement()
	 * @generated
	 */
	EReference getAs3IfStatement_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3IfStatement#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see org.axdt.as3.model.As3IfStatement#getElseStatement()
	 * @see #getAs3IfStatement()
	 * @generated
	 */
	EReference getAs3IfStatement_ElseStatement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3LabeledStatement <em>As3 Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Labeled Statement</em>'.
	 * @see org.axdt.as3.model.As3LabeledStatement
	 * @generated
	 */
	EClass getAs3LabeledStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3LabeledStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3LabeledStatement#getName()
	 * @see #getAs3LabeledStatement()
	 * @generated
	 */
	EAttribute getAs3LabeledStatement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3LabeledStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.axdt.as3.model.As3LabeledStatement#getStatement()
	 * @see #getAs3LabeledStatement()
	 * @generated
	 */
	EReference getAs3LabeledStatement_Statement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Block <em>As3 Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Block</em>'.
	 * @see org.axdt.as3.model.As3Block
	 * @generated
	 */
	EClass getAs3Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3Block#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see org.axdt.as3.model.As3Block#getDirectives()
	 * @see #getAs3Block()
	 * @generated
	 */
	EReference getAs3Block_Directives();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3SuperStatement <em>As3 Super Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Super Statement</em>'.
	 * @see org.axdt.as3.model.As3SuperStatement
	 * @generated
	 */
	EClass getAs3SuperStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3SuperStatement#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see org.axdt.as3.model.As3SuperStatement#getArguments()
	 * @see #getAs3SuperStatement()
	 * @generated
	 */
	EReference getAs3SuperStatement_Arguments();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ExpressionStatement <em>As3 Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Expression Statement</em>'.
	 * @see org.axdt.as3.model.As3ExpressionStatement
	 * @generated
	 */
	EClass getAs3ExpressionStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3ExpressionStatement#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.axdt.as3.model.As3ExpressionStatement#getExpressions()
	 * @see #getAs3ExpressionStatement()
	 * @generated
	 */
	EReference getAs3ExpressionStatement_Expressions();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3EmptyStatement <em>As3 Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Empty Statement</em>'.
	 * @see org.axdt.as3.model.As3EmptyStatement
	 * @generated
	 */
	EClass getAs3EmptyStatement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ExpressionList <em>As3 Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Expression List</em>'.
	 * @see org.axdt.as3.model.As3ExpressionList
	 * @generated
	 */
	EClass getAs3ExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3ExpressionList#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.axdt.as3.model.As3ExpressionList#getExpressions()
	 * @see #getAs3ExpressionList()
	 * @generated
	 */
	EReference getAs3ExpressionList_Expressions();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ListExpression <em>As3 List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 List Expression</em>'.
	 * @see org.axdt.as3.model.As3ListExpression
	 * @generated
	 */
	EClass getAs3ListExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3Arguments <em>As3 Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Arguments</em>'.
	 * @see org.axdt.as3.model.As3Arguments
	 * @generated
	 */
	EClass getAs3Arguments();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3AssignmentExpression <em>As3 Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Assignment Expression</em>'.
	 * @see org.axdt.as3.model.As3AssignmentExpression
	 * @generated
	 */
	EClass getAs3AssignmentExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ConditionalExpression <em>As3 Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Conditional Expression</em>'.
	 * @see org.axdt.as3.model.As3ConditionalExpression
	 * @generated
	 */
	EClass getAs3ConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ConditionalExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.axdt.as3.model.As3ConditionalExpression#getCondition()
	 * @see #getAs3ConditionalExpression()
	 * @generated
	 */
	EReference getAs3ConditionalExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ConditionalExpression#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.axdt.as3.model.As3ConditionalExpression#getStatement()
	 * @see #getAs3ConditionalExpression()
	 * @generated
	 */
	EReference getAs3ConditionalExpression_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ConditionalExpression#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see org.axdt.as3.model.As3ConditionalExpression#getElseStatement()
	 * @see #getAs3ConditionalExpression()
	 * @generated
	 */
	EReference getAs3ConditionalExpression_ElseStatement();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3BinaryExpression <em>As3 Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Binary Expression</em>'.
	 * @see org.axdt.as3.model.As3BinaryExpression
	 * @generated
	 */
	EClass getAs3BinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.axdt.as3.model.As3BinaryExpression#getLeft()
	 * @see #getAs3BinaryExpression()
	 * @generated
	 */
	EReference getAs3BinaryExpression_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3BinaryExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.axdt.as3.model.As3BinaryExpression#getOperation()
	 * @see #getAs3BinaryExpression()
	 * @generated
	 */
	EAttribute getAs3BinaryExpression_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.axdt.as3.model.As3BinaryExpression#getRight()
	 * @see #getAs3BinaryExpression()
	 * @generated
	 */
	EReference getAs3BinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3LogicalExpression <em>As3 Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Logical Expression</em>'.
	 * @see org.axdt.as3.model.As3LogicalExpression
	 * @generated
	 */
	EClass getAs3LogicalExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3BitwiseExpression <em>As3 Bitwise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Bitwise Expression</em>'.
	 * @see org.axdt.as3.model.As3BitwiseExpression
	 * @generated
	 */
	EClass getAs3BitwiseExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3EqualityExpression <em>As3 Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Equality Expression</em>'.
	 * @see org.axdt.as3.model.As3EqualityExpression
	 * @generated
	 */
	EClass getAs3EqualityExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3RelationalExpression <em>As3 Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Relational Expression</em>'.
	 * @see org.axdt.as3.model.As3RelationalExpression
	 * @generated
	 */
	EClass getAs3RelationalExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ShiftExpression <em>As3 Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Shift Expression</em>'.
	 * @see org.axdt.as3.model.As3ShiftExpression
	 * @generated
	 */
	EClass getAs3ShiftExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3AdditiveExpression <em>As3 Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Additive Expression</em>'.
	 * @see org.axdt.as3.model.As3AdditiveExpression
	 * @generated
	 */
	EClass getAs3AdditiveExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3MultiplicativeExpression <em>As3 Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Multiplicative Expression</em>'.
	 * @see org.axdt.as3.model.As3MultiplicativeExpression
	 * @generated
	 */
	EClass getAs3MultiplicativeExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3UnaryExpression <em>As3 Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Unary Expression</em>'.
	 * @see org.axdt.as3.model.As3UnaryExpression
	 * @generated
	 */
	EClass getAs3UnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3UnaryExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3UnaryExpression#getExpression()
	 * @see #getAs3UnaryExpression()
	 * @generated
	 */
	EReference getAs3UnaryExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3DeleteExpression <em>As3 Delete Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Delete Expression</em>'.
	 * @see org.axdt.as3.model.As3DeleteExpression
	 * @generated
	 */
	EClass getAs3DeleteExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3VoidExpression <em>As3 Void Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Void Expression</em>'.
	 * @see org.axdt.as3.model.As3VoidExpression
	 * @generated
	 */
	EClass getAs3VoidExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3TypeOfExpression <em>As3 Type Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Type Of Expression</em>'.
	 * @see org.axdt.as3.model.As3TypeOfExpression
	 * @generated
	 */
	EClass getAs3TypeOfExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PreIncrementExpression <em>As3 Pre Increment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Pre Increment Expression</em>'.
	 * @see org.axdt.as3.model.As3PreIncrementExpression
	 * @generated
	 */
	EClass getAs3PreIncrementExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PreDecrementExpression <em>As3 Pre Decrement Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Pre Decrement Expression</em>'.
	 * @see org.axdt.as3.model.As3PreDecrementExpression
	 * @generated
	 */
	EClass getAs3PreDecrementExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3UnaryPlusExpression <em>As3 Unary Plus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Unary Plus Expression</em>'.
	 * @see org.axdt.as3.model.As3UnaryPlusExpression
	 * @generated
	 */
	EClass getAs3UnaryPlusExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3UnaryMinusExpression <em>As3 Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Unary Minus Expression</em>'.
	 * @see org.axdt.as3.model.As3UnaryMinusExpression
	 * @generated
	 */
	EClass getAs3UnaryMinusExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3BitwiseNotExpression <em>As3 Bitwise Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Bitwise Not Expression</em>'.
	 * @see org.axdt.as3.model.As3BitwiseNotExpression
	 * @generated
	 */
	EClass getAs3BitwiseNotExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3LogicalNotExpression <em>As3 Logical Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Logical Not Expression</em>'.
	 * @see org.axdt.as3.model.As3LogicalNotExpression
	 * @generated
	 */
	EClass getAs3LogicalNotExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PostfixExpression <em>As3 Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Postfix Expression</em>'.
	 * @see org.axdt.as3.model.As3PostfixExpression
	 * @generated
	 */
	EClass getAs3PostfixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3PostfixExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3PostfixExpression#getExpression()
	 * @see #getAs3PostfixExpression()
	 * @generated
	 */
	EReference getAs3PostfixExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PostIncrementExpression <em>As3 Post Increment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Post Increment Expression</em>'.
	 * @see org.axdt.as3.model.As3PostIncrementExpression
	 * @generated
	 */
	EClass getAs3PostIncrementExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PostDecrementExpression <em>As3 Post Decrement Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Post Decrement Expression</em>'.
	 * @see org.axdt.as3.model.As3PostDecrementExpression
	 * @generated
	 */
	EClass getAs3PostDecrementExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3InvocationExpression <em>As3 Invocation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Invocation Expression</em>'.
	 * @see org.axdt.as3.model.As3InvocationExpression
	 * @generated
	 */
	EClass getAs3InvocationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3InvocationExpression#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see org.axdt.as3.model.As3InvocationExpression#getArguments()
	 * @see #getAs3InvocationExpression()
	 * @generated
	 */
	EReference getAs3InvocationExpression_Arguments();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3AccessExpression <em>As3 Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Access Expression</em>'.
	 * @see org.axdt.as3.model.As3AccessExpression
	 * @generated
	 */
	EClass getAs3AccessExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3AccessExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.axdt.as3.model.As3AccessExpression#getOperator()
	 * @see #getAs3AccessExpression()
	 * @generated
	 */
	EReference getAs3AccessExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3QueryExpression <em>As3 Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Query Expression</em>'.
	 * @see org.axdt.as3.model.As3QueryExpression
	 * @generated
	 */
	EClass getAs3QueryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3QueryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.axdt.as3.model.As3QueryExpression#getOperator()
	 * @see #getAs3QueryExpression()
	 * @generated
	 */
	EReference getAs3QueryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PostfixOperator <em>As3 Postfix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Postfix Operator</em>'.
	 * @see org.axdt.as3.model.As3PostfixOperator
	 * @generated
	 */
	EClass getAs3PostfixOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3PostfixOperator#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.axdt.as3.model.As3PostfixOperator#getIdentifier()
	 * @see #getAs3PostfixOperator()
	 * @generated
	 */
	EReference getAs3PostfixOperator_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3PostfixOperator#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see org.axdt.as3.model.As3PostfixOperator#getExpressions()
	 * @see #getAs3PostfixOperator()
	 * @generated
	 */
	EReference getAs3PostfixOperator_Expressions();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PropertyOperator <em>As3 Property Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Property Operator</em>'.
	 * @see org.axdt.as3.model.As3PropertyOperator
	 * @generated
	 */
	EClass getAs3PropertyOperator();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3QueryOperator <em>As3 Query Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Query Operator</em>'.
	 * @see org.axdt.as3.model.As3QueryOperator
	 * @generated
	 */
	EClass getAs3QueryOperator();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3SimpleIdentifier <em>As3 Simple Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Simple Identifier</em>'.
	 * @see org.axdt.as3.model.As3SimpleIdentifier
	 * @generated
	 */
	EClass getAs3SimpleIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3SimpleIdentifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3SimpleIdentifier#getName()
	 * @see #getAs3SimpleIdentifier()
	 * @generated
	 */
	EAttribute getAs3SimpleIdentifier_Name();

	/**
	 * Returns the meta object for the reference '{@link org.axdt.as3.model.As3SimpleIdentifier#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.axdt.as3.model.As3SimpleIdentifier#getReference()
	 * @see #getAs3SimpleIdentifier()
	 * @generated
	 */
	EReference getAs3SimpleIdentifier_Reference();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3PropertyIdentifier <em>As3 Property Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Property Identifier</em>'.
	 * @see org.axdt.as3.model.As3PropertyIdentifier
	 * @generated
	 */
	EClass getAs3PropertyIdentifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3QualifiedIdentifier <em>As3 Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Qualified Identifier</em>'.
	 * @see org.axdt.as3.model.As3QualifiedIdentifier
	 * @generated
	 */
	EClass getAs3QualifiedIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3QualifiedIdentifier#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see org.axdt.as3.model.As3QualifiedIdentifier#getExpressions()
	 * @see #getAs3QualifiedIdentifier()
	 * @generated
	 */
	EReference getAs3QualifiedIdentifier_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3QualifiedIdentifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.axdt.as3.model.As3QualifiedIdentifier#getIdentifier()
	 * @see #getAs3QualifiedIdentifier()
	 * @generated
	 */
	EReference getAs3QualifiedIdentifier_Identifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3AttributeQualifiedIdentifier <em>As3 Attribute Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Attribute Qualified Identifier</em>'.
	 * @see org.axdt.as3.model.As3AttributeQualifiedIdentifier
	 * @generated
	 */
	EClass getAs3AttributeQualifiedIdentifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3NonAttributeQualifiedIdentifier <em>As3 Non Attribute Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Non Attribute Qualified Identifier</em>'.
	 * @see org.axdt.as3.model.As3NonAttributeQualifiedIdentifier
	 * @generated
	 */
	EClass getAs3NonAttributeQualifiedIdentifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3SimpleQualifiedIdentifier <em>As3 Simple Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Simple Qualified Identifier</em>'.
	 * @see org.axdt.as3.model.As3SimpleQualifiedIdentifier
	 * @generated
	 */
	EClass getAs3SimpleQualifiedIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3SimpleQualifiedIdentifier#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see org.axdt.as3.model.As3SimpleQualifiedIdentifier#getQualifier()
	 * @see #getAs3SimpleQualifiedIdentifier()
	 * @generated
	 */
	EReference getAs3SimpleQualifiedIdentifier_Qualifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ExpressionQualifiedIdentifier <em>As3 Expression Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Expression Qualified Identifier</em>'.
	 * @see org.axdt.as3.model.As3ExpressionQualifiedIdentifier
	 * @generated
	 */
	EClass getAs3ExpressionQualifiedIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ExpressionQualifiedIdentifier#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see org.axdt.as3.model.As3ExpressionQualifiedIdentifier#getQualifier()
	 * @see #getAs3ExpressionQualifiedIdentifier()
	 * @generated
	 */
	EReference getAs3ExpressionQualifiedIdentifier_Qualifier();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ThisExpression <em>As3 This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 This Expression</em>'.
	 * @see org.axdt.as3.model.As3ThisExpression
	 * @generated
	 */
	EClass getAs3ThisExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3SuperExpression <em>As3 Super Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Super Expression</em>'.
	 * @see org.axdt.as3.model.As3SuperExpression
	 * @generated
	 */
	EClass getAs3SuperExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ParenListExpression <em>As3 Paren List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Paren List Expression</em>'.
	 * @see org.axdt.as3.model.As3ParenListExpression
	 * @generated
	 */
	EClass getAs3ParenListExpression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3FunctionExpression <em>As3 Function Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Function Expression</em>'.
	 * @see org.axdt.as3.model.As3FunctionExpression
	 * @generated
	 */
	EClass getAs3FunctionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3FunctionExpression#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.axdt.as3.model.As3FunctionExpression#getReturnType()
	 * @see #getAs3FunctionExpression()
	 * @generated
	 */
	EReference getAs3FunctionExpression_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3FunctionExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.axdt.as3.model.As3FunctionExpression#getBody()
	 * @see #getAs3FunctionExpression()
	 * @generated
	 */
	EReference getAs3FunctionExpression_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3FunctionExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3FunctionExpression#getName()
	 * @see #getAs3FunctionExpression()
	 * @generated
	 */
	EAttribute getAs3FunctionExpression_Name();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3NewExpression <em>As3 New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 New Expression</em>'.
	 * @see org.axdt.as3.model.As3NewExpression
	 * @generated
	 */
	EClass getAs3NewExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3NewExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.axdt.as3.model.As3NewExpression#getTarget()
	 * @see #getAs3NewExpression()
	 * @generated
	 */
	EReference getAs3NewExpression_Target();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ArrayInitializer <em>As3 Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Array Initializer</em>'.
	 * @see org.axdt.as3.model.As3ArrayInitializer
	 * @generated
	 */
	EClass getAs3ArrayInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3ArrayInitializer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.axdt.as3.model.As3ArrayInitializer#getElements()
	 * @see #getAs3ArrayInitializer()
	 * @generated
	 */
	EReference getAs3ArrayInitializer_Elements();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ArrayElement <em>As3 Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Array Element</em>'.
	 * @see org.axdt.as3.model.As3ArrayElement
	 * @generated
	 */
	EClass getAs3ArrayElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3ArrayElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3ArrayElement#getExpression()
	 * @see #getAs3ArrayElement()
	 * @generated
	 */
	EReference getAs3ArrayElement_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3ObjectInitializer <em>As3 Object Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Object Initializer</em>'.
	 * @see org.axdt.as3.model.As3ObjectInitializer
	 * @generated
	 */
	EClass getAs3ObjectInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.axdt.as3.model.As3ObjectInitializer#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.axdt.as3.model.As3ObjectInitializer#getFields()
	 * @see #getAs3ObjectInitializer()
	 * @generated
	 */
	EReference getAs3ObjectInitializer_Fields();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3LiteralField <em>As3 Literal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Literal Field</em>'.
	 * @see org.axdt.as3.model.As3LiteralField
	 * @generated
	 */
	EClass getAs3LiteralField();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3LiteralField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.axdt.as3.model.As3LiteralField#getName()
	 * @see #getAs3LiteralField()
	 * @generated
	 */
	EReference getAs3LiteralField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.axdt.as3.model.As3LiteralField#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.axdt.as3.model.As3LiteralField#getExpression()
	 * @see #getAs3LiteralField()
	 * @generated
	 */
	EReference getAs3LiteralField_Expression();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3XmlInitializer <em>As3 Xml Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Xml Initializer</em>'.
	 * @see org.axdt.as3.model.As3XmlInitializer
	 * @generated
	 */
	EClass getAs3XmlInitializer();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3XmlInitializer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.axdt.as3.model.As3XmlInitializer#getValue()
	 * @see #getAs3XmlInitializer()
	 * @generated
	 */
	EAttribute getAs3XmlInitializer_Value();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3NullLiteral <em>As3 Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Null Literal</em>'.
	 * @see org.axdt.as3.model.As3NullLiteral
	 * @generated
	 */
	EClass getAs3NullLiteral();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3BooleanLiteral <em>As3 Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Boolean Literal</em>'.
	 * @see org.axdt.as3.model.As3BooleanLiteral
	 * @generated
	 */
	EClass getAs3BooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.axdt.as3.model.As3BooleanLiteral#isValue()
	 * @see #getAs3BooleanLiteral()
	 * @generated
	 */
	EAttribute getAs3BooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3NumberLiteral <em>As3 Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Number Literal</em>'.
	 * @see org.axdt.as3.model.As3NumberLiteral
	 * @generated
	 */
	EClass getAs3NumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3NumberLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.axdt.as3.model.As3NumberLiteral#getValue()
	 * @see #getAs3NumberLiteral()
	 * @generated
	 */
	EAttribute getAs3NumberLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3StringLiteral <em>As3 String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 String Literal</em>'.
	 * @see org.axdt.as3.model.As3StringLiteral
	 * @generated
	 */
	EClass getAs3StringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.axdt.as3.model.As3StringLiteral#getValue()
	 * @see #getAs3StringLiteral()
	 * @generated
	 */
	EAttribute getAs3StringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.axdt.as3.model.As3RegexLiteral <em>As3 Regex Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As3 Regex Literal</em>'.
	 * @see org.axdt.as3.model.As3RegexLiteral
	 * @generated
	 */
	EClass getAs3RegexLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.axdt.as3.model.As3RegexLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.axdt.as3.model.As3RegexLiteral#getValue()
	 * @see #getAs3RegexLiteral()
	 * @generated
	 */
	EAttribute getAs3RegexLiteral_Value();

	/**
	 * Returns the meta object for data type '{@link java.lang.Iterable <em>Iterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Iterable</em>'.
	 * @see java.lang.Iterable
	 * @generated
	 */
	EDataType getIterable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	As3EFactory getAs3EFactory();

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
		 * The meta object literal for the '{@link org.axdt.as3.model.IDirective <em>IDirective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IDirective
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIDirective()
		 * @generated
		 */
		EClass IDIRECTIVE = eINSTANCE.getIDirective();

		/**
		 * The meta object literal for the '<em><b>Vsemi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDIRECTIVE__VSEMI = eINSTANCE.getIDirective_Vsemi();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IStatement <em>IStatement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IStatement
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIStatement()
		 * @generated
		 */
		EClass ISTATEMENT = eINSTANCE.getIStatement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.IExpressionImpl <em>IExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.IExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIExpression()
		 * @generated
		 */
		EClass IEXPRESSION = eINSTANCE.getIExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IAssignmentExpression <em>IAssignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IAssignmentExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIAssignmentExpression()
		 * @generated
		 */
		EClass IASSIGNMENT_EXPRESSION = eINSTANCE.getIAssignmentExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IConditionalExpression <em>IConditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IConditionalExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIConditionalExpression()
		 * @generated
		 */
		EClass ICONDITIONAL_EXPRESSION = eINSTANCE.getIConditionalExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.ILogicalExpression <em>ILogical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.ILogicalExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getILogicalExpression()
		 * @generated
		 */
		EClass ILOGICAL_EXPRESSION = eINSTANCE.getILogicalExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IBitwiseExpression <em>IBitwise Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IBitwiseExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIBitwiseExpression()
		 * @generated
		 */
		EClass IBITWISE_EXPRESSION = eINSTANCE.getIBitwiseExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IEqualityExpression <em>IEquality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IEqualityExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIEqualityExpression()
		 * @generated
		 */
		EClass IEQUALITY_EXPRESSION = eINSTANCE.getIEqualityExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IRelationalExpression <em>IRelational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IRelationalExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIRelationalExpression()
		 * @generated
		 */
		EClass IRELATIONAL_EXPRESSION = eINSTANCE.getIRelationalExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IArithmeticExpression <em>IArithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IArithmeticExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIArithmeticExpression()
		 * @generated
		 */
		EClass IARITHMETIC_EXPRESSION = eINSTANCE.getIArithmeticExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IUnaryExpression <em>IUnary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IUnaryExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIUnaryExpression()
		 * @generated
		 */
		EClass IUNARY_EXPRESSION = eINSTANCE.getIUnaryExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IPostfixExpression <em>IPostfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IPostfixExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIPostfixExpression()
		 * @generated
		 */
		EClass IPOSTFIX_EXPRESSION = eINSTANCE.getIPostfixExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IPrimaryExpression <em>IPrimary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IPrimaryExpression
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIPrimaryExpression()
		 * @generated
		 */
		EClass IPRIMARY_EXPRESSION = eINSTANCE.getIPrimaryExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IIdentifier <em>IIdentifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IIdentifier
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIIdentifier()
		 * @generated
		 */
		EClass IIDENTIFIER = eINSTANCE.getIIdentifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.ILiteral <em>ILiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.ILiteral
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getILiteral()
		 * @generated
		 */
		EClass ILITERAL = eINSTANCE.getILiteral();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.ILiteralFieldName <em>ILiteral Field Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.ILiteralFieldName
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getILiteralFieldName()
		 * @generated
		 */
		EClass ILITERAL_FIELD_NAME = eINSTANCE.getILiteralFieldName();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.ICaseElement <em>ICase Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.ICaseElement
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getICaseElement()
		 * @generated
		 */
		EClass ICASE_ELEMENT = eINSTANCE.getICaseElement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.INonAttributeIdentifier <em>INon Attribute Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.INonAttributeIdentifier
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getINonAttributeIdentifier()
		 * @generated
		 */
		EClass INON_ATTRIBUTE_IDENTIFIER = eINSTANCE.getINonAttributeIdentifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.IAttribute <em>IAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.IAttribute
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIAttribute()
		 * @generated
		 */
		EClass IATTRIBUTE = eINSTANCE.getIAttribute();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.IForInitImpl <em>IFor Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.IForInitImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIForInit()
		 * @generated
		 */
		EClass IFOR_INIT = eINSTANCE.getIForInit();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.IForInInitImpl <em>IFor In Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.IForInInitImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIForInInit()
		 * @generated
		 */
		EClass IFOR_IN_INIT = eINSTANCE.getIForInInit();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ElementImpl <em>As3 Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ElementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Element()
		 * @generated
		 */
		EClass AS3_ELEMENT = eINSTANCE.getAs3Element();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3IdentifiableImpl <em>As3 Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3IdentifiableImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Identifiable()
		 * @generated
		 */
		EClass AS3_IDENTIFIABLE = eINSTANCE.getAs3Identifiable();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3DefinitionImpl <em>As3 Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3DefinitionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Definition()
		 * @generated
		 */
		EClass AS3_DEFINITION = eINSTANCE.getAs3Definition();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_DEFINITION__METADATA = eINSTANCE.getAs3Definition_Metadata();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_DEFINITION__VISIBILITY = eINSTANCE.getAs3Definition_Visibility();

		/**
		 * The meta object literal for the '<em><b>Custom Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_DEFINITION__CUSTOM_VISIBILITY = eINSTANCE.getAs3Definition_CustomVisibility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_DEFINITION__NAME = eINSTANCE.getAs3Definition_Name();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3MemberImpl <em>As3 Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3MemberImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Member()
		 * @generated
		 */
		EClass AS3_MEMBER = eINSTANCE.getAs3Member();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_MEMBER__STATIC = eINSTANCE.getAs3Member_Static();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.As3Executable <em>As3 Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.As3Executable
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Executable()
		 * @generated
		 */
		EClass AS3_EXECUTABLE = eINSTANCE.getAs3Executable();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_EXECUTABLE__PARAMETERS = eINSTANCE.getAs3Executable_Parameters();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ParameterImpl <em>As3 Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ParameterImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Parameter()
		 * @generated
		 */
		EClass AS3_PARAMETER = eINSTANCE.getAs3Parameter();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ParameterAssignImpl <em>As3 Parameter Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ParameterAssignImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ParameterAssign()
		 * @generated
		 */
		EClass AS3_PARAMETER_ASSIGN = eINSTANCE.getAs3ParameterAssign();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_PARAMETER_ASSIGN__EXPRESSION = eINSTANCE.getAs3ParameterAssign_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ParameterRestImpl <em>As3 Parameter Rest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ParameterRestImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ParameterRest()
		 * @generated
		 */
		EClass AS3_PARAMETER_REST = eINSTANCE.getAs3ParameterRest();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3FieldBindingImpl <em>As3 Field Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3FieldBindingImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3FieldBinding()
		 * @generated
		 */
		EClass AS3_FIELD_BINDING = eINSTANCE.getAs3FieldBinding();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FIELD_BINDING__TYPE = eINSTANCE.getAs3FieldBinding_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FIELD_BINDING__EXPRESSION = eINSTANCE.getAs3FieldBinding_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3FieldDefinitionImpl <em>As3 Field Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3FieldDefinitionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3FieldDefinition()
		 * @generated
		 */
		EClass AS3_FIELD_DEFINITION = eINSTANCE.getAs3FieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_FIELD_DEFINITION__VISIBILITY = eINSTANCE.getAs3FieldDefinition_Visibility();

		/**
		 * The meta object literal for the '<em><b>Custom Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FIELD_DEFINITION__CUSTOM_VISIBILITY = eINSTANCE.getAs3FieldDefinition_CustomVisibility();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_FIELD_DEFINITION__STATIC = eINSTANCE.getAs3FieldDefinition_Static();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_FIELD_DEFINITION__CONSTANT = eINSTANCE.getAs3FieldDefinition_Constant();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FIELD_DEFINITION__BINDINGS = eINSTANCE.getAs3FieldDefinition_Bindings();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FIELD_DEFINITION__METADATA = eINSTANCE.getAs3FieldDefinition_Metadata();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ProgramImpl <em>As3 Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ProgramImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Program()
		 * @generated
		 */
		EClass AS3_PROGRAM = eINSTANCE.getAs3Program();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_PROGRAM__PACKAGE = eINSTANCE.getAs3Program_Package();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_PROGRAM__DIRECTIVES = eINSTANCE.getAs3Program_Directives();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ImportImpl <em>As3 Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ImportImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Import()
		 * @generated
		 */
		EClass AS3_IMPORT = eINSTANCE.getAs3Import();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_IMPORT__QUALIFIED_NAME = eINSTANCE.getAs3Import_QualifiedName();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ImportListImpl <em>As3 Import List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ImportListImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ImportList()
		 * @generated
		 */
		EClass AS3_IMPORT_LIST = eINSTANCE.getAs3ImportList();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_IMPORT_LIST__IMPORTS = eINSTANCE.getAs3ImportList_Imports();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3IncludeImpl <em>As3 Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3IncludeImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Include()
		 * @generated
		 */
		EClass AS3_INCLUDE = eINSTANCE.getAs3Include();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_INCLUDE__TARGET = eINSTANCE.getAs3Include_Target();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3UseImpl <em>As3 Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3UseImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Use()
		 * @generated
		 */
		EClass AS3_USE = eINSTANCE.getAs3Use();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_USE__TARGET = eINSTANCE.getAs3Use_Target();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PackageImpl <em>As3 Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PackageImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Package()
		 * @generated
		 */
		EClass AS3_PACKAGE = eINSTANCE.getAs3Package();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_PACKAGE__DIRECTIVES = eINSTANCE.getAs3Package_Directives();

		/**
		 * The meta object literal for the '<em><b>Canonical Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_PACKAGE__CANONICAL_NAME = eINSTANCE.getAs3Package_CanonicalName();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3TypeImpl <em>As3 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3TypeImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Type()
		 * @generated
		 */
		EClass AS3_TYPE = eINSTANCE.getAs3Type();

		/**
		 * The meta object literal for the '<em><b>Extended Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_TYPE__EXTENDED_INTERFACES = eINSTANCE.getAs3Type_ExtendedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_TYPE__DIRECTIVES = eINSTANCE.getAs3Type_Directives();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ClassImpl <em>As3 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ClassImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Class()
		 * @generated
		 */
		EClass AS3_CLASS = eINSTANCE.getAs3Class();

		/**
		 * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_CLASS__DYNAMIC = eINSTANCE.getAs3Class_Dynamic();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_CLASS__FINAL = eINSTANCE.getAs3Class_Final();

		/**
		 * The meta object literal for the '<em><b>Extended Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CLASS__EXTENDED_CLASS = eINSTANCE.getAs3Class_ExtendedClass();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3InterfaceImpl <em>As3 Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3InterfaceImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Interface()
		 * @generated
		 */
		EClass AS3_INTERFACE = eINSTANCE.getAs3Interface();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3NamespaceImpl <em>As3 Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3NamespaceImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Namespace()
		 * @generated
		 */
		EClass AS3_NAMESPACE = eINSTANCE.getAs3Namespace();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_NAMESPACE__EXPRESSION = eINSTANCE.getAs3Namespace_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3VariableImpl <em>As3 Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3VariableImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Variable()
		 * @generated
		 */
		EClass AS3_VARIABLE = eINSTANCE.getAs3Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_VARIABLE__TYPE = eINSTANCE.getAs3Variable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_VARIABLE__NAME = eINSTANCE.getAs3Variable_Name();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3VariableAssignImpl <em>As3 Variable Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3VariableAssignImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3VariableAssign()
		 * @generated
		 */
		EClass AS3_VARIABLE_ASSIGN = eINSTANCE.getAs3VariableAssign();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_VARIABLE_ASSIGN__EXPRESSION = eINSTANCE.getAs3VariableAssign_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3VariableDefinitionImpl <em>As3 Variable Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3VariableDefinitionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3VariableDefinition()
		 * @generated
		 */
		EClass AS3_VARIABLE_DEFINITION = eINSTANCE.getAs3VariableDefinition();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_VARIABLE_DEFINITION__CONSTANT = eINSTANCE.getAs3VariableDefinition_Constant();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_VARIABLE_DEFINITION__BINDINGS = eINSTANCE.getAs3VariableDefinition_Bindings();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3OperationImpl <em>As3 Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3OperationImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Operation()
		 * @generated
		 */
		EClass AS3_OPERATION = eINSTANCE.getAs3Operation();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_OPERATION__RETURN_TYPE = eINSTANCE.getAs3Operation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_OPERATION__BODY = eINSTANCE.getAs3Operation_Body();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_OPERATION__NATIVE = eINSTANCE.getAs3Operation_Native();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_OPERATION__OVERRIDE = eINSTANCE.getAs3Operation_Override();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_OPERATION__FINAL = eINSTANCE.getAs3Operation_Final();

		/**
		 * The meta object literal for the '<em><b>Getter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_OPERATION__GETTER = eINSTANCE.getAs3Operation_Getter();

		/**
		 * The meta object literal for the '<em><b>Setter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_OPERATION__SETTER = eINSTANCE.getAs3Operation_Setter();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ConstructorImpl <em>As3 Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ConstructorImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Constructor()
		 * @generated
		 */
		EClass AS3_CONSTRUCTOR = eINSTANCE.getAs3Constructor();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CONSTRUCTOR__BODY = eINSTANCE.getAs3Constructor_Body();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3MetadataTagImpl <em>As3 Metadata Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3MetadataTagImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3MetadataTag()
		 * @generated
		 */
		EClass AS3_METADATA_TAG = eINSTANCE.getAs3MetadataTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_METADATA_TAG__NAME = eINSTANCE.getAs3MetadataTag_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_METADATA_TAG__PARAMETERS = eINSTANCE.getAs3MetadataTag_Parameters();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3MetadataParameterImpl <em>As3 Metadata Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3MetadataParameterImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3MetadataParameter()
		 * @generated
		 */
		EClass AS3_METADATA_PARAMETER = eINSTANCE.getAs3MetadataParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_METADATA_PARAMETER__NAME = eINSTANCE.getAs3MetadataParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_METADATA_PARAMETER__VALUE = eINSTANCE.getAs3MetadataParameter_Value();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3AttributeExpressionImpl <em>As3 Attribute Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3AttributeExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AttributeExpression()
		 * @generated
		 */
		EClass AS3_ATTRIBUTE_EXPRESSION = eINSTANCE.getAs3AttributeExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3SimpleAttributeExpressionImpl <em>As3 Simple Attribute Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3SimpleAttributeExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SimpleAttributeExpression()
		 * @generated
		 */
		EClass AS3_SIMPLE_ATTRIBUTE_EXPRESSION = eINSTANCE.getAs3SimpleAttributeExpression();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT = eINSTANCE.getAs3SimpleAttributeExpression_Ident();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3QualifiedAttributeExpressionImpl <em>As3 Qualified Attribute Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3QualifiedAttributeExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QualifiedAttributeExpression()
		 * @generated
		 */
		EClass AS3_QUALIFIED_ATTRIBUTE_EXPRESSION = eINSTANCE.getAs3QualifiedAttributeExpression();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_QUALIFIED_ATTRIBUTE_EXPRESSION__QUALIFIER = eINSTANCE.getAs3QualifiedAttributeExpression_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_QUALIFIED_ATTRIBUTE_EXPRESSION__IDENTIFIER = eINSTANCE.getAs3QualifiedAttributeExpression_Identifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3DefaultXmlNamespaceStatementImpl <em>As3 Default Xml Namespace Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3DefaultXmlNamespaceStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DefaultXmlNamespaceStatement()
		 * @generated
		 */
		EClass AS3_DEFAULT_XML_NAMESPACE_STATEMENT = eINSTANCE.getAs3DefaultXmlNamespaceStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_DEFAULT_XML_NAMESPACE_STATEMENT__EXPRESSION = eINSTANCE.getAs3DefaultXmlNamespaceStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3TryStatementImpl <em>As3 Try Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3TryStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3TryStatement()
		 * @generated
		 */
		EClass AS3_TRY_STATEMENT = eINSTANCE.getAs3TryStatement();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_TRY_STATEMENT__BLOCK = eINSTANCE.getAs3TryStatement_Block();

		/**
		 * The meta object literal for the '<em><b>Catches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_TRY_STATEMENT__CATCHES = eINSTANCE.getAs3TryStatement_Catches();

		/**
		 * The meta object literal for the '<em><b>Final Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_TRY_STATEMENT__FINAL_BLOCK = eINSTANCE.getAs3TryStatement_FinalBlock();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3CatchClauseImpl <em>As3 Catch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3CatchClauseImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3CatchClause()
		 * @generated
		 */
		EClass AS3_CATCH_CLAUSE = eINSTANCE.getAs3CatchClause();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CATCH_CLAUSE__ERROR = eINSTANCE.getAs3CatchClause_Error();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CATCH_CLAUSE__BLOCK = eINSTANCE.getAs3CatchClause_Block();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ThrowStatementImpl <em>As3 Throw Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ThrowStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ThrowStatement()
		 * @generated
		 */
		EClass AS3_THROW_STATEMENT = eINSTANCE.getAs3ThrowStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_THROW_STATEMENT__EXPRESSION = eINSTANCE.getAs3ThrowStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ReturnStatementImpl <em>As3 Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ReturnStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ReturnStatement()
		 * @generated
		 */
		EClass AS3_RETURN_STATEMENT = eINSTANCE.getAs3ReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_RETURN_STATEMENT__EXPRESSION = eINSTANCE.getAs3ReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3WithStatementImpl <em>As3 With Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3WithStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3WithStatement()
		 * @generated
		 */
		EClass AS3_WITH_STATEMENT = eINSTANCE.getAs3WithStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_WITH_STATEMENT__TARGET = eINSTANCE.getAs3WithStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_WITH_STATEMENT__STATEMENT = eINSTANCE.getAs3WithStatement_Statement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3BreakStatementImpl <em>As3 Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3BreakStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BreakStatement()
		 * @generated
		 */
		EClass AS3_BREAK_STATEMENT = eINSTANCE.getAs3BreakStatement();

		/**
		 * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_BREAK_STATEMENT__LABEL_NAME = eINSTANCE.getAs3BreakStatement_LabelName();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_BREAK_STATEMENT__LABEL = eINSTANCE.getAs3BreakStatement_Label();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ContinueStatementImpl <em>As3 Continue Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ContinueStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ContinueStatement()
		 * @generated
		 */
		EClass AS3_CONTINUE_STATEMENT = eINSTANCE.getAs3ContinueStatement();

		/**
		 * The meta object literal for the '<em><b>Label Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_CONTINUE_STATEMENT__LABEL_NAME = eINSTANCE.getAs3ContinueStatement_LabelName();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CONTINUE_STATEMENT__LABEL = eINSTANCE.getAs3ContinueStatement_Label();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3IterationStatementImpl <em>As3 Iteration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3IterationStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3IterationStatement()
		 * @generated
		 */
		EClass AS3_ITERATION_STATEMENT = eINSTANCE.getAs3IterationStatement();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_ITERATION_STATEMENT__STATEMENT = eINSTANCE.getAs3IterationStatement_Statement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ConditionalIterationStatementImpl <em>As3 Conditional Iteration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ConditionalIterationStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ConditionalIterationStatement()
		 * @generated
		 */
		EClass AS3_CONDITIONAL_ITERATION_STATEMENT = eINSTANCE.getAs3ConditionalIterationStatement();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CONDITIONAL_ITERATION_STATEMENT__CONDITIONS = eINSTANCE.getAs3ConditionalIterationStatement_Conditions();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3DoStatementImpl <em>As3 Do Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3DoStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DoStatement()
		 * @generated
		 */
		EClass AS3_DO_STATEMENT = eINSTANCE.getAs3DoStatement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3WhileStatementImpl <em>As3 While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3WhileStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3WhileStatement()
		 * @generated
		 */
		EClass AS3_WHILE_STATEMENT = eINSTANCE.getAs3WhileStatement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ForStatementImpl <em>As3 For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ForStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ForStatement()
		 * @generated
		 */
		EClass AS3_FOR_STATEMENT = eINSTANCE.getAs3ForStatement();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FOR_STATEMENT__INIT = eINSTANCE.getAs3ForStatement_Init();

		/**
		 * The meta object literal for the '<em><b>Iter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FOR_STATEMENT__ITER = eINSTANCE.getAs3ForStatement_Iter();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ForInStatementImpl <em>As3 For In Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ForInStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ForInStatement()
		 * @generated
		 */
		EClass AS3_FOR_IN_STATEMENT = eINSTANCE.getAs3ForInStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FOR_IN_STATEMENT__TARGET = eINSTANCE.getAs3ForInStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FOR_IN_STATEMENT__INIT = eINSTANCE.getAs3ForInStatement_Init();

		/**
		 * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_FOR_IN_STATEMENT__FOR_EACH = eINSTANCE.getAs3ForInStatement_ForEach();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ConditionalStatementImpl <em>As3 Conditional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ConditionalStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ConditionalStatement()
		 * @generated
		 */
		EClass AS3_CONDITIONAL_STATEMENT = eINSTANCE.getAs3ConditionalStatement();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CONDITIONAL_STATEMENT__CONDITIONS = eINSTANCE.getAs3ConditionalStatement_Conditions();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3SwitchStatementImpl <em>As3 Switch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3SwitchStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SwitchStatement()
		 * @generated
		 */
		EClass AS3_SWITCH_STATEMENT = eINSTANCE.getAs3SwitchStatement();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_SWITCH_STATEMENT__CASES = eINSTANCE.getAs3SwitchStatement_Cases();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3CaseLabelImpl <em>As3 Case Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3CaseLabelImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3CaseLabel()
		 * @generated
		 */
		EClass AS3_CASE_LABEL = eINSTANCE.getAs3CaseLabel();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3DefaultCaseImpl <em>As3 Default Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3DefaultCaseImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DefaultCase()
		 * @generated
		 */
		EClass AS3_DEFAULT_CASE = eINSTANCE.getAs3DefaultCase();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ExpressionCaseImpl <em>As3 Expression Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ExpressionCaseImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionCase()
		 * @generated
		 */
		EClass AS3_EXPRESSION_CASE = eINSTANCE.getAs3ExpressionCase();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_EXPRESSION_CASE__EXPRESSIONS = eINSTANCE.getAs3ExpressionCase_Expressions();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3IfStatementImpl <em>As3 If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3IfStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3IfStatement()
		 * @generated
		 */
		EClass AS3_IF_STATEMENT = eINSTANCE.getAs3IfStatement();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_IF_STATEMENT__STATEMENT = eINSTANCE.getAs3IfStatement_Statement();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getAs3IfStatement_ElseStatement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3LabeledStatementImpl <em>As3 Labeled Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3LabeledStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LabeledStatement()
		 * @generated
		 */
		EClass AS3_LABELED_STATEMENT = eINSTANCE.getAs3LabeledStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_LABELED_STATEMENT__NAME = eINSTANCE.getAs3LabeledStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_LABELED_STATEMENT__STATEMENT = eINSTANCE.getAs3LabeledStatement_Statement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3BlockImpl <em>As3 Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3BlockImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Block()
		 * @generated
		 */
		EClass AS3_BLOCK = eINSTANCE.getAs3Block();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_BLOCK__DIRECTIVES = eINSTANCE.getAs3Block_Directives();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3SuperStatementImpl <em>As3 Super Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3SuperStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SuperStatement()
		 * @generated
		 */
		EClass AS3_SUPER_STATEMENT = eINSTANCE.getAs3SuperStatement();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_SUPER_STATEMENT__ARGUMENTS = eINSTANCE.getAs3SuperStatement_Arguments();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ExpressionStatementImpl <em>As3 Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ExpressionStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionStatement()
		 * @generated
		 */
		EClass AS3_EXPRESSION_STATEMENT = eINSTANCE.getAs3ExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_EXPRESSION_STATEMENT__EXPRESSIONS = eINSTANCE.getAs3ExpressionStatement_Expressions();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3EmptyStatementImpl <em>As3 Empty Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3EmptyStatementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3EmptyStatement()
		 * @generated
		 */
		EClass AS3_EMPTY_STATEMENT = eINSTANCE.getAs3EmptyStatement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ExpressionListImpl <em>As3 Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ExpressionListImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionList()
		 * @generated
		 */
		EClass AS3_EXPRESSION_LIST = eINSTANCE.getAs3ExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getAs3ExpressionList_Expressions();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ListExpressionImpl <em>As3 List Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ListExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ListExpression()
		 * @generated
		 */
		EClass AS3_LIST_EXPRESSION = eINSTANCE.getAs3ListExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ArgumentsImpl <em>As3 Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ArgumentsImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3Arguments()
		 * @generated
		 */
		EClass AS3_ARGUMENTS = eINSTANCE.getAs3Arguments();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3AssignmentExpressionImpl <em>As3 Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3AssignmentExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AssignmentExpression()
		 * @generated
		 */
		EClass AS3_ASSIGNMENT_EXPRESSION = eINSTANCE.getAs3AssignmentExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ConditionalExpressionImpl <em>As3 Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ConditionalExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ConditionalExpression()
		 * @generated
		 */
		EClass AS3_CONDITIONAL_EXPRESSION = eINSTANCE.getAs3ConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CONDITIONAL_EXPRESSION__CONDITION = eINSTANCE.getAs3ConditionalExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CONDITIONAL_EXPRESSION__STATEMENT = eINSTANCE.getAs3ConditionalExpression_Statement();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT = eINSTANCE.getAs3ConditionalExpression_ElseStatement();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3BinaryExpressionImpl <em>As3 Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3BinaryExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BinaryExpression()
		 * @generated
		 */
		EClass AS3_BINARY_EXPRESSION = eINSTANCE.getAs3BinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_BINARY_EXPRESSION__LEFT = eINSTANCE.getAs3BinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_BINARY_EXPRESSION__OPERATION = eINSTANCE.getAs3BinaryExpression_Operation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_BINARY_EXPRESSION__RIGHT = eINSTANCE.getAs3BinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3LogicalExpressionImpl <em>As3 Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3LogicalExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LogicalExpression()
		 * @generated
		 */
		EClass AS3_LOGICAL_EXPRESSION = eINSTANCE.getAs3LogicalExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3BitwiseExpressionImpl <em>As3 Bitwise Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3BitwiseExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BitwiseExpression()
		 * @generated
		 */
		EClass AS3_BITWISE_EXPRESSION = eINSTANCE.getAs3BitwiseExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3EqualityExpressionImpl <em>As3 Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3EqualityExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3EqualityExpression()
		 * @generated
		 */
		EClass AS3_EQUALITY_EXPRESSION = eINSTANCE.getAs3EqualityExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3RelationalExpressionImpl <em>As3 Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3RelationalExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3RelationalExpression()
		 * @generated
		 */
		EClass AS3_RELATIONAL_EXPRESSION = eINSTANCE.getAs3RelationalExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ShiftExpressionImpl <em>As3 Shift Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ShiftExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ShiftExpression()
		 * @generated
		 */
		EClass AS3_SHIFT_EXPRESSION = eINSTANCE.getAs3ShiftExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3AdditiveExpressionImpl <em>As3 Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3AdditiveExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AdditiveExpression()
		 * @generated
		 */
		EClass AS3_ADDITIVE_EXPRESSION = eINSTANCE.getAs3AdditiveExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3MultiplicativeExpressionImpl <em>As3 Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3MultiplicativeExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3MultiplicativeExpression()
		 * @generated
		 */
		EClass AS3_MULTIPLICATIVE_EXPRESSION = eINSTANCE.getAs3MultiplicativeExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3UnaryExpressionImpl <em>As3 Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3UnaryExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3UnaryExpression()
		 * @generated
		 */
		EClass AS3_UNARY_EXPRESSION = eINSTANCE.getAs3UnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getAs3UnaryExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3DeleteExpressionImpl <em>As3 Delete Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3DeleteExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3DeleteExpression()
		 * @generated
		 */
		EClass AS3_DELETE_EXPRESSION = eINSTANCE.getAs3DeleteExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3VoidExpressionImpl <em>As3 Void Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3VoidExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3VoidExpression()
		 * @generated
		 */
		EClass AS3_VOID_EXPRESSION = eINSTANCE.getAs3VoidExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3TypeOfExpressionImpl <em>As3 Type Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3TypeOfExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3TypeOfExpression()
		 * @generated
		 */
		EClass AS3_TYPE_OF_EXPRESSION = eINSTANCE.getAs3TypeOfExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PreIncrementExpressionImpl <em>As3 Pre Increment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PreIncrementExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PreIncrementExpression()
		 * @generated
		 */
		EClass AS3_PRE_INCREMENT_EXPRESSION = eINSTANCE.getAs3PreIncrementExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PreDecrementExpressionImpl <em>As3 Pre Decrement Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PreDecrementExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PreDecrementExpression()
		 * @generated
		 */
		EClass AS3_PRE_DECREMENT_EXPRESSION = eINSTANCE.getAs3PreDecrementExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3UnaryPlusExpressionImpl <em>As3 Unary Plus Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3UnaryPlusExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3UnaryPlusExpression()
		 * @generated
		 */
		EClass AS3_UNARY_PLUS_EXPRESSION = eINSTANCE.getAs3UnaryPlusExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3UnaryMinusExpressionImpl <em>As3 Unary Minus Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3UnaryMinusExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3UnaryMinusExpression()
		 * @generated
		 */
		EClass AS3_UNARY_MINUS_EXPRESSION = eINSTANCE.getAs3UnaryMinusExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3BitwiseNotExpressionImpl <em>As3 Bitwise Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3BitwiseNotExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BitwiseNotExpression()
		 * @generated
		 */
		EClass AS3_BITWISE_NOT_EXPRESSION = eINSTANCE.getAs3BitwiseNotExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3LogicalNotExpressionImpl <em>As3 Logical Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3LogicalNotExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LogicalNotExpression()
		 * @generated
		 */
		EClass AS3_LOGICAL_NOT_EXPRESSION = eINSTANCE.getAs3LogicalNotExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PostfixExpressionImpl <em>As3 Postfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PostfixExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostfixExpression()
		 * @generated
		 */
		EClass AS3_POSTFIX_EXPRESSION = eINSTANCE.getAs3PostfixExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_POSTFIX_EXPRESSION__EXPRESSION = eINSTANCE.getAs3PostfixExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PostIncrementExpressionImpl <em>As3 Post Increment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PostIncrementExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostIncrementExpression()
		 * @generated
		 */
		EClass AS3_POST_INCREMENT_EXPRESSION = eINSTANCE.getAs3PostIncrementExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PostDecrementExpressionImpl <em>As3 Post Decrement Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PostDecrementExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostDecrementExpression()
		 * @generated
		 */
		EClass AS3_POST_DECREMENT_EXPRESSION = eINSTANCE.getAs3PostDecrementExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3InvocationExpressionImpl <em>As3 Invocation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3InvocationExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3InvocationExpression()
		 * @generated
		 */
		EClass AS3_INVOCATION_EXPRESSION = eINSTANCE.getAs3InvocationExpression();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_INVOCATION_EXPRESSION__ARGUMENTS = eINSTANCE.getAs3InvocationExpression_Arguments();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3AccessExpressionImpl <em>As3 Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3AccessExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AccessExpression()
		 * @generated
		 */
		EClass AS3_ACCESS_EXPRESSION = eINSTANCE.getAs3AccessExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_ACCESS_EXPRESSION__OPERATOR = eINSTANCE.getAs3AccessExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3QueryExpressionImpl <em>As3 Query Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3QueryExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QueryExpression()
		 * @generated
		 */
		EClass AS3_QUERY_EXPRESSION = eINSTANCE.getAs3QueryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_QUERY_EXPRESSION__OPERATOR = eINSTANCE.getAs3QueryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PostfixOperatorImpl <em>As3 Postfix Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PostfixOperatorImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PostfixOperator()
		 * @generated
		 */
		EClass AS3_POSTFIX_OPERATOR = eINSTANCE.getAs3PostfixOperator();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_POSTFIX_OPERATOR__IDENTIFIER = eINSTANCE.getAs3PostfixOperator_Identifier();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_POSTFIX_OPERATOR__EXPRESSIONS = eINSTANCE.getAs3PostfixOperator_Expressions();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PropertyOperatorImpl <em>As3 Property Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PropertyOperatorImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PropertyOperator()
		 * @generated
		 */
		EClass AS3_PROPERTY_OPERATOR = eINSTANCE.getAs3PropertyOperator();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3QueryOperatorImpl <em>As3 Query Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3QueryOperatorImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QueryOperator()
		 * @generated
		 */
		EClass AS3_QUERY_OPERATOR = eINSTANCE.getAs3QueryOperator();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3SimpleIdentifierImpl <em>As3 Simple Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3SimpleIdentifierImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SimpleIdentifier()
		 * @generated
		 */
		EClass AS3_SIMPLE_IDENTIFIER = eINSTANCE.getAs3SimpleIdentifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_SIMPLE_IDENTIFIER__NAME = eINSTANCE.getAs3SimpleIdentifier_Name();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_SIMPLE_IDENTIFIER__REFERENCE = eINSTANCE.getAs3SimpleIdentifier_Reference();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3PropertyIdentifierImpl <em>As3 Property Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3PropertyIdentifierImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3PropertyIdentifier()
		 * @generated
		 */
		EClass AS3_PROPERTY_IDENTIFIER = eINSTANCE.getAs3PropertyIdentifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3QualifiedIdentifierImpl <em>As3 Qualified Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3QualifiedIdentifierImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3QualifiedIdentifier()
		 * @generated
		 */
		EClass AS3_QUALIFIED_IDENTIFIER = eINSTANCE.getAs3QualifiedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_QUALIFIED_IDENTIFIER__EXPRESSIONS = eINSTANCE.getAs3QualifiedIdentifier_Expressions();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_QUALIFIED_IDENTIFIER__IDENTIFIER = eINSTANCE.getAs3QualifiedIdentifier_Identifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3AttributeQualifiedIdentifierImpl <em>As3 Attribute Qualified Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3AttributeQualifiedIdentifierImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3AttributeQualifiedIdentifier()
		 * @generated
		 */
		EClass AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER = eINSTANCE.getAs3AttributeQualifiedIdentifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3NonAttributeQualifiedIdentifierImpl <em>As3 Non Attribute Qualified Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3NonAttributeQualifiedIdentifierImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NonAttributeQualifiedIdentifier()
		 * @generated
		 */
		EClass AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER = eINSTANCE.getAs3NonAttributeQualifiedIdentifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3SimpleQualifiedIdentifierImpl <em>As3 Simple Qualified Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3SimpleQualifiedIdentifierImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SimpleQualifiedIdentifier()
		 * @generated
		 */
		EClass AS3_SIMPLE_QUALIFIED_IDENTIFIER = eINSTANCE.getAs3SimpleQualifiedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_SIMPLE_QUALIFIED_IDENTIFIER__QUALIFIER = eINSTANCE.getAs3SimpleQualifiedIdentifier_Qualifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ExpressionQualifiedIdentifierImpl <em>As3 Expression Qualified Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ExpressionQualifiedIdentifierImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ExpressionQualifiedIdentifier()
		 * @generated
		 */
		EClass AS3_EXPRESSION_QUALIFIED_IDENTIFIER = eINSTANCE.getAs3ExpressionQualifiedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_EXPRESSION_QUALIFIED_IDENTIFIER__QUALIFIER = eINSTANCE.getAs3ExpressionQualifiedIdentifier_Qualifier();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ThisExpressionImpl <em>As3 This Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ThisExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ThisExpression()
		 * @generated
		 */
		EClass AS3_THIS_EXPRESSION = eINSTANCE.getAs3ThisExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3SuperExpressionImpl <em>As3 Super Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3SuperExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3SuperExpression()
		 * @generated
		 */
		EClass AS3_SUPER_EXPRESSION = eINSTANCE.getAs3SuperExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ParenListExpressionImpl <em>As3 Paren List Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ParenListExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ParenListExpression()
		 * @generated
		 */
		EClass AS3_PAREN_LIST_EXPRESSION = eINSTANCE.getAs3ParenListExpression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3FunctionExpressionImpl <em>As3 Function Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3FunctionExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3FunctionExpression()
		 * @generated
		 */
		EClass AS3_FUNCTION_EXPRESSION = eINSTANCE.getAs3FunctionExpression();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FUNCTION_EXPRESSION__RETURN_TYPE = eINSTANCE.getAs3FunctionExpression_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_FUNCTION_EXPRESSION__BODY = eINSTANCE.getAs3FunctionExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_FUNCTION_EXPRESSION__NAME = eINSTANCE.getAs3FunctionExpression_Name();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3NewExpressionImpl <em>As3 New Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3NewExpressionImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NewExpression()
		 * @generated
		 */
		EClass AS3_NEW_EXPRESSION = eINSTANCE.getAs3NewExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_NEW_EXPRESSION__TARGET = eINSTANCE.getAs3NewExpression_Target();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ArrayInitializerImpl <em>As3 Array Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ArrayInitializerImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ArrayInitializer()
		 * @generated
		 */
		EClass AS3_ARRAY_INITIALIZER = eINSTANCE.getAs3ArrayInitializer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_ARRAY_INITIALIZER__ELEMENTS = eINSTANCE.getAs3ArrayInitializer_Elements();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ArrayElementImpl <em>As3 Array Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ArrayElementImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ArrayElement()
		 * @generated
		 */
		EClass AS3_ARRAY_ELEMENT = eINSTANCE.getAs3ArrayElement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_ARRAY_ELEMENT__EXPRESSION = eINSTANCE.getAs3ArrayElement_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3ObjectInitializerImpl <em>As3 Object Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3ObjectInitializerImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3ObjectInitializer()
		 * @generated
		 */
		EClass AS3_OBJECT_INITIALIZER = eINSTANCE.getAs3ObjectInitializer();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_OBJECT_INITIALIZER__FIELDS = eINSTANCE.getAs3ObjectInitializer_Fields();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3LiteralFieldImpl <em>As3 Literal Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3LiteralFieldImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3LiteralField()
		 * @generated
		 */
		EClass AS3_LITERAL_FIELD = eINSTANCE.getAs3LiteralField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_LITERAL_FIELD__NAME = eINSTANCE.getAs3LiteralField_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS3_LITERAL_FIELD__EXPRESSION = eINSTANCE.getAs3LiteralField_Expression();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3XmlInitializerImpl <em>As3 Xml Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3XmlInitializerImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3XmlInitializer()
		 * @generated
		 */
		EClass AS3_XML_INITIALIZER = eINSTANCE.getAs3XmlInitializer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_XML_INITIALIZER__VALUE = eINSTANCE.getAs3XmlInitializer_Value();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3NullLiteralImpl <em>As3 Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3NullLiteralImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NullLiteral()
		 * @generated
		 */
		EClass AS3_NULL_LITERAL = eINSTANCE.getAs3NullLiteral();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3BooleanLiteralImpl <em>As3 Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3BooleanLiteralImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3BooleanLiteral()
		 * @generated
		 */
		EClass AS3_BOOLEAN_LITERAL = eINSTANCE.getAs3BooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_BOOLEAN_LITERAL__VALUE = eINSTANCE.getAs3BooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3NumberLiteralImpl <em>As3 Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3NumberLiteralImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3NumberLiteral()
		 * @generated
		 */
		EClass AS3_NUMBER_LITERAL = eINSTANCE.getAs3NumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_NUMBER_LITERAL__VALUE = eINSTANCE.getAs3NumberLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3StringLiteralImpl <em>As3 String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3StringLiteralImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3StringLiteral()
		 * @generated
		 */
		EClass AS3_STRING_LITERAL = eINSTANCE.getAs3StringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_STRING_LITERAL__VALUE = eINSTANCE.getAs3StringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.axdt.as3.model.impl.As3RegexLiteralImpl <em>As3 Regex Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.axdt.as3.model.impl.As3RegexLiteralImpl
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getAs3RegexLiteral()
		 * @generated
		 */
		EClass AS3_REGEX_LITERAL = eINSTANCE.getAs3RegexLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AS3_REGEX_LITERAL__VALUE = eINSTANCE.getAs3RegexLiteral_Value();

		/**
		 * The meta object literal for the '<em>Iterable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Iterable
		 * @see org.axdt.as3.model.impl.As3EPackageImpl#getIterable()
		 * @generated
		 */
		EDataType ITERABLE = eINSTANCE.getIterable();

	}

} //As3EPackage
