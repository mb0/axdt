/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.labeling;

import java.util.List;

import org.axdt.as3.model.As3Import;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3PropertyIdentifier;
import org.axdt.avm.model.AvmDeclaredTypeReference;
import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmGenericReference;
import org.axdt.avm.model.AvmNamespace;
import org.axdt.avm.model.AvmOperation;
import org.axdt.avm.model.AvmPackage;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVariable;
import org.axdt.avm.model.AvmVisibility;
import org.axdt.avm.model.AvmVoidReference;
import org.axdt.core.ui.img.AxdtImages;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.label.DeclarativeLabelProvider;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class As3LabelProvider extends DeclarativeLabelProvider implements AxdtImages {
	Object image(AvmPackage ele) {
    	return PACKAGE;
    }
	Object text(AvmPackage ele) {
		return ele.getCanonicalName() == null ? "Top Level" : ele.getCanonicalName();
	}
	Object image(As3ImportList ele) {
    	return IMPORTS;
    }
	Object text(As3ImportList ele) {
    	return "imports";
    }
    Object image(As3Import ele) {
    	return IMPORT;
    }
    Object text(As3Import ele) {
    	return ele.getQualifiedName();
    }
    Object image(AvmType ele) {
    	if (ele.isClass()) return CLASS;
    	if (ele.isInterface()) return INTERFACE;
    	// TODO add void and generic images
    	return null;
    }
    Object text(AvmType ele) {
    	return ele.getName();
    }
    Object text(AvmOperation ele) {
    	StringBuilder result = new StringBuilder();
    	result.append(ele.getName()).append(paramsText(ele.getParameters()));
    	if (ele.getReturnType() != null)
    		result.append(':').append(doGetText(ele.getReturnType()));
    	return result.toString();
    }
    Object paramsText(List<AvmParameter> params) {
    	if (params == null || params.size() == 0) return "()";
    	StringBuilder result = new StringBuilder();
    	for (AvmParameter param:params)
    		( result.length() == 0 
    		? result.append('(')
    		: result.append(", ")
    		).append(getText(param.getType()));
    	return result.append(')').toString();
    }
    Object text(AvmTypeReference ele) {
    	if (ele instanceof AvmGenericReference) return "*";
    	if (ele instanceof AvmVoidReference) return "void";
    	if (ele.getType() == null) return "";
    	return doGetText(ele.getType());
    }
    Object text(As3PropertyIdentifier ele) {
    	return ele.getName() != null
    		? ele.getName()
    		: doGetText(ele.getReference());
    }
    Object text(EObject eObject) {
    	if (eObject == null) return null;
    	List<EAttribute> list = Lists.transform(eObject.eClass().getEAllAttributes(), new Function<EAttribute, EAttribute>() {
			public EAttribute apply(EAttribute from) {
				if ("name".equals(from.getName()))
					return from;
				return null;
			}
    	});
    	for (EAttribute attr:list) {
    		Object value = eObject.eGet(attr);
			if (value != null) {
				return value.toString();
			}
    	}
		return null;
    }
    Object image(AvmOperation ele) {
    	AvmVisibility visibility = ele.getVisibility();
		if (AvmVisibility.PUBLIC.equals(visibility))
			return METHOD_PUBLIC;
		if (AvmVisibility.PRIVATE.equals(visibility))
			return METHOD_PRIVATE;
		if (AvmVisibility.PROTECTED.equals(visibility))
			return METHOD_PROTECTED;
    	return METHOD_DEFAULT;
    }
    Object text(AvmField ele) {
    	return ele.getName()
			+ (ele.getType() != null ? ":"+getText(ele.getType()) : "");
    }
    Object text(AvmGenericReference ele) {
    	return "*";
    }
    Object text(AvmVoidReference ele) {
    	return "void";
    }
    Object text(AvmDeclaredTypeReference ele) {
    	AvmType type = ele.getType();
    	return type == null ? "null" : type.getName();
    }
    Object text(AvmNamespace ele) {
    	return ele.getName();
    }
    Object image(AvmNamespace ele) {
    	return NAMESPACE;
    }
    Object image(AvmField ele) {
		AvmVisibility visibility = null;
		visibility = ele.getVisibility();
		if (AvmVisibility.PUBLIC.equals(visibility))
			return FIELD_PUBLIC;
		if (AvmVisibility.PRIVATE.equals(visibility))
			return FIELD_PRIVATE;
		if (AvmVisibility.PROTECTED.equals(visibility))
			return FIELD_PROTECTED;
		return FIELD_DEFAULT;
    }
    Object text(AvmVariable ele) {
    	return ele.getName()
			+ (ele.getType() != null ? ":"+doGetText(ele.getType()) : "");
    }
    Object image(AvmVariable ele) {
    	return VARIABLE;
    }
}
