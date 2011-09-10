/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.naming.AvmQualifiedName;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#getParent <em>Parent</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#getTypes <em>Types</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#getMembers <em>Members</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#isPackageContentParsed <em>Package Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#isTypeContentParsed <em>Type Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#isGlobalContentParsed <em>Global Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#isMemberContentParsed <em>Member Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#isTypeContentAvailable <em>Type Content Available</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocPackage#isGlobalContentAvailable <em>Global Content Available</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage()
 * @model
 * @generated
 */
public interface AsdocPackage extends AsdocElement, AvmPackage {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(AvmQualifiedName)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_QualifiedName()
	 * @model default="" dataType="org.axdt.avm.model.AvmQualifiedName"
	 * @generated
	 */
	AvmQualifiedName getQualifiedName();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(AvmQualifiedName value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.asdoc.model.AsdocPackage}.
	 * It is bidirectional and its opposite is '{@link org.axdt.asdoc.model.AsdocPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_Packages()
	 * @see org.axdt.asdoc.model.AsdocPackage#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AsdocPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.axdt.asdoc.model.AsdocPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AsdocPackage)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_Parent()
	 * @see org.axdt.asdoc.model.AsdocPackage#getPackages
	 * @model opposite="packages" transient="false"
	 * @generated
	 */
	AsdocPackage getParent();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AsdocPackage value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.asdoc.model.AsdocType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_Types()
	 * @model containment="true"
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	EList<AsdocType> getTypes();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.asdoc.model.AsdocMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_Members()
	 * @model containment="true"
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	EList<AsdocMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Package Content Parsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Content Parsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Content Parsed</em>' attribute.
	 * @see #setPackageContentParsed(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_PackageContentParsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isPackageContentParsed();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#isPackageContentParsed <em>Package Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Content Parsed</em>' attribute.
	 * @see #isPackageContentParsed()
	 * @generated
	 */
	void setPackageContentParsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Content Parsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Content Parsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Content Parsed</em>' attribute.
	 * @see #setTypeContentParsed(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_TypeContentParsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isTypeContentParsed();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#isTypeContentParsed <em>Type Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Content Parsed</em>' attribute.
	 * @see #isTypeContentParsed()
	 * @generated
	 */
	void setTypeContentParsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Global Content Parsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Content Parsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Content Parsed</em>' attribute.
	 * @see #setGlobalContentParsed(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_GlobalContentParsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isGlobalContentParsed();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#isGlobalContentParsed <em>Global Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Content Parsed</em>' attribute.
	 * @see #isGlobalContentParsed()
	 * @generated
	 */
	void setGlobalContentParsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Member Content Parsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Content Parsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Content Parsed</em>' attribute.
	 * @see #setMemberContentParsed(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_MemberContentParsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isMemberContentParsed();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#isMemberContentParsed <em>Member Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Content Parsed</em>' attribute.
	 * @see #isMemberContentParsed()
	 * @generated
	 */
	void setMemberContentParsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Content Available</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Content Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Content Available</em>' attribute.
	 * @see #setTypeContentAvailable(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_TypeContentAvailable()
	 * @model default="false"
	 * @generated
	 */
	boolean isTypeContentAvailable();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#isTypeContentAvailable <em>Type Content Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Content Available</em>' attribute.
	 * @see #isTypeContentAvailable()
	 * @generated
	 */
	void setTypeContentAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Global Content Available</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Content Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Content Available</em>' attribute.
	 * @see #setGlobalContentAvailable(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocPackage_GlobalContentAvailable()
	 * @model default="false"
	 * @generated
	 */
	boolean isGlobalContentAvailable();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocPackage#isGlobalContentAvailable <em>Global Content Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Content Available</em>' attribute.
	 * @see #isGlobalContentAvailable()
	 * @generated
	 */
	void setGlobalContentAvailable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AsdocPackage getChildPackage(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AsdocPackage createChildPackage(String name);

} // AsdocPackage
