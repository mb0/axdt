package org.axdt.as3.ui.folding;

import java.util.List;
import java.util.Set;

import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3ImportList;
import org.axdt.as3.model.As3Interface;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3Package;
import org.axdt.as3.model.As3Program;
import org.axdt.as3.ui.preferences.As3EditorPreferences;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.parsetree.ParsetreePackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegion;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class As3FoldingRegionProvider extends DefaultFoldingRegionProvider {

	@Inject
	protected As3EditorPreferences preferences;
	
	@Override
	protected List<IFoldingRegion> doGetFoldingRegions(
			IXtextDocument xtextDocument, XtextResource xtextResource) {
		List<IFoldingRegion> foldingRegions = Lists.newArrayList();
		if (preferences.getStore().getBoolean(As3EditorPreferences.USE_FOLDING)) {
			EObject root = xtextResource.getContents().get(0);
			Iterable<AbstractNode> comments = collectComments(root);
			List<EObject> contents = Lists.newArrayList();
			int headerEnd = collectContents(root, contents, 0);
			for (AbstractNode node:comments) {
				Position pos = getPosition(xtextDocument, node);
				if (pos == null) continue;
				String type = pos.offset < headerEnd
						? As3EditorPreferences.FOLD_HEADERS
						: As3EditorPreferences.FOLD_COMMENTS;
				foldingRegions.add(newFoldingRegion(node, type, pos));
			}
			for (EObject eObject:contents) {
				addFoldingRegions(xtextDocument, eObject, foldingRegions);
			}
		}
		return foldingRegions;
	}
	
	private final Set<String> rules = ImmutableSet.of("DOC_COMMENT", "ML_COMMENT");
	
	@Override
	protected void addFoldingRegions(IXtextDocument xtextDocument,
			EObject eObject, List<IFoldingRegion> foldingRegions) {
		if (eObject.eContainer() != null) // except Programm
			super.addFoldingRegions(xtextDocument, eObject, foldingRegions);
	}
	
	protected Position getPosition(IXtextDocument xtextDocument, AbstractNode node) {
		Assert.isNotNull(node, "parameter 'node' must not be null");
		try {
			int startLine = xtextDocument.getLineOfOffset(node.getOffset());
			int endLine = xtextDocument.getLineOfOffset(node.getOffset() + node.getLength());
			if (startLine < endLine) {
				int start = xtextDocument.getLineOffset(startLine);
				int end = xtextDocument.getLineOffset(endLine) + xtextDocument.getLineLength(endLine);
				return new Position(start, end - start);
			}
		} catch (BadLocationException e) {
		}
		return null;
	}
	
	protected Iterable<AbstractNode> collectComments(EObject eObject) {
		NodeAdapter adapter = NodeUtil.getNodeAdapter(eObject);
		CompositeNode parserNode = adapter.getParserNode();
		return Iterables.filter(NodeUtil.getAllContents(parserNode), new Predicate<AbstractNode>() {
			EAttribute leafHidden = ParsetreePackage.eINSTANCE.getLeafNode_Hidden();
			EReference grammarElement = ParsetreePackage.eINSTANCE.getAbstractNode_GrammarElement();
			EAttribute ruleName = XtextPackage.eINSTANCE.getAbstractRule_Name();
			public boolean apply(AbstractNode input) {
				int hiddenFeatureID = input.eClass().getFeatureID(leafHidden);
				int grammarFeatureID = input.eClass().getFeatureID(grammarElement);
				if (hiddenFeatureID != -1 && grammarFeatureID != -1 &&
						(Boolean)input.eGet(leafHidden, false)) {
					EObject rule = (EObject) input.eGet(grammarElement, false);
					return rules.contains(rule.eGet(ruleName));
				}
				return false;
			}
		});
	}

	protected int collectContents(EObject obj, List<EObject> result, int headerEnd) {
		boolean isProg = obj instanceof As3Program;
		boolean isPack = !isProg && obj instanceof As3Package;
		boolean isClass = !isProg && !isPack && obj instanceof As3Class;
		if (isClass || !(isProg || isPack)
			&&(obj instanceof As3Operation
			|| obj instanceof As3Interface
			|| obj instanceof As3ImportList))
			result.add(obj);
		if (isPack) {
			NodeAdapter adapter = NodeUtil.getNodeAdapter(obj);
			headerEnd = adapter.getParserNode().getOffset();
		}
		if (isPack || isClass || isProg)
			for (EObject child : obj.eContents())
				headerEnd = collectContents(child, result, headerEnd);
		return headerEnd;
	}

	@Override
	protected boolean isHandled(EObject eObject) {
		return eObject instanceof As3Operation
			|| eObject instanceof As3Class
			|| eObject instanceof As3Interface
			|| eObject instanceof As3ImportList;
	}
	protected IFoldingRegion newFoldingRegion(EObject obj, String type, Position position) {
		return new As3FoldingRegion(position, type, null);
	}
	protected IFoldingRegion newFoldingRegion(EObject obj, Position position) {
		return new As3FoldingRegion(position, getFoldType(obj), null);
	}

	protected IFoldingRegion newFoldingRegion(EObject obj, Position position, StyledString styledString) {
		return new As3FoldingRegion(position, getFoldType(obj), styledString);
	}
	protected String getFoldType(EObject obj) {
		if (obj instanceof As3Operation)
			return As3EditorPreferences.FOLD_MEMBERS;
		if (obj instanceof As3ImportList)
			return As3EditorPreferences.FOLD_IMPORTS;
		return null;
	}
}
