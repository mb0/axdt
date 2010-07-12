package org.axdt.compiler.console;

import java.net.URI;

public interface IErrorCodeUriResolver {

	String EXTENSION_ID = "org.axdt.compiler.console.errorCodeUriResolver";

	URI resolveCode(int errorCode) throws Exception;
}
