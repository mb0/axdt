/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.ui;

import org.axdt.as3.config.IFormattingConfig;
import org.axdt.as3.resource.As3ProjectsStateHelper;
import org.axdt.as3.resource.AvmResourceSetProvider;
import org.axdt.as3.ui.autoedit.As3AutoEditStrategyProvider;
import org.axdt.as3.ui.coloring.As3HighlightingConfiguration;
import org.axdt.as3.ui.coloring.As3TokenToAttributeIdMapper;
import org.axdt.as3.ui.folding.As3FoldingRegionProvider;
import org.axdt.as3.ui.folding.As3FoldingStructureProvider;
import org.axdt.as3.ui.hover.As3DocumentationProvider;
import org.axdt.as3.ui.hover.As3TextHover;
import org.axdt.as3.ui.preferences.As3EditorPreferences;
import org.axdt.as3.ui.preferences.As3FormattingPreferences;
import org.axdt.as3.ui.templates.As3CrossReferenceTemplateVariableResolver;
import org.axdt.as3.ui.templates.As3TemplateProposalProvider;
import org.axdt.as3.ui.wizards.As3ProjectCreator;
import org.axdt.asdoc.access.AsdocResourceFactoryProvider;
import org.axdt.asdoc.access.AsdocRootProvider;
import org.axdt.asdoc.access.IDocRootProvider;
import org.axdt.asdoc.scoping.AsdocLibraryScopeProvider;
import org.axdt.asdoc.ui.hyperlink.AsdocAwareHyperlinkHelper;
import org.axdt.asdoc.ui.preferences.AsdocPreferences;
import org.axdt.asdoc.ui.proposal.AsdocProposalProvider;
import org.axdt.avm.access.AvmResourceFactory;
import org.axdt.avm.naming.AvmQualifiedNameConverter;
import org.axdt.avm.scoping.AvmAwareGlobalScopeProvider;
import org.axdt.avm.scoping.AvmLibraryScopeProvider;
import org.axdt.avm.ui.naming.AvmPrefixMatcher;
import org.axdt.avm.ui.proposal.IAvmProposalProvider;
import org.axdt.core.ui.img.AxdtImageHelper;
import org.axdt.core.ui.preferences.CorePreferences;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.containers.WorkspaceProjectsStateHelper;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingStructureProvider;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.eclipse.xtext.ui.editor.hover.ProblemAnnotationHover;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;
import org.eclipse.xtext.ui.editor.model.ITokenTypeToPartitionTypeMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.templates.CrossReferenceTemplateVariableResolver;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.shared.Access;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class As3UiModule extends org.axdt.as3.ui.AbstractAs3UiModule {
	public As3UiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	public AsdocPreferences bindAsdocPreferencesToInstance() {
		return AsdocPreferences.getInstance();
	}
	public CorePreferences bindCorePreferencesToInstance() {
		return CorePreferences.getInstance();
	}
	public As3EditorPreferences bindAs3EditorPreferencesToInstance() {
		return As3EditorPreferences.getInstance();
	}
	public IFormattingConfig bindIFormattingConfigToInstance() {
		return As3FormattingPreferences.getInstance();
	}
	public IDocRootProvider bindDocRootProviderToInstance() {
		return AsdocRootProvider.getInstance();
	}
	public Class<? extends AvmResourceFactory.Provider> bindAvmResourceFactory$Provider() {
		return AsdocResourceFactoryProvider.class;
	}
	public Class<? extends IProjectCreator> bindIProjectCreator() {
		return As3ProjectCreator.class;
	}
	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider() {
		return As3FoldingRegionProvider.class;
	}
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return As3AutoEditStrategyProvider.class;
	}
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return As3HighlightingConfiguration.class;
	}
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return As3TokenToAttributeIdMapper.class;
	}
	@Override
	public Class<? extends IImageHelper> bindIImageHelper() {
		return As3ImageHelper.class;
	}
	@Override
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return As3TemplateProposalProvider.class;
	}
	public Class<? extends WorkspaceProjectsStateHelper> bindWorkspaceProjectsStateHelper() {
		return As3ProjectsStateHelper.class;
	}
	public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return AsdocAwareHyperlinkHelper.class;
	}
	public Class<? extends AvmLibraryScopeProvider> bindAvmLibraryScopeProvider() {
		return AsdocLibraryScopeProvider.class;
	}
	public Class<? extends IAvmProposalProvider> bindIAvmProposalProvider() {
		return AsdocProposalProvider.class;
	}
	@Override
	public Class<? extends PrefixMatcher> bindPrefixMatcher() {
		return AvmPrefixMatcher.class;
	}
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameSupport() {
		return AvmQualifiedNameConverter.class;
	}
	public void configureAvmPrefixMatcher_delegate(Binder binder) {
		binder.bind(PrefixMatcher.class)
			.annotatedWith(Names.named(AvmPrefixMatcher.DELEGATE_NAME))
			.to(PrefixMatcher.CamelCase.class);
	}
	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return AvmResourceSetProvider.class;
	}
	public Class<? extends IFoldingStructureProvider> bindIFoldingStructureProvider() {
		return As3FoldingStructureProvider.class;
	}
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return AvmAwareGlobalScopeProvider.class;
	}
	public Class<? extends CrossReferenceTemplateVariableResolver> bindCrossReferenceTemplateVariableResolver() {
		return As3CrossReferenceTemplateVariableResolver.class;
	}
	public Provider<IAllContainersState> provideIAllContainersState() {
		return Access.getWorkspaceProjectsState();
	}
	public Class<? extends XtextSourceViewerConfiguration> bindXtextSourceViewerConfiguration() {
		return As3SourceViewerConfiguration.class;
	}
	public Class<? extends IAnnotationHover> bindIAnnotationHover () {
		return ProblemAnnotationHover.class;
	}
	public Class<? extends ITokenTypeToPartitionTypeMapper> bindITokenTypeToPartitionTypeMapper () {
		return As3TokenTypeToPartitionMapper.class;
	}
	public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		return As3DocumentationProvider.class;
	}

	public Class<? extends IEObjectHover> bindIEObjectHover() {
		return As3TextHover.class;
	}
	public Class<? extends DispatchingEObjectTextHover> bindDispatchingEObjectTextHover() {
		return As3TextHover.class;
	}
}
class As3ImageHelper implements IImageHelper {
	private final AxdtImageHelper delegate = AxdtImageHelper.getInstance();
	public Image getImage(String name) {
		return delegate.getImage(name);
	}
	public Image getImage(ImageDescriptor imageDescriptor) {
		return delegate.getImage(imageDescriptor);
	}
}
