/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

/**
 * This interfaces flags all executable Axdt extensions and provides common
 * attribute names.
 * 
 * @author mb0
 */
public interface IAxdtExtension {
	String ID_ATTRIBUTE = "id";
	String NAME_ATTRIBUTE = "name";
	String CLASS_ATTRIBUTE = "class";

	class Helper {
		public static IConfigurationElement[] getContributions(
				String extensionId) {
			if (extensionId == null)
				throw new IllegalArgumentException();
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			return registry.getConfigurationElementsFor(extensionId);
		}

		public static IConfigurationElement getContribution(String extensionId,
				String contribId) {
			if (contribId == null)
				throw new IllegalArgumentException();
			for (IConfigurationElement contrib : getContributions(extensionId))
				if (contribId.equals(contrib.getAttribute(ID_ATTRIBUTE)))
					return contrib;
			return null;
		}

		public static <T extends IAxdtExtension> T executeContribution(
				String extensionId, String contribId, Class<T> type)
				throws CoreException {
			IConfigurationElement contrib = getContribution(extensionId,
					contribId);
			Object extension = contrib
					.createExecutableExtension(CLASS_ATTRIBUTE);
			return type.isInstance(extension) ? type.cast(extension) : null;
		}
	}
}
