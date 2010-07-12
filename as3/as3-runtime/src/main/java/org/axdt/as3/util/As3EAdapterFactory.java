/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.util;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.*;
import org.axdt.avm.model.AvmConstructor;
import org.axdt.avm.model.AvmDeclaredElement;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.axdt.avm.model.AvmElement;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmNamespace;
import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmVariable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.as3.As3EPackage
 * @generated
 */
public class As3EAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static As3EPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3EAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = As3EPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ESwitch<Adapter> modelSwitch =
		new As3ESwitch<Adapter>() {
			@Override
			public Adapter caseIDirective(IDirective object) {
				return createIDirectiveAdapter();
			}
			@Override
			public Adapter caseIStatement(IStatement object) {
				return createIStatementAdapter();
			}
			@Override
			public Adapter caseIExpression(IExpression object) {
				return createIExpressionAdapter();
			}
			@Override
			public Adapter caseIAssignmentExpression(IAssignmentExpression object) {
				return createIAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseIConditionalExpression(IConditionalExpression object) {
				return createIConditionalExpressionAdapter();
			}
			@Override
			public Adapter caseILogicalExpression(ILogicalExpression object) {
				return createILogicalExpressionAdapter();
			}
			@Override
			public Adapter caseIBitwiseExpression(IBitwiseExpression object) {
				return createIBitwiseExpressionAdapter();
			}
			@Override
			public Adapter caseIEqualityExpression(IEqualityExpression object) {
				return createIEqualityExpressionAdapter();
			}
			@Override
			public Adapter caseIRelationalExpression(IRelationalExpression object) {
				return createIRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseIArithmeticExpression(IArithmeticExpression object) {
				return createIArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseIUnaryExpression(IUnaryExpression object) {
				return createIUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseIPostfixExpression(IPostfixExpression object) {
				return createIPostfixExpressionAdapter();
			}
			@Override
			public Adapter caseIPrimaryExpression(IPrimaryExpression object) {
				return createIPrimaryExpressionAdapter();
			}
			@Override
			public Adapter caseIIdentifier(IIdentifier object) {
				return createIIdentifierAdapter();
			}
			@Override
			public Adapter caseILiteral(ILiteral object) {
				return createILiteralAdapter();
			}
			@Override
			public Adapter caseILiteralFieldName(ILiteralFieldName object) {
				return createILiteralFieldNameAdapter();
			}
			@Override
			public Adapter caseICaseElement(ICaseElement object) {
				return createICaseElementAdapter();
			}
			@Override
			public Adapter caseINonAttributeIdentifier(INonAttributeIdentifier object) {
				return createINonAttributeIdentifierAdapter();
			}
			@Override
			public Adapter caseIAttribute(IAttribute object) {
				return createIAttributeAdapter();
			}
			@Override
			public Adapter caseIForInit(IForInit object) {
				return createIForInitAdapter();
			}
			@Override
			public Adapter caseIForInInit(IForInInit object) {
				return createIForInInitAdapter();
			}
			@Override
			public Adapter caseAs3Element(As3Element object) {
				return createAs3ElementAdapter();
			}
			@Override
			public Adapter caseAs3Identifiable(As3Identifiable object) {
				return createAs3IdentifiableAdapter();
			}
			@Override
			public Adapter caseAs3Definition(As3Definition object) {
				return createAs3DefinitionAdapter();
			}
			@Override
			public Adapter caseAs3Member(As3Member object) {
				return createAs3MemberAdapter();
			}
			@Override
			public Adapter caseAs3Executable(As3Executable object) {
				return createAs3ExecutableAdapter();
			}
			@Override
			public Adapter caseAs3Program(As3Program object) {
				return createAs3ProgramAdapter();
			}
			@Override
			public Adapter caseAs3Import(As3Import object) {
				return createAs3ImportAdapter();
			}
			@Override
			public Adapter caseAs3ImportList(As3ImportList object) {
				return createAs3ImportListAdapter();
			}
			@Override
			public Adapter caseAs3Include(As3Include object) {
				return createAs3IncludeAdapter();
			}
			@Override
			public Adapter caseAs3Use(As3Use object) {
				return createAs3UseAdapter();
			}
			@Override
			public Adapter caseAs3Package(As3Package object) {
				return createAs3PackageAdapter();
			}
			@Override
			public Adapter caseAs3Type(As3Type object) {
				return createAs3TypeAdapter();
			}
			@Override
			public Adapter caseAs3Class(As3Class object) {
				return createAs3ClassAdapter();
			}
			@Override
			public Adapter caseAs3Interface(As3Interface object) {
				return createAs3InterfaceAdapter();
			}
			@Override
			public Adapter caseAs3Namespace(As3Namespace object) {
				return createAs3NamespaceAdapter();
			}
			@Override
			public Adapter caseAs3Variable(As3Variable object) {
				return createAs3VariableAdapter();
			}
			@Override
			public Adapter caseAs3VariableAssign(As3VariableAssign object) {
				return createAs3VariableAssignAdapter();
			}
			@Override
			public Adapter caseAs3VariableDefinition(As3VariableDefinition object) {
				return createAs3VariableDefinitionAdapter();
			}
			@Override
			public Adapter caseAs3Parameter(As3Parameter object) {
				return createAs3ParameterAdapter();
			}
			@Override
			public Adapter caseAs3ParameterAssign(As3ParameterAssign object) {
				return createAs3ParameterAssignAdapter();
			}
			@Override
			public Adapter caseAs3ParameterRest(As3ParameterRest object) {
				return createAs3ParameterRestAdapter();
			}
			@Override
			public Adapter caseAs3FieldBinding(As3FieldBinding object) {
				return createAs3FieldBindingAdapter();
			}
			@Override
			public Adapter caseAs3FieldDefinition(As3FieldDefinition object) {
				return createAs3FieldDefinitionAdapter();
			}
			@Override
			public Adapter caseAs3Operation(As3Operation object) {
				return createAs3OperationAdapter();
			}
			@Override
			public Adapter caseAs3Constructor(As3Constructor object) {
				return createAs3ConstructorAdapter();
			}
			@Override
			public Adapter caseAs3MetadataTag(As3MetadataTag object) {
				return createAs3MetadataTagAdapter();
			}
			@Override
			public Adapter caseAs3MetadataParameter(As3MetadataParameter object) {
				return createAs3MetadataParameterAdapter();
			}
			@Override
			public Adapter caseAs3AttributeExpression(As3AttributeExpression object) {
				return createAs3AttributeExpressionAdapter();
			}
			@Override
			public Adapter caseAs3SimpleAttributeExpression(As3SimpleAttributeExpression object) {
				return createAs3SimpleAttributeExpressionAdapter();
			}
			@Override
			public Adapter caseAs3QualifiedAttributeExpression(As3QualifiedAttributeExpression object) {
				return createAs3QualifiedAttributeExpressionAdapter();
			}
			@Override
			public Adapter caseAs3DefaultXmlNamespaceStatement(As3DefaultXmlNamespaceStatement object) {
				return createAs3DefaultXmlNamespaceStatementAdapter();
			}
			@Override
			public Adapter caseAs3TryStatement(As3TryStatement object) {
				return createAs3TryStatementAdapter();
			}
			@Override
			public Adapter caseAs3CatchClause(As3CatchClause object) {
				return createAs3CatchClauseAdapter();
			}
			@Override
			public Adapter caseAs3ThrowStatement(As3ThrowStatement object) {
				return createAs3ThrowStatementAdapter();
			}
			@Override
			public Adapter caseAs3ReturnStatement(As3ReturnStatement object) {
				return createAs3ReturnStatementAdapter();
			}
			@Override
			public Adapter caseAs3WithStatement(As3WithStatement object) {
				return createAs3WithStatementAdapter();
			}
			@Override
			public Adapter caseAs3BreakStatement(As3BreakStatement object) {
				return createAs3BreakStatementAdapter();
			}
			@Override
			public Adapter caseAs3ContinueStatement(As3ContinueStatement object) {
				return createAs3ContinueStatementAdapter();
			}
			@Override
			public Adapter caseAs3IterationStatement(As3IterationStatement object) {
				return createAs3IterationStatementAdapter();
			}
			@Override
			public Adapter caseAs3ConditionalIterationStatement(As3ConditionalIterationStatement object) {
				return createAs3ConditionalIterationStatementAdapter();
			}
			@Override
			public Adapter caseAs3DoStatement(As3DoStatement object) {
				return createAs3DoStatementAdapter();
			}
			@Override
			public Adapter caseAs3WhileStatement(As3WhileStatement object) {
				return createAs3WhileStatementAdapter();
			}
			@Override
			public Adapter caseAs3ForStatement(As3ForStatement object) {
				return createAs3ForStatementAdapter();
			}
			@Override
			public Adapter caseAs3ForInStatement(As3ForInStatement object) {
				return createAs3ForInStatementAdapter();
			}
			@Override
			public Adapter caseAs3ConditionalStatement(As3ConditionalStatement object) {
				return createAs3ConditionalStatementAdapter();
			}
			@Override
			public Adapter caseAs3SwitchStatement(As3SwitchStatement object) {
				return createAs3SwitchStatementAdapter();
			}
			@Override
			public Adapter caseAs3CaseLabel(As3CaseLabel object) {
				return createAs3CaseLabelAdapter();
			}
			@Override
			public Adapter caseAs3DefaultCase(As3DefaultCase object) {
				return createAs3DefaultCaseAdapter();
			}
			@Override
			public Adapter caseAs3ExpressionCase(As3ExpressionCase object) {
				return createAs3ExpressionCaseAdapter();
			}
			@Override
			public Adapter caseAs3IfStatement(As3IfStatement object) {
				return createAs3IfStatementAdapter();
			}
			@Override
			public Adapter caseAs3LabeledStatement(As3LabeledStatement object) {
				return createAs3LabeledStatementAdapter();
			}
			@Override
			public Adapter caseAs3Block(As3Block object) {
				return createAs3BlockAdapter();
			}
			@Override
			public Adapter caseAs3SuperStatement(As3SuperStatement object) {
				return createAs3SuperStatementAdapter();
			}
			@Override
			public Adapter caseAs3ExpressionStatement(As3ExpressionStatement object) {
				return createAs3ExpressionStatementAdapter();
			}
			@Override
			public Adapter caseAs3EmptyStatement(As3EmptyStatement object) {
				return createAs3EmptyStatementAdapter();
			}
			@Override
			public Adapter caseAs3ExpressionList(As3ExpressionList object) {
				return createAs3ExpressionListAdapter();
			}
			@Override
			public Adapter caseAs3ListExpression(As3ListExpression object) {
				return createAs3ListExpressionAdapter();
			}
			@Override
			public Adapter caseAs3Arguments(As3Arguments object) {
				return createAs3ArgumentsAdapter();
			}
			@Override
			public Adapter caseAs3AssignmentExpression(As3AssignmentExpression object) {
				return createAs3AssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseAs3ConditionalExpression(As3ConditionalExpression object) {
				return createAs3ConditionalExpressionAdapter();
			}
			@Override
			public Adapter caseAs3BinaryExpression(As3BinaryExpression object) {
				return createAs3BinaryExpressionAdapter();
			}
			@Override
			public Adapter caseAs3LogicalExpression(As3LogicalExpression object) {
				return createAs3LogicalExpressionAdapter();
			}
			@Override
			public Adapter caseAs3BitwiseExpression(As3BitwiseExpression object) {
				return createAs3BitwiseExpressionAdapter();
			}
			@Override
			public Adapter caseAs3EqualityExpression(As3EqualityExpression object) {
				return createAs3EqualityExpressionAdapter();
			}
			@Override
			public Adapter caseAs3RelationalExpression(As3RelationalExpression object) {
				return createAs3RelationalExpressionAdapter();
			}
			@Override
			public Adapter caseAs3ShiftExpression(As3ShiftExpression object) {
				return createAs3ShiftExpressionAdapter();
			}
			@Override
			public Adapter caseAs3AdditiveExpression(As3AdditiveExpression object) {
				return createAs3AdditiveExpressionAdapter();
			}
			@Override
			public Adapter caseAs3MultiplicativeExpression(As3MultiplicativeExpression object) {
				return createAs3MultiplicativeExpressionAdapter();
			}
			@Override
			public Adapter caseAs3UnaryExpression(As3UnaryExpression object) {
				return createAs3UnaryExpressionAdapter();
			}
			@Override
			public Adapter caseAs3DeleteExpression(As3DeleteExpression object) {
				return createAs3DeleteExpressionAdapter();
			}
			@Override
			public Adapter caseAs3VoidExpression(As3VoidExpression object) {
				return createAs3VoidExpressionAdapter();
			}
			@Override
			public Adapter caseAs3TypeOfExpression(As3TypeOfExpression object) {
				return createAs3TypeOfExpressionAdapter();
			}
			@Override
			public Adapter caseAs3PreIncrementExpression(As3PreIncrementExpression object) {
				return createAs3PreIncrementExpressionAdapter();
			}
			@Override
			public Adapter caseAs3PreDecrementExpression(As3PreDecrementExpression object) {
				return createAs3PreDecrementExpressionAdapter();
			}
			@Override
			public Adapter caseAs3UnaryPlusExpression(As3UnaryPlusExpression object) {
				return createAs3UnaryPlusExpressionAdapter();
			}
			@Override
			public Adapter caseAs3UnaryMinusExpression(As3UnaryMinusExpression object) {
				return createAs3UnaryMinusExpressionAdapter();
			}
			@Override
			public Adapter caseAs3BitwiseNotExpression(As3BitwiseNotExpression object) {
				return createAs3BitwiseNotExpressionAdapter();
			}
			@Override
			public Adapter caseAs3LogicalNotExpression(As3LogicalNotExpression object) {
				return createAs3LogicalNotExpressionAdapter();
			}
			@Override
			public Adapter caseAs3PostfixExpression(As3PostfixExpression object) {
				return createAs3PostfixExpressionAdapter();
			}
			@Override
			public Adapter caseAs3PostIncrementExpression(As3PostIncrementExpression object) {
				return createAs3PostIncrementExpressionAdapter();
			}
			@Override
			public Adapter caseAs3PostDecrementExpression(As3PostDecrementExpression object) {
				return createAs3PostDecrementExpressionAdapter();
			}
			@Override
			public Adapter caseAs3InvocationExpression(As3InvocationExpression object) {
				return createAs3InvocationExpressionAdapter();
			}
			@Override
			public Adapter caseAs3AccessExpression(As3AccessExpression object) {
				return createAs3AccessExpressionAdapter();
			}
			@Override
			public Adapter caseAs3QueryExpression(As3QueryExpression object) {
				return createAs3QueryExpressionAdapter();
			}
			@Override
			public Adapter caseAs3PostfixOperator(As3PostfixOperator object) {
				return createAs3PostfixOperatorAdapter();
			}
			@Override
			public Adapter caseAs3PropertyOperator(As3PropertyOperator object) {
				return createAs3PropertyOperatorAdapter();
			}
			@Override
			public Adapter caseAs3QueryOperator(As3QueryOperator object) {
				return createAs3QueryOperatorAdapter();
			}
			@Override
			public Adapter caseAs3SimpleIdentifier(As3SimpleIdentifier object) {
				return createAs3SimpleIdentifierAdapter();
			}
			@Override
			public Adapter caseAs3PropertyIdentifier(As3PropertyIdentifier object) {
				return createAs3PropertyIdentifierAdapter();
			}
			@Override
			public Adapter caseAs3QualifiedIdentifier(As3QualifiedIdentifier object) {
				return createAs3QualifiedIdentifierAdapter();
			}
			@Override
			public Adapter caseAs3AttributeQualifiedIdentifier(As3AttributeQualifiedIdentifier object) {
				return createAs3AttributeQualifiedIdentifierAdapter();
			}
			@Override
			public Adapter caseAs3NonAttributeQualifiedIdentifier(As3NonAttributeQualifiedIdentifier object) {
				return createAs3NonAttributeQualifiedIdentifierAdapter();
			}
			@Override
			public Adapter caseAs3SimpleQualifiedIdentifier(As3SimpleQualifiedIdentifier object) {
				return createAs3SimpleQualifiedIdentifierAdapter();
			}
			@Override
			public Adapter caseAs3ExpressionQualifiedIdentifier(As3ExpressionQualifiedIdentifier object) {
				return createAs3ExpressionQualifiedIdentifierAdapter();
			}
			@Override
			public Adapter caseAs3ThisExpression(As3ThisExpression object) {
				return createAs3ThisExpressionAdapter();
			}
			@Override
			public Adapter caseAs3SuperExpression(As3SuperExpression object) {
				return createAs3SuperExpressionAdapter();
			}
			@Override
			public Adapter caseAs3ParenListExpression(As3ParenListExpression object) {
				return createAs3ParenListExpressionAdapter();
			}
			@Override
			public Adapter caseAs3FunctionExpression(As3FunctionExpression object) {
				return createAs3FunctionExpressionAdapter();
			}
			@Override
			public Adapter caseAs3NewExpression(As3NewExpression object) {
				return createAs3NewExpressionAdapter();
			}
			@Override
			public Adapter caseAs3ArrayInitializer(As3ArrayInitializer object) {
				return createAs3ArrayInitializerAdapter();
			}
			@Override
			public Adapter caseAs3ArrayElement(As3ArrayElement object) {
				return createAs3ArrayElementAdapter();
			}
			@Override
			public Adapter caseAs3ObjectInitializer(As3ObjectInitializer object) {
				return createAs3ObjectInitializerAdapter();
			}
			@Override
			public Adapter caseAs3LiteralField(As3LiteralField object) {
				return createAs3LiteralFieldAdapter();
			}
			@Override
			public Adapter caseAs3XmlInitializer(As3XmlInitializer object) {
				return createAs3XmlInitializerAdapter();
			}
			@Override
			public Adapter caseAs3NullLiteral(As3NullLiteral object) {
				return createAs3NullLiteralAdapter();
			}
			@Override
			public Adapter caseAs3BooleanLiteral(As3BooleanLiteral object) {
				return createAs3BooleanLiteralAdapter();
			}
			@Override
			public Adapter caseAs3NumberLiteral(As3NumberLiteral object) {
				return createAs3NumberLiteralAdapter();
			}
			@Override
			public Adapter caseAs3StringLiteral(As3StringLiteral object) {
				return createAs3StringLiteralAdapter();
			}
			@Override
			public Adapter caseAs3RegexLiteral(As3RegexLiteral object) {
				return createAs3RegexLiteralAdapter();
			}
			@Override
			public Adapter caseAvmElement(AvmElement object) {
				return createAvmElementAdapter();
			}
			@Override
			public Adapter caseAvmIdentifiable(AvmIdentifiable object) {
				return createAvmIdentifiableAdapter();
			}
			@Override
			public Adapter caseAvmDefinition(AvmDefinition object) {
				return createAvmDefinitionAdapter();
			}
			@Override
			public Adapter caseAvmDeclaredElement(AvmDeclaredElement object) {
				return createAvmDeclaredElementAdapter();
			}
			@Override
			public Adapter caseAvmMember(AvmMember object) {
				return createAvmMemberAdapter();
			}
			@Override
			public Adapter caseAvmExecutable(AvmExecutable object) {
				return createAvmExecutableAdapter();
			}
			@Override
			public Adapter caseAvmDefinitionContainer(AvmDefinitionContainer object) {
				return createAvmDefinitionContainerAdapter();
			}
			@Override
			public Adapter caseAvmPackage(AvmPackage object) {
				return createAvmPackageAdapter();
			}
			@Override
			public Adapter caseAvmType(AvmType object) {
				return createAvmTypeAdapter();
			}
			@Override
			public Adapter caseAvmDeclaredType(AvmDeclaredType object) {
				return createAvmDeclaredTypeAdapter();
			}
			@Override
			public Adapter caseAvmNamespace(AvmNamespace object) {
				return createAvmNamespaceAdapter();
			}
			@Override
			public Adapter caseAvmVariable(AvmVariable object) {
				return createAvmVariableAdapter();
			}
			@Override
			public Adapter caseAvmParameter(AvmParameter object) {
				return createAvmParameterAdapter();
			}
			@Override
			public Adapter caseAvmField(AvmField object) {
				return createAvmFieldAdapter();
			}
			@Override
			public Adapter caseAvmOperation(AvmOperation object) {
				return createAvmOperationAdapter();
			}
			@Override
			public Adapter caseAvmConstructor(AvmConstructor object) {
				return createAvmConstructorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IDirective <em>IDirective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IDirective
	 * @generated
	 */
	public Adapter createIDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IStatement <em>IStatement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IStatement
	 * @generated
	 */
	public Adapter createIStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IExpression <em>IExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IExpression
	 * @generated
	 */
	public Adapter createIExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IAssignmentExpression <em>IAssignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IAssignmentExpression
	 * @generated
	 */
	public Adapter createIAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IConditionalExpression <em>IConditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IConditionalExpression
	 * @generated
	 */
	public Adapter createIConditionalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.ILogicalExpression <em>ILogical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.ILogicalExpression
	 * @generated
	 */
	public Adapter createILogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IBitwiseExpression <em>IBitwise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IBitwiseExpression
	 * @generated
	 */
	public Adapter createIBitwiseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IEqualityExpression <em>IEquality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IEqualityExpression
	 * @generated
	 */
	public Adapter createIEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IRelationalExpression <em>IRelational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IRelationalExpression
	 * @generated
	 */
	public Adapter createIRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IArithmeticExpression <em>IArithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IArithmeticExpression
	 * @generated
	 */
	public Adapter createIArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IUnaryExpression <em>IUnary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IUnaryExpression
	 * @generated
	 */
	public Adapter createIUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IPostfixExpression <em>IPostfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IPostfixExpression
	 * @generated
	 */
	public Adapter createIPostfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IPrimaryExpression <em>IPrimary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IPrimaryExpression
	 * @generated
	 */
	public Adapter createIPrimaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IIdentifier <em>IIdentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IIdentifier
	 * @generated
	 */
	public Adapter createIIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.ILiteral <em>ILiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.ILiteral
	 * @generated
	 */
	public Adapter createILiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.ILiteralFieldName <em>ILiteral Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.ILiteralFieldName
	 * @generated
	 */
	public Adapter createILiteralFieldNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.ICaseElement <em>ICase Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.ICaseElement
	 * @generated
	 */
	public Adapter createICaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.INonAttributeIdentifier <em>INon Attribute Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.INonAttributeIdentifier
	 * @generated
	 */
	public Adapter createINonAttributeIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IAttribute <em>IAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IAttribute
	 * @generated
	 */
	public Adapter createIAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IForInit <em>IFor Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IForInit
	 * @generated
	 */
	public Adapter createIForInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.IForInInit <em>IFor In Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.IForInInit
	 * @generated
	 */
	public Adapter createIForInInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Element <em>As3 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Element
	 * @generated
	 */
	public Adapter createAs3ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Identifiable <em>As3 Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Identifiable
	 * @generated
	 */
	public Adapter createAs3IdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Definition <em>As3 Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Definition
	 * @generated
	 */
	public Adapter createAs3DefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Member <em>As3 Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Member
	 * @generated
	 */
	public Adapter createAs3MemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Executable <em>As3 Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Executable
	 * @generated
	 */
	public Adapter createAs3ExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Parameter <em>As3 Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Parameter
	 * @generated
	 */
	public Adapter createAs3ParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ParameterAssign <em>As3 Parameter Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ParameterAssign
	 * @generated
	 */
	public Adapter createAs3ParameterAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ParameterRest <em>As3 Parameter Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ParameterRest
	 * @generated
	 */
	public Adapter createAs3ParameterRestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3FieldBinding <em>As3 Field Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3FieldBinding
	 * @generated
	 */
	public Adapter createAs3FieldBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3FieldDefinition <em>As3 Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3FieldDefinition
	 * @generated
	 */
	public Adapter createAs3FieldDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Program <em>As3 Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Program
	 * @generated
	 */
	public Adapter createAs3ProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Import <em>As3 Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Import
	 * @generated
	 */
	public Adapter createAs3ImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ImportList <em>As3 Import List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ImportList
	 * @generated
	 */
	public Adapter createAs3ImportListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Include <em>As3 Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Include
	 * @generated
	 */
	public Adapter createAs3IncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Use <em>As3 Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Use
	 * @generated
	 */
	public Adapter createAs3UseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Package <em>As3 Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Package
	 * @generated
	 */
	public Adapter createAs3PackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Type <em>As3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Type
	 * @generated
	 */
	public Adapter createAs3TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Class <em>As3 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Class
	 * @generated
	 */
	public Adapter createAs3ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Interface <em>As3 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Interface
	 * @generated
	 */
	public Adapter createAs3InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Namespace <em>As3 Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Namespace
	 * @generated
	 */
	public Adapter createAs3NamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Variable <em>As3 Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Variable
	 * @generated
	 */
	public Adapter createAs3VariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3VariableAssign <em>As3 Variable Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3VariableAssign
	 * @generated
	 */
	public Adapter createAs3VariableAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3VariableDefinition <em>As3 Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3VariableDefinition
	 * @generated
	 */
	public Adapter createAs3VariableDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Operation <em>As3 Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Operation
	 * @generated
	 */
	public Adapter createAs3OperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Constructor <em>As3 Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Constructor
	 * @generated
	 */
	public Adapter createAs3ConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3MetadataTag <em>As3 Metadata Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3MetadataTag
	 * @generated
	 */
	public Adapter createAs3MetadataTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3MetadataParameter <em>As3 Metadata Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3MetadataParameter
	 * @generated
	 */
	public Adapter createAs3MetadataParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3AttributeExpression <em>As3 Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3AttributeExpression
	 * @generated
	 */
	public Adapter createAs3AttributeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3SimpleAttributeExpression <em>As3 Simple Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3SimpleAttributeExpression
	 * @generated
	 */
	public Adapter createAs3SimpleAttributeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3QualifiedAttributeExpression <em>As3 Qualified Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3QualifiedAttributeExpression
	 * @generated
	 */
	public Adapter createAs3QualifiedAttributeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3DefaultXmlNamespaceStatement <em>As3 Default Xml Namespace Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3DefaultXmlNamespaceStatement
	 * @generated
	 */
	public Adapter createAs3DefaultXmlNamespaceStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3TryStatement <em>As3 Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3TryStatement
	 * @generated
	 */
	public Adapter createAs3TryStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3CatchClause <em>As3 Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3CatchClause
	 * @generated
	 */
	public Adapter createAs3CatchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ThrowStatement <em>As3 Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ThrowStatement
	 * @generated
	 */
	public Adapter createAs3ThrowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ReturnStatement <em>As3 Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ReturnStatement
	 * @generated
	 */
	public Adapter createAs3ReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3WithStatement <em>As3 With Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3WithStatement
	 * @generated
	 */
	public Adapter createAs3WithStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3BreakStatement <em>As3 Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3BreakStatement
	 * @generated
	 */
	public Adapter createAs3BreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ContinueStatement <em>As3 Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ContinueStatement
	 * @generated
	 */
	public Adapter createAs3ContinueStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3IterationStatement <em>As3 Iteration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3IterationStatement
	 * @generated
	 */
	public Adapter createAs3IterationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ConditionalIterationStatement <em>As3 Conditional Iteration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ConditionalIterationStatement
	 * @generated
	 */
	public Adapter createAs3ConditionalIterationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3DoStatement <em>As3 Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3DoStatement
	 * @generated
	 */
	public Adapter createAs3DoStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3WhileStatement <em>As3 While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3WhileStatement
	 * @generated
	 */
	public Adapter createAs3WhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ForStatement <em>As3 For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ForStatement
	 * @generated
	 */
	public Adapter createAs3ForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ForInStatement <em>As3 For In Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ForInStatement
	 * @generated
	 */
	public Adapter createAs3ForInStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ConditionalStatement <em>As3 Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ConditionalStatement
	 * @generated
	 */
	public Adapter createAs3ConditionalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3SwitchStatement <em>As3 Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3SwitchStatement
	 * @generated
	 */
	public Adapter createAs3SwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3CaseLabel <em>As3 Case Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3CaseLabel
	 * @generated
	 */
	public Adapter createAs3CaseLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3DefaultCase <em>As3 Default Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3DefaultCase
	 * @generated
	 */
	public Adapter createAs3DefaultCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ExpressionCase <em>As3 Expression Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ExpressionCase
	 * @generated
	 */
	public Adapter createAs3ExpressionCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3IfStatement <em>As3 If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3IfStatement
	 * @generated
	 */
	public Adapter createAs3IfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3LabeledStatement <em>As3 Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3LabeledStatement
	 * @generated
	 */
	public Adapter createAs3LabeledStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Block <em>As3 Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Block
	 * @generated
	 */
	public Adapter createAs3BlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3SuperStatement <em>As3 Super Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3SuperStatement
	 * @generated
	 */
	public Adapter createAs3SuperStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ExpressionStatement <em>As3 Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ExpressionStatement
	 * @generated
	 */
	public Adapter createAs3ExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3EmptyStatement <em>As3 Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3EmptyStatement
	 * @generated
	 */
	public Adapter createAs3EmptyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ExpressionList <em>As3 Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ExpressionList
	 * @generated
	 */
	public Adapter createAs3ExpressionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ListExpression <em>As3 List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ListExpression
	 * @generated
	 */
	public Adapter createAs3ListExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3Arguments <em>As3 Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3Arguments
	 * @generated
	 */
	public Adapter createAs3ArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3AssignmentExpression <em>As3 Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3AssignmentExpression
	 * @generated
	 */
	public Adapter createAs3AssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ConditionalExpression <em>As3 Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ConditionalExpression
	 * @generated
	 */
	public Adapter createAs3ConditionalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3BinaryExpression <em>As3 Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3BinaryExpression
	 * @generated
	 */
	public Adapter createAs3BinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3LogicalExpression <em>As3 Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3LogicalExpression
	 * @generated
	 */
	public Adapter createAs3LogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3BitwiseExpression <em>As3 Bitwise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3BitwiseExpression
	 * @generated
	 */
	public Adapter createAs3BitwiseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3EqualityExpression <em>As3 Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3EqualityExpression
	 * @generated
	 */
	public Adapter createAs3EqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3RelationalExpression <em>As3 Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3RelationalExpression
	 * @generated
	 */
	public Adapter createAs3RelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ShiftExpression <em>As3 Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ShiftExpression
	 * @generated
	 */
	public Adapter createAs3ShiftExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3AdditiveExpression <em>As3 Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3AdditiveExpression
	 * @generated
	 */
	public Adapter createAs3AdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3MultiplicativeExpression <em>As3 Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3MultiplicativeExpression
	 * @generated
	 */
	public Adapter createAs3MultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3UnaryExpression <em>As3 Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3UnaryExpression
	 * @generated
	 */
	public Adapter createAs3UnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3DeleteExpression <em>As3 Delete Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3DeleteExpression
	 * @generated
	 */
	public Adapter createAs3DeleteExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3VoidExpression <em>As3 Void Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3VoidExpression
	 * @generated
	 */
	public Adapter createAs3VoidExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3TypeOfExpression <em>As3 Type Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3TypeOfExpression
	 * @generated
	 */
	public Adapter createAs3TypeOfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PreIncrementExpression <em>As3 Pre Increment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PreIncrementExpression
	 * @generated
	 */
	public Adapter createAs3PreIncrementExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PreDecrementExpression <em>As3 Pre Decrement Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PreDecrementExpression
	 * @generated
	 */
	public Adapter createAs3PreDecrementExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3UnaryPlusExpression <em>As3 Unary Plus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3UnaryPlusExpression
	 * @generated
	 */
	public Adapter createAs3UnaryPlusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3UnaryMinusExpression <em>As3 Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3UnaryMinusExpression
	 * @generated
	 */
	public Adapter createAs3UnaryMinusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3BitwiseNotExpression <em>As3 Bitwise Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3BitwiseNotExpression
	 * @generated
	 */
	public Adapter createAs3BitwiseNotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3LogicalNotExpression <em>As3 Logical Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3LogicalNotExpression
	 * @generated
	 */
	public Adapter createAs3LogicalNotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PostfixExpression <em>As3 Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PostfixExpression
	 * @generated
	 */
	public Adapter createAs3PostfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PostIncrementExpression <em>As3 Post Increment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PostIncrementExpression
	 * @generated
	 */
	public Adapter createAs3PostIncrementExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PostDecrementExpression <em>As3 Post Decrement Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PostDecrementExpression
	 * @generated
	 */
	public Adapter createAs3PostDecrementExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3InvocationExpression <em>As3 Invocation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3InvocationExpression
	 * @generated
	 */
	public Adapter createAs3InvocationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3AccessExpression <em>As3 Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3AccessExpression
	 * @generated
	 */
	public Adapter createAs3AccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3QueryExpression <em>As3 Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3QueryExpression
	 * @generated
	 */
	public Adapter createAs3QueryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PostfixOperator <em>As3 Postfix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PostfixOperator
	 * @generated
	 */
	public Adapter createAs3PostfixOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PropertyOperator <em>As3 Property Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PropertyOperator
	 * @generated
	 */
	public Adapter createAs3PropertyOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3QueryOperator <em>As3 Query Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3QueryOperator
	 * @generated
	 */
	public Adapter createAs3QueryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3SimpleIdentifier <em>As3 Simple Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3SimpleIdentifier
	 * @generated
	 */
	public Adapter createAs3SimpleIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3PropertyIdentifier <em>As3 Property Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3PropertyIdentifier
	 * @generated
	 */
	public Adapter createAs3PropertyIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3QualifiedIdentifier <em>As3 Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3QualifiedIdentifier
	 * @generated
	 */
	public Adapter createAs3QualifiedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3AttributeQualifiedIdentifier <em>As3 Attribute Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3AttributeQualifiedIdentifier
	 * @generated
	 */
	public Adapter createAs3AttributeQualifiedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3NonAttributeQualifiedIdentifier <em>As3 Non Attribute Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3NonAttributeQualifiedIdentifier
	 * @generated
	 */
	public Adapter createAs3NonAttributeQualifiedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3SimpleQualifiedIdentifier <em>As3 Simple Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3SimpleQualifiedIdentifier
	 * @generated
	 */
	public Adapter createAs3SimpleQualifiedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ExpressionQualifiedIdentifier <em>As3 Expression Qualified Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ExpressionQualifiedIdentifier
	 * @generated
	 */
	public Adapter createAs3ExpressionQualifiedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ThisExpression <em>As3 This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ThisExpression
	 * @generated
	 */
	public Adapter createAs3ThisExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3SuperExpression <em>As3 Super Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3SuperExpression
	 * @generated
	 */
	public Adapter createAs3SuperExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ParenListExpression <em>As3 Paren List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ParenListExpression
	 * @generated
	 */
	public Adapter createAs3ParenListExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3FunctionExpression <em>As3 Function Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3FunctionExpression
	 * @generated
	 */
	public Adapter createAs3FunctionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3NewExpression <em>As3 New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3NewExpression
	 * @generated
	 */
	public Adapter createAs3NewExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ArrayInitializer <em>As3 Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ArrayInitializer
	 * @generated
	 */
	public Adapter createAs3ArrayInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ArrayElement <em>As3 Array Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ArrayElement
	 * @generated
	 */
	public Adapter createAs3ArrayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3ObjectInitializer <em>As3 Object Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3ObjectInitializer
	 * @generated
	 */
	public Adapter createAs3ObjectInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3LiteralField <em>As3 Literal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3LiteralField
	 * @generated
	 */
	public Adapter createAs3LiteralFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3XmlInitializer <em>As3 Xml Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3XmlInitializer
	 * @generated
	 */
	public Adapter createAs3XmlInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3NullLiteral <em>As3 Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3NullLiteral
	 * @generated
	 */
	public Adapter createAs3NullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3BooleanLiteral <em>As3 Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3BooleanLiteral
	 * @generated
	 */
	public Adapter createAs3BooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3NumberLiteral <em>As3 Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3NumberLiteral
	 * @generated
	 */
	public Adapter createAs3NumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3StringLiteral <em>As3 String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3StringLiteral
	 * @generated
	 */
	public Adapter createAs3StringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.as3.model.As3RegexLiteral <em>As3 Regex Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.as3.model.As3RegexLiteral
	 * @generated
	 */
	public Adapter createAs3RegexLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmElement <em>Avm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmElement
	 * @generated
	 */
	public Adapter createAvmElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmIdentifiable <em>Avm Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmIdentifiable
	 * @generated
	 */
	public Adapter createAvmIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDefinition <em>Avm Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDefinition
	 * @generated
	 */
	public Adapter createAvmDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDeclaredElement <em>Avm Declared Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDeclaredElement
	 * @generated
	 */
	public Adapter createAvmDeclaredElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmMember <em>Avm Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmMember
	 * @generated
	 */
	public Adapter createAvmMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmExecutable <em>Avm Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmExecutable
	 * @generated
	 */
	public Adapter createAvmExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDefinitionContainer <em>Avm Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDefinitionContainer
	 * @generated
	 */
	public Adapter createAvmDefinitionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmPackage <em>Avm Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmPackage
	 * @generated
	 */
	public Adapter createAvmPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmType <em>Avm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmType
	 * @generated
	 */
	public Adapter createAvmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmDeclaredType <em>Avm Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmDeclaredType
	 * @generated
	 */
	public Adapter createAvmDeclaredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmNamespace <em>Avm Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmNamespace
	 * @generated
	 */
	public Adapter createAvmNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmVariable <em>Avm Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmVariable
	 * @generated
	 */
	public Adapter createAvmVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmField <em>Avm Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmField
	 * @generated
	 */
	public Adapter createAvmFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmParameter <em>Avm Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmParameter
	 * @generated
	 */
	public Adapter createAvmParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmOperation <em>Avm Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmOperation
	 * @generated
	 */
	public Adapter createAvmOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.axdt.avm.model.AvmConstructor <em>Avm Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.axdt.avm.model.AvmConstructor
	 * @generated
	 */
	public Adapter createAvmConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //As3EAdapterFactory
