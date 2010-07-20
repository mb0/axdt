package org.axdt.avm.scoping;

import org.axdt.avm.model.AvmField;
import org.axdt.avm.model.AvmIdentifiable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.scoping.IScope;

public abstract class AvmGenericScope<T extends EObject> extends AvmElementScope<T> {
	private static Resource tempResource = null;

	public AvmGenericScope(T element, IScope scope) {
		super(element, scope);
	}
	public String getReferenceText(EObject reference) {
		CompositeNode node = NodeUtil.getNodeAdapter(reference).getParserNode();
		return new LinkingHelper().getCrossRefNodeAsString(node, false);
	}

	public AvmIdentifiable getDynamicIdentifiable(final String value) {
		Resource resource = getTempResource();
		EObject find = null;
		for (EObject obj: resource.getContents()) {
			if (obj instanceof AvmField) {
				if (value.equals(((AvmField) obj).getName()))
					find = obj;
			}
		}
		AvmField field;
		if (find != null) {
			field = (AvmField) find;
		} else {
			field = createDynamicField(value);
			getTempResource().getContents().add(field);
		}
		return field;
	}

	protected abstract AvmField createDynamicField(String name);

	protected Resource getTempResource() {
		if (tempResource != null)
			return tempResource;
		URI tempUri = URI.createPlatformPluginURI("generic.avm", false);
		ResourceSet set = element.eResource().getResourceSet();
		tempResource = set.getResource(tempUri, false);
		if (tempResource == null)
			tempResource = set.createResource(tempUri);
		return tempResource;
	}
}
