/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.scoping;

import java.util.List;

import org.axdt.avm.access.DefinitionNotFoundException;
import org.axdt.avm.model.AvmClass;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmInterface;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.util.AvmTypeAccess;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.internal.Lists;

public abstract class AvmElementScope<T extends EObject> extends AbstractScope {
	
	public final static Function<AvmReferable, IEObjectDescription> GetDesciption = new Function<AvmReferable, IEObjectDescription>() {
		public IEObjectDescription apply(AvmReferable from) {
			return EObjectDescription.create(from.getName(), from);
		}
	};
	
	protected final T element;
	protected final AvmScopeProvider scopeProvider;
	protected final EReference ref;
	protected IScope parentScope;
	protected AvmDeclaredType typeEnclosingElement;

	public AvmElementScope(T element, EReference ref, AvmScopeProvider scopeProvider) {
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
		return scopeProvider.getScope(element, element.eContainer(), ref);
	}
	public IScope getOuterScope() {
		return getParentScope();
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetContents() {
		return Iterables.transform(getCandidates(), GetDesciption);
	}

	protected abstract Iterable<? extends AvmReferable> getCandidates();
	
	protected AvmType resolveType(AvmType type, AvmTypeReference ref) {
		if (type.eIsProxy()) {
			InternalEObject internal = (InternalEObject) type;
			String urlString = internal.eProxyURI().toString();
			if (urlString.startsWith("avm:/lookup/")) {
				String lookupName = urlString.replaceFirst("avm:/lookup/", "");
				// lets lookup the type name in the parent scope
				IScope current = getParentScope();
				AvmDefinitionScope defScope = null;
				while (current != null) {
					if (current instanceof AvmDefinitionScope) {
						defScope = (AvmDefinitionScope) current;
						break;
					}
					current = current.getOuterScope();
				}
				if (defScope != null) {
					try {
						type = defScope.definitionProvider.findTypeByName(lookupName);
						// set the canonical type name so we can skip the scope lookup next time
						internal.eSetProxyURI(URI.createURI("avm:/types/"+ type.getCanonicalName()));
						if (ref != null) {
							Resource resource = ref.eResource();
							if (resource != null) {
								resource.setModified(true);
							}
						}
					} catch (DefinitionNotFoundException e) {
					}
				}
			} else {
				type = (AvmType) EcoreUtil2.resolve(type, element);
			}
		}
		return type;
	}

	protected void collectAllMembers(AvmTypeAccess access, List<AvmMember> list,
			boolean intMod, boolean first) {
		AvmDeclaredType type = (AvmDeclaredType) access.getType();
		for (AvmMember member : type.getMembers()) {
			if (member instanceof AvmExecutable && type.getName().equals(member.getName())) {
				// skip constructor for now
				// we can work with type references in new expressions
				// and we usually want to access the type instead of the constructor
				// we can lookup the constructor on demand when we need parameter information
				continue;
			}
			if (member.isStatic()) {
				if (!access.isStatic())
					continue;
			} else {
				if (!access.isInstance())
					continue;
			}
			switch (member.getVisibility()) {
				case PUBLIC:
					break;
				case PROTECTED:
					if (access.isProtected()) break;
					continue;
				case PRIVATE:
					if (access.isPrivate()) break;
					continue;
				case INTERNAL:
					if (intMod) break;
					continue;
			}
			list.add(member);
		}
		if (type.isClass()) {
			AvmClass clss = (AvmClass) type;
			AvmDeclaredType superType = resolveTypeReference(clss.getExtendedClass());
			if (superType instanceof AvmClass) {
				AvmTypeAccess newaccess = new AvmTypeAccess.Extended(superType, access.isProtected(), false, access.isInstance(), access.isStatic());
				boolean newIntMod = sameQualifier(superType, getTypeEnclosingElement());
				collectAllMembers(newaccess, list, newIntMod, false);
			}
		}
		List<AvmTypeReference> interfaces = type.getExtendedInterfaces();
		for (AvmTypeReference ref:interfaces) {
			AvmDeclaredType superType = resolveTypeReference(ref);
			if (superType instanceof AvmInterface) {
				AvmTypeAccess newaccess = new AvmTypeAccess.Extended(superType, false, false, true, false);
				collectAllMembers(newaccess, list, false, false);
			}
		}
	}
	protected boolean sameQualifier(AvmDeclaredType t1, AvmDeclaredType t2) {
		if (t2 == null) return false;
		String qualifier = t1.getQualifier();
		if (qualifier == null) {
			if (t2.getQualifier() == null)
				return true;
		} else if (qualifier.equals(t2.getQualifier())) {
			return true;
		}
		return false;
	}
	protected Iterable<AvmMember> getAllMembers(AvmDeclaredType type, AvmTypeAccess access) {
		AvmTypeAccess newAccess = new AvmTypeAccess.Extended(type);
		boolean intMod = false;
		AvmDeclaredType refType = getTypeEnclosingElement();
		intMod = sameQualifier(type, refType);
		if (access != null) {
			newAccess.setProtected(access.isProtected());
			newAccess.setPrivate(access.isPrivate());
			newAccess.setStatic(access.isStatic());
			newAccess.setInstance(access.isInstance());
		}
		if (intMod && type.getName().equals(refType.getName())) {
			newAccess.setProtected(true);
			newAccess.setPrivate(true);
		}
		List<AvmMember> result = Lists.newArrayList();
		collectAllMembers(newAccess, result, intMod, true);
		return result;
	}
	protected AvmDeclaredType getTypeEnclosingElement() {
		if (typeEnclosingElement == null) {
			for (EObject current = element; current != null; current = current.eContainer()) {
				if (current instanceof AvmDeclaredType) {
					typeEnclosingElement = (AvmDeclaredType) current;
					break;
				}
			}
		}
		return typeEnclosingElement;
	}
	protected AvmDeclaredType resolveTypeReference(AvmTypeReference ref) {
		if (ref != null) {
			AvmType parent = resolveType(ref.getType(), ref);
			if (parent instanceof AvmDeclaredType) {
				return (AvmDeclaredType) parent;
			}
		}
		return null;
	}
}
