/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.validation;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;
import org.eclipse.xtext.validation.Issue;

public class As3DiagnosticConverter extends DiagnosticConverterImpl {

	@Override
	public void convertValidatorDiagnostic(Diagnostic diagnostic,
			IAcceptor<Issue> acceptor) {
		if (diagnostic instanceof BasicDiagnostic) {
			BasicDiagnostic basic = (BasicDiagnostic) diagnostic;
			if (basic.getSource() == EObjectValidator.DIAGNOSTIC_SOURCE
					&& basic.getCode() == EObjectValidator.EOBJECT__EVERY_PROXY_RESOLVES)
				return;
		}
		super.convertValidatorDiagnostic(diagnostic, acceptor);
	}
}
