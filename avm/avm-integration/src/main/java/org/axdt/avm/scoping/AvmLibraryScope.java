package org.axdt.avm.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.impl.AbstractCompoundSelectable;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicate;

public class AvmLibraryScope extends AvmShadyScope {

	protected AvmLibraryScope(ISelectable selectable, Predicate<IEObjectDescription> filter, EClass type,
			boolean ignoreCase) {
		super(IScope.NULLSCOPE, selectable, filter, type, ignoreCase);
	}

	public Iterable<IEObjectDescription> getTypedElementsByName(
			final QualifiedName name, final EClass type) {
		Iterable<IEObjectDescription> unfiltered = getSelectable().getExportedObjects(type, name, isIgnoreCase());
		return filterLocalElements(unfiltered);
	}

	public static class CompoundSelectable extends AbstractCompoundSelectable {
		protected final Iterable<ISelectable> selectables;
		public CompoundSelectable(Iterable<ISelectable> selectables) {
			this.selectables = selectables;
		}
		@Override
		protected Iterable<? extends ISelectable> getSelectables() {
			return selectables;
		}
	}
}
