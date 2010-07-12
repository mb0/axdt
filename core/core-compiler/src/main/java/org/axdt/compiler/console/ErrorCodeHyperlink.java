package org.axdt.compiler.console;

import java.net.URI;

import org.apache.log4j.Logger;
import org.eclipse.swt.program.Program;
import org.eclipse.ui.console.IHyperlink;

public class ErrorCodeHyperlink implements IHyperlink {
	protected final int errorCode;
	protected final IErrorCodeUriResolver resolver;

	public ErrorCodeHyperlink(int errorCode, IErrorCodeUriResolver resolver) {
		this.errorCode = errorCode;
		this.resolver = resolver;
	}

	public void linkEntered() {
		String uri = getURI();
		if (uri != null)
			Program.launch(uri + errorCode);
	}

	protected String getURI() {
		if (resolver == null)
			return null;
		try {
			URI uri = resolver.resolveCode(errorCode);
			return uri == null ? null : uri.toString();
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
