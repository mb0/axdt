/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.ui.provider;


import java.util.Collection;
import java.util.List;

import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.avm.naming.AvmQualifiedName;
import org.axdt.core.ui.img.AxdtImageHelper;
import org.axdt.core.ui.img.AxdtImages;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.google.common.collect.Lists;

/**
 * This is the item provider adapter for a {@link org.axdt.asdoc.model.AsdocPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsdocPackageItemProvider
	extends AsdocElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdocPackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addQualifiedNamePropertyDescriptor(object);
			addPackageContentParsedPropertyDescriptor(object);
			addTypeContentParsedPropertyDescriptor(object);
			addGlobalContentParsedPropertyDescriptor(object);
			addMemberContentParsedPropertyDescriptor(object);
			addTypeContentAvailablePropertyDescriptor(object);
			addGlobalContentAvailablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Qualified Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifiedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsdocPackage_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsdocPackage_qualifiedName_feature", "_UI_AsdocPackage_type"),
				 AsdocEPackage.Literals.ASDOC_PACKAGE__QUALIFIED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Content Parsed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageContentParsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsdocPackage_packageContentParsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsdocPackage_packageContentParsed_feature", "_UI_AsdocPackage_type"),
				 AsdocEPackage.Literals.ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Content Parsed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeContentParsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsdocPackage_typeContentParsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsdocPackage_typeContentParsed_feature", "_UI_AsdocPackage_type"),
				 AsdocEPackage.Literals.ASDOC_PACKAGE__TYPE_CONTENT_PARSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Content Parsed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalContentParsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsdocPackage_globalContentParsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsdocPackage_globalContentParsed_feature", "_UI_AsdocPackage_type"),
				 AsdocEPackage.Literals.ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member Content Parsed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberContentParsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsdocPackage_memberContentParsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsdocPackage_memberContentParsed_feature", "_UI_AsdocPackage_type"),
				 AsdocEPackage.Literals.ASDOC_PACKAGE__MEMBER_CONTENT_PARSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Content Available feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeContentAvailablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsdocPackage_typeContentAvailable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsdocPackage_typeContentAvailable_feature", "_UI_AsdocPackage_type"),
				 AsdocEPackage.Literals.ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Content Available feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalContentAvailablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AsdocPackage_globalContentAvailable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AsdocPackage_globalContentAvailable_feature", "_UI_AsdocPackage_type"),
				 AsdocEPackage.Literals.ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AsdocEPackage.Literals.ASDOC_PACKAGE__PACKAGES);
			childrenFeatures.add(AsdocEPackage.Literals.ASDOC_PACKAGE__TYPES);
			childrenFeatures.add(AsdocEPackage.Literals.ASDOC_PACKAGE__MEMBERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AsdocPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		AxdtImageHelper helper = AxdtImageHelper.getInstance();
		return new ComposedImage(Lists.newArrayList(
				helper.getImage(AxdtImages.PACKAGE),
				helper.getImage(AxdtImages.ASDOC_OVERRIDE)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AvmQualifiedName labelValue = ((AsdocPackage)object).getQualifiedName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AsdocPackage_type") :
			getString("_UI_AsdocPackage_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AsdocPackage.class)) {
			case AsdocEPackage.ASDOC_PACKAGE__QUALIFIED_NAME:
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGE_CONTENT_PARSED:
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_PARSED:
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_PARSED:
			case AsdocEPackage.ASDOC_PACKAGE__MEMBER_CONTENT_PARSED:
			case AsdocEPackage.ASDOC_PACKAGE__TYPE_CONTENT_AVAILABLE:
			case AsdocEPackage.ASDOC_PACKAGE__GLOBAL_CONTENT_AVAILABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AsdocEPackage.ASDOC_PACKAGE__PACKAGES:
			case AsdocEPackage.ASDOC_PACKAGE__TYPES:
			case AsdocEPackage.ASDOC_PACKAGE__MEMBERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

}
