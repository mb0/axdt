/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.util;

import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmType;

public interface AvmTypeAccess {

	AvmTypeAccess VOID = new Simple(AvmEFactory.eINSTANCE.createAvmVoid());
	AvmTypeAccess GENERIC = new Simple(AvmEFactory.eINSTANCE.createAvmGeneric());
	AvmTypeAccess NULL = new Simple(AvmEFactory.eINSTANCE.createAvmNull());
	
	AvmType getType();
	boolean isPrivate();
	boolean isProtected();
	boolean isStatic();
	boolean isInstance();
	void setPrivate(boolean priv);
	void setProtected(boolean prot);
	void setStatic(boolean stat);
	void setInstance(boolean inst);
	
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

		public void setPrivate(boolean priv) {
		}

		public void setProtected(boolean prot) {
		}

		public void setStatic(boolean stat) {
		}

		public void setInstance(boolean inst) {
		}
	}
	
	public static class Extended extends Simple {

		private boolean _private;
		private boolean _protected;
		private boolean _static;
		private boolean _instance;
		
		public Extended(AvmType type) {
			this(type, false, false, true, false);
		}
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
		public void setPrivate(boolean priv) {
			_private = priv;
		}
		public boolean isProtected() {
			return _protected;
		}
		public void setProtected(boolean prot) {
			_protected = prot;
		}
		public boolean isStatic() {
			return _static;
		}
		public void setStatic(boolean stat) {
			_static = stat;
		}
		public boolean isInstance() {
			return _instance;
		}
		public void setInstance(boolean inst) {
			_instance = inst;
		}
	}
}
