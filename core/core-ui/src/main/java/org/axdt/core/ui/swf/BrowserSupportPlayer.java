/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.core.ui.swf;

import java.net.URL;

import org.axdt.core.swf.IAxdtSwfPlayer;
import org.axdt.core.swf.IAxdtSwfPlayerInstance;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

/**
 * @author mb0
 */
public abstract class BrowserSupportPlayer implements IAxdtSwfPlayer {

	public static IWorkbenchBrowserSupport getSupport() {
		return PlatformUI.getWorkbench().getBrowserSupport();
	}

	public static abstract class Instance implements IAxdtSwfPlayerInstance {

		protected final URL target;
		protected IWebBrowser browser;

		public Instance(URL target) throws CoreException {
			this.target = target;
			browser = createBrowser();
			browser.openURL(target);
		}

		protected abstract IWebBrowser createBrowser() throws CoreException;

		public void terminate() {
			try {
				if (browser != null) browser.close();
			} catch (Exception e) {
				// ignore
			} finally {
				browser = null;
			}
		}
	}
}
