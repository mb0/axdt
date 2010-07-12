package org.axdt.avm.scoping;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class AvmAwareGlobalScopeProvider extends DefaultGlobalScopeProvider {
	
	@Inject
	private AbstractDefinitionScopeProvider definitionScopeProvider;
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		IScope result = definitionScopeProvider.getScope(context, reference);
		List<IContainer> containers = Lists.newArrayList(getVisibleContainers(context));
		Collections.reverse(containers);
		Iterator<IContainer> iter = containers.iterator();
		while (iter.hasNext()) {
			IContainer container = iter.next();
			result = createContainerScope(result, container, reference);
		}
		return result;
	}

	protected EClass getEReferenceType(EObject context, EReference reference) {
		return reference.getEReferenceType();
	}
}
