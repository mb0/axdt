package org.axdt.compiler.console;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import org.axdt.common.IAxdtExtension;

import com.google.common.collect.Lists;

public interface IErrorCodeUriResolver extends IAxdtExtension {

	String EXTENSION_ID = "org.axdt.compiler.console.errorCodeUriResolver";

	URI resolveCode(int errorCode) throws Exception;

	class Provider {
		private static IErrorCodeUriResolver.Provider instance;

		public static Provider getInstance() {
			if (instance == null)
				instance = new Provider();
			return instance;
		}

		private Provider() {
		}

		public IErrorCodeUriResolver getResolver() {
//			// TODO #40 look up asdoc resolver contribution
//			IErrorCodeUriResolver resolver = null;
//			if (resolver != null)
//				return resolver;
			return new Default();
		}
	}

	class Default implements IErrorCodeUriResolver {
		public final static List<Integer> LOW_WARNINGS = Collections
				.unmodifiableList(Lists.newArrayList(1009, 1013, 1030, 1031, 1035,
						1039, 1045, 1059, 1061, 1066, 1067, 1071, 1073, 1083,
						1085, 1087, 1089, 1091, 1093, 1099, 1101, 1103, 1105,
						1111, 1113, 1115));
		public final static String BASE_URI = "http://www.adobe.com/livedocs/flash/9.0/ActionScriptLangRefV3";
		public final static String WARNINGS_URI = BASE_URI+"/compilerWarnings.html";
		public final static String ERRORS_URI = BASE_URI+"/compilerErrors.html";

		public URI resolveCode(int errorCode) throws Exception {
			return new URI(
					( matchingError(errorCode) 
							? ERRORS_URI
							: WARNINGS_URI
					)+"#"+errorCode);
		}
		public boolean matchingError(int code) {
			if (code > 1115)
				return code < 2090;
			return !(code % 2 == 1	&& LOW_WARNINGS.contains(code));
		}
	}
}
