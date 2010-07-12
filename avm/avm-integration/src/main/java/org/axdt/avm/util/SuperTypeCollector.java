package org.axdt.avm.util;

import java.util.Collection;
import java.util.Collections;

import org.axdt.avm.model.AvmDeclaredType;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;

import com.google.common.base.Function;
import com.google.common.collect.Sets;

public class SuperTypeCollector {
	public Collection<AvmType> collectSuperTypes(AvmType type) {
		Function<AvmType, AvmType> function = new Function<AvmType, AvmType>() {
			public AvmType apply(AvmType from) {
				return from;
			}
		};
		return doCollectSupertypeData(type, function);
	}
	
	public Collection<String> collectSuperTypeNames(AvmType type) {
		Function<AvmType, String> function = new Function<AvmType, String>() {
			public String apply(AvmType from) {
				return from.getCanonicalName();
			}
		};
		return doCollectSupertypeData(type, function);
	}
	public <Result> Collection<Result> doCollectSupertypeData(AvmType type, Function<AvmType, Result> function) {
		if (type != null) {
			Implementation<Result> implementation = new Implementation<Result>(function);
			implementation.doSwitch(type);
			Collection<Result> result = implementation.getResult();
			return result;
		}
		return Collections.emptySet();
	}
	public static class Implementation<Result> extends AvmESwitch<Void> {

		private final Function<AvmType, Result> transformation;
		private Collection<Result> result;
		private boolean collecting = false;

		public Implementation(Function<AvmType, Result> transformation) {
			this.transformation = transformation;
			result = Sets.newHashSet();
		}
		public Collection<Result> getResult() {
			return result;
		}
		@Override
		public Void caseAvmType(AvmType object) {
			return null;
		}
		@Override
		public Void caseAvmDeclaredType(AvmDeclaredType object) {
			if (!object.eIsProxy() && !object.isInterface()) {
				if (!collecting  || result.add(transformation.apply(object))) {
					collecting = true;
					for(AvmTypeReference superType: object.getSuperTypes())
						doSwitch(superType.getType());
				}
			}
			return null;
		}
	}
}
