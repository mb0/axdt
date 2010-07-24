package org.axdt.core.ui.swf;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.browser.IWebBrowser;

/**
 * @author mb0
 */
public class ExternalBrowser extends BrowserSupportPlayer {

	public static final String ID = "org.axdt.core.ui.swf.external";

	public ExternalBrowser.Instance launch(URL target) throws Exception {
		return new ExternalBrowser.Instance(target);
	}

	public boolean isAvailable() {
		return true;
	}

	public static class Instance extends BrowserSupportPlayer.Instance {

		public Instance(URL target) throws CoreException {
			super(target);
		}

		@Override
		protected IWebBrowser createBrowser() throws CoreException {
			return getSupport().getExternalBrowser();
		}
	}
}
