/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.axdt.asdoc.model.impl;

import java.util.Collection;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#getCanonicalName <em>Canonical Name</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#isPackageContentParsed <em>Package Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#isTypeContentParsed <em>Type Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#isGlobalContentParsed <em>Global Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#isMemberContentParsed <em>Member Content Parsed</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#isTypeContentAvailable <em>Type Content Available</em>}</li>
 *   <li>{@link org.axdt.asdoc.model.impl.AsdocPackageImpl#isGlobalContentAvailable <em>Global Content Available</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsdocPackageImpl extends AsdocElementImpl implements AsdocPackage {
	/**
	 * The default value of the '{@link #getCanonicalName() <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalName()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICAL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCanonicalName() <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalName()
	 * @generated
	 * @ordered
	 */
	protected String canonicalName = CANONICAL_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<AsdocPackage> packages;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AsdocType> types;
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<AsdocMember> members;

	/**
	 * The default value of the '{@link #isPackageContentParsed() <em>Package Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackageContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PACKAGE_CONTENT_PARSED_EDEFAULT = false;
	/**
	 * The flag representing the value of the '{@link #isPackageContentParsed() <em>Package Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackageContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final int PACKAGE_CONTENT_PARSED_EFLAG = 1 << 0;
	/**
	 * The default value of the '{@link #isTypeContentParsed() <em>Type Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_CONTENT_PARSED_EDEFAULT = false;
	/**
	 * The flag representing the value of the '{@link #isTypeContentParsed() <em>Type Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_CONTENT_PARSED_EFLAG = 1 << 1;
	/**
	 * The default value of the '{@link #isGlobalContentParsed() <em>Global Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobalContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLOBAL_CONTENT_PARSED_EDEFAULT = false;
	/**
	 * The flag representing the value of the '{@link #isGlobalContentParsed() <em>Global Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobalContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final int GLOBAL_CONTENT_PARSED_EFLAG = 1 << 2;
	/**
	 * The default value of the '{@link #isMemberContentParsed() <em>Member Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_CONTENT_PARSED_EDEFAULT = false;
	/**
	 * The flag representing the value of the '{@link #isMemberContentParsed() <em>Member Content Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberContentParsed()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMBER_CONTENT_PARSED_EFLAG = 1 << 3;
	/**
	 * The default value of the '{@link #isTypeContentAvailable() <em>Type Content Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeContentAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_CONTENT_AVAILABLE_EDEFAULT = false;
	/**
	 * The flag representing the value of the '{@link #isTypeContentAvailable() <em>Type Content Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeContentAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_CONTENT_AVAILABLE_EFLAG = 1 << 4;
	/**
	 * The default value of the '{@link #isGlobalContentAvailable() <em>Global Content Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobalContentAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLOBAL_CONTENT_AVAILABLE_EDEFAULT = false;
	/**
	 * The flag representing the value of the '{@link #isGlobalContentAvailable() <em>Global Content Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobalContentAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final int GLOBAL_CONTENT_AVAILABLE_EFLAG = 1 << 5;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsdocPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsdocEPackage.Literals.ASDOC_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanonicalName() {
		return canonicalName;
	}

	public String getName() {
		if (canonicalName == null) return null;
		int lastDot = canonicalName.lastIndexOf('.');
		return lastDot >= 0 ? canonicalName.substring(lastDot+1) : canonicalName;
	}
	
	public String getQualifier() {
		if (canonicalName == null) return null;
		int lastDot = canonicalName.lastIndexOf('.');
		return lastDot >= 0 ? canonicalName.substring(0,lastDot) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalName(String newCanonicalName) {
		String oldCanonicalName = canonicalName;
		canonicalName = newCanonicalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__CANONICAL_NAME, oldCanonicalName, canonicalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsdocPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<AsdocPackage>(AsdocPackage.class, this, AsdocEPackage.ASDOC_PACKAGE__PACKAGES, AsdocEPackage.ASDOC_PACKAGE__PARENT);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocPackage getParent() {
		if (eContainerFeatureID() != AsdocEPackage.ASDOC_PACKAGE__PARENT) return null;
		return (AsdocPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AsdocPackage newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AsdocEPackage.ASDOC_PACKAGE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AsdocPackage newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != AsdocEPackage.ASDOC_PACKAGE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, AsdocEPackage.ASDOC_PACKAGE__PACKAGES, AsdocPackage.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsdocType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<AsdocType>(AsdocType.class, this, AsdocEPackage.ASDOC_PACKAGE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsdocMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<AsdocMember>(AsdocMember.class, this, AsdocEPackage.ASDOC_PACKAGE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPackageContentParsed() {
		return (flags & PACKAGE_CONTENT_PARSED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageContentParsed(boolean newPackageContentParsed) {
		boolean oldPackageContentParsed = (flags & PACKAGE_CONTENT_PARSED_EFLAG) != 0;
		if (newPackageContentParsed) flags |= PACKAGE_CONTENT_PARSED_EFLAG; else flags &= ~PACKAGE_CONTENT_PARSED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED, oldPackageContentParsed, newPackageContentParsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeContentParsed() {
		return (flags & TYPE_CONTENT_PARSED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContentParsed(boolean newTypeContentParsed) {
		boolean oldTypeContentParsed = (flags & TYPE_CONTENT_PARSED_EFLAG) != 0;
		if (newTypeContentParsed) flags |= TYPE_CONTENT_PARSED_EFLAG; else flags &= ~TYPE_CONTENT_PARSED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_PARSED, oldTypeContentParsed, newTypeContentParsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlobalContentParsed() {
		return (flags & GLOBAL_CONTENT_PARSED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalContentParsed(boolean newGlobalContentParsed) {
		boolean oldGlobalContentParsed = (flags & GLOBAL_CONTENT_PARSED_EFLAG) != 0;
		if (newGlobalContentParsed) flags |= GLOBAL_CONTENT_PARSED_EFLAG; else flags &= ~GLOBAL_CONTENT_PARSED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED, oldGlobalContentParsed, newGlobalContentParsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemberContentParsed() {
		return (flags & MEMBER_CONTENT_PARSED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberContentParsed(boolean newMemberContentParsed) {
		boolean oldMemberContentParsed = (flags & MEMBER_CONTENT_PARSED_EFLAG) != 0;
		if (newMemberContentParsed) flags |= MEMBER_CONTENT_PARSED_EFLAG; else flags &= ~MEMBER_CONTENT_PARSED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__MEMBER_CONTENT_PARSED, oldMemberContentParsed, newMemberContentParsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeContentAvailable() {
		return (flags & TYPE_CONTENT_AVAILABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContentAvailable(boolean newTypeContentAvailable) {
		boolean oldTypeContentAvailable = (flags & TYPE_CONTENT_AVAILABLE_EFLAG) != 0;
		if (newTypeContentAvailable) flags |= TYPE_CONTENT_AVAILABLE_EFLAG; else flags &= ~TYPE_CONTENT_AVAILABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE, oldTypeContentAvailable, newTypeContentAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlobalContentAvailable() {
		return (flags & GLOBAL_CONTENT_AVAILABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalContentAvailable(boolean newGlobalContentAvailable) {
		boolean oldGlobalContentAvailable = (flags & GLOBAL_CONTENT_AVAILABLE_EFLAG) != 0;
		if (newGlobalContentAvailable) flags |= GLOBAL_CONTENT_AVAILABLE_EFLAG; else flags &= ~GLOBAL_CONTENT_AVAILABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE, oldGlobalContentAvailable, newGlobalContentAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullUri() {
		AsdocRoot root = getRoot();
		if (root == null) return null;
		return root.getBaseUri() + getCanonicalName().replace(".", "/") + "/";
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AsdocPackage getChildPackage(String fqn) {
		if (fqn == null) return null;
		for (AsdocPackage child:getPackages()) {
			if (fqn.equals(child.getCanonicalName()))
				return child;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AsdocPackage createChildPackage(String fqn) {
		if (fqn == null) return null;
		AsdocPackage child = getChildPackage(fqn);
		if (child == null) {
			child = AsdocEFactory.eINSTANCE.createAsdocPackage();
			child.setCanonicalName(fqn);
			getPackages().add(child);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AsdocRoot getRoot() {
		AsdocPackage parent = getParent();
		return parent == null ? null : parent.getRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
			case AsdocEPackage.ASDOC_PACKAGE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AsdocPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case AsdocEPackage.ASDOC_PACKAGE__PARENT:
				return basicSetParent(null, msgs);
			case AsdocEPackage.ASDOC_PACKAGE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case AsdocEPackage.ASDOC_PACKAGE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AsdocEPackage.ASDOC_PACKAGE__PARENT:
				return eInternalContainer().eInverseRemove(this, AsdocEPackage.ASDOC_PACKAGE__PACKAGES, AsdocPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsdocEPackage.ASDOC_PACKAGE__CANONICAL_NAME:
				return getCanonicalName();
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGES:
				return getPackages();
			case AsdocEPackage.ASDOC_PACKAGE__PARENT:
				return getParent();
			case AsdocEPackage.ASDOC_PACKAGE__TYPES:
				return getTypes();
			case AsdocEPackage.ASDOC_PACKAGE__MEMBERS:
				return getMembers();
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED:
				return isPackageContentParsed();
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_PARSED:
				return isTypeContentParsed();
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED:
				return isGlobalContentParsed();
			case AsdocEPackage.ASDOC_PACKAGE__MEMBER_CONTENT_PARSED:
				return isMemberContentParsed();
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE:
				return isTypeContentAvailable();
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE:
				return isGlobalContentAvailable();
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
			case AsdocEPackage.ASDOC_PACKAGE__CANONICAL_NAME:
				setCanonicalName((String)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends AsdocPackage>)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__PARENT:
				setParent((AsdocPackage)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends AsdocType>)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends AsdocMember>)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED:
				setPackageContentParsed((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_PARSED:
				setTypeContentParsed((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED:
				setGlobalContentParsed((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__MEMBER_CONTENT_PARSED:
				setMemberContentParsed((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE:
				setTypeContentAvailable((Boolean)newValue);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE:
				setGlobalContentAvailable((Boolean)newValue);
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
			case AsdocEPackage.ASDOC_PACKAGE__CANONICAL_NAME:
				setCanonicalName(CANONICAL_NAME_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case AsdocEPackage.ASDOC_PACKAGE__PARENT:
				setParent((AsdocPackage)null);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__TYPES:
				getTypes().clear();
				return;
			case AsdocEPackage.ASDOC_PACKAGE__MEMBERS:
				getMembers().clear();
				return;
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED:
				setPackageContentParsed(PACKAGE_CONTENT_PARSED_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_PARSED:
				setTypeContentParsed(TYPE_CONTENT_PARSED_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED:
				setGlobalContentParsed(GLOBAL_CONTENT_PARSED_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__MEMBER_CONTENT_PARSED:
				setMemberContentParsed(MEMBER_CONTENT_PARSED_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE:
				setTypeContentAvailable(TYPE_CONTENT_AVAILABLE_EDEFAULT);
				return;
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE:
				setGlobalContentAvailable(GLOBAL_CONTENT_AVAILABLE_EDEFAULT);
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
			case AsdocEPackage.ASDOC_PACKAGE__CANONICAL_NAME:
				return CANONICAL_NAME_EDEFAULT == null ? canonicalName != null : !CANONICAL_NAME_EDEFAULT.equals(canonicalName);
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case AsdocEPackage.ASDOC_PACKAGE__PARENT:
				return getParent() != null;
			case AsdocEPackage.ASDOC_PACKAGE__TYPES:
				return types != null && !types.isEmpty();
			case AsdocEPackage.ASDOC_PACKAGE__MEMBERS:
				return members != null && !members.isEmpty();
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED:
				return ((flags & PACKAGE_CONTENT_PARSED_EFLAG) != 0) != PACKAGE_CONTENT_PARSED_EDEFAULT;
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_PARSED:
				return ((flags & TYPE_CONTENT_PARSED_EFLAG) != 0) != TYPE_CONTENT_PARSED_EDEFAULT;
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED:
				return ((flags & GLOBAL_CONTENT_PARSED_EFLAG) != 0) != GLOBAL_CONTENT_PARSED_EDEFAULT;
			case AsdocEPackage.ASDOC_PACKAGE__MEMBER_CONTENT_PARSED:
				return ((flags & MEMBER_CONTENT_PARSED_EFLAG) != 0) != MEMBER_CONTENT_PARSED_EDEFAULT;
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE:
				return ((flags & TYPE_CONTENT_AVAILABLE_EFLAG) != 0) != TYPE_CONTENT_AVAILABLE_EDEFAULT;
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE:
				return ((flags & GLOBAL_CONTENT_AVAILABLE_EFLAG) != 0) != GLOBAL_CONTENT_AVAILABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (canonicalName: ");
		result.append(canonicalName);
		result.append(", packageContentParsed: ");
		result.append((flags & PACKAGE_CONTENT_PARSED_EFLAG) != 0);
		result.append(", typeContentParsed: ");
		result.append((flags & TYPE_CONTENT_PARSED_EFLAG) != 0);
		result.append(", globalContentParsed: ");
		result.append((flags & GLOBAL_CONTENT_PARSED_EFLAG) != 0);
		result.append(", memberContentParsed: ");
		result.append((flags & MEMBER_CONTENT_PARSED_EFLAG) != 0);
		result.append(", typeContentAvailable: ");
		result.append((flags & TYPE_CONTENT_AVAILABLE_EFLAG) != 0);
		result.append(", globalContentAvailable: ");
		result.append((flags & GLOBAL_CONTENT_AVAILABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //AsdocPackageImpl
