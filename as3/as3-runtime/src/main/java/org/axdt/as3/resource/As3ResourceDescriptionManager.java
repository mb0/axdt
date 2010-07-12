package org.axdt.as3.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;

public class As3ResourceDescriptionManager extends DefaultResourceDescriptionManager {
	protected IResourceDescription internalGetResourceDescription(Resource resource, IQualifiedNameProvider nameProvider) {
		return new As3ResourceDescription(resource, getNameProvider());
	}
}
