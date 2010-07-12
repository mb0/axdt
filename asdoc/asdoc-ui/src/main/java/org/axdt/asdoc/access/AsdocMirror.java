package org.axdt.asdoc.access;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.parser.CollectTypeInfo;
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
				try {
					new CollectTypeInfo().collectType(asdocType);
				} catch (Exception e) {
					logger.error(e);
				}
			}
		}
	}

	public EObject getEObject(Resource resource, String fragment,
			IFragmentProvider.Fallback fallback) {
		int index = fragment.lastIndexOf("::");
		String name;
		if (index > 0) name = fragment.substring(index+2);
		else {
			index = fragment.lastIndexOf('.');
			if (index > 0) name = fragment.substring(index+1);
			else name = fragment;
		}
		if (name.equals(getTypeName()))
			return mirroredDefinition;
		return fallback.getEObject(fragment);
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
