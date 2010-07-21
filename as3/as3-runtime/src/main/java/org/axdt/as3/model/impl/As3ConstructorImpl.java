/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.as3.model.impl;

import java.lang.Iterable;
import java.util.Collection;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Block;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3Constructor;
import org.axdt.as3.model.As3Executable;
import org.axdt.as3.model.As3Parameter;
import org.axdt.as3.model.IDirective;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmConstructor;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.as3.model.impl.As3ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.axdt.as3.model.impl.As3ConstructorImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class As3ConstructorImpl extends As3MemberImpl implements As3Constructor {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<As3Parameter> parameters;
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected As3Block body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<As3Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<As3Parameter>(As3Parameter.class, this, As3EPackage.AS3_CONSTRUCTOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(As3Block newBody, NotificationChain msgs) {
		As3Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONSTRUCTOR__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(As3Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONSTRUCTOR__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - As3EPackage.AS3_CONSTRUCTOR__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As3EPackage.AS3_CONSTRUCTOR__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Iterable<AvmReferable> getDeclarations() {
		if (body != null)
			return Lists.newArrayList(Iterators.filter(
				EcoreUtil.getAllProperContents(body, false),
				AvmReferable.class
			));
		return Iterables.emptyIterable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Iterable<IDirective> getDirectives() {
		if (body != null)
			return body.getDirectives();
		return Iterables.emptyIterable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmTypeReference getReturnType() {
		AvmDeclaredTypeReference ref = null;
		if (eContainer() instanceof As3Class) {
			ref = AvmEFactory.eINSTANCE.createAvmDeclaredTypeReference();
			ref.setType((As3Class) eContainer);
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As3EPackage.AS3_CONSTRUCTOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case As3EPackage.AS3_CONSTRUCTOR__BODY:
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case As3EPackage.AS3_CONSTRUCTOR__PARAMETERS:
				return getParameters();
			case As3EPackage.AS3_CONSTRUCTOR__BODY:
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case As3EPackage.AS3_CONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends As3Parameter>)newValue);
				return;
			case As3EPackage.AS3_CONSTRUCTOR__BODY:
				setBody((As3Block)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case As3EPackage.AS3_CONSTRUCTOR__PARAMETERS:
				getParameters().clear();
				return;
			case As3EPackage.AS3_CONSTRUCTOR__BODY:
				setBody((As3Block)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case As3EPackage.AS3_CONSTRUCTOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case As3EPackage.AS3_CONSTRUCTOR__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AvmExecutable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == As3Executable.class) {
			switch (derivedFeatureID) {
				case As3EPackage.AS3_CONSTRUCTOR__PARAMETERS: return As3EPackage.AS3_EXECUTABLE__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == AvmConstructor.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AvmExecutable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == As3Executable.class) {
			switch (baseFeatureID) {
				case As3EPackage.AS3_EXECUTABLE__PARAMETERS: return As3EPackage.AS3_CONSTRUCTOR__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == AvmConstructor.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //As3ConstructorImpl
