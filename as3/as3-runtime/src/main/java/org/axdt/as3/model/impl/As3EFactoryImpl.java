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
import org.axdt.as3.model.*;
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
public class As3EFactoryImpl extends EFactoryImpl implements As3EFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static As3EFactory init() {
		try {
			As3EFactory theAs3EFactory = (As3EFactory)EPackage.Registry.INSTANCE.getEFactory("http://axdt.org/uri/As3"); 
			if (theAs3EFactory != null) {
				return theAs3EFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new As3EFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3EFactoryImpl() {
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
			case As3EPackage.IFOR_INIT: return createIForInit();
			case As3EPackage.IFOR_IN_INIT: return createIForInInit();
			case As3EPackage.AS3_PROGRAM: return createAs3Program();
			case As3EPackage.AS3_IMPORT: return createAs3Import();
			case As3EPackage.AS3_IMPORT_LIST: return createAs3ImportList();
			case As3EPackage.AS3_INCLUDE: return createAs3Include();
			case As3EPackage.AS3_USE: return createAs3Use();
			case As3EPackage.AS3_PACKAGE: return createAs3Package();
			case As3EPackage.AS3_CLASS: return createAs3Class();
			case As3EPackage.AS3_INTERFACE: return createAs3Interface();
			case As3EPackage.AS3_NAMESPACE: return createAs3Namespace();
			case As3EPackage.AS3_VARIABLE: return createAs3Variable();
			case As3EPackage.AS3_VARIABLE_ASSIGN: return createAs3VariableAssign();
			case As3EPackage.AS3_VARIABLE_DEFINITION: return createAs3VariableDefinition();
			case As3EPackage.AS3_PARAMETER_ASSIGN: return createAs3ParameterAssign();
			case As3EPackage.AS3_PARAMETER_REST: return createAs3ParameterRest();
			case As3EPackage.AS3_FIELD_BINDING: return createAs3FieldBinding();
			case As3EPackage.AS3_FIELD_DEFINITION: return createAs3FieldDefinition();
			case As3EPackage.AS3_OPERATION: return createAs3Operation();
			case As3EPackage.AS3_CONSTRUCTOR: return createAs3Constructor();
			case As3EPackage.AS3_METADATA_TAG: return createAs3MetadataTag();
			case As3EPackage.AS3_METADATA_PARAMETER: return createAs3MetadataParameter();
			case As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION: return createAs3SimpleAttributeExpression();
			case As3EPackage.AS3_QUALIFIED_ATTRIBUTE_EXPRESSION: return createAs3QualifiedAttributeExpression();
			case As3EPackage.AS3_DEFAULT_XML_NAMESPACE_STATEMENT: return createAs3DefaultXmlNamespaceStatement();
			case As3EPackage.AS3_TRY_STATEMENT: return createAs3TryStatement();
			case As3EPackage.AS3_CATCH_CLAUSE: return createAs3CatchClause();
			case As3EPackage.AS3_THROW_STATEMENT: return createAs3ThrowStatement();
			case As3EPackage.AS3_RETURN_STATEMENT: return createAs3ReturnStatement();
			case As3EPackage.AS3_WITH_STATEMENT: return createAs3WithStatement();
			case As3EPackage.AS3_BREAK_STATEMENT: return createAs3BreakStatement();
			case As3EPackage.AS3_CONTINUE_STATEMENT: return createAs3ContinueStatement();
			case As3EPackage.AS3_DO_STATEMENT: return createAs3DoStatement();
			case As3EPackage.AS3_WHILE_STATEMENT: return createAs3WhileStatement();
			case As3EPackage.AS3_FOR_STATEMENT: return createAs3ForStatement();
			case As3EPackage.AS3_FOR_IN_STATEMENT: return createAs3ForInStatement();
			case As3EPackage.AS3_SWITCH_STATEMENT: return createAs3SwitchStatement();
			case As3EPackage.AS3_DEFAULT_CASE: return createAs3DefaultCase();
			case As3EPackage.AS3_EXPRESSION_CASE: return createAs3ExpressionCase();
			case As3EPackage.AS3_IF_STATEMENT: return createAs3IfStatement();
			case As3EPackage.AS3_LABELED_STATEMENT: return createAs3LabeledStatement();
			case As3EPackage.AS3_BLOCK: return createAs3Block();
			case As3EPackage.AS3_SUPER_STATEMENT: return createAs3SuperStatement();
			case As3EPackage.AS3_EXPRESSION_STATEMENT: return createAs3ExpressionStatement();
			case As3EPackage.AS3_EMPTY_STATEMENT: return createAs3EmptyStatement();
			case As3EPackage.AS3_LIST_EXPRESSION: return createAs3ListExpression();
			case As3EPackage.AS3_ARGUMENTS: return createAs3Arguments();
			case As3EPackage.AS3_ASSIGNMENT_EXPRESSION: return createAs3AssignmentExpression();
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION: return createAs3ConditionalExpression();
			case As3EPackage.AS3_LOGICAL_EXPRESSION: return createAs3LogicalExpression();
			case As3EPackage.AS3_BITWISE_EXPRESSION: return createAs3BitwiseExpression();
			case As3EPackage.AS3_EQUALITY_EXPRESSION: return createAs3EqualityExpression();
			case As3EPackage.AS3_RELATIONAL_EXPRESSION: return createAs3RelationalExpression();
			case As3EPackage.AS3_SHIFT_EXPRESSION: return createAs3ShiftExpression();
			case As3EPackage.AS3_ADDITIVE_EXPRESSION: return createAs3AdditiveExpression();
			case As3EPackage.AS3_MULTIPLICATIVE_EXPRESSION: return createAs3MultiplicativeExpression();
			case As3EPackage.AS3_DELETE_EXPRESSION: return createAs3DeleteExpression();
			case As3EPackage.AS3_VOID_EXPRESSION: return createAs3VoidExpression();
			case As3EPackage.AS3_TYPE_OF_EXPRESSION: return createAs3TypeOfExpression();
			case As3EPackage.AS3_PRE_INCREMENT_EXPRESSION: return createAs3PreIncrementExpression();
			case As3EPackage.AS3_PRE_DECREMENT_EXPRESSION: return createAs3PreDecrementExpression();
			case As3EPackage.AS3_UNARY_PLUS_EXPRESSION: return createAs3UnaryPlusExpression();
			case As3EPackage.AS3_UNARY_MINUS_EXPRESSION: return createAs3UnaryMinusExpression();
			case As3EPackage.AS3_BITWISE_NOT_EXPRESSION: return createAs3BitwiseNotExpression();
			case As3EPackage.AS3_LOGICAL_NOT_EXPRESSION: return createAs3LogicalNotExpression();
			case As3EPackage.AS3_POST_INCREMENT_EXPRESSION: return createAs3PostIncrementExpression();
			case As3EPackage.AS3_POST_DECREMENT_EXPRESSION: return createAs3PostDecrementExpression();
			case As3EPackage.AS3_INVOCATION_EXPRESSION: return createAs3InvocationExpression();
			case As3EPackage.AS3_ACCESS_EXPRESSION: return createAs3AccessExpression();
			case As3EPackage.AS3_QUERY_EXPRESSION: return createAs3QueryExpression();
			case As3EPackage.AS3_PROPERTY_OPERATOR: return createAs3PropertyOperator();
			case As3EPackage.AS3_QUERY_OPERATOR: return createAs3QueryOperator();
			case As3EPackage.AS3_PROPERTY_IDENTIFIER: return createAs3PropertyIdentifier();
			case As3EPackage.AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER: return createAs3AttributeQualifiedIdentifier();
			case As3EPackage.AS3_SIMPLE_QUALIFIED_IDENTIFIER: return createAs3SimpleQualifiedIdentifier();
			case As3EPackage.AS3_EXPRESSION_QUALIFIED_IDENTIFIER: return createAs3ExpressionQualifiedIdentifier();
			case As3EPackage.AS3_THIS_EXPRESSION: return createAs3ThisExpression();
			case As3EPackage.AS3_SUPER_EXPRESSION: return createAs3SuperExpression();
			case As3EPackage.AS3_PAREN_LIST_EXPRESSION: return createAs3ParenListExpression();
			case As3EPackage.AS3_FUNCTION_EXPRESSION: return createAs3FunctionExpression();
			case As3EPackage.AS3_NEW_EXPRESSION: return createAs3NewExpression();
			case As3EPackage.AS3_ARRAY_INITIALIZER: return createAs3ArrayInitializer();
			case As3EPackage.AS3_ARRAY_ELEMENT: return createAs3ArrayElement();
			case As3EPackage.AS3_OBJECT_INITIALIZER: return createAs3ObjectInitializer();
			case As3EPackage.AS3_LITERAL_FIELD: return createAs3LiteralField();
			case As3EPackage.AS3_XML_INITIALIZER: return createAs3XmlInitializer();
			case As3EPackage.AS3_NULL_LITERAL: return createAs3NullLiteral();
			case As3EPackage.AS3_BOOLEAN_LITERAL: return createAs3BooleanLiteral();
			case As3EPackage.AS3_NUMBER_LITERAL: return createAs3NumberLiteral();
			case As3EPackage.AS3_STRING_LITERAL: return createAs3StringLiteral();
			case As3EPackage.AS3_REGEX_LITERAL: return createAs3RegexLiteral();
			case As3EPackage.AS3_CONDITIONAL_BLOCK: return createAs3ConditionalBlock();
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
			case As3EPackage.ITERABLE:
				return createIterableFromString(eDataType, initialValue);
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
			case As3EPackage.ITERABLE:
				return convertIterableToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IForInit createIForInit() {
		IForInitImpl iForInit = new IForInitImpl();
		return iForInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IForInInit createIForInInit() {
		IForInInitImpl iForInInit = new IForInInitImpl();
		return iForInInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Program createAs3Program() {
		As3ProgramImpl as3Program = new As3ProgramImpl();
		return as3Program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Import createAs3Import() {
		As3ImportImpl as3Import = new As3ImportImpl();
		return as3Import;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ImportList createAs3ImportList() {
		As3ImportListImpl as3ImportList = new As3ImportListImpl();
		return as3ImportList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Include createAs3Include() {
		As3IncludeImpl as3Include = new As3IncludeImpl();
		return as3Include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Use createAs3Use() {
		As3UseImpl as3Use = new As3UseImpl();
		return as3Use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Package createAs3Package() {
		As3PackageImpl as3Package = new As3PackageImpl();
		return as3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Class createAs3Class() {
		As3ClassImpl as3Class = new As3ClassImpl();
		return as3Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Interface createAs3Interface() {
		As3InterfaceImpl as3Interface = new As3InterfaceImpl();
		return as3Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Namespace createAs3Namespace() {
		As3NamespaceImpl as3Namespace = new As3NamespaceImpl();
		return as3Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Variable createAs3Variable() {
		As3VariableImpl as3Variable = new As3VariableImpl();
		return as3Variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3VariableAssign createAs3VariableAssign() {
		As3VariableAssignImpl as3VariableAssign = new As3VariableAssignImpl();
		return as3VariableAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3VariableDefinition createAs3VariableDefinition() {
		As3VariableDefinitionImpl as3VariableDefinition = new As3VariableDefinitionImpl();
		return as3VariableDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ParameterAssign createAs3ParameterAssign() {
		As3ParameterAssignImpl as3ParameterAssign = new As3ParameterAssignImpl();
		return as3ParameterAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ParameterRest createAs3ParameterRest() {
		As3ParameterRestImpl as3ParameterRest = new As3ParameterRestImpl();
		return as3ParameterRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3FieldBinding createAs3FieldBinding() {
		As3FieldBindingImpl as3FieldBinding = new As3FieldBindingImpl();
		return as3FieldBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3FieldDefinition createAs3FieldDefinition() {
		As3FieldDefinitionImpl as3FieldDefinition = new As3FieldDefinitionImpl();
		return as3FieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Operation createAs3Operation() {
		As3OperationImpl as3Operation = new As3OperationImpl();
		return as3Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Constructor createAs3Constructor() {
		As3ConstructorImpl as3Constructor = new As3ConstructorImpl();
		return as3Constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3MetadataTag createAs3MetadataTag() {
		As3MetadataTagImpl as3MetadataTag = new As3MetadataTagImpl();
		return as3MetadataTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3MetadataParameter createAs3MetadataParameter() {
		As3MetadataParameterImpl as3MetadataParameter = new As3MetadataParameterImpl();
		return as3MetadataParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3SimpleAttributeExpression createAs3SimpleAttributeExpression() {
		As3SimpleAttributeExpressionImpl as3SimpleAttributeExpression = new As3SimpleAttributeExpressionImpl();
		return as3SimpleAttributeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3QualifiedAttributeExpression createAs3QualifiedAttributeExpression() {
		As3QualifiedAttributeExpressionImpl as3QualifiedAttributeExpression = new As3QualifiedAttributeExpressionImpl();
		return as3QualifiedAttributeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3DefaultXmlNamespaceStatement createAs3DefaultXmlNamespaceStatement() {
		As3DefaultXmlNamespaceStatementImpl as3DefaultXmlNamespaceStatement = new As3DefaultXmlNamespaceStatementImpl();
		return as3DefaultXmlNamespaceStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3TryStatement createAs3TryStatement() {
		As3TryStatementImpl as3TryStatement = new As3TryStatementImpl();
		return as3TryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3CatchClause createAs3CatchClause() {
		As3CatchClauseImpl as3CatchClause = new As3CatchClauseImpl();
		return as3CatchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ThrowStatement createAs3ThrowStatement() {
		As3ThrowStatementImpl as3ThrowStatement = new As3ThrowStatementImpl();
		return as3ThrowStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ReturnStatement createAs3ReturnStatement() {
		As3ReturnStatementImpl as3ReturnStatement = new As3ReturnStatementImpl();
		return as3ReturnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3WithStatement createAs3WithStatement() {
		As3WithStatementImpl as3WithStatement = new As3WithStatementImpl();
		return as3WithStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3BreakStatement createAs3BreakStatement() {
		As3BreakStatementImpl as3BreakStatement = new As3BreakStatementImpl();
		return as3BreakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ContinueStatement createAs3ContinueStatement() {
		As3ContinueStatementImpl as3ContinueStatement = new As3ContinueStatementImpl();
		return as3ContinueStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3DoStatement createAs3DoStatement() {
		As3DoStatementImpl as3DoStatement = new As3DoStatementImpl();
		return as3DoStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3WhileStatement createAs3WhileStatement() {
		As3WhileStatementImpl as3WhileStatement = new As3WhileStatementImpl();
		return as3WhileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ForStatement createAs3ForStatement() {
		As3ForStatementImpl as3ForStatement = new As3ForStatementImpl();
		return as3ForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ForInStatement createAs3ForInStatement() {
		As3ForInStatementImpl as3ForInStatement = new As3ForInStatementImpl();
		return as3ForInStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3SwitchStatement createAs3SwitchStatement() {
		As3SwitchStatementImpl as3SwitchStatement = new As3SwitchStatementImpl();
		return as3SwitchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3DefaultCase createAs3DefaultCase() {
		As3DefaultCaseImpl as3DefaultCase = new As3DefaultCaseImpl();
		return as3DefaultCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ExpressionCase createAs3ExpressionCase() {
		As3ExpressionCaseImpl as3ExpressionCase = new As3ExpressionCaseImpl();
		return as3ExpressionCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3IfStatement createAs3IfStatement() {
		As3IfStatementImpl as3IfStatement = new As3IfStatementImpl();
		return as3IfStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3LabeledStatement createAs3LabeledStatement() {
		As3LabeledStatementImpl as3LabeledStatement = new As3LabeledStatementImpl();
		return as3LabeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Block createAs3Block() {
		As3BlockImpl as3Block = new As3BlockImpl();
		return as3Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3SuperStatement createAs3SuperStatement() {
		As3SuperStatementImpl as3SuperStatement = new As3SuperStatementImpl();
		return as3SuperStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ExpressionStatement createAs3ExpressionStatement() {
		As3ExpressionStatementImpl as3ExpressionStatement = new As3ExpressionStatementImpl();
		return as3ExpressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3EmptyStatement createAs3EmptyStatement() {
		As3EmptyStatementImpl as3EmptyStatement = new As3EmptyStatementImpl();
		return as3EmptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ListExpression createAs3ListExpression() {
		As3ListExpressionImpl as3ListExpression = new As3ListExpressionImpl();
		return as3ListExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Arguments createAs3Arguments() {
		As3ArgumentsImpl as3Arguments = new As3ArgumentsImpl();
		return as3Arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AssignmentExpression createAs3AssignmentExpression() {
		As3AssignmentExpressionImpl as3AssignmentExpression = new As3AssignmentExpressionImpl();
		return as3AssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ConditionalExpression createAs3ConditionalExpression() {
		As3ConditionalExpressionImpl as3ConditionalExpression = new As3ConditionalExpressionImpl();
		return as3ConditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3LogicalExpression createAs3LogicalExpression() {
		As3LogicalExpressionImpl as3LogicalExpression = new As3LogicalExpressionImpl();
		return as3LogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3BitwiseExpression createAs3BitwiseExpression() {
		As3BitwiseExpressionImpl as3BitwiseExpression = new As3BitwiseExpressionImpl();
		return as3BitwiseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3EqualityExpression createAs3EqualityExpression() {
		As3EqualityExpressionImpl as3EqualityExpression = new As3EqualityExpressionImpl();
		return as3EqualityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3RelationalExpression createAs3RelationalExpression() {
		As3RelationalExpressionImpl as3RelationalExpression = new As3RelationalExpressionImpl();
		return as3RelationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ShiftExpression createAs3ShiftExpression() {
		As3ShiftExpressionImpl as3ShiftExpression = new As3ShiftExpressionImpl();
		return as3ShiftExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AdditiveExpression createAs3AdditiveExpression() {
		As3AdditiveExpressionImpl as3AdditiveExpression = new As3AdditiveExpressionImpl();
		return as3AdditiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3MultiplicativeExpression createAs3MultiplicativeExpression() {
		As3MultiplicativeExpressionImpl as3MultiplicativeExpression = new As3MultiplicativeExpressionImpl();
		return as3MultiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3DeleteExpression createAs3DeleteExpression() {
		As3DeleteExpressionImpl as3DeleteExpression = new As3DeleteExpressionImpl();
		return as3DeleteExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3VoidExpression createAs3VoidExpression() {
		As3VoidExpressionImpl as3VoidExpression = new As3VoidExpressionImpl();
		return as3VoidExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3TypeOfExpression createAs3TypeOfExpression() {
		As3TypeOfExpressionImpl as3TypeOfExpression = new As3TypeOfExpressionImpl();
		return as3TypeOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PreIncrementExpression createAs3PreIncrementExpression() {
		As3PreIncrementExpressionImpl as3PreIncrementExpression = new As3PreIncrementExpressionImpl();
		return as3PreIncrementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PreDecrementExpression createAs3PreDecrementExpression() {
		As3PreDecrementExpressionImpl as3PreDecrementExpression = new As3PreDecrementExpressionImpl();
		return as3PreDecrementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3UnaryPlusExpression createAs3UnaryPlusExpression() {
		As3UnaryPlusExpressionImpl as3UnaryPlusExpression = new As3UnaryPlusExpressionImpl();
		return as3UnaryPlusExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3UnaryMinusExpression createAs3UnaryMinusExpression() {
		As3UnaryMinusExpressionImpl as3UnaryMinusExpression = new As3UnaryMinusExpressionImpl();
		return as3UnaryMinusExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3BitwiseNotExpression createAs3BitwiseNotExpression() {
		As3BitwiseNotExpressionImpl as3BitwiseNotExpression = new As3BitwiseNotExpressionImpl();
		return as3BitwiseNotExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3LogicalNotExpression createAs3LogicalNotExpression() {
		As3LogicalNotExpressionImpl as3LogicalNotExpression = new As3LogicalNotExpressionImpl();
		return as3LogicalNotExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PostIncrementExpression createAs3PostIncrementExpression() {
		As3PostIncrementExpressionImpl as3PostIncrementExpression = new As3PostIncrementExpressionImpl();
		return as3PostIncrementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PostDecrementExpression createAs3PostDecrementExpression() {
		As3PostDecrementExpressionImpl as3PostDecrementExpression = new As3PostDecrementExpressionImpl();
		return as3PostDecrementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3InvocationExpression createAs3InvocationExpression() {
		As3InvocationExpressionImpl as3InvocationExpression = new As3InvocationExpressionImpl();
		return as3InvocationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AccessExpression createAs3AccessExpression() {
		As3AccessExpressionImpl as3AccessExpression = new As3AccessExpressionImpl();
		return as3AccessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3QueryExpression createAs3QueryExpression() {
		As3QueryExpressionImpl as3QueryExpression = new As3QueryExpressionImpl();
		return as3QueryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PropertyOperator createAs3PropertyOperator() {
		As3PropertyOperatorImpl as3PropertyOperator = new As3PropertyOperatorImpl();
		return as3PropertyOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3QueryOperator createAs3QueryOperator() {
		As3QueryOperatorImpl as3QueryOperator = new As3QueryOperatorImpl();
		return as3QueryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3PropertyIdentifier createAs3PropertyIdentifier() {
		As3PropertyIdentifierImpl as3PropertyIdentifier = new As3PropertyIdentifierImpl();
		return as3PropertyIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3AttributeQualifiedIdentifier createAs3AttributeQualifiedIdentifier() {
		As3AttributeQualifiedIdentifierImpl as3AttributeQualifiedIdentifier = new As3AttributeQualifiedIdentifierImpl();
		return as3AttributeQualifiedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3SimpleQualifiedIdentifier createAs3SimpleQualifiedIdentifier() {
		As3SimpleQualifiedIdentifierImpl as3SimpleQualifiedIdentifier = new As3SimpleQualifiedIdentifierImpl();
		return as3SimpleQualifiedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ExpressionQualifiedIdentifier createAs3ExpressionQualifiedIdentifier() {
		As3ExpressionQualifiedIdentifierImpl as3ExpressionQualifiedIdentifier = new As3ExpressionQualifiedIdentifierImpl();
		return as3ExpressionQualifiedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ThisExpression createAs3ThisExpression() {
		As3ThisExpressionImpl as3ThisExpression = new As3ThisExpressionImpl();
		return as3ThisExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3SuperExpression createAs3SuperExpression() {
		As3SuperExpressionImpl as3SuperExpression = new As3SuperExpressionImpl();
		return as3SuperExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ParenListExpression createAs3ParenListExpression() {
		As3ParenListExpressionImpl as3ParenListExpression = new As3ParenListExpressionImpl();
		return as3ParenListExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3FunctionExpression createAs3FunctionExpression() {
		As3FunctionExpressionImpl as3FunctionExpression = new As3FunctionExpressionImpl();
		return as3FunctionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3NewExpression createAs3NewExpression() {
		As3NewExpressionImpl as3NewExpression = new As3NewExpressionImpl();
		return as3NewExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ArrayInitializer createAs3ArrayInitializer() {
		As3ArrayInitializerImpl as3ArrayInitializer = new As3ArrayInitializerImpl();
		return as3ArrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ArrayElement createAs3ArrayElement() {
		As3ArrayElementImpl as3ArrayElement = new As3ArrayElementImpl();
		return as3ArrayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ObjectInitializer createAs3ObjectInitializer() {
		As3ObjectInitializerImpl as3ObjectInitializer = new As3ObjectInitializerImpl();
		return as3ObjectInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3LiteralField createAs3LiteralField() {
		As3LiteralFieldImpl as3LiteralField = new As3LiteralFieldImpl();
		return as3LiteralField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3XmlInitializer createAs3XmlInitializer() {
		As3XmlInitializerImpl as3XmlInitializer = new As3XmlInitializerImpl();
		return as3XmlInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3NullLiteral createAs3NullLiteral() {
		As3NullLiteralImpl as3NullLiteral = new As3NullLiteralImpl();
		return as3NullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3BooleanLiteral createAs3BooleanLiteral() {
		As3BooleanLiteralImpl as3BooleanLiteral = new As3BooleanLiteralImpl();
		return as3BooleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3NumberLiteral createAs3NumberLiteral() {
		As3NumberLiteralImpl as3NumberLiteral = new As3NumberLiteralImpl();
		return as3NumberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3StringLiteral createAs3StringLiteral() {
		As3StringLiteralImpl as3StringLiteral = new As3StringLiteralImpl();
		return as3StringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3RegexLiteral createAs3RegexLiteral() {
		As3RegexLiteralImpl as3RegexLiteral = new As3RegexLiteralImpl();
		return as3RegexLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ConditionalBlock createAs3ConditionalBlock() {
		As3ConditionalBlockImpl as3ConditionalBlock = new As3ConditionalBlockImpl();
		return as3ConditionalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterable<?> createIterableFromString(EDataType eDataType, String initialValue) {
		return (Iterable<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIterableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3EPackage getAs3EPackage() {
		return (As3EPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static As3EPackage getPackage() {
		return As3EPackage.eINSTANCE;
	}

} //As3EFactoryImpl
