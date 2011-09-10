/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;

import com.google.common.base.Function;

public class SuperTypeCollector {
	public List<AvmType> collectSuperTypes(AvmType type) {
		Function<AvmType, AvmType> function = new Function<AvmType, AvmType>() {
			public AvmType apply(AvmType from) {
				return from;
			}
		};
		return doCollectSupertypeData(type, function);
	}
	
	public List<String> collectSuperTypeNames(AvmType type) {
		Function<AvmType, String> function = new Function<AvmType, String>() {
			public String apply(AvmType from) {
				return from.getCanonicalName();
			}
		};
		return doCollectSupertypeData(type, function);
	}
	public <Result> List<Result> doCollectSupertypeData(AvmType type, Function<AvmType, Result> function) {
		if (type != null)
			return new Collector<Result>(function).collect(type);
		return Collections.emptyList();
	}
	public static class Collector<Result> {
		public final Function<AvmType, Result> transformation;
		public Collector(Function<AvmType, Result> transformation) {
			this.transformation = transformation;
		}
		public List<Result> collect(AvmType type) {
			return collect(type, new LinkedList<Result>());
		}
		public List<Result> collect(AvmType type, List<Result> result) {
			Result res = transformation.apply(type);
			if (res != null)
				result.add(res);
			if (type instanceof AvmDeclaredType) {
				for(AvmTypeReference superType: ((AvmDeclaredType) type).getSuperTypes())
					collect(superType.getType(), result);
			}
			return result;
		}
	}
	public static class Implementation<Result> extends AvmESwitch<Void> {

		private final Function<AvmType, Result> transformation;
		private List<Result> result;

		public Implementation(Function<AvmType, Result> transformation) {
			this.transformation = transformation;
			result = new LinkedList<Result>();
		}
		public List<Result> getResult() {
			return result;
		}
		@Override
		public Void caseAvmType(AvmType object) {
			return null;
		}
		@Override
		public Void caseAvmDeclaredType(AvmDeclaredType object) {
			if (!object.eIsProxy()) {
				if (result.add(transformation.apply(object))) {
					for(AvmTypeReference superType: object.getSuperTypes())
						doSwitch(superType.getType());
				}
			}
			return null;
		}
	}
}
