/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3;

import org.axdt.as3.model.As3AccessExpression;
import org.axdt.as3.model.As3AdditiveExpression;
import org.axdt.as3.model.As3Arguments;
import org.axdt.as3.model.As3ArrayElement;
import org.axdt.as3.model.As3ArrayInitializer;
import org.axdt.as3.model.As3AssignmentExpression;
import org.axdt.as3.model.As3AttributeQualifiedIdentifier;
import org.axdt.as3.model.As3Attributes;
import org.axdt.as3.model.As3BitwiseExpression;
import org.axdt.as3.model.As3BitwiseNotExpression;
import org.axdt.as3.model.As3Block;
import org.axdt.as3.model.As3BooleanLiteral;
import org.axdt.as3.model.As3BreakStatement;
import org.axdt.as3.model.As3CatchClause;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3ConditionalBlock;
import org.axdt.as3.model.As3ConditionalExpression;
import org.axdt.as3.model.As3Constructor;
import org.axdt.as3.model.As3ContinueStatement;
import org.axdt.as3.model.As3DefaultCase;
import org.axdt.as3.model.As3DefaultXmlNamespaceStatement;
import org.axdt.as3.model.As3DeleteExpression;
import org.axdt.as3.model.As3DoStatement;
import org.axdt.as3.model.As3EmptyStatement;
import org.axdt.as3.model.As3EqualityExpression;
import org.axdt.as3.model.As3ExpressionCase;
import org.axdt.as3.model.As3ExpressionQualifiedIdentifier;
import org.axdt.as3.model.As3ExpressionStatement;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3FieldDefinition;
import org.axdt.as3.model.As3ForInStatement;
import org.axdt.as3.model.As3ForStatement;
import org.axdt.as3.model.As3FunctionExpression;
import org.axdt.as3.model.As3IfStatement;
import org.axdt.as3.model.As3Import;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Include;
import org.axdt.as3.model.As3Interface;
import org.axdt.as3.model.As3InvocationExpression;
import org.axdt.as3.model.As3LabeledStatement;
import org.axdt.as3.model.As3ListExpression;
import org.axdt.as3.model.As3LiteralField;
import org.axdt.as3.model.As3LogicalExpression;
import org.axdt.as3.model.As3LogicalNotExpression;
import org.axdt.as3.model.As3MetadataParameter;
import org.axdt.as3.model.As3MetadataTag;
import org.axdt.as3.model.As3MultiplicativeExpression;
import org.axdt.as3.model.As3Namespace;
import org.axdt.as3.model.As3NewExpression;
import org.axdt.as3.model.As3NullLiteral;
import org.axdt.as3.model.As3NumberLiteral;
import org.axdt.as3.model.As3ObjectInitializer;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3ParameterAssign;
import org.axdt.as3.model.As3ParameterRest;
import org.axdt.as3.model.As3ParenListExpression;
import org.axdt.as3.model.As3PostDecrementExpression;
import org.axdt.as3.model.As3PostIncrementExpression;
import org.axdt.as3.model.As3PreDecrementExpression;
import org.axdt.as3.model.As3PreIncrementExpression;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.As3PropertyIdentifier;
import org.axdt.as3.model.As3PropertyOperator;
import org.axdt.as3.model.As3QualifiedAttributeExpression;
import org.axdt.as3.model.As3QueryExpression;
import org.axdt.as3.model.As3QueryOperator;
import org.axdt.as3.model.As3RegexLiteral;
import org.axdt.as3.model.As3RelationalExpression;
import org.axdt.as3.model.As3ReservedAttribute;
import org.axdt.as3.model.As3ReturnStatement;
import org.axdt.as3.model.As3ShiftExpression;
import org.axdt.as3.model.As3SimpleAttributeExpression;
import org.axdt.as3.model.As3SimpleQualifiedIdentifier;
import org.axdt.as3.model.As3StringLiteral;
import org.axdt.as3.model.As3SuperExpression;
import org.axdt.as3.model.As3SuperStatement;
import org.axdt.as3.model.As3SwitchStatement;
import org.axdt.as3.model.As3ThisExpression;
import org.axdt.as3.model.As3ThrowStatement;
import org.axdt.as3.model.As3TryStatement;
import org.axdt.as3.model.As3TypeOfExpression;
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
import org.axdt.as3.model.IForInInit;
import org.axdt.as3.model.IForInit;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.as3.As3EPackage
 * @generated
 */
