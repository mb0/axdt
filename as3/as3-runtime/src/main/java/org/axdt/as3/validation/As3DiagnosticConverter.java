package org.axdt.as3.validation;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;

public class As3DiagnosticConverter extends DiagnosticConverterImpl {

	@Override
	public void convertValidatorDiagnostic(Diagnostic diagnostic,
			Acceptor acceptor) {
		if (diagnostic instanceof BasicDiagnostic) {
			BasicDiagnostic basic = (BasicDiagnostic) diagnostic;
			if (basic.getSource() == EObjectValidator.DIAGNOSTIC_SOURCE
					&& basic.getCode() == EObjectValidator.EOBJECT__EVERY_PROXY_RESOLVES)
				return;
		}
		super.convertValidatorDiagnostic(diagnostic, acceptor);
	}
}
