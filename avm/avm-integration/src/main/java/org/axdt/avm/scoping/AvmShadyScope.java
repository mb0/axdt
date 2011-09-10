package org.axdt.avm.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;

import com.google.common.base.Predicate;

public class AvmShadyScope extends SelectableBasedScope {

	protected AvmShadyScope(IScope outer, ISelectable selectable,
			Predicate<IEObjectDescription> filter, EClass type,
			boolean ignoreCase) {
		super(outer, selectable, filter, type, ignoreCase);
	}
	protected boolean isShadowed(IEObjectDescription input) {
		QualifiedName name = input.getName();
		int count = name.getSegmentCount();
		if (count < 1 || count > 1)
			return false;
		final Iterable<IEObjectDescription> localElements = getLocalElementsByName(name);
		return localElements.iterator().hasNext();
	}
}
