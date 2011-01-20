/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.util;

import java.util.List;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.*;
import org.axdt.avm.model.AvmClass;
import org.axdt.avm.model.AvmConstructor;
import org.axdt.avm.model.AvmDeclaredElement;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.axdt.avm.model.AvmElement;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmInterface;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmNamespace;
import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmVariable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.axdt.as3.As3EPackage
 * @generated
 */
public class As3ESwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static As3EPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3ESwitch() {
		if (modelPackage == null) {
			modelPackage = As3EPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case As3EPackage.IDIRECTIVE: {
				IDirective iDirective = (IDirective)theEObject;
				T result = caseIDirective(iDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IPACKAGE_DIRECTIVE: {
				IPackageDirective iPackageDirective = (IPackageDirective)theEObject;
				T result = caseIPackageDirective(iPackageDirective);
				if (result == null) result = caseIDirective(iPackageDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.ITYPE_DIRECTIVE: {
				ITypeDirective iTypeDirective = (ITypeDirective)theEObject;
				T result = caseITypeDirective(iTypeDirective);
				if (result == null) result = caseIPackageDirective(iTypeDirective);
				if (result == null) result = caseIDirective(iTypeDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IBLOCK_DIRECTIVE: {
				IBlockDirective iBlockDirective = (IBlockDirective)theEObject;
				T result = caseIBlockDirective(iBlockDirective);
				if (result == null) result = caseITypeDirective(iBlockDirective);
				if (result == null) result = caseICaseElement(iBlockDirective);
				if (result == null) result = caseIPackageDirective(iBlockDirective);
				if (result == null) result = caseIDirective(iBlockDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.ISTATEMENT: {
				IStatement iStatement = (IStatement)theEObject;
				T result = caseIStatement(iStatement);
				if (result == null) result = caseIBlockDirective(iStatement);
				if (result == null) result = caseITypeDirective(iStatement);
				if (result == null) result = caseICaseElement(iStatement);
				if (result == null) result = caseIPackageDirective(iStatement);
				if (result == null) result = caseIDirective(iStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IEXPRESSION: {
				IExpression iExpression = (IExpression)theEObject;
				T result = caseIExpression(iExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IASSIGNMENT_EXPRESSION: {
				IAssignmentExpression iAssignmentExpression = (IAssignmentExpression)theEObject;
				T result = caseIAssignmentExpression(iAssignmentExpression);
				if (result == null) result = caseIExpression(iAssignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.ICONDITIONAL_EXPRESSION: {
				IConditionalExpression iConditionalExpression = (IConditionalExpression)theEObject;
				T result = caseIConditionalExpression(iConditionalExpression);
				if (result == null) result = caseIAssignmentExpression(iConditionalExpression);
				if (result == null) result = caseIExpression(iConditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.ILOGICAL_EXPRESSION: {
				ILogicalExpression iLogicalExpression = (ILogicalExpression)theEObject;
				T result = caseILogicalExpression(iLogicalExpression);
				if (result == null) result = caseIConditionalExpression(iLogicalExpression);
				if (result == null) result = caseIAssignmentExpression(iLogicalExpression);
				if (result == null) result = caseIExpression(iLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IBITWISE_EXPRESSION: {
				IBitwiseExpression iBitwiseExpression = (IBitwiseExpression)theEObject;
				T result = caseIBitwiseExpression(iBitwiseExpression);
				if (result == null) result = caseILogicalExpression(iBitwiseExpression);
				if (result == null) result = caseIConditionalExpression(iBitwiseExpression);
				if (result == null) result = caseIAssignmentExpression(iBitwiseExpression);
				if (result == null) result = caseIExpression(iBitwiseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IEQUALITY_EXPRESSION: {
				IEqualityExpression iEqualityExpression = (IEqualityExpression)theEObject;
				T result = caseIEqualityExpression(iEqualityExpression);
				if (result == null) result = caseIBitwiseExpression(iEqualityExpression);
				if (result == null) result = caseILogicalExpression(iEqualityExpression);
				if (result == null) result = caseIConditionalExpression(iEqualityExpression);
				if (result == null) result = caseIAssignmentExpression(iEqualityExpression);
				if (result == null) result = caseIExpression(iEqualityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IRELATIONAL_EXPRESSION: {
				IRelationalExpression iRelationalExpression = (IRelationalExpression)theEObject;
				T result = caseIRelationalExpression(iRelationalExpression);
				if (result == null) result = caseIEqualityExpression(iRelationalExpression);
				if (result == null) result = caseIBitwiseExpression(iRelationalExpression);
				if (result == null) result = caseILogicalExpression(iRelationalExpression);
				if (result == null) result = caseIConditionalExpression(iRelationalExpression);
				if (result == null) result = caseIAssignmentExpression(iRelationalExpression);
				if (result == null) result = caseIExpression(iRelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IARITHMETIC_EXPRESSION: {
				IArithmeticExpression iArithmeticExpression = (IArithmeticExpression)theEObject;
				T result = caseIArithmeticExpression(iArithmeticExpression);
				if (result == null) result = caseIRelationalExpression(iArithmeticExpression);
				if (result == null) result = caseIEqualityExpression(iArithmeticExpression);
				if (result == null) result = caseIBitwiseExpression(iArithmeticExpression);
				if (result == null) result = caseILogicalExpression(iArithmeticExpression);
				if (result == null) result = caseIConditionalExpression(iArithmeticExpression);
				if (result == null) result = caseIAssignmentExpression(iArithmeticExpression);
				if (result == null) result = caseIExpression(iArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IUNARY_EXPRESSION: {
				IUnaryExpression iUnaryExpression = (IUnaryExpression)theEObject;
				T result = caseIUnaryExpression(iUnaryExpression);
				if (result == null) result = caseIArithmeticExpression(iUnaryExpression);
				if (result == null) result = caseIRelationalExpression(iUnaryExpression);
				if (result == null) result = caseIEqualityExpression(iUnaryExpression);
				if (result == null) result = caseIBitwiseExpression(iUnaryExpression);
				if (result == null) result = caseILogicalExpression(iUnaryExpression);
				if (result == null) result = caseIConditionalExpression(iUnaryExpression);
				if (result == null) result = caseIAssignmentExpression(iUnaryExpression);
				if (result == null) result = caseIExpression(iUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IPOSTFIX_EXPRESSION: {
				IPostfixExpression iPostfixExpression = (IPostfixExpression)theEObject;
				T result = caseIPostfixExpression(iPostfixExpression);
				if (result == null) result = caseIUnaryExpression(iPostfixExpression);
				if (result == null) result = caseIForInInit(iPostfixExpression);
				if (result == null) result = caseIArithmeticExpression(iPostfixExpression);
				if (result == null) result = caseIRelationalExpression(iPostfixExpression);
				if (result == null) result = caseIEqualityExpression(iPostfixExpression);
				if (result == null) result = caseIBitwiseExpression(iPostfixExpression);
				if (result == null) result = caseILogicalExpression(iPostfixExpression);
				if (result == null) result = caseIConditionalExpression(iPostfixExpression);
				if (result == null) result = caseIAssignmentExpression(iPostfixExpression);
				if (result == null) result = caseIExpression(iPostfixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IPRIMARY_EXPRESSION: {
				IPrimaryExpression iPrimaryExpression = (IPrimaryExpression)theEObject;
				T result = caseIPrimaryExpression(iPrimaryExpression);
				if (result == null) result = caseIPostfixExpression(iPrimaryExpression);
				if (result == null) result = caseIUnaryExpression(iPrimaryExpression);
				if (result == null) result = caseIForInInit(iPrimaryExpression);
				if (result == null) result = caseIArithmeticExpression(iPrimaryExpression);
				if (result == null) result = caseIRelationalExpression(iPrimaryExpression);
				if (result == null) result = caseIEqualityExpression(iPrimaryExpression);
				if (result == null) result = caseIBitwiseExpression(iPrimaryExpression);
				if (result == null) result = caseILogicalExpression(iPrimaryExpression);
				if (result == null) result = caseIConditionalExpression(iPrimaryExpression);
				if (result == null) result = caseIAssignmentExpression(iPrimaryExpression);
				if (result == null) result = caseIExpression(iPrimaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IIDENTIFIER: {
				IIdentifier iIdentifier = (IIdentifier)theEObject;
				T result = caseIIdentifier(iIdentifier);
				if (result == null) result = caseIPrimaryExpression(iIdentifier);
				if (result == null) result = caseIPostfixExpression(iIdentifier);
				if (result == null) result = caseIUnaryExpression(iIdentifier);
				if (result == null) result = caseIForInInit(iIdentifier);
				if (result == null) result = caseIArithmeticExpression(iIdentifier);
				if (result == null) result = caseIRelationalExpression(iIdentifier);
				if (result == null) result = caseIEqualityExpression(iIdentifier);
				if (result == null) result = caseIBitwiseExpression(iIdentifier);
				if (result == null) result = caseILogicalExpression(iIdentifier);
				if (result == null) result = caseIConditionalExpression(iIdentifier);
				if (result == null) result = caseIAssignmentExpression(iIdentifier);
				if (result == null) result = caseIExpression(iIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.ILITERAL: {
				ILiteral iLiteral = (ILiteral)theEObject;
				T result = caseILiteral(iLiteral);
				if (result == null) result = caseIPrimaryExpression(iLiteral);
				if (result == null) result = caseIPostfixExpression(iLiteral);
				if (result == null) result = caseIUnaryExpression(iLiteral);
				if (result == null) result = caseIForInInit(iLiteral);
				if (result == null) result = caseIArithmeticExpression(iLiteral);
				if (result == null) result = caseIRelationalExpression(iLiteral);
				if (result == null) result = caseIEqualityExpression(iLiteral);
				if (result == null) result = caseIBitwiseExpression(iLiteral);
				if (result == null) result = caseILogicalExpression(iLiteral);
				if (result == null) result = caseIConditionalExpression(iLiteral);
				if (result == null) result = caseIAssignmentExpression(iLiteral);
				if (result == null) result = caseIExpression(iLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.ILITERAL_FIELD_NAME: {
				ILiteralFieldName iLiteralFieldName = (ILiteralFieldName)theEObject;
				T result = caseILiteralFieldName(iLiteralFieldName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.ICASE_ELEMENT: {
				ICaseElement iCaseElement = (ICaseElement)theEObject;
				T result = caseICaseElement(iCaseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.INON_ATTRIBUTE_IDENTIFIER: {
				INonAttributeIdentifier iNonAttributeIdentifier = (INonAttributeIdentifier)theEObject;
				T result = caseINonAttributeIdentifier(iNonAttributeIdentifier);
				if (result == null) result = caseIIdentifier(iNonAttributeIdentifier);
				if (result == null) result = caseIPrimaryExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIPostfixExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIUnaryExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIForInInit(iNonAttributeIdentifier);
				if (result == null) result = caseIArithmeticExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIRelationalExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIEqualityExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIBitwiseExpression(iNonAttributeIdentifier);
				if (result == null) result = caseILogicalExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIConditionalExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIAssignmentExpression(iNonAttributeIdentifier);
				if (result == null) result = caseIExpression(iNonAttributeIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IATTRIBUTE: {
				IAttribute iAttribute = (IAttribute)theEObject;
				T result = caseIAttribute(iAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IFOR_INIT: {
				IForInit iForInit = (IForInit)theEObject;
				T result = caseIForInit(iForInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.IFOR_IN_INIT: {
				IForInInit iForInInit = (IForInInit)theEObject;
				T result = caseIForInInit(iForInInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ELEMENT: {
				As3Element as3Element = (As3Element)theEObject;
				T result = caseAs3Element(as3Element);
				if (result == null) result = caseAvmElement(as3Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_IDENTIFIABLE: {
				As3Identifiable as3Identifiable = (As3Identifiable)theEObject;
				T result = caseAs3Identifiable(as3Identifiable);
				if (result == null) result = caseAs3Element(as3Identifiable);
				if (result == null) result = caseAvmIdentifiable(as3Identifiable);
				if (result == null) result = caseAvmElement(as3Identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_DEFINITION: {
				As3Definition as3Definition = (As3Definition)theEObject;
				T result = caseAs3Definition(as3Definition);
				if (result == null) result = caseAs3Identifiable(as3Definition);
				if (result == null) result = caseAvmDefinition(as3Definition);
				if (result == null) result = caseAs3Element(as3Definition);
				if (result == null) result = caseAvmIdentifiable(as3Definition);
				if (result == null) result = caseAvmElement(as3Definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_MEMBER: {
				As3Member as3Member = (As3Member)theEObject;
				T result = caseAs3Member(as3Member);
				if (result == null) result = caseAs3Definition(as3Member);
				if (result == null) result = caseAvmMember(as3Member);
				if (result == null) result = caseITypeDirective(as3Member);
				if (result == null) result = caseAs3Identifiable(as3Member);
				if (result == null) result = caseAvmDeclaredElement(as3Member);
				if (result == null) result = caseAvmReferable(as3Member);
				if (result == null) result = caseIPackageDirective(as3Member);
				if (result == null) result = caseAs3Element(as3Member);
				if (result == null) result = caseAvmIdentifiable(as3Member);
				if (result == null) result = caseAvmDefinition(as3Member);
				if (result == null) result = caseIDirective(as3Member);
				if (result == null) result = caseAvmElement(as3Member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_EXECUTABLE: {
				As3Executable as3Executable = (As3Executable)theEObject;
				T result = caseAs3Executable(as3Executable);
				if (result == null) result = caseAvmExecutable(as3Executable);
				if (result == null) result = caseAvmIdentifiable(as3Executable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PROGRAM: {
				As3Program as3Program = (As3Program)theEObject;
				T result = caseAs3Program(as3Program);
				if (result == null) result = caseAs3Element(as3Program);
				if (result == null) result = caseAvmDefinitionContainer(as3Program);
				if (result == null) result = caseAvmElement(as3Program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_IMPORT: {
				As3Import as3Import = (As3Import)theEObject;
				T result = caseAs3Import(as3Import);
				if (result == null) result = caseIDirective(as3Import);
				if (result == null) result = caseAvmDefinition(as3Import);
				if (result == null) result = caseAvmIdentifiable(as3Import);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_IMPORT_LIST: {
				As3ImportList as3ImportList = (As3ImportList)theEObject;
				T result = caseAs3ImportList(as3ImportList);
				if (result == null) result = caseIBlockDirective(as3ImportList);
				if (result == null) result = caseITypeDirective(as3ImportList);
				if (result == null) result = caseICaseElement(as3ImportList);
				if (result == null) result = caseIPackageDirective(as3ImportList);
				if (result == null) result = caseIDirective(as3ImportList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_INCLUDE: {
				As3Include as3Include = (As3Include)theEObject;
				T result = caseAs3Include(as3Include);
				if (result == null) result = caseIBlockDirective(as3Include);
				if (result == null) result = caseITypeDirective(as3Include);
				if (result == null) result = caseICaseElement(as3Include);
				if (result == null) result = caseIPackageDirective(as3Include);
				if (result == null) result = caseIDirective(as3Include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_USE: {
				As3Use as3Use = (As3Use)theEObject;
				T result = caseAs3Use(as3Use);
				if (result == null) result = caseIBlockDirective(as3Use);
				if (result == null) result = caseITypeDirective(as3Use);
				if (result == null) result = caseICaseElement(as3Use);
				if (result == null) result = caseIPackageDirective(as3Use);
				if (result == null) result = caseIDirective(as3Use);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PACKAGE: {
				As3Package as3Package = (As3Package)theEObject;
				T result = caseAs3Package(as3Package);
				if (result == null) result = caseAs3Identifiable(as3Package);
				if (result == null) result = caseAvmPackage(as3Package);
				if (result == null) result = caseAs3Element(as3Package);
				if (result == null) result = caseAvmDefinitionContainer(as3Package);
				if (result == null) result = caseAvmDefinition(as3Package);
				if (result == null) result = caseAvmElement(as3Package);
				if (result == null) result = caseAvmIdentifiable(as3Package);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_TYPE: {
				As3Type as3Type = (As3Type)theEObject;
				T result = caseAs3Type(as3Type);
				if (result == null) result = caseAs3Definition(as3Type);
				if (result == null) result = caseAvmDeclaredType(as3Type);
				if (result == null) result = caseIPackageDirective(as3Type);
				if (result == null) result = caseAs3Identifiable(as3Type);
				if (result == null) result = caseAvmDeclaredElement(as3Type);
				if (result == null) result = caseAvmType(as3Type);
				if (result == null) result = caseIDirective(as3Type);
				if (result == null) result = caseAs3Element(as3Type);
				if (result == null) result = caseAvmDefinition(as3Type);
				if (result == null) result = caseAvmReferable(as3Type);
				if (result == null) result = caseAvmElement(as3Type);
				if (result == null) result = caseAvmIdentifiable(as3Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CLASS: {
				As3Class as3Class = (As3Class)theEObject;
				T result = caseAs3Class(as3Class);
				if (result == null) result = caseAs3Type(as3Class);
				if (result == null) result = caseAvmClass(as3Class);
				if (result == null) result = caseAs3Definition(as3Class);
				if (result == null) result = caseAvmDeclaredType(as3Class);
				if (result == null) result = caseIPackageDirective(as3Class);
				if (result == null) result = caseAs3Identifiable(as3Class);
				if (result == null) result = caseAvmDeclaredElement(as3Class);
				if (result == null) result = caseAvmType(as3Class);
				if (result == null) result = caseIDirective(as3Class);
				if (result == null) result = caseAs3Element(as3Class);
				if (result == null) result = caseAvmDefinition(as3Class);
				if (result == null) result = caseAvmReferable(as3Class);
				if (result == null) result = caseAvmElement(as3Class);
				if (result == null) result = caseAvmIdentifiable(as3Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_INTERFACE: {
				As3Interface as3Interface = (As3Interface)theEObject;
				T result = caseAs3Interface(as3Interface);
				if (result == null) result = caseAs3Type(as3Interface);
				if (result == null) result = caseAvmInterface(as3Interface);
				if (result == null) result = caseAs3Definition(as3Interface);
				if (result == null) result = caseAvmDeclaredType(as3Interface);
				if (result == null) result = caseIPackageDirective(as3Interface);
				if (result == null) result = caseAs3Identifiable(as3Interface);
				if (result == null) result = caseAvmDeclaredElement(as3Interface);
				if (result == null) result = caseAvmType(as3Interface);
				if (result == null) result = caseIDirective(as3Interface);
				if (result == null) result = caseAs3Element(as3Interface);
				if (result == null) result = caseAvmDefinition(as3Interface);
				if (result == null) result = caseAvmReferable(as3Interface);
				if (result == null) result = caseAvmElement(as3Interface);
				if (result == null) result = caseAvmIdentifiable(as3Interface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_NAMESPACE: {
				As3Namespace as3Namespace = (As3Namespace)theEObject;
				T result = caseAs3Namespace(as3Namespace);
				if (result == null) result = caseAs3Member(as3Namespace);
				if (result == null) result = caseAvmNamespace(as3Namespace);
				if (result == null) result = caseIBlockDirective(as3Namespace);
				if (result == null) result = caseAs3Definition(as3Namespace);
				if (result == null) result = caseAvmMember(as3Namespace);
				if (result == null) result = caseITypeDirective(as3Namespace);
				if (result == null) result = caseICaseElement(as3Namespace);
				if (result == null) result = caseAs3Identifiable(as3Namespace);
				if (result == null) result = caseAvmDeclaredElement(as3Namespace);
				if (result == null) result = caseAvmReferable(as3Namespace);
				if (result == null) result = caseIPackageDirective(as3Namespace);
				if (result == null) result = caseAs3Element(as3Namespace);
				if (result == null) result = caseAvmIdentifiable(as3Namespace);
				if (result == null) result = caseAvmDefinition(as3Namespace);
				if (result == null) result = caseIDirective(as3Namespace);
				if (result == null) result = caseAvmElement(as3Namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_VARIABLE: {
				As3Variable as3Variable = (As3Variable)theEObject;
				T result = caseAs3Variable(as3Variable);
				if (result == null) result = caseAs3Identifiable(as3Variable);
				if (result == null) result = caseAvmVariable(as3Variable);
				if (result == null) result = caseAs3Element(as3Variable);
				if (result == null) result = caseAvmReferable(as3Variable);
				if (result == null) result = caseAvmElement(as3Variable);
				if (result == null) result = caseAvmIdentifiable(as3Variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_VARIABLE_ASSIGN: {
				As3VariableAssign as3VariableAssign = (As3VariableAssign)theEObject;
				T result = caseAs3VariableAssign(as3VariableAssign);
				if (result == null) result = caseAs3Variable(as3VariableAssign);
				if (result == null) result = caseAs3Identifiable(as3VariableAssign);
				if (result == null) result = caseAvmVariable(as3VariableAssign);
				if (result == null) result = caseAs3Element(as3VariableAssign);
				if (result == null) result = caseAvmReferable(as3VariableAssign);
				if (result == null) result = caseAvmElement(as3VariableAssign);
				if (result == null) result = caseAvmIdentifiable(as3VariableAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_VARIABLE_DEFINITION: {
				As3VariableDefinition as3VariableDefinition = (As3VariableDefinition)theEObject;
				T result = caseAs3VariableDefinition(as3VariableDefinition);
				if (result == null) result = caseIStatement(as3VariableDefinition);
				if (result == null) result = caseIForInit(as3VariableDefinition);
				if (result == null) result = caseIForInInit(as3VariableDefinition);
				if (result == null) result = caseIBlockDirective(as3VariableDefinition);
				if (result == null) result = caseITypeDirective(as3VariableDefinition);
				if (result == null) result = caseICaseElement(as3VariableDefinition);
				if (result == null) result = caseIPackageDirective(as3VariableDefinition);
				if (result == null) result = caseIDirective(as3VariableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PARAMETER: {
				As3Parameter as3Parameter = (As3Parameter)theEObject;
				T result = caseAs3Parameter(as3Parameter);
				if (result == null) result = caseAs3Variable(as3Parameter);
				if (result == null) result = caseAvmParameter(as3Parameter);
				if (result == null) result = caseAs3Identifiable(as3Parameter);
				if (result == null) result = caseAvmVariable(as3Parameter);
				if (result == null) result = caseAs3Element(as3Parameter);
				if (result == null) result = caseAvmReferable(as3Parameter);
				if (result == null) result = caseAvmElement(as3Parameter);
				if (result == null) result = caseAvmIdentifiable(as3Parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PARAMETER_ASSIGN: {
				As3ParameterAssign as3ParameterAssign = (As3ParameterAssign)theEObject;
				T result = caseAs3ParameterAssign(as3ParameterAssign);
				if (result == null) result = caseAs3Parameter(as3ParameterAssign);
				if (result == null) result = caseAs3Variable(as3ParameterAssign);
				if (result == null) result = caseAvmParameter(as3ParameterAssign);
				if (result == null) result = caseAs3Identifiable(as3ParameterAssign);
				if (result == null) result = caseAvmVariable(as3ParameterAssign);
				if (result == null) result = caseAs3Element(as3ParameterAssign);
				if (result == null) result = caseAvmReferable(as3ParameterAssign);
				if (result == null) result = caseAvmElement(as3ParameterAssign);
				if (result == null) result = caseAvmIdentifiable(as3ParameterAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PARAMETER_REST: {
				As3ParameterRest as3ParameterRest = (As3ParameterRest)theEObject;
				T result = caseAs3ParameterRest(as3ParameterRest);
				if (result == null) result = caseAs3Parameter(as3ParameterRest);
				if (result == null) result = caseAs3Variable(as3ParameterRest);
				if (result == null) result = caseAvmParameter(as3ParameterRest);
				if (result == null) result = caseAs3Identifiable(as3ParameterRest);
				if (result == null) result = caseAvmVariable(as3ParameterRest);
				if (result == null) result = caseAs3Element(as3ParameterRest);
				if (result == null) result = caseAvmReferable(as3ParameterRest);
				if (result == null) result = caseAvmElement(as3ParameterRest);
				if (result == null) result = caseAvmIdentifiable(as3ParameterRest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_FIELD_BINDING: {
				As3FieldBinding as3FieldBinding = (As3FieldBinding)theEObject;
				T result = caseAs3FieldBinding(as3FieldBinding);
				if (result == null) result = caseAs3Member(as3FieldBinding);
				if (result == null) result = caseAvmField(as3FieldBinding);
				if (result == null) result = caseAs3Definition(as3FieldBinding);
				if (result == null) result = caseAvmMember(as3FieldBinding);
				if (result == null) result = caseITypeDirective(as3FieldBinding);
				if (result == null) result = caseAvmVariable(as3FieldBinding);
				if (result == null) result = caseAs3Identifiable(as3FieldBinding);
				if (result == null) result = caseAvmDeclaredElement(as3FieldBinding);
				if (result == null) result = caseAvmReferable(as3FieldBinding);
				if (result == null) result = caseIPackageDirective(as3FieldBinding);
				if (result == null) result = caseAs3Element(as3FieldBinding);
				if (result == null) result = caseAvmIdentifiable(as3FieldBinding);
				if (result == null) result = caseAvmDefinition(as3FieldBinding);
				if (result == null) result = caseIDirective(as3FieldBinding);
				if (result == null) result = caseAvmElement(as3FieldBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_FIELD_DEFINITION: {
				As3FieldDefinition as3FieldDefinition = (As3FieldDefinition)theEObject;
				T result = caseAs3FieldDefinition(as3FieldDefinition);
				if (result == null) result = caseITypeDirective(as3FieldDefinition);
				if (result == null) result = caseIPackageDirective(as3FieldDefinition);
				if (result == null) result = caseIDirective(as3FieldDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_OPERATION: {
				As3Operation as3Operation = (As3Operation)theEObject;
				T result = caseAs3Operation(as3Operation);
				if (result == null) result = caseAs3Member(as3Operation);
				if (result == null) result = caseAs3Executable(as3Operation);
				if (result == null) result = caseAvmOperation(as3Operation);
				if (result == null) result = caseAs3Definition(as3Operation);
				if (result == null) result = caseAvmMember(as3Operation);
				if (result == null) result = caseITypeDirective(as3Operation);
				if (result == null) result = caseAvmExecutable(as3Operation);
				if (result == null) result = caseAs3Identifiable(as3Operation);
				if (result == null) result = caseAvmDeclaredElement(as3Operation);
				if (result == null) result = caseAvmReferable(as3Operation);
				if (result == null) result = caseIPackageDirective(as3Operation);
				if (result == null) result = caseAs3Element(as3Operation);
				if (result == null) result = caseAvmIdentifiable(as3Operation);
				if (result == null) result = caseAvmDefinition(as3Operation);
				if (result == null) result = caseIDirective(as3Operation);
				if (result == null) result = caseAvmElement(as3Operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CONSTRUCTOR: {
				As3Constructor as3Constructor = (As3Constructor)theEObject;
				T result = caseAs3Constructor(as3Constructor);
				if (result == null) result = caseAs3Member(as3Constructor);
				if (result == null) result = caseAs3Executable(as3Constructor);
				if (result == null) result = caseAvmConstructor(as3Constructor);
				if (result == null) result = caseAs3Definition(as3Constructor);
				if (result == null) result = caseAvmMember(as3Constructor);
				if (result == null) result = caseITypeDirective(as3Constructor);
				if (result == null) result = caseAvmExecutable(as3Constructor);
				if (result == null) result = caseAs3Identifiable(as3Constructor);
				if (result == null) result = caseAvmDeclaredElement(as3Constructor);
				if (result == null) result = caseAvmReferable(as3Constructor);
				if (result == null) result = caseIPackageDirective(as3Constructor);
				if (result == null) result = caseAs3Element(as3Constructor);
				if (result == null) result = caseAvmIdentifiable(as3Constructor);
				if (result == null) result = caseAvmDefinition(as3Constructor);
				if (result == null) result = caseIDirective(as3Constructor);
				if (result == null) result = caseAvmElement(as3Constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_METADATA_TAG: {
				As3MetadataTag as3MetadataTag = (As3MetadataTag)theEObject;
				T result = caseAs3MetadataTag(as3MetadataTag);
				if (result == null) result = caseIAttribute(as3MetadataTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_METADATA_PARAMETER: {
				As3MetadataParameter as3MetadataParameter = (As3MetadataParameter)theEObject;
				T result = caseAs3MetadataParameter(as3MetadataParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ATTRIBUTE_EXPRESSION: {
				As3AttributeExpression as3AttributeExpression = (As3AttributeExpression)theEObject;
				T result = caseAs3AttributeExpression(as3AttributeExpression);
				if (result == null) result = caseIAttribute(as3AttributeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_SIMPLE_ATTRIBUTE_EXPRESSION: {
				As3SimpleAttributeExpression as3SimpleAttributeExpression = (As3SimpleAttributeExpression)theEObject;
				T result = caseAs3SimpleAttributeExpression(as3SimpleAttributeExpression);
				if (result == null) result = caseAs3AttributeExpression(as3SimpleAttributeExpression);
				if (result == null) result = caseIAttribute(as3SimpleAttributeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_QUALIFIED_ATTRIBUTE_EXPRESSION: {
				As3QualifiedAttributeExpression as3QualifiedAttributeExpression = (As3QualifiedAttributeExpression)theEObject;
				T result = caseAs3QualifiedAttributeExpression(as3QualifiedAttributeExpression);
				if (result == null) result = caseAs3AttributeExpression(as3QualifiedAttributeExpression);
				if (result == null) result = caseIAttribute(as3QualifiedAttributeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_DEFAULT_XML_NAMESPACE_STATEMENT: {
				As3DefaultXmlNamespaceStatement as3DefaultXmlNamespaceStatement = (As3DefaultXmlNamespaceStatement)theEObject;
				T result = caseAs3DefaultXmlNamespaceStatement(as3DefaultXmlNamespaceStatement);
				if (result == null) result = caseIStatement(as3DefaultXmlNamespaceStatement);
				if (result == null) result = caseIBlockDirective(as3DefaultXmlNamespaceStatement);
				if (result == null) result = caseITypeDirective(as3DefaultXmlNamespaceStatement);
				if (result == null) result = caseICaseElement(as3DefaultXmlNamespaceStatement);
				if (result == null) result = caseIPackageDirective(as3DefaultXmlNamespaceStatement);
				if (result == null) result = caseIDirective(as3DefaultXmlNamespaceStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_TRY_STATEMENT: {
				As3TryStatement as3TryStatement = (As3TryStatement)theEObject;
				T result = caseAs3TryStatement(as3TryStatement);
				if (result == null) result = caseIStatement(as3TryStatement);
				if (result == null) result = caseIBlockDirective(as3TryStatement);
				if (result == null) result = caseITypeDirective(as3TryStatement);
				if (result == null) result = caseICaseElement(as3TryStatement);
				if (result == null) result = caseIPackageDirective(as3TryStatement);
				if (result == null) result = caseIDirective(as3TryStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CATCH_CLAUSE: {
				As3CatchClause as3CatchClause = (As3CatchClause)theEObject;
				T result = caseAs3CatchClause(as3CatchClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_THROW_STATEMENT: {
				As3ThrowStatement as3ThrowStatement = (As3ThrowStatement)theEObject;
				T result = caseAs3ThrowStatement(as3ThrowStatement);
				if (result == null) result = caseIStatement(as3ThrowStatement);
				if (result == null) result = caseIBlockDirective(as3ThrowStatement);
				if (result == null) result = caseITypeDirective(as3ThrowStatement);
				if (result == null) result = caseICaseElement(as3ThrowStatement);
				if (result == null) result = caseIPackageDirective(as3ThrowStatement);
				if (result == null) result = caseIDirective(as3ThrowStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_RETURN_STATEMENT: {
				As3ReturnStatement as3ReturnStatement = (As3ReturnStatement)theEObject;
				T result = caseAs3ReturnStatement(as3ReturnStatement);
				if (result == null) result = caseIStatement(as3ReturnStatement);
				if (result == null) result = caseIBlockDirective(as3ReturnStatement);
				if (result == null) result = caseITypeDirective(as3ReturnStatement);
				if (result == null) result = caseICaseElement(as3ReturnStatement);
				if (result == null) result = caseIPackageDirective(as3ReturnStatement);
				if (result == null) result = caseIDirective(as3ReturnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_WITH_STATEMENT: {
				As3WithStatement as3WithStatement = (As3WithStatement)theEObject;
				T result = caseAs3WithStatement(as3WithStatement);
				if (result == null) result = caseIStatement(as3WithStatement);
				if (result == null) result = caseIBlockDirective(as3WithStatement);
				if (result == null) result = caseITypeDirective(as3WithStatement);
				if (result == null) result = caseICaseElement(as3WithStatement);
				if (result == null) result = caseIPackageDirective(as3WithStatement);
				if (result == null) result = caseIDirective(as3WithStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_BREAK_STATEMENT: {
				As3BreakStatement as3BreakStatement = (As3BreakStatement)theEObject;
				T result = caseAs3BreakStatement(as3BreakStatement);
				if (result == null) result = caseIStatement(as3BreakStatement);
				if (result == null) result = caseIBlockDirective(as3BreakStatement);
				if (result == null) result = caseITypeDirective(as3BreakStatement);
				if (result == null) result = caseICaseElement(as3BreakStatement);
				if (result == null) result = caseIPackageDirective(as3BreakStatement);
				if (result == null) result = caseIDirective(as3BreakStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CONTINUE_STATEMENT: {
				As3ContinueStatement as3ContinueStatement = (As3ContinueStatement)theEObject;
				T result = caseAs3ContinueStatement(as3ContinueStatement);
				if (result == null) result = caseIStatement(as3ContinueStatement);
				if (result == null) result = caseIBlockDirective(as3ContinueStatement);
				if (result == null) result = caseITypeDirective(as3ContinueStatement);
				if (result == null) result = caseICaseElement(as3ContinueStatement);
				if (result == null) result = caseIPackageDirective(as3ContinueStatement);
				if (result == null) result = caseIDirective(as3ContinueStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ITERATION_STATEMENT: {
				As3IterationStatement as3IterationStatement = (As3IterationStatement)theEObject;
				T result = caseAs3IterationStatement(as3IterationStatement);
				if (result == null) result = caseIStatement(as3IterationStatement);
				if (result == null) result = caseIBlockDirective(as3IterationStatement);
				if (result == null) result = caseITypeDirective(as3IterationStatement);
				if (result == null) result = caseICaseElement(as3IterationStatement);
				if (result == null) result = caseIPackageDirective(as3IterationStatement);
				if (result == null) result = caseIDirective(as3IterationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CONDITIONAL_ITERATION_STATEMENT: {
				As3ConditionalIterationStatement as3ConditionalIterationStatement = (As3ConditionalIterationStatement)theEObject;
				T result = caseAs3ConditionalIterationStatement(as3ConditionalIterationStatement);
				if (result == null) result = caseAs3IterationStatement(as3ConditionalIterationStatement);
				if (result == null) result = caseIStatement(as3ConditionalIterationStatement);
				if (result == null) result = caseIBlockDirective(as3ConditionalIterationStatement);
				if (result == null) result = caseITypeDirective(as3ConditionalIterationStatement);
				if (result == null) result = caseICaseElement(as3ConditionalIterationStatement);
				if (result == null) result = caseIPackageDirective(as3ConditionalIterationStatement);
				if (result == null) result = caseIDirective(as3ConditionalIterationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_DO_STATEMENT: {
				As3DoStatement as3DoStatement = (As3DoStatement)theEObject;
				T result = caseAs3DoStatement(as3DoStatement);
				if (result == null) result = caseAs3ConditionalIterationStatement(as3DoStatement);
				if (result == null) result = caseAs3IterationStatement(as3DoStatement);
				if (result == null) result = caseIStatement(as3DoStatement);
				if (result == null) result = caseIBlockDirective(as3DoStatement);
				if (result == null) result = caseITypeDirective(as3DoStatement);
				if (result == null) result = caseICaseElement(as3DoStatement);
				if (result == null) result = caseIPackageDirective(as3DoStatement);
				if (result == null) result = caseIDirective(as3DoStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_WHILE_STATEMENT: {
				As3WhileStatement as3WhileStatement = (As3WhileStatement)theEObject;
				T result = caseAs3WhileStatement(as3WhileStatement);
				if (result == null) result = caseAs3ConditionalIterationStatement(as3WhileStatement);
				if (result == null) result = caseAs3IterationStatement(as3WhileStatement);
				if (result == null) result = caseIStatement(as3WhileStatement);
				if (result == null) result = caseIBlockDirective(as3WhileStatement);
				if (result == null) result = caseITypeDirective(as3WhileStatement);
				if (result == null) result = caseICaseElement(as3WhileStatement);
				if (result == null) result = caseIPackageDirective(as3WhileStatement);
				if (result == null) result = caseIDirective(as3WhileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_FOR_STATEMENT: {
				As3ForStatement as3ForStatement = (As3ForStatement)theEObject;
				T result = caseAs3ForStatement(as3ForStatement);
				if (result == null) result = caseAs3ConditionalIterationStatement(as3ForStatement);
				if (result == null) result = caseAs3IterationStatement(as3ForStatement);
				if (result == null) result = caseIStatement(as3ForStatement);
				if (result == null) result = caseIBlockDirective(as3ForStatement);
				if (result == null) result = caseITypeDirective(as3ForStatement);
				if (result == null) result = caseICaseElement(as3ForStatement);
				if (result == null) result = caseIPackageDirective(as3ForStatement);
				if (result == null) result = caseIDirective(as3ForStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_FOR_IN_STATEMENT: {
				As3ForInStatement as3ForInStatement = (As3ForInStatement)theEObject;
				T result = caseAs3ForInStatement(as3ForInStatement);
				if (result == null) result = caseAs3IterationStatement(as3ForInStatement);
				if (result == null) result = caseIStatement(as3ForInStatement);
				if (result == null) result = caseIBlockDirective(as3ForInStatement);
				if (result == null) result = caseITypeDirective(as3ForInStatement);
				if (result == null) result = caseICaseElement(as3ForInStatement);
				if (result == null) result = caseIPackageDirective(as3ForInStatement);
				if (result == null) result = caseIDirective(as3ForInStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CONDITIONAL_STATEMENT: {
				As3ConditionalStatement as3ConditionalStatement = (As3ConditionalStatement)theEObject;
				T result = caseAs3ConditionalStatement(as3ConditionalStatement);
				if (result == null) result = caseIStatement(as3ConditionalStatement);
				if (result == null) result = caseIBlockDirective(as3ConditionalStatement);
				if (result == null) result = caseITypeDirective(as3ConditionalStatement);
				if (result == null) result = caseICaseElement(as3ConditionalStatement);
				if (result == null) result = caseIPackageDirective(as3ConditionalStatement);
				if (result == null) result = caseIDirective(as3ConditionalStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_SWITCH_STATEMENT: {
				As3SwitchStatement as3SwitchStatement = (As3SwitchStatement)theEObject;
				T result = caseAs3SwitchStatement(as3SwitchStatement);
				if (result == null) result = caseAs3ConditionalStatement(as3SwitchStatement);
				if (result == null) result = caseIStatement(as3SwitchStatement);
				if (result == null) result = caseIBlockDirective(as3SwitchStatement);
				if (result == null) result = caseITypeDirective(as3SwitchStatement);
				if (result == null) result = caseICaseElement(as3SwitchStatement);
				if (result == null) result = caseIPackageDirective(as3SwitchStatement);
				if (result == null) result = caseIDirective(as3SwitchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CASE_LABEL: {
				As3CaseLabel as3CaseLabel = (As3CaseLabel)theEObject;
				T result = caseAs3CaseLabel(as3CaseLabel);
				if (result == null) result = caseICaseElement(as3CaseLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_DEFAULT_CASE: {
				As3DefaultCase as3DefaultCase = (As3DefaultCase)theEObject;
				T result = caseAs3DefaultCase(as3DefaultCase);
				if (result == null) result = caseAs3CaseLabel(as3DefaultCase);
				if (result == null) result = caseICaseElement(as3DefaultCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_EXPRESSION_CASE: {
				As3ExpressionCase as3ExpressionCase = (As3ExpressionCase)theEObject;
				T result = caseAs3ExpressionCase(as3ExpressionCase);
				if (result == null) result = caseAs3CaseLabel(as3ExpressionCase);
				if (result == null) result = caseICaseElement(as3ExpressionCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_IF_STATEMENT: {
				As3IfStatement as3IfStatement = (As3IfStatement)theEObject;
				T result = caseAs3IfStatement(as3IfStatement);
				if (result == null) result = caseAs3ConditionalStatement(as3IfStatement);
				if (result == null) result = caseIStatement(as3IfStatement);
				if (result == null) result = caseIBlockDirective(as3IfStatement);
				if (result == null) result = caseITypeDirective(as3IfStatement);
				if (result == null) result = caseICaseElement(as3IfStatement);
				if (result == null) result = caseIPackageDirective(as3IfStatement);
				if (result == null) result = caseIDirective(as3IfStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_LABELED_STATEMENT: {
				As3LabeledStatement as3LabeledStatement = (As3LabeledStatement)theEObject;
				T result = caseAs3LabeledStatement(as3LabeledStatement);
				if (result == null) result = caseIStatement(as3LabeledStatement);
				if (result == null) result = caseIBlockDirective(as3LabeledStatement);
				if (result == null) result = caseITypeDirective(as3LabeledStatement);
				if (result == null) result = caseICaseElement(as3LabeledStatement);
				if (result == null) result = caseIPackageDirective(as3LabeledStatement);
				if (result == null) result = caseIDirective(as3LabeledStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_BLOCK: {
				As3Block as3Block = (As3Block)theEObject;
				T result = caseAs3Block(as3Block);
				if (result == null) result = caseIStatement(as3Block);
				if (result == null) result = caseIBlockDirective(as3Block);
				if (result == null) result = caseITypeDirective(as3Block);
				if (result == null) result = caseICaseElement(as3Block);
				if (result == null) result = caseIPackageDirective(as3Block);
				if (result == null) result = caseIDirective(as3Block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_SUPER_STATEMENT: {
				As3SuperStatement as3SuperStatement = (As3SuperStatement)theEObject;
				T result = caseAs3SuperStatement(as3SuperStatement);
				if (result == null) result = caseIStatement(as3SuperStatement);
				if (result == null) result = caseIBlockDirective(as3SuperStatement);
				if (result == null) result = caseITypeDirective(as3SuperStatement);
				if (result == null) result = caseICaseElement(as3SuperStatement);
				if (result == null) result = caseIPackageDirective(as3SuperStatement);
				if (result == null) result = caseIDirective(as3SuperStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_EXPRESSION_STATEMENT: {
				As3ExpressionStatement as3ExpressionStatement = (As3ExpressionStatement)theEObject;
				T result = caseAs3ExpressionStatement(as3ExpressionStatement);
				if (result == null) result = caseIStatement(as3ExpressionStatement);
				if (result == null) result = caseIBlockDirective(as3ExpressionStatement);
				if (result == null) result = caseITypeDirective(as3ExpressionStatement);
				if (result == null) result = caseICaseElement(as3ExpressionStatement);
				if (result == null) result = caseIPackageDirective(as3ExpressionStatement);
				if (result == null) result = caseIDirective(as3ExpressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_EMPTY_STATEMENT: {
				As3EmptyStatement as3EmptyStatement = (As3EmptyStatement)theEObject;
				T result = caseAs3EmptyStatement(as3EmptyStatement);
				if (result == null) result = caseIStatement(as3EmptyStatement);
				if (result == null) result = caseIBlockDirective(as3EmptyStatement);
				if (result == null) result = caseITypeDirective(as3EmptyStatement);
				if (result == null) result = caseICaseElement(as3EmptyStatement);
				if (result == null) result = caseIPackageDirective(as3EmptyStatement);
				if (result == null) result = caseIDirective(as3EmptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_EXPRESSION_LIST: {
				As3ExpressionList as3ExpressionList = (As3ExpressionList)theEObject;
				T result = caseAs3ExpressionList(as3ExpressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_LIST_EXPRESSION: {
				As3ListExpression as3ListExpression = (As3ListExpression)theEObject;
				T result = caseAs3ListExpression(as3ListExpression);
				if (result == null) result = caseAs3ExpressionList(as3ListExpression);
				if (result == null) result = caseIForInit(as3ListExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ARGUMENTS: {
				As3Arguments as3Arguments = (As3Arguments)theEObject;
				T result = caseAs3Arguments(as3Arguments);
				if (result == null) result = caseAs3ExpressionList(as3Arguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ASSIGNMENT_EXPRESSION: {
				As3AssignmentExpression as3AssignmentExpression = (As3AssignmentExpression)theEObject;
				T result = caseAs3AssignmentExpression(as3AssignmentExpression);
				if (result == null) result = caseAs3BinaryExpression(as3AssignmentExpression);
				if (result == null) result = caseIAssignmentExpression(as3AssignmentExpression);
				if (result == null) result = caseIExpression(as3AssignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CONDITIONAL_EXPRESSION: {
				As3ConditionalExpression as3ConditionalExpression = (As3ConditionalExpression)theEObject;
				T result = caseAs3ConditionalExpression(as3ConditionalExpression);
				if (result == null) result = caseIConditionalExpression(as3ConditionalExpression);
				if (result == null) result = caseIAssignmentExpression(as3ConditionalExpression);
				if (result == null) result = caseIExpression(as3ConditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_BINARY_EXPRESSION: {
				As3BinaryExpression as3BinaryExpression = (As3BinaryExpression)theEObject;
				T result = caseAs3BinaryExpression(as3BinaryExpression);
				if (result == null) result = caseIExpression(as3BinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_LOGICAL_EXPRESSION: {
				As3LogicalExpression as3LogicalExpression = (As3LogicalExpression)theEObject;
				T result = caseAs3LogicalExpression(as3LogicalExpression);
				if (result == null) result = caseAs3BinaryExpression(as3LogicalExpression);
				if (result == null) result = caseILogicalExpression(as3LogicalExpression);
				if (result == null) result = caseIConditionalExpression(as3LogicalExpression);
				if (result == null) result = caseIAssignmentExpression(as3LogicalExpression);
				if (result == null) result = caseIExpression(as3LogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_BITWISE_EXPRESSION: {
				As3BitwiseExpression as3BitwiseExpression = (As3BitwiseExpression)theEObject;
				T result = caseAs3BitwiseExpression(as3BitwiseExpression);
				if (result == null) result = caseAs3BinaryExpression(as3BitwiseExpression);
				if (result == null) result = caseIBitwiseExpression(as3BitwiseExpression);
				if (result == null) result = caseILogicalExpression(as3BitwiseExpression);
				if (result == null) result = caseIConditionalExpression(as3BitwiseExpression);
				if (result == null) result = caseIAssignmentExpression(as3BitwiseExpression);
				if (result == null) result = caseIExpression(as3BitwiseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_EQUALITY_EXPRESSION: {
				As3EqualityExpression as3EqualityExpression = (As3EqualityExpression)theEObject;
				T result = caseAs3EqualityExpression(as3EqualityExpression);
				if (result == null) result = caseAs3BinaryExpression(as3EqualityExpression);
				if (result == null) result = caseIEqualityExpression(as3EqualityExpression);
				if (result == null) result = caseIBitwiseExpression(as3EqualityExpression);
				if (result == null) result = caseILogicalExpression(as3EqualityExpression);
				if (result == null) result = caseIConditionalExpression(as3EqualityExpression);
				if (result == null) result = caseIAssignmentExpression(as3EqualityExpression);
				if (result == null) result = caseIExpression(as3EqualityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_RELATIONAL_EXPRESSION: {
				As3RelationalExpression as3RelationalExpression = (As3RelationalExpression)theEObject;
				T result = caseAs3RelationalExpression(as3RelationalExpression);
				if (result == null) result = caseAs3BinaryExpression(as3RelationalExpression);
				if (result == null) result = caseIRelationalExpression(as3RelationalExpression);
				if (result == null) result = caseIEqualityExpression(as3RelationalExpression);
				if (result == null) result = caseIBitwiseExpression(as3RelationalExpression);
				if (result == null) result = caseILogicalExpression(as3RelationalExpression);
				if (result == null) result = caseIConditionalExpression(as3RelationalExpression);
				if (result == null) result = caseIAssignmentExpression(as3RelationalExpression);
				if (result == null) result = caseIExpression(as3RelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_SHIFT_EXPRESSION: {
				As3ShiftExpression as3ShiftExpression = (As3ShiftExpression)theEObject;
				T result = caseAs3ShiftExpression(as3ShiftExpression);
				if (result == null) result = caseAs3BinaryExpression(as3ShiftExpression);
				if (result == null) result = caseIArithmeticExpression(as3ShiftExpression);
				if (result == null) result = caseIRelationalExpression(as3ShiftExpression);
				if (result == null) result = caseIEqualityExpression(as3ShiftExpression);
				if (result == null) result = caseIBitwiseExpression(as3ShiftExpression);
				if (result == null) result = caseILogicalExpression(as3ShiftExpression);
				if (result == null) result = caseIConditionalExpression(as3ShiftExpression);
				if (result == null) result = caseIAssignmentExpression(as3ShiftExpression);
				if (result == null) result = caseIExpression(as3ShiftExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ADDITIVE_EXPRESSION: {
				As3AdditiveExpression as3AdditiveExpression = (As3AdditiveExpression)theEObject;
				T result = caseAs3AdditiveExpression(as3AdditiveExpression);
				if (result == null) result = caseAs3BinaryExpression(as3AdditiveExpression);
				if (result == null) result = caseIArithmeticExpression(as3AdditiveExpression);
				if (result == null) result = caseIRelationalExpression(as3AdditiveExpression);
				if (result == null) result = caseIEqualityExpression(as3AdditiveExpression);
				if (result == null) result = caseIBitwiseExpression(as3AdditiveExpression);
				if (result == null) result = caseILogicalExpression(as3AdditiveExpression);
				if (result == null) result = caseIConditionalExpression(as3AdditiveExpression);
				if (result == null) result = caseIAssignmentExpression(as3AdditiveExpression);
				if (result == null) result = caseIExpression(as3AdditiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_MULTIPLICATIVE_EXPRESSION: {
				As3MultiplicativeExpression as3MultiplicativeExpression = (As3MultiplicativeExpression)theEObject;
				T result = caseAs3MultiplicativeExpression(as3MultiplicativeExpression);
				if (result == null) result = caseAs3BinaryExpression(as3MultiplicativeExpression);
				if (result == null) result = caseIArithmeticExpression(as3MultiplicativeExpression);
				if (result == null) result = caseIRelationalExpression(as3MultiplicativeExpression);
				if (result == null) result = caseIEqualityExpression(as3MultiplicativeExpression);
				if (result == null) result = caseIBitwiseExpression(as3MultiplicativeExpression);
				if (result == null) result = caseILogicalExpression(as3MultiplicativeExpression);
				if (result == null) result = caseIConditionalExpression(as3MultiplicativeExpression);
				if (result == null) result = caseIAssignmentExpression(as3MultiplicativeExpression);
				if (result == null) result = caseIExpression(as3MultiplicativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_UNARY_EXPRESSION: {
				As3UnaryExpression as3UnaryExpression = (As3UnaryExpression)theEObject;
				T result = caseAs3UnaryExpression(as3UnaryExpression);
				if (result == null) result = caseIUnaryExpression(as3UnaryExpression);
				if (result == null) result = caseIArithmeticExpression(as3UnaryExpression);
				if (result == null) result = caseIRelationalExpression(as3UnaryExpression);
				if (result == null) result = caseIEqualityExpression(as3UnaryExpression);
				if (result == null) result = caseIBitwiseExpression(as3UnaryExpression);
				if (result == null) result = caseILogicalExpression(as3UnaryExpression);
				if (result == null) result = caseIConditionalExpression(as3UnaryExpression);
				if (result == null) result = caseIAssignmentExpression(as3UnaryExpression);
				if (result == null) result = caseIExpression(as3UnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_DELETE_EXPRESSION: {
				As3DeleteExpression as3DeleteExpression = (As3DeleteExpression)theEObject;
				T result = caseAs3DeleteExpression(as3DeleteExpression);
				if (result == null) result = caseAs3UnaryExpression(as3DeleteExpression);
				if (result == null) result = caseIUnaryExpression(as3DeleteExpression);
				if (result == null) result = caseIArithmeticExpression(as3DeleteExpression);
				if (result == null) result = caseIRelationalExpression(as3DeleteExpression);
				if (result == null) result = caseIEqualityExpression(as3DeleteExpression);
				if (result == null) result = caseIBitwiseExpression(as3DeleteExpression);
				if (result == null) result = caseILogicalExpression(as3DeleteExpression);
				if (result == null) result = caseIConditionalExpression(as3DeleteExpression);
				if (result == null) result = caseIAssignmentExpression(as3DeleteExpression);
				if (result == null) result = caseIExpression(as3DeleteExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_VOID_EXPRESSION: {
				As3VoidExpression as3VoidExpression = (As3VoidExpression)theEObject;
				T result = caseAs3VoidExpression(as3VoidExpression);
				if (result == null) result = caseAs3UnaryExpression(as3VoidExpression);
				if (result == null) result = caseIUnaryExpression(as3VoidExpression);
				if (result == null) result = caseIArithmeticExpression(as3VoidExpression);
				if (result == null) result = caseIRelationalExpression(as3VoidExpression);
				if (result == null) result = caseIEqualityExpression(as3VoidExpression);
				if (result == null) result = caseIBitwiseExpression(as3VoidExpression);
				if (result == null) result = caseILogicalExpression(as3VoidExpression);
				if (result == null) result = caseIConditionalExpression(as3VoidExpression);
				if (result == null) result = caseIAssignmentExpression(as3VoidExpression);
				if (result == null) result = caseIExpression(as3VoidExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_TYPE_OF_EXPRESSION: {
				As3TypeOfExpression as3TypeOfExpression = (As3TypeOfExpression)theEObject;
				T result = caseAs3TypeOfExpression(as3TypeOfExpression);
				if (result == null) result = caseAs3UnaryExpression(as3TypeOfExpression);
				if (result == null) result = caseIUnaryExpression(as3TypeOfExpression);
				if (result == null) result = caseIArithmeticExpression(as3TypeOfExpression);
				if (result == null) result = caseIRelationalExpression(as3TypeOfExpression);
				if (result == null) result = caseIEqualityExpression(as3TypeOfExpression);
				if (result == null) result = caseIBitwiseExpression(as3TypeOfExpression);
				if (result == null) result = caseILogicalExpression(as3TypeOfExpression);
				if (result == null) result = caseIConditionalExpression(as3TypeOfExpression);
				if (result == null) result = caseIAssignmentExpression(as3TypeOfExpression);
				if (result == null) result = caseIExpression(as3TypeOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PRE_INCREMENT_EXPRESSION: {
				As3PreIncrementExpression as3PreIncrementExpression = (As3PreIncrementExpression)theEObject;
				T result = caseAs3PreIncrementExpression(as3PreIncrementExpression);
				if (result == null) result = caseAs3UnaryExpression(as3PreIncrementExpression);
				if (result == null) result = caseIUnaryExpression(as3PreIncrementExpression);
				if (result == null) result = caseIArithmeticExpression(as3PreIncrementExpression);
				if (result == null) result = caseIRelationalExpression(as3PreIncrementExpression);
				if (result == null) result = caseIEqualityExpression(as3PreIncrementExpression);
				if (result == null) result = caseIBitwiseExpression(as3PreIncrementExpression);
				if (result == null) result = caseILogicalExpression(as3PreIncrementExpression);
				if (result == null) result = caseIConditionalExpression(as3PreIncrementExpression);
				if (result == null) result = caseIAssignmentExpression(as3PreIncrementExpression);
				if (result == null) result = caseIExpression(as3PreIncrementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PRE_DECREMENT_EXPRESSION: {
				As3PreDecrementExpression as3PreDecrementExpression = (As3PreDecrementExpression)theEObject;
				T result = caseAs3PreDecrementExpression(as3PreDecrementExpression);
				if (result == null) result = caseAs3UnaryExpression(as3PreDecrementExpression);
				if (result == null) result = caseIUnaryExpression(as3PreDecrementExpression);
				if (result == null) result = caseIArithmeticExpression(as3PreDecrementExpression);
				if (result == null) result = caseIRelationalExpression(as3PreDecrementExpression);
				if (result == null) result = caseIEqualityExpression(as3PreDecrementExpression);
				if (result == null) result = caseIBitwiseExpression(as3PreDecrementExpression);
				if (result == null) result = caseILogicalExpression(as3PreDecrementExpression);
				if (result == null) result = caseIConditionalExpression(as3PreDecrementExpression);
				if (result == null) result = caseIAssignmentExpression(as3PreDecrementExpression);
				if (result == null) result = caseIExpression(as3PreDecrementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_UNARY_PLUS_EXPRESSION: {
				As3UnaryPlusExpression as3UnaryPlusExpression = (As3UnaryPlusExpression)theEObject;
				T result = caseAs3UnaryPlusExpression(as3UnaryPlusExpression);
				if (result == null) result = caseAs3UnaryExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIUnaryExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIArithmeticExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIRelationalExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIEqualityExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIBitwiseExpression(as3UnaryPlusExpression);
				if (result == null) result = caseILogicalExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIConditionalExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIAssignmentExpression(as3UnaryPlusExpression);
				if (result == null) result = caseIExpression(as3UnaryPlusExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_UNARY_MINUS_EXPRESSION: {
				As3UnaryMinusExpression as3UnaryMinusExpression = (As3UnaryMinusExpression)theEObject;
				T result = caseAs3UnaryMinusExpression(as3UnaryMinusExpression);
				if (result == null) result = caseAs3UnaryExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIUnaryExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIArithmeticExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIRelationalExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIEqualityExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIBitwiseExpression(as3UnaryMinusExpression);
				if (result == null) result = caseILogicalExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIConditionalExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIAssignmentExpression(as3UnaryMinusExpression);
				if (result == null) result = caseIExpression(as3UnaryMinusExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_BITWISE_NOT_EXPRESSION: {
				As3BitwiseNotExpression as3BitwiseNotExpression = (As3BitwiseNotExpression)theEObject;
				T result = caseAs3BitwiseNotExpression(as3BitwiseNotExpression);
				if (result == null) result = caseAs3UnaryExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIUnaryExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIArithmeticExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIRelationalExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIEqualityExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIBitwiseExpression(as3BitwiseNotExpression);
				if (result == null) result = caseILogicalExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIConditionalExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIAssignmentExpression(as3BitwiseNotExpression);
				if (result == null) result = caseIExpression(as3BitwiseNotExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_LOGICAL_NOT_EXPRESSION: {
				As3LogicalNotExpression as3LogicalNotExpression = (As3LogicalNotExpression)theEObject;
				T result = caseAs3LogicalNotExpression(as3LogicalNotExpression);
				if (result == null) result = caseAs3UnaryExpression(as3LogicalNotExpression);
				if (result == null) result = caseIUnaryExpression(as3LogicalNotExpression);
				if (result == null) result = caseIArithmeticExpression(as3LogicalNotExpression);
				if (result == null) result = caseIRelationalExpression(as3LogicalNotExpression);
				if (result == null) result = caseIEqualityExpression(as3LogicalNotExpression);
				if (result == null) result = caseIBitwiseExpression(as3LogicalNotExpression);
				if (result == null) result = caseILogicalExpression(as3LogicalNotExpression);
				if (result == null) result = caseIConditionalExpression(as3LogicalNotExpression);
				if (result == null) result = caseIAssignmentExpression(as3LogicalNotExpression);
				if (result == null) result = caseIExpression(as3LogicalNotExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_POSTFIX_EXPRESSION: {
				As3PostfixExpression as3PostfixExpression = (As3PostfixExpression)theEObject;
				T result = caseAs3PostfixExpression(as3PostfixExpression);
				if (result == null) result = caseIPostfixExpression(as3PostfixExpression);
				if (result == null) result = caseIUnaryExpression(as3PostfixExpression);
				if (result == null) result = caseIForInInit(as3PostfixExpression);
				if (result == null) result = caseIArithmeticExpression(as3PostfixExpression);
				if (result == null) result = caseIRelationalExpression(as3PostfixExpression);
				if (result == null) result = caseIEqualityExpression(as3PostfixExpression);
				if (result == null) result = caseIBitwiseExpression(as3PostfixExpression);
				if (result == null) result = caseILogicalExpression(as3PostfixExpression);
				if (result == null) result = caseIConditionalExpression(as3PostfixExpression);
				if (result == null) result = caseIAssignmentExpression(as3PostfixExpression);
				if (result == null) result = caseIExpression(as3PostfixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_POST_INCREMENT_EXPRESSION: {
				As3PostIncrementExpression as3PostIncrementExpression = (As3PostIncrementExpression)theEObject;
				T result = caseAs3PostIncrementExpression(as3PostIncrementExpression);
				if (result == null) result = caseAs3PostfixExpression(as3PostIncrementExpression);
				if (result == null) result = caseIPostfixExpression(as3PostIncrementExpression);
				if (result == null) result = caseIUnaryExpression(as3PostIncrementExpression);
				if (result == null) result = caseIForInInit(as3PostIncrementExpression);
				if (result == null) result = caseIArithmeticExpression(as3PostIncrementExpression);
				if (result == null) result = caseIRelationalExpression(as3PostIncrementExpression);
				if (result == null) result = caseIEqualityExpression(as3PostIncrementExpression);
				if (result == null) result = caseIBitwiseExpression(as3PostIncrementExpression);
				if (result == null) result = caseILogicalExpression(as3PostIncrementExpression);
				if (result == null) result = caseIConditionalExpression(as3PostIncrementExpression);
				if (result == null) result = caseIAssignmentExpression(as3PostIncrementExpression);
				if (result == null) result = caseIExpression(as3PostIncrementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_POST_DECREMENT_EXPRESSION: {
				As3PostDecrementExpression as3PostDecrementExpression = (As3PostDecrementExpression)theEObject;
				T result = caseAs3PostDecrementExpression(as3PostDecrementExpression);
				if (result == null) result = caseAs3PostfixExpression(as3PostDecrementExpression);
				if (result == null) result = caseIPostfixExpression(as3PostDecrementExpression);
				if (result == null) result = caseIUnaryExpression(as3PostDecrementExpression);
				if (result == null) result = caseIForInInit(as3PostDecrementExpression);
				if (result == null) result = caseIArithmeticExpression(as3PostDecrementExpression);
				if (result == null) result = caseIRelationalExpression(as3PostDecrementExpression);
				if (result == null) result = caseIEqualityExpression(as3PostDecrementExpression);
				if (result == null) result = caseIBitwiseExpression(as3PostDecrementExpression);
				if (result == null) result = caseILogicalExpression(as3PostDecrementExpression);
				if (result == null) result = caseIConditionalExpression(as3PostDecrementExpression);
				if (result == null) result = caseIAssignmentExpression(as3PostDecrementExpression);
				if (result == null) result = caseIExpression(as3PostDecrementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_INVOCATION_EXPRESSION: {
				As3InvocationExpression as3InvocationExpression = (As3InvocationExpression)theEObject;
				T result = caseAs3InvocationExpression(as3InvocationExpression);
				if (result == null) result = caseAs3PostfixExpression(as3InvocationExpression);
				if (result == null) result = caseIPostfixExpression(as3InvocationExpression);
				if (result == null) result = caseIUnaryExpression(as3InvocationExpression);
				if (result == null) result = caseIForInInit(as3InvocationExpression);
				if (result == null) result = caseIArithmeticExpression(as3InvocationExpression);
				if (result == null) result = caseIRelationalExpression(as3InvocationExpression);
				if (result == null) result = caseIEqualityExpression(as3InvocationExpression);
				if (result == null) result = caseIBitwiseExpression(as3InvocationExpression);
				if (result == null) result = caseILogicalExpression(as3InvocationExpression);
				if (result == null) result = caseIConditionalExpression(as3InvocationExpression);
				if (result == null) result = caseIAssignmentExpression(as3InvocationExpression);
				if (result == null) result = caseIExpression(as3InvocationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ACCESS_EXPRESSION: {
				As3AccessExpression as3AccessExpression = (As3AccessExpression)theEObject;
				T result = caseAs3AccessExpression(as3AccessExpression);
				if (result == null) result = caseAs3PostfixExpression(as3AccessExpression);
				if (result == null) result = caseIPostfixExpression(as3AccessExpression);
				if (result == null) result = caseIUnaryExpression(as3AccessExpression);
				if (result == null) result = caseIForInInit(as3AccessExpression);
				if (result == null) result = caseIArithmeticExpression(as3AccessExpression);
				if (result == null) result = caseIRelationalExpression(as3AccessExpression);
				if (result == null) result = caseIEqualityExpression(as3AccessExpression);
				if (result == null) result = caseIBitwiseExpression(as3AccessExpression);
				if (result == null) result = caseILogicalExpression(as3AccessExpression);
				if (result == null) result = caseIConditionalExpression(as3AccessExpression);
				if (result == null) result = caseIAssignmentExpression(as3AccessExpression);
				if (result == null) result = caseIExpression(as3AccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_QUERY_EXPRESSION: {
				As3QueryExpression as3QueryExpression = (As3QueryExpression)theEObject;
				T result = caseAs3QueryExpression(as3QueryExpression);
				if (result == null) result = caseAs3PostfixExpression(as3QueryExpression);
				if (result == null) result = caseIPostfixExpression(as3QueryExpression);
				if (result == null) result = caseIUnaryExpression(as3QueryExpression);
				if (result == null) result = caseIForInInit(as3QueryExpression);
				if (result == null) result = caseIArithmeticExpression(as3QueryExpression);
				if (result == null) result = caseIRelationalExpression(as3QueryExpression);
				if (result == null) result = caseIEqualityExpression(as3QueryExpression);
				if (result == null) result = caseIBitwiseExpression(as3QueryExpression);
				if (result == null) result = caseILogicalExpression(as3QueryExpression);
				if (result == null) result = caseIConditionalExpression(as3QueryExpression);
				if (result == null) result = caseIAssignmentExpression(as3QueryExpression);
				if (result == null) result = caseIExpression(as3QueryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_POSTFIX_OPERATOR: {
				As3PostfixOperator as3PostfixOperator = (As3PostfixOperator)theEObject;
				T result = caseAs3PostfixOperator(as3PostfixOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PROPERTY_OPERATOR: {
				As3PropertyOperator as3PropertyOperator = (As3PropertyOperator)theEObject;
				T result = caseAs3PropertyOperator(as3PropertyOperator);
				if (result == null) result = caseAs3PostfixOperator(as3PropertyOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_QUERY_OPERATOR: {
				As3QueryOperator as3QueryOperator = (As3QueryOperator)theEObject;
				T result = caseAs3QueryOperator(as3QueryOperator);
				if (result == null) result = caseAs3PostfixOperator(as3QueryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_SIMPLE_IDENTIFIER: {
				As3SimpleIdentifier as3SimpleIdentifier = (As3SimpleIdentifier)theEObject;
				T result = caseAs3SimpleIdentifier(as3SimpleIdentifier);
				if (result == null) result = caseINonAttributeIdentifier(as3SimpleIdentifier);
				if (result == null) result = caseIIdentifier(as3SimpleIdentifier);
				if (result == null) result = caseIPrimaryExpression(as3SimpleIdentifier);
				if (result == null) result = caseIPostfixExpression(as3SimpleIdentifier);
				if (result == null) result = caseIUnaryExpression(as3SimpleIdentifier);
				if (result == null) result = caseIForInInit(as3SimpleIdentifier);
				if (result == null) result = caseIArithmeticExpression(as3SimpleIdentifier);
				if (result == null) result = caseIRelationalExpression(as3SimpleIdentifier);
				if (result == null) result = caseIEqualityExpression(as3SimpleIdentifier);
				if (result == null) result = caseIBitwiseExpression(as3SimpleIdentifier);
				if (result == null) result = caseILogicalExpression(as3SimpleIdentifier);
				if (result == null) result = caseIConditionalExpression(as3SimpleIdentifier);
				if (result == null) result = caseIAssignmentExpression(as3SimpleIdentifier);
				if (result == null) result = caseIExpression(as3SimpleIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PROPERTY_IDENTIFIER: {
				As3PropertyIdentifier as3PropertyIdentifier = (As3PropertyIdentifier)theEObject;
				T result = caseAs3PropertyIdentifier(as3PropertyIdentifier);
				if (result == null) result = caseAs3SimpleIdentifier(as3PropertyIdentifier);
				if (result == null) result = caseILiteralFieldName(as3PropertyIdentifier);
				if (result == null) result = caseINonAttributeIdentifier(as3PropertyIdentifier);
				if (result == null) result = caseIIdentifier(as3PropertyIdentifier);
				if (result == null) result = caseIPrimaryExpression(as3PropertyIdentifier);
				if (result == null) result = caseIPostfixExpression(as3PropertyIdentifier);
				if (result == null) result = caseIUnaryExpression(as3PropertyIdentifier);
				if (result == null) result = caseIForInInit(as3PropertyIdentifier);
				if (result == null) result = caseIArithmeticExpression(as3PropertyIdentifier);
				if (result == null) result = caseIRelationalExpression(as3PropertyIdentifier);
				if (result == null) result = caseIEqualityExpression(as3PropertyIdentifier);
				if (result == null) result = caseIBitwiseExpression(as3PropertyIdentifier);
				if (result == null) result = caseILogicalExpression(as3PropertyIdentifier);
				if (result == null) result = caseIConditionalExpression(as3PropertyIdentifier);
				if (result == null) result = caseIAssignmentExpression(as3PropertyIdentifier);
				if (result == null) result = caseIExpression(as3PropertyIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_QUALIFIED_IDENTIFIER: {
				As3QualifiedIdentifier as3QualifiedIdentifier = (As3QualifiedIdentifier)theEObject;
				T result = caseAs3QualifiedIdentifier(as3QualifiedIdentifier);
				if (result == null) result = caseIIdentifier(as3QualifiedIdentifier);
				if (result == null) result = caseIPrimaryExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIPostfixExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIUnaryExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIForInInit(as3QualifiedIdentifier);
				if (result == null) result = caseIArithmeticExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIRelationalExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIEqualityExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIBitwiseExpression(as3QualifiedIdentifier);
				if (result == null) result = caseILogicalExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIConditionalExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIAssignmentExpression(as3QualifiedIdentifier);
				if (result == null) result = caseIExpression(as3QualifiedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ATTRIBUTE_QUALIFIED_IDENTIFIER: {
				As3AttributeQualifiedIdentifier as3AttributeQualifiedIdentifier = (As3AttributeQualifiedIdentifier)theEObject;
				T result = caseAs3AttributeQualifiedIdentifier(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseAs3QualifiedIdentifier(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIIdentifier(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIPrimaryExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIPostfixExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIUnaryExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIForInInit(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIArithmeticExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIRelationalExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIEqualityExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIBitwiseExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseILogicalExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIConditionalExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIAssignmentExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = caseIExpression(as3AttributeQualifiedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_NON_ATTRIBUTE_QUALIFIED_IDENTIFIER: {
				As3NonAttributeQualifiedIdentifier as3NonAttributeQualifiedIdentifier = (As3NonAttributeQualifiedIdentifier)theEObject;
				T result = caseAs3NonAttributeQualifiedIdentifier(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseAs3QualifiedIdentifier(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseINonAttributeIdentifier(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIIdentifier(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIPrimaryExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIPostfixExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIUnaryExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIForInInit(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIArithmeticExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIRelationalExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIEqualityExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIBitwiseExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseILogicalExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIConditionalExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIAssignmentExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = caseIExpression(as3NonAttributeQualifiedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_SIMPLE_QUALIFIED_IDENTIFIER: {
				As3SimpleQualifiedIdentifier as3SimpleQualifiedIdentifier = (As3SimpleQualifiedIdentifier)theEObject;
				T result = caseAs3SimpleQualifiedIdentifier(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseAs3NonAttributeQualifiedIdentifier(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseAs3QualifiedIdentifier(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseINonAttributeIdentifier(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIIdentifier(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIPrimaryExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIPostfixExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIUnaryExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIForInInit(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIArithmeticExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIRelationalExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIEqualityExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIBitwiseExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseILogicalExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIConditionalExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIAssignmentExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = caseIExpression(as3SimpleQualifiedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_EXPRESSION_QUALIFIED_IDENTIFIER: {
				As3ExpressionQualifiedIdentifier as3ExpressionQualifiedIdentifier = (As3ExpressionQualifiedIdentifier)theEObject;
				T result = caseAs3ExpressionQualifiedIdentifier(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseAs3NonAttributeQualifiedIdentifier(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseAs3QualifiedIdentifier(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseINonAttributeIdentifier(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIIdentifier(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIPrimaryExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIPostfixExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIUnaryExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIForInInit(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIArithmeticExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIRelationalExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIEqualityExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIBitwiseExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseILogicalExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIConditionalExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIAssignmentExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = caseIExpression(as3ExpressionQualifiedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_THIS_EXPRESSION: {
				As3ThisExpression as3ThisExpression = (As3ThisExpression)theEObject;
				T result = caseAs3ThisExpression(as3ThisExpression);
				if (result == null) result = caseIPrimaryExpression(as3ThisExpression);
				if (result == null) result = caseIPostfixExpression(as3ThisExpression);
				if (result == null) result = caseIUnaryExpression(as3ThisExpression);
				if (result == null) result = caseIForInInit(as3ThisExpression);
				if (result == null) result = caseIArithmeticExpression(as3ThisExpression);
				if (result == null) result = caseIRelationalExpression(as3ThisExpression);
				if (result == null) result = caseIEqualityExpression(as3ThisExpression);
				if (result == null) result = caseIBitwiseExpression(as3ThisExpression);
				if (result == null) result = caseILogicalExpression(as3ThisExpression);
				if (result == null) result = caseIConditionalExpression(as3ThisExpression);
				if (result == null) result = caseIAssignmentExpression(as3ThisExpression);
				if (result == null) result = caseIExpression(as3ThisExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_SUPER_EXPRESSION: {
				As3SuperExpression as3SuperExpression = (As3SuperExpression)theEObject;
				T result = caseAs3SuperExpression(as3SuperExpression);
				if (result == null) result = caseIPrimaryExpression(as3SuperExpression);
				if (result == null) result = caseIPostfixExpression(as3SuperExpression);
				if (result == null) result = caseIUnaryExpression(as3SuperExpression);
				if (result == null) result = caseIForInInit(as3SuperExpression);
				if (result == null) result = caseIArithmeticExpression(as3SuperExpression);
				if (result == null) result = caseIRelationalExpression(as3SuperExpression);
				if (result == null) result = caseIEqualityExpression(as3SuperExpression);
				if (result == null) result = caseIBitwiseExpression(as3SuperExpression);
				if (result == null) result = caseILogicalExpression(as3SuperExpression);
				if (result == null) result = caseIConditionalExpression(as3SuperExpression);
				if (result == null) result = caseIAssignmentExpression(as3SuperExpression);
				if (result == null) result = caseIExpression(as3SuperExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_PAREN_LIST_EXPRESSION: {
				As3ParenListExpression as3ParenListExpression = (As3ParenListExpression)theEObject;
				T result = caseAs3ParenListExpression(as3ParenListExpression);
				if (result == null) result = caseAs3ExpressionList(as3ParenListExpression);
				if (result == null) result = caseIPrimaryExpression(as3ParenListExpression);
				if (result == null) result = caseIPostfixExpression(as3ParenListExpression);
				if (result == null) result = caseIUnaryExpression(as3ParenListExpression);
				if (result == null) result = caseIForInInit(as3ParenListExpression);
				if (result == null) result = caseIArithmeticExpression(as3ParenListExpression);
				if (result == null) result = caseIRelationalExpression(as3ParenListExpression);
				if (result == null) result = caseIEqualityExpression(as3ParenListExpression);
				if (result == null) result = caseIBitwiseExpression(as3ParenListExpression);
				if (result == null) result = caseILogicalExpression(as3ParenListExpression);
				if (result == null) result = caseIConditionalExpression(as3ParenListExpression);
				if (result == null) result = caseIAssignmentExpression(as3ParenListExpression);
				if (result == null) result = caseIExpression(as3ParenListExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_FUNCTION_EXPRESSION: {
				As3FunctionExpression as3FunctionExpression = (As3FunctionExpression)theEObject;
				T result = caseAs3FunctionExpression(as3FunctionExpression);
				if (result == null) result = caseIPrimaryExpression(as3FunctionExpression);
				if (result == null) result = caseAs3Executable(as3FunctionExpression);
				if (result == null) result = caseIPostfixExpression(as3FunctionExpression);
				if (result == null) result = caseAvmExecutable(as3FunctionExpression);
				if (result == null) result = caseIUnaryExpression(as3FunctionExpression);
				if (result == null) result = caseIForInInit(as3FunctionExpression);
				if (result == null) result = caseAvmIdentifiable(as3FunctionExpression);
				if (result == null) result = caseIArithmeticExpression(as3FunctionExpression);
				if (result == null) result = caseIRelationalExpression(as3FunctionExpression);
				if (result == null) result = caseIEqualityExpression(as3FunctionExpression);
				if (result == null) result = caseIBitwiseExpression(as3FunctionExpression);
				if (result == null) result = caseILogicalExpression(as3FunctionExpression);
				if (result == null) result = caseIConditionalExpression(as3FunctionExpression);
				if (result == null) result = caseIAssignmentExpression(as3FunctionExpression);
				if (result == null) result = caseIExpression(as3FunctionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_NEW_EXPRESSION: {
				As3NewExpression as3NewExpression = (As3NewExpression)theEObject;
				T result = caseAs3NewExpression(as3NewExpression);
				if (result == null) result = caseIPrimaryExpression(as3NewExpression);
				if (result == null) result = caseIPostfixExpression(as3NewExpression);
				if (result == null) result = caseIUnaryExpression(as3NewExpression);
				if (result == null) result = caseIForInInit(as3NewExpression);
				if (result == null) result = caseIArithmeticExpression(as3NewExpression);
				if (result == null) result = caseIRelationalExpression(as3NewExpression);
				if (result == null) result = caseIEqualityExpression(as3NewExpression);
				if (result == null) result = caseIBitwiseExpression(as3NewExpression);
				if (result == null) result = caseILogicalExpression(as3NewExpression);
				if (result == null) result = caseIConditionalExpression(as3NewExpression);
				if (result == null) result = caseIAssignmentExpression(as3NewExpression);
				if (result == null) result = caseIExpression(as3NewExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ARRAY_INITIALIZER: {
				As3ArrayInitializer as3ArrayInitializer = (As3ArrayInitializer)theEObject;
				T result = caseAs3ArrayInitializer(as3ArrayInitializer);
				if (result == null) result = caseIPrimaryExpression(as3ArrayInitializer);
				if (result == null) result = caseIPostfixExpression(as3ArrayInitializer);
				if (result == null) result = caseIUnaryExpression(as3ArrayInitializer);
				if (result == null) result = caseIForInInit(as3ArrayInitializer);
				if (result == null) result = caseIArithmeticExpression(as3ArrayInitializer);
				if (result == null) result = caseIRelationalExpression(as3ArrayInitializer);
				if (result == null) result = caseIEqualityExpression(as3ArrayInitializer);
				if (result == null) result = caseIBitwiseExpression(as3ArrayInitializer);
				if (result == null) result = caseILogicalExpression(as3ArrayInitializer);
				if (result == null) result = caseIConditionalExpression(as3ArrayInitializer);
				if (result == null) result = caseIAssignmentExpression(as3ArrayInitializer);
				if (result == null) result = caseIExpression(as3ArrayInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ARRAY_ELEMENT: {
				As3ArrayElement as3ArrayElement = (As3ArrayElement)theEObject;
				T result = caseAs3ArrayElement(as3ArrayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_OBJECT_INITIALIZER: {
				As3ObjectInitializer as3ObjectInitializer = (As3ObjectInitializer)theEObject;
				T result = caseAs3ObjectInitializer(as3ObjectInitializer);
				if (result == null) result = caseIPrimaryExpression(as3ObjectInitializer);
				if (result == null) result = caseIPostfixExpression(as3ObjectInitializer);
				if (result == null) result = caseIUnaryExpression(as3ObjectInitializer);
				if (result == null) result = caseIForInInit(as3ObjectInitializer);
				if (result == null) result = caseIArithmeticExpression(as3ObjectInitializer);
				if (result == null) result = caseIRelationalExpression(as3ObjectInitializer);
				if (result == null) result = caseIEqualityExpression(as3ObjectInitializer);
				if (result == null) result = caseIBitwiseExpression(as3ObjectInitializer);
				if (result == null) result = caseILogicalExpression(as3ObjectInitializer);
				if (result == null) result = caseIConditionalExpression(as3ObjectInitializer);
				if (result == null) result = caseIAssignmentExpression(as3ObjectInitializer);
				if (result == null) result = caseIExpression(as3ObjectInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_LITERAL_FIELD: {
				As3LiteralField as3LiteralField = (As3LiteralField)theEObject;
				T result = caseAs3LiteralField(as3LiteralField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_XML_INITIALIZER: {
				As3XmlInitializer as3XmlInitializer = (As3XmlInitializer)theEObject;
				T result = caseAs3XmlInitializer(as3XmlInitializer);
				if (result == null) result = caseIPrimaryExpression(as3XmlInitializer);
				if (result == null) result = caseIPostfixExpression(as3XmlInitializer);
				if (result == null) result = caseIUnaryExpression(as3XmlInitializer);
				if (result == null) result = caseIForInInit(as3XmlInitializer);
				if (result == null) result = caseIArithmeticExpression(as3XmlInitializer);
				if (result == null) result = caseIRelationalExpression(as3XmlInitializer);
				if (result == null) result = caseIEqualityExpression(as3XmlInitializer);
				if (result == null) result = caseIBitwiseExpression(as3XmlInitializer);
				if (result == null) result = caseILogicalExpression(as3XmlInitializer);
				if (result == null) result = caseIConditionalExpression(as3XmlInitializer);
				if (result == null) result = caseIAssignmentExpression(as3XmlInitializer);
				if (result == null) result = caseIExpression(as3XmlInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_NULL_LITERAL: {
				As3NullLiteral as3NullLiteral = (As3NullLiteral)theEObject;
				T result = caseAs3NullLiteral(as3NullLiteral);
				if (result == null) result = caseILiteral(as3NullLiteral);
				if (result == null) result = caseIPrimaryExpression(as3NullLiteral);
				if (result == null) result = caseIPostfixExpression(as3NullLiteral);
				if (result == null) result = caseIUnaryExpression(as3NullLiteral);
				if (result == null) result = caseIForInInit(as3NullLiteral);
				if (result == null) result = caseIArithmeticExpression(as3NullLiteral);
				if (result == null) result = caseIRelationalExpression(as3NullLiteral);
				if (result == null) result = caseIEqualityExpression(as3NullLiteral);
				if (result == null) result = caseIBitwiseExpression(as3NullLiteral);
				if (result == null) result = caseILogicalExpression(as3NullLiteral);
				if (result == null) result = caseIConditionalExpression(as3NullLiteral);
				if (result == null) result = caseIAssignmentExpression(as3NullLiteral);
				if (result == null) result = caseIExpression(as3NullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_BOOLEAN_LITERAL: {
				As3BooleanLiteral as3BooleanLiteral = (As3BooleanLiteral)theEObject;
				T result = caseAs3BooleanLiteral(as3BooleanLiteral);
				if (result == null) result = caseILiteral(as3BooleanLiteral);
				if (result == null) result = caseIPrimaryExpression(as3BooleanLiteral);
				if (result == null) result = caseIPostfixExpression(as3BooleanLiteral);
				if (result == null) result = caseIUnaryExpression(as3BooleanLiteral);
				if (result == null) result = caseIForInInit(as3BooleanLiteral);
				if (result == null) result = caseIArithmeticExpression(as3BooleanLiteral);
				if (result == null) result = caseIRelationalExpression(as3BooleanLiteral);
				if (result == null) result = caseIEqualityExpression(as3BooleanLiteral);
				if (result == null) result = caseIBitwiseExpression(as3BooleanLiteral);
				if (result == null) result = caseILogicalExpression(as3BooleanLiteral);
				if (result == null) result = caseIConditionalExpression(as3BooleanLiteral);
				if (result == null) result = caseIAssignmentExpression(as3BooleanLiteral);
				if (result == null) result = caseIExpression(as3BooleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_NUMBER_LITERAL: {
				As3NumberLiteral as3NumberLiteral = (As3NumberLiteral)theEObject;
				T result = caseAs3NumberLiteral(as3NumberLiteral);
				if (result == null) result = caseILiteral(as3NumberLiteral);
				if (result == null) result = caseILiteralFieldName(as3NumberLiteral);
				if (result == null) result = caseIPrimaryExpression(as3NumberLiteral);
				if (result == null) result = caseIPostfixExpression(as3NumberLiteral);
				if (result == null) result = caseIUnaryExpression(as3NumberLiteral);
				if (result == null) result = caseIForInInit(as3NumberLiteral);
				if (result == null) result = caseIArithmeticExpression(as3NumberLiteral);
				if (result == null) result = caseIRelationalExpression(as3NumberLiteral);
				if (result == null) result = caseIEqualityExpression(as3NumberLiteral);
				if (result == null) result = caseIBitwiseExpression(as3NumberLiteral);
				if (result == null) result = caseILogicalExpression(as3NumberLiteral);
				if (result == null) result = caseIConditionalExpression(as3NumberLiteral);
				if (result == null) result = caseIAssignmentExpression(as3NumberLiteral);
				if (result == null) result = caseIExpression(as3NumberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_STRING_LITERAL: {
				As3StringLiteral as3StringLiteral = (As3StringLiteral)theEObject;
				T result = caseAs3StringLiteral(as3StringLiteral);
				if (result == null) result = caseILiteral(as3StringLiteral);
				if (result == null) result = caseILiteralFieldName(as3StringLiteral);
				if (result == null) result = caseIPrimaryExpression(as3StringLiteral);
				if (result == null) result = caseIPostfixExpression(as3StringLiteral);
				if (result == null) result = caseIUnaryExpression(as3StringLiteral);
				if (result == null) result = caseIForInInit(as3StringLiteral);
				if (result == null) result = caseIArithmeticExpression(as3StringLiteral);
				if (result == null) result = caseIRelationalExpression(as3StringLiteral);
				if (result == null) result = caseIEqualityExpression(as3StringLiteral);
				if (result == null) result = caseIBitwiseExpression(as3StringLiteral);
				if (result == null) result = caseILogicalExpression(as3StringLiteral);
				if (result == null) result = caseIConditionalExpression(as3StringLiteral);
				if (result == null) result = caseIAssignmentExpression(as3StringLiteral);
				if (result == null) result = caseIExpression(as3StringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_REGEX_LITERAL: {
				As3RegexLiteral as3RegexLiteral = (As3RegexLiteral)theEObject;
				T result = caseAs3RegexLiteral(as3RegexLiteral);
				if (result == null) result = caseILiteral(as3RegexLiteral);
				if (result == null) result = caseIPrimaryExpression(as3RegexLiteral);
				if (result == null) result = caseIPostfixExpression(as3RegexLiteral);
				if (result == null) result = caseIUnaryExpression(as3RegexLiteral);
				if (result == null) result = caseIForInInit(as3RegexLiteral);
				if (result == null) result = caseIArithmeticExpression(as3RegexLiteral);
				if (result == null) result = caseIRelationalExpression(as3RegexLiteral);
				if (result == null) result = caseIEqualityExpression(as3RegexLiteral);
				if (result == null) result = caseIBitwiseExpression(as3RegexLiteral);
				if (result == null) result = caseILogicalExpression(as3RegexLiteral);
				if (result == null) result = caseIConditionalExpression(as3RegexLiteral);
				if (result == null) result = caseIAssignmentExpression(as3RegexLiteral);
				if (result == null) result = caseIExpression(as3RegexLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_CONDITIONAL_BLOCK: {
				As3ConditionalBlock as3ConditionalBlock = (As3ConditionalBlock)theEObject;
				T result = caseAs3ConditionalBlock(as3ConditionalBlock);
				if (result == null) result = caseIStatement(as3ConditionalBlock);
				if (result == null) result = caseIBlockDirective(as3ConditionalBlock);
				if (result == null) result = caseITypeDirective(as3ConditionalBlock);
				if (result == null) result = caseICaseElement(as3ConditionalBlock);
				if (result == null) result = caseIPackageDirective(as3ConditionalBlock);
				if (result == null) result = caseIDirective(as3ConditionalBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_RESERVED_ATTRIBUTE: {
				As3ReservedAttribute as3ReservedAttribute = (As3ReservedAttribute)theEObject;
				T result = caseAs3ReservedAttribute(as3ReservedAttribute);
				if (result == null) result = caseIAttribute(as3ReservedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_ATTRIBUTES: {
				As3Attributes as3Attributes = (As3Attributes)theEObject;
				T result = caseAs3Attributes(as3Attributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_NEW_VECTOR_EXPRESSION: {
				As3NewVectorExpression as3NewVectorExpression = (As3NewVectorExpression)theEObject;
				T result = caseAs3NewVectorExpression(as3NewVectorExpression);
				if (result == null) result = caseIPrimaryExpression(as3NewVectorExpression);
				if (result == null) result = caseIPostfixExpression(as3NewVectorExpression);
				if (result == null) result = caseIUnaryExpression(as3NewVectorExpression);
				if (result == null) result = caseIForInInit(as3NewVectorExpression);
				if (result == null) result = caseIArithmeticExpression(as3NewVectorExpression);
				if (result == null) result = caseIRelationalExpression(as3NewVectorExpression);
				if (result == null) result = caseIEqualityExpression(as3NewVectorExpression);
				if (result == null) result = caseIBitwiseExpression(as3NewVectorExpression);
				if (result == null) result = caseILogicalExpression(as3NewVectorExpression);
				if (result == null) result = caseIConditionalExpression(as3NewVectorExpression);
				if (result == null) result = caseIAssignmentExpression(as3NewVectorExpression);
				if (result == null) result = caseIExpression(as3NewVectorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As3EPackage.AS3_TYPE_PARAMETER: {
				As3TypeParameter as3TypeParameter = (As3TypeParameter)theEObject;
				T result = caseAs3TypeParameter(as3TypeParameter);
				if (result == null) result = caseAs3PostfixExpression(as3TypeParameter);
				if (result == null) result = caseIPostfixExpression(as3TypeParameter);
				if (result == null) result = caseIUnaryExpression(as3TypeParameter);
				if (result == null) result = caseIForInInit(as3TypeParameter);
				if (result == null) result = caseIArithmeticExpression(as3TypeParameter);
				if (result == null) result = caseIRelationalExpression(as3TypeParameter);
				if (result == null) result = caseIEqualityExpression(as3TypeParameter);
				if (result == null) result = caseIBitwiseExpression(as3TypeParameter);
				if (result == null) result = caseILogicalExpression(as3TypeParameter);
				if (result == null) result = caseIConditionalExpression(as3TypeParameter);
				if (result == null) result = caseIAssignmentExpression(as3TypeParameter);
				if (result == null) result = caseIExpression(as3TypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDirective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDirective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDirective(IDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPackage Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPackage Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPackageDirective(IPackageDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypeDirective(ITypeDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBlock Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBlock Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBlockDirective(IBlockDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStatement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStatement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStatement(IStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIExpression(IExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAssignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAssignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAssignmentExpression(IAssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConditionalExpression(IConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILogical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILogical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILogicalExpression(ILogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBitwise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBitwise Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBitwiseExpression(IBitwiseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEquality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEquality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEqualityExpression(IEqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRelational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRelational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRelationalExpression(IRelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IArithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IArithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIArithmeticExpression(IArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IUnary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IUnary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIUnaryExpression(IUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPostfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPostfix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPostfixExpression(IPostfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPrimary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPrimary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPrimaryExpression(IPrimaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IIdentifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IIdentifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIIdentifier(IIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILiteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILiteral(ILiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILiteral Field Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILiteral Field Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILiteralFieldName(ILiteralFieldName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICase Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICase Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICaseElement(ICaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INon Attribute Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INon Attribute Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINonAttributeIdentifier(INonAttributeIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAttribute(IAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFor Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFor Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIForInit(IForInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFor In Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFor In Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIForInInit(IForInInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Element(As3Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Identifiable(As3Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Definition(As3Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Member(As3Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Executable(As3Executable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Parameter(As3Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Parameter Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Parameter Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ParameterAssign(As3ParameterAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Parameter Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Parameter Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ParameterRest(As3ParameterRest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Field Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Field Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3FieldBinding(As3FieldBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Field Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3FieldDefinition(As3FieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Program(As3Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Import(As3Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Import List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Import List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ImportList(As3ImportList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Include(As3Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Use(As3Use object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Package(As3Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Type(As3Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Class(As3Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Interface(As3Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Namespace(As3Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Variable(As3Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Variable Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Variable Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3VariableAssign(As3VariableAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Variable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3VariableDefinition(As3VariableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Operation(As3Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Constructor(As3Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Metadata Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Metadata Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3MetadataTag(As3MetadataTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Metadata Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Metadata Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3MetadataParameter(As3MetadataParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Attribute Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3AttributeExpression(As3AttributeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Simple Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Simple Attribute Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3SimpleAttributeExpression(As3SimpleAttributeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Qualified Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Qualified Attribute Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3QualifiedAttributeExpression(As3QualifiedAttributeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Default Xml Namespace Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Default Xml Namespace Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3DefaultXmlNamespaceStatement(As3DefaultXmlNamespaceStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Try Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3TryStatement(As3TryStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Catch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Catch Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3CatchClause(As3CatchClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ThrowStatement(As3ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ReturnStatement(As3ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 With Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 With Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3WithStatement(As3WithStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3BreakStatement(As3BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Continue Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ContinueStatement(As3ContinueStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Iteration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Iteration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3IterationStatement(As3IterationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Conditional Iteration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Conditional Iteration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ConditionalIterationStatement(As3ConditionalIterationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Do Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3DoStatement(As3DoStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3WhileStatement(As3WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ForStatement(As3ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 For In Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 For In Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ForInStatement(As3ForInStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Conditional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Conditional Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ConditionalStatement(As3ConditionalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3SwitchStatement(As3SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Case Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Case Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3CaseLabel(As3CaseLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Default Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Default Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3DefaultCase(As3DefaultCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Expression Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Expression Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ExpressionCase(As3ExpressionCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3IfStatement(As3IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Labeled Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3LabeledStatement(As3LabeledStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Block(As3Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Super Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Super Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3SuperStatement(As3SuperStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ExpressionStatement(As3ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3EmptyStatement(As3EmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ExpressionList(As3ExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 List Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ListExpression(As3ListExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Arguments(As3Arguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3AssignmentExpression(As3AssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ConditionalExpression(As3ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3BinaryExpression(As3BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3LogicalExpression(As3LogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Bitwise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Bitwise Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3BitwiseExpression(As3BitwiseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Equality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3EqualityExpression(As3EqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3RelationalExpression(As3RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Shift Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ShiftExpression(As3ShiftExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Additive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3AdditiveExpression(As3AdditiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Multiplicative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3MultiplicativeExpression(As3MultiplicativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3UnaryExpression(As3UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Delete Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Delete Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3DeleteExpression(As3DeleteExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Void Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Void Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3VoidExpression(As3VoidExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Type Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Type Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3TypeOfExpression(As3TypeOfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Pre Increment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Pre Increment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PreIncrementExpression(As3PreIncrementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Pre Decrement Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Pre Decrement Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PreDecrementExpression(As3PreDecrementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Unary Plus Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Unary Plus Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3UnaryPlusExpression(As3UnaryPlusExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Unary Minus Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Unary Minus Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3UnaryMinusExpression(As3UnaryMinusExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Bitwise Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Bitwise Not Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3BitwiseNotExpression(As3BitwiseNotExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Logical Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Logical Not Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3LogicalNotExpression(As3LogicalNotExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Postfix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PostfixExpression(As3PostfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Post Increment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Post Increment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PostIncrementExpression(As3PostIncrementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Post Decrement Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Post Decrement Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PostDecrementExpression(As3PostDecrementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Invocation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Invocation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3InvocationExpression(As3InvocationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3AccessExpression(As3AccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Query Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Query Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3QueryExpression(As3QueryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Postfix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Postfix Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PostfixOperator(As3PostfixOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Property Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Property Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PropertyOperator(As3PropertyOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Query Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Query Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3QueryOperator(As3QueryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Simple Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Simple Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3SimpleIdentifier(As3SimpleIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Property Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Property Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3PropertyIdentifier(As3PropertyIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Qualified Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3QualifiedIdentifier(As3QualifiedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Attribute Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Attribute Qualified Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3AttributeQualifiedIdentifier(As3AttributeQualifiedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Non Attribute Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Non Attribute Qualified Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3NonAttributeQualifiedIdentifier(As3NonAttributeQualifiedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Simple Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Simple Qualified Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3SimpleQualifiedIdentifier(As3SimpleQualifiedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Expression Qualified Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Expression Qualified Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ExpressionQualifiedIdentifier(As3ExpressionQualifiedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 This Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ThisExpression(As3ThisExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Super Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Super Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3SuperExpression(As3SuperExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Paren List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Paren List Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ParenListExpression(As3ParenListExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Function Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3FunctionExpression(As3FunctionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 New Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3NewExpression(As3NewExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Array Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ArrayInitializer(As3ArrayInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Array Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Array Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ArrayElement(As3ArrayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Object Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Object Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ObjectInitializer(As3ObjectInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Literal Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Literal Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3LiteralField(As3LiteralField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Xml Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Xml Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3XmlInitializer(As3XmlInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3NullLiteral(As3NullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3BooleanLiteral(As3BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3NumberLiteral(As3NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3StringLiteral(As3StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Regex Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Regex Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3RegexLiteral(As3RegexLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Conditional Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Conditional Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ConditionalBlock(As3ConditionalBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Reserved Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Reserved Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3ReservedAttribute(As3ReservedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3Attributes(As3Attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 New Vector Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 New Vector Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3NewVectorExpression(As3NewVectorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As3 Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As3 Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs3TypeParameter(As3TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmElement(AvmElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmIdentifiable(AvmIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDefinition(AvmDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Declared Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Declared Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDeclaredElement(AvmDeclaredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Referable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Referable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmReferable(AvmReferable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmMember(AvmMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmExecutable(AvmExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDefinitionContainer(AvmDefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmPackage(AvmPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmType(AvmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Declared Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmDeclaredType(AvmDeclaredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmClass(AvmClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmInterface(AvmInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmNamespace(AvmNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmVariable(AvmVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmField(AvmField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmParameter(AvmParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmOperation(AvmOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvmConstructor(AvmConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //As3ESwitch
