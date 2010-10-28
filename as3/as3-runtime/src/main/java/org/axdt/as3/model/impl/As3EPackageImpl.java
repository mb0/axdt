/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import java.lang.Iterable;
import org.axdt.as3.As3EFactory;
import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3AccessExpression;
import org.axdt.as3.model.As3AdditiveExpression;
import org.axdt.as3.model.As3Arguments;
import org.axdt.as3.model.As3ArrayElement;
import org.axdt.as3.model.As3ArrayInitializer;
import org.axdt.as3.model.As3AssignmentExpression;
import org.axdt.as3.model.As3AttributeExpression;
import org.axdt.as3.model.As3AttributeQualifiedIdentifier;
import org.axdt.as3.model.As3Attributes;
import org.axdt.as3.model.As3BinaryExpression;
import org.axdt.as3.model.As3BitwiseExpression;
import org.axdt.as3.model.As3BitwiseNotExpression;
import org.axdt.as3.model.As3Block;
import org.axdt.as3.model.As3BooleanLiteral;
import org.axdt.as3.model.As3BreakStatement;
import org.axdt.as3.model.As3CaseLabel;
import org.axdt.as3.model.As3CatchClause;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3ConditionalBlock;
import org.axdt.as3.model.As3ConditionalExpression;
import org.axdt.as3.model.As3ConditionalIterationStatement;
import org.axdt.as3.model.As3ConditionalStatement;
import org.axdt.as3.model.As3Constructor;
import org.axdt.as3.model.As3ContinueStatement;
import org.axdt.as3.model.As3DefaultCase;
import org.axdt.as3.model.As3DefaultXmlNamespaceStatement;
import org.axdt.as3.model.As3Definition;
import org.axdt.as3.model.As3DeleteExpression;
import org.axdt.as3.model.As3DoStatement;
import org.axdt.as3.model.As3Element;
import org.axdt.as3.model.As3EmptyStatement;
import org.axdt.as3.model.As3EqualityExpression;
import org.axdt.as3.model.As3Executable;
import org.axdt.as3.model.As3ExpressionCase;
import org.axdt.as3.model.As3ExpressionList;
import org.axdt.as3.model.As3ExpressionQualifiedIdentifier;
import org.axdt.as3.model.As3ExpressionStatement;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3FieldDefinition;
import org.axdt.as3.model.As3ForInStatement;
import org.axdt.as3.model.As3ForStatement;
import org.axdt.as3.model.As3FunctionExpression;
import org.axdt.as3.model.As3Identifiable;
import org.axdt.as3.model.As3IfStatement;
import org.axdt.as3.model.As3Import;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Include;
import org.axdt.as3.model.As3Interface;
import org.axdt.as3.model.As3InvocationExpression;
import org.axdt.as3.model.As3IterationStatement;
import org.axdt.as3.model.As3LabeledStatement;
import org.axdt.as3.model.As3ListExpression;
import org.axdt.as3.model.As3LiteralField;
import org.axdt.as3.model.As3LogicalExpression;
import org.axdt.as3.model.As3LogicalNotExpression;
import org.axdt.as3.model.As3Member;
import org.axdt.as3.model.As3MetadataParameter;
import org.axdt.as3.model.As3MetadataTag;
import org.axdt.as3.model.As3MultiplicativeExpression;
import org.axdt.as3.model.As3Namespace;
import org.axdt.as3.model.As3NewExpression;
import org.axdt.as3.model.As3NonAttributeQualifiedIdentifier;
import org.axdt.as3.model.As3NullLiteral;
import org.axdt.as3.model.As3NumberLiteral;
import org.axdt.as3.model.As3ObjectInitializer;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Parameter;
import org.axdt.as3.model.As3ParameterAssign;
import org.axdt.as3.model.As3ParameterRest;
import org.axdt.as3.model.As3ParenListExpression;
import org.axdt.as3.model.As3PostDecrementExpression;
import org.axdt.as3.model.As3PostIncrementExpression;
import org.axdt.as3.model.As3PostfixExpression;
import org.axdt.as3.model.As3PostfixOperator;
import org.axdt.as3.model.As3PreDecrementExpression;
import org.axdt.as3.model.As3PreIncrementExpression;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.As3PropertyIdentifier;
import org.axdt.as3.model.As3PropertyOperator;
import org.axdt.as3.model.As3QualifiedAttributeExpression;
import org.axdt.as3.model.As3QualifiedIdentifier;
import org.axdt.as3.model.As3QueryExpression;
import org.axdt.as3.model.As3QueryOperator;
import org.axdt.as3.model.As3RegexLiteral;
import org.axdt.as3.model.As3RelationalExpression;
import org.axdt.as3.model.As3ReservedAttribute;
import org.axdt.as3.model.As3ReturnStatement;
import org.axdt.as3.model.As3ShiftExpression;
import org.axdt.as3.model.As3SimpleAttributeExpression;
import org.axdt.as3.model.As3SimpleIdentifier;
import org.axdt.as3.model.As3SimpleQualifiedIdentifier;
import org.axdt.as3.model.As3StringLiteral;
import org.axdt.as3.model.As3SuperExpression;
import org.axdt.as3.model.As3SuperStatement;
import org.axdt.as3.model.As3SwitchStatement;
import org.axdt.as3.model.As3ThisExpression;
import org.axdt.as3.model.As3ThrowStatement;
import org.axdt.as3.model.As3TryStatement;
import org.axdt.as3.model.As3Type;
import org.axdt.as3.model.As3TypeOfExpression;
import org.axdt.as3.model.As3UnaryExpression;
import org.axdt.as3.model.As3UnaryMinusExpression;
import org.axdt.as3.model.As3UnaryPlusExpression;
import org.axdt.as3.model.As3Use;
import org.axdt.as3.model.As3Variable;
import org.axdt.as3.model.As3VariableAssign;
import org.axdt.as3.model.As3VariableDefinition;
import org.axdt.as3.model.As3VoidExpression;
import org.axdt.as3.model.As3WhileStatement;
import org.axdt.as3.model.As3WithStatement;
import org.axdt.as3.model.As3XmlInitializer;
import org.axdt.as3.model.IArithmeticExpression;
import org.axdt.as3.model.IAssignmentExpression;
import org.axdt.as3.model.IAttribute;
import org.axdt.as3.model.IBitwiseExpression;
import org.axdt.as3.model.IBlockDirective;
import org.axdt.as3.model.ICaseElement;
import org.axdt.as3.model.IConditionalExpression;
import org.axdt.as3.model.IDirective;
import org.axdt.as3.model.IEqualityExpression;
import org.axdt.as3.model.IExpression;
import org.axdt.as3.model.IForInInit;
import org.axdt.as3.model.IForInit;
import org.axdt.as3.model.IIdentifier;
import org.axdt.as3.model.ILiteral;
import org.axdt.as3.model.ILiteralFieldName;
import org.axdt.as3.model.ILogicalExpression;
import org.axdt.as3.model.INonAttributeIdentifier;
import org.axdt.as3.model.IPackageDirective;
import org.axdt.as3.model.IPostfixExpression;
import org.axdt.as3.model.IPrimaryExpression;
import org.axdt.as3.model.IRelationalExpression;
import org.axdt.as3.model.IStatement;
import org.axdt.as3.model.ITypeDirective;
import org.axdt.as3.model.IUnaryExpression;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
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
public class As3EPackageImpl extends EPackageImpl implements As3EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPackageDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypeDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBlockDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAssignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iConditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iLogicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBitwiseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEqualityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iArithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPostfixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPrimaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iLiteralFieldNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iNonAttributeIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iForInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iForInInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3IdentifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3DefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3MemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ExecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ParameterAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ParameterRestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3FieldBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3FieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ImportListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3IncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3UseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3NamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3VariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3VariableAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3VariableDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3OperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3MetadataTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3MetadataParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3AttributeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3SimpleAttributeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3QualifiedAttributeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3DefaultXmlNamespaceStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3TryStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3CatchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ThrowStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ReturnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3WithStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3BreakStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ContinueStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3IterationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ConditionalIterationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3DoStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3WhileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ForStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ForInStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ConditionalStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3SwitchStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3CaseLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3DefaultCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ExpressionCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3IfStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3LabeledStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3BlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3SuperStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ExpressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3EmptyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ExpressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ListExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3AssignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ConditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3BinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3LogicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3BitwiseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3EqualityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3RelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ShiftExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3AdditiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3MultiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3UnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3DeleteExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3VoidExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3TypeOfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PreIncrementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PreDecrementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3UnaryPlusExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3UnaryMinusExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3BitwiseNotExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3LogicalNotExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PostfixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PostIncrementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PostDecrementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3InvocationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3AccessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3QueryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PostfixOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PropertyOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3QueryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3SimpleIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3PropertyIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3QualifiedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3AttributeQualifiedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3NonAttributeQualifiedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3SimpleQualifiedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ExpressionQualifiedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ThisExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3SuperExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ParenListExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3FunctionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3NewExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ArrayInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ArrayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ObjectInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3LiteralFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3XmlInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3NullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3BooleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3NumberLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3StringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3RegexLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ConditionalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3ReservedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass as3AttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iterableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType avmTypeAccessEDataType = null;

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
	 * @see org.axdt.as3.As3EPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private As3EPackageImpl() {
		super(eNS_URI, As3EFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link As3EPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static As3EPackage init() {
		if (isInited) return (As3EPackage)EPackage.Registry.INSTANCE.getEPackage(As3EPackage.eNS_URI);

		// Obtain or create and register package
		As3EPackageImpl theAs3EPackage = (As3EPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof As3EPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new As3EPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AvmEPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAs3EPackage.createPackageContents();

		// Initialize created meta-data
		theAs3EPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAs3EPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(As3EPackage.eNS_URI, theAs3EPackage);
		return theAs3EPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDirective() {
		return iDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPackageDirective() {
		return iPackageDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITypeDirective() {
		return iTypeDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBlockDirective() {
		return iBlockDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStatement() {
		return iStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIExpression() {
		return iExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAssignmentExpression() {
		return iAssignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIConditionalExpression() {
		return iConditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getILogicalExpression() {
		return iLogicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBitwiseExpression() {
		return iBitwiseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEqualityExpression() {
		return iEqualityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRelationalExpression() {
		return iRelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIArithmeticExpression() {
		return iArithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIUnaryExpression() {
		return iUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPostfixExpression() {
		return iPostfixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPrimaryExpression() {
		return iPrimaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIIdentifier() {
		return iIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getILiteral() {
		return iLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getILiteralFieldName() {
		return iLiteralFieldNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICaseElement() {
		return iCaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINonAttributeIdentifier() {
		return iNonAttributeIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAttribute() {
		return iAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIForInit() {
		return iForInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIForInInit() {
		return iForInInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Element() {
		return as3ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Identifiable() {
		return as3IdentifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Definition() {
		return as3DefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3Definition_Name() {
		return (EAttribute)as3DefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Definition_Attributes() {
		return (EReference)as3DefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Member() {
		return as3MemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Executable() {
		return as3ExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Executable_Parameters() {
		return (EReference)as3ExecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Parameter() {
		return as3ParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ParameterAssign() {
		return as3ParameterAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ParameterAssign_Expression() {
		return (EReference)as3ParameterAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ParameterRest() {
		return as3ParameterRestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3FieldBinding() {
		return as3FieldBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3FieldBinding_Type() {
		return (EReference)as3FieldBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3FieldBinding_Expression() {
		return (EReference)as3FieldBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3FieldDefinition() {
		return as3FieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3FieldDefinition_Constant() {
		return (EAttribute)as3FieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3FieldDefinition_Bindings() {
		return (EReference)as3FieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3FieldDefinition_Attributes() {
		return (EReference)as3FieldDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Program() {
		return as3ProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Program_Package() {
		return (EReference)as3ProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Program_Directives() {
		return (EReference)as3ProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Import() {
		return as3ImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3Import_QualifiedName() {
		return (EAttribute)as3ImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ImportList() {
		return as3ImportListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ImportList_Imports() {
		return (EReference)as3ImportListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Include() {
		return as3IncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3Include_Target() {
		return (EAttribute)as3IncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Use() {
		return as3UseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Use_Target() {
		return (EReference)as3UseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Package() {
		return as3PackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Package_Directives() {
		return (EReference)as3PackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3Package_CanonicalName() {
		return (EAttribute)as3PackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Type() {
		return as3TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Type_ExtendedInterfaces() {
		return (EReference)as3TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Type_Directives() {
		return (EReference)as3TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Class() {
		return as3ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Class_ExtendedClass() {
		return (EReference)as3ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Interface() {
		return as3InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Namespace() {
		return as3NamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Namespace_Expression() {
		return (EReference)as3NamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Variable() {
		return as3VariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Variable_Type() {
		return (EReference)as3VariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3Variable_Name() {
		return (EAttribute)as3VariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3VariableAssign() {
		return as3VariableAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3VariableAssign_Expression() {
		return (EReference)as3VariableAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3VariableDefinition() {
		return as3VariableDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3VariableDefinition_Constant() {
		return (EAttribute)as3VariableDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3VariableDefinition_Bindings() {
		return (EReference)as3VariableDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Operation() {
		return as3OperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Operation_ReturnType() {
		return (EReference)as3OperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Operation_Body() {
		return (EReference)as3OperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3Operation_Getter() {
		return (EAttribute)as3OperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3Operation_Setter() {
		return (EAttribute)as3OperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Constructor() {
		return as3ConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Constructor_Body() {
		return (EReference)as3ConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3MetadataTag() {
		return as3MetadataTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3MetadataTag_Name() {
		return (EAttribute)as3MetadataTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3MetadataTag_Parameters() {
		return (EReference)as3MetadataTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3MetadataParameter() {
		return as3MetadataParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3MetadataParameter_Name() {
		return (EAttribute)as3MetadataParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3MetadataParameter_Value() {
		return (EReference)as3MetadataParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3AttributeExpression() {
		return as3AttributeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3SimpleAttributeExpression() {
		return as3SimpleAttributeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3SimpleAttributeExpression_Ident() {
		return (EReference)as3SimpleAttributeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3QualifiedAttributeExpression() {
		return as3QualifiedAttributeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3QualifiedAttributeExpression_Qualifier() {
		return (EReference)as3QualifiedAttributeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3QualifiedAttributeExpression_Identifier() {
		return (EReference)as3QualifiedAttributeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3DefaultXmlNamespaceStatement() {
		return as3DefaultXmlNamespaceStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3DefaultXmlNamespaceStatement_Expression() {
		return (EReference)as3DefaultXmlNamespaceStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3TryStatement() {
		return as3TryStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3TryStatement_Block() {
		return (EReference)as3TryStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3TryStatement_Catches() {
		return (EReference)as3TryStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3TryStatement_FinalBlock() {
		return (EReference)as3TryStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3CatchClause() {
		return as3CatchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3CatchClause_Error() {
		return (EReference)as3CatchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3CatchClause_Block() {
		return (EReference)as3CatchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ThrowStatement() {
		return as3ThrowStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ThrowStatement_Expression() {
		return (EReference)as3ThrowStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ReturnStatement() {
		return as3ReturnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ReturnStatement_Expression() {
		return (EReference)as3ReturnStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3WithStatement() {
		return as3WithStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3WithStatement_Target() {
		return (EReference)as3WithStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3WithStatement_Statement() {
		return (EReference)as3WithStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3BreakStatement() {
		return as3BreakStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3BreakStatement_LabelName() {
		return (EAttribute)as3BreakStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3BreakStatement_Label() {
		return (EReference)as3BreakStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ContinueStatement() {
		return as3ContinueStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ContinueStatement_LabelName() {
		return (EAttribute)as3ContinueStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ContinueStatement_Label() {
		return (EReference)as3ContinueStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3IterationStatement() {
		return as3IterationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3IterationStatement_Statement() {
		return (EReference)as3IterationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ConditionalIterationStatement() {
		return as3ConditionalIterationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ConditionalIterationStatement_Conditions() {
		return (EReference)as3ConditionalIterationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3DoStatement() {
		return as3DoStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3WhileStatement() {
		return as3WhileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ForStatement() {
		return as3ForStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ForStatement_Init() {
		return (EReference)as3ForStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ForStatement_Iter() {
		return (EReference)as3ForStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ForInStatement() {
		return as3ForInStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ForInStatement_Target() {
		return (EReference)as3ForInStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ForInStatement_Init() {
		return (EReference)as3ForInStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ForInStatement_ForEach() {
		return (EAttribute)as3ForInStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ConditionalStatement() {
		return as3ConditionalStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ConditionalStatement_Conditions() {
		return (EReference)as3ConditionalStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3SwitchStatement() {
		return as3SwitchStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3SwitchStatement_Cases() {
		return (EReference)as3SwitchStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3CaseLabel() {
		return as3CaseLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3DefaultCase() {
		return as3DefaultCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ExpressionCase() {
		return as3ExpressionCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ExpressionCase_Expressions() {
		return (EReference)as3ExpressionCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3IfStatement() {
		return as3IfStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3IfStatement_Statement() {
		return (EReference)as3IfStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3IfStatement_ElseStatement() {
		return (EReference)as3IfStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3LabeledStatement() {
		return as3LabeledStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3LabeledStatement_Name() {
		return (EAttribute)as3LabeledStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3LabeledStatement_Statement() {
		return (EReference)as3LabeledStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Block() {
		return as3BlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Block_Directives() {
		return (EReference)as3BlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3SuperStatement() {
		return as3SuperStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3SuperStatement_Arguments() {
		return (EReference)as3SuperStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ExpressionStatement() {
		return as3ExpressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ExpressionStatement_Expressions() {
		return (EReference)as3ExpressionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3EmptyStatement() {
		return as3EmptyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ExpressionList() {
		return as3ExpressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ExpressionList_Expressions() {
		return (EReference)as3ExpressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ListExpression() {
		return as3ListExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Arguments() {
		return as3ArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3AssignmentExpression() {
		return as3AssignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ConditionalExpression() {
		return as3ConditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ConditionalExpression_Condition() {
		return (EReference)as3ConditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ConditionalExpression_Statement() {
		return (EReference)as3ConditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ConditionalExpression_ElseStatement() {
		return (EReference)as3ConditionalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3BinaryExpression() {
		return as3BinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3BinaryExpression_Left() {
		return (EReference)as3BinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3BinaryExpression_Operation() {
		return (EAttribute)as3BinaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3BinaryExpression_Right() {
		return (EReference)as3BinaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3LogicalExpression() {
		return as3LogicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3BitwiseExpression() {
		return as3BitwiseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3EqualityExpression() {
		return as3EqualityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3RelationalExpression() {
		return as3RelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ShiftExpression() {
		return as3ShiftExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3AdditiveExpression() {
		return as3AdditiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3MultiplicativeExpression() {
		return as3MultiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3UnaryExpression() {
		return as3UnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3UnaryExpression_Expression() {
		return (EReference)as3UnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3DeleteExpression() {
		return as3DeleteExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3VoidExpression() {
		return as3VoidExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3TypeOfExpression() {
		return as3TypeOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PreIncrementExpression() {
		return as3PreIncrementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PreDecrementExpression() {
		return as3PreDecrementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3UnaryPlusExpression() {
		return as3UnaryPlusExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3UnaryMinusExpression() {
		return as3UnaryMinusExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3BitwiseNotExpression() {
		return as3BitwiseNotExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3LogicalNotExpression() {
		return as3LogicalNotExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PostfixExpression() {
		return as3PostfixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3PostfixExpression_Expression() {
		return (EReference)as3PostfixExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PostIncrementExpression() {
		return as3PostIncrementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PostDecrementExpression() {
		return as3PostDecrementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3InvocationExpression() {
		return as3InvocationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3InvocationExpression_Arguments() {
		return (EReference)as3InvocationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3AccessExpression() {
		return as3AccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3AccessExpression_Operator() {
		return (EReference)as3AccessExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3QueryExpression() {
		return as3QueryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3QueryExpression_Operator() {
		return (EReference)as3QueryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PostfixOperator() {
		return as3PostfixOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3PostfixOperator_Identifier() {
		return (EReference)as3PostfixOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3PostfixOperator_Expressions() {
		return (EReference)as3PostfixOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PropertyOperator() {
		return as3PropertyOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3QueryOperator() {
		return as3QueryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3SimpleIdentifier() {
		return as3SimpleIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3SimpleIdentifier_Name() {
		return (EAttribute)as3SimpleIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3SimpleIdentifier_Reference() {
		return (EReference)as3SimpleIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3PropertyIdentifier() {
		return as3PropertyIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3QualifiedIdentifier() {
		return as3QualifiedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3QualifiedIdentifier_Expressions() {
		return (EReference)as3QualifiedIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3QualifiedIdentifier_Identifier() {
		return (EReference)as3QualifiedIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3AttributeQualifiedIdentifier() {
		return as3AttributeQualifiedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3NonAttributeQualifiedIdentifier() {
		return as3NonAttributeQualifiedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3SimpleQualifiedIdentifier() {
		return as3SimpleQualifiedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3SimpleQualifiedIdentifier_Qualifier() {
		return (EReference)as3SimpleQualifiedIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ExpressionQualifiedIdentifier() {
		return as3ExpressionQualifiedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ExpressionQualifiedIdentifier_Qualifier() {
		return (EReference)as3ExpressionQualifiedIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ThisExpression() {
		return as3ThisExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3SuperExpression() {
		return as3SuperExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ParenListExpression() {
		return as3ParenListExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3FunctionExpression() {
		return as3FunctionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3FunctionExpression_ReturnType() {
		return (EReference)as3FunctionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3FunctionExpression_Body() {
		return (EReference)as3FunctionExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3FunctionExpression_Name() {
		return (EAttribute)as3FunctionExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3NewExpression() {
		return as3NewExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3NewExpression_Target() {
		return (EReference)as3NewExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ArrayInitializer() {
		return as3ArrayInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ArrayInitializer_Elements() {
		return (EReference)as3ArrayInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ArrayElement() {
		return as3ArrayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ArrayElement_Expression() {
		return (EReference)as3ArrayElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ObjectInitializer() {
		return as3ObjectInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ObjectInitializer_Fields() {
		return (EReference)as3ObjectInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3LiteralField() {
		return as3LiteralFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3LiteralField_Name() {
		return (EReference)as3LiteralFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3LiteralField_Expression() {
		return (EReference)as3LiteralFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3XmlInitializer() {
		return as3XmlInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3XmlInitializer_Value() {
		return (EAttribute)as3XmlInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3NullLiteral() {
		return as3NullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3BooleanLiteral() {
		return as3BooleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3BooleanLiteral_Value() {
		return (EAttribute)as3BooleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3NumberLiteral() {
		return as3NumberLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3NumberLiteral_Value() {
		return (EAttribute)as3NumberLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3StringLiteral() {
		return as3StringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3StringLiteral_Value() {
		return (EAttribute)as3StringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3RegexLiteral() {
		return as3RegexLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3RegexLiteral_Value() {
		return (EAttribute)as3RegexLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ConditionalBlock() {
		return as3ConditionalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ConditionalBlock_Condition() {
		return (EReference)as3ConditionalBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3ConditionalBlock_Body() {
		return (EReference)as3ConditionalBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3ReservedAttribute() {
		return as3ReservedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ReservedAttribute_Visibility() {
		return (EAttribute)as3ReservedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ReservedAttribute_Static() {
		return (EAttribute)as3ReservedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ReservedAttribute_Override() {
		return (EAttribute)as3ReservedAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ReservedAttribute_Dynamic() {
		return (EAttribute)as3ReservedAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ReservedAttribute_Final() {
		return (EAttribute)as3ReservedAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs3ReservedAttribute_Native() {
		return (EAttribute)as3ReservedAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs3Attributes() {
		return as3AttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs3Attributes_Attributes() {
		return (EReference)as3AttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIterable() {
		return iterableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAvmTypeAccess() {
		return avmTypeAccessEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3EFactory getAs3EFactory() {
		return (As3EFactory)getEFactoryInstance();
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
		iDirectiveEClass = createEClass(IDIRECTIVE);

		iPackageDirectiveEClass = createEClass(IPACKAGE_DIRECTIVE);

		iTypeDirectiveEClass = createEClass(ITYPE_DIRECTIVE);

		iBlockDirectiveEClass = createEClass(IBLOCK_DIRECTIVE);

		iStatementEClass = createEClass(ISTATEMENT);

		iExpressionEClass = createEClass(IEXPRESSION);

		iAssignmentExpressionEClass = createEClass(IASSIGNMENT_EXPRESSION);

		iConditionalExpressionEClass = createEClass(ICONDITIONAL_EXPRESSION);

		iLogicalExpressionEClass = createEClass(ILOGICAL_EXPRESSION);

		iBitwiseExpressionEClass = createEClass(IBITWISE_EXPRESSION);

		iEqualityExpressionEClass = createEClass(IEQUALITY_EXPRESSION);

		iRelationalExpressionEClass = createEClass(IRELATIONAL_EXPRESSION);

		iArithmeticExpressionEClass = createEClass(IARITHMETIC_EXPRESSION);

		iUnaryExpressionEClass = createEClass(IUNARY_EXPRESSION);

		iPostfixExpressionEClass = createEClass(IPOSTFIX_EXPRESSION);

		iPrimaryExpressionEClass = createEClass(IPRIMARY_EXPRESSION);

		iIdentifierEClass = createEClass(IIDENTIFIER);

		iLiteralEClass = createEClass(ILITERAL);

		iLiteralFieldNameEClass = createEClass(ILITERAL_FIELD_NAME);

		iCaseElementEClass = createEClass(ICASE_ELEMENT);

		iNonAttributeIdentifierEClass = createEClass(INON_ATTRIBUTE_IDENTIFIER);

		iAttributeEClass = createEClass(IATTRIBUTE);

		iForInitEClass = createEClass(IFOR_INIT);

		iForInInitEClass = createEClass(IFOR_IN_INIT);

		as3ElementEClass = createEClass(AS3_ELEMENT);

		as3IdentifiableEClass = createEClass(AS3_IDENTIFIABLE);

		as3DefinitionEClass = createEClass(AS3_DEFINITION);
		createEAttribute(as3DefinitionEClass, AS3_DEFINITION__NAME);
		createEReference(as3DefinitionEClass, AS3_DEFINITION__ATTRIBUTES);

		as3MemberEClass = createEClass(AS3_MEMBER);

		as3ExecutableEClass = createEClass(AS3_EXECUTABLE);
		createEReference(as3ExecutableEClass, AS3_EXECUTABLE__PARAMETERS);

		as3ProgramEClass = createEClass(AS3_PROGRAM);
		createEReference(as3ProgramEClass, AS3_PROGRAM__PACKAGE);
		createEReference(as3ProgramEClass, AS3_PROGRAM__DIRECTIVES);

		as3ImportEClass = createEClass(AS3_IMPORT);
		createEAttribute(as3ImportEClass, AS3_IMPORT__QUALIFIED_NAME);

		as3ImportListEClass = createEClass(AS3_IMPORT_LIST);
		createEReference(as3ImportListEClass, AS3_IMPORT_LIST__IMPORTS);

		as3IncludeEClass = createEClass(AS3_INCLUDE);
		createEAttribute(as3IncludeEClass, AS3_INCLUDE__TARGET);

		as3UseEClass = createEClass(AS3_USE);
		createEReference(as3UseEClass, AS3_USE__TARGET);

		as3PackageEClass = createEClass(AS3_PACKAGE);
		createEReference(as3PackageEClass, AS3_PACKAGE__DIRECTIVES);
		createEAttribute(as3PackageEClass, AS3_PACKAGE__CANONICAL_NAME);

		as3TypeEClass = createEClass(AS3_TYPE);
		createEReference(as3TypeEClass, AS3_TYPE__EXTENDED_INTERFACES);
		createEReference(as3TypeEClass, AS3_TYPE__DIRECTIVES);

		as3ClassEClass = createEClass(AS3_CLASS);
		createEReference(as3ClassEClass, AS3_CLASS__EXTENDED_CLASS);

		as3InterfaceEClass = createEClass(AS3_INTERFACE);

		as3NamespaceEClass = createEClass(AS3_NAMESPACE);
		createEReference(as3NamespaceEClass, AS3_NAMESPACE__EXPRESSION);

		as3VariableEClass = createEClass(AS3_VARIABLE);
		createEReference(as3VariableEClass, AS3_VARIABLE__TYPE);
		createEAttribute(as3VariableEClass, AS3_VARIABLE__NAME);

		as3VariableAssignEClass = createEClass(AS3_VARIABLE_ASSIGN);
		createEReference(as3VariableAssignEClass, AS3_VARIABLE_ASSIGN__EXPRESSION);

		as3VariableDefinitionEClass = createEClass(AS3_VARIABLE_DEFINITION);
		createEAttribute(as3VariableDefinitionEClass, AS3_VARIABLE_DEFINITION__CONSTANT);
		createEReference(as3VariableDefinitionEClass, AS3_VARIABLE_DEFINITION__BINDINGS);

		as3ParameterEClass = createEClass(AS3_PARAMETER);

		as3ParameterAssignEClass = createEClass(AS3_PARAMETER_ASSIGN);
		createEReference(as3ParameterAssignEClass, AS3_PARAMETER_ASSIGN__EXPRESSION);

		as3ParameterRestEClass = createEClass(AS3_PARAMETER_REST);

		as3FieldBindingEClass = createEClass(AS3_FIELD_BINDING);
		createEReference(as3FieldBindingEClass, AS3_FIELD_BINDING__TYPE);
		createEReference(as3FieldBindingEClass, AS3_FIELD_BINDING__EXPRESSION);

		as3FieldDefinitionEClass = createEClass(AS3_FIELD_DEFINITION);
		createEAttribute(as3FieldDefinitionEClass, AS3_FIELD_DEFINITION__CONSTANT);
		createEReference(as3FieldDefinitionEClass, AS3_FIELD_DEFINITION__BINDINGS);
		createEReference(as3FieldDefinitionEClass, AS3_FIELD_DEFINITION__ATTRIBUTES);

		as3OperationEClass = createEClass(AS3_OPERATION);
		createEAttribute(as3OperationEClass, AS3_OPERATION__GETTER);
		createEAttribute(as3OperationEClass, AS3_OPERATION__SETTER);
		createEReference(as3OperationEClass, AS3_OPERATION__RETURN_TYPE);
		createEReference(as3OperationEClass, AS3_OPERATION__BODY);

		as3ConstructorEClass = createEClass(AS3_CONSTRUCTOR);
		createEReference(as3ConstructorEClass, AS3_CONSTRUCTOR__BODY);

		as3MetadataTagEClass = createEClass(AS3_METADATA_TAG);
		createEAttribute(as3MetadataTagEClass, AS3_METADATA_TAG__NAME);
		createEReference(as3MetadataTagEClass, AS3_METADATA_TAG__PARAMETERS);

		as3MetadataParameterEClass = createEClass(AS3_METADATA_PARAMETER);
		createEAttribute(as3MetadataParameterEClass, AS3_METADATA_PARAMETER__NAME);
		createEReference(as3MetadataParameterEClass, AS3_METADATA_PARAMETER__VALUE);

		as3AttributeExpressionEClass = createEClass(AS3_ATTRIBUTE_EXPRESSION);

		as3SimpleAttributeExpressionEClass = createEClass(AS3_SIMPLE_ATTRIBUTE_EXPRESSION);
		createEReference(as3SimpleAttributeExpressionEClass, AS3_SIMPLE_ATTRIBUTE_EXPRESSION__IDENT);

		as3QualifiedAttributeExpressionEClass = createEClass(AS3_QUALIFIED_ATTRIBUTE_EXPRESSION);
		createEReference(as3QualifiedAttributeExpressionEClass, AS3_QUALIFIED_ATTRIBUTE_EXPRESSION__QUALIFIER);
		createEReference(as3QualifiedAttributeExpressionEClass, AS3_QUALIFIED_ATTRIBUTE_EXPRESSION__IDENTIFIER);

		as3DefaultXmlNamespaceStatementEClass = createEClass(AS3_DEFAULT_XML_NAMESPACE_STATEMENT);
		createEReference(as3DefaultXmlNamespaceStatementEClass, AS3_DEFAULT_XML_NAMESPACE_STATEMENT__EXPRESSION);

		as3TryStatementEClass = createEClass(AS3_TRY_STATEMENT);
		createEReference(as3TryStatementEClass, AS3_TRY_STATEMENT__BLOCK);
		createEReference(as3TryStatementEClass, AS3_TRY_STATEMENT__CATCHES);
		createEReference(as3TryStatementEClass, AS3_TRY_STATEMENT__FINAL_BLOCK);

		as3CatchClauseEClass = createEClass(AS3_CATCH_CLAUSE);
		createEReference(as3CatchClauseEClass, AS3_CATCH_CLAUSE__ERROR);
		createEReference(as3CatchClauseEClass, AS3_CATCH_CLAUSE__BLOCK);

		as3ThrowStatementEClass = createEClass(AS3_THROW_STATEMENT);
		createEReference(as3ThrowStatementEClass, AS3_THROW_STATEMENT__EXPRESSION);

		as3ReturnStatementEClass = createEClass(AS3_RETURN_STATEMENT);
		createEReference(as3ReturnStatementEClass, AS3_RETURN_STATEMENT__EXPRESSION);

		as3WithStatementEClass = createEClass(AS3_WITH_STATEMENT);
		createEReference(as3WithStatementEClass, AS3_WITH_STATEMENT__TARGET);
		createEReference(as3WithStatementEClass, AS3_WITH_STATEMENT__STATEMENT);

		as3BreakStatementEClass = createEClass(AS3_BREAK_STATEMENT);
		createEAttribute(as3BreakStatementEClass, AS3_BREAK_STATEMENT__LABEL_NAME);
		createEReference(as3BreakStatementEClass, AS3_BREAK_STATEMENT__LABEL);

		as3ContinueStatementEClass = createEClass(AS3_CONTINUE_STATEMENT);
		createEAttribute(as3ContinueStatementEClass, AS3_CONTINUE_STATEMENT__LABEL_NAME);
		createEReference(as3ContinueStatementEClass, AS3_CONTINUE_STATEMENT__LABEL);

		as3IterationStatementEClass = createEClass(AS3_ITERATION_STATEMENT);
		createEReference(as3IterationStatementEClass, AS3_ITERATION_STATEMENT__STATEMENT);

		as3ConditionalIterationStatementEClass = createEClass(AS3_CONDITIONAL_ITERATION_STATEMENT);
		createEReference(as3ConditionalIterationStatementEClass, AS3_CONDITIONAL_ITERATION_STATEMENT__CONDITIONS);

		as3DoStatementEClass = createEClass(AS3_DO_STATEMENT);

		as3WhileStatementEClass = createEClass(AS3_WHILE_STATEMENT);

		as3ForStatementEClass = createEClass(AS3_FOR_STATEMENT);
		createEReference(as3ForStatementEClass, AS3_FOR_STATEMENT__INIT);
		createEReference(as3ForStatementEClass, AS3_FOR_STATEMENT__ITER);

		as3ForInStatementEClass = createEClass(AS3_FOR_IN_STATEMENT);
		createEReference(as3ForInStatementEClass, AS3_FOR_IN_STATEMENT__TARGET);
		createEReference(as3ForInStatementEClass, AS3_FOR_IN_STATEMENT__INIT);
		createEAttribute(as3ForInStatementEClass, AS3_FOR_IN_STATEMENT__FOR_EACH);

		as3ConditionalStatementEClass = createEClass(AS3_CONDITIONAL_STATEMENT);
		createEReference(as3ConditionalStatementEClass, AS3_CONDITIONAL_STATEMENT__CONDITIONS);

		as3SwitchStatementEClass = createEClass(AS3_SWITCH_STATEMENT);
		createEReference(as3SwitchStatementEClass, AS3_SWITCH_STATEMENT__CASES);

		as3CaseLabelEClass = createEClass(AS3_CASE_LABEL);

		as3DefaultCaseEClass = createEClass(AS3_DEFAULT_CASE);

		as3ExpressionCaseEClass = createEClass(AS3_EXPRESSION_CASE);
		createEReference(as3ExpressionCaseEClass, AS3_EXPRESSION_CASE__EXPRESSIONS);

		as3IfStatementEClass = createEClass(AS3_IF_STATEMENT);
		createEReference(as3IfStatementEClass, AS3_IF_STATEMENT__STATEMENT);
		createEReference(as3IfStatementEClass, AS3_IF_STATEMENT__ELSE_STATEMENT);

		as3LabeledStatementEClass = createEClass(AS3_LABELED_STATEMENT);
		createEAttribute(as3LabeledStatementEClass, AS3_LABELED_STATEMENT__NAME);
		createEReference(as3LabeledStatementEClass, AS3_LABELED_STATEMENT__STATEMENT);

		as3BlockEClass = createEClass(AS3_BLOCK);
		createEReference(as3BlockEClass, AS3_BLOCK__DIRECTIVES);

		as3SuperStatementEClass = createEClass(AS3_SUPER_STATEMENT);
		createEReference(as3SuperStatementEClass, AS3_SUPER_STATEMENT__ARGUMENTS);

		as3ExpressionStatementEClass = createEClass(AS3_EXPRESSION_STATEMENT);
		createEReference(as3ExpressionStatementEClass, AS3_EXPRESSION_STATEMENT__EXPRESSIONS);

		as3EmptyStatementEClass = createEClass(AS3_EMPTY_STATEMENT);

		as3ExpressionListEClass = createEClass(AS3_EXPRESSION_LIST);
		createEReference(as3ExpressionListEClass, AS3_EXPRESSION_LIST__EXPRESSIONS);

		as3ListExpressionEClass = createEClass(AS3_LIST_EXPRESSION);

		as3ArgumentsEClass = createEClass(AS3_ARGUMENTS);

		as3AssignmentExpressionEClass = createEClass(AS3_ASSIGNMENT_EXPRESSION);

		as3ConditionalExpressionEClass = createEClass(AS3_CONDITIONAL_EXPRESSION);
		createEReference(as3ConditionalExpressionEClass, AS3_CONDITIONAL_EXPRESSION__CONDITION);
		createEReference(as3ConditionalExpressionEClass, AS3_CONDITIONAL_EXPRESSION__STATEMENT);
		createEReference(as3ConditionalExpressionEClass, AS3_CONDITIONAL_EXPRESSION__ELSE_STATEMENT);

		as3BinaryExpressionEClass = createEClass(AS3_BINARY_EXPRESSION);
		createEReference(as3BinaryExpressionEClass, AS3_BINARY_EXPRESSION__LEFT);
		createEAttribute(as3BinaryExpressionEClass, AS3_BINARY_EXPRESSION__OPERATION);
		createEReference(as3BinaryExpressionEClass, AS3_BINARY_EXPRESSION__RIGHT);

		as3LogicalExpressionEClass = createEClass(AS3_LOGICAL_EXPRESSION);

		as3BitwiseExpressionEClass = createEClass(AS3_BITWISE_EXPRESSION);

		as3EqualityExpressionEClass = createEClass(AS3_EQUALITY_EXPRESSION);

		as3RelationalExpressionEClass = createEClass(AS3_RELATIONAL_EXPRESSION);

		as3ShiftExpressionEClass = createEClass(AS3_SHIFT_EXPRESSION);

		as3AdditiveExpressionEClass = createEClass(AS3_ADDITIVE_EXPRESSION);

		as3MultiplicativeExpressionEClass = createEClass(AS3_MULTIPLICATIVE_EXPRESSION);

		as3UnaryExpressionEClass = createEClass(AS3_UNARY_EXPRESSION);
		createEReference(as3UnaryExpressionEClass, AS3_UNARY_EXPRESSION__EXPRESSION);

		as3DeleteExpressionEClass = createEClass(AS3_DELETE_EXPRESSION);

		as3VoidExpressionEClass = createEClass(AS3_VOID_EXPRESSION);

		as3TypeOfExpressionEClass = createEClass(AS3_TYPE_OF_EXPRESSION);

		as3PreIncrementExpressionEClass = createEClass(AS3_PRE_INCREMENT_EXPRESSION);

		as3PreDecrementExpressionEClass = createEClass(AS3_PRE_DECREMENT_EXPRESSION);

		as3UnaryPlusExpressionEClass = createEClass(AS3_UNARY_PLUS_EXPRESSION);

		as3UnaryMinusExpressionEClass = createEClass(AS3_UNARY_MINUS_EXPRESSION);

		as3BitwiseNotExpressionEClass = createEClass(AS3_BITWISE_NOT_EXPRESSION);

		as3LogicalNotExpressionEClass = createEClass(AS3_LOGICAL_NOT_EXPRESSION);

		as3PostfixExpressionEClass = createEClass(AS3_POSTFIX_EXPRESSION);
		createEReference(as3PostfixExpressionEClass, AS3_POSTFIX_EXPRESSION__EXPRESSION);

		as3PostIncrementExpressionEClass = createEClass(AS3_POST_INCREMENT_EXPRESSION);

		as3PostDecrementExpressionEClass = createEClass(AS3_POST_DECREMENT_EXPRESSION);

		as3InvocationExpressionEClass = createEClass(AS3_INVOCATION_EXPRESSION);
		createEReference(as3InvocationExpressionEClass, AS3_INVOCATION_EXPRESSION__ARGUMENTS);

		as3AccessExpressionEClass = createEClass(AS3_ACCESS_EXPRESSION);
		createEReference(as3AccessExpressionEClass, AS3_ACCESS_EXPRESSION__OPERATOR);

		as3QueryExpressionEClass = createEClass(AS3_QUERY_EXPRESSION);
		createEReference(as3QueryExpressionEClass, AS3_QUERY_EXPRESSION__OPERATOR);

		as3PostfixOperatorEClass = createEClass(AS3_POSTFIX_OPERATOR);
		createEReference(as3PostfixOperatorEClass, AS3_POSTFIX_OPERATOR__IDENTIFIER);
		createEReference(as3PostfixOperatorEClass, AS3_POSTFIX_OPERATOR__EXPRESSIONS);

		as3PropertyOperatorEClass = createEClass(AS3_PROPERTY_OPERATOR);

		as3QueryOperatorEClass = createEClass(AS3_QUERY_OPERATOR);

		as3SimpleIdentifierEClass = createEClass(AS3_SIMPLE_IDENTIFIER);
		createEAttribute(as3SimpleIdentifierEClass, AS3_SIMPLE_IDENTIFIER__NAME);
		createEReference(as3SimpleIdentifierEClass, AS3_SIMPLE_IDENTIFIER__REFERENCE);

		as3PropertyIdentifierEClass = createEClass(AS3_PROPERTY_IDENTIFIER);

		as3QualifiedIdentifierEClass = createEClass(AS3_QUALIFIED_IDENTIFIER);
		createEReference(as3QualifiedIdentifierEClass, AS3_QUALIFIED_IDENTIFIER__EXPRESSIONS);
		createEReference(as3QualifiedIdentifierEClass, AS3_QUALIFIED_IDENTIFIER__IDENTIFIER);

		as3AttributeQualifiedIdentifierEClass = createEClass(AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER);

		as3NonAttributeQualifiedIdentifierEClass = createEClass(AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER);

		as3SimpleQualifiedIdentifierEClass = createEClass(AS3_SIMPLE_QUALIFIED_IDENTIFIER);
		createEReference(as3SimpleQualifiedIdentifierEClass, AS3_SIMPLE_QUALIFIED_IDENTIFIER__QUALIFIER);

		as3ExpressionQualifiedIdentifierEClass = createEClass(AS3_EXPRESSION_QUALIFIED_IDENTIFIER);
		createEReference(as3ExpressionQualifiedIdentifierEClass, AS3_EXPRESSION_QUALIFIED_IDENTIFIER__QUALIFIER);

		as3ThisExpressionEClass = createEClass(AS3_THIS_EXPRESSION);

		as3SuperExpressionEClass = createEClass(AS3_SUPER_EXPRESSION);

		as3ParenListExpressionEClass = createEClass(AS3_PAREN_LIST_EXPRESSION);

		as3FunctionExpressionEClass = createEClass(AS3_FUNCTION_EXPRESSION);
		createEReference(as3FunctionExpressionEClass, AS3_FUNCTION_EXPRESSION__RETURN_TYPE);
		createEReference(as3FunctionExpressionEClass, AS3_FUNCTION_EXPRESSION__BODY);
		createEAttribute(as3FunctionExpressionEClass, AS3_FUNCTION_EXPRESSION__NAME);

		as3NewExpressionEClass = createEClass(AS3_NEW_EXPRESSION);
		createEReference(as3NewExpressionEClass, AS3_NEW_EXPRESSION__TARGET);

		as3ArrayInitializerEClass = createEClass(AS3_ARRAY_INITIALIZER);
		createEReference(as3ArrayInitializerEClass, AS3_ARRAY_INITIALIZER__ELEMENTS);

		as3ArrayElementEClass = createEClass(AS3_ARRAY_ELEMENT);
		createEReference(as3ArrayElementEClass, AS3_ARRAY_ELEMENT__EXPRESSION);

		as3ObjectInitializerEClass = createEClass(AS3_OBJECT_INITIALIZER);
		createEReference(as3ObjectInitializerEClass, AS3_OBJECT_INITIALIZER__FIELDS);

		as3LiteralFieldEClass = createEClass(AS3_LITERAL_FIELD);
		createEReference(as3LiteralFieldEClass, AS3_LITERAL_FIELD__NAME);
		createEReference(as3LiteralFieldEClass, AS3_LITERAL_FIELD__EXPRESSION);

		as3XmlInitializerEClass = createEClass(AS3_XML_INITIALIZER);
		createEAttribute(as3XmlInitializerEClass, AS3_XML_INITIALIZER__VALUE);

		as3NullLiteralEClass = createEClass(AS3_NULL_LITERAL);

		as3BooleanLiteralEClass = createEClass(AS3_BOOLEAN_LITERAL);
		createEAttribute(as3BooleanLiteralEClass, AS3_BOOLEAN_LITERAL__VALUE);

		as3NumberLiteralEClass = createEClass(AS3_NUMBER_LITERAL);
		createEAttribute(as3NumberLiteralEClass, AS3_NUMBER_LITERAL__VALUE);

		as3StringLiteralEClass = createEClass(AS3_STRING_LITERAL);
		createEAttribute(as3StringLiteralEClass, AS3_STRING_LITERAL__VALUE);

		as3RegexLiteralEClass = createEClass(AS3_REGEX_LITERAL);
		createEAttribute(as3RegexLiteralEClass, AS3_REGEX_LITERAL__VALUE);

		as3ConditionalBlockEClass = createEClass(AS3_CONDITIONAL_BLOCK);
		createEReference(as3ConditionalBlockEClass, AS3_CONDITIONAL_BLOCK__CONDITION);
		createEReference(as3ConditionalBlockEClass, AS3_CONDITIONAL_BLOCK__BODY);

		as3ReservedAttributeEClass = createEClass(AS3_RESERVED_ATTRIBUTE);
		createEAttribute(as3ReservedAttributeEClass, AS3_RESERVED_ATTRIBUTE__VISIBILITY);
		createEAttribute(as3ReservedAttributeEClass, AS3_RESERVED_ATTRIBUTE__STATIC);
		createEAttribute(as3ReservedAttributeEClass, AS3_RESERVED_ATTRIBUTE__OVERRIDE);
		createEAttribute(as3ReservedAttributeEClass, AS3_RESERVED_ATTRIBUTE__DYNAMIC);
		createEAttribute(as3ReservedAttributeEClass, AS3_RESERVED_ATTRIBUTE__FINAL);
		createEAttribute(as3ReservedAttributeEClass, AS3_RESERVED_ATTRIBUTE__NATIVE);

		as3AttributesEClass = createEClass(AS3_ATTRIBUTES);
		createEReference(as3AttributesEClass, AS3_ATTRIBUTES__ATTRIBUTES);

		// Create data types
		iterableEDataType = createEDataType(ITERABLE);
		avmTypeAccessEDataType = createEDataType(AVM_TYPE_ACCESS);
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
		addETypeParameter(iterableEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		iPackageDirectiveEClass.getESuperTypes().add(this.getIDirective());
		iTypeDirectiveEClass.getESuperTypes().add(this.getIPackageDirective());
		iBlockDirectiveEClass.getESuperTypes().add(this.getITypeDirective());
		iBlockDirectiveEClass.getESuperTypes().add(this.getICaseElement());
		iStatementEClass.getESuperTypes().add(this.getIBlockDirective());
		iAssignmentExpressionEClass.getESuperTypes().add(this.getIExpression());
		iConditionalExpressionEClass.getESuperTypes().add(this.getIAssignmentExpression());
		iLogicalExpressionEClass.getESuperTypes().add(this.getIConditionalExpression());
		iBitwiseExpressionEClass.getESuperTypes().add(this.getILogicalExpression());
		iEqualityExpressionEClass.getESuperTypes().add(this.getIBitwiseExpression());
		iRelationalExpressionEClass.getESuperTypes().add(this.getIEqualityExpression());
		iArithmeticExpressionEClass.getESuperTypes().add(this.getIRelationalExpression());
		iUnaryExpressionEClass.getESuperTypes().add(this.getIArithmeticExpression());
		iPostfixExpressionEClass.getESuperTypes().add(this.getIUnaryExpression());
		iPostfixExpressionEClass.getESuperTypes().add(this.getIForInInit());
		iPrimaryExpressionEClass.getESuperTypes().add(this.getIPostfixExpression());
		iIdentifierEClass.getESuperTypes().add(this.getIPrimaryExpression());
		iLiteralEClass.getESuperTypes().add(this.getIPrimaryExpression());
		iNonAttributeIdentifierEClass.getESuperTypes().add(this.getIIdentifier());
		as3ElementEClass.getESuperTypes().add(theAvmEPackage.getAvmElement());
		as3IdentifiableEClass.getESuperTypes().add(this.getAs3Element());
		as3IdentifiableEClass.getESuperTypes().add(theAvmEPackage.getAvmIdentifiable());
		as3DefinitionEClass.getESuperTypes().add(this.getAs3Identifiable());
		as3DefinitionEClass.getESuperTypes().add(theAvmEPackage.getAvmDefinition());
		as3MemberEClass.getESuperTypes().add(this.getAs3Definition());
		as3MemberEClass.getESuperTypes().add(theAvmEPackage.getAvmMember());
		as3MemberEClass.getESuperTypes().add(this.getITypeDirective());
		as3ExecutableEClass.getESuperTypes().add(theAvmEPackage.getAvmExecutable());
		as3ProgramEClass.getESuperTypes().add(this.getAs3Element());
		as3ProgramEClass.getESuperTypes().add(theAvmEPackage.getAvmDefinitionContainer());
		as3ImportEClass.getESuperTypes().add(this.getIDirective());
		as3ImportEClass.getESuperTypes().add(theAvmEPackage.getAvmDefinition());
		as3ImportListEClass.getESuperTypes().add(this.getIBlockDirective());
		as3IncludeEClass.getESuperTypes().add(this.getIBlockDirective());
		as3UseEClass.getESuperTypes().add(this.getIBlockDirective());
		as3PackageEClass.getESuperTypes().add(this.getAs3Identifiable());
		as3PackageEClass.getESuperTypes().add(theAvmEPackage.getAvmPackage());
		as3TypeEClass.getESuperTypes().add(this.getAs3Definition());
		as3TypeEClass.getESuperTypes().add(theAvmEPackage.getAvmDeclaredType());
		as3TypeEClass.getESuperTypes().add(this.getIPackageDirective());
		as3ClassEClass.getESuperTypes().add(this.getAs3Type());
		as3ClassEClass.getESuperTypes().add(theAvmEPackage.getAvmClass());
		as3InterfaceEClass.getESuperTypes().add(this.getAs3Type());
		as3InterfaceEClass.getESuperTypes().add(theAvmEPackage.getAvmInterface());
		as3NamespaceEClass.getESuperTypes().add(this.getAs3Member());
		as3NamespaceEClass.getESuperTypes().add(theAvmEPackage.getAvmNamespace());
		as3NamespaceEClass.getESuperTypes().add(this.getIBlockDirective());
		as3VariableEClass.getESuperTypes().add(this.getAs3Identifiable());
		as3VariableEClass.getESuperTypes().add(theAvmEPackage.getAvmVariable());
		as3VariableAssignEClass.getESuperTypes().add(this.getAs3Variable());
		as3VariableDefinitionEClass.getESuperTypes().add(this.getIStatement());
		as3VariableDefinitionEClass.getESuperTypes().add(this.getIForInit());
		as3VariableDefinitionEClass.getESuperTypes().add(this.getIForInInit());
		as3ParameterEClass.getESuperTypes().add(this.getAs3Variable());
		as3ParameterEClass.getESuperTypes().add(theAvmEPackage.getAvmParameter());
		as3ParameterAssignEClass.getESuperTypes().add(this.getAs3Parameter());
		as3ParameterRestEClass.getESuperTypes().add(this.getAs3Parameter());
		as3FieldBindingEClass.getESuperTypes().add(this.getAs3Member());
		as3FieldBindingEClass.getESuperTypes().add(theAvmEPackage.getAvmField());
		as3FieldDefinitionEClass.getESuperTypes().add(this.getITypeDirective());
		as3OperationEClass.getESuperTypes().add(this.getAs3Member());
		as3OperationEClass.getESuperTypes().add(this.getAs3Executable());
		as3OperationEClass.getESuperTypes().add(theAvmEPackage.getAvmOperation());
		as3ConstructorEClass.getESuperTypes().add(this.getAs3Member());
		as3ConstructorEClass.getESuperTypes().add(this.getAs3Executable());
		as3ConstructorEClass.getESuperTypes().add(theAvmEPackage.getAvmConstructor());
		as3MetadataTagEClass.getESuperTypes().add(this.getIAttribute());
		as3AttributeExpressionEClass.getESuperTypes().add(this.getIAttribute());
		as3SimpleAttributeExpressionEClass.getESuperTypes().add(this.getAs3AttributeExpression());
		as3QualifiedAttributeExpressionEClass.getESuperTypes().add(this.getAs3AttributeExpression());
		as3DefaultXmlNamespaceStatementEClass.getESuperTypes().add(this.getIStatement());
		as3TryStatementEClass.getESuperTypes().add(this.getIStatement());
		as3ThrowStatementEClass.getESuperTypes().add(this.getIStatement());
		as3ReturnStatementEClass.getESuperTypes().add(this.getIStatement());
		as3WithStatementEClass.getESuperTypes().add(this.getIStatement());
		as3BreakStatementEClass.getESuperTypes().add(this.getIStatement());
		as3ContinueStatementEClass.getESuperTypes().add(this.getIStatement());
		as3IterationStatementEClass.getESuperTypes().add(this.getIStatement());
		as3ConditionalIterationStatementEClass.getESuperTypes().add(this.getAs3IterationStatement());
		as3DoStatementEClass.getESuperTypes().add(this.getAs3ConditionalIterationStatement());
		as3WhileStatementEClass.getESuperTypes().add(this.getAs3ConditionalIterationStatement());
		as3ForStatementEClass.getESuperTypes().add(this.getAs3ConditionalIterationStatement());
		as3ForInStatementEClass.getESuperTypes().add(this.getAs3IterationStatement());
		as3ConditionalStatementEClass.getESuperTypes().add(this.getIStatement());
		as3SwitchStatementEClass.getESuperTypes().add(this.getAs3ConditionalStatement());
		as3CaseLabelEClass.getESuperTypes().add(this.getICaseElement());
		as3DefaultCaseEClass.getESuperTypes().add(this.getAs3CaseLabel());
		as3ExpressionCaseEClass.getESuperTypes().add(this.getAs3CaseLabel());
		as3IfStatementEClass.getESuperTypes().add(this.getAs3ConditionalStatement());
		as3LabeledStatementEClass.getESuperTypes().add(this.getIStatement());
		as3BlockEClass.getESuperTypes().add(this.getIStatement());
		as3SuperStatementEClass.getESuperTypes().add(this.getIStatement());
		as3ExpressionStatementEClass.getESuperTypes().add(this.getIStatement());
		as3EmptyStatementEClass.getESuperTypes().add(this.getIStatement());
		as3ListExpressionEClass.getESuperTypes().add(this.getAs3ExpressionList());
		as3ListExpressionEClass.getESuperTypes().add(this.getIForInit());
		as3ArgumentsEClass.getESuperTypes().add(this.getAs3ExpressionList());
		as3AssignmentExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3AssignmentExpressionEClass.getESuperTypes().add(this.getIAssignmentExpression());
		as3ConditionalExpressionEClass.getESuperTypes().add(this.getIConditionalExpression());
		as3BinaryExpressionEClass.getESuperTypes().add(this.getIExpression());
		as3LogicalExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3LogicalExpressionEClass.getESuperTypes().add(this.getILogicalExpression());
		as3BitwiseExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3BitwiseExpressionEClass.getESuperTypes().add(this.getIBitwiseExpression());
		as3EqualityExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3EqualityExpressionEClass.getESuperTypes().add(this.getIEqualityExpression());
		as3RelationalExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3RelationalExpressionEClass.getESuperTypes().add(this.getIRelationalExpression());
		as3ShiftExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3ShiftExpressionEClass.getESuperTypes().add(this.getIArithmeticExpression());
		as3AdditiveExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3AdditiveExpressionEClass.getESuperTypes().add(this.getIArithmeticExpression());
		as3MultiplicativeExpressionEClass.getESuperTypes().add(this.getAs3BinaryExpression());
		as3MultiplicativeExpressionEClass.getESuperTypes().add(this.getIArithmeticExpression());
		as3UnaryExpressionEClass.getESuperTypes().add(this.getIUnaryExpression());
		as3DeleteExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3VoidExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3TypeOfExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3PreIncrementExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3PreDecrementExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3UnaryPlusExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3UnaryMinusExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3BitwiseNotExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3LogicalNotExpressionEClass.getESuperTypes().add(this.getAs3UnaryExpression());
		as3PostfixExpressionEClass.getESuperTypes().add(this.getIPostfixExpression());
		as3PostIncrementExpressionEClass.getESuperTypes().add(this.getAs3PostfixExpression());
		as3PostDecrementExpressionEClass.getESuperTypes().add(this.getAs3PostfixExpression());
		as3InvocationExpressionEClass.getESuperTypes().add(this.getAs3PostfixExpression());
		as3AccessExpressionEClass.getESuperTypes().add(this.getAs3PostfixExpression());
		as3QueryExpressionEClass.getESuperTypes().add(this.getAs3PostfixExpression());
		as3PropertyOperatorEClass.getESuperTypes().add(this.getAs3PostfixOperator());
		as3QueryOperatorEClass.getESuperTypes().add(this.getAs3PostfixOperator());
		as3SimpleIdentifierEClass.getESuperTypes().add(this.getINonAttributeIdentifier());
		as3PropertyIdentifierEClass.getESuperTypes().add(this.getAs3SimpleIdentifier());
		as3PropertyIdentifierEClass.getESuperTypes().add(this.getILiteralFieldName());
		as3QualifiedIdentifierEClass.getESuperTypes().add(this.getIIdentifier());
		as3AttributeQualifiedIdentifierEClass.getESuperTypes().add(this.getAs3QualifiedIdentifier());
		as3NonAttributeQualifiedIdentifierEClass.getESuperTypes().add(this.getAs3QualifiedIdentifier());
		as3NonAttributeQualifiedIdentifierEClass.getESuperTypes().add(this.getINonAttributeIdentifier());
		as3SimpleQualifiedIdentifierEClass.getESuperTypes().add(this.getAs3NonAttributeQualifiedIdentifier());
		as3ExpressionQualifiedIdentifierEClass.getESuperTypes().add(this.getAs3NonAttributeQualifiedIdentifier());
		as3ThisExpressionEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3SuperExpressionEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3ParenListExpressionEClass.getESuperTypes().add(this.getAs3ExpressionList());
		as3ParenListExpressionEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3FunctionExpressionEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3FunctionExpressionEClass.getESuperTypes().add(this.getAs3Executable());
		as3NewExpressionEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3ArrayInitializerEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3ObjectInitializerEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3XmlInitializerEClass.getESuperTypes().add(this.getIPrimaryExpression());
		as3NullLiteralEClass.getESuperTypes().add(this.getILiteral());
		as3BooleanLiteralEClass.getESuperTypes().add(this.getILiteral());
		as3NumberLiteralEClass.getESuperTypes().add(this.getILiteral());
		as3NumberLiteralEClass.getESuperTypes().add(this.getILiteralFieldName());
		as3StringLiteralEClass.getESuperTypes().add(this.getILiteral());
		as3StringLiteralEClass.getESuperTypes().add(this.getILiteralFieldName());
		as3RegexLiteralEClass.getESuperTypes().add(this.getILiteral());
		as3ConditionalBlockEClass.getESuperTypes().add(this.getIStatement());
		as3ReservedAttributeEClass.getESuperTypes().add(this.getIAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(iDirectiveEClass, IDirective.class, "IDirective", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iPackageDirectiveEClass, IPackageDirective.class, "IPackageDirective", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iTypeDirectiveEClass, ITypeDirective.class, "ITypeDirective", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iBlockDirectiveEClass, IBlockDirective.class, "IBlockDirective", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iStatementEClass, IStatement.class, "IStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iExpressionEClass, IExpression.class, "IExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iExpressionEClass, this.getAvmTypeAccess(), "resolveType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iAssignmentExpressionEClass, IAssignmentExpression.class, "IAssignmentExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iConditionalExpressionEClass, IConditionalExpression.class, "IConditionalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iLogicalExpressionEClass, ILogicalExpression.class, "ILogicalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iBitwiseExpressionEClass, IBitwiseExpression.class, "IBitwiseExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iEqualityExpressionEClass, IEqualityExpression.class, "IEqualityExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRelationalExpressionEClass, IRelationalExpression.class, "IRelationalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iArithmeticExpressionEClass, IArithmeticExpression.class, "IArithmeticExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iUnaryExpressionEClass, IUnaryExpression.class, "IUnaryExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iPostfixExpressionEClass, IPostfixExpression.class, "IPostfixExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iPrimaryExpressionEClass, IPrimaryExpression.class, "IPrimaryExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iIdentifierEClass, IIdentifier.class, "IIdentifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iLiteralEClass, ILiteral.class, "ILiteral", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iLiteralFieldNameEClass, ILiteralFieldName.class, "ILiteralFieldName", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iCaseElementEClass, ICaseElement.class, "ICaseElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iNonAttributeIdentifierEClass, INonAttributeIdentifier.class, "INonAttributeIdentifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iAttributeEClass, IAttribute.class, "IAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iForInitEClass, IForInit.class, "IForInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iForInInitEClass, IForInInit.class, "IForInInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ElementEClass, As3Element.class, "As3Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3IdentifiableEClass, As3Identifiable.class, "As3Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3DefinitionEClass, As3Definition.class, "As3Definition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3Definition_Name(), ecorePackage.getEString(), "name", null, 0, 1, As3Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3Definition_Attributes(), this.getAs3Attributes(), null, "attributes", null, 0, 1, As3Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3MemberEClass, As3Member.class, "As3Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ExecutableEClass, As3Executable.class, "As3Executable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Executable_Parameters(), this.getAs3Parameter(), null, "parameters", null, 0, -1, As3Executable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(as3ExecutableEClass, null, "getDeclarations", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getIterable());
		EGenericType g2 = createEGenericType(theAvmEPackage.getAvmReferable());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(as3ExecutableEClass, null, "getDirectives", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getIterable());
		g2 = createEGenericType(this.getIDirective());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(as3ProgramEClass, As3Program.class, "As3Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Program_Package(), this.getAs3Package(), null, "package", null, 0, 1, As3Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3Program_Directives(), this.getIDirective(), null, "directives", null, 0, -1, As3Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ImportEClass, As3Import.class, "As3Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3Import_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, As3Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ImportListEClass, As3ImportList.class, "As3ImportList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ImportList_Imports(), this.getAs3Import(), null, "imports", null, 0, -1, As3ImportList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3IncludeEClass, As3Include.class, "As3Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3Include_Target(), ecorePackage.getEString(), "target", null, 0, 1, As3Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3UseEClass, As3Use.class, "As3Use", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Use_Target(), this.getAs3ExpressionList(), null, "target", null, 0, 1, As3Use.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3PackageEClass, As3Package.class, "As3Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Package_Directives(), this.getIDirective(), null, "directives", null, 0, -1, As3Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3Package_CanonicalName(), ecorePackage.getEString(), "canonicalName", null, 0, 1, As3Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3TypeEClass, As3Type.class, "As3Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Type_ExtendedInterfaces(), theAvmEPackage.getAvmTypeReference(), null, "extendedInterfaces", null, 0, -1, As3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3Type_Directives(), this.getIDirective(), null, "directives", null, 0, -1, As3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ClassEClass, As3Class.class, "As3Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Class_ExtendedClass(), theAvmEPackage.getAvmTypeReference(), null, "extendedClass", null, 0, 1, As3Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3InterfaceEClass, As3Interface.class, "As3Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3NamespaceEClass, As3Namespace.class, "As3Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Namespace_Expression(), this.getIExpression(), null, "expression", null, 0, 1, As3Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3VariableEClass, As3Variable.class, "As3Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Variable_Type(), theAvmEPackage.getAvmTypeReference(), null, "type", null, 0, 1, As3Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3Variable_Name(), ecorePackage.getEString(), "name", null, 0, 1, As3Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3VariableAssignEClass, As3VariableAssign.class, "As3VariableAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3VariableAssign_Expression(), this.getIExpression(), null, "expression", null, 0, 1, As3VariableAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3VariableDefinitionEClass, As3VariableDefinition.class, "As3VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3VariableDefinition_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, As3VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3VariableDefinition_Bindings(), this.getAs3Variable(), null, "bindings", null, 0, -1, As3VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ParameterEClass, As3Parameter.class, "As3Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ParameterAssignEClass, As3ParameterAssign.class, "As3ParameterAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ParameterAssign_Expression(), this.getIExpression(), null, "expression", null, 0, 1, As3ParameterAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ParameterRestEClass, As3ParameterRest.class, "As3ParameterRest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3FieldBindingEClass, As3FieldBinding.class, "As3FieldBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3FieldBinding_Type(), theAvmEPackage.getAvmTypeReference(), null, "type", null, 0, 1, As3FieldBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3FieldBinding_Expression(), this.getIExpression(), null, "expression", null, 0, 1, As3FieldBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3FieldDefinitionEClass, As3FieldDefinition.class, "As3FieldDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3FieldDefinition_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, As3FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3FieldDefinition_Bindings(), this.getAs3FieldBinding(), null, "bindings", null, 0, -1, As3FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3FieldDefinition_Attributes(), this.getAs3Attributes(), null, "attributes", null, 0, 1, As3FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3OperationEClass, As3Operation.class, "As3Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3Operation_Getter(), ecorePackage.getEBoolean(), "getter", null, 0, 1, As3Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3Operation_Setter(), ecorePackage.getEBoolean(), "setter", null, 0, 1, As3Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3Operation_ReturnType(), theAvmEPackage.getAvmTypeReference(), null, "returnType", null, 0, 1, As3Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3Operation_Body(), this.getAs3Block(), null, "body", null, 0, 1, As3Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ConstructorEClass, As3Constructor.class, "As3Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Constructor_Body(), this.getAs3Block(), null, "body", null, 0, 1, As3Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3MetadataTagEClass, As3MetadataTag.class, "As3MetadataTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3MetadataTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, As3MetadataTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3MetadataTag_Parameters(), this.getAs3MetadataParameter(), null, "parameters", null, 0, -1, As3MetadataTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3MetadataParameterEClass, As3MetadataParameter.class, "As3MetadataParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3MetadataParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, As3MetadataParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3MetadataParameter_Value(), this.getILiteral(), null, "value", null, 0, 1, As3MetadataParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3AttributeExpressionEClass, As3AttributeExpression.class, "As3AttributeExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3SimpleAttributeExpressionEClass, As3SimpleAttributeExpression.class, "As3SimpleAttributeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3SimpleAttributeExpression_Ident(), this.getIIdentifier(), null, "ident", null, 0, 1, As3SimpleAttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3QualifiedAttributeExpressionEClass, As3QualifiedAttributeExpression.class, "As3QualifiedAttributeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3QualifiedAttributeExpression_Qualifier(), this.getAs3AttributeExpression(), null, "qualifier", null, 0, 1, As3QualifiedAttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3QualifiedAttributeExpression_Identifier(), this.getIIdentifier(), null, "identifier", null, 0, 1, As3QualifiedAttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3DefaultXmlNamespaceStatementEClass, As3DefaultXmlNamespaceStatement.class, "As3DefaultXmlNamespaceStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3DefaultXmlNamespaceStatement_Expression(), this.getIExpression(), null, "expression", null, 0, 1, As3DefaultXmlNamespaceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3TryStatementEClass, As3TryStatement.class, "As3TryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3TryStatement_Block(), this.getAs3Block(), null, "block", null, 0, 1, As3TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3TryStatement_Catches(), this.getAs3CatchClause(), null, "catches", null, 0, -1, As3TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3TryStatement_FinalBlock(), this.getAs3Block(), null, "finalBlock", null, 0, 1, As3TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3CatchClauseEClass, As3CatchClause.class, "As3CatchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3CatchClause_Error(), theAvmEPackage.getAvmParameter(), null, "error", null, 0, 1, As3CatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3CatchClause_Block(), this.getAs3Block(), null, "block", null, 0, 1, As3CatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ThrowStatementEClass, As3ThrowStatement.class, "As3ThrowStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ThrowStatement_Expression(), this.getAs3ExpressionList(), null, "expression", null, 0, 1, As3ThrowStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ReturnStatementEClass, As3ReturnStatement.class, "As3ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ReturnStatement_Expression(), this.getAs3ExpressionList(), null, "expression", null, 0, 1, As3ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3WithStatementEClass, As3WithStatement.class, "As3WithStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3WithStatement_Target(), this.getAs3ExpressionList(), null, "target", null, 0, 1, As3WithStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3WithStatement_Statement(), this.getIStatement(), null, "statement", null, 0, 1, As3WithStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3BreakStatementEClass, As3BreakStatement.class, "As3BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3BreakStatement_LabelName(), ecorePackage.getEString(), "labelName", null, 0, 1, As3BreakStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3BreakStatement_Label(), this.getAs3LabeledStatement(), null, "label", null, 0, 1, As3BreakStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ContinueStatementEClass, As3ContinueStatement.class, "As3ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3ContinueStatement_LabelName(), ecorePackage.getEString(), "labelName", null, 0, 1, As3ContinueStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3ContinueStatement_Label(), this.getAs3LabeledStatement(), null, "label", null, 0, 1, As3ContinueStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3IterationStatementEClass, As3IterationStatement.class, "As3IterationStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3IterationStatement_Statement(), this.getIStatement(), null, "statement", null, 0, 1, As3IterationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ConditionalIterationStatementEClass, As3ConditionalIterationStatement.class, "As3ConditionalIterationStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ConditionalIterationStatement_Conditions(), this.getAs3ExpressionList(), null, "conditions", null, 0, 1, As3ConditionalIterationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3DoStatementEClass, As3DoStatement.class, "As3DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3WhileStatementEClass, As3WhileStatement.class, "As3WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ForStatementEClass, As3ForStatement.class, "As3ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ForStatement_Init(), this.getIForInit(), null, "init", null, 0, 1, As3ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3ForStatement_Iter(), this.getAs3ExpressionList(), null, "iter", null, 0, 1, As3ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ForInStatementEClass, As3ForInStatement.class, "As3ForInStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ForInStatement_Target(), this.getAs3ExpressionList(), null, "target", null, 0, 1, As3ForInStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3ForInStatement_Init(), this.getIForInInit(), null, "init", null, 0, 1, As3ForInStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3ForInStatement_ForEach(), ecorePackage.getEBoolean(), "forEach", null, 0, 1, As3ForInStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ConditionalStatementEClass, As3ConditionalStatement.class, "As3ConditionalStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ConditionalStatement_Conditions(), this.getAs3ExpressionList(), null, "conditions", null, 0, 1, As3ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3SwitchStatementEClass, As3SwitchStatement.class, "As3SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3SwitchStatement_Cases(), this.getICaseElement(), null, "cases", null, 0, -1, As3SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3CaseLabelEClass, As3CaseLabel.class, "As3CaseLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3DefaultCaseEClass, As3DefaultCase.class, "As3DefaultCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ExpressionCaseEClass, As3ExpressionCase.class, "As3ExpressionCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ExpressionCase_Expressions(), this.getAs3ExpressionList(), null, "expressions", null, 0, 1, As3ExpressionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3IfStatementEClass, As3IfStatement.class, "As3IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3IfStatement_Statement(), this.getIStatement(), null, "statement", null, 0, 1, As3IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3IfStatement_ElseStatement(), this.getIStatement(), null, "elseStatement", null, 0, 1, As3IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3LabeledStatementEClass, As3LabeledStatement.class, "As3LabeledStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3LabeledStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, As3LabeledStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3LabeledStatement_Statement(), this.getIStatement(), null, "statement", null, 0, 1, As3LabeledStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3BlockEClass, As3Block.class, "As3Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Block_Directives(), this.getIDirective(), null, "directives", null, 0, -1, As3Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3SuperStatementEClass, As3SuperStatement.class, "As3SuperStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3SuperStatement_Arguments(), this.getAs3ExpressionList(), null, "arguments", null, 0, 1, As3SuperStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ExpressionStatementEClass, As3ExpressionStatement.class, "As3ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ExpressionStatement_Expressions(), this.getIExpression(), null, "expressions", null, 0, -1, As3ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3EmptyStatementEClass, As3EmptyStatement.class, "As3EmptyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ExpressionListEClass, As3ExpressionList.class, "As3ExpressionList", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ExpressionList_Expressions(), this.getIExpression(), null, "expressions", null, 0, -1, As3ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ListExpressionEClass, As3ListExpression.class, "As3ListExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ArgumentsEClass, As3Arguments.class, "As3Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3AssignmentExpressionEClass, As3AssignmentExpression.class, "As3AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ConditionalExpressionEClass, As3ConditionalExpression.class, "As3ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ConditionalExpression_Condition(), this.getILogicalExpression(), null, "condition", null, 0, 1, As3ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3ConditionalExpression_Statement(), this.getIExpression(), null, "statement", null, 0, 1, As3ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3ConditionalExpression_ElseStatement(), this.getIExpression(), null, "elseStatement", null, 0, 1, As3ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3BinaryExpressionEClass, As3BinaryExpression.class, "As3BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3BinaryExpression_Left(), this.getIExpression(), null, "left", null, 0, 1, As3BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3BinaryExpression_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, As3BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3BinaryExpression_Right(), this.getIExpression(), null, "right", null, 0, 1, As3BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3LogicalExpressionEClass, As3LogicalExpression.class, "As3LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3BitwiseExpressionEClass, As3BitwiseExpression.class, "As3BitwiseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3EqualityExpressionEClass, As3EqualityExpression.class, "As3EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3RelationalExpressionEClass, As3RelationalExpression.class, "As3RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ShiftExpressionEClass, As3ShiftExpression.class, "As3ShiftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3AdditiveExpressionEClass, As3AdditiveExpression.class, "As3AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3MultiplicativeExpressionEClass, As3MultiplicativeExpression.class, "As3MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3UnaryExpressionEClass, As3UnaryExpression.class, "As3UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3UnaryExpression_Expression(), this.getIUnaryExpression(), null, "expression", null, 0, 1, As3UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3DeleteExpressionEClass, As3DeleteExpression.class, "As3DeleteExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3VoidExpressionEClass, As3VoidExpression.class, "As3VoidExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3TypeOfExpressionEClass, As3TypeOfExpression.class, "As3TypeOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3PreIncrementExpressionEClass, As3PreIncrementExpression.class, "As3PreIncrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3PreDecrementExpressionEClass, As3PreDecrementExpression.class, "As3PreDecrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3UnaryPlusExpressionEClass, As3UnaryPlusExpression.class, "As3UnaryPlusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3UnaryMinusExpressionEClass, As3UnaryMinusExpression.class, "As3UnaryMinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3BitwiseNotExpressionEClass, As3BitwiseNotExpression.class, "As3BitwiseNotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3LogicalNotExpressionEClass, As3LogicalNotExpression.class, "As3LogicalNotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3PostfixExpressionEClass, As3PostfixExpression.class, "As3PostfixExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3PostfixExpression_Expression(), this.getIPostfixExpression(), null, "expression", null, 0, 1, As3PostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3PostIncrementExpressionEClass, As3PostIncrementExpression.class, "As3PostIncrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3PostDecrementExpressionEClass, As3PostDecrementExpression.class, "As3PostDecrementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3InvocationExpressionEClass, As3InvocationExpression.class, "As3InvocationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3InvocationExpression_Arguments(), this.getAs3ExpressionList(), null, "arguments", null, 0, 1, As3InvocationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3AccessExpressionEClass, As3AccessExpression.class, "As3AccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3AccessExpression_Operator(), this.getAs3PropertyOperator(), null, "operator", null, 0, 1, As3AccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3QueryExpressionEClass, As3QueryExpression.class, "As3QueryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3QueryExpression_Operator(), this.getAs3QueryOperator(), null, "operator", null, 0, 1, As3QueryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3PostfixOperatorEClass, As3PostfixOperator.class, "As3PostfixOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3PostfixOperator_Identifier(), this.getIIdentifier(), null, "identifier", null, 0, 1, As3PostfixOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3PostfixOperator_Expressions(), this.getAs3ExpressionList(), null, "expressions", null, 0, 1, As3PostfixOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3PropertyOperatorEClass, As3PropertyOperator.class, "As3PropertyOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3QueryOperatorEClass, As3QueryOperator.class, "As3QueryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3SimpleIdentifierEClass, As3SimpleIdentifier.class, "As3SimpleIdentifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3SimpleIdentifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, As3SimpleIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3SimpleIdentifier_Reference(), theAvmEPackage.getAvmReferable(), null, "reference", null, 0, 1, As3SimpleIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3PropertyIdentifierEClass, As3PropertyIdentifier.class, "As3PropertyIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3QualifiedIdentifierEClass, As3QualifiedIdentifier.class, "As3QualifiedIdentifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3QualifiedIdentifier_Expressions(), this.getAs3ExpressionList(), null, "expressions", null, 0, 1, As3QualifiedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3QualifiedIdentifier_Identifier(), this.getIIdentifier(), null, "identifier", null, 0, 1, As3QualifiedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3AttributeQualifiedIdentifierEClass, As3AttributeQualifiedIdentifier.class, "As3AttributeQualifiedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3NonAttributeQualifiedIdentifierEClass, As3NonAttributeQualifiedIdentifier.class, "As3NonAttributeQualifiedIdentifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3SimpleQualifiedIdentifierEClass, As3SimpleQualifiedIdentifier.class, "As3SimpleQualifiedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3SimpleQualifiedIdentifier_Qualifier(), this.getIExpression(), null, "qualifier", null, 0, 1, As3SimpleQualifiedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ExpressionQualifiedIdentifierEClass, As3ExpressionQualifiedIdentifier.class, "As3ExpressionQualifiedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ExpressionQualifiedIdentifier_Qualifier(), this.getIExpression(), null, "qualifier", null, 0, 1, As3ExpressionQualifiedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ThisExpressionEClass, As3ThisExpression.class, "As3ThisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3SuperExpressionEClass, As3SuperExpression.class, "As3SuperExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3ParenListExpressionEClass, As3ParenListExpression.class, "As3ParenListExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3FunctionExpressionEClass, As3FunctionExpression.class, "As3FunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3FunctionExpression_ReturnType(), theAvmEPackage.getAvmTypeReference(), null, "returnType", null, 0, 1, As3FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3FunctionExpression_Body(), this.getAs3Block(), null, "body", null, 0, 1, As3FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3FunctionExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, As3FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3NewExpressionEClass, As3NewExpression.class, "As3NewExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3NewExpression_Target(), this.getIPostfixExpression(), null, "target", null, 0, 1, As3NewExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ArrayInitializerEClass, As3ArrayInitializer.class, "As3ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ArrayInitializer_Elements(), this.getAs3ArrayElement(), null, "elements", null, 0, -1, As3ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ArrayElementEClass, As3ArrayElement.class, "As3ArrayElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ArrayElement_Expression(), this.getIExpression(), null, "expression", null, 0, 1, As3ArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ObjectInitializerEClass, As3ObjectInitializer.class, "As3ObjectInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ObjectInitializer_Fields(), this.getAs3LiteralField(), null, "fields", null, 0, -1, As3ObjectInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3LiteralFieldEClass, As3LiteralField.class, "As3LiteralField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3LiteralField_Name(), this.getILiteralFieldName(), null, "name", null, 0, 1, As3LiteralField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3LiteralField_Expression(), this.getIExpression(), null, "expression", null, 0, 1, As3LiteralField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3XmlInitializerEClass, As3XmlInitializer.class, "As3XmlInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3XmlInitializer_Value(), ecorePackage.getEString(), "value", null, 0, 1, As3XmlInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3NullLiteralEClass, As3NullLiteral.class, "As3NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(as3BooleanLiteralEClass, As3BooleanLiteral.class, "As3BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3BooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, As3BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3NumberLiteralEClass, As3NumberLiteral.class, "As3NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3NumberLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, As3NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3StringLiteralEClass, As3StringLiteral.class, "As3StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3StringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, As3StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3RegexLiteralEClass, As3RegexLiteral.class, "As3RegexLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3RegexLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, As3RegexLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ConditionalBlockEClass, As3ConditionalBlock.class, "As3ConditionalBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3ConditionalBlock_Condition(), this.getIIdentifier(), null, "condition", null, 0, 1, As3ConditionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAs3ConditionalBlock_Body(), this.getAs3Block(), null, "body", null, 0, 1, As3ConditionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(as3ReservedAttributeEClass, As3ReservedAttribute.class, "As3ReservedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAs3ReservedAttribute_Visibility(), theAvmEPackage.getAvmVisibility(), "visibility", null, 0, 1, As3ReservedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3ReservedAttribute_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, As3ReservedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3ReservedAttribute_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, As3ReservedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3ReservedAttribute_Dynamic(), ecorePackage.getEBoolean(), "dynamic", null, 0, 1, As3ReservedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3ReservedAttribute_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, As3ReservedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAs3ReservedAttribute_Native(), ecorePackage.getEBoolean(), "native", null, 0, 1, As3ReservedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(as3ReservedAttributeEClass, ecorePackage.getEBoolean(), "isVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(as3AttributesEClass, As3Attributes.class, "As3Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAs3Attributes_Attributes(), this.getIAttribute(), null, "attributes", null, 0, -1, As3Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(as3AttributesEClass, ecorePackage.getEBoolean(), "isDynamic", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(as3AttributesEClass, ecorePackage.getEBoolean(), "isFinal", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(as3AttributesEClass, theAvmEPackage.getAvmVisibility(), "getVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(as3AttributesEClass, ecorePackage.getEBoolean(), "isStatic", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(as3AttributesEClass, ecorePackage.getEBoolean(), "isNative", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(as3AttributesEClass, ecorePackage.getEBoolean(), "isOverride", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(iterableEDataType, Iterable.class, "Iterable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(avmTypeAccessEDataType, AvmTypeAccess.class, "AvmTypeAccess", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //As3EPackageImpl
