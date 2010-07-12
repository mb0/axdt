/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#isFinal <em>Final</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#getMembers <em>Members</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#getExtendedClass <em>Extended Class</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.AsdocType#isMemberContentParsed <em>Member Content Parsed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType()
 * @model
 * @generated
 */
public interface AsdocType extends AsdocDefinition, AvmDeclaredType {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * The literals are from the enumeration {@link org.axdt.avm.model.AvmVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.axdt.avm.model.AvmVisibility
	 * @see #setVisibility(AvmVisibility)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_Visibility()
	 * @model default="3"
	 * @generated
	 */
	AvmVisibility getVisibility();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocType#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.axdt.avm.model.AvmVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(AvmVisibility value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_Interface()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocType#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_Dynamic()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocType#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_Final()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocType#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.asdoc.model.AsdocMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_Members()
	 * @model containment="true"
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	EList<AsdocMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Extended Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class</em>' containment reference.
	 * @see #setExtendedClass(AvmTypeReference)
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_ExtendedClass()
	 * @model containment="true"
	 * @generated
	 */
	AvmTypeReference getExtendedClass();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocType#getExtendedClass <em>Extended Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class</em>' containment reference.
	 * @see #getExtendedClass()
	 * @generated
	 */
	void setExtendedClass(AvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Extended Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.axdt.avm.model.AvmTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Interfaces</em>' containment reference list.
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_ExtendedInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<AvmTypeReference> getExtendedInterfaces();

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
	 * @see org.axdt.asdoc.AsdocEPackage#getAsdocType_MemberContentParsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isMemberContentParsed();

	/**
	 * Sets the value of the '{@link org.axdt.asdoc.model.AsdocType#isMemberContentParsed <em>Member Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Content Parsed</em>' attribute.
	 * @see #isMemberContentParsed()
	 * @generated
	 */
	void setMemberContentParsed(boolean value);

} // AsdocType
