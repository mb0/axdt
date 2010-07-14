package org.axdt.core.ui.swf;

import java.net.MalformedURLException;
import java.net.URL;

import org.axdt.core.config.ISwfConfig;
import org.axdt.core.ui.preferences.CorePreferences;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

public class SwfEditorLauncher implements IEditorLauncher {

	public static final String SHARED_ID = "org.axdt.core.ui.swf";
	protected static final int DEFAULT_STYLE = IWorkbenchBrowserSupport.LOCATION_BAR
			| IWorkbenchBrowserSupport.NAVIGATION_BAR;

	protected int style;
	protected String browserChoice;

	public SwfEditorLauncher() {
		this(null, DEFAULT_STYLE);
	}
	
	public SwfEditorLauncher(String browserChoice) {
		this(browserChoice, DEFAULT_STYLE);
	}

	public SwfEditorLauncher(String browserChoice, int style) {
		this.browserChoice = browserChoice;
		this.style = style;
	}

	public void open(IPath file) {
		try {
			open(file.toFile().toURL());
		} catch (MalformedURLException e) {
			MessageDialog.openError(PlatformUI.getWorkbench().getDisplay()
					.getActiveShell(), "Error opening browser at path ",
					e.getLocalizedMessage());
		}
	}
	
	public void open(URL url) {
		if (browserChoice == null)
			browserChoice = getDefaultBrowserChoice();
		IWorkbenchBrowserSupport support = PlatformUI.getWorkbench()
				.getBrowserSupport();
		try {
			// XXX browser sharing noop on ubuntu ?!
			if (!support.isInternalWebBrowserAvailable() || isExternal()
					|| ISwfConfig.CHOICE_EXTERNAL.equals(browserChoice))
				setExternal(true);
			else if (isView() || ISwfConfig.CHOICE_VIEW.equals(browserChoice))
				setView(true);
			String id = isExternal() ? SHARED_ID : browserChoice+""+url.getPath();
			IWebBrowser browser = support.createBrowser(style, id, null, null);
			browser.openURL(url);
		} catch (PartInitException e) {
			MessageDialog.openError(PlatformUI.getWorkbench().getDisplay()
					.getActiveShell(), "Error opening browser",
					e.getLocalizedMessage());
		}
	}

	protected String getDefaultBrowserChoice() {
		CorePreferences preferences = CorePreferences.getInstance();
		IPreferenceStore store = preferences.getStore();
		return store.getString(CorePreferences.OPEN_BROWSER);
	}

	public boolean isExternal() {
		return 0 != (style & IWorkbenchBrowserSupport.AS_EXTERNAL);
	}

	public void setExternal(boolean value) {
		style |= IWorkbenchBrowserSupport.AS_EXTERNAL;
	}

	public boolean isView() {
		return 0 != (style & IWorkbenchBrowserSupport.AS_VIEW);
	}

	public void setView(boolean value) {
		style |= IWorkbenchBrowserSupport.AS_VIEW;
	}
}
