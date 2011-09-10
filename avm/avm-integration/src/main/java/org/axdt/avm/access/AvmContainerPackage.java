/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import java.util.List;

import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.naming.AvmQualifiedName;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.collect.Lists;

public class AvmContainerPackage extends MinimalEObjectImpl implements
		AvmPackage {

	protected final AvmQualifiedName qname;
	protected AvmContainerPackage parent;
	protected final List<IEObjectDescription> children;
	protected IEObjectDescription desc;

	public AvmContainerPackage(AvmQualifiedName qname, IEObjectDescription desc) {
		this.qname = qname;
		children = Lists.newArrayList();
		addChild(desc);
	}

	@Override
	protected EClass eStaticClass() {
		return AvmEPackage.eINSTANCE.getAvmPackage();
	}

	public void addChild(IEObjectDescription desc) {
		children.add(EObjectDescription.create(desc.getQualifiedName()
				.getLastSegment(), desc.getEObjectOrProxy()));
	}

	public List<AvmDeclaredType> getTypes() {
		List<AvmDeclaredType> result = Lists.newArrayList();
		for (IEObjectDescription child : children) {
			EObject object = child.getEObjectOrProxy();
			if (object instanceof AvmDeclaredType) {
				result.add((AvmDeclaredType) object);
			}
		}
		return result;
	}

	public List<AvmMember> getMembers() {
		List<AvmMember> result = Lists.newArrayList();
		for (IEObjectDescription child : children) {
			EObject object = child.getEObjectOrProxy();
			if (object instanceof AvmMember) {
				result.add((AvmMember) object);
			}
		}
		return result;
	}

	public String getQualifier() {
		return qname.skipLast(1).toString();
	}
	public AvmQualifiedName getQualifiedName() {
		return qname;
	}
	public String getCanonicalName() {
		return qname.toString();
	}

	public String getName() {
		return qname.getFirstSegment();
	}

	public IEObjectDescription getDescription() {
		if (desc == null)
			desc = EObjectDescription.create(qname, this);
		return desc;
	}

	public AvmContainerPackage getParent() {
		return parent;
	}

	public void setParent(AvmContainerPackage parent) {
		this.parent = parent;
	}

	public List<IEObjectDescription> getChildren() {
		return children;
	}
}
