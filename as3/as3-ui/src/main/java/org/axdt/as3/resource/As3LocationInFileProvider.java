package org.axdt.as3.resource;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.util.TextLocation;

public class As3LocationInFileProvider extends DefaultLocationInFileProvider {
	@Override
	public TextLocation getLocation(EObject obj) {
		if (obj == null) throw new WrappedException("no object",null);
		return super.getLocation(obj);
	}
}