public interface As3EFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	As3EFactory eINSTANCE = org.axdt.as3.model.impl.As3EFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IFor Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFor Init</em>'.
	 * @generated
	 */
	IForInit createIForInit();

	/**
	 * Returns a new object of class '<em>IFor In Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFor In Init</em>'.
	 * @generated
	 */
	IForInInit createIForInInit();

	/**
	 * Returns a new object of class '<em>As3 Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Program</em>'.
	 * @generated
	 */
	As3Program createAs3Program();

	/**
	 * Returns a new object of class '<em>As3 Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Import</em>'.
	 * @generated
	 */
	As3Import createAs3Import();

	/**
	 * Returns a new object of class '<em>As3 Import List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Import List</em>'.
	 * @generated
	 */
	As3ImportList createAs3ImportList();

	/**
	 * Returns a new object of class '<em>As3 Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Include</em>'.
	 * @generated
	 */
	As3Include createAs3Include();

	/**
	 * Returns a new object of class '<em>As3 Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Use</em>'.
	 * @generated
	 */
	As3Use createAs3Use();

	/**
	 * Returns a new object of class '<em>As3 Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Package</em>'.
	 * @generated
	 */
	As3Package createAs3Package();

	/**
	 * Returns a new object of class '<em>As3 Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Class</em>'.
	 * @generated
	 */
	As3Class createAs3Class();

	/**
	 * Returns a new object of class '<em>As3 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Interface</em>'.
	 * @generated
	 */
	As3Interface createAs3Interface();

	/**
	 * Returns a new object of class '<em>As3 Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Namespace</em>'.
	 * @generated
	 */
	As3Namespace createAs3Namespace();

	/**
	 * Returns a new object of class '<em>As3 Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Variable</em>'.
	 * @generated
	 */
	As3Variable createAs3Variable();

	/**
	 * Returns a new object of class '<em>As3 Variable Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Variable Assign</em>'.
	 * @generated
	 */
	As3VariableAssign createAs3VariableAssign();

	/**
	 * Returns a new object of class '<em>As3 Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Variable Definition</em>'.
	 * @generated
	 */
	As3VariableDefinition createAs3VariableDefinition();

	/**
	 * Returns a new object of class '<em>As3 Parameter Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Parameter Assign</em>'.
	 * @generated
	 */
	As3ParameterAssign createAs3ParameterAssign();

	/**
	 * Returns a new object of class '<em>As3 Parameter Rest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Parameter Rest</em>'.
	 * @generated
	 */
	As3ParameterRest createAs3ParameterRest();

	/**
	 * Returns a new object of class '<em>As3 Field Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Field Binding</em>'.
	 * @generated
	 */
	As3FieldBinding createAs3FieldBinding();

	/**
	 * Returns a new object of class '<em>As3 Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Field Definition</em>'.
	 * @generated
	 */
	As3FieldDefinition createAs3FieldDefinition();

	/**
	 * Returns a new object of class '<em>As3 Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Operation</em>'.
	 * @generated
	 */
	As3Operation createAs3Operation();

	/**
	 * Returns a new object of class '<em>As3 Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Constructor</em>'.
	 * @generated
	 */
	As3Constructor createAs3Constructor();

	/**
	 * Returns a new object of class '<em>As3 Metadata Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Metadata Tag</em>'.
	 * @generated
	 */
	As3MetadataTag createAs3MetadataTag();

	/**
	 * Returns a new object of class '<em>As3 Metadata Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Metadata Parameter</em>'.
	 * @generated
	 */
	As3MetadataParameter createAs3MetadataParameter();

	/**
	 * Returns a new object of class '<em>As3 Simple Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Simple Attribute Expression</em>'.
	 * @generated
	 */
	As3SimpleAttributeExpression createAs3SimpleAttributeExpression();

	/**
	 * Returns a new object of class '<em>As3 Qualified Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Qualified Attribute Expression</em>'.
	 * @generated
	 */
	As3QualifiedAttributeExpression createAs3QualifiedAttributeExpression();

	/**
	 * Returns a new object of class '<em>As3 Default Xml Namespace Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Default Xml Namespace Statement</em>'.
	 * @generated
	 */
	As3DefaultXmlNamespaceStatement createAs3DefaultXmlNamespaceStatement();

	/**
	 * Returns a new object of class '<em>As3 Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Try Statement</em>'.
	 * @generated
	 */
	As3TryStatement createAs3TryStatement();

	/**
	 * Returns a new object of class '<em>As3 Catch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Catch Clause</em>'.
	 * @generated
	 */
	As3CatchClause createAs3CatchClause();

	/**
	 * Returns a new object of class '<em>As3 Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Throw Statement</em>'.
	 * @generated
	 */
	As3ThrowStatement createAs3ThrowStatement();

	/**
	 * Returns a new object of class '<em>As3 Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Return Statement</em>'.
	 * @generated
	 */
	As3ReturnStatement createAs3ReturnStatement();

	/**
	 * Returns a new object of class '<em>As3 With Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 With Statement</em>'.
	 * @generated
	 */
	As3WithStatement createAs3WithStatement();

	/**
	 * Returns a new object of class '<em>As3 Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Break Statement</em>'.
	 * @generated
	 */
	As3BreakStatement createAs3BreakStatement();

	/**
	 * Returns a new object of class '<em>As3 Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Continue Statement</em>'.
	 * @generated
	 */
	As3ContinueStatement createAs3ContinueStatement();

	/**
	 * Returns a new object of class '<em>As3 Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Do Statement</em>'.
	 * @generated
	 */
	As3DoStatement createAs3DoStatement();

	/**
	 * Returns a new object of class '<em>As3 While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 While Statement</em>'.
	 * @generated
	 */
	As3WhileStatement createAs3WhileStatement();

	/**
	 * Returns a new object of class '<em>As3 For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 For Statement</em>'.
	 * @generated
	 */
	As3ForStatement createAs3ForStatement();

	/**
	 * Returns a new object of class '<em>As3 For In Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 For In Statement</em>'.
	 * @generated
	 */
	As3ForInStatement createAs3ForInStatement();

	/**
	 * Returns a new object of class '<em>As3 Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Switch Statement</em>'.
	 * @generated
	 */
	As3SwitchStatement createAs3SwitchStatement();

	/**
	 * Returns a new object of class '<em>As3 Default Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Default Case</em>'.
	 * @generated
	 */
	As3DefaultCase createAs3DefaultCase();

	/**
	 * Returns a new object of class '<em>As3 Expression Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Expression Case</em>'.
	 * @generated
	 */
	As3ExpressionCase createAs3ExpressionCase();

	/**
	 * Returns a new object of class '<em>As3 If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 If Statement</em>'.
	 * @generated
	 */
	As3IfStatement createAs3IfStatement();

	/**
	 * Returns a new object of class '<em>As3 Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Labeled Statement</em>'.
	 * @generated
	 */
	As3LabeledStatement createAs3LabeledStatement();

	/**
	 * Returns a new object of class '<em>As3 Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Block</em>'.
	 * @generated
	 */
	As3Block createAs3Block();

	/**
	 * Returns a new object of class '<em>As3 Super Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Super Statement</em>'.
	 * @generated
	 */
	As3SuperStatement createAs3SuperStatement();

	/**
	 * Returns a new object of class '<em>As3 Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Expression Statement</em>'.
	 * @generated
	 */
	As3ExpressionStatement createAs3ExpressionStatement();

	/**
	 * Returns a new object of class '<em>As3 Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Empty Statement</em>'.
	 * @generated
	 */
	As3EmptyStatement createAs3EmptyStatement();

	/**
	 * Returns a new object of class '<em>As3 List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 List Expression</em>'.
	 * @generated
	 */
	As3ListExpression createAs3ListExpression();

	/**
	 * Returns a new object of class '<em>As3 Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Arguments</em>'.
	 * @generated
	 */
	As3Arguments createAs3Arguments();

	/**
	 * Returns a new object of class '<em>As3 Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Assignment Expression</em>'.
	 * @generated
	 */
	As3AssignmentExpression createAs3AssignmentExpression();

	/**
	 * Returns a new object of class '<em>As3 Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Conditional Expression</em>'.
	 * @generated
	 */
	As3ConditionalExpression createAs3ConditionalExpression();

	/**
	 * Returns a new object of class '<em>As3 Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Logical Expression</em>'.
	 * @generated
	 */
	As3LogicalExpression createAs3LogicalExpression();

	/**
	 * Returns a new object of class '<em>As3 Bitwise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Bitwise Expression</em>'.
	 * @generated
	 */
	As3BitwiseExpression createAs3BitwiseExpression();

	/**
	 * Returns a new object of class '<em>As3 Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Equality Expression</em>'.
	 * @generated
	 */
	As3EqualityExpression createAs3EqualityExpression();

	/**
	 * Returns a new object of class '<em>As3 Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Relational Expression</em>'.
	 * @generated
	 */
	As3RelationalExpression createAs3RelationalExpression();

	/**
	 * Returns a new object of class '<em>As3 Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Shift Expression</em>'.
	 * @generated
	 */
	As3ShiftExpression createAs3ShiftExpression();

	/**
	 * Returns a new object of class '<em>As3 Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Additive Expression</em>'.
	 * @generated
	 */
	As3AdditiveExpression createAs3AdditiveExpression();

	/**
	 * Returns a new object of class '<em>As3 Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Multiplicative Expression</em>'.
	 * @generated
	 */
	As3MultiplicativeExpression createAs3MultiplicativeExpression();

	/**
	 * Returns a new object of class '<em>As3 Delete Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Delete Expression</em>'.
	 * @generated
	 */
	As3DeleteExpression createAs3DeleteExpression();

	/**
	 * Returns a new object of class '<em>As3 Void Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Void Expression</em>'.
	 * @generated
	 */
	As3VoidExpression createAs3VoidExpression();

	/**
	 * Returns a new object of class '<em>As3 Type Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Type Of Expression</em>'.
	 * @generated
	 */
	As3TypeOfExpression createAs3TypeOfExpression();

	/**
	 * Returns a new object of class '<em>As3 Pre Increment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Pre Increment Expression</em>'.
	 * @generated
	 */
	As3PreIncrementExpression createAs3PreIncrementExpression();

	/**
	 * Returns a new object of class '<em>As3 Pre Decrement Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Pre Decrement Expression</em>'.
	 * @generated
	 */
	As3PreDecrementExpression createAs3PreDecrementExpression();

	/**
	 * Returns a new object of class '<em>As3 Unary Plus Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Unary Plus Expression</em>'.
	 * @generated
	 */
	As3UnaryPlusExpression createAs3UnaryPlusExpression();

	/**
	 * Returns a new object of class '<em>As3 Unary Minus Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Unary Minus Expression</em>'.
	 * @generated
	 */
	As3UnaryMinusExpression createAs3UnaryMinusExpression();

	/**
	 * Returns a new object of class '<em>As3 Bitwise Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Bitwise Not Expression</em>'.
	 * @generated
	 */
	As3BitwiseNotExpression createAs3BitwiseNotExpression();

	/**
	 * Returns a new object of class '<em>As3 Logical Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Logical Not Expression</em>'.
	 * @generated
	 */
	As3LogicalNotExpression createAs3LogicalNotExpression();

	/**
	 * Returns a new object of class '<em>As3 Post Increment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Post Increment Expression</em>'.
	 * @generated
	 */
	As3PostIncrementExpression createAs3PostIncrementExpression();

	/**
	 * Returns a new object of class '<em>As3 Post Decrement Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Post Decrement Expression</em>'.
	 * @generated
	 */
	As3PostDecrementExpression createAs3PostDecrementExpression();

	/**
	 * Returns a new object of class '<em>As3 Invocation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Invocation Expression</em>'.
	 * @generated
	 */
	As3InvocationExpression createAs3InvocationExpression();

	/**
	 * Returns a new object of class '<em>As3 Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Access Expression</em>'.
	 * @generated
	 */
	As3AccessExpression createAs3AccessExpression();

	/**
	 * Returns a new object of class '<em>As3 Query Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Query Expression</em>'.
	 * @generated
	 */
	As3QueryExpression createAs3QueryExpression();

	/**
	 * Returns a new object of class '<em>As3 Property Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Property Operator</em>'.
	 * @generated
	 */
	As3PropertyOperator createAs3PropertyOperator();

	/**
	 * Returns a new object of class '<em>As3 Query Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Query Operator</em>'.
	 * @generated
	 */
	As3QueryOperator createAs3QueryOperator();

	/**
	 * Returns a new object of class '<em>As3 Property Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Property Identifier</em>'.
	 * @generated
	 */
	As3PropertyIdentifier createAs3PropertyIdentifier();

	/**
	 * Returns a new object of class '<em>As3 Attribute Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Attribute Qualified Identifier</em>'.
	 * @generated
	 */
	As3AttributeQualifiedIdentifier createAs3AttributeQualifiedIdentifier();

	/**
	 * Returns a new object of class '<em>As3 Simple Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Simple Qualified Identifier</em>'.
	 * @generated
	 */
	As3SimpleQualifiedIdentifier createAs3SimpleQualifiedIdentifier();

	/**
	 * Returns a new object of class '<em>As3 Expression Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Expression Qualified Identifier</em>'.
	 * @generated
	 */
	As3ExpressionQualifiedIdentifier createAs3ExpressionQualifiedIdentifier();

	/**
	 * Returns a new object of class '<em>As3 This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 This Expression</em>'.
	 * @generated
	 */
	As3ThisExpression createAs3ThisExpression();

	/**
	 * Returns a new object of class '<em>As3 Super Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Super Expression</em>'.
	 * @generated
	 */
	As3SuperExpression createAs3SuperExpression();

	/**
	 * Returns a new object of class '<em>As3 Paren List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Paren List Expression</em>'.
	 * @generated
	 */
	As3ParenListExpression createAs3ParenListExpression();

	/**
	 * Returns a new object of class '<em>As3 Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Function Expression</em>'.
	 * @generated
	 */
	As3FunctionExpression createAs3FunctionExpression();

	/**
	 * Returns a new object of class '<em>As3 New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 New Expression</em>'.
	 * @generated
	 */
	As3NewExpression createAs3NewExpression();

	/**
	 * Returns a new object of class '<em>As3 Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Array Initializer</em>'.
	 * @generated
	 */
	As3ArrayInitializer createAs3ArrayInitializer();

	/**
	 * Returns a new object of class '<em>As3 Array Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Array Element</em>'.
	 * @generated
	 */
	As3ArrayElement createAs3ArrayElement();

	/**
	 * Returns a new object of class '<em>As3 Object Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Object Initializer</em>'.
	 * @generated
	 */
	As3ObjectInitializer createAs3ObjectInitializer();

	/**
	 * Returns a new object of class '<em>As3 Literal Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Literal Field</em>'.
	 * @generated
	 */
	As3LiteralField createAs3LiteralField();

	/**
	 * Returns a new object of class '<em>As3 Xml Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Xml Initializer</em>'.
	 * @generated
	 */
	As3XmlInitializer createAs3XmlInitializer();

	/**
	 * Returns a new object of class '<em>As3 Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Null Literal</em>'.
	 * @generated
	 */
	As3NullLiteral createAs3NullLiteral();

	/**
	 * Returns a new object of class '<em>As3 Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Boolean Literal</em>'.
	 * @generated
	 */
	As3BooleanLiteral createAs3BooleanLiteral();

	/**
	 * Returns a new object of class '<em>As3 Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Number Literal</em>'.
	 * @generated
	 */
	As3NumberLiteral createAs3NumberLiteral();

	/**
	 * Returns a new object of class '<em>As3 String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 String Literal</em>'.
	 * @generated
	 */
	As3StringLiteral createAs3StringLiteral();

	/**
	 * Returns a new object of class '<em>As3 Regex Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Regex Literal</em>'.
	 * @generated
	 */
	As3RegexLiteral createAs3RegexLiteral();

	/**
	 * Returns a new object of class '<em>As3 Conditional Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Conditional Block</em>'.
	 * @generated
	 */
	As3ConditionalBlock createAs3ConditionalBlock();

	/**
	 * Returns a new object of class '<em>As3 Reserved Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Reserved Attribute</em>'.
	 * @generated
	 */
	As3ReservedAttribute createAs3ReservedAttribute();

	/**
	 * Returns a new object of class '<em>As3 Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As3 Attributes</em>'.
	 * @generated
	 */
	As3Attributes createAs3Attributes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	As3EPackage getAs3EPackage();

} //As3EFactory
