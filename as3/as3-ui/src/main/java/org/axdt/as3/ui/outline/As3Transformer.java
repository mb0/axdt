/*
*/
package org.axdt.as3.ui.outline;

import java.util.Collections;
import java.util.List;

import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3Interface;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.As3Variable;
import org.axdt.as3.model.As3VariableDefinition;
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
	public ContentOutlineNode createNode(As3VariableDefinition node, ContentOutlineNode parent) {
		return parent;
	}
	protected List<EObject> getChildren(As3Operation node) {
		return Collections.emptyList();
	}
	protected List<EObject> getChildren(As3Variable node) {
		return Collections.emptyList();
	}
	protected List<EObject> getChildren(As3Class node) {
		return Lists.<EObject>newArrayList(node.getDirectives());
	}
	protected List<EObject> getChildren(As3Interface node) {
		return Lists.<EObject>newArrayList(node.getDirectives());
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
