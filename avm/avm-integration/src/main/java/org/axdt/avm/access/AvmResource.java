/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.access;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.resource.IFragmentProvider;

public class AvmResource extends ResourceImpl {

	private IMirror mirror;
	
	public static interface Fallback extends IFragmentProvider.Fallback {
		String getFragment(EObject obj);
		EObject getEObject(String fragment);
		TreeIterator<EObject> getAllContents();
		EList<EObject> getContents();
	}
	
	private Fallback fallback = new Fallback() {
		public String getFragment(EObject obj) {
			return AvmResource.super.getURIFragment(obj);
		}
		public EObject getEObject(String fragment) {
			return AvmResource.super.getEObject(fragment);
		}
		public TreeIterator<EObject> getAllContents() {
			return AvmResource.super.getAllContents();
		}
		public EList<EObject> getContents() {
			return AvmResource.super.getContents();
		}
	};
	
	public Fallback getFallback() {
		return fallback;
	}
	
	public AvmResource() {
		super();
	}
	
	public AvmResource(URI uri) {
		super(uri);
	}
	

	@Override
	public EObject getEObject(String uriFragment) {
		if (mirror != null) {
			EObject result = mirror.getEObject(this, uriFragment, fallback);
			return result;
		}
		return super.getEObject(uriFragment);
	}
	
	@Override
	public String getURIFragment(EObject eObject) {
		if (mirror != null) {
			return mirror.getFragment(eObject, fallback);
		}
		return super.getURIFragment(eObject);
	}

	public void setMirror(IMirror mirror) {
		this.mirror = mirror;
	}

	public IMirror getMirror() {
		return mirror;
	}
	
	@Override
	public void load(Map<?, ?> options) throws IOException {
		if (!isLoaded) {
			load(null, options);
		}
	}
	
	@Override
	public void save(Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		if (getURI() != null && mirror != null) {
			mirror.initialize(this);
		}
	}
	@Override
	public EList<EObject> getContents() {
		if (mirror != null) {
			return mirror.getContents(fallback);
		}
		return super.getContents();
	}
	
	@Override
	public TreeIterator<EObject> getAllContents() {
		if (mirror != null) {
			return mirror.getAllContents(fallback);
		}
		return super.getAllContents();
	}
}
