package org.axdt.asdoc.access;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocRoot;
import org.axdt.asdoc.model.ParseLevel;
import org.axdt.asdoc.parser.AsdocParser;
import org.axdt.asdoc.ui.preferences.AsdocPreferences;
import org.axdt.asdoc.ui.preferences.DocTableFieldEditor.DocItem;
import org.axdt.avm.access.AxdtProjectProvider;
import org.axdt.avm.access.IAxdtProjectProvider;
import org.axdt.avm.access.IDefinitionProvider;
import org.axdt.core.model.AxdtProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;

@Singleton
public class AsdocRootProvider extends AbstractAsdocRootProvider {
	private final Logger logger = Logger.getLogger(AsdocRootProvider.class);
	
	private static AsdocRootProvider instance;
	
	public static AsdocRootProvider getInstance() {
		if (instance == null)
			instance = new AsdocRootProvider();
		return instance;
	}

	protected IAxdtProjectProvider projectProvider;

	private AsdocParser docParser = new AsdocParser();
	
	private AsdocRootProvider() {
		super();
	}
	protected URI createDocRootUri(String url) {
		String docRootName = Integer.toHexString(url.hashCode())+".asdoc";
		URI asdocCacheURI = CommonPlugin.resolve(URI.createURI("platform:/meta/org.axdt.asdoc.runtime"));
		return asdocCacheURI.appendSegment(docRootName);
	}
	public Iterable<AsdocRoot> getDocRoots(ResourceSet resourceSet) {
		IProject project = null;
		AxdtProject axdtProject = new AxdtProjectProvider().getAxdtProject(resourceSet);
		if (axdtProject != null) {
			project = axdtProject.getProject();
		}
		return initializeAsdocs(project);
	}
	public Iterable<AsdocRoot> initializeAsdocs(IProject project) {
		AsdocPreferences asdocPreferences = AsdocPreferences.getInstance();
		IPreferenceStore store = asdocPreferences.getProjectStore(project);
		Object[] docItems = asdocPreferences.getDocItems(store);
		return initializeAsdocs(docItems);
	}
	public Iterable<AsdocRoot> initializeAsdocs(Object[] docItems) {
		// retrieve doc items
		if (docItems == null || docItems.length == 0)
			return Collections.emptyList();

		List<DocItem> failedLoading = Lists.newArrayList();
		List<AsdocRoot> initialized = Lists.newArrayList();
		try {
			for (Object value:docItems) {
				if (value instanceof DocItem) {
					DocItem item = (DocItem) value;
					try {
						AsdocRoot root = addRoot(item.name, item.url);
						initialize(root, ParseLevel.GLOBAL);
						initialized.add(root);
					} catch (Exception e) {
						item.status = new Status(IStatus.ERROR, "org.axdt.asdoc.ui", e.getClass().getSimpleName() +" "+ e.getMessage(), e);
						failedLoading.add(item);
					}
				}
			}
			if (!failedLoading.isEmpty()) {
				final StringBuilder msgBuf = new StringBuilder("could not read asdoc at:\n");
				IStatus firstStatus = null; 
				for (DocItem item:failedLoading) {
					if (firstStatus == null) firstStatus = item.status;
					msgBuf.append("\t* "+ item.url +"\n");
				}
				msgBuf.append("please check your preferences");
				Display.getDefault().asyncExec(new ErrorRunnable(firstStatus, msgBuf.toString()));	
			}
			return initialized;
		} catch (Exception e) {
			logger.error("error loading asdoc", e);
		}
		return Collections.emptyList();
	}
	public void initialize(AsdocRoot root, ParseLevel level) throws Exception {
		try {
			docParser.parseDoc(root, level);
			if (root.eResource().isModified())
				saveRoot(root);
		} catch (Exception e) {
			logger.error("error parsing asdoc at "+root.getFullUri(), e);
			throw e;
		}
	}
	public void saveRoot(AsdocRoot root) {
		if (root == null) return;
		Resource index = root.eResource();
		if (index == null)
			return;
		List<Resource> resources = index.getResourceSet().getResources();
		for (Resource res:resources) {
			try {
				String scheme = res.getURI().scheme();
				if (!IDefinitionProvider.PROTOCOL.equals(scheme))
					res.save(null);
			} catch (IOException e) {
				logger.error("error saving asdoc at "+index.getURI(), e);
			}
		}
	}
	public static class ErrorRunnable implements Runnable {
		private final IStatus status;
		private final String message;
		public ErrorRunnable(IStatus status,String message) {
			this.status = status;
			this.message = message;
		}
		public void run() {
			ErrorDialog.openError(Display.getCurrent().getActiveShell(),
		            "Error reading asdoc", message, status);
		}
	}
}
