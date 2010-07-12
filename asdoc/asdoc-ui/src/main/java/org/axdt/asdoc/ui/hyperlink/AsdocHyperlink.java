package org.axdt.asdoc.ui.hyperlink;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.apache.log4j.Logger;
import org.axdt.asdoc.model.AsdocDefinition;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.xtext.ui.editor.hyperlinking.AbstractHyperlink;

public class AsdocHyperlink extends AbstractHyperlink {
	
	private static final Logger logger = Logger.getLogger(AsdocHyperlink.class);
	
	private AsdocDefinition asdocDefinition; 

	public void open() {
		IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();
		int style = IWorkbenchBrowserSupport.NAVIGATION_BAR
					| IWorkbenchBrowserSupport.LOCATION_BAR
					| IWorkbenchBrowserSupport.AS_EDITOR;
		try {
			String name = asdocDefinition.getCanonicalName();
			String fullUri = asdocDefinition.getFullUri();
			// TODO resolve url form element
			IWebBrowser browser = browserSupport.createBrowser(style, name, name, name);
			URL url = URI.create(fullUri).toURL();
			browser.openURL(url);
		} catch (PartInitException e) {
			logger.error("creating browser", e);
		} catch (MalformedURLException e) {
			logger.error("creating browser", e);
		}
	}

	public void setDefinition(AsdocDefinition element) {
		this.asdocDefinition = element;
	}
	public AsdocDefinition getDefinition() {
		return asdocDefinition;
	}
}
