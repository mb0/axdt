/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui.folding;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.model.As3Type;
import org.axdt.as3.ui.folding.As3FoldedPosition.Acceptor;
import org.axdt.as3.ui.preferences.As3EditorPreferences;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPartitioningException;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class As3FoldingRegionProvider implements IFoldingRegionProvider {

	private static final Logger log = Logger.getLogger(DefaultFoldingRegionProvider.class);
	protected static final Pattern TEXT_PATTERN_IN_COMMENT = Pattern.compile("\\w");
	
	@Inject
	protected As3EditorPreferences preferences;
	@Inject
	private ILocationInFileProvider locationInFileProvider;
	
	public Collection<FoldedPosition> getFoldingRegions(final IXtextDocument xtextDocument) {
		return xtextDocument.readOnly(new IUnitOfWork<Collection<FoldedPosition>, XtextResource>() {
			public Collection<FoldedPosition> exec(XtextResource xtextResource) throws Exception {
				if (xtextResource == null)
					return Collections.emptyList();
				return doGetFoldingRegions(xtextDocument, xtextResource);
			}
		});
	}
	
	protected Collection<FoldedPosition> doGetFoldingRegions(
			IXtextDocument xtextDocument, XtextResource xtextResource) {
		Collection<FoldedPosition> result = Sets.newLinkedHashSet();
		if (preferences.getStore().getBoolean(As3EditorPreferences.USE_FOLDING)) {
			Acceptor acceptor = new Acceptor(xtextDocument, result);
			computeObjectFolding(xtextResource, acceptor);
			computeCommentFolding(xtextDocument, acceptor);
		}
		return result;
	}
	
	protected void doHandle(EObject eObject, Acceptor acceptor) {
		String type = null;
		if (eObject instanceof As3Operation)
			type = As3EditorPreferences.FOLD_MEMBERS;
		else if (eObject instanceof As3ImportList)
			type = As3EditorPreferences.FOLD_IMPORTS;
		else if (!(eObject instanceof As3Type)) return;
		computeObjectFolding(eObject, acceptor, type);
	}
	
	protected boolean shouldProcessContent(EObject eObject, Acceptor acceptor) {
		if (eObject instanceof As3Package) {
			ICompositeNode node = NodeModelUtils.getNode(eObject);
			acceptor.setHeader(node.getOffset());
			return true;
		}
		return eObject instanceof As3Class
			|| eObject instanceof As3Program;
	}
	
	protected void computeCommentFolding(IXtextDocument xtextDocument, Acceptor acceptor) {
		try {
			ITypedRegion[] typedRegions = xtextDocument.computePartitioning(
					IDocumentExtension3.DEFAULT_PARTITIONING, 0, xtextDocument.getLength(), false);
			for (ITypedRegion typedRegion : typedRegions) {
				if (TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION.equals(typedRegion.getType())) {
					int offset = typedRegion.getOffset();
					int length = typedRegion.getLength();
					Matcher matcher = TEXT_PATTERN_IN_COMMENT.matcher(xtextDocument.get(offset, length));
					TextRegion significant = matcher.find() ? new TextRegion(offset + matcher.start(), 0) : null;
					String type = offset < acceptor.getHeader()
						? As3EditorPreferences.FOLD_HEADERS
						: As3EditorPreferences.FOLD_COMMENTS;
					acceptor.accept(offset, length, significant, type);
				}
			}
		} catch (BadLocationException e) {
			log.error(e, e);
		} catch (BadPartitioningException e) {
			log.error(e, e);
		}
	}
	
	protected void computeObjectFolding(XtextResource xtextResource, Acceptor acceptor) {
		TreeIterator<EObject> allContents = xtextResource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			doHandle(eObject, acceptor);
			if (!shouldProcessContent(eObject, acceptor))
				allContents.prune();
		}
	}
	
	protected void computeObjectFolding(EObject eObject, Acceptor acceptor, String type) {
		ITextRegion region = locationInFileProvider.getFullTextRegion(eObject);
		if (region != null) {
			ITextRegion significant = null;
			if (!(eObject instanceof As3ImportList))
				significant = locationInFileProvider.getSignificantTextRegion(eObject);
			int offset = region.getOffset();
			acceptor.accept(offset, region.getLength(), significant, type);
		}
	}
}
