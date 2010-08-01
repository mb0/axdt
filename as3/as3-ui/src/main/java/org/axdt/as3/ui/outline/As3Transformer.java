/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.outline;

import java.util.Collections;
import java.util.List;

import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3FieldDefinition;
import org.axdt.as3.model.As3Interface;
import org.axdt.as3.model.As3Namespace;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.IAttribute;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import com.google.inject.internal.Lists;

/**
 * customization of the default outline structure
 * 
 */
public class As3Transformer extends AbstractDeclarativeSemanticModelTransformer {
	public ContentOutlineNode createNode(As3Program node, ContentOutlineNode parent) {
		return parent;
	}
	public ContentOutlineNode createNode(As3FieldDefinition node, ContentOutlineNode parent) {
		return parent;
	}
	protected List<EObject> getChildren(As3Operation node) {
		return Collections.emptyList();
	}
	protected List<EObject> getChildren(As3FieldBinding node) {
		return Collections.emptyList();
	}
	protected List<EObject> getChildren(As3Namespace node) {
		return Collections.emptyList();
	}
	protected List<EObject> getChildren(As3Class node) {
		return Lists.<EObject>newArrayList(node.getMembers());
	}
	protected List<EObject> getChildren(As3Interface node) {
		return Lists.<EObject>newArrayList(node.getMembers());
	}
	public boolean consumeNode(IAttribute local) {
		return false;
	}
	public boolean consumeNode(AvmTypeReference local) {
		return false;
	}
	public boolean consumeNode(AvmParameter local) {
		return false;
	}
}
