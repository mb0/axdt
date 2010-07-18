/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3PropertyIdentifier;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmIdentifiable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVariable;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Property Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3PropertyIdentifierImpl extends As3SimpleIdentifierImpl implements As3PropertyIdentifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3PropertyIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_PROPERTY_IDENTIFIER;
	}

	@Override
	public AvmType resolveType() {
		AvmIdentifiable ref = getReference();
		if (ref == null && name == null)
			return AvmEFactory.eINSTANCE.createAvmNull();
		// TODO when should a avm type resolve to Class ?
		if (ref instanceof AvmType)
			return (AvmType) ref;
		if (ref instanceof AvmVariable) {
			AvmTypeReference typeRef = ((AvmVariable) ref).getType();
			return typeRef != null
					? typeRef.getType()
					: AvmEFactory.eINSTANCE.createAvmNull();
		}
		if (ref instanceof AvmExecutable) {
			return getClassProxy("Function");
		}
		return AvmEFactory.eINSTANCE.createAvmGeneric();
	}
} //As3PropertyIdentifierImpl
