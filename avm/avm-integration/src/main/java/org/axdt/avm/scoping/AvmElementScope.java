package org.axdt.avm.scoping;

import java.util.List;
import java.util.Set;

import org.axdt.avm.model.AvmClass;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmInterface;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.internal.Lists;

public abstract class AvmElementScope<T extends EObject> extends AbstractScope {
	
	public final static Function<AvmReferable, IEObjectDescription> GetDesciption = new Function<AvmReferable, IEObjectDescription>() {
		public IEObjectDescription apply(AvmReferable from) {
			return EObjectDescription.create(from.getName(), from);
		}
	};
	
	public final static class UniqueNames implements Predicate<AvmReferable> {
		private final Set<String> names = Sets.newHashSet();
		public boolean apply(AvmReferable input) {
			String name = input.getName();
			return name != null && names.add(name);
		}
	}
	
	protected final T element;
	protected final IScopeProvider scopeProvider;
	protected final EReference ref;
	protected IScope parentScope;

	public AvmElementScope(T element, EReference ref, IScopeProvider scopeProvider) {
		this.element = element;
		this.ref = ref;
		this.scopeProvider = scopeProvider;
	}
	protected IScope getParentScope() {
		if (parentScope == null)
			parentScope = createParentScope();
		return parentScope;
	}
	protected IScope createParentScope() {
		return scopeProvider.getScope(element.eContainer(), ref);
	}
	public IScope getOuterScope() {
		return getParentScope();
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetContents() {
		return Iterables.transform(getCandidates(), GetDesciption);
	}

	protected abstract Iterable<? extends AvmReferable> getCandidates();
	
	protected AvmType resolveType(AvmType type) {
		if (type.eIsProxy()) {
			InternalEObject internal = (InternalEObject) type;
			String urlString = internal.eProxyURI().toString();
			if (urlString.startsWith("avm:/lookup/")) {
				String lookupName = urlString.replaceFirst("avm:/lookup/", "");
				// lets lookup the type name in the parent scope
				IEObjectDescription description = getParentScope().getContentByName(lookupName);
				if (description != null) {
					EObject descEObj = description.getEObjectOrProxy();
					// if resolution was successful
					if (descEObj != null && !descEObj.eIsProxy() && descEObj instanceof AvmDeclaredType) {
						// set the canonical type name so we can skip the scope lookup next time
						type = (AvmType) descEObj;
						internal.eSetProxyURI(URI.createURI("avm:/types/"+type.getCanonicalName()));
					}
				}
			} else {
				type = (AvmType) EcoreUtil2.resolve(type, element);
			}
		}
		return type;
	}

	protected void collectAllMembers(AvmClass type, List<AvmMember> list) {
		list.addAll(type.getMembers());
		AvmDeclaredType superType = resolveTypeReference(type.getExtendedClass());
		if (superType instanceof AvmClass)
			collectAllMembers((AvmClass) superType, list);
	}
	protected void collectAllMembers(AvmInterface type, List<AvmMember> list) {
		list.addAll(type.getMembers());
		List<AvmTypeReference> interfaces = type.getExtendedInterfaces();
		for (AvmTypeReference ref:interfaces) {
			AvmDeclaredType superType = resolveTypeReference(ref);
			if (superType instanceof AvmInterface)
				collectAllMembers((AvmInterface) superType, list);
		}
	}
	protected Iterable<AvmMember> getAllMembers(AvmDeclaredType type) {
		List<AvmMember> result = Lists.newArrayList();
		if (type.isClass())
			collectAllMembers((AvmClass) type, result);
		else if (type.isInterface())
			collectAllMembers((AvmInterface) type, result);
		return result;
	}
	
	protected AvmDeclaredType resolveTypeReference(AvmTypeReference ref) {
		if (ref != null) {
			AvmType parent = resolveType(ref.getType());
			if (parent instanceof AvmDeclaredType)
				return (AvmDeclaredType) parent;
		}
		return null;
	}
}
