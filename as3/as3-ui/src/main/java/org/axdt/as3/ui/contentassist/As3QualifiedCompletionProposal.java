/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.contentassist;

import java.util.Collections;
import java.util.List;

import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.IDirective;
import org.axdt.as3.scoping.As3ImportScopeProvider;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.axdt.avm.naming.AvmQualifiedNameConverter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;

/**
 * @author mb0
 */
public class As3QualifiedCompletionProposal extends
		ConfigurableCompletionProposal {
	
	protected String quali;
	protected final EObject currentModel;
	private As3ImportScopeProvider importScopeProvider;

	public As3QualifiedCompletionProposal(String proposal, As3ImportScopeProvider importScopeProvider,
			EObject currentModel, int replacementOffset, int replacementLength,
			int length, Image image, StyledString displayString) {
		super(proposal, replacementOffset, replacementLength, length, image,
				displayString, null, null);
		this.importScopeProvider = importScopeProvider;
		this.currentModel = currentModel;
	}
	@Override
	public void selected(ITextViewer viewer, boolean smartToggle) {
		super.selected(viewer, smartToggle);
	}
	public void checkImports() {
		AvmQualifiedNameConverter converter = new AvmQualifiedNameConverter();
		String replacementString = getReplacementString();
		QualifiedName qname = converter.toQualifiedName(replacementString);
		for (ImportNormalizer norm:getImportNormalizers(currentModel)) {
			QualifiedName name = norm.deresolve(qname);
			if (name != null && name.getSegmentCount() == 1) {
				setReplacementString(name.toString());
				return;
			}
		}
		quali = qname.skipLast(1).toString();
		String newReplacement = qname.getLastSegment();
		setReplacementString(newReplacement);
		setCursorPosition(getCursorPosition()-quali.length()-1);
	}
	protected List<ImportNormalizer> getImportNormalizers(EObject context) {
		if (importScopeProvider != null) {
			EObject current = context;
			while (current != null) {
				if (importScopeProvider.hasImports(current)) break;
				current = current.eContainer();
			}
			return importScopeProvider.getImportResolvers(context, false);
		}
		return Collections.emptyList();
	}

	@Override
	public void apply(IDocument document) {
		checkImports();
		if (quali != null) {
			try {
				int importOffset = getImportOffset(currentModel);
				if (importOffset != -1) {
					IRegion line = document
							.getLineInformationOfOffset(importOffset);
					String indentation = document.get(line.getOffset(),
							importOffset - line.getOffset());
					if (indentation.trim().length() != 0)
						indentation = "";
					String importString = "import " + quali + "."
							+ getReplacementString() + ";\n" + indentation;
					int otherOffset = getReplacementOffset();
					if (importOffset < otherOffset)
						setReplacementOffset(otherOffset + importString.length());
					document.replace(importOffset, 0, importString);
				}
			} catch (BadLocationException x) {
				// ignore
			}
		}
		super.apply(document);
	}

	protected int getImportOffset(EObject currentModel) {
		AvmDefinitionContainer container = getDefinitionContainer(currentModel);
		if (container != null) {
			for (EObject child : container.eContents()) {
				if (child instanceof As3ImportList) {
					// TODO find better import position
					return NodeModelUtils.getNode(child).getOffset();
				}
			}
			return getDefaultOffset(container);
		}
		return -1;
	}

	protected int getDefaultOffset(AvmDefinitionContainer container) {
		EList<IDirective> directives = null;
		if (container instanceof As3Package)
			directives = ((As3Package) container).getDirectives();
		else if (container instanceof As3Program)
			directives = ((As3Program) container).getDirectives();
		if (directives != null && !directives.isEmpty())
			return NodeModelUtils.getNode(directives.get(0)).getOffset();
		return -1;
	}

	protected AvmDefinitionContainer getDefinitionContainer(EObject current) {
		for (; current != null; current = current.eContainer())
			if (current instanceof AvmDefinitionContainer)
				return (AvmDefinitionContainer) current;
		return null;
	}
}
