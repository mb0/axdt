/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import java.util.List;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.AsdocEPackage;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.avm.access.AvmLibrary;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.naming.AvmQualifiedName;
import org.axdt.avm.naming.AvmQualifiedNameConverter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.collect.Lists;

public class AsdocLibrary extends AvmLibrary {

	AvmQualifiedNameConverter converter = new AvmQualifiedNameConverter();
	private final List<IEObjectDescription> descriptions;

	public AsdocLibrary(AsdocRoot root) {
		descriptions = collectDescriptions(root);
	}
	
	private List<IEObjectDescription> collectDescriptions(AsdocRoot root) {
		return collectPackageContent(root, Lists.<IEObjectDescription>newArrayList(), true);
	}

	private List<IEObjectDescription> collectPackageContent(AsdocPackage pack, List<IEObjectDescription> result, boolean roots) {
		for (AsdocPackage child:pack.getPackages()) {
			if (roots) result.add(createDesciption(child.getQualifiedName(), child.eClass(), "avm:/packages/"));
			collectPackageContent(child, result, false);
		}
		if (pack.isTypeContentAvailable())
			for (AsdocType type:pack.getTypes())
				result.add(createDesciption(type.getQualifiedName(), type.eClass(), "avm:/types/"));
		if (pack.isGlobalContentAvailable())
			for (AsdocMember member:pack.getMembers())
				result.add(createDesciption(member.getQualifiedName(), member.eClass(), "avm:/members/"));
		EClass nsType = AsdocEPackage.eINSTANCE.getAsdocNamespace();
		result.add(createDesciption(AvmQualifiedName.create("flash","utils","flash_proxy"), nsType,"avm:/members/"));
		result.add(createDesciption(AvmQualifiedName.create("flash","utils","object_proxy"), nsType, "avm:/members/"));
		result.add(createDesciption(AvmQualifiedName.create("AS3"), nsType, "avm:/members/"));
		return result;
	}
	
	protected IEObjectDescription createDesciption(AvmDefinition identifiable, String prefix) {
		return createDesciption(identifiable.getQualifiedName(), identifiable.eClass(), prefix);
	}
	
	protected IEObjectDescription createDesciption(AvmQualifiedName avmQualifiedName, EClass type, String prefix) {
		// we use mirror resources thus return a proxy
		InternalEObject proxy = (InternalEObject) AsdocEFactory.eINSTANCE.create(type);
		proxy.eSetProxyURI(URI.createURI(prefix + avmQualifiedName.toString() +"#"));
		return EObjectDescription.create(avmQualifiedName, proxy);
	}

	@Override
	public List<IEObjectDescription> getExportedObjects() {
		return descriptions;
	}

}
