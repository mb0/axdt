package org.axdt.asdoc.scoping;

import java.util.List;

import org.axdt.asdoc.AsdocEFactory;
import org.axdt.asdoc.access.IAsdocDefinitionProvider;
import org.axdt.asdoc.model.AsdocMember;
import org.axdt.asdoc.model.AsdocPackage;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.AsdocType;
import org.axdt.asdoc.util.AsdocESwitch;
import org.axdt.avm.access.IDefinitionProvider;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.scoping.AvmDefinitionScope;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.collect.Lists;

public class AsdocDefinitionScope extends AvmDefinitionScope {

	public AsdocDefinitionScope(IAsdocDefinitionProvider definitionProvider, boolean onlyTypes) {
		super(definitionProvider, onlyTypes);
	}
	@Override
	public Iterable<IEObjectDescription> internalGetContents() {
		return new DescriptionCollector(onlyTypes).collect(getDefinitionProvider().getDocRoots());
	}
	@Override
	public IAsdocDefinitionProvider getDefinitionProvider() {
		return (IAsdocDefinitionProvider) super.getDefinitionProvider();
	}
}
class DescriptionCollector extends AsdocESwitch<Boolean> {
	private final List<IEObjectDescription> collected = Lists.newArrayList();
	private final boolean onlyTypes;

	public DescriptionCollector(boolean onlyTypes) {
		this.onlyTypes = onlyTypes;
	}

	public List<IEObjectDescription> collect(Iterable<AsdocRoot> docRoots) {
		for (AsdocRoot root:docRoots)
			collect(root.eAllContents());
		return collected;
	}

	protected void collect(TreeIterator<EObject> contents) {
		while (contents.hasNext()) {
			EObject next = contents.next();
			Boolean traverse = doSwitch(next);
			if (!traverse) contents.prune();
		}
	}
	@Override
	public Boolean caseAsdocPackage(AsdocPackage object) {
		return true;
	}
	@Override
	public Boolean caseAsdocType(AsdocType object) {
		collectDefinition(object, IDefinitionProvider.PROTOCOL+":/types/");
		return false;
	}
	@Override
	public Boolean caseAsdocMember(AsdocMember object) {
		if (!onlyTypes)
			collectDefinition(object, IDefinitionProvider.PROTOCOL+":/members/");
		return false;
	}
	@Override
	public Boolean defaultCase(EObject object) {
		return false;
	}
	protected void collectDefinition(AvmDefinition identifiable, String prefix) {
		String fqn = identifiable.getCanonicalName();
		// we want the the mirror resource uri is used thus use a proxy 
		InternalEObject proxy = (InternalEObject) AsdocEFactory.eINSTANCE.create(identifiable.eClass());
		proxy.eSetProxyURI(URI.createURI(prefix+fqn));
		collected.add(EObjectDescription.create(fqn, proxy));
	}
}