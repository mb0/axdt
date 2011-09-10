/*******************************************************************************
 * Copyright (c) 2011 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.outline;

import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3FieldBinding;
import org.axdt.as3.model.As3FieldDefinition;
import org.axdt.as3.model.As3Interface;
import org.axdt.as3.model.As3Namespace;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.IAttribute;
import org.axdt.as3.model.IDirective;
import org.axdt.avm.model.AvmDeclaredElement;
import org.axdt.avm.model.AvmMember;
import org.axdt.avm.model.AvmParameter;
import org.axdt.avm.model.AvmTypeReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

public class As3OutlineTreeProvider extends DefaultOutlineTreeProvider {

	protected void _createChildren(DocumentRootNode parentNode, As3Program node) {
		createNode(parentNode, node.getPackage());
		for (EObject childElement : node.getPackage().eContents())
			createNode(parentNode, childElement);
		for (IDirective childElement : node.getDirectives())
			if (childElement instanceof AvmDeclaredElement)
			createNode(parentNode, childElement);
	}
	protected void _createNode(IOutlineNode parentNode, As3FieldDefinition node) {
		// omit node
	}
	protected void _createNode(IOutlineNode parentNode, IAttribute node) {
		// omit node
	}
	protected void _createNode(IOutlineNode parentNode, AvmTypeReference node) {
		// omit node
	}
	protected void _createNode(IOutlineNode parentNode, AvmParameter node) {
		// omit node
	}
	protected boolean _isLeaf(As3Package feature) {
		return true;
	}
	protected boolean _isLeaf(As3Operation feature) {
		return true;
	}
	protected boolean _isLeaf(As3FieldBinding feature) {
		return true;
	}
	protected boolean _isLeaf(As3Namespace feature) {
		return true;
	}
	protected void _createChildren(IOutlineNode parentNode, As3Class node) {
		for (AvmMember m:node.getMembers()) {
			createNode(parentNode, m);
		}
	}
	protected void _createChildren(IOutlineNode parentNode, As3Interface node) {
		for (AvmMember m:node.getMembers()) {
			createNode(parentNode, m);
		}
	}
}
