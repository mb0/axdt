/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.validation;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Class;
import org.axdt.as3.model.As3Interface;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3VariableDefinition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
 

public class As3JavaValidator extends AbstractAs3JavaValidator {
	@Check
	public void checkInterface(As3Interface def) {
		if (!Character.isUpperCase(def.getName().charAt(0))) {
			warning("Name should start with a capital", As3EPackage.AS3_INTERFACE__NAME);
		}
	}
	@Check
	public void checkClass(As3Class def) {
		if (!Character.isUpperCase(def.getName().charAt(0))) {
			warning("Name should start with a capital", As3EPackage.AS3_CLASS__NAME);
		}
	}
	@Check
	public void checkFunction(As3Operation def) {
		boolean isConstructor = false, isInterface = false;
		if (def.eContainer()!=null) {
			EObject granpa = def.eContainer();
			if (granpa instanceof As3Class) {
				isConstructor = def.getName().equals(((As3Class) granpa).getName());
			} else {
				isInterface = granpa instanceof As3Interface; 
			}
		}
		if (isConstructor) { 
			if (def.getReturnType() != null) {
				error("Constructor cannot have result type", As3EPackage.AS3_OPERATION__RETURN_TYPE);
			}
		} else if (def.getReturnType() == null) {
			warning("Methods need a result type", def, As3EPackage.AS3_OPERATION__RETURN_TYPE);
		}
		if (isInterface) {
			if (def.getBody() != null) {
				error("Method signatures cannot have a body", As3EPackage.AS3_OPERATION__BODY);
			}
		} else if (def.getBody() == null) {
			warning("Methods need a method body", def, As3EPackage.AS3_OPERATION__BODY);
		}
	}
	@Check
	public void checkVariable(As3VariableDefinition def) {
	}
}
