package org.axdt.as3.resource;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.util.As3ESwitch;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmVisibility;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;

import com.google.common.collect.Lists;

public class As3ResourceDescription extends DefaultResourceDescription {

	private final static Logger log =  Logger.getLogger(As3ResourceDescription.class);
	
	public As3ResourceDescription(Resource resource,
			IQualifiedNameProvider nameProvider) {
		super(resource, nameProvider);
	}
	
	@Override
	protected List<IEObjectDescription> computeExportedObjects() {
		Resource res = getResource();
		if (!res.isLoaded()) {
			try {
				res.load(null);
			} catch (IOException e) {
				log.error(e.getMessage(), e);
				return Collections.<IEObjectDescription> emptyList();
			}
		}
		if (!res.getContents().isEmpty()) {
			EObject root = getResource().getContents().get(0);
			if (root instanceof As3Program) {
				return new DescriptionCollector().collect(((As3Program) root).getPackage());
			}
		}
		return Collections.<IEObjectDescription> emptyList();
	}
}
class DescriptionCollector extends As3ESwitch<Boolean> {
	private final List<IEObjectDescription> collected = Lists.newArrayList();
	
	public List<IEObjectDescription> getCollectedDescriptions() {
		return collected;
	}
	public List<IEObjectDescription> collect(As3Package pack) {
		if (pack == null) return collected;
		return collect(new AbstractTreeIterator<EObject>(pack, true) {
			private static final long serialVersionUID = 1L;
			@Override public Iterator<EObject> getChildren(Object object) {
				return ((EObject) object).eContents().iterator();
			}
		});
	}
	protected List<IEObjectDescription> collect(TreeIterator<EObject> contents) {
		while (contents.hasNext()) {
			EObject next = contents.next();
			Boolean traverse = doSwitch(next);
			if (!traverse) contents.prune();
		}
		return collected;
	}
	@Override
	public Boolean caseAvmPackage(AvmPackage object) {
		return true;
	}
	@Override
	public Boolean caseAvmType(AvmType object) {
		collectDefinition(object);
		return true;
	}
	@Override
	public Boolean caseAvmMember(AvmMember object) {
		if (AvmVisibility.PUBLIC.equals(object.getVisibility()))
			collectDefinition(object);
		return false;
	}
	@Override
	public Boolean defaultCase(EObject object) {
		return false;
	}
	public void collectDefinition(AvmDefinition identifiable) {
		collected.add(EObjectDescription.create(identifiable.getCanonicalName(), identifiable));
	}
}