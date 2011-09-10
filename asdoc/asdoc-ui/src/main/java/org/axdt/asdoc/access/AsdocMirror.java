/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.asdoc.access;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.parser.AsdocParser;
import org.axdt.avm.AvmEPackage;
import org.axdt.avm.access.AbstractMirror;
import org.axdt.avm.access.AvmResource;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmType;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IFragmentProvider;

public class AsdocMirror extends AbstractMirror {
	private static final Logger logger = Logger.getLogger(AsdocMirror.class);
	private final AvmDefinition mirroredDefinition;
	private final boolean isType;

	public AsdocMirror(AvmDefinition definition) {
		this.mirroredDefinition = definition;
		isType = AvmEPackage.eINSTANCE.getAvmType().isInstance(definition);
	}

	@Override
	protected String getTypeName() {
		return mirroredDefinition.getName();
	}

	public AvmDefinition getMirroredDefinition() {
		return mirroredDefinition;
	}
	
	public AvmType getMirroredType() {
		return isType ? (AvmType) mirroredDefinition : null;
	}

	public AvmMember getMirroredMember() {
		return !isType ? (AvmMember) mirroredDefinition : null;
	}

	public void initialize(AvmResource avmResource) {
		if (mirroredDefinition.eResource() == null) {
			// built-ins have no global definition and are 
			// created on demand within the avm resource 
			avmResource.getContents().add(mirroredDefinition);
		} else if (mirroredDefinition instanceof AsdocType) {
			AsdocType asdocType = (AsdocType) mirroredDefinition;
			if (!asdocType.isMemberContentParsed()) {
				AsdocRoot root = asdocType.getRoot();
				try {
					AsdocParser parser = root.getParseType().getParser();
					parser.parseMemberLevel(asdocType);
				} catch (Exception e) {
					logger.error(e);
				}
			}
		}
	}

	public EObject getEObject(Resource resource, String fragment,
			IFragmentProvider.Fallback fallback) {
		// the fragment is just the resource sub selector. it might be null.
		// the path already qualifies the mirrored definition.
		if (fragment == null || fragment.length() == 0)
			return mirroredDefinition;
		// TODO: investigate which fragments we expect
		throw new IllegalArgumentException("fragment access is not yet implemented");
	}

	public TreeIterator<EObject> getAllContents(AvmResource.Fallback fallback) {
		if (mirroredDefinition != null) {
			return new AbstractTreeIterator<EObject>(mirroredDefinition, true) {
				private static final long serialVersionUID = 1L;

				@Override
				public Iterator<EObject> getChildren(Object object) {
					return ((EObject) object).eContents().iterator();
				}
			};
		}
		return fallback.getAllContents();
	}

	public EList<EObject> getContents(AvmResource.Fallback fallback) {
		if (mirroredDefinition != null) {
			BasicEList<EObject> result = new BasicEList<EObject>();
			result.add(mirroredDefinition);
			return result;
		}
		return fallback.getContents();
	}
}
