package org.axdt.compiler.console;

import java.net.URI;
import java.net.URL;

import org.apache.log4j.Logger;
import org.axdt.core.ui.swf.SwfEditorLauncher;
import org.eclipse.ui.console.IHyperlink;

public class ErrorCodeHyperlink implements IHyperlink {
	protected final int errorCode;
	protected final IErrorCodeUriResolver resolver;

	public ErrorCodeHyperlink(int errorCode, IErrorCodeUriResolver resolver) {
		this.errorCode = errorCode;
		this.resolver = resolver;
	}

	public void linkEntered() {
		URL url = getURL();
		if (url != null)
			new SwfEditorLauncher().open(url);
	}

	protected URL getURL() {
		if (resolver == null)
			return null;
		try {
			URI uri = resolver.resolveCode(errorCode);
			return uri == null ? null : uri.toURL();
		} catch (Exception e) {
			Logger.getLogger(getClass()).error("error resolving error code", e);
			return null;
		}
	}

	public void linkExited() {
	}

	public void linkActivated() {
	}
}
