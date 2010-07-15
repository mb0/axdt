/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc;

import org.axdt.asdoc.model.AsdocClass;
import org.axdt.asdoc.model.AsdocConstructor;
import org.axdt.asdoc.model.AsdocField;
import org.axdt.asdoc.model.AsdocInterface;
import org.axdt.asdoc.model.AsdocNamespace;
import org.axdt.asdoc.model.AsdocOperation;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocParameter;
import org.axdt.asdoc.model.AsdocProperty;
import org.axdt.asdoc.model.AsdocRoot;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.axdt.asdoc.AsdocEPackage
 * @generated
 */
public interface AsdocEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsdocEFactory eINSTANCE = org.axdt.asdoc.model.impl.AsdocEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Asdoc Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Package</em>'.
	 * @generated
	 */
	AsdocPackage createAsdocPackage();

	/**
	 * Returns a new object of class '<em>Asdoc Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Root</em>'.
	 * @generated
	 */
	AsdocRoot createAsdocRoot();

	/**
	 * Returns a new object of class '<em>Asdoc Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Class</em>'.
	 * @generated
	 */
	AsdocClass createAsdocClass();

	/**
	 * Returns a new object of class '<em>Asdoc Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Interface</em>'.
	 * @generated
	 */
	AsdocInterface createAsdocInterface();

	/**
	 * Returns a new object of class '<em>Asdoc Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Field</em>'.
	 * @generated
	 */
	AsdocField createAsdocField();

	/**
	 * Returns a new object of class '<em>Asdoc Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Property</em>'.
	 * @generated
	 */
	AsdocProperty createAsdocProperty();

	/**
	 * Returns a new object of class '<em>Asdoc Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Namespace</em>'.
	 * @generated
	 */
	AsdocNamespace createAsdocNamespace();

	/**
	 * Returns a new object of class '<em>Asdoc Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Parameter</em>'.
	 * @generated
	 */
	AsdocParameter createAsdocParameter();

	/**
	 * Returns a new object of class '<em>Asdoc Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Constructor</em>'.
	 * @generated
	 */
	AsdocConstructor createAsdocConstructor();

	/**
	 * Returns a new object of class '<em>Asdoc Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asdoc Operation</em>'.
	 * @generated
	 */
	AsdocOperation createAsdocOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AsdocEPackage getAsdocEPackage();

	AsdocRoot createDocRoot(String uri);

} //AsdocEFactory
