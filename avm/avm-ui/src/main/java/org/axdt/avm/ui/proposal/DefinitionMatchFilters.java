/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.ui.proposal;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmVisibility;
import org.axdt.avm.ui.proposal.IAvmProposalProvider.Filter;

public final class DefinitionMatchFilters {
	
	private DefinitionMatchFilters() {
	}
	
	public static IAvmProposalProvider.Filter all() {
		return new All();
	}
	
	public static IAvmProposalProvider.Filter none() {
		return new None();
	}
	
	public static IAvmProposalProvider.Filter not(IAvmProposalProvider.Filter filter) {
		return new Not(filter);
	}
	
	public static IAvmProposalProvider.Filter and(IAvmProposalProvider.Filter... filter) {
		return new And(filter);
	}
	
	public static IAvmProposalProvider.Filter or(IAvmProposalProvider.Filter... filter) {
		return new Or(filter);
	}
	
	public static IAvmProposalProvider.Filter canInstantiate() {
		return new CanInstantiate();
	}
	
	public static IAvmProposalProvider.Filter isPublic() {
		return new IsPublic();
	}
	
	public static class All implements IAvmProposalProvider.Filter {
		public boolean accept(AvmDefinition definition) {
			return true;
		}
	}
	
	public static class None implements IAvmProposalProvider.Filter {
		public boolean accept(AvmDefinition definition) {
			return false;
		}
	}
	
	public static class Not implements IAvmProposalProvider.Filter {
		
		private final Filter delegate;
		
		public Not(IAvmProposalProvider.Filter delegate) {
			this.delegate = delegate;
		}
		
		public boolean accept(AvmDefinition definition) {
			return !delegate.accept(null);
		}
	}
	
	public static class And implements IAvmProposalProvider.Filter {
		
		private final Filter[] delegates;
		
		public And(IAvmProposalProvider.Filter[] delegates) {
			this.delegates = delegates;
			if (delegates.length < 1)
				throw new IllegalArgumentException("Cannot 'and' empty delegates");
		}
		
		public boolean accept(AvmDefinition definition) {
			boolean result = true;
			int i = 0;
			while(result && i < delegates.length) {
				result = delegates[i].accept(null);
				i++;
			}
			return result;
		}
	}
	
	public static class Or implements IAvmProposalProvider.Filter {
		
		private final Filter[] delegates;
		
		public Or(IAvmProposalProvider.Filter[] delegates) {
			this.delegates = delegates;
			if (delegates.length < 1)
				throw new IllegalArgumentException("Cannot 'or' empty delegates");
		}
		
		public boolean accept(AvmDefinition definition) {
			boolean result = false;
			int i = 0;
			while(!result && i < delegates.length) {
				result = delegates[i].accept(null);
				i++;
			}
			return result;
		}
	}
	
	public static class CanInstantiate implements IAvmProposalProvider.Filter {
		public boolean accept(AvmDefinition definition) {
			if (definition instanceof AvmDeclaredType) {
				AvmDeclaredType type = (AvmDeclaredType) definition;
				return type.isClass() && !type.isFinal();
			}
			// TODO check for members with type class
			// we can instantiate with any variable:Class and function():Class
			// thus with any untyped member
			return false;
		}
	}

	public static class IsPublic implements IAvmProposalProvider.Filter {
		public boolean accept(AvmDefinition definition) {
			if (definition instanceof AvmDeclaredType) {
				AvmDeclaredType type = (AvmDeclaredType) definition;
				return AvmVisibility.PUBLIC.equals(type.getVisibility());
			}
			if (definition instanceof AvmMember) {
				AvmMember member = (AvmMember) definition;
				return AvmVisibility.PUBLIC.equals(member.getVisibility());
			}
			return false;
		}
	}
}
