/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.avm;

import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmGeneric;
import org.axdt.avm.model.AvmGenericReference;
import org.axdt.avm.model.AvmNull;
import org.axdt.avm.model.AvmNullReference;
import org.axdt.avm.model.AvmVoid;
import org.axdt.avm.model.AvmVoidReference;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.avm.AvmEPackage
 * @generated
 */
public interface AvmEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvmEFactory eINSTANCE = org.axdt.avm.model.impl.AvmEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Avm Void Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm Void Reference</em>'.
	 * @generated
	 */
	AvmVoidReference createAvmVoidReference();

	/**
	 * Returns a new object of class '<em>Avm Null Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm Null Reference</em>'.
	 * @generated
	 */
	AvmNullReference createAvmNullReference();

	/**
	 * Returns a new object of class '<em>Avm Generic Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm Generic Reference</em>'.
	 * @generated
	 */
	AvmGenericReference createAvmGenericReference();

	/**
	 * Returns a new object of class '<em>Avm Declared Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm Declared Type Reference</em>'.
	 * @generated
	 */
	AvmDeclaredTypeReference createAvmDeclaredTypeReference();

	/**
	 * Returns a new object of class '<em>Avm Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm Void</em>'.
	 * @generated
	 */
	AvmVoid createAvmVoid();

	/**
	 * Returns a new object of class '<em>Avm Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm Null</em>'.
	 * @generated
	 */
	AvmNull createAvmNull();

	/**
	 * Returns a new object of class '<em>Avm Generic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm Generic</em>'.
	 * @generated
	 */
	AvmGeneric createAvmGeneric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AvmEPackage getAvmEPackage();

} //AvmEFactory
