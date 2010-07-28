package org.axdt.avm.naming;

import org.axdt.avm.model.AvmDefinition;
import org.axdt.avm.model.AvmDefinitionContainer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * @author mb0
 */
public class AvmQualifiedNameProvider extends
		IQualifiedNameProvider.AbstractImpl {

	public String getQualifiedName(EObject obj) {
		return obj instanceof AvmDefinition
				&& obj.eContainer() instanceof AvmDefinitionContainer 
				? ((AvmDefinition) obj).getCanonicalName() 
				: null;
	}
}
