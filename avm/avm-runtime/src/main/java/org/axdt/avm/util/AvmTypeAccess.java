/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.util;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmGeneric;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmVoid;

public interface AvmTypeAccess {

	AvmTypeAccess VOID = new Simple(AvmEFactory.eINSTANCE.createAvmVoid());
	AvmTypeAccess GENERIC = new Simple(AvmEFactory.eINSTANCE.createAvmGeneric());
	AvmTypeAccess NULL = new Simple(AvmEFactory.eINSTANCE.createAvmNull());
	
	public static class Factory {
		public static AvmTypeAccess access(AvmType t) {
			if (t instanceof AvmDeclaredType) return new Extended(t, false, false, true, false);
			if (t instanceof AvmGeneric) return GENERIC;
			if (t instanceof AvmVoid) return VOID;
			return NULL; 
		}
		public static AvmTypeAccess staticAccess(AvmType t) {
			return access(t).setInstance(false).setStatic(true);
		}
		public static AvmTypeAccess superAccess(AvmType t) {
			return access(t).setProtected(true);
		}
		public static AvmTypeAccess thisAccess(AvmType t) {
			return superAccess(t).setPrivate(true);
		}
		public static AvmTypeAccess packageAccess(AvmPackage ref) {
			return new Builder(ref);
		}
	}
	
	AvmType getType();
	boolean isPrivate();
	boolean isProtected();
	boolean isStatic();
	boolean isInstance();
	AvmTypeAccess setPrivate(boolean priv);
	AvmTypeAccess setProtected(boolean prot);
	AvmTypeAccess setStatic(boolean stat);
	AvmTypeAccess setInstance(boolean inst);
	AvmTypeAccess computeCommonSuperType(AvmTypeAccess resolveType);
	

	
	public static class Builder extends Simple {

		private final AvmPackage _package;

		public Builder(AvmPackage ref) {
			super(AvmEFactory.eINSTANCE.createAvmNull());
			this._package = ref;
		}

		public AvmPackage getPackage() {
			return _package;
		}
	}
	
	
	public static class Simple implements AvmTypeAccess {
		
		protected final AvmType type;

		public Simple(AvmType type) {
			this.type = type;
			
		}

		public AvmType getType() {
			return type;
		}

		public boolean isPrivate() {
			return false;
		}

		public boolean isProtected() {
			return false;
		}

		public boolean isStatic() {
			return false;
		}

		public boolean isInstance() {
			return true;
		}

		public Simple setPrivate(boolean priv) {
			return this;
		}

		public Simple setProtected(boolean prot) {
			return this;
		}

		public Simple setStatic(boolean stat) {
			return this;
		}

		public Simple setInstance(boolean inst) {
			return this;
		}

		public AvmTypeAccess computeCommonSuperType(AvmTypeAccess resolveType) {
			if (type != null && resolveType != null) {
				AvmType t = type.calculateCommonType(resolveType.getType());
				return Factory.access(t);
			}
			return NULL;
		}
	}
	
	public static class Extended extends Simple {

		private boolean _private;
		private boolean _protected;
		private boolean _static;
		private boolean _instance;
		
		public Extended(AvmType type, boolean prot, boolean priv, boolean inst, boolean stat) {
			super(type);
			_protected = prot;
			_private = priv;
			_instance = inst;
			_static = stat;
			
		}
		public boolean isPrivate() {
			return _private;
		}
		public Extended setPrivate(boolean priv) {
			_private = priv;
			return this;
		}
		public boolean isProtected() {
			return _protected;
		}
		public Extended setProtected(boolean prot) {
			_protected = prot;
			return this;
		}
		public boolean isStatic() {
			return _static;
		}
		public Extended setStatic(boolean stat) {
			_static = stat;
			return this;
		}
		public boolean isInstance() {
			return _instance;
		}
		public Extended setInstance(boolean inst) {
			_instance = inst;
			return this;
		}
	}
}
