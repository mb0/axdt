package org.axdt.as3.naming;

import java.util.Collections;

import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Package;
import org.axdt.avm.model.AvmIdentifiable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.SimpleAttributeResolver;

public class As3QualifiedNameProvider extends IQualifiedNameProvider.AbstractImpl {
	
	private PolymorphicDispatcher<String> qualifyName = new PolymorphicDispatcher<String>("qualifyName",3,3,Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<String>get())
	{
		@Override
		protected String handleNoSuchMethod(Object... params) { 
			return null;
		}
	};
	private PolymorphicDispatcher<String> simpleName = new PolymorphicDispatcher<String>("simpleName",1,1,Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<String>get())
	{
		@Override
		protected String handleNoSuchMethod(Object... params) { 
			return null;
		}
	};
	private final SimpleAttributeResolver<EObject, String> nameResolver = SimpleAttributeResolver.newResolver(String.class, "name");
	
	String simpleName(As3Operation node) {
		if (node.eContainer() instanceof As3Package) {
			String name = node.getName();
			if (node.isGetter())
				return "get."+name;
			if (node.isSetter())
				return "set."+name;
			return name;
		}
		return null;
	}
	
	String simpleName(AvmIdentifiable node) {
		return nameResolver.getValue(node);
	}
	
	String qualifyName(As3Package node, String name, EObject child) {
//		String result = "."+name;
//		if (node.getName() != null)
//			result = node.getName() + result;
		return name;
	}
	
	
	public String getQualifiedName(EObject obj) {
		String value = simpleName.invoke(obj);
		if (value == null)
			return null;
		while (obj.eContainer() != null) {
			EObject container = obj.eContainer();
			String name = qualifyName.invoke(container, value, obj);
			obj = container;
			if (name == null) {
				name = nameResolver.getValue(container);
				if (name != null)
					name += "."+ value;
			}
			if (name != null) {
				value = name;
			}
		}
		return value;
	}
}
